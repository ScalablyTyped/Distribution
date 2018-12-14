package typings
package stropheLib.stropheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("strophe", "Strophe")
@js.native
object StropheNs extends js.Object {
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
  @js.native
  class Builder protected () extends js.Object {
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
    def this(name: java.lang.String) = this()
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
    def this(name: java.lang.String, attrs: js.Any) = this()
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
    def c(name: java.lang.String): Builder = js.native
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
    def c(name: java.lang.String, attrs: js.Any): Builder = js.native
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
    def c(name: java.lang.String, attrs: js.Any, text: java.lang.String): Builder = js.native
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
    def cnode(elem: stdLib.Node): Builder = js.native
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
    def h(html: java.lang.String): Builder = js.native
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
    def t(text: java.lang.String): Builder = js.native
    /** Function: tree
            *  Return the DOM tree.
            *
            *  This function returns the current DOM tree as an element object.  This
            *  is suitable for passing to functions like Strophe.Connection.send().
            *
            *  Returns:
            *    The DOM tree as a element object.
            */
    def tree(): stdLib.Element = js.native
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
    def this(service: java.lang.String) = this()
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
    def this(service: java.lang.String, options: ConnectionOptions) = this()
    var authcid: java.lang.String = js.native
    var authzid: java.lang.String = js.native
    var domain: java.lang.String = js.native
    var jid: java.lang.String = js.native
    var maxRetries: scala.Double = js.native
    var muc: stropheLib.mucMod.stropheMod.StropheNs.MUCNs.Plugin = js.native
    var pass: java.lang.String = js.native
    var servtype: java.lang.String = js.native
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
      handler: js.Function1[/* stanza */ stdLib.Element, scala.Boolean],
      ns: java.lang.String,
      name: java.lang.String
    ): js.Any = js.native
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
      handler: js.Function1[/* stanza */ stdLib.Element, scala.Boolean],
      ns: java.lang.String,
      name: java.lang.String,
      `type`: java.lang.String
    ): js.Any = js.native
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
      handler: js.Function1[/* stanza */ stdLib.Element, scala.Boolean],
      ns: java.lang.String,
      name: java.lang.String,
      `type`: java.lang.String,
      id: java.lang.String
    ): js.Any = js.native
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
      handler: js.Function1[/* stanza */ stdLib.Element, scala.Boolean],
      ns: java.lang.String,
      name: java.lang.String,
      `type`: java.lang.String,
      id: java.lang.String,
      from: java.lang.String
    ): js.Any = js.native
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
      handler: js.Function1[/* stanza */ stdLib.Element, scala.Boolean],
      ns: java.lang.String,
      name: java.lang.String,
      `type`: java.lang.String,
      id: java.lang.String,
      from: java.lang.String,
      options: stropheLib.Anon_MatchBare
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
    def addTimedHandler(period: scala.Double, handler: js.Function0[scala.Boolean]): js.Any = js.native
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
    def attach(jid: java.lang.String, sid: java.lang.String, rid: java.lang.String): scala.Unit = js.native
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
    def attach(
      jid: java.lang.String,
      sid: java.lang.String,
      rid: java.lang.String,
      callback: js.Function2[/* status */ Status, /* condition */ java.lang.String, _]
    ): scala.Unit = js.native
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
    def attach(
      jid: java.lang.String,
      sid: java.lang.String,
      rid: java.lang.String,
      callback: js.Function2[/* status */ Status, /* condition */ java.lang.String, _],
      wait: scala.Double
    ): scala.Unit = js.native
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
    def attach(
      jid: java.lang.String,
      sid: java.lang.String,
      rid: java.lang.String,
      callback: js.Function2[/* status */ Status, /* condition */ java.lang.String, _],
      wait: scala.Double,
      hold: scala.Double
    ): scala.Unit = js.native
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
    def attach(
      jid: java.lang.String,
      sid: java.lang.String,
      rid: java.lang.String,
      callback: js.Function2[/* status */ Status, /* condition */ java.lang.String, _],
      wait: scala.Double,
      hold: scala.Double,
      wind: scala.Double
    ): scala.Unit = js.native
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
      jid: js.UndefOr[java.lang.String],
      pass: js.UndefOr[java.lang.String],
      callback: js.UndefOr[js.Function2[/* status */ Status, /* condition */ java.lang.String, _]],
      wait: js.UndefOr[scala.Double],
      hold: js.UndefOr[scala.Double],
      route: js.UndefOr[java.lang.String]
    ): scala.Unit = js.native
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
    def deleteHandler(handRef: js.Any): scala.Unit = js.native
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
    def deleteTimedHandler(handRef: js.Any): scala.Unit = js.native
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
    def disconnect(reason: java.lang.String): scala.Unit = js.native
    /** Function: flush
             *  Immediately send any pending outgoing data.
             *
             *  Normally send() queues outgoing data until the next idle period
             *  (100ms), which optimizes network use in the common cases when
             *  several send()s are called in succession. flush() can be used to
             *  immediately send all pending data.
             */
    def flush(): scala.Unit = js.native
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
    def getUniqueId(): java.lang.String = js.native
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
    def getUniqueId(suffix: java.lang.String): java.lang.String = js.native
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
    def getUniqueId(suffix: scala.Double): java.lang.String = js.native
    /** Function: pause
             *  Pause the request manager.
             *
             *  This will prevent Strophe from sending any more requests to the
             *  server.  This is very useful for temporarily pausing
             *  BOSH-Connections while a lot of send() calls are happening quickly.
             *  This causes Strophe to send the data in a single request, saving
             *  many request trips.
             */
    def pause(): scala.Unit = js.native
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
    def rawInput(data: java.lang.String): scala.Unit = js.native
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
    def rawOutput(data: java.lang.String): scala.Unit = js.native
    /** Function: reset
             *  Reset the connection.
             *
             *  This function should be called after a connection is disconnected
             *  before that connection is reused.
             */
    def reset(): scala.Unit = js.native
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
    def restore(): scala.Unit = js.native
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
    def restore(jid: java.lang.String): scala.Unit = js.native
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
    def restore(
      jid: java.lang.String,
      callback: js.Function2[/* status */ Status, /* condition */ java.lang.String, _]
    ): scala.Unit = js.native
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
    def restore(
      jid: java.lang.String,
      callback: js.Function2[/* status */ Status, /* condition */ java.lang.String, _],
      wait: scala.Double
    ): scala.Unit = js.native
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
    def restore(
      jid: java.lang.String,
      callback: js.Function2[/* status */ Status, /* condition */ java.lang.String, _],
      wait: scala.Double,
      hold: scala.Double
    ): scala.Unit = js.native
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
    def restore(
      jid: java.lang.String,
      callback: js.Function2[/* status */ Status, /* condition */ java.lang.String, _],
      wait: scala.Double,
      hold: scala.Double,
      route: java.lang.String
    ): scala.Unit = js.native
    /** Function: resume
             *  Resume the request manager.
             *
             *  This resumes after pause() has been called.
             */
    def resume(): scala.Unit = js.native
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
    def send(elem: js.Array[stdLib.Element]): scala.Unit = js.native
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
    def send(elem: stdLib.Element): scala.Unit = js.native
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
    def send(elem: Builder): scala.Unit = js.native
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
    def sendIQ(elem: stdLib.Element): java.lang.String = js.native
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
    def sendIQ(elem: stdLib.Element, callback: js.Function1[/* stanza */ stdLib.Element, _]): java.lang.String = js.native
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
    def sendIQ(
      elem: stdLib.Element,
      callback: js.Function1[/* stanza */ stdLib.Element, _],
      errback: js.Function1[/* stanza */ stdLib.Element, _]
    ): java.lang.String = js.native
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
    def sendIQ(
      elem: stdLib.Element,
      callback: js.Function1[/* stanza */ stdLib.Element, _],
      errback: js.Function1[/* stanza */ stdLib.Element, _],
      timeout: scala.Double
    ): java.lang.String = js.native
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
    def sendIQ(elem: Builder): java.lang.String = js.native
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
    def sendIQ(elem: Builder, callback: js.Function1[/* stanza */ stdLib.Element, _]): java.lang.String = js.native
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
    def sendIQ(
      elem: Builder,
      callback: js.Function1[/* stanza */ stdLib.Element, _],
      errback: js.Function1[/* stanza */ stdLib.Element, _]
    ): java.lang.String = js.native
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
    def sendIQ(
      elem: Builder,
      callback: js.Function1[/* stanza */ stdLib.Element, _],
      errback: js.Function1[/* stanza */ stdLib.Element, _],
      timeout: scala.Double
    ): java.lang.String = js.native
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
    def xmlInput(elem: stdLib.Element): scala.Unit = js.native
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
    def xmlOutput(elem: stdLib.Element): scala.Unit = js.native
  }
  
  
  trait ConnectionOptions extends js.Object {
    var keepalive: js.UndefOr[scala.Boolean] = js.undefined
    var protocol: js.UndefOr[java.lang.String] = js.undefined
    var sync: js.UndefOr[scala.Boolean] = js.undefined
  }
  
  @js.native
  sealed trait LogLevel extends js.Object
  
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
  
  trait SASLMechanism extends js.Object {
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
    var priority: scala.Double
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
    def test(connection: Connection): scala.Boolean
  }
  
  @js.native
  sealed trait Status extends js.Object
  
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
  var NS: stropheLib.Anon_BOSH = js.native
  /** Constants: SASL mechanisms
       *  Available authentication mechanisms
       *
       *  Strophe.SASLAnonymous - SASL Anonymous authentication.
       *  Strophe.SASLPlain - SASL Plain authentication.
       *  Strophe.SASLMD5 - SASL Digest-MD5 authentication
       *  Strophe.SASLSHA1 - SASL SCRAM-SHA1 authentication
       */
  var SASLAnonymous: SASLMechanism = js.native
  var SASLMD5: SASLMechanism = js.native
  var SASLPlain: SASLMechanism = js.native
  var SASLSHA1: SASLMechanism = js.native
  /** Constant: VERSION
       *  The version of the Strophe library. Unreleased builds will have
       *  a version of head-HASH where HASH is a partial revision.
       */
  var VERSION: java.lang.String = js.native
  /** Function: addConnectionPlugin
       *  Extends the Strophe.Connection object with the given plugin.
       *
       *  Parameters:
       *    (String) name - The name of the extension.
       *    (Object) ptype - The plugin's prototype.
       */
  def addConnectionPlugin(name: java.lang.String, ptype: js.Any): scala.Unit = js.native
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
  def addNamespace(name: java.lang.String, value: java.lang.String): scala.Unit = js.native
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
  def copyElement(elem: stdLib.Element): stdLib.Element = js.native
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
  def createHtml(elem: stdLib.Element): stdLib.Element = js.native
  /** Functions: debug, info, warn, error
       *  Log a message at the appropriate Strophe.LogLevel
       *
       *  Parameters:
       *    (String) msg - The log message.
       */
  def debug(msg: java.lang.String): scala.Unit = js.native
  def error(msg: java.lang.String): scala.Unit = js.native
  /** Function: escapeNode
       *  Escape the node part (also called local part) of a JID.
       *
       *  Parameters:
       *    (String) node - A node (or local part).
       *
       *  Returns:
       *    An escaped node (or local part).
       */
  def escapeNode(node: java.lang.String): java.lang.String = js.native
  def fatal(msg: java.lang.String): scala.Unit = js.native
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
  def forEachChild(
    elem: stdLib.Element,
    elemName: java.lang.String,
    func: js.Function1[/* child */ stdLib.Element, _]
  ): scala.Unit = js.native
  /** Function: getBareJidFromJid
       *  Get the bare JID from a JID String.
       *
       *  Parameters:
       *    (String) jid - A JID.
       *
       *  Returns:
       *    A String containing the bare JID.
       */
  def getBareJidFromJid(jid: java.lang.String): java.lang.String = js.native
  /** Function: getDomainFromJid
       *  Get the domain portion of a JID String.
       *
       *  Parameters:
       *    (String) jid - A JID.
       *
       *  Returns:
       *    A String containing the domain.
       */
  def getDomainFromJid(jid: java.lang.String): java.lang.String = js.native
  /** Function: getNodeFromJid
       *  Get the node portion of a JID String.
       *
       *  Parameters:
       *    (String) jid - A JID.
       *
       *  Returns:
       *    A String containing the node.
       */
  def getNodeFromJid(jid: java.lang.String): java.lang.String = js.native
  /** Function: getResourceFromJid
       *  Get the resource portion of a JID String.
       *
       *  Parameters:
       *    (String) jid - A JID.
       *
       *  Returns:
       *    A String containing the resource.
       */
  def getResourceFromJid(jid: java.lang.String): java.lang.String = js.native
  /** Function: getText
           *  Get the concatenation of all text children of an element.
           *
           *  Parameters:
           *    (XMLElement) elem - A DOM element.
           *
           *  Returns:
           *    A String with the concatenated text of all text element children.
           */
  def getText(elem: stdLib.Element): java.lang.String = js.native
  def info(msg: java.lang.String): scala.Unit = js.native
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
  def isTagEqual(el: stdLib.Element, name: java.lang.String): scala.Boolean = js.native
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
  def log(level: LogLevel, msg: java.lang.String): scala.Unit = js.native
  /** Function: serialize
       *  Render a DOM element and all descendants to a String.
       *
       *  Parameters:
       *    (XMLElement) elem - A DOM element.
       *
       *  Returns:
       *    The serialized element tree as a String.
       */
  def serialize(elem: stdLib.Element): java.lang.String = js.native
  /** Function: serialize
       *  Render a DOM element and all descendants to a String.
       *
       *  Parameters:
       *    (XMLElement) elem - A DOM element.
       *
       *  Returns:
       *    The serialized element tree as a String.
       */
  def serialize(elem: Builder): java.lang.String = js.native
  /** Function: unescapeNode
       *  Unescape a node part (also called local part) of a JID.
       *
       *  Parameters:
       *    (String) node - A node (or local part).
       *
       *  Returns:
       *    An unescaped node (or local part).
       */
  def unescapeNode(node: java.lang.String): java.lang.String = js.native
  def warn(msg: java.lang.String): scala.Unit = js.native
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
  def xmlElement(name: java.lang.String): stdLib.Element = js.native
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
  def xmlElement(name: java.lang.String, attrs: js.Any): stdLib.Element = js.native
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
  def xmlElement(name: java.lang.String, attrs: js.Any, text: java.lang.String): stdLib.Element = js.native
  def xmlElement(name: java.lang.String, text: java.lang.String): stdLib.Element = js.native
  def xmlElement(name: java.lang.String, text: java.lang.String, attrs: js.Any): stdLib.Element = js.native
  /** Function: xmlGenerator
       *  Get the DOM document to generate elements.
       *
       *  Returns:
       *    The currently used DOM document.
       */
  def xmlGenerator(): stdLib.Document = js.native
  /** Function: xmlHtmlNode
       *  Creates an XML DOM html node.
       *
       *  Parameters:
       *    (String) html - The content of the html node.
       *
       *  Returns:
       *    A new XML DOM text node.
       */
  def xmlHtmlNode(html: java.lang.String): stdLib.Document = js.native
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
  def xmlTextNode(text: java.lang.String): stdLib.Text = js.native
  /*  Function: xmlescape
      *  Excapes invalid xml characters.
      *
      *  Parameters:
      *     (String) text - text to escape.
      *
      *  Returns:
      *      Escaped text.
      */
  def xmlescape(text: java.lang.String): java.lang.String = js.native
  /*  Function: xmlunescape
      *  Unexcapes invalid xml characters.
      *
      *  Parameters:
      *     (String) text - text to unescape.
      *
      *  Returns:
      *      Unescaped text.
      */
  def xmlunescape(text: java.lang.String): java.lang.String = js.native
  /** Constants: Log Level Constants
       *  Logging level indicators.
       *
       *  LogLevel.DEBUG - Debug output
       *  LogLevel.INFO - Informational output
       *  LogLevel.WARN - Warnings
       *  LogLevel.ERROR - Errors
       *  LogLevel.FATAL - Fatal errors
       */
  @js.native
  object LogLevel extends js.Object {
    @js.native
    sealed trait DEBUG
      extends stropheLib.stropheMod.StropheNs.LogLevel
    
    @js.native
    sealed trait ERROR
      extends stropheLib.stropheMod.StropheNs.LogLevel
    
    @js.native
    sealed trait FATAL
      extends stropheLib.stropheMod.StropheNs.LogLevel
    
    @js.native
    sealed trait INFO
      extends stropheLib.stropheMod.StropheNs.LogLevel
    
    @js.native
    sealed trait WARN
      extends stropheLib.stropheMod.StropheNs.LogLevel
    
    val DEBUG: DEBUG with java.lang.String = js.native
    val ERROR: ERROR with java.lang.String = js.native
    val FATAL: FATAL with java.lang.String = js.native
    val INFO: INFO with java.lang.String = js.native
    val WARN: WARN with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[stropheLib.stropheMod.StropheNs.LogLevel with java.lang.String] = js.native
  }
  
  @JSName("MUC")
  @js.native
  object MUCNs extends js.Object {
    @js.native
    trait Occupant
      extends stropheLib.mucMod.stropheMod.StropheNs.MUCNs.OccupantInfo {
      def admin(): java.lang.String = js.native
      def admin(reason: java.lang.String): java.lang.String = js.native
      def admin(reason: java.lang.String, success_cb: js.Function): java.lang.String = js.native
      def admin(reason: java.lang.String, success_cb: js.Function, error_cb: js.Function): java.lang.String = js.native
      def ban(): java.lang.String = js.native
      def ban(reason: java.lang.String): java.lang.String = js.native
      def ban(reason: java.lang.String, success_cb: js.Function): java.lang.String = js.native
      def ban(reason: java.lang.String, success_cb: js.Function, error_cb: js.Function): java.lang.String = js.native
      def deop(): java.lang.String = js.native
      def deop(reason: java.lang.String): java.lang.String = js.native
      def deop(reason: java.lang.String, handler_cb: js.Function): java.lang.String = js.native
      def deop(reason: java.lang.String, handler_cb: js.Function, error_cb: js.Function): java.lang.String = js.native
      def kick(): java.lang.String = js.native
      def kick(reason: java.lang.String): java.lang.String = js.native
      def kick(reason: java.lang.String, handler_cb: js.Function): java.lang.String = js.native
      def kick(reason: java.lang.String, handler_cb: js.Function, error_cb: js.Function): java.lang.String = js.native
      def member(): java.lang.String = js.native
      def member(reason: java.lang.String): java.lang.String = js.native
      def member(reason: java.lang.String, success_cb: js.Function): java.lang.String = js.native
      def member(reason: java.lang.String, success_cb: js.Function, error_cb: js.Function): java.lang.String = js.native
      def modifyAffiliation(affiliation: java.lang.String): java.lang.String = js.native
      def modifyAffiliation(affiliation: java.lang.String, reason: java.lang.String): java.lang.String = js.native
      def modifyAffiliation(affiliation: java.lang.String, reason: java.lang.String, success_cb: js.Function): java.lang.String = js.native
      def modifyAffiliation(
        affiliation: java.lang.String,
        reason: java.lang.String,
        success_cb: js.Function,
        error_cb: js.Function
      ): java.lang.String = js.native
      def modifyRole(role: java.lang.String): java.lang.String = js.native
      def modifyRole(role: java.lang.String, reason: java.lang.String): java.lang.String = js.native
      def modifyRole(role: java.lang.String, reason: java.lang.String, success_cb: js.Function): java.lang.String = js.native
      def modifyRole(role: java.lang.String, reason: java.lang.String, success_cb: js.Function, error_cb: js.Function): java.lang.String = js.native
      def mute(): java.lang.String = js.native
      def mute(reason: java.lang.String): java.lang.String = js.native
      def mute(reason: java.lang.String, handler_cb: js.Function): java.lang.String = js.native
      def mute(reason: java.lang.String, handler_cb: js.Function, error_cb: js.Function): java.lang.String = js.native
      def op(): java.lang.String = js.native
      def op(reason: java.lang.String): java.lang.String = js.native
      def op(reason: java.lang.String, handler_cb: js.Function): java.lang.String = js.native
      def op(reason: java.lang.String, handler_cb: js.Function, error_cb: js.Function): java.lang.String = js.native
      def owner(): java.lang.String = js.native
      def owner(reason: java.lang.String): java.lang.String = js.native
      def owner(reason: java.lang.String, success_cb: js.Function): java.lang.String = js.native
      def owner(reason: java.lang.String, success_cb: js.Function, error_cb: js.Function): java.lang.String = js.native
      def revoke(): java.lang.String = js.native
      def revoke(reason: java.lang.String): java.lang.String = js.native
      def revoke(reason: java.lang.String, success_cb: js.Function): java.lang.String = js.native
      def revoke(reason: java.lang.String, success_cb: js.Function, error_cb: js.Function): java.lang.String = js.native
      def update(data: stropheLib.mucMod.stropheMod.StropheNs.MUCNs.OccupantInfo): scala.Unit = js.native
      def voice(): java.lang.String = js.native
      def voice(reason: java.lang.String): java.lang.String = js.native
      def voice(reason: java.lang.String, handler_cb: js.Function): java.lang.String = js.native
      def voice(reason: java.lang.String, handler_cb: js.Function, error_cb: js.Function): java.lang.String = js.native
    }
    
    
    trait OccupantInfo extends js.Object {
      var affiliation: js.UndefOr[java.lang.String] = js.undefined
      var jid: js.UndefOr[java.lang.String] = js.undefined
      var nick: js.UndefOr[java.lang.String] = js.undefined
      var role: js.UndefOr[java.lang.String] = js.undefined
      var show: js.UndefOr[java.lang.String] = js.undefined
      var status: js.UndefOr[java.lang.String] = js.undefined
    }
    
    
    trait OccupantMap
      extends /* jid */ org.scalablytyped.runtime.StringDictionary[stropheLib.mucMod.stropheMod.StropheNs.MUCNs.Occupant]
    
    @js.native
    trait Plugin extends js.Object {
      /**
               * Ban a user.
               *
               * @param room - The multi-user chat room name.
               * @param jid  - The jid of the user to modify.
               * @param reason - Optional reason for the change.
               * @param handler_cb - Optional callback for success
               * @param error_cb - Optional callback for error
               * @return iq - the id of the mode change request.
               */
      def ban(room: java.lang.String, jid: java.lang.String): java.lang.String = js.native
      /**
               * Ban a user.
               *
               * @param room - The multi-user chat room name.
               * @param jid  - The jid of the user to modify.
               * @param reason - Optional reason for the change.
               * @param handler_cb - Optional callback for success
               * @param error_cb - Optional callback for error
               * @return iq - the id of the mode change request.
               */
      def ban(room: java.lang.String, jid: java.lang.String, reason: java.lang.String): java.lang.String = js.native
      /**
               * Ban a user.
               *
               * @param room - The multi-user chat room name.
               * @param jid  - The jid of the user to modify.
               * @param reason - Optional reason for the change.
               * @param handler_cb - Optional callback for success
               * @param error_cb - Optional callback for error
               * @return iq - the id of the mode change request.
               */
      def ban(room: java.lang.String, jid: java.lang.String, reason: java.lang.String, handler_cb: js.Function): java.lang.String = js.native
      /**
               * Ban a user.
               *
               * @param room - The multi-user chat room name.
               * @param jid  - The jid of the user to modify.
               * @param reason - Optional reason for the change.
               * @param handler_cb - Optional callback for success
               * @param error_cb - Optional callback for error
               * @return iq - the id of the mode change request.
               */
      def ban(
        room: java.lang.String,
        jid: java.lang.String,
        reason: java.lang.String,
        handler_cb: js.Function,
        error_cb: js.Function
      ): java.lang.String = js.native
      /**
               * Cancel the room configuration
               *
               * @param room - The multi-user chat room name.
               * @return id - the unique id used to cancel the configuration.
               */
      def cancelConfigure(room: java.lang.String): java.lang.String = js.native
      /**
               * Change the current users nick name.
               *
               * @param room - The multi-user chat room name.
               * @param user - The new nick name.
               */
      def changeNick(room: java.lang.String, user: java.lang.String): scala.Unit = js.native
      /**
               * Start a room configuration.
               *
               * @param room - The multi-user chat room name.
               * @param handler_cb - Optional function to handle the config form.
               * @param error_cb - Optional function to handle an error.
               * @return id - the unique id used to send the configuration request
               */
      def configure(room: java.lang.String): java.lang.String = js.native
      /**
               * Start a room configuration.
               *
               * @param room - The multi-user chat room name.
               * @param handler_cb - Optional function to handle the config form.
               * @param error_cb - Optional function to handle an error.
               * @return id - the unique id used to send the configuration request
               */
      def configure(room: java.lang.String, handler_cb: js.Function): java.lang.String = js.native
      /**
               * Start a room configuration.
               *
               * @param room - The multi-user chat room name.
               * @param handler_cb - Optional function to handle the config form.
               * @param error_cb - Optional function to handle an error.
               * @return id - the unique id used to send the configuration request
               */
      def configure(room: java.lang.String, handler_cb: js.Function, error_cb: js.Function): java.lang.String = js.native
      /**
               * Create a configured room.
               *
               * @param room - The multi-user chat room name.
               * @param config - the configuration. ex: {"muc#roomconfig_publicroom": "0", "muc#roomconfig_persistentroom": "1"}
               * @param success_db - Optional function to handle success.
               * @param error_cb - Optional function to handle an error.
               * @return id - the unique id used to create the chat room.
               */
      def createConfiguredRoom(room: java.lang.String, config: js.Any, success_cb: js.Function, error_cb: js.Function): java.lang.String = js.native
      /**
               * Create an instance room.
               *
               * @param room - The multi-user chat room name.
               * @param success_db - Optional function to handle success.
               * @param error_cb - Optional function to handle an error.
               * @return id - the unique id used to create the chat room.
               */
      def createInstantRoom(room: java.lang.String): java.lang.String = js.native
      /**
               * Create an instance room.
               *
               * @param room - The multi-user chat room name.
               * @param success_db - Optional function to handle success.
               * @param error_cb - Optional function to handle an error.
               * @return id - the unique id used to create the chat room.
               */
      def createInstantRoom(room: java.lang.String, success_cb: js.Function): java.lang.String = js.native
      /**
               * Create an instance room.
               *
               * @param room - The multi-user chat room name.
               * @param success_db - Optional function to handle success.
               * @param error_cb - Optional function to handle an error.
               * @return id - the unique id used to create the chat room.
               */
      def createInstantRoom(room: java.lang.String, success_cb: js.Function, error_cb: js.Function): java.lang.String = js.native
      /**
               * De-Op a user.
               *
               * @param room - The multi-user chat room name.
               * @param nick - The nick name of the user to modify.
               * @param reason - Optional reason for the change.
               * @param handler_cb - Optional callback for success
               * @param error_cb - Optional callback for error
               * @return iq - the id of the mode change request.
               */
      def deop(room: java.lang.String, nick: java.lang.String): java.lang.String = js.native
      /**
               * De-Op a user.
               *
               * @param room - The multi-user chat room name.
               * @param nick - The nick name of the user to modify.
               * @param reason - Optional reason for the change.
               * @param handler_cb - Optional callback for success
               * @param error_cb - Optional callback for error
               * @return iq - the id of the mode change request.
               */
      def deop(room: java.lang.String, nick: java.lang.String, reason: java.lang.String): java.lang.String = js.native
      /**
               * De-Op a user.
               *
               * @param room - The multi-user chat room name.
               * @param nick - The nick name of the user to modify.
               * @param reason - Optional reason for the change.
               * @param handler_cb - Optional callback for success
               * @param error_cb - Optional callback for error
               * @return iq - the id of the mode change request.
               */
      def deop(room: java.lang.String, nick: java.lang.String, reason: java.lang.String, handler_cb: js.Function): java.lang.String = js.native
      /**
               * De-Op a user.
               *
               * @param room - The multi-user chat room name.
               * @param nick - The nick name of the user to modify.
               * @param reason - Optional reason for the change.
               * @param handler_cb - Optional callback for success
               * @param error_cb - Optional callback for error
               * @return iq - the id of the mode change request.
               */
      def deop(
        room: java.lang.String,
        nick: java.lang.String,
        reason: java.lang.String,
        handler_cb: js.Function,
        error_cb: js.Function
      ): java.lang.String = js.native
      /**
               * Send a direct invitation.
               *
               * @param room - The multi-user chat room name.
               * @param receiver - The invitation's receiver.
               * @param reason - Optional reason for joining the room.
               * @param password - Optional password for the room.
               * @return msgiq - the unique id used to send the invitation
               */
      def directInvite(room: java.lang.String, receiver: java.lang.String): java.lang.String = js.native
      /**
               * Send a direct invitation.
               *
               * @param room - The multi-user chat room name.
               * @param receiver - The invitation's receiver.
               * @param reason - Optional reason for joining the room.
               * @param password - Optional password for the room.
               * @return msgiq - the unique id used to send the invitation
               */
      def directInvite(room: java.lang.String, receiver: java.lang.String, reason: java.lang.String): java.lang.String = js.native
      /**
               * Send a direct invitation.
               *
               * @param room - The multi-user chat room name.
               * @param receiver - The invitation's receiver.
               * @param reason - Optional reason for joining the room.
               * @param password - Optional password for the room.
               * @return msgiq - the unique id used to send the invitation
               */
      def directInvite(
        room: java.lang.String,
        receiver: java.lang.String,
        reason: java.lang.String,
        password: java.lang.String
      ): java.lang.String = js.native
      /**
               * Convenience Function to send a Message to all Occupants
               *
               * @param room - The multi-user chat room name.
               * @param message - The plaintext message to send to the room.
               * @param html_message - Optional message to send to the room with html markup.
               * @param msgid - Optional unique ID which will be set as the 'id' attribute of the stanza
               * @return msgiq - the unique id used to send the message
               */
      def groupchat(room: java.lang.String, message: java.lang.String): java.lang.String = js.native
      /**
               * Convenience Function to send a Message to all Occupants
               *
               * @param room - The multi-user chat room name.
               * @param message - The plaintext message to send to the room.
               * @param html_message - Optional message to send to the room with html markup.
               * @param msgid - Optional unique ID which will be set as the 'id' attribute of the stanza
               * @return msgiq - the unique id used to send the message
               */
      def groupchat(room: java.lang.String, message: java.lang.String, html_message: java.lang.String): java.lang.String = js.native
      /**
               * Convenience Function to send a Message to all Occupants
               *
               * @param room - The multi-user chat room name.
               * @param message - The plaintext message to send to the room.
               * @param html_message - Optional message to send to the room with html markup.
               * @param msgid - Optional unique ID which will be set as the 'id' attribute of the stanza
               * @return msgiq - the unique id used to send the message
               */
      def groupchat(
        room: java.lang.String,
        message: java.lang.String,
        html_message: java.lang.String,
        msgid: java.lang.String
      ): java.lang.String = js.native
      /**
               * Initialize the MUC plugin. Sets the correct connection object and
               * extends the namesace.
               *
               * @param conn - the connection instance.
               */
      def init(conn: stropheLib.mucMod.stropheMod.StropheNs.Connection): scala.Unit = js.native
      /**
               * Send a mediated invitation.
               *
               * @param room - The multi-user chat room name.
               * @param receiver - The invitation's receiver.
               * @param reason - Optional reason for joining the room.
               * @return msgiq - the unique id used to send the invitation
               */
      def invite(room: java.lang.String, receiver: java.lang.String): java.lang.String = js.native
      /**
               * Send a mediated invitation.
               *
               * @param room - The multi-user chat room name.
               * @param receiver - The invitation's receiver.
               * @param reason - Optional reason for joining the room.
               * @return msgiq - the unique id used to send the invitation
               */
      def invite(room: java.lang.String, receiver: java.lang.String, reason: java.lang.String): java.lang.String = js.native
      /**
               * Join a multi-user chat room
               *
               * @param room - The multi-user chat room to join.
               * @param nick - The nickname to use in the chat room. Optional
               * @param msg_handler_cb - The function call to handle messages from the specified chat room.
               * @param pres_handler_cb - The function call back to handle presence in the chat room.
               * @param roster_cb - The function call to handle roster info in the chat room
               * @param password - The optional password to use. (password protected rooms only)
               * @param history_attrs - Optional attributes for retrieving history
               * @param extended_presence - Optional XML for extending presence
               */
      def join(
        room: java.lang.String,
        nick: java.lang.String,
        msg_handler_cb: js.Function2[
              /* stanza */ stdLib.Element, 
              /* room */ stropheLib.mucMod.stropheMod.StropheNs.MUCNs.XmppRoom, 
              scala.Boolean
            ],
        pres_handler_cb: js.Function2[
              /* stanza */ stdLib.Element, 
              /* room */ stropheLib.mucMod.stropheMod.StropheNs.MUCNs.XmppRoom, 
              scala.Boolean
            ],
        roster_cb: js.Function2[
              /* occupants */ stropheLib.mucMod.stropheMod.StropheNs.MUCNs.OccupantMap, 
              /* room */ stropheLib.mucMod.stropheMod.StropheNs.MUCNs.XmppRoom, 
              scala.Boolean
            ]
      ): scala.Unit = js.native
      /**
               * Join a multi-user chat room
               *
               * @param room - The multi-user chat room to join.
               * @param nick - The nickname to use in the chat room. Optional
               * @param msg_handler_cb - The function call to handle messages from the specified chat room.
               * @param pres_handler_cb - The function call back to handle presence in the chat room.
               * @param roster_cb - The function call to handle roster info in the chat room
               * @param password - The optional password to use. (password protected rooms only)
               * @param history_attrs - Optional attributes for retrieving history
               * @param extended_presence - Optional XML for extending presence
               */
      def join(
        room: java.lang.String,
        nick: java.lang.String,
        msg_handler_cb: js.Function2[
              /* stanza */ stdLib.Element, 
              /* room */ stropheLib.mucMod.stropheMod.StropheNs.MUCNs.XmppRoom, 
              scala.Boolean
            ],
        pres_handler_cb: js.Function2[
              /* stanza */ stdLib.Element, 
              /* room */ stropheLib.mucMod.stropheMod.StropheNs.MUCNs.XmppRoom, 
              scala.Boolean
            ],
        roster_cb: js.Function2[
              /* occupants */ stropheLib.mucMod.stropheMod.StropheNs.MUCNs.OccupantMap, 
              /* room */ stropheLib.mucMod.stropheMod.StropheNs.MUCNs.XmppRoom, 
              scala.Boolean
            ],
        password: java.lang.String
      ): scala.Unit = js.native
      /**
               * Join a multi-user chat room
               *
               * @param room - The multi-user chat room to join.
               * @param nick - The nickname to use in the chat room. Optional
               * @param msg_handler_cb - The function call to handle messages from the specified chat room.
               * @param pres_handler_cb - The function call back to handle presence in the chat room.
               * @param roster_cb - The function call to handle roster info in the chat room
               * @param password - The optional password to use. (password protected rooms only)
               * @param history_attrs - Optional attributes for retrieving history
               * @param extended_presence - Optional XML for extending presence
               */
      def join(
        room: java.lang.String,
        nick: java.lang.String,
        msg_handler_cb: js.Function2[
              /* stanza */ stdLib.Element, 
              /* room */ stropheLib.mucMod.stropheMod.StropheNs.MUCNs.XmppRoom, 
              scala.Boolean
            ],
        pres_handler_cb: js.Function2[
              /* stanza */ stdLib.Element, 
              /* room */ stropheLib.mucMod.stropheMod.StropheNs.MUCNs.XmppRoom, 
              scala.Boolean
            ],
        roster_cb: js.Function2[
              /* occupants */ stropheLib.mucMod.stropheMod.StropheNs.MUCNs.OccupantMap, 
              /* room */ stropheLib.mucMod.stropheMod.StropheNs.MUCNs.XmppRoom, 
              scala.Boolean
            ],
        password: java.lang.String,
        history_attrs: js.Any
      ): scala.Unit = js.native
      /**
               * Join a multi-user chat room
               *
               * @param room - The multi-user chat room to join.
               * @param nick - The nickname to use in the chat room. Optional
               * @param msg_handler_cb - The function call to handle messages from the specified chat room.
               * @param pres_handler_cb - The function call back to handle presence in the chat room.
               * @param roster_cb - The function call to handle roster info in the chat room
               * @param password - The optional password to use. (password protected rooms only)
               * @param history_attrs - Optional attributes for retrieving history
               * @param extended_presence - Optional XML for extending presence
               */
      def join(
        room: java.lang.String,
        nick: java.lang.String,
        msg_handler_cb: js.Function2[
              /* stanza */ stdLib.Element, 
              /* room */ stropheLib.mucMod.stropheMod.StropheNs.MUCNs.XmppRoom, 
              scala.Boolean
            ],
        pres_handler_cb: js.Function2[
              /* stanza */ stdLib.Element, 
              /* room */ stropheLib.mucMod.stropheMod.StropheNs.MUCNs.XmppRoom, 
              scala.Boolean
            ],
        roster_cb: js.Function2[
              /* occupants */ stropheLib.mucMod.stropheMod.StropheNs.MUCNs.OccupantMap, 
              /* room */ stropheLib.mucMod.stropheMod.StropheNs.MUCNs.XmppRoom, 
              scala.Boolean
            ],
        password: java.lang.String,
        history_attrs: js.Any,
        extended_presence: stdLib.Element
      ): scala.Unit = js.native
      /**
               * Kick a user.
               *
               * @param room - The multi-user chat room name.
               * @param nick - The nick name of the user to modify.
               * @param reason - Optional reason for the change.
               * @param handler_cb - Optional callback for success
               * @param error_cb - Optional callback for error
               * @return iq - the id of the mode change request.
               */
      def kick(room: java.lang.String, nick: java.lang.String): java.lang.String = js.native
      /**
               * Kick a user.
               *
               * @param room - The multi-user chat room name.
               * @param nick - The nick name of the user to modify.
               * @param reason - Optional reason for the change.
               * @param handler_cb - Optional callback for success
               * @param error_cb - Optional callback for error
               * @return iq - the id of the mode change request.
               */
      def kick(room: java.lang.String, nick: java.lang.String, reason: java.lang.String): java.lang.String = js.native
      /**
               * Kick a user.
               *
               * @param room - The multi-user chat room name.
               * @param nick - The nick name of the user to modify.
               * @param reason - Optional reason for the change.
               * @param handler_cb - Optional callback for success
               * @param error_cb - Optional callback for error
               * @return iq - the id of the mode change request.
               */
      def kick(room: java.lang.String, nick: java.lang.String, reason: java.lang.String, handler_cb: js.Function): java.lang.String = js.native
      /**
               * Kick a user.
               *
               * @param room - The multi-user chat room name.
               * @param nick - The nick name of the user to modify.
               * @param reason - Optional reason for the change.
               * @param handler_cb - Optional callback for success
               * @param error_cb - Optional callback for error
               * @return iq - the id of the mode change request.
               */
      def kick(
        room: java.lang.String,
        nick: java.lang.String,
        reason: java.lang.String,
        handler_cb: js.Function,
        error_cb: js.Function
      ): java.lang.String = js.native
      /**
               * Leave a multi-user chat room
               *
               * @param room - The multi-user chat room to leave.
               * @param nick - The nick name used in the room.
               * @param handler_cb - Optional function to handle the successful leave.
               * @param exit_msg - optional exit message.
               * @return iqid - The unique id for the room leave.*
               */
      def leave(room: java.lang.String, nick: java.lang.String): java.lang.String = js.native
      /**
               * Leave a multi-user chat room
               *
               * @param room - The multi-user chat room to leave.
               * @param nick - The nick name used in the room.
               * @param handler_cb - Optional function to handle the successful leave.
               * @param exit_msg - optional exit message.
               * @return iqid - The unique id for the room leave.*
               */
      def leave(room: java.lang.String, nick: java.lang.String, handler_cb: js.Function): java.lang.String = js.native
      /**
               * Leave a multi-user chat room
               *
               * @param room - The multi-user chat room to leave.
               * @param nick - The nick name used in the room.
               * @param handler_cb - Optional function to handle the successful leave.
               * @param exit_msg - optional exit message.
               * @return iqid - The unique id for the room leave.*
               */
      def leave(
        room: java.lang.String,
        nick: java.lang.String,
        handler_cb: js.Function,
        exit_msg: java.lang.String
      ): java.lang.String = js.native
      /**
               * List all chat room available on a server.
               *
               * @param server - name of chat server.
               * @param handle_cb - Function to call for room list return.
               * @param error_cb - Function to call on error.
               */
      def listRooms(
        server: java.lang.String,
        handle_cb: js.Function1[/* stanza */ stdLib.Element, _],
        error_cb: js.Function1[/* error */ js.Any, _]
      ): scala.Unit = js.native
      /**
               * Member a user.
               *
               * @param room - The multi-user chat room name.
               * @param jid  - The jid of the user to modify.
               * @param reason - Optional reason for the change.
               * @param handler_cb - Optional callback for success
               * @param error_cb - Optional callback for error
               * @return iq - the id of the mode change request.
               */
      def member(room: java.lang.String, jid: java.lang.String): java.lang.String = js.native
      /**
               * Member a user.
               *
               * @param room - The multi-user chat room name.
               * @param jid  - The jid of the user to modify.
               * @param reason - Optional reason for the change.
               * @param handler_cb - Optional callback for success
               * @param error_cb - Optional callback for error
               * @return iq - the id of the mode change request.
               */
      def member(room: java.lang.String, jid: java.lang.String, reason: java.lang.String): java.lang.String = js.native
      /**
               * Member a user.
               *
               * @param room - The multi-user chat room name.
               * @param jid  - The jid of the user to modify.
               * @param reason - Optional reason for the change.
               * @param handler_cb - Optional callback for success
               * @param error_cb - Optional callback for error
               * @return iq - the id of the mode change request.
               */
      def member(room: java.lang.String, jid: java.lang.String, reason: java.lang.String, handler_cb: js.Function): java.lang.String = js.native
      /**
               * Member a user.
               *
               * @param room - The multi-user chat room name.
               * @param jid  - The jid of the user to modify.
               * @param reason - Optional reason for the change.
               * @param handler_cb - Optional callback for success
               * @param error_cb - Optional callback for error
               * @return iq - the id of the mode change request.
               */
      def member(
        room: java.lang.String,
        jid: java.lang.String,
        reason: java.lang.String,
        handler_cb: js.Function,
        error_cb: js.Function
      ): java.lang.String = js.native
      /**
               * Send a message to a room.
               *
               * @param) room - The multi-user chat room name.
               * @param nick - The nick name used in the chat room.
               * @param message - The plaintext message to send to the room.
               * @param html_message - The message to send to the room with html markup.
               * @param type - "groupchat" for group chat messages o "chat" for private chat messages
               * @return msgiq - the unique id used to send the message
               */
      @JSName("message")
      def message_chat(
        room: java.lang.String,
        nick: java.lang.String,
        message: java.lang.String,
        html_message: java.lang.String,
        `type`: stropheLib.stropheLibStrings.chat
      ): java.lang.String = js.native
      /**
               * Send a message to a room.
               *
               * @param) room - The multi-user chat room name.
               * @param nick - The nick name used in the chat room.
               * @param message - The plaintext message to send to the room.
               * @param html_message - The message to send to the room with html markup.
               * @param type - "groupchat" for group chat messages o "chat" for private chat messages
               * @return msgiq - the unique id used to send the message
               */
      @JSName("message")
      def message_groupchat(
        room: java.lang.String,
        nick: java.lang.String,
        message: java.lang.String,
        html_message: java.lang.String,
        `type`: stropheLib.stropheLibStrings.groupchat
      ): java.lang.String = js.native
      /**
               * Changes the affiliation of a member of a MUC room.
               * The modification can only be done by a room moderator. An error will be
               * returned if the user doesn't have permission.
               * Parameters:
               * @param room - The multi-user chat room name.
               * @param jid  - The jid of the user to modify.
               * @param affiliation - The new affiliation of the user.
               * @param reason - Optional reason for the change.
               * @param handler_cb - Optional callback for success
               * @param error_cb - Optional callback for error
               * @return iq - the id of the mode change request.
               */
      def modifyAffiliation(room: java.lang.String, jid: java.lang.String, affiliation: java.lang.String): java.lang.String = js.native
      /**
               * Changes the affiliation of a member of a MUC room.
               * The modification can only be done by a room moderator. An error will be
               * returned if the user doesn't have permission.
               * Parameters:
               * @param room - The multi-user chat room name.
               * @param jid  - The jid of the user to modify.
               * @param affiliation - The new affiliation of the user.
               * @param reason - Optional reason for the change.
               * @param handler_cb - Optional callback for success
               * @param error_cb - Optional callback for error
               * @return iq - the id of the mode change request.
               */
      def modifyAffiliation(
        room: java.lang.String,
        jid: java.lang.String,
        affiliation: java.lang.String,
        reason: java.lang.String
      ): java.lang.String = js.native
      /**
               * Changes the affiliation of a member of a MUC room.
               * The modification can only be done by a room moderator. An error will be
               * returned if the user doesn't have permission.
               * Parameters:
               * @param room - The multi-user chat room name.
               * @param jid  - The jid of the user to modify.
               * @param affiliation - The new affiliation of the user.
               * @param reason - Optional reason for the change.
               * @param handler_cb - Optional callback for success
               * @param error_cb - Optional callback for error
               * @return iq - the id of the mode change request.
               */
      def modifyAffiliation(
        room: java.lang.String,
        jid: java.lang.String,
        affiliation: java.lang.String,
        reason: java.lang.String,
        handler_cb: js.Function
      ): java.lang.String = js.native
      /**
               * Changes the affiliation of a member of a MUC room.
               * The modification can only be done by a room moderator. An error will be
               * returned if the user doesn't have permission.
               * Parameters:
               * @param room - The multi-user chat room name.
               * @param jid  - The jid of the user to modify.
               * @param affiliation - The new affiliation of the user.
               * @param reason - Optional reason for the change.
               * @param handler_cb - Optional callback for success
               * @param error_cb - Optional callback for error
               * @return iq - the id of the mode change request.
               */
      def modifyAffiliation(
        room: java.lang.String,
        jid: java.lang.String,
        affiliation: java.lang.String,
        reason: java.lang.String,
        handler_cb: js.Function,
        error_cb: js.Function
      ): java.lang.String = js.native
      /**
               * Changes the role of a member of a MUC room.
               * The modification can only be done by a room moderator. An error will be
               * returned if the user doesn't have permission.
               *
               * @param room - The multi-user chat room name.
               * @param nick - The nick name of the user to modify.
               * @param role - The new role of the user.
               * @param reason - Optional reason for the change.
               * @param handler_cb - Optional callback for success
               * @param error_cb - Optional callback for error
               * @return iq - the id of the mode change request.
               */
      def modifyRole(room: java.lang.String, nick: java.lang.String, role: java.lang.String): java.lang.String = js.native
      /**
               * Changes the role of a member of a MUC room.
               * The modification can only be done by a room moderator. An error will be
               * returned if the user doesn't have permission.
               *
               * @param room - The multi-user chat room name.
               * @param nick - The nick name of the user to modify.
               * @param role - The new role of the user.
               * @param reason - Optional reason for the change.
               * @param handler_cb - Optional callback for success
               * @param error_cb - Optional callback for error
               * @return iq - the id of the mode change request.
               */
      def modifyRole(room: java.lang.String, nick: java.lang.String, role: java.lang.String, reason: java.lang.String): java.lang.String = js.native
      /**
               * Changes the role of a member of a MUC room.
               * The modification can only be done by a room moderator. An error will be
               * returned if the user doesn't have permission.
               *
               * @param room - The multi-user chat room name.
               * @param nick - The nick name of the user to modify.
               * @param role - The new role of the user.
               * @param reason - Optional reason for the change.
               * @param handler_cb - Optional callback for success
               * @param error_cb - Optional callback for error
               * @return iq - the id of the mode change request.
               */
      def modifyRole(
        room: java.lang.String,
        nick: java.lang.String,
        role: java.lang.String,
        reason: java.lang.String,
        handler_cb: js.Function
      ): java.lang.String = js.native
      /**
               * Changes the role of a member of a MUC room.
               * The modification can only be done by a room moderator. An error will be
               * returned if the user doesn't have permission.
               *
               * @param room - The multi-user chat room name.
               * @param nick - The nick name of the user to modify.
               * @param role - The new role of the user.
               * @param reason - Optional reason for the change.
               * @param handler_cb - Optional callback for success
               * @param error_cb - Optional callback for error
               * @return iq - the id of the mode change request.
               */
      def modifyRole(
        room: java.lang.String,
        nick: java.lang.String,
        role: java.lang.String,
        reason: java.lang.String,
        handler_cb: js.Function,
        error_cb: js.Function
      ): java.lang.String = js.native
      /**
               * Send a mediated multiple invitation.
               *
               * @param room - The multi-user chat room name.
               * @param receivers - The invitation's receivers.
               * @param reason - Optional reason for joining the room.
               * @return msgiq - the unique id used to send the invitation
               */
      def multipleInvites(room: java.lang.String, receivers: js.Array[java.lang.String]): java.lang.String = js.native
      /**
               * Send a mediated multiple invitation.
               *
               * @param room - The multi-user chat room name.
               * @param receivers - The invitation's receivers.
               * @param reason - Optional reason for joining the room.
               * @return msgiq - the unique id used to send the invitation
               */
      def multipleInvites(room: java.lang.String, receivers: js.Array[java.lang.String], reason: java.lang.String): java.lang.String = js.native
      /**
               * Mute a user.
               *
               * @param room - The multi-user chat room name.
               * @param nick - The nick name of the user to modify.
               * @param reason - Optional reason for the change.
               * @param handler_cb - Optional callback for success
               * @param error_cb - Optional callback for error
               * @return iq - the id of the mode change request.
               */
      def mute(room: java.lang.String, nick: java.lang.String): java.lang.String = js.native
      /**
               * Mute a user.
               *
               * @param room - The multi-user chat room name.
               * @param nick - The nick name of the user to modify.
               * @param reason - Optional reason for the change.
               * @param handler_cb - Optional callback for success
               * @param error_cb - Optional callback for error
               * @return iq - the id of the mode change request.
               */
      def mute(room: java.lang.String, nick: java.lang.String, reason: java.lang.String): java.lang.String = js.native
      /**
               * Mute a user.
               *
               * @param room - The multi-user chat room name.
               * @param nick - The nick name of the user to modify.
               * @param reason - Optional reason for the change.
               * @param handler_cb - Optional callback for success
               * @param error_cb - Optional callback for error
               * @return iq - the id of the mode change request.
               */
      def mute(room: java.lang.String, nick: java.lang.String, reason: java.lang.String, handler_cb: js.Function): java.lang.String = js.native
      /**
               * Mute a user.
               *
               * @param room - The multi-user chat room name.
               * @param nick - The nick name of the user to modify.
               * @param reason - Optional reason for the change.
               * @param handler_cb - Optional callback for success
               * @param error_cb - Optional callback for error
               * @return iq - the id of the mode change request.
               */
      def mute(
        room: java.lang.String,
        nick: java.lang.String,
        reason: java.lang.String,
        handler_cb: js.Function,
        error_cb: js.Function
      ): java.lang.String = js.native
      /**
               * Op a user.
               *
               * @param room - The multi-user chat room name.
               * @param nick - The nick name of the user to modify.
               * @param reason - Optional reason for the change.
               * @param handler_cb - Optional callback for success
               * @param error_cb - Optional callback for error
               * @return iq - the id of the mode change request.
               */
      def op(room: java.lang.String, nick: java.lang.String): java.lang.String = js.native
      /**
               * Op a user.
               *
               * @param room - The multi-user chat room name.
               * @param nick - The nick name of the user to modify.
               * @param reason - Optional reason for the change.
               * @param handler_cb - Optional callback for success
               * @param error_cb - Optional callback for error
               * @return iq - the id of the mode change request.
               */
      def op(room: java.lang.String, nick: java.lang.String, reason: java.lang.String): java.lang.String = js.native
      /**
               * Op a user.
               *
               * @param room - The multi-user chat room name.
               * @param nick - The nick name of the user to modify.
               * @param reason - Optional reason for the change.
               * @param handler_cb - Optional callback for success
               * @param error_cb - Optional callback for error
               * @return iq - the id of the mode change request.
               */
      def op(room: java.lang.String, nick: java.lang.String, reason: java.lang.String, handler_cb: js.Function): java.lang.String = js.native
      /**
               * Op a user.
               *
               * @param room - The multi-user chat room name.
               * @param nick - The nick name of the user to modify.
               * @param reason - Optional reason for the change.
               * @param handler_cb - Optional callback for success
               * @param error_cb - Optional callback for error
               * @return iq - the id of the mode change request.
               */
      def op(
        room: java.lang.String,
        nick: java.lang.String,
        reason: java.lang.String,
        handler_cb: js.Function,
        error_cb: js.Function
      ): java.lang.String = js.native
      /**
               * Owner a user.
               *
               * @param room - The multi-user chat room name.
               * @param jid  - The jid of the user to modify.
               * @param reason - Optional reason for the change.
               * @param handler_cb - Optional callback for success
               * @param error_cb - Optional callback for error
               * @return iq - the id of the mode change request.
               */
      def owner(room: java.lang.String, jid: java.lang.String): java.lang.String = js.native
      /**
               * Owner a user.
               *
               * @param room - The multi-user chat room name.
               * @param jid  - The jid of the user to modify.
               * @param reason - Optional reason for the change.
               * @param handler_cb - Optional callback for success
               * @param error_cb - Optional callback for error
               * @return iq - the id of the mode change request.
               */
      def owner(room: java.lang.String, jid: java.lang.String, reason: java.lang.String): java.lang.String = js.native
      /**
               * Owner a user.
               *
               * @param room - The multi-user chat room name.
               * @param jid  - The jid of the user to modify.
               * @param reason - Optional reason for the change.
               * @param handler_cb - Optional callback for success
               * @param error_cb - Optional callback for error
               * @return iq - the id of the mode change request.
               */
      def owner(room: java.lang.String, jid: java.lang.String, reason: java.lang.String, handler_cb: js.Function): java.lang.String = js.native
      /**
               * Owner a user.
               *
               * @param room - The multi-user chat room name.
               * @param jid  - The jid of the user to modify.
               * @param reason - Optional reason for the change.
               * @param handler_cb - Optional callback for success
               * @param error_cb - Optional callback for error
               * @return iq - the id of the mode change request.
               */
      def owner(
        room: java.lang.String,
        jid: java.lang.String,
        reason: java.lang.String,
        handler_cb: js.Function,
        error_cb: js.Function
      ): java.lang.String = js.native
      /**
               * Queries a room for a list of occupants
               *
               * @param room - The multi-user chat room name.
               * @param success_cb - Optional function to handle the info.
               * @param error_cb - Optional function to handle an error.
               * @return id - the unique id used to send the info request
               */
      def queryOccupants(room: java.lang.String): java.lang.String = js.native
      /**
               * Queries a room for a list of occupants
               *
               * @param room - The multi-user chat room name.
               * @param success_cb - Optional function to handle the info.
               * @param error_cb - Optional function to handle an error.
               * @return id - the unique id used to send the info request
               */
      def queryOccupants(room: java.lang.String, success_cb: js.Function1[/* stanza */ stdLib.Element, _]): java.lang.String = js.native
      /**
               * Queries a room for a list of occupants
               *
               * @param room - The multi-user chat room name.
               * @param success_cb - Optional function to handle the info.
               * @param error_cb - Optional function to handle an error.
               * @return id - the unique id used to send the info request
               */
      def queryOccupants(
        room: java.lang.String,
        success_cb: js.Function1[/* stanza */ stdLib.Element, _],
        error_cb: js.Function1[/* error */ js.Any, _]
      ): java.lang.String = js.native
      /**
               * Registering with a room.
               * @see http://xmpp.org/extensions/xep-0045.html#register
               *
               * @param room - The multi-user chat room name.
               * @param handle_cb - Function to call for room list return.
               * @param error_cb - Function to call on error.
               */
      def registrationRequest(room: java.lang.String, handle_cb: js.Function, error_cb: js.Function): scala.Unit = js.native
      /**
               * Revoke a user.
               *
               * @param room - The multi-user chat room name.
               * @param jid  - The jid of the user to modify.
               * @param reason - Optional reason for the change.
               * @param handler_cb - Optional callback for success
               * @param error_cb - Optional callback for error
               * @return iq - the id of the mode change request.
               */
      def revoke(room: java.lang.String, jid: java.lang.String): java.lang.String = js.native
      /**
               * Revoke a user.
               *
               * @param room - The multi-user chat room name.
               * @param jid  - The jid of the user to modify.
               * @param reason - Optional reason for the change.
               * @param handler_cb - Optional callback for success
               * @param error_cb - Optional callback for error
               * @return iq - the id of the mode change request.
               */
      def revoke(room: java.lang.String, jid: java.lang.String, reason: java.lang.String): java.lang.String = js.native
      /**
               * Revoke a user.
               *
               * @param room - The multi-user chat room name.
               * @param jid  - The jid of the user to modify.
               * @param reason - Optional reason for the change.
               * @param handler_cb - Optional callback for success
               * @param error_cb - Optional callback for error
               * @return iq - the id of the mode change request.
               */
      def revoke(room: java.lang.String, jid: java.lang.String, reason: java.lang.String, handler_cb: js.Function): java.lang.String = js.native
      /**
               * Revoke a user.
               *
               * @param room - The multi-user chat room name.
               * @param jid  - The jid of the user to modify.
               * @param reason - Optional reason for the change.
               * @param handler_cb - Optional callback for success
               * @param error_cb - Optional callback for error
               * @return iq - the id of the mode change request.
               */
      def revoke(
        room: java.lang.String,
        jid: java.lang.String,
        reason: java.lang.String,
        handler_cb: js.Function,
        error_cb: js.Function
      ): java.lang.String = js.native
      /**
               * Save a room configuration.
               *
               * @param room - The multi-user chat room name.
               * @param config- Form Object or an array of form elements used to configure the room.
               * @param success_db - Optional function to handle success.
               * @param error_cb - Optional function to handle an error.
               * @return id - the unique id used to save the configuration.
               */
      def saveConfiguration(room: java.lang.String, config: js.Any): java.lang.String = js.native
      /**
               * Save a room configuration.
               *
               * @param room - The multi-user chat room name.
               * @param config- Form Object or an array of form elements used to configure the room.
               * @param success_db - Optional function to handle success.
               * @param error_cb - Optional function to handle an error.
               * @return id - the unique id used to save the configuration.
               */
      def saveConfiguration(room: java.lang.String, config: js.Any, success_cb: js.Function): java.lang.String = js.native
      /**
               * Save a room configuration.
               *
               * @param room - The multi-user chat room name.
               * @param config- Form Object or an array of form elements used to configure the room.
               * @param success_db - Optional function to handle success.
               * @param error_cb - Optional function to handle an error.
               * @return id - the unique id used to save the configuration.
               */
      def saveConfiguration(room: java.lang.String, config: js.Any, success_cb: js.Function, error_cb: js.Function): java.lang.String = js.native
      /**
               * Change the current users status.
               *
               * @param room - The multi-user chat room name.
               * @param user - The current nick.
               * @param show - The new show-text.
               * @param status - The new status-text.
               */
      def setStatus(room: java.lang.String, user: java.lang.String, show: java.lang.String, status: java.lang.String): scala.Unit = js.native
      /**
               * Set the topic of the chat room.
               *
               * @param room - The multi-user chat room name.
               * @param topic - Topic message.
               */
      def setTopic(room: java.lang.String, topic: java.lang.String): scala.Unit = js.native
      /**
               * Submits registration form.
               *
               * @param room - The multi-user chat room name.
               * @param fields - The form fields.
               * @param handle_cb - Function to call for room list return.
               * @param error_cb - Function to call on error.
               */
      def submitRegistrationForm(room: java.lang.String, fields: js.Any, handle_cb: js.Function, error_cb: js.Function): scala.Unit = js.native
      /**
               * Voice a user.
               *
               * @param room - The multi-user chat room name.
               * @param nick - The nick name of the user to modify.
               * @param reason - Optional reason for the change.
               * @param handler_cb - Optional callback for success
               * @param error_cb - Optional callback for error
               * @return iq - the id of the mode change request.
               */
      def voice(room: java.lang.String, nick: java.lang.String): java.lang.String = js.native
      /**
               * Voice a user.
               *
               * @param room - The multi-user chat room name.
               * @param nick - The nick name of the user to modify.
               * @param reason - Optional reason for the change.
               * @param handler_cb - Optional callback for success
               * @param error_cb - Optional callback for error
               * @return iq - the id of the mode change request.
               */
      def voice(room: java.lang.String, nick: java.lang.String, reason: java.lang.String): java.lang.String = js.native
      /**
               * Voice a user.
               *
               * @param room - The multi-user chat room name.
               * @param nick - The nick name of the user to modify.
               * @param reason - Optional reason for the change.
               * @param handler_cb - Optional callback for success
               * @param error_cb - Optional callback for error
               * @return iq - the id of the mode change request.
               */
      def voice(room: java.lang.String, nick: java.lang.String, reason: java.lang.String, handler_cb: js.Function): java.lang.String = js.native
      /**
               * Voice a user.
               *
               * @param room - The multi-user chat room name.
               * @param nick - The nick name of the user to modify.
               * @param reason - Optional reason for the change.
               * @param handler_cb - Optional callback for success
               * @param error_cb - Optional callback for error
               * @return iq - the id of the mode change request.
               */
      def voice(
        room: java.lang.String,
        nick: java.lang.String,
        reason: java.lang.String,
        handler_cb: js.Function,
        error_cb: js.Function
      ): java.lang.String = js.native
    }
    
    @js.native
    trait RoomConfig extends js.Object {
      def parse(): js.Any = js.native
      def parse(info: stdLib.Element): js.Any = js.native
    }
    
    @js.native
    trait XmppRoom extends js.Object {
      /**
               * Adds a handler to the MUC room.
               * Parameters:
               * @param handler_type - 'message', 'presence' or 'roster'.
               * @param handler - The handler function.
               * @return id - the id of handler.
               */
      @JSName("addHandler")
      def addHandler_message(handler_type: stropheLib.stropheLibStrings.message, handler: js.Function): scala.Double = js.native
      /**
               * Adds a handler to the MUC room.
               * Parameters:
               * @param handler_type - 'message', 'presence' or 'roster'.
               * @param handler - The handler function.
               * @return id - the id of handler.
               */
      @JSName("addHandler")
      def addHandler_presence(handler_type: stropheLib.stropheLibStrings.presence, handler: js.Function): scala.Double = js.native
      /**
               * Adds a handler to the MUC room.
               * Parameters:
               * @param handler_type - 'message', 'presence' or 'roster'.
               * @param handler - The handler function.
               * @return id - the id of handler.
               */
      @JSName("addHandler")
      def addHandler_roster(handler_type: stropheLib.stropheLibStrings.roster, handler: js.Function): scala.Double = js.native
      def admin(jid: java.lang.String): java.lang.String = js.native
      def admin(jid: java.lang.String, reason: java.lang.String): java.lang.String = js.native
      def admin(jid: java.lang.String, reason: java.lang.String, handler_cb: js.Function): java.lang.String = js.native
      def admin(jid: java.lang.String, reason: java.lang.String, handler_cb: js.Function, error_cb: js.Function): java.lang.String = js.native
      def ban(jid: java.lang.String): java.lang.String = js.native
      def ban(jid: java.lang.String, reason: java.lang.String): java.lang.String = js.native
      def ban(jid: java.lang.String, reason: java.lang.String, handler_cb: js.Function): java.lang.String = js.native
      def ban(jid: java.lang.String, reason: java.lang.String, handler_cb: js.Function, error_cb: js.Function): java.lang.String = js.native
      def cancelConfigure(): java.lang.String = js.native
      def changeNick(nick: java.lang.String): java.lang.String = js.native
      def configure(handler_cb: js.Function): java.lang.String = js.native
      def deop(nick: java.lang.String): java.lang.String = js.native
      def deop(nick: java.lang.String, reason: java.lang.String): java.lang.String = js.native
      def deop(nick: java.lang.String, reason: java.lang.String, handler_cb: js.Function): java.lang.String = js.native
      def deop(nick: java.lang.String, reason: java.lang.String, handler_cb: js.Function, error_cb: js.Function): java.lang.String = js.native
      def directInvite(receiver: java.lang.String): java.lang.String = js.native
      def directInvite(receiver: java.lang.String, reason: java.lang.String): java.lang.String = js.native
      def groupchat(message: java.lang.String): java.lang.String = js.native
      def groupchat(message: java.lang.String, html_message: java.lang.String): java.lang.String = js.native
      def invite(receiver: java.lang.String): java.lang.String = js.native
      def invite(receiver: java.lang.String, reason: java.lang.String): java.lang.String = js.native
      def join(msg_handler_cb: js.Function, pres_handler_cb: js.Function, roster_cb: js.Function): scala.Unit = js.native
      def kick(nick: java.lang.String): java.lang.String = js.native
      def kick(nick: java.lang.String, reason: java.lang.String): java.lang.String = js.native
      def kick(nick: java.lang.String, reason: java.lang.String, handler_cb: js.Function): java.lang.String = js.native
      def kick(nick: java.lang.String, reason: java.lang.String, handler_cb: js.Function, error_cb: js.Function): java.lang.String = js.native
      def leave(): scala.Unit = js.native
      def leave(handler_cb: js.Function): scala.Unit = js.native
      def leave(handler_cb: js.Function, exit_msg: java.lang.String): scala.Unit = js.native
      def member(jid: java.lang.String): java.lang.String = js.native
      def member(jid: java.lang.String, reason: java.lang.String): java.lang.String = js.native
      def member(jid: java.lang.String, reason: java.lang.String, handler_cb: js.Function): java.lang.String = js.native
      def member(jid: java.lang.String, reason: java.lang.String, handler_cb: js.Function, error_cb: js.Function): java.lang.String = js.native
      @JSName("message")
      def message_chat(
        message: java.lang.String,
        html_message: java.lang.String,
        `type`: stropheLib.stropheLibStrings.chat
      ): java.lang.String = js.native
      @JSName("message")
      def message_groupchat(
        message: java.lang.String,
        html_message: java.lang.String,
        `type`: stropheLib.stropheLibStrings.groupchat
      ): java.lang.String = js.native
      def modifyAffiliation(jid: java.lang.String, affiliation: java.lang.String): java.lang.String = js.native
      def modifyAffiliation(jid: java.lang.String, affiliation: java.lang.String, reason: java.lang.String): java.lang.String = js.native
      def modifyAffiliation(
        jid: java.lang.String,
        affiliation: java.lang.String,
        reason: java.lang.String,
        success_cb: js.Function
      ): java.lang.String = js.native
      def modifyAffiliation(
        jid: java.lang.String,
        affiliation: java.lang.String,
        reason: java.lang.String,
        success_cb: js.Function,
        error_cb: js.Function
      ): java.lang.String = js.native
      def modifyRole(nick: java.lang.String, role: java.lang.String): java.lang.String = js.native
      def modifyRole(nick: java.lang.String, role: java.lang.String, reason: java.lang.String): java.lang.String = js.native
      def modifyRole(nick: java.lang.String, role: java.lang.String, reason: java.lang.String, success_cb: js.Function): java.lang.String = js.native
      def modifyRole(
        nick: java.lang.String,
        role: java.lang.String,
        reason: java.lang.String,
        success_cb: js.Function,
        error_cb: js.Function
      ): java.lang.String = js.native
      def multipleInvites(receivers: js.Array[java.lang.String]): java.lang.String = js.native
      def multipleInvites(receivers: js.Array[java.lang.String], reason: java.lang.String): java.lang.String = js.native
      def mute(nick: java.lang.String): java.lang.String = js.native
      def mute(nick: java.lang.String, reason: java.lang.String): java.lang.String = js.native
      def mute(nick: java.lang.String, reason: java.lang.String, handler_cb: js.Function): java.lang.String = js.native
      def mute(nick: java.lang.String, reason: java.lang.String, handler_cb: js.Function, error_cb: js.Function): java.lang.String = js.native
      def op(nick: java.lang.String): java.lang.String = js.native
      def op(nick: java.lang.String, reason: java.lang.String): java.lang.String = js.native
      def op(nick: java.lang.String, reason: java.lang.String, handler_cb: js.Function): java.lang.String = js.native
      def op(nick: java.lang.String, reason: java.lang.String, handler_cb: js.Function, error_cb: js.Function): java.lang.String = js.native
      def owner(jid: java.lang.String): java.lang.String = js.native
      def owner(jid: java.lang.String, reason: java.lang.String): java.lang.String = js.native
      def owner(jid: java.lang.String, reason: java.lang.String, handler_cb: js.Function): java.lang.String = js.native
      def owner(jid: java.lang.String, reason: java.lang.String, handler_cb: js.Function, error_cb: js.Function): java.lang.String = js.native
      def queryOccupants(success_cb: js.Function, error_cb: js.Function): scala.Unit = js.native
      /**
               * Removes a handler from the MUC room.
               * This function takes ONLY ids returned by the addHandler function
               * of this room. passing handler ids returned by connection.addHandler
               * may brake things!
               *
               * @param id - the id of the handler
               */
      def removeHandler(id: scala.Double): scala.Unit = js.native
      def revoke(jid: java.lang.String): java.lang.String = js.native
      def revoke(jid: java.lang.String, reason: java.lang.String): java.lang.String = js.native
      def revoke(jid: java.lang.String, reason: java.lang.String, handler_cb: js.Function): java.lang.String = js.native
      def revoke(jid: java.lang.String, reason: java.lang.String, handler_cb: js.Function, error_cb: js.Function): java.lang.String = js.native
      def saveConfiguration(config: js.Any): java.lang.String = js.native
      def setStatus(show: java.lang.String, status: java.lang.String): java.lang.String = js.native
      def setTopic(topic: java.lang.String): java.lang.String = js.native
      def voice(nick: java.lang.String): java.lang.String = js.native
      def voice(nick: java.lang.String, reason: java.lang.String): java.lang.String = js.native
      def voice(nick: java.lang.String, reason: java.lang.String, handler_cb: js.Function): java.lang.String = js.native
      def voice(nick: java.lang.String, reason: java.lang.String, handler_cb: js.Function, error_cb: js.Function): java.lang.String = js.native
    }
    
  }
  
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
  @js.native
  object Status extends js.Object {
    @js.native
    sealed trait ATTACHED
      extends stropheLib.stropheMod.StropheNs.Status
    
    @js.native
    sealed trait AUTHENTICATING
      extends stropheLib.stropheMod.StropheNs.Status
    
    @js.native
    sealed trait AUTHFAIL
      extends stropheLib.stropheMod.StropheNs.Status
    
    @js.native
    sealed trait CONNECTED
      extends stropheLib.stropheMod.StropheNs.Status
    
    @js.native
    sealed trait CONNECTING
      extends stropheLib.stropheMod.StropheNs.Status
    
    @js.native
    sealed trait CONNFAIL
      extends stropheLib.stropheMod.StropheNs.Status
    
    @js.native
    sealed trait CONNTIMEOUT
      extends stropheLib.stropheMod.StropheNs.Status
    
    @js.native
    sealed trait DISCONNECTED
      extends stropheLib.stropheMod.StropheNs.Status
    
    @js.native
    sealed trait DISCONNECTING
      extends stropheLib.stropheMod.StropheNs.Status
    
    @js.native
    sealed trait ERROR
      extends stropheLib.stropheMod.StropheNs.Status
    
    @js.native
    sealed trait REDIRECT
      extends stropheLib.stropheMod.StropheNs.Status
    
    val ATTACHED: ATTACHED with java.lang.String = js.native
    val AUTHENTICATING: AUTHENTICATING with java.lang.String = js.native
    val AUTHFAIL: AUTHFAIL with java.lang.String = js.native
    val CONNECTED: CONNECTED with java.lang.String = js.native
    val CONNECTING: CONNECTING with java.lang.String = js.native
    val CONNFAIL: CONNFAIL with java.lang.String = js.native
    val CONNTIMEOUT: CONNTIMEOUT with java.lang.String = js.native
    val DISCONNECTED: DISCONNECTED with java.lang.String = js.native
    val DISCONNECTING: DISCONNECTING with java.lang.String = js.native
    val ERROR: ERROR with java.lang.String = js.native
    val REDIRECT: REDIRECT with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[stropheLib.stropheMod.StropheNs.Status with java.lang.String] = js.native
  }
  
}

