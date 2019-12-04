package typings.strophe.stropheMod.Strophe

import typings.std.Element
import typings.strophe.Anon_MatchBare
import typings.strophe.mucMod.stropheMod.Strophe.MUC.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
@JSImport("strophe", "Strophe.Connection")
@js.native
class Connection protected () extends js.Object {
  //todo: what other members are meant to be public?
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
    *  > var conn = new Strophe.Connection("/http-bind/");
    *
    *  WebSocket options:
    *
    *  If you want to connect to the current host with a WebSocket connection you
    *  can tell Strophe to use WebSockets through a "protocol" attribute in the
    *  optional options parameter. Valid values are "ws" for WebSocket and "wss"
    *  for Secure WebSocket.
    *  So to connect to "wss://CURRENT_HOSTNAME/xmpp-websocket" you would call
    *
    *  > var conn = new Strophe.Connection("/xmpp-websocket/", {protocol: "wss"});
    *
    *  Note that relative URLs _NOT_ starting with a "/" will also include the path
    *  of the current site.
    *
    *  Also because downgrading security is not permitted by browsers, when using
    *  relative URLs both BOSH and WebSocket connections will use their secure
    *  variants if the current connection to the site is also secure (https).
    *
    *  BOSH options:
    *
    *  by adding "sync" to the options, you can control if requests will
    *  be made synchronously or not. The default behaviour is asynchronous.
    *  If you want to make requests synchronous, make "sync" evaluate to true:
    *  > var conn = new Strophe.Connection("/http-bind/", {sync: true});
    *  You can also toggle this on an already established connection:
    *  > conn.options.sync = true;
    *
    *
    *  Parameters:
    *    (String) service - The BOSH or WebSocket service URL.
    *    (Object) options - A hash of configuration options
    *
    *  Returns:
    *    A new Strophe.Connection object.
    */
  def this(service: String) = this()
  def this(service: String, options: ConnectionOptions) = this()
  var authcid: String = js.native
  var authzid: String = js.native
  var domain: String = js.native
  var jid: String = js.native
  var maxRetries: Double = js.native
  var muc: Plugin = js.native
  var pass: String = js.native
  var servtype: String = js.native
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
    *  The options argument contains handler matching flags that affect how
    *  matches are determined. Currently the only flag is matchBare (a
    *  boolean). When matchBare is true, the from parameter and the from
    *  attribute on the stanza will be matched as bare JIDs instead of
    *  full JIDs. To use this, pass {matchBare: true} as the value of
    *  options. The default value for matchBare is false.
    *
    *  The return value should be saved if you wish to remove the handler
    *  with deleteHandler().
    *
    *  Parameters:
    *    (Function) handler - The user callback.
    *    (String) ns - The namespace to match.
    *    (String) name - The stanza name to match.
    *    (String) type - The stanza type attribute to match.
    *    (String) id - The stanza id attribute to match.
    *    (String) from - The stanza from attribute to match.
    *    (String) options - The handler options
    *
    *  Returns:
    *    A reference to the handler that can be used to remove it.
    */
  def addHandler(handler: js.Function1[/* stanza */ Element, Boolean], ns: String, name: String): js.Any = js.native
  def addHandler(handler: js.Function1[/* stanza */ Element, Boolean], ns: String, name: String, `type`: String): js.Any = js.native
  def addHandler(
    handler: js.Function1[/* stanza */ Element, Boolean],
    ns: String,
    name: String,
    `type`: String,
    id: String
  ): js.Any = js.native
  def addHandler(
    handler: js.Function1[/* stanza */ Element, Boolean],
    ns: String,
    name: String,
    `type`: String,
    id: String,
    from: String
  ): js.Any = js.native
  def addHandler(
    handler: js.Function1[/* stanza */ Element, Boolean],
    ns: String,
    name: String,
    `type`: String,
    id: String,
    from: String,
    options: Anon_MatchBare
  ): js.Any = js.native
   //todo: Is callback correct?
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
    *    (Integer) period - The period of the handler.
    *    (Function) handler - The callback function.
    *
    *  Returns:
    *    A reference to the handler that can be used to remove it.
    */
  def addTimedHandler(period: Double, handler: js.Function0[Boolean]): js.Any = js.native
  /** Function: attach
    *  Attach to an already created and authenticated BOSH session.
    *
    *  This function is provided to allow Strophe to attach to BOSH
    *  sessions which have been created externally, perhaps by a Web
    *  application.  This is often used to support auto-login type features
    *  without putting user credentials into the page.
    *
    *  Parameters:
    *    (String) jid - The full JID that is bound by the session.
    *    (String) sid - The SID of the BOSH session.
    *    (String) rid - The current RID of the BOSH session.  This RID
    *      will be used by the next request.
    *    (Function) callback The connect callback function.
    *    (Integer) wait - The optional HTTPBIND wait value.  This is the
    *      time the server will wait before returning an empty result for
    *      a request.  The default setting of 60 seconds is recommended.
    *      Other settings will require tweaks to the Strophe.TIMEOUT value.
    *    (Integer) hold - The optional HTTPBIND hold value.  This is the
    *      number of connections the server will hold at one time.  This
    *      should almost always be set to 1 (the default).
    *    (Integer) wind - The optional HTTBIND window value.  This is the
    *      allowed range of request ids that are valid.  The default is 5.
    */
  def attach(jid: String, sid: String, rid: String): Unit = js.native
  def attach(
    jid: String,
    sid: String,
    rid: String,
    callback: js.Function2[/* status */ Status, /* condition */ String, _]
  ): Unit = js.native
  def attach(
    jid: String,
    sid: String,
    rid: String,
    callback: js.Function2[/* status */ Status, /* condition */ String, _],
    wait: Double
  ): Unit = js.native
  def attach(
    jid: String,
    sid: String,
    rid: String,
    callback: js.Function2[/* status */ Status, /* condition */ String, _],
    wait: Double,
    hold: Double
  ): Unit = js.native
  def attach(
    jid: String,
    sid: String,
    rid: String,
    callback: js.Function2[/* status */ Status, /* condition */ String, _],
    wait: Double,
    hold: Double,
    wind: Double
  ): Unit = js.native
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
    *    (String) jid - The user's JID.  This may be a bare JID,
    *      or a full JID.  If a node is not supplied, SASL ANONYMOUS
    *      authentication will be attempted.
    *    (String) pass - The user's password.
    *    (Function) callback - The connect callback function.
    *    (Integer) wait - The optional HTTPBIND wait value.  This is the
    *      time the server will wait before returning an empty result for
    *      a request.  The default setting of 60 seconds is recommended.
    *    (Integer) hold - The optional HTTPBIND hold value.  This is the
    *      number of connections the server will hold at one time.  This
    *      should almost always be set to 1 (the default).
    *    (String) route - The optional route value.
    */
  def connect(
    jid: js.UndefOr[String],
    pass: js.UndefOr[String],
    callback: js.UndefOr[js.Function2[/* status */ Status, /* condition */ String, _]],
    wait: js.UndefOr[Double],
    hold: js.UndefOr[Double],
    route: js.UndefOr[String]
  ): Unit = js.native
   //todo: is callback correct? Also, are the elements specified as optional truly optional?
  /** Function: deleteHandler
    *  Delete a stanza handler for a connection.
    *
    *  This function removes a stanza handler from the connection.  The
    *  handRef parameter is *not* the function passed to addHandler(),
    *  but is the reference returned from addHandler().
    *
    *  Parameters:
    *    (Strophe.Handler) handRef - The handler reference.
    */
  def deleteHandler(handRef: js.Any): Unit = js.native
  /** Function: deleteTimedHandler
    *  Delete a timed handler for a connection.
    *
    *  This function removes a timed handler from the connection.  The
    *  handRef parameter is *not* the function passed to addTimedHandler(),
    *  but is the reference returned from addTimedHandler().
    *
    *  Parameters:
    *    (Strophe.TimedHandler) handRef - The handler reference.
    */
  def deleteTimedHandler(handRef: js.Any): Unit = js.native
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
    *    (String) reason - The reason the disconnect is occuring.
    */
  def disconnect(reason: String): Unit = js.native
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
    *    (String) suffix - A optional suffix to append to the id.
    *
    *  Returns:
    *    A unique string to be used for the id attribute.
    */
  def getUniqueId(): String = js.native
  def getUniqueId(suffix: String): String = js.native
  def getUniqueId(suffix: Double): String = js.native
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
    *    (String) data - The data received by the connection.
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
    *    (String) data - The data sent by the connection.
    */
  def rawOutput(data: String): Unit = js.native
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
    *    (String) jid - The user’s JID.  This may be a bare JID or a full JID.
    *    (Function) callback - The connect callback function.
    *    (Integer) wait - The optional HTTPBIND wait value.
    *      This is the time the server will wait before returning an empty result for a request.
    *      The default setting of 60 seconds is recommended.
    *    (Integer) hold - The optional HTTPBIND hold value.
    *      This is the number of connections the server will hold at one time.
    *      This should almost always be set to 1 (the default).
    *    (Integer) wind - The optional HTTBIND window value.
    *      This is the allowed range of request ids that are valid.
    *      The default is 5.
    */
  def restore(): Unit = js.native
  def restore(jid: String): Unit = js.native
  def restore(jid: String, callback: js.Function2[/* status */ Status, /* condition */ String, _]): Unit = js.native
  def restore(jid: String, callback: js.Function2[/* status */ Status, /* condition */ String, _], wait: Double): Unit = js.native
  def restore(
    jid: String,
    callback: js.Function2[/* status */ Status, /* condition */ String, _],
    wait: Double,
    hold: Double
  ): Unit = js.native
  def restore(
    jid: String,
    callback: js.Function2[/* status */ Status, /* condition */ String, _],
    wait: Double,
    hold: Double,
    route: String
  ): Unit = js.native
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
    *    (XMLElement |
    *     [XMLElement] |
    *     Strophe.Builder) elem - The stanza to send.
    */
  def send(elem: Element): Unit = js.native
  def send(elem: Builder): Unit = js.native
  /** Function: sendIQ
    *  Helper function to send IQ stanzas.
    *
    *  Parameters:
    *    (XMLElement) elem - The stanza to send.
    *    (Function) callback - The callback function for a successful request.
    *    (Function) errback - The callback function for a failed or timed
    *      out request.  On timeout, the stanza will be null.
    *    (Integer) timeout - The time specified in milliseconds for a
    *      timeout to occur.
    *
    *  Returns:
    *    The id used to send the IQ.
    */
  def sendIQ(elem: Element): String = js.native
  def sendIQ(elem: Element, callback: js.Function1[/* stanza */ Element, _]): String = js.native
  def sendIQ(
    elem: Element,
    callback: js.Function1[/* stanza */ Element, _],
    errback: js.Function1[/* stanza */ Element, _]
  ): String = js.native
  def sendIQ(
    elem: Element,
    callback: js.Function1[/* stanza */ Element, _],
    errback: js.Function1[/* stanza */ Element, _],
    timeout: Double
  ): String = js.native
  def sendIQ(elem: Builder): String = js.native
  def sendIQ(elem: Builder, callback: js.Function1[/* stanza */ Element, _]): String = js.native
  def sendIQ(
    elem: Builder,
    callback: js.Function1[/* stanza */ Element, _],
    errback: js.Function1[/* stanza */ Element, _]
  ): String = js.native
  def sendIQ(
    elem: Builder,
    callback: js.Function1[/* stanza */ Element, _],
    errback: js.Function1[/* stanza */ Element, _],
    timeout: Double
  ): String = js.native
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
    *    (XMLElement) elem - The XML data received by the connection.
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
    *    (XMLElement) elem - The XMLdata sent by the connection.
    */
  def xmlOutput(elem: Element): Unit = js.native
}

