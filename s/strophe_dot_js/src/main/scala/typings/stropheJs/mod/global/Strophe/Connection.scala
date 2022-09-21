package typings.stropheJs.mod.global.Strophe

import org.scalablytyped.runtime.Instantiable0
import typings.std.Element
import typings.std.Record
import typings.stropheJs.anon.HTTP
import typings.stropheJs.anon.MatchBareFromJid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Class: Strophe.Connection
  *  XMPP Connection manager.
  *
  *  This class is the main part of Strophe.  It manages a BOSH connection
  *  to an XMPP server and dispatches events to the user callbacks as
  *  data arrives.  It supports SASL PLAIN, SASL DIGEST-MD5, SASL SCRAM-SHA1
  *  and legacy authentication.
  *
  *  After creating a Strophe.Connection object, the user will typically
  *  call connect() with a user supplied callback to handle connection level
  *  events like authentication failure, disconnection, or connection
  *  complete.
  *
  *  The user will also have several event handlers defined by using
  *  addHandler() and addTimedHandler().  These will allow the user code to
  *  respond to interesting stanzas or do something periodically with the
  *  connection.  These handlers will be active once authentication is
  *  finished.
  *
  *  To send data to the connection, use send().
  */
@JSGlobal("Strophe.Connection")
@js.native
open class Connection protected () extends StObject {
  /** Constructor: Strophe.Connection
    *  Create and initialize a Strophe.Connection object.
    *
    *  The transport-protocol for this connection will be chosen automatically
    *  based on the given service parameter. URLs starting with "ws://" or
    *  "wss://" will use WebSockets, URLs starting with "http://", "https://"
    *  or without a protocol will use BOSH.
    *
    *  To make Strophe connect to the current host you can leave out the protocol
    *  and host part and just pass the path, e.g.
    *
    *  > let conn = new Strophe.Connection("/http-bind/");
    *
    *  Options common to both Websocket and BOSH:
    *  ------------------------------------------
    *
    *  cookies:
    *
    *  The *cookies* option allows you to pass in cookies to be added to the
    *  document. These cookies will then be included in the BOSH XMLHttpRequest
    *  or in the websocket connection.
    *
    *  The passed in value must be a map of cookie names and string values.
    *
    *  > { "myCookie": {
    *  >     "value": "1234",
    *  >     "domain": ".example.org",
    *  >     "path": "/",
    *  >     "expires": expirationDate
    *  >     }
    *  > }
    *
    *  Note that cookies can't be set in this way for other domains (i.e. cross-domain).
    *  Those cookies need to be set under those domains, for example they can be
    *  set server-side by making a XHR call to that domain to ask it to set any
    *  necessary cookies.
    *
    *  mechanisms:
    *
    *  The *mechanisms* option allows you to specify the SASL mechanisms that this
    *  instance of Strophe.Connection (and therefore your XMPP client) will
    *  support.
    *
    *  The value must be an array of objects with Strophe.SASLMechanism
    *  prototypes.
    *
    *  If nothing is specified, then the following mechanisms (and their
    *  priorities) are registered:
    *
    *      SCRAM-SHA-1 - 60
    *      PLAIN       - 50
    *      OAUTHBEARER - 40
    *      X-OAUTH2    - 30
    *      ANONYMOUS   - 20
    *      EXTERNAL    - 10
    *
    *  explicitResourceBinding:
    *
    *  If `explicitResourceBinding` is set to a truthy value, then the XMPP client
    *  needs to explicitly call `Strophe.Connection.prototype.bind` once the XMPP
    *  server has advertised the "urn:ietf:params:xml:ns:xmpp-bind" feature.
    *
    *  Making this step explicit allows client authors to first finish other
    *  stream related tasks, such as setting up an XEP-0198 Stream Management
    *  session, before binding the JID resource for this session.
    *
    *  WebSocket options:
    *  ------------------
    *
    *  protocol:
    *
    *  If you want to connect to the current host with a WebSocket connection you
    *  can tell Strophe to use WebSockets through a "protocol" attribute in the
    *  optional options parameter. Valid values are "ws" for WebSocket and "wss"
    *  for Secure WebSocket.
    *  So to connect to "wss://CURRENT_HOSTNAME/xmpp-websocket" you would call
    *
    *  > let conn = new Strophe.Connection("/xmpp-websocket/", {protocol: "wss"});
    *
    *  Note that relative URLs _NOT_ starting with a "/" will also include the path
    *  of the current site.
    *
    *  Also because downgrading security is not permitted by browsers, when using
    *  relative URLs both BOSH and WebSocket connections will use their secure
    *  variants if the current connection to the site is also secure (https).
    *
    *  worker:
    *
    *  Set this option to URL from where the shared worker script should be loaded.
    *
    *  To run the websocket connection inside a shared worker.
    *  This allows you to share a single websocket-based connection between
    *  multiple Strophe.Connection instances, for example one per browser tab.
    *
    *  The script to use is the one in `src/shared-connection-worker.js`.
    *
    *  BOSH options:
    *  -------------
    *
    *  By adding "sync" to the options, you can control if requests will
    *  be made synchronously or not. The default behaviour is asynchronous.
    *  If you want to make requests synchronous, make "sync" evaluate to true.
    *  > let conn = new Strophe.Connection("/http-bind/", {sync: true});
    *
    *  You can also toggle this on an already established connection.
    *  > conn.options.sync = true;
    *
    *  The *customHeaders* option can be used to provide custom HTTP headers to be
    *  included in the XMLHttpRequests made.
    *
    *  The *keepalive* option can be used to instruct Strophe to maintain the
    *  current BOSH session across interruptions such as webpage reloads.
    *
    *  It will do this by caching the sessions tokens in sessionStorage, and when
    *  "restore" is called it will check whether there are cached tokens with
    *  which it can resume an existing session.
    *
    *  The *withCredentials* option should receive a Boolean value and is used to
    *  indicate wether cookies should be included in ajax requests (by default
    *  they're not).
    *  Set this value to true if you are connecting to a BOSH service
    *  and for some reason need to send cookies to it.
    *  In order for this to work cross-domain, the server must also enable
    *  credentials by setting the Access-Control-Allow-Credentials response header
    *  to "true". For most usecases however this setting should be false (which
    *  is the default).
    *  Additionally, when using Access-Control-Allow-Credentials, the
    *  Access-Control-Allow-Origin header can't be set to the wildcard "*", but
    *  instead must be restricted to actual domains.
    *
    *  The *contentType* option can be set to change the default Content-Type
    *  of "text/xml; charset=utf-8", which can be useful to reduce the amount of
    *  CORS preflight requests that are sent to the server.
    *
    *  Parameters:
    *    @param service - The BOSH or WebSocket service URL.
    *    @param options - A hash of configuration options
    *
    *  Returns:
    *    @returns A new Strophe.Connection object.
    */
  def this(service: String) = this()
  def this(service: String, options: ConnectionOptions) = this()
  
  /** Function: addHandler
    *  Add a stanza handler for the connection.
    *
    *  This function adds a stanza handler to the connection.  The
    *  handler callback will be called for any stanza that matches
    *  the parameters.  Note that if multiple parameters are supplied,
    *  they must all match for the handler to be invoked.
    *
    *  The handler will receive the stanza that triggered it as its argument.
    *  *The handler should return true if it is to be invoked again;
    *  returning false will remove the handler after it returns.*
    *
    *  As a convenience, the ns parameters applies to the top level element
    *  and also any of its immediate children.  This is primarily to make
    *  matching /iq/query elements easy.
    *
    *  Options
    *  ~~~~~~~
    *  With the options argument, you can specify boolean flags that affect how
    *  matches are being done.
    *
    *  Currently two flags exist:
    *
    *  - matchBareFromJid:
    *      When set to true, the from parameter and the
    *      from attribute on the stanza will be matched as bare JIDs instead
    *      of full JIDs. To use this, pass {matchBareFromJid: true} as the
    *      value of options. The default value for matchBareFromJid is false.
    *
    *  - ignoreNamespaceFragment:
    *      When set to true, a fragment specified on the stanza's namespace
    *      URL will be ignored when it's matched with the one configured for
    *      the handler.
    *
    *      This means that if you register like this:
    *      >   connection.addHandler(
    *      >       handler,
    *      >       'http://jabber.org/protocol/muc',
    *      >       null, null, null, null,
    *      >       {'ignoreNamespaceFragment': true}
    *      >   );
    *
    *      Then a stanza with XML namespace of
    *      'http://jabber.org/protocol/muc#user' will also be matched. If
    *      'ignoreNamespaceFragment' is false, then only stanzas with
    *      'http://jabber.org/protocol/muc' will be matched.
    *
    *  Deleting the handler
    *  ~~~~~~~~~~~~~~~~~~~~
    *  The return value should be saved if you wish to remove the handler
    *  with deleteHandler().
    *
    *  Parameters:
    *    @param handler - The user callback.
    *    @param ns - The namespace to match.
    *    @param name - The stanza name to match.
    *    @param type - The stanza type (or types if an array) to match.
    *    @param id - The stanza id attribute to match.
    *    @param from - The stanza from attribute to match.
    *    @param options - The handler options
    *
    *  Returns:
    *    @returns A reference to the handler that can be used to remove it.
    */
  def addHandler(handler: js.Function1[/* stanza */ Element, Boolean], ns: String, name: String): Handler = js.native
  def addHandler(handler: js.Function1[/* stanza */ Element, Boolean], ns: String, name: String, `type`: String): Handler = js.native
  def addHandler(
    handler: js.Function1[/* stanza */ Element, Boolean],
    ns: String,
    name: String,
    `type`: String,
    id: String
  ): Handler = js.native
  def addHandler(
    handler: js.Function1[/* stanza */ Element, Boolean],
    ns: String,
    name: String,
    `type`: String,
    id: String,
    from: String
  ): Handler = js.native
  def addHandler(
    handler: js.Function1[/* stanza */ Element, Boolean],
    ns: String,
    name: String,
    `type`: String,
    id: String,
    from: String,
    options: MatchBareFromJid
  ): Handler = js.native
  def addHandler(
    handler: js.Function1[/* stanza */ Element, Boolean],
    ns: String,
    name: String,
    `type`: String,
    id: String,
    from: Unit,
    options: MatchBareFromJid
  ): Handler = js.native
  def addHandler(
    handler: js.Function1[/* stanza */ Element, Boolean],
    ns: String,
    name: String,
    `type`: String,
    id: Unit,
    from: String
  ): Handler = js.native
  def addHandler(
    handler: js.Function1[/* stanza */ Element, Boolean],
    ns: String,
    name: String,
    `type`: String,
    id: Unit,
    from: String,
    options: MatchBareFromJid
  ): Handler = js.native
  def addHandler(
    handler: js.Function1[/* stanza */ Element, Boolean],
    ns: String,
    name: String,
    `type`: String,
    id: Unit,
    from: Unit,
    options: MatchBareFromJid
  ): Handler = js.native
  def addHandler(
    handler: js.Function1[/* stanza */ Element, Boolean],
    ns: String,
    name: String,
    `type`: js.Array[String]
  ): Handler = js.native
  def addHandler(
    handler: js.Function1[/* stanza */ Element, Boolean],
    ns: String,
    name: String,
    `type`: js.Array[String],
    id: String
  ): Handler = js.native
  def addHandler(
    handler: js.Function1[/* stanza */ Element, Boolean],
    ns: String,
    name: String,
    `type`: js.Array[String],
    id: String,
    from: String
  ): Handler = js.native
  def addHandler(
    handler: js.Function1[/* stanza */ Element, Boolean],
    ns: String,
    name: String,
    `type`: js.Array[String],
    id: String,
    from: String,
    options: MatchBareFromJid
  ): Handler = js.native
  def addHandler(
    handler: js.Function1[/* stanza */ Element, Boolean],
    ns: String,
    name: String,
    `type`: js.Array[String],
    id: String,
    from: Unit,
    options: MatchBareFromJid
  ): Handler = js.native
  def addHandler(
    handler: js.Function1[/* stanza */ Element, Boolean],
    ns: String,
    name: String,
    `type`: js.Array[String],
    id: Unit,
    from: String
  ): Handler = js.native
  def addHandler(
    handler: js.Function1[/* stanza */ Element, Boolean],
    ns: String,
    name: String,
    `type`: js.Array[String],
    id: Unit,
    from: String,
    options: MatchBareFromJid
  ): Handler = js.native
  def addHandler(
    handler: js.Function1[/* stanza */ Element, Boolean],
    ns: String,
    name: String,
    `type`: js.Array[String],
    id: Unit,
    from: Unit,
    options: MatchBareFromJid
  ): Handler = js.native
  def addHandler(
    handler: js.Function1[/* stanza */ Element, Boolean],
    ns: String,
    name: String,
    `type`: Unit,
    id: String
  ): Handler = js.native
  def addHandler(
    handler: js.Function1[/* stanza */ Element, Boolean],
    ns: String,
    name: String,
    `type`: Unit,
    id: String,
    from: String
  ): Handler = js.native
  def addHandler(
    handler: js.Function1[/* stanza */ Element, Boolean],
    ns: String,
    name: String,
    `type`: Unit,
    id: String,
    from: String,
    options: MatchBareFromJid
  ): Handler = js.native
  def addHandler(
    handler: js.Function1[/* stanza */ Element, Boolean],
    ns: String,
    name: String,
    `type`: Unit,
    id: String,
    from: Unit,
    options: MatchBareFromJid
  ): Handler = js.native
  def addHandler(
    handler: js.Function1[/* stanza */ Element, Boolean],
    ns: String,
    name: String,
    `type`: Unit,
    id: Unit,
    from: String
  ): Handler = js.native
  def addHandler(
    handler: js.Function1[/* stanza */ Element, Boolean],
    ns: String,
    name: String,
    `type`: Unit,
    id: Unit,
    from: String,
    options: MatchBareFromJid
  ): Handler = js.native
  def addHandler(
    handler: js.Function1[/* stanza */ Element, Boolean],
    ns: String,
    name: String,
    `type`: Unit,
    id: Unit,
    from: Unit,
    options: MatchBareFromJid
  ): Handler = js.native
  
  var addHandlers: js.Array[Handler] = js.native
  
  /** Function: addProtocolErrorHandler
    *  Register a handler function for when a protocol (websocker or HTTP)
    *  error occurs.
    *
    *  NOTE: Currently only HTTP errors for BOSH requests are handled.
    *  Patches that handle websocket errors would be very welcome.
    *
    *  Parameters:
    *    @param protocol - 'HTTP' or 'websocket'
    *    @param status_code - Error status code (e.g 500, 400 or 404)
    *    @param callback - Function that will fire on Http error
    *
    *  Example:
    *  function onError(err_code){
    *    //do stuff
    *  }
    *
    *  let conn = Strophe.connect('http://example.com/http-bind');
    *  conn.addProtocolErrorHandler('HTTP', 500, onError);
    *  // Triggers HTTP 500 error and onError handler will be called
    *  conn.connect('user_jid@incorrect_jabber_host', 'secret', onConnect);
    */
  def addProtocolErrorHandler(protocol: String, status_code: Double, callback: js.Function1[/* status */ Double, Any]): Unit = js.native
  
  /** Function: addTimedHandler
    *  Add a timed handler to the connection.
    *
    *  This function adds a timed handler.  The provided handler will
    *  be called every period milliseconds until it returns false,
    *  the connection is terminated, or the handler is removed.  Handlers
    *  that wish to continue being invoked should return true.
    *
    *  Because of method binding it is necessary to save the result of
    *  this function if you wish to remove a handler with
    *  deleteTimedHandler().
    *
    *  Note that user handlers are not active until authentication is
    *  successful.
    *
    *  Parameters:
    *    @param period - The period of the handler.
    *    @param handler - The callback function.
    *
    *  Returns:
    *    @returns A reference to the handler that can be used to remove it.
    */
  def addTimedHandler(period: Double, handler: js.Function0[Boolean]): TimedHandler = js.native
  
  var addTimeds: js.Array[TimedHandler] = js.native
  
  /** Function: attach
    *  Attach to an already created and authenticated BOSH session.
    *
    *  This function is provided to allow Strophe to attach to BOSH
    *  sessions which have been created externally, perhaps by a Web
    *  application.  This is often used to support auto-login type features
    *  without putting user credentials into the page.
    *
    *  Parameters:
    *    @param jid - The full JID that is bound by the session.
    *    @param sid - The SID of the BOSH session.
    *    @param rid - The current RID of the BOSH session.  This RID
    *      will be used by the next request.
    *    @param callback The connect callback function.
    *    @param wait - The optional HTTPBIND wait value.  This is the
    *      time the server will wait before returning an empty result for
    *      a request.  The default setting of 60 seconds is recommended.
    *      Other settings will require tweaks to the Strophe.TIMEOUT value.
    *    @param hold - The optional HTTPBIND hold value.  This is the
    *      number of connections the server will hold at one time.  This
    *      should almost always be set to 1 (the default).
    *    @param wind - The optional HTTBIND window value.  This is the
    *      allowed range of request ids that are valid.  The default is 5.
    */
  def attach(jid: String, sid: String, rid: String): Unit = js.native
  def attach(
    jid: String,
    sid: String,
    rid: String,
    callback: js.Function3[/* status */ Status, /* condition */ String, /* elem */ Element, Any]
  ): Unit = js.native
  def attach(
    jid: String,
    sid: String,
    rid: String,
    callback: js.Function3[/* status */ Status, /* condition */ String, /* elem */ Element, Any],
    wait: Double
  ): Unit = js.native
  def attach(
    jid: String,
    sid: String,
    rid: String,
    callback: js.Function3[/* status */ Status, /* condition */ String, /* elem */ Element, Any],
    wait: Double,
    hold: Double
  ): Unit = js.native
  def attach(
    jid: String,
    sid: String,
    rid: String,
    callback: js.Function3[/* status */ Status, /* condition */ String, /* elem */ Element, Any],
    wait: Double,
    hold: Double,
    wind: Double
  ): Unit = js.native
  def attach(
    jid: String,
    sid: String,
    rid: String,
    callback: js.Function3[/* status */ Status, /* condition */ String, /* elem */ Element, Any],
    wait: Double,
    hold: Unit,
    wind: Double
  ): Unit = js.native
  def attach(
    jid: String,
    sid: String,
    rid: String,
    callback: js.Function3[/* status */ Status, /* condition */ String, /* elem */ Element, Any],
    wait: Unit,
    hold: Double
  ): Unit = js.native
  def attach(
    jid: String,
    sid: String,
    rid: String,
    callback: js.Function3[/* status */ Status, /* condition */ String, /* elem */ Element, Any],
    wait: Unit,
    hold: Double,
    wind: Double
  ): Unit = js.native
  def attach(
    jid: String,
    sid: String,
    rid: String,
    callback: js.Function3[/* status */ Status, /* condition */ String, /* elem */ Element, Any],
    wait: Unit,
    hold: Unit,
    wind: Double
  ): Unit = js.native
  def attach(jid: String, sid: String, rid: String, callback: Unit, wait: Double): Unit = js.native
  def attach(jid: String, sid: String, rid: String, callback: Unit, wait: Double, hold: Double): Unit = js.native
  def attach(jid: String, sid: String, rid: String, callback: Unit, wait: Double, hold: Double, wind: Double): Unit = js.native
  def attach(jid: String, sid: String, rid: String, callback: Unit, wait: Double, hold: Unit, wind: Double): Unit = js.native
  def attach(jid: String, sid: String, rid: String, callback: Unit, wait: Unit, hold: Double): Unit = js.native
  def attach(jid: String, sid: String, rid: String, callback: Unit, wait: Unit, hold: Double, wind: Double): Unit = js.native
  def attach(jid: String, sid: String, rid: String, callback: Unit, wait: Unit, hold: Unit, wind: Double): Unit = js.native
  
  /** Variable: authcid
    *  Set on connection.
    *  Authentication identity (Username).
    */
  var authcid: String = js.native
  
  /** Function: authenticate
    * Set up authentication
    *
    *  Continues the initial connection request by setting up authentication
    *  handlers and starting the authentication process.
    *
    *  SASL authentication will be attempted if available, otherwise
    *  the code will fall back to legacy authentication.
    *
    *  Parameters:
    *    @param matched - Array of SASL mechanisms supported.
    *
    */
  def authenticate(matched: js.Array[SASLMechanism]): Unit = js.native
  
  var authenticated: Boolean = js.native
  
  /** Variable: authzid
    *  Set on connection.
    *  Authorization identity.
    */
  var authzid: String = js.native
  
  /** Function: bind
    *
    *  Sends an IQ to the XMPP server to bind a JID resource for this session.
    *
    *  https://tools.ietf.org/html/rfc6120#section-7.5
    *
    *  If `explicitResourceBinding` was set to a truthy value in the options
    *  passed to the Strophe.Connection constructor, then this function needs
    *  to be called explicitly by the client author.
    *
    *  Otherwise, it'll be called automatically as soon as the XMPP server
    *  advertises the "urn:ietf:params:xml:ns:xmpp-bind" stream feature.
    */
  def bind(): Unit = js.native
  
  /** Function: connect
    *  Starts the connection process.
    *
    *  As the connection process proceeds, the user supplied callback will
    *  be triggered multiple times with status updates.  The callback
    *  should take two arguments - the status code and the error condition.
    *
    *  The status code will be one of the values in the Strophe.Status
    *  constants.  The error condition will be one of the conditions
    *  defined in RFC 3920 or the condition 'strophe-parsererror'.
    *
    *  The Parameters _wait_, _hold_ and _route_ are optional and only relevant
    *  for BOSH connections. Please see XEP 124 for a more detailed explanation
    *  of the optional parameters.
    *
    *  Parameters:
    *    @param jid - The user's JID.  This may be a bare JID,
    *      or a full JID.  If a node is not supplied, SASL ANONYMOUS
    *      authentication will be attempted.
    *    @param pass - The user's password.
    *    @param callback - The connect callback function.
    *    @param wait - The optional HTTPBIND wait value.  This is the
    *      time the server will wait before returning an empty result for
    *      a request.  The default setting of 60 seconds is recommended.
    *    @param hold - The optional HTTPBIND hold value.  This is the
    *      number of connections the server will hold at one time.  This
    *      should almost always be set to 1 (the default).
    *    @param route - The optional route value.
    *    @param authcid - The optional alternative authentication identity
    *      (username) if intending to impersonate another user.
    *      When using the SASL-EXTERNAL authentication mechanism, for example
    *      with client certificates, then the authcid value is used to
    *      determine whether an authorization JID (authzid) should be sent to
    *      the server. The authzid should NOT be sent to the server if the
    *      authzid and authcid are the same. So to prevent it from being sent
    *      (for example when the JID is already contained in the client
    *      certificate), set authcid to that same JID. See XEP-178 for more
    *      details.
    *    @param [disconnection_timeout=3000] - The optional disconnection timeout
    *      in milliseconds before _doDisconnect will be called.
    */
  def connect(
    jid: js.UndefOr[String],
    pass: js.UndefOr[String],
    callback: js.UndefOr[
      js.Function3[/* status */ Status, /* condition */ String, /* elem */ Element, Any]
    ],
    wait: js.UndefOr[Double],
    hold: js.UndefOr[Double],
    route: js.UndefOr[String],
    authcid: js.UndefOr[String],
    disconnection_timeout: js.UndefOr[Double]
  ): Unit = js.native
  
  /** parameter: callback
    *  Set on connection.
    *  Callback after connecting.
    */
  def connect_callback(status: Double, condition: String, elem: Element): Any = js.native
  
  var connected: Boolean = js.native
  
  /** Function: deleteHandler
    *  Delete a stanza handler for a connection.
    *
    *  This function removes a stanza handler from the connection.  The
    *  handRef parameter is *not* the function passed to addHandler(),
    *  but is the reference returned from addHandler().
    *
    *  Parameters:
    *    @param handRef - The handler reference.
    */
  def deleteHandler(handRef: Handler): Unit = js.native
  
  /** Function: deleteTimedHandler
    *  Delete a timed handler for a connection.
    *
    *  This function removes a timed handler from the connection.  The
    *  handRef parameter is *not* the function passed to addTimedHandler(),
    *  but is the reference returned from addTimedHandler().
    *
    *  Parameters:
    *    @param handRef - The handler reference.
    */
  def deleteTimedHandler(handRef: TimedHandler): Unit = js.native
  
  /** Function: disconnect
    *  Start the graceful disconnection process.
    *
    *  This function starts the disconnection process.  This process starts
    *  by sending unavailable presence and sending BOSH body of type
    *  terminate.  A timeout handler makes sure that disconnection happens
    *  even if the BOSH server does not respond.
    *  If the Connection object isn't connected, at least tries to abort all pending requests
    *  so the connection object won't generate successful requests (which were already opened).
    *
    *  The user supplied connection callback will be notified of the
    *  progress as this process happens.
    *
    *  Parameters:
    *    @param reason - The reason the disconnect is occuring.
    */
  def disconnect(reason: String): Unit = js.native
  
  var disconnecting: Boolean = js.native
  
  var disconnection_timeout: Double = js.native
  
  var do_authentication: Boolean = js.native
  
  // SASL
  var do_bind: Boolean = js.native
  
  var do_session: Boolean = js.native
  
  /**
    * The domain of the connected JID.
    */
  var domain: String = js.native
  
  var features: Element = js.native
  
  /** Function: flush
    *  Immediately send any pending outgoing data.
    *
    *  Normally send() queues outgoing data until the next idle period
    *  (100ms), which optimizes network use in the common cases when
    *  several send()s are called in succession. flush() can be used to
    *  immediately send all pending data.
    */
  def flush(): Unit = js.native
  
  /** Function: getUniqueId
    *  Generate a unique ID for use in <iq/> elements.
    *
    *  All <iq/> stanzas are required to have unique id attributes.  This
    *  function makes creating these easy.  Each connection instance has
    *  a counter which starts from zero, and the value of this counter
    *  plus a colon followed by the suffix becomes the unique id. If no
    *  suffix is supplied, the counter is used as the unique id.
    *
    *  Suffixes are used to make debugging easier when reading the stream
    *  data, and their use is recommended.  The counter resets to 0 for
    *  every new connection for the same reason.  For connections to the
    *  same server that authenticate the same way, all the ids should be
    *  the same, which makes it easy to see changes.  This is useful for
    *  automated testing as well.
    *
    *  Parameters:
    *    @param suffix - A optional suffix to append to the id.
    *
    *  Returns:
    *    @returns A unique string to be used for the id attribute.
    */
  def getUniqueId(): String = js.native
  def getUniqueId(suffix: String): String = js.native
  def getUniqueId(suffix: Double): String = js.native
  
  var handlers: js.Array[Handler] = js.native
  
  /**
    * The connected JID.
    */
  var jid: String = js.native
  
  var maxRetries: Double = js.native
  
  var mechanism: Record[String, SASLMechanism] = js.native
  
  /** Function: nextValidRid
    *  User overrideable function that receives the new valid rid.
    *
    *  The default function does nothing. User code can override this with
    *  > Strophe.Connection.nextValidRid = function (rid) {
    *  >    (user code)
    *  > };
    *
    *  Parameters:
    *    @param  rid - The next valid rid
    */
  /* protected */ def nextValidRid(rid: Double): Unit = js.native
  
  /**
    * @see ConnectionOptions
    */
  var options: ConnectionOptions = js.native
  
  /** Variable: pass
    *  Set on connection.
    *  Authentication identity (User password).
    */
  var pass: String = js.native
  
  /** Function: pause
    *  Pause the request manager.
    *
    *  This will prevent Strophe from sending any more requests to the
    *  server.  This is very useful for temporarily pausing
    *  BOSH-Connections while a lot of send() calls are happening quickly.
    *  This causes Strophe to send the data in a single request, saving
    *  many request trips.
    */
  def pause(): Unit = js.native
  
  var paused: Boolean = js.native
  
  var protocolErrorHandlers: HTTP = js.native
  
  /** Function: rawInput
    *  User overrideable function that receives raw data coming into the
    *  connection.
    *
    *  The default function does nothing.  User code can override this with
    *  > Strophe.Connection.rawInput = function (data) {
    *  >   (user code)
    *  > };
    *
    *  Parameters:
    *    @param data - The data received by the connection.
    */
  def rawInput(data: String): Unit = js.native
  
  /** Function: rawOutput
    *  User overrideable function that receives raw data sent to the
    *  connection.
    *
    *  The default function does nothing.  User code can override this with
    *  > Strophe.Connection.rawOutput = function (data) {
    *  >   (user code)
    *  > };
    *
    *  Parameters:
    *    @param data - The data sent by the connection.
    */
  def rawOutput(data: String): Unit = js.native
  
  /** Function: registerSASLMechanism
    *
    * Register a single SASL mechanism, to be supported by this client.
    *
    *  Parameters:
    *    @param Mechanism - Constructor for an object with a Strophe.SASLMechanism prototype
    *
    */
  def registerSASLMechanism(Mechanism: Instantiable0[SASLMechanism]): Unit = js.native
  
  /** Function: registerSASLMechanisms
    *
    * Register the SASL mechanisms which will be supported by this instance of
    * Strophe.Connection (i.e. which this XMPP client will support).
    *
    *  Parameters:
    *    @param mechanisms - Array of objects with Strophe.SASLMechanism prototypes
    *
    */
  def registerSASLMechanisms(mechanisms: js.Array[SASLMechanism]): Unit = js.native
  
  var removeHandlers: js.Array[Handler] = js.native
  
  var removeTimeds: js.Array[TimedHandler] = js.native
  
  /** Function: reset
    *  Reset the connection.
    *
    *  This function should be called after a connection is disconnected
    *  before that connection is reused.
    */
  def reset(): Unit = js.native
  
  /**
    * Function: restore
    * Attempt to restore a cached BOSH session.
    *
    * This function is only useful in conjunction with providing the
    * “keepalive”:true option when instantiating a new Strophe.Connection.
    * When “keepalive” is set to true, Strophe will cache the BOSH tokens
    * RID (Request ID) and SID (Session ID) and then when this function is called,
    * it will attempt to restore the session from those cached tokens.
    * This function must therefore be called instead of connect or attach.
    * For an example on how to use it, please see examples/restore.js
    *
    * Parameters:
    *    @param jid - The user’s JID.  This may be a bare JID or a full JID.
    *    @param callback - The connect callback function.
    *    @param wait - The optional HTTPBIND wait value.
    *      This is the time the server will wait before returning an empty result for a request.
    *      The default setting of 60 seconds is recommended.
    *    @param hold - The optional HTTPBIND hold value.
    *      This is the number of connections the server will hold at one time.
    *      This should almost always be set to 1 (the default).
    *    @param [wind=5] wind - The optional HTTBIND window value.
    *      This is the allowed range of request ids that are valid.
    */
  def restore(): Unit = js.native
  def restore(jid: String): Unit = js.native
  def restore(
    jid: String,
    callback: js.Function3[/* status */ Status, /* condition */ String, /* elem */ Element, Any]
  ): Unit = js.native
  def restore(
    jid: String,
    callback: js.Function3[/* status */ Status, /* condition */ String, /* elem */ Element, Any],
    wait: Double
  ): Unit = js.native
  def restore(
    jid: String,
    callback: js.Function3[/* status */ Status, /* condition */ String, /* elem */ Element, Any],
    wait: Double,
    hold: Double
  ): Unit = js.native
  def restore(
    jid: String,
    callback: js.Function3[/* status */ Status, /* condition */ String, /* elem */ Element, Any],
    wait: Double,
    hold: Double,
    wind: Double
  ): Unit = js.native
  def restore(
    jid: String,
    callback: js.Function3[/* status */ Status, /* condition */ String, /* elem */ Element, Any],
    wait: Double,
    hold: Unit,
    wind: Double
  ): Unit = js.native
  def restore(
    jid: String,
    callback: js.Function3[/* status */ Status, /* condition */ String, /* elem */ Element, Any],
    wait: Unit,
    hold: Double
  ): Unit = js.native
  def restore(
    jid: String,
    callback: js.Function3[/* status */ Status, /* condition */ String, /* elem */ Element, Any],
    wait: Unit,
    hold: Double,
    wind: Double
  ): Unit = js.native
  def restore(
    jid: String,
    callback: js.Function3[/* status */ Status, /* condition */ String, /* elem */ Element, Any],
    wait: Unit,
    hold: Unit,
    wind: Double
  ): Unit = js.native
  def restore(jid: String, callback: Unit, wait: Double): Unit = js.native
  def restore(jid: String, callback: Unit, wait: Double, hold: Double): Unit = js.native
  def restore(jid: String, callback: Unit, wait: Double, hold: Double, wind: Double): Unit = js.native
  def restore(jid: String, callback: Unit, wait: Double, hold: Unit, wind: Double): Unit = js.native
  def restore(jid: String, callback: Unit, wait: Unit, hold: Double): Unit = js.native
  def restore(jid: String, callback: Unit, wait: Unit, hold: Double, wind: Double): Unit = js.native
  def restore(jid: String, callback: Unit, wait: Unit, hold: Unit, wind: Double): Unit = js.native
  def restore(
    jid: Unit,
    callback: js.Function3[/* status */ Status, /* condition */ String, /* elem */ Element, Any]
  ): Unit = js.native
  def restore(
    jid: Unit,
    callback: js.Function3[/* status */ Status, /* condition */ String, /* elem */ Element, Any],
    wait: Double
  ): Unit = js.native
  def restore(
    jid: Unit,
    callback: js.Function3[/* status */ Status, /* condition */ String, /* elem */ Element, Any],
    wait: Double,
    hold: Double
  ): Unit = js.native
  def restore(
    jid: Unit,
    callback: js.Function3[/* status */ Status, /* condition */ String, /* elem */ Element, Any],
    wait: Double,
    hold: Double,
    wind: Double
  ): Unit = js.native
  def restore(
    jid: Unit,
    callback: js.Function3[/* status */ Status, /* condition */ String, /* elem */ Element, Any],
    wait: Double,
    hold: Unit,
    wind: Double
  ): Unit = js.native
  def restore(
    jid: Unit,
    callback: js.Function3[/* status */ Status, /* condition */ String, /* elem */ Element, Any],
    wait: Unit,
    hold: Double
  ): Unit = js.native
  def restore(
    jid: Unit,
    callback: js.Function3[/* status */ Status, /* condition */ String, /* elem */ Element, Any],
    wait: Unit,
    hold: Double,
    wind: Double
  ): Unit = js.native
  def restore(
    jid: Unit,
    callback: js.Function3[/* status */ Status, /* condition */ String, /* elem */ Element, Any],
    wait: Unit,
    hold: Unit,
    wind: Double
  ): Unit = js.native
  def restore(jid: Unit, callback: Unit, wait: Double): Unit = js.native
  def restore(jid: Unit, callback: Unit, wait: Double, hold: Double): Unit = js.native
  def restore(jid: Unit, callback: Unit, wait: Double, hold: Double, wind: Double): Unit = js.native
  def restore(jid: Unit, callback: Unit, wait: Double, hold: Unit, wind: Double): Unit = js.native
  def restore(jid: Unit, callback: Unit, wait: Unit, hold: Double): Unit = js.native
  def restore(jid: Unit, callback: Unit, wait: Unit, hold: Double, wind: Double): Unit = js.native
  def restore(jid: Unit, callback: Unit, wait: Unit, hold: Unit, wind: Double): Unit = js.native
  
  var restored: Boolean = js.native
  
  /** Function: resume
    *  Resume the request manager.
    *
    *  This resumes after pause() has been called.
    */
  def resume(): Unit = js.native
  
  def send(elem: js.Array[Element]): Unit = js.native
  /** Function: send
    *  Send a stanza.
    *
    *  This function is called to push data onto the send queue to
    *  go out over the wire.  Whenever a request is sent to the BOSH
    *  server, all pending data is sent and the queue is flushed.
    *
    *  Parameters:
    *  @param elem - The stanza to send.
    */
  def send(elem: Element): Unit = js.native
  def send(elem: Builder): Unit = js.native
  
  /** Function: sendIQ
    *  Helper function to send IQ stanzas.
    *
    *  Parameters:
    *    @param elem - T XMLElement ashe stanza to send.
    *    @param callback - The callback function for a successful request.
    *    @param errback - The callback function for a failed or timed
    *      out request.  On timeout, the stanza will be null.
    *    @param timeout - The time specified in milliseconds for a
    *      timeout to occur.
    *
    *  Returns:
    *    @returns The id used to send the IQ.
    */
  def sendIQ(elem: Element): String = js.native
  def sendIQ(elem: Element, callback: js.Function1[/* stanza */ Element, Any]): String = js.native
  def sendIQ(
    elem: Element,
    callback: js.Function1[/* stanza */ Element, Any],
    errback: js.Function1[/* stanza */ Element, Any]
  ): String = js.native
  def sendIQ(
    elem: Element,
    callback: js.Function1[/* stanza */ Element, Any],
    errback: js.Function1[/* stanza */ Element, Any],
    timeout: Double
  ): String = js.native
  def sendIQ(elem: Element, callback: js.Function1[/* stanza */ Element, Any], errback: Unit, timeout: Double): String = js.native
  def sendIQ(elem: Element, callback: Unit, errback: js.Function1[/* stanza */ Element, Any]): String = js.native
  def sendIQ(elem: Element, callback: Unit, errback: js.Function1[/* stanza */ Element, Any], timeout: Double): String = js.native
  def sendIQ(elem: Element, callback: Unit, errback: Unit, timeout: Double): String = js.native
  def sendIQ(elem: Builder): String = js.native
  def sendIQ(elem: Builder, callback: js.Function1[/* stanza */ Element, Any]): String = js.native
  def sendIQ(
    elem: Builder,
    callback: js.Function1[/* stanza */ Element, Any],
    errback: js.Function1[/* stanza */ Element, Any]
  ): String = js.native
  def sendIQ(
    elem: Builder,
    callback: js.Function1[/* stanza */ Element, Any],
    errback: js.Function1[/* stanza */ Element, Any],
    timeout: Double
  ): String = js.native
  def sendIQ(elem: Builder, callback: js.Function1[/* stanza */ Element, Any], errback: Unit, timeout: Double): String = js.native
  def sendIQ(elem: Builder, callback: Unit, errback: js.Function1[/* stanza */ Element, Any]): String = js.native
  def sendIQ(elem: Builder, callback: Unit, errback: js.Function1[/* stanza */ Element, Any], timeout: Double): String = js.native
  def sendIQ(elem: Builder, callback: Unit, errback: Unit, timeout: Double): String = js.native
  
  /** Function: sendPresence
    *  Helper function to send presence stanzas. The main benefit is for
    *  sending presence stanzas for which you expect a responding presence
    *  stanza with the same id (for example when leaving a chat room).
    *
    *  Parameters:
    *    @param elem - The stanza to send.
    *    @param callback - The callback function for a successful request.
    *    @param errback - The callback function for a failed or timed
    *      out request.  On timeout, the stanza will be null.
    *    @param timeout - The time specified in milliseconds for a
    *      timeout to occur.
    *
    *  Returns:
    *    @returns The id used to send the presence.
    */
  def sendPresence(elem: Element): String = js.native
  def sendPresence(elem: Element, callback: js.Function1[/* elem */ Element, Any]): String = js.native
  def sendPresence(
    elem: Element,
    callback: js.Function1[/* elem */ Element, Any],
    errback: js.Function1[/* elem */ Element, Any]
  ): String = js.native
  def sendPresence(
    elem: Element,
    callback: js.Function1[/* elem */ Element, Any],
    errback: js.Function1[/* elem */ Element, Any],
    timeout: Double
  ): String = js.native
  def sendPresence(elem: Element, callback: js.Function1[/* elem */ Element, Any], errback: Unit, timeout: Double): String = js.native
  def sendPresence(elem: Element, callback: Unit, errback: js.Function1[/* elem */ Element, Any]): String = js.native
  def sendPresence(elem: Element, callback: Unit, errback: js.Function1[/* elem */ Element, Any], timeout: Double): String = js.native
  def sendPresence(elem: Element, callback: Unit, errback: Unit, timeout: Double): String = js.native
  def sendPresence(elem: Builder): String = js.native
  def sendPresence(elem: Builder, callback: js.Function1[/* elem */ Element, Any]): String = js.native
  def sendPresence(
    elem: Builder,
    callback: js.Function1[/* elem */ Element, Any],
    errback: js.Function1[/* elem */ Element, Any]
  ): String = js.native
  def sendPresence(
    elem: Builder,
    callback: js.Function1[/* elem */ Element, Any],
    errback: js.Function1[/* elem */ Element, Any],
    timeout: Double
  ): String = js.native
  def sendPresence(elem: Builder, callback: js.Function1[/* elem */ Element, Any], errback: Unit, timeout: Double): String = js.native
  def sendPresence(elem: Builder, callback: Unit, errback: js.Function1[/* elem */ Element, Any]): String = js.native
  def sendPresence(elem: Builder, callback: Unit, errback: js.Function1[/* elem */ Element, Any], timeout: Double): String = js.native
  def sendPresence(elem: Builder, callback: Unit, errback: Unit, timeout: Double): String = js.native
  
  /**
    * the service url to connect with
    */
  var service: String = js.native
  
  var servtype: String = js.native
  
  /** Function: setProtocol
    *  Select protocol based on this.options or this.service
    */
  def setProtocol(): Unit = js.native
  
  /** Function: sortMechanismsByPriority
    *
    *  Sorts an array of objects with prototype SASLMechanism according to
    *  their priorities.
    *
    *  Parameters:
    *    @param mechanisms - Array of SASL mechanisms.
    *
    */
  def sortMechanismsByPriority(mechanisms: js.Array[SASLMechanism]): js.Array[SASLMechanism] = js.native
  
  // handler lists
  var timedHandlers: js.Array[TimedHandler] = js.native
  
  /** Function: xmlInput
    *  User overrideable function that receives XML data coming into the
    *  connection.
    *
    *  The default function does nothing.  User code can override this with
    *  > Strophe.Connection.xmlInput = function (elem) {
    *  >   (user code)
    *  > };
    *
    *  Due to limitations of current Browsers' XML-Parsers the opening and closing
    *  <stream> tag for WebSocket-Connoctions will be passed as selfclosing here.
    *
    *  BOSH-Connections will have all stanzas wrapped in a <body> tag. See
    *  <Strophe.Bosh.strip> if you want to strip this tag.
    *
    *  Parameters:
    *    @param elem - T XMLElement ashe XML data received by the connection.
    */
  def xmlInput(elem: Element): Unit = js.native
  
  /** Function: xmlOutput
    *  User overrideable function that receives XML data sent to the
    *  connection.
    *
    *  The default function does nothing.  User code can override this with
    *  > Strophe.Connection.xmlOutput = function (elem) {
    *  >   (user code)
    *  > };
    *
    *  Due to limitations of current Browsers' XML-Parsers the opening and closing
    *  <stream> tag for WebSocket-Connoctions will be passed as selfclosing here.
    *
    *  BOSH-Connections will have all stanzas wrapped in a <body> tag. See
    *  <Strophe.Bosh.strip> if you want to strip this tag.
    *
    *  Parameters:
    *    @param elem - T XMLElement ashe XMLdata sent by the connection.
    */
  def xmlOutput(elem: Element): Unit = js.native
}
