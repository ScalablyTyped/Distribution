package typings.strophe

import typings.std.Document
import typings.std.Element
import typings.std.Node
import typings.std.Text
import typings.strophe.anon.MatchBare
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("strophe", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Class: Strophe.Builder
    * XML DOM builder.
    *
    * This object provides an interface similar to JQuery but for building
    * DOM element easily and rapidly. All the functions except for toString()
    * and tree() return the object, so calls can be chained. Here's an
    * example using the $iq() builder helper.
    * > $iq({to: 'you', from: 'me', type: 'get', id: '1'})
    * >   .c('query', {xmlns: 'strophe:example'})
    * >   .c('example')
    * >   .toString()
    * The above generates this XML fragment
    * > <iq to='you' from='me' type='get' id='1'>
    * >  <query xmlns='strophe:example'>
    * >   <example/>
    * >  </query>
    * > </iq>
    * The corresponding DOM manipulations to get a similar fragment would be
    * a lot more tedious and probably involve several helper variables.
    *
    * Since adding children makes new operations operate on the child, up()
    * is provided to traverse up the tree. To add two children, do
    * > builder.c('child1', ...).up().c('child2', ...)
    * The next operation on the Builder will be relative to the second child.
    */
  @JSImport("strophe", "Builder")
  @js.native
  open class Builder protected () extends StObject {
    /**
      * Constructor: Strophe.Builder
      * Create a Strophe.Builder object.
      *
      * The attributes should be passed in object notation. For example
      * > const b = new Builder('message', {to: 'you', from: 'me'});
      * or
      * > const b = new Builder('messsage', {'xml:lang': 'en'});
      *
      * Parameters:
      *  (String) name - The name of the root element.
      *  (Object) attrs - The attributes for the root element in object notation.
      *
      * Returns:
      *  A new Strophe.Builder.
      */
    def this(name: String) = this()
    def this(name: String, attrs: Any) = this()
    
    /**
      * Function: attrs
      * Add or modify attributes of the current element.
      *
      * The attributes should be passed in object notation. This function
      * does not move the current element pointer.
      *
      * Parameters:
      *  (Object) moreattrs - The attributes to add/modify in object notation.
      *
      * Returns:
      *  The Strophe.Builder object.
      */
    def attrs(moreattrs: Any): Builder = js.native
    
    /**
      * Function: c
      * Add a child to the current element and make it the new current
      * element.
      *
      * This function moves the current element pointer to the child,
      * unless text is provided. If you need to add another child, it
      * is necessary to use up() to go back to the parent in the tree.
      *
      * Parameters:
      *  (String) name - The name of the child.
      *  (Object) attrs - The attributes of the child in object notation.
      *  (String) text - The text to add to the child.
      *
      * Returns:
      *  The Strophe.Builder object.
      */
    def c(name: String): Builder = js.native
    def c(name: String, attrs: Any): Builder = js.native
    def c(name: String, attrs: Any, text: String): Builder = js.native
    def c(name: String, attrs: Unit, text: String): Builder = js.native
    
    /**
      * Function: cnode
      * Add a child to the current element and make it the new current
      * element.
      *
      * This function is the same as c() except that instead of using a
      * name and an attributes object to create the child it uses an
      * existing DOM element object.
      *
      * Parameters:
      *  (XMLElement) elem - A DOM element.
      *
      * Returns:
      *  The Strophe.Builder object.
      */
    def cnode(elem: Node): Builder = js.native
    
    /**
      * Function: h
      * Replace current element contents with the HTML passed in.
      *
      * This *does not* make the child the new current element
      *
      * Parameters:
      *  (String) html - The html to insert as contents of current element.
      *
      * Returns:
      *  The Strophe.Builder object.
      */
    def h(html: String): Builder = js.native
    
    /**
      * Function: t
      * Add a child text element.
      *
      * This *does not* make the child the new current element since there
      * are no children of text elements.
      *
      * Parameters:
      *  (String) text - The text data to append to the current element.
      *
      * Returns:
      *  The Strophe.Builder object.
      */
    def t(text: String): Builder = js.native
    
    /**
      * Function: tree
      * Return the DOM tree.
      *
      * This function returns the current DOM tree as an element object. This
      * is suitable for passing to functions like Strophe.Connection.send().
      *
      * Returns:
      *  The DOM tree as a element object.
      */
    def tree(): Element = js.native
    
    /**
      * Function: up
      * Make the current parent element the new current element.
      *
      * This function is often used after c() to traverse back up the tree.
      * For example, to add two children to the same element
      * > builder.c('child1', {}).up().c('child2', {});
      *
      * Returns:
      *  The Stophe.Builder object.
      */
    def up(): Builder = js.native
  }
  
  /**
    * Class: Strophe.Connection
    * XMPP Connection manager.
    *
    * This class is the main part of Strophe. It manages a BOSH connection
    * to an XMPP server and dispatches events to the user callbacks as
    * data arrives. It supports SASL PLAIN, SASL DIGEST-MD5, SASL SCRAM-SHA1
    * and legacy authentication.
    *
    * After creating a Strophe.Connection object, the user will typically
    * call connect() with a user supplied callback to handle connection level
    * events like authentication failure, disconnection, or connection
    * complete.
    *
    * The user will also have several event handlers defined by using
    * addHandler() and addTimedHandler(). These will allow the user code to
    * respond to interesting stanzas or do something periodically with the
    * connection. These handlers will be active once authentication is
    * finished.
    *
    * To send data to the connection, use send().
    */
  @JSImport("strophe", "Connection")
  @js.native
  open class Connection protected () extends StObject {
    // todo: what other members are meant to be public?
    /**
      * Constructor: Strophe.Connection
      * Create and initialize a Strophe.Connection object.
      *
      * The transport-protocol for this connection will be chosen automatically
      * based on the given service parameter. URLs starting with "ws: //" or
      * "wss: //" will use WebSockets, URLs starting with "http: //", "https: //"
      * or without a protocol will use BOSH.
      *
      * To make Strophe connect to the current host you can leave out the protocol
      * and host part and just pass the path, e.g.
      *
      * > const conn = new Strophe.Connection("/http-bind/");
      *
      * WebSocket options:
      *
      * If you want to connect to the current host with a WebSocket connection you
      * can tell Strophe to use WebSockets through a "protocol" attribute in the
      * optional options parameter. Valid values are "ws" for WebSocket and "wss"
      * for Secure WebSocket.
      * So to connect to "wss: //CURRENT_HOSTNAME/xmpp-websocket" you would call
      *
      * > const conn = new Strophe.Connection("/xmpp-websocket/", {protocol: "wss"});
      *
      * Note that relative URLs _NOT_ starting with a "/" will also include the path
      * of the current site.
      *
      * Also because downgrading security is not permitted by browsers, when using
      * relative URLs both BOSH and WebSocket connections will use their secure
      * variants if the current connection to the site is also secure (https).
      *
      * BOSH options:
      *
      * by adding "sync" to the options, you can control if requests will
      * be made synchronously or not. The default behaviour is asynchronous.
      * If you want to make requests synchronous, make "sync" evaluate to true:
      * > const conn = new Strophe.Connection("/http-bind/", {sync: true});
      * You can also toggle this on an already established connection:
      * > conn.options.sync = true;
      *
      *
      * Parameters:
      *  (String) service - The BOSH or WebSocket service URL.
      *  (Object) options - A hash of configuration options
      *
      * Returns:
      *  A new Strophe.Connection object.
      */
    def this(service: String) = this()
    def this(service: String, options: ConnectionOptions) = this()
    
    /**
      * Function: addHandler
      * Add a stanza handler for the connection.
      *
      * This function adds a stanza handler to the connection. The
      * handler callback will be called for any stanza that matches
      * the parameters. Note that if multiple parameters are supplied,
      * they must all match for the handler to be invoked.
      *
      * The handler will receive the stanza that triggered it as its argument.
      * *The handler should return true if it is to be invoked again;
      * returning false will remove the handler after it returns.*
      *
      * As a convenience, the ns parameters applies to the top level element
      * and also any of its immediate children. This is primarily to make
      * matching /iq/query elements easy.
      *
      * The options argument contains handler matching flags that affect how
      * matches are determined. Currently the only flag is matchBare (a
      * boolean). When matchBare is true, the from parameter and the from
      * attribute on the stanza will be matched as bare JIDs instead of
      * full JIDs. To use this, pass {matchBare: true} as the value of
      * options. The default value for matchBare is false.
      *
      * The return value should be saved if you wish to remove the handler
      * with deleteHandler().
      *
      * Parameters:
      *  (Function) handler - The user callback.
      *  (String) ns - The namespace to match.
      *  (String) name - The stanza name to match.
      *  (String) type - The stanza type attribute to match.
      *  (String) id - The stanza id attribute to match.
      *  (String) from - The stanza from attribute to match.
      *  (String) options - The handler options
      *
      * Returns:
      *  A reference to the handler that can be used to remove it.
      */
    def addHandler(handler: js.Function1[/* stanza */ Element, Boolean], ns: String, name: String): Any = js.native
    def addHandler(handler: js.Function1[/* stanza */ Element, Boolean], ns: String, name: String, `type`: String): Any = js.native
    def addHandler(
      handler: js.Function1[/* stanza */ Element, Boolean],
      ns: String,
      name: String,
      `type`: String,
      id: String
    ): Any = js.native
    def addHandler(
      handler: js.Function1[/* stanza */ Element, Boolean],
      ns: String,
      name: String,
      `type`: String,
      id: String,
      from: String
    ): Any = js.native
    def addHandler(
      handler: js.Function1[/* stanza */ Element, Boolean],
      ns: String,
      name: String,
      `type`: String,
      id: String,
      from: String,
      options: MatchBare
    ): Any = js.native
    def addHandler(
      handler: js.Function1[/* stanza */ Element, Boolean],
      ns: String,
      name: String,
      `type`: String,
      id: String,
      from: Unit,
      options: MatchBare
    ): Any = js.native
    def addHandler(
      handler: js.Function1[/* stanza */ Element, Boolean],
      ns: String,
      name: String,
      `type`: String,
      id: Unit,
      from: String
    ): Any = js.native
    def addHandler(
      handler: js.Function1[/* stanza */ Element, Boolean],
      ns: String,
      name: String,
      `type`: String,
      id: Unit,
      from: String,
      options: MatchBare
    ): Any = js.native
    def addHandler(
      handler: js.Function1[/* stanza */ Element, Boolean],
      ns: String,
      name: String,
      `type`: String,
      id: Unit,
      from: Unit,
      options: MatchBare
    ): Any = js.native
    def addHandler(
      handler: js.Function1[/* stanza */ Element, Boolean],
      ns: String,
      name: String,
      `type`: Unit,
      id: String
    ): Any = js.native
    def addHandler(
      handler: js.Function1[/* stanza */ Element, Boolean],
      ns: String,
      name: String,
      `type`: Unit,
      id: String,
      from: String
    ): Any = js.native
    def addHandler(
      handler: js.Function1[/* stanza */ Element, Boolean],
      ns: String,
      name: String,
      `type`: Unit,
      id: String,
      from: String,
      options: MatchBare
    ): Any = js.native
    def addHandler(
      handler: js.Function1[/* stanza */ Element, Boolean],
      ns: String,
      name: String,
      `type`: Unit,
      id: String,
      from: Unit,
      options: MatchBare
    ): Any = js.native
    def addHandler(
      handler: js.Function1[/* stanza */ Element, Boolean],
      ns: String,
      name: String,
      `type`: Unit,
      id: Unit,
      from: String
    ): Any = js.native
    def addHandler(
      handler: js.Function1[/* stanza */ Element, Boolean],
      ns: String,
      name: String,
      `type`: Unit,
      id: Unit,
      from: String,
      options: MatchBare
    ): Any = js.native
    def addHandler(
      handler: js.Function1[/* stanza */ Element, Boolean],
      ns: String,
      name: String,
      `type`: Unit,
      id: Unit,
      from: Unit,
      options: MatchBare
    ): Any = js.native
    
    // todo: Is callback correct?
    /**
      * Function: addTimedHandler
      * Add a timed handler to the connection.
      *
      * This function adds a timed handler. The provided handler will
      * be called every period milliseconds until it returns false,
      * the connection is terminated, or the handler is removed. Handlers
      * that wish to continue being invoked should return true.
      *
      * Because of method binding it is necessary to save the result of
      * this function if you wish to remove a handler with
      * deleteTimedHandler().
      *
      * Note that user handlers are not active until authentication is
      * successful.
      *
      * Parameters:
      *  (Integer) period - The period of the handler.
      *  (Function) handler - The callback function.
      *
      * Returns:
      *  A reference to the handler that can be used to remove it.
      */
    def addTimedHandler(period: Double, handler: js.Function0[Boolean]): Any = js.native
    
    /**
      * Function: attach
      * Attach to an already created and authenticated BOSH session.
      *
      * This function is provided to allow Strophe to attach to BOSH
      * sessions which have been created externally, perhaps by a Web
      * application. This is often used to support auto-login type features
      * without putting user credentials into the page.
      *
      * Parameters:
      *  (String) jid - The full JID that is bound by the session.
      *  (String) sid - The SID of the BOSH session.
      *  (String) rid - The current RID of the BOSH session. This RID
      *   will be used by the next request.
      *  (Function) callback The connect callback function.
      *  (Integer) wait - The optional HTTPBIND wait value. This is the
      *   time the server will wait before returning an empty result for
      *   a request. The default setting of 60 seconds is recommended.
      *   Other settings will require tweaks to the Strophe.TIMEOUT value.
      *  (Integer) hold - The optional HTTPBIND hold value. This is the
      *   number of connections the server will hold at one time. This
      *   should almost always be set to 1 (the default).
      *  (Integer) wind - The optional HTTBIND window value. This is the
      *   allowed range of request ids that are valid. The default is 5.
      */
    def attach(jid: String, sid: String, rid: String): Unit = js.native
    def attach(
      jid: String,
      sid: String,
      rid: String,
      callback: js.Function2[/* status */ Status, /* condition */ String, Any]
    ): Unit = js.native
    def attach(
      jid: String,
      sid: String,
      rid: String,
      callback: js.Function2[/* status */ Status, /* condition */ String, Any],
      wait: Double
    ): Unit = js.native
    def attach(
      jid: String,
      sid: String,
      rid: String,
      callback: js.Function2[/* status */ Status, /* condition */ String, Any],
      wait: Double,
      hold: Double
    ): Unit = js.native
    def attach(
      jid: String,
      sid: String,
      rid: String,
      callback: js.Function2[/* status */ Status, /* condition */ String, Any],
      wait: Double,
      hold: Double,
      wind: Double
    ): Unit = js.native
    def attach(
      jid: String,
      sid: String,
      rid: String,
      callback: js.Function2[/* status */ Status, /* condition */ String, Any],
      wait: Double,
      hold: Unit,
      wind: Double
    ): Unit = js.native
    def attach(
      jid: String,
      sid: String,
      rid: String,
      callback: js.Function2[/* status */ Status, /* condition */ String, Any],
      wait: Unit,
      hold: Double
    ): Unit = js.native
    def attach(
      jid: String,
      sid: String,
      rid: String,
      callback: js.Function2[/* status */ Status, /* condition */ String, Any],
      wait: Unit,
      hold: Double,
      wind: Double
    ): Unit = js.native
    def attach(
      jid: String,
      sid: String,
      rid: String,
      callback: js.Function2[/* status */ Status, /* condition */ String, Any],
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
    
    var authcid: String = js.native
    
    var authzid: String = js.native
    
    /**
      * Function: connect
      * Starts the connection process.
      *
      * As the connection process proceeds, the user supplied callback will
      * be triggered multiple times with status updates. The callback
      * should take two arguments - the status code and the error condition.
      *
      * The status code will be one of the values in the Strophe.Status
      * constants. The error condition will be one of the conditions
      * defined in RFC 3920 or the condition 'strophe-parsererror'.
      *
      * The Parameters _wait_, _hold_ and _route_ are optional and only relevant
      * for BOSH connections. Please see XEP 124 for a more detailed explanation
      * of the optional parameters.
      *
      * Parameters:
      *  (String) jid - The user's JID. This may be a bare JID,
      *   or a full JID. If a node is not supplied, SASL ANONYMOUS
      *   authentication will be attempted.
      *  (String) pass - The user's password.
      *  (Function) callback - The connect callback function.
      *  (Integer) wait - The optional HTTPBIND wait value. This is the
      *   time the server will wait before returning an empty result for
      *   a request. The default setting of 60 seconds is recommended.
      *  (Integer) hold - The optional HTTPBIND hold value. This is the
      *   number of connections the server will hold at one time. This
      *   should almost always be set to 1 (the default).
      *  (String) route - The optional route value.
      */
    def connect(
      jid: js.UndefOr[String],
      pass: js.UndefOr[String],
      callback: js.UndefOr[js.Function2[/* status */ Status, /* condition */ String, Any]],
      wait: js.UndefOr[Double],
      hold: js.UndefOr[Double],
      route: js.UndefOr[String]
    ): Unit = js.native
    
    // todo: is callback correct? Also, are the elements specified as optional truly optional?
    /**
      * Function: deleteHandler
      * Delete a stanza handler for a connection.
      *
      * This function removes a stanza handler from the connection. The
      * handRef parameter is *not* the function passed to addHandler(),
      * but is the reference returned from addHandler().
      *
      * Parameters:
      *  (Strophe.Handler) handRef - The handler reference.
      */
    def deleteHandler(handRef: Any): Unit = js.native
    
    /**
      * Function: deleteTimedHandler
      * Delete a timed handler for a connection.
      *
      * This function removes a timed handler from the connection. The
      * handRef parameter is *not* the function passed to addTimedHandler(),
      * but is the reference returned from addTimedHandler().
      *
      * Parameters:
      *  (Strophe.TimedHandler) handRef - The handler reference.
      */
    def deleteTimedHandler(handRef: Any): Unit = js.native
    
    /**
      * Function: disconnect
      * Start the graceful disconnection process.
      *
      * This function starts the disconnection process. This process starts
      * by sending unavailable presence and sending BOSH body of type
      * terminate. A timeout handler makes sure that disconnection happens
      * even if the BOSH server does not respond.
      * If the Connection object isn't connected, at least tries to abort all pending requests
      * so the connection object won't generate successful requests (which were already opened).
      *
      * The user supplied connection callback will be notified of the
      * progress as this process happens.
      *
      * Parameters:
      *  (String) reason - The reason the disconnect is occuring.
      */
    def disconnect(reason: String): Unit = js.native
    
    var domain: String = js.native
    
    /**
      * Function: flush
      * Immediately send any pending outgoing data.
      *
      * Normally send() queues outgoing data until the next idle period
      * (100ms), which optimizes network use in the common cases when
      * several send()s are called in succession. flush() can be used to
      * immediately send all pending data.
      */
    def flush(): Unit = js.native
    
    /**
      * Function: getUniqueId
      * Generate a unique ID for use in <iq/> elements.
      *
      * All <iq/> stanzas are required to have unique id attributes. This
      * function makes creating these easy. Each connection instance has
      * a counter which starts from zero, and the value of this counter
      * plus a colon followed by the suffix becomes the unique id. If no
      * suffix is supplied, the counter is used as the unique id.
      *
      * Suffixes are used to make debugging easier when reading the stream
      * data, and their use is recommended. The counter resets to 0 for
      * every new connection for the same reason. For connections to the
      * same server that authenticate the same way, all the ids should be
      * the same, which makes it easy to see changes. This is useful for
      * automated testing as well.
      *
      * Parameters:
      *  (String) suffix - A optional suffix to append to the id.
      *
      * Returns:
      *  A unique string to be used for the id attribute.
      */
    def getUniqueId(): String = js.native
    def getUniqueId(suffix: String): String = js.native
    def getUniqueId(suffix: Double): String = js.native
    
    var jid: String = js.native
    
    var maxRetries: Double = js.native
    
    var pass: String = js.native
    
    /**
      * Function: pause
      * Pause the request manager.
      *
      * This will prevent Strophe from sending any more requests to the
      * server. This is very useful for temporarily pausing
      * BOSH-Connections while a lot of send() calls are happening quickly.
      * This causes Strophe to send the data in a single request, saving
      * many request trips.
      */
    def pause(): Unit = js.native
    
    /**
      * Function: rawInput
      * User overrideable function that receives raw data coming into the
      * connection.
      *
      * The default function does nothing. User code can override this with
      * > Strophe.Connection.rawInput = function (data) {
      * >  (user code)
      * > };
      *
      * Parameters:
      *  (String) data - The data received by the connection.
      */
    def rawInput(data: String): Unit = js.native
    
    /**
      * Function: rawOutput
      * User overrideable function that receives raw data sent to the
      * connection.
      *
      * The default function does nothing. User code can override this with
      * > Strophe.Connection.rawOutput = function (data) {
      * >  (user code)
      * > };
      *
      * Parameters:
      *  (String) data - The data sent by the connection.
      */
    def rawOutput(data: String): Unit = js.native
    
    /**
      * Function: reset
      * Reset the connection.
      *
      * This function should be called after a connection is disconnected
      * before that connection is reused.
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
      *  (String) jid - The user’s JID. This may be a bare JID or a full JID.
      *  (Function) callback - The connect callback function.
      *  (Integer) wait - The optional HTTPBIND wait value.
      *   This is the time the server will wait before returning an empty result for a request.
      *   The default setting of 60 seconds is recommended.
      *  (Integer) hold - The optional HTTPBIND hold value.
      *   This is the number of connections the server will hold at one time.
      *   This should almost always be set to 1 (the default).
      *  (Integer) wind - The optional HTTBIND window value.
      *   This is the allowed range of request ids that are valid.
      *   The default is 5.
      */
    def restore(): Unit = js.native
    def restore(jid: String): Unit = js.native
    def restore(jid: String, callback: js.Function2[/* status */ Status, /* condition */ String, Any]): Unit = js.native
    def restore(
      jid: String,
      callback: js.Function2[/* status */ Status, /* condition */ String, Any],
      wait: Double
    ): Unit = js.native
    def restore(
      jid: String,
      callback: js.Function2[/* status */ Status, /* condition */ String, Any],
      wait: Double,
      hold: Double
    ): Unit = js.native
    def restore(
      jid: String,
      callback: js.Function2[/* status */ Status, /* condition */ String, Any],
      wait: Double,
      hold: Double,
      route: String
    ): Unit = js.native
    def restore(
      jid: String,
      callback: js.Function2[/* status */ Status, /* condition */ String, Any],
      wait: Double,
      hold: Unit,
      route: String
    ): Unit = js.native
    def restore(
      jid: String,
      callback: js.Function2[/* status */ Status, /* condition */ String, Any],
      wait: Unit,
      hold: Double
    ): Unit = js.native
    def restore(
      jid: String,
      callback: js.Function2[/* status */ Status, /* condition */ String, Any],
      wait: Unit,
      hold: Double,
      route: String
    ): Unit = js.native
    def restore(
      jid: String,
      callback: js.Function2[/* status */ Status, /* condition */ String, Any],
      wait: Unit,
      hold: Unit,
      route: String
    ): Unit = js.native
    def restore(jid: String, callback: Unit, wait: Double): Unit = js.native
    def restore(jid: String, callback: Unit, wait: Double, hold: Double): Unit = js.native
    def restore(jid: String, callback: Unit, wait: Double, hold: Double, route: String): Unit = js.native
    def restore(jid: String, callback: Unit, wait: Double, hold: Unit, route: String): Unit = js.native
    def restore(jid: String, callback: Unit, wait: Unit, hold: Double): Unit = js.native
    def restore(jid: String, callback: Unit, wait: Unit, hold: Double, route: String): Unit = js.native
    def restore(jid: String, callback: Unit, wait: Unit, hold: Unit, route: String): Unit = js.native
    def restore(jid: Unit, callback: js.Function2[/* status */ Status, /* condition */ String, Any]): Unit = js.native
    def restore(jid: Unit, callback: js.Function2[/* status */ Status, /* condition */ String, Any], wait: Double): Unit = js.native
    def restore(
      jid: Unit,
      callback: js.Function2[/* status */ Status, /* condition */ String, Any],
      wait: Double,
      hold: Double
    ): Unit = js.native
    def restore(
      jid: Unit,
      callback: js.Function2[/* status */ Status, /* condition */ String, Any],
      wait: Double,
      hold: Double,
      route: String
    ): Unit = js.native
    def restore(
      jid: Unit,
      callback: js.Function2[/* status */ Status, /* condition */ String, Any],
      wait: Double,
      hold: Unit,
      route: String
    ): Unit = js.native
    def restore(
      jid: Unit,
      callback: js.Function2[/* status */ Status, /* condition */ String, Any],
      wait: Unit,
      hold: Double
    ): Unit = js.native
    def restore(
      jid: Unit,
      callback: js.Function2[/* status */ Status, /* condition */ String, Any],
      wait: Unit,
      hold: Double,
      route: String
    ): Unit = js.native
    def restore(
      jid: Unit,
      callback: js.Function2[/* status */ Status, /* condition */ String, Any],
      wait: Unit,
      hold: Unit,
      route: String
    ): Unit = js.native
    def restore(jid: Unit, callback: Unit, wait: Double): Unit = js.native
    def restore(jid: Unit, callback: Unit, wait: Double, hold: Double): Unit = js.native
    def restore(jid: Unit, callback: Unit, wait: Double, hold: Double, route: String): Unit = js.native
    def restore(jid: Unit, callback: Unit, wait: Double, hold: Unit, route: String): Unit = js.native
    def restore(jid: Unit, callback: Unit, wait: Unit, hold: Double): Unit = js.native
    def restore(jid: Unit, callback: Unit, wait: Unit, hold: Double, route: String): Unit = js.native
    def restore(jid: Unit, callback: Unit, wait: Unit, hold: Unit, route: String): Unit = js.native
    
    /**
      * Function: resume
      * Resume the request manager.
      *
      * This resumes after pause() has been called.
      */
    def resume(): Unit = js.native
    
    def send(elem: js.Array[Element]): Unit = js.native
    /**
      * Function: send
      * Send a stanza.
      *
      * This function is called to push data onto the send queue to
      * go out over the wire. Whenever a request is sent to the BOSH
      * server, all pending data is sent and the queue is flushed.
      *
      * Parameters:
      *  (XMLElement |
      *  [XMLElement] |
      *  Strophe.Builder) elem - The stanza to send.
      */
    def send(elem: Element): Unit = js.native
    def send(elem: Builder): Unit = js.native
    
    /**
      * Function: sendIQ
      * Helper function to send IQ stanzas.
      *
      * Parameters:
      *  (XMLElement) elem - The stanza to send.
      *  (Function) callback - The callback function for a successful request.
      *  (Function) errback - The callback function for a failed or timed
      *   out request. On timeout, the stanza will be null.
      *  (Integer) timeout - The time specified in milliseconds for a
      *   timeout to occur.
      *
      * Returns:
      *  The id used to send the IQ.
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
    
    var servtype: String = js.native
    
    /**
      * Function: xmlInput
      * User overrideable function that receives XML data coming into the
      * connection.
      *
      * The default function does nothing. User code can override this with
      * > Strophe.Connection.xmlInput = function (elem) {
      * >  (user code)
      * > };
      *
      * Due to limitations of current Browsers' XML-Parsers the opening and closing
      * <stream> tag for WebSocket-Connoctions will be passed as selfclosing here.
      *
      * BOSH-Connections will have all stanzas wrapped in a <body> tag. See
      * <Strophe.Bosh.strip> if you want to strip this tag.
      *
      * Parameters:
      *  (XMLElement) elem - The XML data received by the connection.
      */
    def xmlInput(elem: Element): Unit = js.native
    
    /**
      * Function: xmlOutput
      * User overrideable function that receives XML data sent to the
      * connection.
      *
      * The default function does nothing. User code can override this with
      * > Strophe.Connection.xmlOutput = function (elem) {
      * >  (user code)
      * > };
      *
      * Due to limitations of current Browsers' XML-Parsers the opening and closing
      * <stream> tag for WebSocket-Connoctions will be passed as selfclosing here.
      *
      * BOSH-Connections will have all stanzas wrapped in a <body> tag. See
      * <Strophe.Bosh.strip> if you want to strip this tag.
      *
      * Parameters:
      *  (XMLElement) elem - The XMLdata sent by the connection.
      */
    def xmlOutput(elem: Element): Unit = js.native
  }
  
  @js.native
  sealed trait LogLevel extends StObject
  /**
    * Constants: Log Level Constants
    * Logging level indicators.
    *
    * LogLevel.DEBUG - Debug output
    * LogLevel.INFO - Informational output
    * LogLevel.WARN - Warnings
    * LogLevel.ERROR - Errors
    * LogLevel.FATAL - Fatal errors
    */
  @JSImport("strophe", "LogLevel")
  @js.native
  object LogLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[LogLevel & Double] = js.native
    
    @js.native
    sealed trait DEBUG
      extends StObject
         with LogLevel
    /* 0 */ val DEBUG: typings.strophe.mod.LogLevel.DEBUG & Double = js.native
    
    @js.native
    sealed trait ERROR
      extends StObject
         with LogLevel
    /* 3 */ val ERROR: typings.strophe.mod.LogLevel.ERROR & Double = js.native
    
    @js.native
    sealed trait FATAL
      extends StObject
         with LogLevel
    /* 4 */ val FATAL: typings.strophe.mod.LogLevel.FATAL & Double = js.native
    
    @js.native
    sealed trait INFO
      extends StObject
         with LogLevel
    /* 1 */ val INFO: typings.strophe.mod.LogLevel.INFO & Double = js.native
    
    @js.native
    sealed trait WARN
      extends StObject
         with LogLevel
    /* 2 */ val WARN: typings.strophe.mod.LogLevel.WARN & Double = js.native
  }
  
  /**
    * Constants: XMPP Namespace Constants
    * Common namespace constants from the XMPP RFCs and XEPs.
    *
    * NS.HTTPBIND - HTTP BIND namespace from XEP 124.
    * NS.BOSH - BOSH namespace from XEP 206.
    * NS.CLIENT - Main XMPP client namespace.
    * NS.AUTH - Legacy authentication namespace.
    * NS.ROSTER - Roster operations namespace.
    * NS.PROFILE - Profile namespace.
    * NS.DISCO_INFO - Service discovery info namespace from XEP 30.
    * NS.DISCO_ITEMS - Service discovery items namespace from XEP 30.
    * NS.MUC - Multi-User Chat namespace from XEP 45.
    * NS.SASL - XMPP SASL namespace from RFC 3920.
    * NS.STREAM - XMPP Streams namespace from RFC 3920.
    * NS.BIND - XMPP Binding namespace from RFC 3920.
    * NS.SESSION - XMPP Session namespace from RFC 3920.
    * NS.XHTML_IM - XHTML-IM namespace from XEP 71.
    * NS.XHTML - XHTML body namespace from XEP 71.
    */
  object NS {
    
    @JSImport("strophe", "NS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("strophe", "NS.AUTH")
    @js.native
    def AUTH: String = js.native
    inline def AUTH_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AUTH")(x.asInstanceOf[js.Any])
    
    @JSImport("strophe", "NS.BIND")
    @js.native
    def BIND: String = js.native
    inline def BIND_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BIND")(x.asInstanceOf[js.Any])
    
    @JSImport("strophe", "NS.BOSH")
    @js.native
    def BOSH: String = js.native
    inline def BOSH_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BOSH")(x.asInstanceOf[js.Any])
    
    @JSImport("strophe", "NS.CLIENT")
    @js.native
    def CLIENT: String = js.native
    inline def CLIENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLIENT")(x.asInstanceOf[js.Any])
    
    @JSImport("strophe", "NS.DISCO_INFO")
    @js.native
    def DISCO_INFO: String = js.native
    inline def DISCO_INFO_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DISCO_INFO")(x.asInstanceOf[js.Any])
    
    @JSImport("strophe", "NS.DISCO_ITEMS")
    @js.native
    def DISCO_ITEMS: String = js.native
    inline def DISCO_ITEMS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DISCO_ITEMS")(x.asInstanceOf[js.Any])
    
    @JSImport("strophe", "NS.FRAMING")
    @js.native
    def FRAMING: String = js.native
    inline def FRAMING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FRAMING")(x.asInstanceOf[js.Any])
    
    @JSImport("strophe", "NS.HTTPBIND")
    @js.native
    def HTTPBIND: String = js.native
    inline def HTTPBIND_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HTTPBIND")(x.asInstanceOf[js.Any])
    
    @JSImport("strophe", "NS.MUC")
    @js.native
    def MUC: String = js.native
    inline def MUC_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MUC")(x.asInstanceOf[js.Any])
    
    @JSImport("strophe", "NS.PROFILE")
    @js.native
    def PROFILE: String = js.native
    inline def PROFILE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PROFILE")(x.asInstanceOf[js.Any])
    
    @JSImport("strophe", "NS.ROSTER")
    @js.native
    def ROSTER: String = js.native
    inline def ROSTER_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROSTER")(x.asInstanceOf[js.Any])
    
    @JSImport("strophe", "NS.SASL")
    @js.native
    def SASL: String = js.native
    inline def SASL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SASL")(x.asInstanceOf[js.Any])
    
    @JSImport("strophe", "NS.SESSION")
    @js.native
    def SESSION: String = js.native
    inline def SESSION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SESSION")(x.asInstanceOf[js.Any])
    
    @JSImport("strophe", "NS.STANZAS")
    @js.native
    def STANZAS: String = js.native
    inline def STANZAS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STANZAS")(x.asInstanceOf[js.Any])
    
    @JSImport("strophe", "NS.STREAM")
    @js.native
    def STREAM: String = js.native
    inline def STREAM_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STREAM")(x.asInstanceOf[js.Any])
    
    @JSImport("strophe", "NS.VERSION")
    @js.native
    def VERSION: String = js.native
    inline def VERSION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERSION")(x.asInstanceOf[js.Any])
    
    @JSImport("strophe", "NS.XHTML")
    @js.native
    def XHTML: String = js.native
    inline def XHTML_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("XHTML")(x.asInstanceOf[js.Any])
    
    @JSImport("strophe", "NS.XHTML_IM")
    @js.native
    def XHTML_IM: String = js.native
    inline def XHTML_IM_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("XHTML_IM")(x.asInstanceOf[js.Any])
  }
  
  /**
    * Constants: SASL mechanisms
    * Available authentication mechanisms
    *
    * Strophe.SASLAnonymous - SASL Anonymous authentication.
    * Strophe.SASLPlain - SASL Plain authentication.
    * Strophe.SASLMD5 - SASL Digest-MD5 authentication
    * Strophe.SASLSHA1 - SASL SCRAM-SHA1 authentication
    */
  @JSImport("strophe", "SASLAnonymous")
  @js.native
  val SASLAnonymous: SASLMechanism = js.native
  
  @JSImport("strophe", "SASLMD5")
  @js.native
  val SASLMD5: SASLMechanism = js.native
  
  @JSImport("strophe", "SASLPlain")
  @js.native
  val SASLPlain: SASLMechanism = js.native
  
  @JSImport("strophe", "SASLSHA1")
  @js.native
  val SASLSHA1: SASLMechanism = js.native
  
  @js.native
  sealed trait Status extends StObject
  /**
    * Constants: Connection Status Constants
    * Connection status constants for use by the connection handler
    * callback.
    *
    * Status.ERROR - An error has occurred
    * Status.CONNECTING - The connection is currently being made
    * Status.CONNFAIL - The connection attempt failed
    * Status.AUTHENTICATING - The connection is authenticating
    * Status.AUTHFAIL - The authentication attempt failed
    * Status.CONNECTED - The connection has succeeded
    * Status.DISCONNECTED - The connection has been terminated
    * Status.DISCONNECTING - The connection is currently being terminated
    * Status.ATTACHED - The connection has been attached
    */
  @JSImport("strophe", "Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Status & Double] = js.native
    
    @js.native
    sealed trait ATTACHED
      extends StObject
         with Status
    /* 8 */ val ATTACHED: typings.strophe.mod.Status.ATTACHED & Double = js.native
    
    @js.native
    sealed trait AUTHENTICATING
      extends StObject
         with Status
    /* 3 */ val AUTHENTICATING: typings.strophe.mod.Status.AUTHENTICATING & Double = js.native
    
    @js.native
    sealed trait AUTHFAIL
      extends StObject
         with Status
    /* 4 */ val AUTHFAIL: typings.strophe.mod.Status.AUTHFAIL & Double = js.native
    
    @js.native
    sealed trait CONNECTED
      extends StObject
         with Status
    /* 5 */ val CONNECTED: typings.strophe.mod.Status.CONNECTED & Double = js.native
    
    @js.native
    sealed trait CONNECTING
      extends StObject
         with Status
    /* 1 */ val CONNECTING: typings.strophe.mod.Status.CONNECTING & Double = js.native
    
    @js.native
    sealed trait CONNFAIL
      extends StObject
         with Status
    /* 2 */ val CONNFAIL: typings.strophe.mod.Status.CONNFAIL & Double = js.native
    
    @js.native
    sealed trait CONNTIMEOUT
      extends StObject
         with Status
    /* 10 */ val CONNTIMEOUT: typings.strophe.mod.Status.CONNTIMEOUT & Double = js.native
    
    @js.native
    sealed trait DISCONNECTED
      extends StObject
         with Status
    /* 6 */ val DISCONNECTED: typings.strophe.mod.Status.DISCONNECTED & Double = js.native
    
    @js.native
    sealed trait DISCONNECTING
      extends StObject
         with Status
    /* 7 */ val DISCONNECTING: typings.strophe.mod.Status.DISCONNECTING & Double = js.native
    
    @js.native
    sealed trait ERROR
      extends StObject
         with Status
    /* 0 */ val ERROR: typings.strophe.mod.Status.ERROR & Double = js.native
    
    @js.native
    sealed trait REDIRECT
      extends StObject
         with Status
    /* 9 */ val REDIRECT: typings.strophe.mod.Status.REDIRECT & Double = js.native
  }
  
  /**
    * Constant: VERSION
    * The version of the Strophe library. Unreleased builds will have
    * a version of head-HASH where HASH is a partial revision.
    */
  @JSImport("strophe", "VERSION")
  @js.native
  val VERSION: String = js.native
  
  /**
    * Function: addConnectionPlugin
    * Extends the Strophe.Connection object with the given plugin.
    *
    * Parameters:
    *  (String) name - The name of the extension.
    *  (Object) ptype - The plugin's prototype.
    */
  inline def addConnectionPlugin(name: String, ptype: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addConnectionPlugin")(name.asInstanceOf[js.Any], ptype.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Function: addNamespace
    * This function is used to extend the current namespaces in
    * Strophe.NS. It takes a key and a value with the key being the
    * name of the new namespace, with its actual value.
    * For example:
    * Strophe.addNamespace('PUBSUB', "http: //jabber.org/protocol/pubsub");
    *
    * Parameters:
    *  (String) name - The name under which the namespace will be
    *   referenced under Strophe.NS
    *  (String) value - The actual namespace.
    */
  inline def addNamespace(name: String, value: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addNamespace")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Function: $build
    * Create a Strophe.Builder.
    * This is an alias for 'new Strophe.Builder(name, attrs)'.
    *
    * Parameters:
    *  (String) name - The root element name.
    *  (Object) attrs - The attributes for the root element in object notation.
    *
    * Returns:
    *  A new Strophe.Builder object.
    */
  inline def build(name: String): Builder = ^.asInstanceOf[js.Dynamic].applyDynamic("$build")(name.asInstanceOf[js.Any]).asInstanceOf[Builder]
  inline def build(name: String, attrs: Any): Builder = (^.asInstanceOf[js.Dynamic].applyDynamic("$build")(name.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).asInstanceOf[Builder]
  
  /**
    * Function: copyElement
    * Copy an XML DOM element.
    *
    * This function copies a DOM element and all its descendants and returns
    * the new copy.
    *
    * Parameters:
    *  (XMLElement) elem - A DOM element.
    *
    * Returns:
    *  A new, copied DOM element tree.
    */
  inline def copyElement(elem: Element): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("copyElement")(elem.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  /**
    * Function: createHtml
    * Copy an HTML DOM element into an XML DOM.
    *
    * This function copies a DOM element and all its descendants and returns
    * the new copy.
    *
    * Parameters:
    *  (Element) elem - A DOM element.
    *
    * Returns:
    *  A new, copied DOM element tree.
    */
  inline def createHtml(elem: Element): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("createHtml")(elem.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  /**
    * Functions: debug, info, warn, error
    * Log a message at the appropriate Strophe.LogLevel
    *
    * Parameters:
    *  (String) msg - The log message.
    */
  inline def debug(msg: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("debug")(msg.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def error(msg: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(msg.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Function: escapeNode
    * Escape the node part (also called local part) of a JID.
    *
    * Parameters:
    *  (String) node - A node (or local part).
    *
    * Returns:
    *  An escaped node (or local part).
    */
  inline def escapeNode(node: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeNode")(node.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def fatal(msg: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("fatal")(msg.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Function: forEachChild
    * Map a function over some or all child elements of a given element.
    *
    * This is a small convenience function for mapping a function over
    * some or all of the children of an element. If elemName is null, all
    * children will be passed to the function, otherwise only children
    * whose tag names match elemName will be passed.
    *
    * Parameters:
    *  (XMLElement) elem - The element to operate on.
    *  (String) elemName - The child element tag name filter.
    *  (Function) func - The function to apply to each child. This
    *   function should take a single argument, a DOM element.
    */
  inline def forEachChild(elem: Element, elemName: String, func: js.Function1[/* child */ Element, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEachChild")(elem.asInstanceOf[js.Any], elemName.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Function: getBareJidFromJid
    * Get the bare JID from a JID String.
    *
    * Parameters:
    *  (String) jid - A JID.
    *
    * Returns:
    *  A String containing the bare JID.
    */
  inline def getBareJidFromJid(jid: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getBareJidFromJid")(jid.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Function: getDomainFromJid
    * Get the domain portion of a JID String.
    *
    * Parameters:
    *  (String) jid - A JID.
    *
    * Returns:
    *  A String containing the domain.
    */
  inline def getDomainFromJid(jid: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDomainFromJid")(jid.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Function: getNodeFromJid
    * Get the node portion of a JID String.
    *
    * Parameters:
    *  (String) jid - A JID.
    *
    * Returns:
    *  A String containing the node.
    */
  inline def getNodeFromJid(jid: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getNodeFromJid")(jid.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Function: getResourceFromJid
    * Get the resource portion of a JID String.
    *
    * Parameters:
    *  (String) jid - A JID.
    *
    * Returns:
    *  A String containing the resource.
    */
  inline def getResourceFromJid(jid: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getResourceFromJid")(jid.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Function: getText
    * Get the concatenation of all text children of an element.
    *
    * Parameters:
    *  (XMLElement) elem - A DOM element.
    *
    * Returns:
    *  A String with the concatenated text of all text element children.
    */
  inline def getText(elem: Element): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getText")(elem.asInstanceOf[js.Any]).asInstanceOf[String]
  
  object global {
    
    /* was `typeof Strophe.$build` */
    @JSGlobal("$build")
    @js.native
    def build: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Strophe.$build */ Any = js.native
    
    inline def build_=(x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Strophe.$build */ Any): Unit = js.Dynamic.global.updateDynamic("$build")(x.asInstanceOf[js.Any])
    
    /* was `typeof Strophe.$iq` */
    @JSGlobal("$iq")
    @js.native
    def iq: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Strophe.$iq */ Any = js.native
    
    inline def iq_=(x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Strophe.$iq */ Any): Unit = js.Dynamic.global.updateDynamic("$iq")(x.asInstanceOf[js.Any])
    
    /* was `typeof Strophe.$msg` */
    @JSGlobal("$msg")
    @js.native
    def msg: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Strophe.$msg */ Any = js.native
    
    inline def msg_=(x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Strophe.$msg */ Any): Unit = js.Dynamic.global.updateDynamic("$msg")(x.asInstanceOf[js.Any])
    
    /* was `typeof Strophe.$pres` */
    @JSGlobal("$pres")
    @js.native
    def pres: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Strophe.$pres */ Any = js.native
    
    inline def pres_=(x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Strophe.$pres */ Any): Unit = js.Dynamic.global.updateDynamic("$pres")(x.asInstanceOf[js.Any])
  }
  
  inline def info(msg: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("info")(msg.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Function: $iq
    * Create a Strophe.Builder with an <iq/> element as the root.
    *
    * Parameters:
    *  (Object) attrs - The <iq/> element attributes in object notation.
    *
    * Returns:
    *  A new Strophe.Builder object.
    */
  inline def iq(): Builder = ^.asInstanceOf[js.Dynamic].applyDynamic("$iq")().asInstanceOf[Builder]
  inline def iq(attrs: Any): Builder = ^.asInstanceOf[js.Dynamic].applyDynamic("$iq")(attrs.asInstanceOf[js.Any]).asInstanceOf[Builder]
  
  /**
    * Function: isTagEqual
    * Compare an element's tag name with a string.
    *
    * This function is case sensitive.
    *
    * Parameters:
    *  (XMLElement) el - A DOM element.
    *  (String) name - The element name.
    *
    * Returns:
    *  true if the element's tag name matches _el_, and false
    *  otherwise.
    */
  inline def isTagEqual(el: Element, name: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTagEqual")(el.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Function: log
    * User overrideable logging function.
    *
    * This function is called whenever the Strophe library calls any
    * of the logging functions. The default implementation of this
    * function does nothing. If client code wishes to handle the logging
    * messages, it should override this with
    * > Strophe.log = function (level, msg) {
    * >  (user code here)
    * > };
    *
    * Please note that data sent and received over the wire is logged
    * via Strophe.Connection.rawInput() and Strophe.Connection.rawOutput().
    *
    * The different levels and their meanings are
    *
    *  DEBUG - Messages useful for debugging purposes.
    *  INFO - Informational messages. This is mostly information like
    *   'disconnect was called' or 'SASL auth succeeded'.
    *  WARN - Warnings about potential problems. This is mostly used
    *   to report transient connection errors like request timeouts.
    *  ERROR - Some error occurred.
    *  FATAL - A non-recoverable fatal error occurred.
    *
    * Parameters:
    *  (Integer) level - The log level of the log message. This will
    *   be one of the values in Strophe.LogLevel.
    *  (String) msg - The log message.
    */
  inline def log(level: LogLevel, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("log")(level.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Function: $msg
    * Create a Strophe.Builder with a <message/> element as the root.
    *
    * Parmaeters:
    *  (Object) attrs - The <message/> element attributes in object notation.
    *
    * Returns:
    *  A new Strophe.Builder object.
    */
  inline def msg(): Builder = ^.asInstanceOf[js.Dynamic].applyDynamic("$msg")().asInstanceOf[Builder]
  inline def msg(attrs: Any): Builder = ^.asInstanceOf[js.Dynamic].applyDynamic("$msg")(attrs.asInstanceOf[js.Any]).asInstanceOf[Builder]
  
  /**
    * Function: $pres
    * Create a Strophe.Builder with a <presence/> element as the root.
    *
    * Parameters:
    *  (Object) attrs - The <presence/> element attributes in object notation.
    *
    * Returns:
    *  A new Strophe.Builder object.
    */
  inline def pres(): Builder = ^.asInstanceOf[js.Dynamic].applyDynamic("$pres")().asInstanceOf[Builder]
  inline def pres(attrs: Any): Builder = ^.asInstanceOf[js.Dynamic].applyDynamic("$pres")(attrs.asInstanceOf[js.Any]).asInstanceOf[Builder]
  
  /**
    * Function: serialize
    * Render a DOM element and all descendants to a String.
    *
    * Parameters:
    *  (XMLElement) elem - A DOM element.
    *
    * Returns:
    *  The serialized element tree as a String.
    */
  inline def serialize(elem: Element): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(elem.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def serialize(elem: Builder): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(elem.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Function: unescapeNode
    * Unescape a node part (also called local part) of a JID.
    *
    * Parameters:
    *  (String) node - A node (or local part).
    *
    * Returns:
    *  An unescaped node (or local part).
    */
  inline def unescapeNode(node: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unescapeNode")(node.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def warn(msg: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(msg.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Function: xmlElement
    * Create an XML DOM element.
    *
    * This function creates an XML DOM element correctly across all
    * implementations. Note that these are not HTML DOM elements, which
    * aren't appropriate for XMPP stanzas.
    *
    * Parameters:
    *  (String) name - The name for the element.
    *  (Array|Object) attrs - An optional array or object containing
    *   key/value pairs to use as element attributes. The object should
    *   be in the format {'key': 'value'} or {key: 'value'}. The array
    *   should have the format [['key1', 'value1'], ['key2', 'value2']].
    *  (String) text - The text child data for the element.
    *
    * Returns:
    *  A new XML DOM element.
    */
  inline def xmlElement(name: String): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("xmlElement")(name.asInstanceOf[js.Any]).asInstanceOf[Element]
  inline def xmlElement(name: String, attrs: Any): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("xmlElement")(name.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).asInstanceOf[Element]
  inline def xmlElement(name: String, attrs: Any, text: String): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("xmlElement")(name.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[Element]
  inline def xmlElement(name: String, attrs: Unit, text: String): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("xmlElement")(name.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[Element]
  inline def xmlElement(name: String, text: String): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("xmlElement")(name.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[Element]
  inline def xmlElement(name: String, text: String, attrs: Any): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("xmlElement")(name.asInstanceOf[js.Any], text.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).asInstanceOf[Element]
  inline def xmlElement(name: String, text: Unit, attrs: Any): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("xmlElement")(name.asInstanceOf[js.Any], text.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).asInstanceOf[Element]
  
  /**
    * Function: xmlGenerator
    * Get the DOM document to generate elements.
    *
    * Returns:
    *  The currently used DOM document.
    */
  inline def xmlGenerator(): Document = ^.asInstanceOf[js.Dynamic].applyDynamic("xmlGenerator")().asInstanceOf[Document]
  
  /**
    * Function: xmlHtmlNode
    * Creates an XML DOM html node.
    *
    * Parameters:
    *  (String) html - The content of the html node.
    *
    * Returns:
    *  A new XML DOM text node.
    */
  inline def xmlHtmlNode(html: String): Document = ^.asInstanceOf[js.Dynamic].applyDynamic("xmlHtmlNode")(html.asInstanceOf[js.Any]).asInstanceOf[Document]
  
  /**
    * Function: xmlTextNode
    * Creates an XML DOM text node.
    *
    * Provides a cross implementation version of document.createTextNode.
    *
    * Parameters:
    *  (String) text - The content of the text node.
    *
    * Returns:
    *  A new XML DOM text node.
    */
  inline def xmlTextNode(text: String): Text = ^.asInstanceOf[js.Dynamic].applyDynamic("xmlTextNode")(text.asInstanceOf[js.Any]).asInstanceOf[Text]
  
  /* Function: xmlescape
    * Excapes invalid xml characters.
    *
    * Parameters:
    *  (String) text - text to escape.
    *
    * Returns:
    *   Escaped text.
    */
  inline def xmlescape(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("xmlescape")(text.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* Function: xmlunescape
    * Unexcapes invalid xml characters.
    *
    * Parameters:
    *  (String) text - text to unescape.
    *
    * Returns:
    *   Unescaped text.
    */
  inline def xmlunescape(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("xmlunescape")(text.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait ConnectionOptions extends StObject {
    
    var keepalive: js.UndefOr[Boolean] = js.undefined
    
    var protocol: js.UndefOr[String] = js.undefined
    
    var sync: js.UndefOr[Boolean] = js.undefined
  }
  object ConnectionOptions {
    
    inline def apply(): ConnectionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectionOptions]
    }
    
    extension [Self <: ConnectionOptions](x: Self) {
      
      inline def setKeepalive(value: Boolean): Self = StObject.set(x, "keepalive", value.asInstanceOf[js.Any])
      
      inline def setKeepaliveUndefined: Self = StObject.set(x, "keepalive", js.undefined)
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      inline def setSync(value: Boolean): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
      
      inline def setSyncUndefined: Self = StObject.set(x, "sync", js.undefined)
    }
  }
  
  /**
    * Interface: Strophe.SASLMechanism
    *
    * encapsulates SASL authentication mechanisms.
    *
    * User code may override the priority for each mechanism or disable it completely.
    * See <priority> for information about changing priority and <test> for informatian on
    * how to disable a mechanism.
    *
    * By default, all mechanisms are enabled and the priorities are
    *
    * SCRAM-SHA1 - 40
    * DIGEST-MD5 - 30
    * Plain - 20
    */
  trait SASLMechanism extends StObject {
    
    /**
      * Variable: priority
      * Determines which <SASLMechanism> is chosen for authentication (Higher is better).
      * Users may override this to prioritize mechanisms differently.
      *
      * In the default configuration the priorities are
      *
      * SCRAM-SHA1 - 40
      * DIGEST-MD5 - 30
      * Plain - 20
      *
      * Example: (This will cause Strophe to choose the mechanism that the server sent first)
      *
      * > Strophe.SASLMD5.priority = Strophe.SASLSHA1.priority;
      *
      * See <SASL mechanisms> for a list of available mechanisms.
      *
      */
    var priority: Double
    
    /**
      * Function: test
      * Checks if mechanism able to run.
      * To disable a mechanism, make this return false;
      *
      * To disable plain authentication run
      * > Strophe.SASLPlain.test = function() {
      * >  return false;
      * > }
      *
      * See <SASL mechanisms> for a list of available mechanisms.
      *
      * Parameters:
      *  (Strophe.Connection) connection - Target Connection.
      *
      * Returns:
      *  (Boolean) If mechanism was able to run.
      */
    def test(connection: Connection): Boolean
  }
  object SASLMechanism {
    
    inline def apply(priority: Double, test: Connection => Boolean): SASLMechanism = {
      val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any], test = js.Any.fromFunction1(test))
      __obj.asInstanceOf[SASLMechanism]
    }
    
    extension [Self <: SASLMechanism](x: Self) {
      
      inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setTest(value: Connection => Boolean): Self = StObject.set(x, "test", js.Any.fromFunction1(value))
    }
  }
}
