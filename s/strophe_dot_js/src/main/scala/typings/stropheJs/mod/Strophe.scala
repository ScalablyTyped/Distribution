package typings.stropheJs.mod

import typings.std.Document
import typings.std.Element
import typings.std.Node
import typings.std.Text
import typings.stropheJs.anon.MatchBare
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Strophe {
  
  /** Class: Strophe.Builder
    *  XML DOM builder.
    *
    *  This object provides an interface similar to JQuery but for building
    *  DOM element easily and rapidly.  All the functions except for toString()
    *  and tree() return the object, so calls can be chained.  Here's an
    *  example using the $iq() builder helper.
    *  > $iq({to: 'you', from: 'me', type: 'get', id: '1'})
    *  >     .c('query', {xmlns: 'strophe:example'})
    *  >     .c('example')
    *  >     .toString()
    *  The above generates this XML fragment
    *  > <iq to='you' from='me' type='get' id='1'>
    *  >   <query xmlns='strophe:example'>
    *  >     <example/>
    *  >   </query>
    *  > </iq>
    *  The corresponding DOM manipulations to get a similar fragment would be
    *  a lot more tedious and probably involve several helper variables.
    *
    *  Since adding children makes new operations operate on the child, up()
    *  is provided to traverse up the tree.  To add two children, do
    *  > builder.c('child1', ...).up().c('child2', ...)
    *  The next operation on the Builder will be relative to the second child.
    */
  @JSImport("strophe.js", "Strophe.Builder")
  @js.native
  class Builder protected () extends StObject {
    /** Constructor: Strophe.Builder
      *  Create a Strophe.Builder object.
      *
      *  The attributes should be passed in object notation.  For example
      *  > var b = new Builder('message', {to: 'you', from: 'me'});
      *  or
      *  > var b = new Builder('messsage', {'xml:lang': 'en'});
      *
      *  Parameters:
      *    (String) name - The name of the root element.
      *    (Object) attrs - The attributes for the root element in object notation.
      *
      *  Returns:
      *    A new Strophe.Builder.
      */
    def this(name: String) = this()
    def this(name: String, attrs: js.Any) = this()
    
    /** Function: attrs
      *  Add or modify attributes of the current element.
      *
      *  The attributes should be passed in object notation.  This function
      *  does not move the current element pointer.
      *
      *  Parameters:
      *    (Object) moreattrs - The attributes to add/modify in object notation.
      *
      *  Returns:
      *    The Strophe.Builder object.
      */
    def attrs(moreattrs: js.Any): Builder = js.native
    
    /** Function: c
      *  Add a child to the current element and make it the new current
      *  element.
      *
      *  This function moves the current element pointer to the child,
      *  unless text is provided.  If you need to add another child, it
      *  is necessary to use up() to go back to the parent in the tree.
      *
      *  Parameters:
      *    (String) name - The name of the child.
      *    (Object) attrs - The attributes of the child in object notation.
      *    (String) text - The text to add to the child.
      *
      *  Returns:
      *    The Strophe.Builder object.
      */
    def c(name: String): Builder = js.native
    def c(name: String, attrs: js.UndefOr[scala.Nothing], text: String): Builder = js.native
    def c(name: String, attrs: js.Any): Builder = js.native
    def c(name: String, attrs: js.Any, text: String): Builder = js.native
    
    /** Function: cnode
      *  Add a child to the current element and make it the new current
      *  element.
      *
      *  This function is the same as c() except that instead of using a
      *  name and an attributes object to create the child it uses an
      *  existing DOM element object.
      *
      *  Parameters:
      *    (XMLElement) elem - A DOM element.
      *
      *  Returns:
      *    The Strophe.Builder object.
      */
    def cnode(elem: Node): Builder = js.native
    
    /** Function: h
      *  Replace current element contents with the HTML passed in.
      *
      *  This *does not* make the child the new current element
      *
      *  Parameters:
      *    (String) html - The html to insert as contents of current element.
      *
      *  Returns:
      *    The Strophe.Builder object.
      */
    def h(html: String): Builder = js.native
    
    /** Function: t
      *  Add a child text element.
      *
      *  This *does not* make the child the new current element since there
      *  are no children of text elements.
      *
      *  Parameters:
      *    (String) text - The text data to append to the current element.
      *
      *  Returns:
      *    The Strophe.Builder object.
      */
    def t(text: String): Builder = js.native
    
    /** Function: tree
      *  Return the DOM tree.
      *
      *  This function returns the current DOM tree as an element object.  This
      *  is suitable for passing to functions like Strophe.Connection.send().
      *
      *  Returns:
      *    The DOM tree as a element object.
      */
    def tree(): Element = js.native
    
    /** Function: up
      *  Make the current parent element the new current element.
      *
      *  This function is often used after c() to traverse back up the tree.
      *  For example, to add two children to the same element
      *  > builder.c('child1', {}).up().c('child2', {});
      *
      *  Returns:
      *    The Stophe.Builder object.
      */
    def up(): Builder = js.native
  }
  
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
  @JSImport("strophe.js", "Strophe.Connection")
  @js.native
  class Connection protected () extends StObject {
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
    def addHandler(
      handler: js.Function1[/* stanza */ Element, _],
      ns: String,
      name: String,
      `type`: String,
      id: String,
      from: String
    ): js.Any = js.native
    def addHandler(
      handler: js.Function1[/* stanza */ Element, _],
      ns: String,
      name: String,
      `type`: String,
      id: String,
      from: String,
      options: MatchBare
    ): js.Any = js.native
    
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
      callback: js.UndefOr[scala.Nothing],
      wait: js.UndefOr[scala.Nothing],
      hold: js.UndefOr[scala.Nothing],
      wind: Double
    ): Unit = js.native
    def attach(
      jid: String,
      sid: String,
      rid: String,
      callback: js.UndefOr[scala.Nothing],
      wait: js.UndefOr[scala.Nothing],
      hold: Double
    ): Unit = js.native
    def attach(
      jid: String,
      sid: String,
      rid: String,
      callback: js.UndefOr[scala.Nothing],
      wait: js.UndefOr[scala.Nothing],
      hold: Double,
      wind: Double
    ): Unit = js.native
    def attach(jid: String, sid: String, rid: String, callback: js.UndefOr[scala.Nothing], wait: Double): Unit = js.native
    def attach(
      jid: String,
      sid: String,
      rid: String,
      callback: js.UndefOr[scala.Nothing],
      wait: Double,
      hold: js.UndefOr[scala.Nothing],
      wind: Double
    ): Unit = js.native
    def attach(
      jid: String,
      sid: String,
      rid: String,
      callback: js.UndefOr[scala.Nothing],
      wait: Double,
      hold: Double
    ): Unit = js.native
    def attach(
      jid: String,
      sid: String,
      rid: String,
      callback: js.UndefOr[scala.Nothing],
      wait: Double,
      hold: Double,
      wind: Double
    ): Unit = js.native
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
      wait: js.UndefOr[scala.Nothing],
      hold: js.UndefOr[scala.Nothing],
      wind: Double
    ): Unit = js.native
    def attach(
      jid: String,
      sid: String,
      rid: String,
      callback: js.Function2[/* status */ Status, /* condition */ String, _],
      wait: js.UndefOr[scala.Nothing],
      hold: Double
    ): Unit = js.native
    def attach(
      jid: String,
      sid: String,
      rid: String,
      callback: js.Function2[/* status */ Status, /* condition */ String, _],
      wait: js.UndefOr[scala.Nothing],
      hold: Double,
      wind: Double
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
      hold: js.UndefOr[scala.Nothing],
      wind: Double
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
    
    var authcid: String = js.native
    
    var authzid: String = js.native
    
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
    
    var domain: String = js.native
    
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
    
    var jid: String = js.native
    
    var maxRetries: Double = js.native
    
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
    def restore(
      jid: js.UndefOr[scala.Nothing],
      callback: js.UndefOr[scala.Nothing],
      wait: js.UndefOr[scala.Nothing],
      hold: js.UndefOr[scala.Nothing],
      route: String
    ): Unit = js.native
    def restore(
      jid: js.UndefOr[scala.Nothing],
      callback: js.UndefOr[scala.Nothing],
      wait: js.UndefOr[scala.Nothing],
      hold: Double
    ): Unit = js.native
    def restore(
      jid: js.UndefOr[scala.Nothing],
      callback: js.UndefOr[scala.Nothing],
      wait: js.UndefOr[scala.Nothing],
      hold: Double,
      route: String
    ): Unit = js.native
    def restore(jid: js.UndefOr[scala.Nothing], callback: js.UndefOr[scala.Nothing], wait: Double): Unit = js.native
    def restore(
      jid: js.UndefOr[scala.Nothing],
      callback: js.UndefOr[scala.Nothing],
      wait: Double,
      hold: js.UndefOr[scala.Nothing],
      route: String
    ): Unit = js.native
    def restore(jid: js.UndefOr[scala.Nothing], callback: js.UndefOr[scala.Nothing], wait: Double, hold: Double): Unit = js.native
    def restore(
      jid: js.UndefOr[scala.Nothing],
      callback: js.UndefOr[scala.Nothing],
      wait: Double,
      hold: Double,
      route: String
    ): Unit = js.native
    def restore(
      jid: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* status */ Status, /* condition */ String, _]
    ): Unit = js.native
    def restore(
      jid: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* status */ Status, /* condition */ String, _],
      wait: js.UndefOr[scala.Nothing],
      hold: js.UndefOr[scala.Nothing],
      route: String
    ): Unit = js.native
    def restore(
      jid: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* status */ Status, /* condition */ String, _],
      wait: js.UndefOr[scala.Nothing],
      hold: Double
    ): Unit = js.native
    def restore(
      jid: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* status */ Status, /* condition */ String, _],
      wait: js.UndefOr[scala.Nothing],
      hold: Double,
      route: String
    ): Unit = js.native
    def restore(
      jid: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* status */ Status, /* condition */ String, _],
      wait: Double
    ): Unit = js.native
    def restore(
      jid: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* status */ Status, /* condition */ String, _],
      wait: Double,
      hold: js.UndefOr[scala.Nothing],
      route: String
    ): Unit = js.native
    def restore(
      jid: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* status */ Status, /* condition */ String, _],
      wait: Double,
      hold: Double
    ): Unit = js.native
    def restore(
      jid: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* status */ Status, /* condition */ String, _],
      wait: Double,
      hold: Double,
      route: String
    ): Unit = js.native
    def restore(jid: String): Unit = js.native
    def restore(
      jid: String,
      callback: js.UndefOr[scala.Nothing],
      wait: js.UndefOr[scala.Nothing],
      hold: js.UndefOr[scala.Nothing],
      route: String
    ): Unit = js.native
    def restore(jid: String, callback: js.UndefOr[scala.Nothing], wait: js.UndefOr[scala.Nothing], hold: Double): Unit = js.native
    def restore(
      jid: String,
      callback: js.UndefOr[scala.Nothing],
      wait: js.UndefOr[scala.Nothing],
      hold: Double,
      route: String
    ): Unit = js.native
    def restore(jid: String, callback: js.UndefOr[scala.Nothing], wait: Double): Unit = js.native
    def restore(
      jid: String,
      callback: js.UndefOr[scala.Nothing],
      wait: Double,
      hold: js.UndefOr[scala.Nothing],
      route: String
    ): Unit = js.native
    def restore(jid: String, callback: js.UndefOr[scala.Nothing], wait: Double, hold: Double): Unit = js.native
    def restore(jid: String, callback: js.UndefOr[scala.Nothing], wait: Double, hold: Double, route: String): Unit = js.native
    def restore(jid: String, callback: js.Function2[/* status */ Status, /* condition */ String, _]): Unit = js.native
    def restore(
      jid: String,
      callback: js.Function2[/* status */ Status, /* condition */ String, _],
      wait: js.UndefOr[scala.Nothing],
      hold: js.UndefOr[scala.Nothing],
      route: String
    ): Unit = js.native
    def restore(
      jid: String,
      callback: js.Function2[/* status */ Status, /* condition */ String, _],
      wait: js.UndefOr[scala.Nothing],
      hold: Double
    ): Unit = js.native
    def restore(
      jid: String,
      callback: js.Function2[/* status */ Status, /* condition */ String, _],
      wait: js.UndefOr[scala.Nothing],
      hold: Double,
      route: String
    ): Unit = js.native
    def restore(jid: String, callback: js.Function2[/* status */ Status, /* condition */ String, _], wait: Double): Unit = js.native
    def restore(
      jid: String,
      callback: js.Function2[/* status */ Status, /* condition */ String, _],
      wait: Double,
      hold: js.UndefOr[scala.Nothing],
      route: String
    ): Unit = js.native
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
    def sendIQ(
      elem: Element,
      callback: js.UndefOr[scala.Nothing],
      errback: js.UndefOr[scala.Nothing],
      timeout: Double
    ): String = js.native
    def sendIQ(elem: Element, callback: js.UndefOr[scala.Nothing], errback: js.Function1[/* stanza */ Element, _]): String = js.native
    def sendIQ(
      elem: Element,
      callback: js.UndefOr[scala.Nothing],
      errback: js.Function1[/* stanza */ Element, _],
      timeout: Double
    ): String = js.native
    def sendIQ(elem: Element, callback: js.Function1[/* stanza */ Element, _]): String = js.native
    def sendIQ(
      elem: Element,
      callback: js.Function1[/* stanza */ Element, _],
      errback: js.UndefOr[scala.Nothing],
      timeout: Double
    ): String = js.native
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
    def sendIQ(
      elem: Builder,
      callback: js.UndefOr[scala.Nothing],
      errback: js.UndefOr[scala.Nothing],
      timeout: Double
    ): String = js.native
    def sendIQ(elem: Builder, callback: js.UndefOr[scala.Nothing], errback: js.Function1[/* stanza */ Element, _]): String = js.native
    def sendIQ(
      elem: Builder,
      callback: js.UndefOr[scala.Nothing],
      errback: js.Function1[/* stanza */ Element, _],
      timeout: Double
    ): String = js.native
    def sendIQ(elem: Builder, callback: js.Function1[/* stanza */ Element, _]): String = js.native
    def sendIQ(
      elem: Builder,
      callback: js.Function1[/* stanza */ Element, _],
      errback: js.UndefOr[scala.Nothing],
      timeout: Double
    ): String = js.native
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
    
    var servtype: String = js.native
    
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
  
  @js.native
  sealed trait LogLevel extends StObject
  /** Constants: Log Level Constants
    *  Logging level indicators.
    *
    *  LogLevel.DEBUG - Debug output
    *  LogLevel.INFO - Informational output
    *  LogLevel.WARN - Warnings
    *  LogLevel.ERROR - Errors
    *  LogLevel.FATAL - Fatal errors
    */
  @JSImport("strophe.js", "Strophe.LogLevel")
  @js.native
  object LogLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[LogLevel with Double] = js.native
    
    @js.native
    sealed trait DEBUG extends LogLevel
    /* 0 */ val DEBUG: typings.stropheJs.mod.Strophe.LogLevel.DEBUG with Double = js.native
    
    @js.native
    sealed trait ERROR extends LogLevel
    /* 3 */ val ERROR: typings.stropheJs.mod.Strophe.LogLevel.ERROR with Double = js.native
    
    @js.native
    sealed trait FATAL extends LogLevel
    /* 4 */ val FATAL: typings.stropheJs.mod.Strophe.LogLevel.FATAL with Double = js.native
    
    @js.native
    sealed trait INFO extends LogLevel
    /* 1 */ val INFO: typings.stropheJs.mod.Strophe.LogLevel.INFO with Double = js.native
    
    @js.native
    sealed trait WARN extends LogLevel
    /* 2 */ val WARN: typings.stropheJs.mod.Strophe.LogLevel.WARN with Double = js.native
  }
  
  /** Constants: XMPP Namespace Constants
    *  Common namespace constants from the XMPP RFCs and XEPs.
    *
    *  NS.HTTPBIND - HTTP BIND namespace from XEP 124.
    *  NS.BOSH - BOSH namespace from XEP 206.
    *  NS.CLIENT - Main XMPP client namespace.
    *  NS.AUTH - Legacy authentication namespace.
    *  NS.ROSTER - Roster operations namespace.
    *  NS.PROFILE - Profile namespace.
    *  NS.DISCO_INFO - Service discovery info namespace from XEP 30.
    *  NS.DISCO_ITEMS - Service discovery items namespace from XEP 30.
    *  NS.MUC - Multi-User Chat namespace from XEP 45.
    *  NS.SASL - XMPP SASL namespace from RFC 3920.
    *  NS.STREAM - XMPP Streams namespace from RFC 3920.
    *  NS.BIND - XMPP Binding namespace from RFC 3920.
    *  NS.SESSION - XMPP Session namespace from RFC 3920.
    *  NS.XHTML_IM - XHTML-IM namespace from XEP 71.
    *  NS.XHTML - XHTML body namespace from XEP 71.
    */
  object NS {
    
    @JSImport("strophe.js", "Strophe.NS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("strophe.js", "Strophe.NS.AUTH")
    @js.native
    def AUTH: String = js.native
    @scala.inline
    def AUTH_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AUTH")(x.asInstanceOf[js.Any])
    
    @JSImport("strophe.js", "Strophe.NS.BIND")
    @js.native
    def BIND: String = js.native
    @scala.inline
    def BIND_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BIND")(x.asInstanceOf[js.Any])
    
    @JSImport("strophe.js", "Strophe.NS.BOSH")
    @js.native
    def BOSH: String = js.native
    @scala.inline
    def BOSH_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BOSH")(x.asInstanceOf[js.Any])
    
    @JSImport("strophe.js", "Strophe.NS.CLIENT")
    @js.native
    def CLIENT: String = js.native
    @scala.inline
    def CLIENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLIENT")(x.asInstanceOf[js.Any])
    
    @JSImport("strophe.js", "Strophe.NS.DISCO_INFO")
    @js.native
    def DISCO_INFO: String = js.native
    @scala.inline
    def DISCO_INFO_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DISCO_INFO")(x.asInstanceOf[js.Any])
    
    @JSImport("strophe.js", "Strophe.NS.DISCO_ITEMS")
    @js.native
    def DISCO_ITEMS: String = js.native
    @scala.inline
    def DISCO_ITEMS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DISCO_ITEMS")(x.asInstanceOf[js.Any])
    
    @JSImport("strophe.js", "Strophe.NS.FRAMING")
    @js.native
    def FRAMING: String = js.native
    @scala.inline
    def FRAMING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FRAMING")(x.asInstanceOf[js.Any])
    
    @JSImport("strophe.js", "Strophe.NS.HTTPBIND")
    @js.native
    def HTTPBIND: String = js.native
    @scala.inline
    def HTTPBIND_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HTTPBIND")(x.asInstanceOf[js.Any])
    
    @JSImport("strophe.js", "Strophe.NS.MUC")
    @js.native
    def MUC: String = js.native
    @scala.inline
    def MUC_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MUC")(x.asInstanceOf[js.Any])
    
    @JSImport("strophe.js", "Strophe.NS.PROFILE")
    @js.native
    def PROFILE: String = js.native
    @scala.inline
    def PROFILE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PROFILE")(x.asInstanceOf[js.Any])
    
    @JSImport("strophe.js", "Strophe.NS.ROSTER")
    @js.native
    def ROSTER: String = js.native
    @scala.inline
    def ROSTER_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROSTER")(x.asInstanceOf[js.Any])
    
    @JSImport("strophe.js", "Strophe.NS.SASL")
    @js.native
    def SASL: String = js.native
    @scala.inline
    def SASL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SASL")(x.asInstanceOf[js.Any])
    
    @JSImport("strophe.js", "Strophe.NS.SESSION")
    @js.native
    def SESSION: String = js.native
    @scala.inline
    def SESSION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SESSION")(x.asInstanceOf[js.Any])
    
    @JSImport("strophe.js", "Strophe.NS.STANZAS")
    @js.native
    def STANZAS: String = js.native
    @scala.inline
    def STANZAS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STANZAS")(x.asInstanceOf[js.Any])
    
    @JSImport("strophe.js", "Strophe.NS.STREAM")
    @js.native
    def STREAM: String = js.native
    @scala.inline
    def STREAM_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STREAM")(x.asInstanceOf[js.Any])
    
    @JSImport("strophe.js", "Strophe.NS.VERSION")
    @js.native
    def VERSION: String = js.native
    @scala.inline
    def VERSION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERSION")(x.asInstanceOf[js.Any])
    
    @JSImport("strophe.js", "Strophe.NS.XHTML")
    @js.native
    def XHTML: String = js.native
    @scala.inline
    def XHTML_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("XHTML")(x.asInstanceOf[js.Any])
    
    @JSImport("strophe.js", "Strophe.NS.XHTML_IM")
    @js.native
    def XHTML_IM: String = js.native
    @scala.inline
    def XHTML_IM_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("XHTML_IM")(x.asInstanceOf[js.Any])
  }
  
  /** Constants: SASL mechanisms
    *  Available authentication mechanisms
    *
    *  Strophe.SASLAnonymous - SASL Anonymous authentication.
    *  Strophe.SASLPlain - SASL Plain authentication.
    *  Strophe.SASLMD5 - SASL Digest-MD5 authentication
    *  Strophe.SASLSHA1 - SASL SCRAM-SHA1 authentication
    */
  @JSImport("strophe.js", "Strophe.SASLAnonymous")
  @js.native
  val SASLAnonymous: SASLMechanism = js.native
  
  @JSImport("strophe.js", "Strophe.SASLMD5")
  @js.native
  val SASLMD5: SASLMechanism = js.native
  
  @JSImport("strophe.js", "Strophe.SASLPlain")
  @js.native
  val SASLPlain: SASLMechanism = js.native
  
  @JSImport("strophe.js", "Strophe.SASLSHA1")
  @js.native
  val SASLSHA1: SASLMechanism = js.native
  
  @js.native
  sealed trait Status extends StObject
  /** Constants: Connection Status Constants
    *  Connection status constants for use by the connection handler
    *  callback.
    *
    *  Status.ERROR - An error has occurred
    *  Status.CONNECTING - The connection is currently being made
    *  Status.CONNFAIL - The connection attempt failed
    *  Status.AUTHENTICATING - The connection is authenticating
    *  Status.AUTHFAIL - The authentication attempt failed
    *  Status.CONNECTED - The connection has succeeded
    *  Status.DISCONNECTED - The connection has been terminated
    *  Status.DISCONNECTING - The connection is currently being terminated
    *  Status.ATTACHED - The connection has been attached
    */
  @JSImport("strophe.js", "Strophe.Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Status with Double] = js.native
    
    @js.native
    sealed trait ATTACHED extends Status
    /* 8 */ val ATTACHED: typings.stropheJs.mod.Strophe.Status.ATTACHED with Double = js.native
    
    @js.native
    sealed trait AUTHENTICATING extends Status
    /* 3 */ val AUTHENTICATING: typings.stropheJs.mod.Strophe.Status.AUTHENTICATING with Double = js.native
    
    @js.native
    sealed trait AUTHFAIL extends Status
    /* 4 */ val AUTHFAIL: typings.stropheJs.mod.Strophe.Status.AUTHFAIL with Double = js.native
    
    @js.native
    sealed trait CONNECTED extends Status
    /* 5 */ val CONNECTED: typings.stropheJs.mod.Strophe.Status.CONNECTED with Double = js.native
    
    @js.native
    sealed trait CONNECTING extends Status
    /* 1 */ val CONNECTING: typings.stropheJs.mod.Strophe.Status.CONNECTING with Double = js.native
    
    @js.native
    sealed trait CONNFAIL extends Status
    /* 2 */ val CONNFAIL: typings.stropheJs.mod.Strophe.Status.CONNFAIL with Double = js.native
    
    @js.native
    sealed trait CONNTIMEOUT extends Status
    /* 10 */ val CONNTIMEOUT: typings.stropheJs.mod.Strophe.Status.CONNTIMEOUT with Double = js.native
    
    @js.native
    sealed trait DISCONNECTED extends Status
    /* 6 */ val DISCONNECTED: typings.stropheJs.mod.Strophe.Status.DISCONNECTED with Double = js.native
    
    @js.native
    sealed trait DISCONNECTING extends Status
    /* 7 */ val DISCONNECTING: typings.stropheJs.mod.Strophe.Status.DISCONNECTING with Double = js.native
    
    @js.native
    sealed trait ERROR extends Status
    /* 0 */ val ERROR: typings.stropheJs.mod.Strophe.Status.ERROR with Double = js.native
    
    @js.native
    sealed trait REDIRECT extends Status
    /* 9 */ val REDIRECT: typings.stropheJs.mod.Strophe.Status.REDIRECT with Double = js.native
  }
  
  /** Constant: VERSION
    *  The version of the Strophe library. Unreleased builds will have
    *  a version of head-HASH where HASH is a partial revision.
    */
  @JSImport("strophe.js", "Strophe.VERSION")
  @js.native
  val VERSION: String = js.native
  
  /** Function: addConnectionPlugin
    *  Extends the Strophe.Connection object with the given plugin.
    *
    *  Parameters:
    *    (String) name - The name of the extension.
    *    (Object) ptype - The plugin's prototype.
    */
  @JSImport("strophe.js", "Strophe.addConnectionPlugin")
  @js.native
  def addConnectionPlugin(name: String, ptype: js.Any): Unit = js.native
  
  /** Function: addNamespace
    *  This function is used to extend the current namespaces in
    *  Strophe.NS.  It takes a key and a value with the key being the
    *  name of the new namespace, with its actual value.
    *  For example:
    *  Strophe.addNamespace('PUBSUB', "http://jabber.org/protocol/pubsub");
    *
    *  Parameters:
    *    (String) name - The name under which the namespace will be
    *      referenced under Strophe.NS
    *    (String) value - The actual namespace.
    */
  @JSImport("strophe.js", "Strophe.addNamespace")
  @js.native
  def addNamespace(name: String, value: String): Unit = js.native
  
  /** Function: copyElement
    *  Copy an XML DOM element.
    *
    *  This function copies a DOM element and all its descendants and returns
    *  the new copy.
    *
    *  Parameters:
    *    (XMLElement) elem - A DOM element.
    *
    *  Returns:
    *    A new, copied DOM element tree.
    */
  @JSImport("strophe.js", "Strophe.copyElement")
  @js.native
  def copyElement(elem: Element): Element = js.native
  
  /** Function: createHtml
    *  Copy an HTML DOM element into an XML DOM.
    *
    *  This function copies a DOM element and all its descendants and returns
    *  the new copy.
    *
    *  Parameters:
    *    (Element) elem - A DOM element.
    *
    *  Returns:
    *    A new, copied DOM element tree.
    */
  @JSImport("strophe.js", "Strophe.createHtml")
  @js.native
  def createHtml(elem: Element): Element = js.native
  
  /** Functions: debug, info, warn, error
    *  Log a message at the appropriate Strophe.LogLevel
    *
    *  Parameters:
    *    (String) msg - The log message.
    */
  @JSImport("strophe.js", "Strophe.debug")
  @js.native
  def debug(msg: String): Unit = js.native
  
  @JSImport("strophe.js", "Strophe.error")
  @js.native
  def error(msg: String): Unit = js.native
  
  /** Function: escapeNode
    *  Escape the node part (also called local part) of a JID.
    *
    *  Parameters:
    *    (String) node - A node (or local part).
    *
    *  Returns:
    *    An escaped node (or local part).
    */
  @JSImport("strophe.js", "Strophe.escapeNode")
  @js.native
  def escapeNode(node: String): String = js.native
  
  @JSImport("strophe.js", "Strophe.fatal")
  @js.native
  def fatal(msg: String): Unit = js.native
  
  /** Function: forEachChild
    *  Map a function over some or all child elements of a given element.
    *
    *  This is a small convenience function for mapping a function over
    *  some or all of the children of an element.  If elemName is null, all
    *  children will be passed to the function, otherwise only children
    *  whose tag names match elemName will be passed.
    *
    *  Parameters:
    *    (XMLElement) elem - The element to operate on.
    *    (String) elemName - The child element tag name filter.
    *    (Function) func - The function to apply to each child.  This
    *      function should take a single argument, a DOM element.
    */
  @JSImport("strophe.js", "Strophe.forEachChild")
  @js.native
  def forEachChild(elem: Element, elemName: String, func: js.Function1[/* child */ Element, _]): Unit = js.native
  
  /** Function: getBareJidFromJid
    *  Get the bare JID from a JID String.
    *
    *  Parameters:
    *    (String) jid - A JID.
    *
    *  Returns:
    *    A String containing the bare JID.
    */
  @JSImport("strophe.js", "Strophe.getBareJidFromJid")
  @js.native
  def getBareJidFromJid(jid: String): String = js.native
  
  /** Function: getDomainFromJid
    *  Get the domain portion of a JID String.
    *
    *  Parameters:
    *    (String) jid - A JID.
    *
    *  Returns:
    *    A String containing the domain.
    */
  @JSImport("strophe.js", "Strophe.getDomainFromJid")
  @js.native
  def getDomainFromJid(jid: String): String = js.native
  
  /** Function: getNodeFromJid
    *  Get the node portion of a JID String.
    *
    *  Parameters:
    *    (String) jid - A JID.
    *
    *  Returns:
    *    A String containing the node.
    */
  @JSImport("strophe.js", "Strophe.getNodeFromJid")
  @js.native
  def getNodeFromJid(jid: String): String = js.native
  
  /** Function: getResourceFromJid
    *  Get the resource portion of a JID String.
    *
    *  Parameters:
    *    (String) jid - A JID.
    *
    *  Returns:
    *    A String containing the resource.
    */
  @JSImport("strophe.js", "Strophe.getResourceFromJid")
  @js.native
  def getResourceFromJid(jid: String): String = js.native
  
  /** Function: getText
    *  Get the concatenation of all text children of an element.
    *
    *  Parameters:
    *    (XMLElement) elem - A DOM element.
    *
    *  Returns:
    *    A String with the concatenated text of all text element children.
    */
  @JSImport("strophe.js", "Strophe.getText")
  @js.native
  def getText(elem: Element): String = js.native
  
  @JSImport("strophe.js", "Strophe.info")
  @js.native
  def info(msg: String): Unit = js.native
  
  /** Function: isTagEqual
    *  Compare an element's tag name with a string.
    *
    *  This function is case sensitive.
    *
    *  Parameters:
    *    (XMLElement) el - A DOM element.
    *    (String) name - The element name.
    *
    *  Returns:
    *    true if the element's tag name matches _el_, and false
    *    otherwise.
    */
  @JSImport("strophe.js", "Strophe.isTagEqual")
  @js.native
  def isTagEqual(el: Element, name: String): Boolean = js.native
  
  /** Function: log
    *  User overrideable logging function.
    *
    *  This function is called whenever the Strophe library calls any
    *  of the logging functions.  The default implementation of this
    *  function does nothing.  If client code wishes to handle the logging
    *  messages, it should override this with
    *  > Strophe.log = function (level, msg) {
    *  >   (user code here)
    *  > };
    *
    *  Please note that data sent and received over the wire is logged
    *  via Strophe.Connection.rawInput() and Strophe.Connection.rawOutput().
    *
    *  The different levels and their meanings are
    *
    *    DEBUG - Messages useful for debugging purposes.
    *    INFO - Informational messages.  This is mostly information like
    *      'disconnect was called' or 'SASL auth succeeded'.
    *    WARN - Warnings about potential problems.  This is mostly used
    *      to report transient connection errors like request timeouts.
    *    ERROR - Some error occurred.
    *    FATAL - A non-recoverable fatal error occurred.
    *
    *  Parameters:
    *    (Integer) level - The log level of the log message.  This will
    *      be one of the values in Strophe.LogLevel.
    *    (String) msg - The log message.
    */
  @JSImport("strophe.js", "Strophe.log")
  @js.native
  def log(level: LogLevel, msg: String): Unit = js.native
  
  /** Function: serialize
    *  Render a DOM element and all descendants to a String.
    *
    *  Parameters:
    *    (XMLElement) elem - A DOM element.
    *
    *  Returns:
    *    The serialized element tree as a String.
    */
  @JSImport("strophe.js", "Strophe.serialize")
  @js.native
  def serialize(elem: Element): String = js.native
  @JSImport("strophe.js", "Strophe.serialize")
  @js.native
  def serialize(elem: Builder): String = js.native
  
  /** Function: unescapeNode
    *  Unescape a node part (also called local part) of a JID.
    *
    *  Parameters:
    *    (String) node - A node (or local part).
    *
    *  Returns:
    *    An unescaped node (or local part).
    */
  @JSImport("strophe.js", "Strophe.unescapeNode")
  @js.native
  def unescapeNode(node: String): String = js.native
  
  @JSImport("strophe.js", "Strophe.warn")
  @js.native
  def warn(msg: String): Unit = js.native
  
  /** Function: xmlElement
    *  Create an XML DOM element.
    *
    *  This function creates an XML DOM element correctly across all
    *  implementations. Note that these are not HTML DOM elements, which
    *  aren't appropriate for XMPP stanzas.
    *
    *  Parameters:
    *    (String) name - The name for the element.
    *    (Array|Object) attrs - An optional array or object containing
    *      key/value pairs to use as element attributes. The object should
    *      be in the format {'key': 'value'} or {key: 'value'}. The array
    *      should have the format [['key1', 'value1'], ['key2', 'value2']].
    *    (String) text - The text child data for the element.
    *
    *  Returns:
    *    A new XML DOM element.
    */
  @JSImport("strophe.js", "Strophe.xmlElement")
  @js.native
  def xmlElement(name: String): Element = js.native
  @JSImport("strophe.js", "Strophe.xmlElement")
  @js.native
  def xmlElement(name: String, attrs: js.UndefOr[scala.Nothing], text: String): Element = js.native
  @JSImport("strophe.js", "Strophe.xmlElement")
  @js.native
  def xmlElement(name: String, attrs: js.Any): Element = js.native
  @JSImport("strophe.js", "Strophe.xmlElement")
  @js.native
  def xmlElement(name: String, attrs: js.Any, text: String): Element = js.native
  @JSImport("strophe.js", "Strophe.xmlElement")
  @js.native
  def xmlElement(name: String, text: js.UndefOr[scala.Nothing], attrs: js.Any): Element = js.native
  @JSImport("strophe.js", "Strophe.xmlElement")
  @js.native
  def xmlElement(name: String, text: String): Element = js.native
  @JSImport("strophe.js", "Strophe.xmlElement")
  @js.native
  def xmlElement(name: String, text: String, attrs: js.Any): Element = js.native
  
  /** Function: xmlGenerator
    *  Get the DOM document to generate elements.
    *
    *  Returns:
    *    The currently used DOM document.
    */
  @JSImport("strophe.js", "Strophe.xmlGenerator")
  @js.native
  def xmlGenerator(): Document = js.native
  
  /** Function: xmlHtmlNode
    *  Creates an XML DOM html node.
    *
    *  Parameters:
    *    (String) html - The content of the html node.
    *
    *  Returns:
    *    A new XML DOM text node.
    */
  @JSImport("strophe.js", "Strophe.xmlHtmlNode")
  @js.native
  def xmlHtmlNode(html: String): Document = js.native
  
  /** Function: xmlTextNode
    *  Creates an XML DOM text node.
    *
    *  Provides a cross implementation version of document.createTextNode.
    *
    *  Parameters:
    *    (String) text - The content of the text node.
    *
    *  Returns:
    *    A new XML DOM text node.
    */
  @JSImport("strophe.js", "Strophe.xmlTextNode")
  @js.native
  def xmlTextNode(text: String): Text = js.native
  
  /*  Function: xmlescape
    *  Excapes invalid xml characters.
    *
    *  Parameters:
    *     (String) text - text to escape.
    *
    *  Returns:
    *      Escaped text.
    */
  @JSImport("strophe.js", "Strophe.xmlescape")
  @js.native
  def xmlescape(text: String): String = js.native
  
  /*  Function: xmlunescape
    *  Unexcapes invalid xml characters.
    *
    *  Parameters:
    *     (String) text - text to unescape.
    *
    *  Returns:
    *      Unescaped text.
    */
  @JSImport("strophe.js", "Strophe.xmlunescape")
  @js.native
  def xmlunescape(text: String): String = js.native
  
  @js.native
  trait ConnectionOptions extends StObject {
    
    var keepalive: js.UndefOr[Boolean] = js.native
    
    var protocol: js.UndefOr[String] = js.native
    
    var sync: js.UndefOr[Boolean] = js.native
  }
  object ConnectionOptions {
    
    @scala.inline
    def apply(): ConnectionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectionOptions]
    }
    
    @scala.inline
    implicit class ConnectionOptionsMutableBuilder[Self <: ConnectionOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKeepalive(value: Boolean): Self = StObject.set(x, "keepalive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepaliveUndefined: Self = StObject.set(x, "keepalive", js.undefined)
      
      @scala.inline
      def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      @scala.inline
      def setSync(value: Boolean): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSyncUndefined: Self = StObject.set(x, "sync", js.undefined)
    }
  }
  
  /** Interface: Strophe.SASLMechanism
    *
    *  encapsulates SASL authentication mechanisms.
    *
    *  User code may override the priority for each mechanism or disable it completely.
    *  See <priority> for information about changing priority and <test> for informatian on
    *  how to disable a mechanism.
    *
    *  By default, all mechanisms are enabled and the priorities are
    *
    *  SCRAM-SHA1 - 40
    *  DIGEST-MD5 - 30
    *  Plain - 20
    */
  @js.native
  trait SASLMechanism extends StObject {
    
    /** Variable: priority
      *  Determines which <SASLMechanism> is chosen for authentication (Higher is better).
      *  Users may override this to prioritize mechanisms differently.
      *
      *  In the default configuration the priorities are
      *
      *  SCRAM-SHA1 - 40
      *  DIGEST-MD5 - 30
      *  Plain - 20
      *
      *  Example: (This will cause Strophe to choose the mechanism that the server sent first)
      *
      *  > Strophe.SASLMD5.priority = Strophe.SASLSHA1.priority;
      *
      *  See <SASL mechanisms> for a list of available mechanisms.
      *
      */
    var priority: Double = js.native
    
    /**
      *  Function: test
      *  Checks if mechanism able to run.
      *  To disable a mechanism, make this return false;
      *
      *  To disable plain authentication run
      *  > Strophe.SASLPlain.test = function() {
      *  >   return false;
      *  > }
      *
      *  See <SASL mechanisms> for a list of available mechanisms.
      *
      *  Parameters:
      *    (Strophe.Connection) connection - Target Connection.
      *
      *  Returns:
      *    (Boolean) If mechanism was able to run.
      */
    def test(connection: Connection): Boolean = js.native
  }
  object SASLMechanism {
    
    @scala.inline
    def apply(priority: Double, test: Connection => Boolean): SASLMechanism = {
      val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any], test = js.Any.fromFunction1(test))
      __obj.asInstanceOf[SASLMechanism]
    }
    
    @scala.inline
    implicit class SASLMechanismMutableBuilder[Self <: SASLMechanism] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTest(value: Connection => Boolean): Self = StObject.set(x, "test", js.Any.fromFunction1(value))
    }
  }
}
