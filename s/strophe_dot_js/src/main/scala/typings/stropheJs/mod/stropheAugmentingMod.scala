package typings.stropheJs.mod

import typings.std.Document
import typings.std.Element
import typings.std.HTMLElement
import typings.std.Record
import typings.std.Text
import typings.stropheJs.anon.A
import typings.stropheJs.anon.IgnoreNamespaceFragment
import typings.stropheJs.anon.Tree
import typings.stropheJs.mod.global.Strophe.ConnectionOptions
import typings.stropheJs.mod.global.Strophe.LogLevel
import typings.stropheJs.mod.global.Strophe.SASLMechanism
import typings.stropheJs.stropheJsStrings.`background-color`
import typings.stropheJs.stropheJsStrings.`font-family`
import typings.stropheJs.stropheJsStrings.`font-size`
import typings.stropheJs.stropheJsStrings.`font-style`
import typings.stropheJs.stropheJsStrings.`font-weight`
import typings.stropheJs.stropheJsStrings.`margin-left`
import typings.stropheJs.stropheJsStrings.`margin-right`
import typings.stropheJs.stropheJsStrings.`text-align`
import typings.stropheJs.stropheJsStrings.`text-decoration`
import typings.stropheJs.stropheJsStrings.a
import typings.stropheJs.stropheJsStrings.blockquote
import typings.stropheJs.stropheJsStrings.body
import typings.stropheJs.stropheJsStrings.br
import typings.stropheJs.stropheJsStrings.cite
import typings.stropheJs.stropheJsStrings.color
import typings.stropheJs.stropheJsStrings.em
import typings.stropheJs.stropheJsStrings.img
import typings.stropheJs.stropheJsStrings.li
import typings.stropheJs.stropheJsStrings.ol
import typings.stropheJs.stropheJsStrings.p
import typings.stropheJs.stropheJsStrings.span
import typings.stropheJs.stropheJsStrings.strong
import typings.stropheJs.stropheJsStrings.ul
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stropheAugmentingMod {
  
  @JSImport("Strophe", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /** Class: Strophe.Bosh
    *  _Private_ helper class that handles BOSH Connections
    *
    *  The Strophe.Bosh class is used internally by Strophe.Connection
    *  to encapsulate BOSH sessions. It is not meant to be used from user's code.
    */
  @JSImport("Strophe", "Bosh")
  @js.native
  open class Bosh protected ()
    extends typings.stropheJs.mod.global.Strophe.Bosh {
    /** PrivateConstructor: Strophe.Bosh
      *  Create and initialize a Strophe.Bosh object.
      *
      *  Parameters:
      *    @param connection connection - The Strophe.Connection that will use BOSH.
      *
      *  Returns:
      *    @returns A new Strophe.Bosh object.
      */
    def this(connection: typings.stropheJs.mod.global.Strophe.Connection) = this()
  }
  
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
  @JSImport("Strophe", "Builder")
  @js.native
  open class Builder protected ()
    extends typings.stropheJs.mod.global.Strophe.Builder {
    /** Constructor: Strophe.Builder
      *  Create a Strophe.Builder object.
      *
      *  The attributes should be passed in object notation.  For example
      *  > const b = new Builder('message', {to: 'you', from: 'me'});
      *  or
      *  > const b = new Builder('messsage', {'xml:lang': 'en'});
      *
      *  Parameters:
      *    @param name - The name of the root element.
      *    @param attrs - The attributes for the root element in object notation.
      *
      *  Returns:
      *    @returns A new Strophe.Builder.
      */
    def this(name: String) = this()
    def this(name: String, attrs: Any) = this()
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
  @JSImport("Strophe", "Connection")
  @js.native
  open class Connection protected ()
    extends typings.stropheJs.mod.global.Strophe.Connection {
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
  }
  
  /** PrivateConstants: DOM Element Type Constants
    *  DOM element types.
    *
    *  ElementType.NORMAL - Normal element.
    *  ElementType.TEXT - Text data element.
    *  ElementType.FRAGMENT - XHTML fragment element.
    */
  @JSImport("Strophe", "ElementType")
  @js.native
  object ElementType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.stropheJs.mod.global.Strophe.ElementType & Double] = js.native
    
    /* 4 */ val CDATA: typings.stropheJs.mod.global.Strophe.ElementType.CDATA & Double = js.native
    
    /* 11 */ val FRAGMENT: typings.stropheJs.mod.global.Strophe.ElementType.FRAGMENT & Double = js.native
    
    /* 1 */ val NORMAL: typings.stropheJs.mod.global.Strophe.ElementType.NORMAL & Double = js.native
    
    /* 3 */ val TEXT: typings.stropheJs.mod.global.Strophe.ElementType.TEXT & Double = js.native
  }
  
  /** Constants: Error Condition Constants
    * Error conditions that occur commonly.
    *
    * ErrorCondition.BAD_FORMAT - Stanza has unspecified format
    * ErrorCondition.CONFLICT - Protocol conflict
    * ErrorCondition.MISSING_JID_NODE - No jid and anonymous users are now allowed on server
    * ErrorCondition.NO_AUTH_MECH - No authentication mechanism configured
    * ErrorCondition.UNKNOWN_REASON - Unknown error cause
    */
  @JSImport("Strophe", "ErrorCondition")
  @js.native
  object ErrorCondition extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.stropheJs.mod.global.Strophe.ErrorCondition & String] = js.native
    
    /* "bad-format" */ val BAD_FORMAT: typings.stropheJs.mod.global.Strophe.ErrorCondition.BAD_FORMAT & String = js.native
    
    /* "conflict" */ val CONFLICT: typings.stropheJs.mod.global.Strophe.ErrorCondition.CONFLICT & String = js.native
    
    /* "x-strophe-bad-non-anon-jid" */ val MISSING_JID_NODE: typings.stropheJs.mod.global.Strophe.ErrorCondition.MISSING_JID_NODE & String = js.native
    
    /* "no-auth-mech" */ val NO_AUTH_MECH: typings.stropheJs.mod.global.Strophe.ErrorCondition.NO_AUTH_MECH & String = js.native
    
    /* "unknown" */ val UNKNOWN_REASON: typings.stropheJs.mod.global.Strophe.ErrorCondition.UNKNOWN_REASON & String = js.native
  }
  
  /** PrivateClass: Strophe.Handler
    *  _Private_ helper class for managing stanza handlers.
    *
    *  A Strophe.Handler encapsulates a user provided callback function to be
    *  executed when matching stanzas are received by the connection.
    *  Handlers can be either one-off or persistent depending on their
    *  return value. Returning true will cause a Handler to remain active, and
    *  returning false will remove the Handler.
    *
    *  Users will not use Strophe.Handler objects directly, but instead they
    *  will use Strophe.Connection.addHandler() and
    *  Strophe.Connection.deleteHandler().
    */
  @JSImport("Strophe", "Handler")
  @js.native
  open class Handler protected ()
    extends typings.stropheJs.mod.global.Strophe.Handler {
    /**
      * PrivateConstructor: Strophe.Handler
      *  Create and initialize a new Strophe.Handler
      *
      * Parameters:
      * @param handler handler function to run if the configured attributes for it match against the stanza
      * @param ns namespace to match the incoming stanza against to find the right handler
      * @param name tagName to match the incoming stanza against to find the right handler
      * @param type type to match the incoming stanza against to find the right handler
      * @param id id to match the incoming stanza against to find the right handler
      * @param from from jid to match the incoming stanza against to find the right handler
      * @param options matchBareFromJid match only the local and domain of the jid, ignoreNamespaceFragment ignores '#' in namespace
      */
    /* private */ def this(
      handler: js.Function1[/* stanza */ Element, Boolean],
      ns: String,
      name: String,
      `type`: String,
      id: String,
      from: String
    ) = this()
    /* private */ def this(
      handler: js.Function1[/* stanza */ Element, Boolean],
      ns: String,
      name: String,
      `type`: String,
      id: String,
      from: String,
      options: IgnoreNamespaceFragment
    ) = this()
  }
  
  /** Constants: Log Level Constants
    *  Logging level indicators.
    *
    *  LogLevel.DEBUG - Debug output
    *  LogLevel.INFO - Informational output
    *  LogLevel.WARN - Warnings
    *  LogLevel.ERROR - Errors
    *  LogLevel.FATAL - Fatal errors
    */
  @JSImport("Strophe", "LogLevel")
  @js.native
  object LogLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.stropheJs.mod.global.Strophe.LogLevel & Double] = js.native
    
    /* 0 */ val DEBUG: typings.stropheJs.mod.global.Strophe.LogLevel.DEBUG & Double = js.native
    
    /* 3 */ val ERROR: typings.stropheJs.mod.global.Strophe.LogLevel.ERROR & Double = js.native
    
    /* 4 */ val FATAL: typings.stropheJs.mod.global.Strophe.LogLevel.FATAL & Double = js.native
    
    /* 1 */ val INFO: typings.stropheJs.mod.global.Strophe.LogLevel.INFO & Double = js.native
    
    /* 2 */ val WARN: typings.stropheJs.mod.global.Strophe.LogLevel.WARN & Double = js.native
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
    *  NS.BIND - XMPP Binding namespace from RFC 3920 and RFC 6120.
    *  NS.SESSION - XMPP Session namespace from RFC 3920.
    *  NS.XHTML_IM - XHTML-IM namespace from XEP 71.
    *  NS.XHTML - XHTML body namespace from XEP 71.
    */
  @JSImport("Strophe", "NS")
  @js.native
  object NS extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.stropheJs.mod.global.Strophe.NS & String] = js.native
    
    /* "jabber:iq:auth" */ val AUTH: typings.stropheJs.mod.global.Strophe.NS.AUTH & String = js.native
    
    /* "urn:ietf:params:xml:ns:xmpp-bind" */ val BIND: typings.stropheJs.mod.global.Strophe.NS.BIND & String = js.native
    
    /* "urn:xmpp:xbosh" */ val BOSH: typings.stropheJs.mod.global.Strophe.NS.BOSH & String = js.native
    
    /* "jabber:client" */ val CLIENT: typings.stropheJs.mod.global.Strophe.NS.CLIENT & String = js.native
    
    /* "http://jabber.org/protocol/disco#info" */ val DISCO_INFO: typings.stropheJs.mod.global.Strophe.NS.DISCO_INFO & String = js.native
    
    /* "http://jabber.org/protocol/disco#items" */ val DISCO_ITEMS: typings.stropheJs.mod.global.Strophe.NS.DISCO_ITEMS & String = js.native
    
    /* "urn:ietf:params:xml:ns:xmpp-framing" */ val FRAMING: typings.stropheJs.mod.global.Strophe.NS.FRAMING & String = js.native
    
    /* "http://jabber.org/protocol/httpbind" */ val HTTPBIND: typings.stropheJs.mod.global.Strophe.NS.HTTPBIND & String = js.native
    
    /* "http://jabber.org/protocol/muc" */ val MUC: typings.stropheJs.mod.global.Strophe.NS.MUC & String = js.native
    
    /* "jabber:iq:profile" */ val PROFILE: typings.stropheJs.mod.global.Strophe.NS.PROFILE & String = js.native
    
    /* "jabber:iq:roster" */ val ROSTER: typings.stropheJs.mod.global.Strophe.NS.ROSTER & String = js.native
    
    /* "urn:ietf:params:xml:ns:xmpp-sasl" */ val SASL: typings.stropheJs.mod.global.Strophe.NS.SASL & String = js.native
    
    /* "urn:ietf:params:xml:ns:xmpp-session" */ val SESSION: typings.stropheJs.mod.global.Strophe.NS.SESSION & String = js.native
    
    /* "urn:ietf:params:xml:ns:xmpp-stanzas" */ val STANZAS: typings.stropheJs.mod.global.Strophe.NS.STANZAS & String = js.native
    
    /* "http://etherx.jabber.org/streams" */ val STREAM: typings.stropheJs.mod.global.Strophe.NS.STREAM & String = js.native
    
    /* "jabber:iq:version" */ val VERSION: typings.stropheJs.mod.global.Strophe.NS.VERSION & String = js.native
    
    /* "http://www.w3.org/1999/xhtml" */ val XHTML: typings.stropheJs.mod.global.Strophe.NS.XHTML & String = js.native
    
    /* "http://jabber.org/protocol/xhtml-im" */ val XHTML_IM: typings.stropheJs.mod.global.Strophe.NS.XHTML_IM & String = js.native
  }
  
  /** Constants: SASL mechanisms
    *  Available authentication mechanisms
    *
    *  Strophe.SASLAnonymous - SASL Anonymous authentication.
    *  Strophe.SASLPlain - SASL Plain authentication.
    *  Strophe.SASLMD5 - SASL Digest-MD5 authentication
    *  Strophe.SASLSHA1 - SASL SCRAM-SHA1 authentication
    */
  @JSImport("Strophe", "SASLAnonymous")
  @js.native
  val SASLAnonymous: SASLMechanism = js.native
  
  @JSImport("Strophe", "SASLMD5")
  @js.native
  val SASLMD5: SASLMechanism = js.native
  
  @JSImport("Strophe", "SASLPlain")
  @js.native
  val SASLPlain: SASLMechanism = js.native
  
  @JSImport("Strophe", "SASLSHA1")
  @js.native
  val SASLSHA1: SASLMechanism = js.native
  
  @JSImport("Strophe", "SECONDARY_TIMEOUT")
  @js.native
  val SECONDARY_TIMEOUT: /* 0.1 */ Double = js.native
  
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
    *  Status.REDIRECT - The connection has been redirected
    *  Status.CONNTIMEOUT - The connection has timed out
    */
  @JSImport("Strophe", "Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.stropheJs.mod.global.Strophe.Status & Double] = js.native
    
    /* 8 */ val ATTACHED: typings.stropheJs.mod.global.Strophe.Status.ATTACHED & Double = js.native
    
    /* 12 */ val ATTACHFAIL: typings.stropheJs.mod.global.Strophe.Status.ATTACHFAIL & Double = js.native
    
    /* 3 */ val AUTHENTICATING: typings.stropheJs.mod.global.Strophe.Status.AUTHENTICATING & Double = js.native
    
    /* 4 */ val AUTHFAIL: typings.stropheJs.mod.global.Strophe.Status.AUTHFAIL & Double = js.native
    
    /* 11 */ val BINDREQUIRED: typings.stropheJs.mod.global.Strophe.Status.BINDREQUIRED & Double = js.native
    
    /* 5 */ val CONNECTED: typings.stropheJs.mod.global.Strophe.Status.CONNECTED & Double = js.native
    
    /* 1 */ val CONNECTING: typings.stropheJs.mod.global.Strophe.Status.CONNECTING & Double = js.native
    
    /* 2 */ val CONNFAIL: typings.stropheJs.mod.global.Strophe.Status.CONNFAIL & Double = js.native
    
    /* 10 */ val CONNTIMEOUT: typings.stropheJs.mod.global.Strophe.Status.CONNTIMEOUT & Double = js.native
    
    /* 6 */ val DISCONNECTED: typings.stropheJs.mod.global.Strophe.Status.DISCONNECTED & Double = js.native
    
    /* 7 */ val DISCONNECTING: typings.stropheJs.mod.global.Strophe.Status.DISCONNECTING & Double = js.native
    
    /* 0 */ val ERROR: typings.stropheJs.mod.global.Strophe.Status.ERROR & Double = js.native
    
    /* 9 */ val REDIRECT: typings.stropheJs.mod.global.Strophe.Status.REDIRECT & Double = js.native
  }
  
  /** PrivateConstants: Timeout Values
    *  Timeout values for error states.  These values are in seconds.
    *  These should not be changed unless you know exactly what you are
    *  doing.
    *
    *  TIMEOUT - Timeout multiplier. A waiting request will be considered
    *      failed after Math.floor(TIMEOUT * wait) seconds have elapsed.
    *      This defaults to 1.1, and with default wait, 66 seconds.
    *  SECONDARY_TIMEOUT - Secondary timeout multiplier. In cases where
    *      Strophe can detect early failure, it will consider the request
    *      failed if it doesn't return after
    *      Math.floor(SECONDARY_TIMEOUT * wait) seconds have elapsed.
    *      This defaults to 0.1, and with default wait, 6 seconds.
    */
  @JSImport("Strophe", "TIMEOUT")
  @js.native
  val TIMEOUT: /* 1.1 */ Double = js.native
  
  /** PrivateClass: Strophe.TimedHandler
    *  _Private_ helper class for managing timed handlers.
    *
    *  A Strophe.TimedHandler encapsulates a user provided callback that
    *  should be called after a certain period of time or at regular
    *  intervals.  The return value of the callback determines whether the
    *  Strophe.TimedHandler will continue to fire.
    *
    *  Users will not use Strophe.TimedHandler objects directly, but instead
    *  they will use Strophe.Connection.addTimedHandler() and
    *  Strophe.Connection.deleteTimedHandler().
    */
  @JSImport("Strophe", "TimedHandler")
  @js.native
  open class TimedHandler protected ()
    extends typings.stropheJs.mod.global.Strophe.TimedHandler {
    /** PrivateConstructor: Strophe.TimedHandler
      *  Create and initialize a new Strophe.TimedHandler object.
      *
      *  Parameters:
      *    @param period - The number of milliseconds to wait before the
      *      handler is called.
      *    @param handler - The callback to run when the handler fires.  This
      *      function should take no arguments.
      *
      *  Returns:
      *    @returns A new Strophe.TimedHandler object.
      */
    /* private */ def this(period: Double, handler: js.Function0[Boolean]) = this()
  }
  
  /** Constant: VERSION
    *  The version of the Strophe library. Unreleased builds will have
    *  a version of head-HASH where HASH is a partial revision.
    */
  @JSImport("Strophe", "VERSION")
  @js.native
  val VERSION: String = js.native
  
  /** Class: Strophe.WebSocket
    *  _Private_ helper class that handles WebSocket Connections
    *
    *  The Strophe.WebSocket class is used internally by Strophe.Connection
    *  to encapsulate WebSocket sessions. It is not meant to be used from user's code.
    */
  @JSImport("Strophe", "Websocket")
  @js.native
  open class Websocket protected ()
    extends typings.stropheJs.mod.global.Strophe.Websocket {
    /** PrivateConstructor: Strophe.Websocket
      *  Create and initialize a Strophe.WebSocket object.
      *  Currently only sets the connection Object.
      *
      *  Parameters:
      *    @param connection - The Strophe.Connection that will use WebSockets.
      *
      *  Returns:
      *    @returns A new Strophe.WebSocket object.
      */
    def this(connection: typings.stropheJs.mod.global.Strophe.Connection) = this()
  }
  
  /** Constants: XHTML_IM Namespace
    *  contains allowed tags, tag attributes, and css properties.
    *  Used in the createHtml function to filter incoming html into the allowed XHTML-IM subset.
    *  See http://xmpp.org/extensions/xep-0071.html#profile-summary for the list of recommended
    *  allowed tags and their attributes.
    */
  object XHTML {
    
    @JSImport("Strophe", "XHTML")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("Strophe", "XHTML.attributes")
    @js.native
    def attributes: A = js.native
    inline def attributes_=(x: A): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("attributes")(x.asInstanceOf[js.Any])
    
    @JSImport("Strophe", "XHTML.css")
    @js.native
    def css: js.Tuple10[
        `background-color`, 
        color, 
        `font-family`, 
        `font-size`, 
        `font-style`, 
        `font-weight`, 
        `margin-left`, 
        `margin-right`, 
        `text-align`, 
        `text-decoration`
      ] = js.native
    inline def css_=(
      x: js.Tuple10[
          `background-color`, 
          color, 
          `font-family`, 
          `font-size`, 
          `font-style`, 
          `font-weight`, 
          `margin-left`, 
          `margin-right`, 
          `text-align`, 
          `text-decoration`
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("css")(x.asInstanceOf[js.Any])
    
    @JSImport("Strophe", "XHTML.tags")
    @js.native
    def tags: js.Tuple13[a, blockquote, br, cite, em, img, li, ol, p, span, strong, ul, body] = js.native
    inline def tags_=(x: js.Tuple13[a, blockquote, br, cite, em, img, li, ol, p, span, strong, ul, body]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tags")(x.asInstanceOf[js.Any])
    
    /**
      * Function: XHTML.validAttribute
      * Utility method to determine whether an attribute is allowed as recommended per XEP-0071 for the passed tag
      *
      * @param tag XHTML tag names are case sensitive and must be lower case
      * @param attribute XHTML attribute names are case sensitive and must be lower case.
      */
    inline def validAttribute(tag: String, attribute: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("validAttribute")(tag.asInstanceOf[js.Any], attribute.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Function: XHTML.validCSS
      * Utility method to determine whether an css style attribute is allowed as recommended per XEP-0071
      *
      * @param style XHTML css style attribute names are case sensitive and must be lower case in snake-case.
      */
    inline def validCSS(style: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validCSS")(style.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Function: XHTML.validTag
      * Utility method to determine whether a tag is allowed in the XHTML_IM namespace.
      *
      * @param tag XHTML tag names are case sensitive and must be lower case.
      */
    inline def validTag(tag: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validTag")(tag.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  /** Function: addConnectionPlugin
    *  Extends the Strophe.Connection object with the given plugin.
    *
    *  Parameters:
    *    @param name - The name of the extension.
    *    @param prototypeObject - The plugin's prototype.
    */
  inline def addConnectionPlugin(name: String, prototypeObject: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addConnectionPlugin")(name.asInstanceOf[js.Any], prototypeObject.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** Function: addNamespace
    *  This function is used to extend the current namespaces in
    *  Strophe.NS.  It takes a key and a value with the key being the
    *  name of the new namespace, with its actual value.
    *  For example:
    *  Strophe.addNamespace('PUBSUB', "http://jabber.org/protocol/pubsub");
    *
    *  Parameters:
    *    @param name - The name under which the namespace will be
    *      referenced under Strophe.NS
    *    @param value - The actual namespace.
    */
  inline def addNamespace(name: String, value: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addNamespace")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** Function: copyElement
    *  Copy an XML DOM element.
    *
    *  This function copies a DOM element and all its descendants and returns
    *  the new copy.
    *
    *  Parameters:
    *    @param elem - A XMLElement as a DOM element.
    *
    *  Returns:
    *    @returns A new, copied DOM element tree.
    */
  inline def copyElement(elem: Element): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("copyElement")(elem.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  /** Function: createHtml
    *  Copy an HTML DOM element into an XML DOM.
    *
    *  This function copies a DOM element and all its descendants and returns
    *  the new copy. If all elements and attributes satisfy the XHTML specification
    *
    *  Parameters:
    *    @param elem - A HTMLElement.
    *
    *  Returns:
    *    @returns A new, copied DOM element tree.
    */
  inline def createHtml(elem: HTMLElement): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("createHtml")(elem.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  /** Functions: debug
    *  Log a message at the Strophe.LogLevel.DEBUG level.
    *
    *  Parameters:
    *    @param msg - The log message.
    */
  inline def debug(msg: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("debug")(msg.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** Functions: error
    *  Log a message at the Strophe.LogLevel.ERROR level.
    *
    *  Parameters:
    *    @param msg - The log message.
    */
  inline def error(msg: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(msg.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** Function: escapeNode
    *  Escape the node part (also called local part) of a JID.
    *
    *  Parameters:
    *    @param node - A node (or local part).
    *
    *  Returns:
    *    @returns An escaped node (or local part).
    */
  inline def escapeNode(node: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeNode")(node.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /** Functions: fatal
    *  Log a message at the Strophe.LogLevel.FATAL level.
    *
    *  Parameters:
    *    @param msg - The log message.
    */
  inline def fatal(msg: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("fatal")(msg.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** Function: forEachChild
    *  Map a function over some or all child elements of a given element.
    *
    *  This is a small convenience function for mapping a function over
    *  some or all of the children of an element.  If elemName is null, all
    *  children will be passed to the function, otherwise only children
    *  whose tag names match elemName will be passed.
    *
    *  Parameters:
    *    @param elem - The xml element to operate on in an Element object.
    *    @param elemName - The child element tag name filter.
    *    @param func - The function to apply to each child.  This
    *      function should take a single argument, a DOM element. A return value will be ignored.
    */
  inline def forEachChild(elem: Element, elemName: String, func: js.Function1[/* child */ Element, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEachChild")(elem.asInstanceOf[js.Any], elemName.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** Function: getBareJidFromJid
    *  Get the bare JID from a JID String.
    *
    *  Parameters:
    *    @param jid - A JID.
    *
    *  Returns:
    *    @returns A String containing the bare JID.
    */
  inline def getBareJidFromJid(jid: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getBareJidFromJid")(jid.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /** Function: getDomainFromJid
    *  Get the domain portion of a JID String.
    *
    *  Parameters:
    *    @param jid - A JID.
    *
    *  Returns:
    *    @returns A String containing the domain.
    */
  inline def getDomainFromJid(jid: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDomainFromJid")(jid.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /** Function: getNodeFromJid
    *  Get the node portion of a JID String.
    *
    *  Parameters:
    *    @param jid - A JID.
    *
    *  Returns:
    *   @returns A String containing the node.
    */
  inline def getNodeFromJid(jid: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getNodeFromJid")(jid.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /** Function: getResourceFromJid
    *  Get the resource portion of a JID String.
    *
    *  Parameters:
    *    @param jid - A JID.
    *
    *  Returns:
    *    @returns A String containing the resource.
    */
  inline def getResourceFromJid(jid: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getResourceFromJid")(jid.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /** Function: getText
    *  Get the concatenation of all text children of an element.
    *
    *  Parameters:
    *    @param elem - A XMLElement as DOM element.
    *
    *  Returns:
    *    @returns A String with the concatenated text of all text element children.
    */
  inline def getText(elem: Element): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getText")(elem.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /** Functions: info
    *  Log a message at the Strophe.LogLevel.INFO level.
    *
    *  Parameters:
    *    @param msg - The log message.
    */
  inline def info(msg: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("info")(msg.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** Function: isTagEqual
    *  Compare an element's tag name with a string.
    *
    *  This function is case sensitive.
    *
    *  Parameters:
    *   @param el - A XMLElement in a DOM element.
    *   @param name - The element name.
    *
    *  Returns:
    *    @returns true if the element's tag name matches _el_, and false
    *    otherwise.
    */
  inline def isTagEqual(el: Element, name: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTagEqual")(el.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
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
    *    @param level - The log level of the log message.  This will
    *      be one of the values in Strophe.LogLevel.
    *    @param msg - The log message.
    */
  inline def log(level: LogLevel, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("log")(level.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** Function: serialize
    *  Render a DOM element and all descendants to a String.
    *
    *  Parameters:
    *    @param elem - A XMLElement as DOM element or a Strophe.Builder or an object
    *    with a tree function returning a DOMElement.
    *
    *  Returns:
    *    @returns The serialized element tree as a String.
    */
  inline def serialize(elem: Element): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(elem.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def serialize(elem: Tree): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(elem.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def serialize(elem: typings.stropheJs.mod.global.Strophe.Builder): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(elem.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /** Function: unescapeNode
    *  Unescape a node part (also called local part) of a JID.
    *
    *  Parameters:
    *    @param node - A node (or local part).
    *
    *  Returns:
    *   @returns An unescaped node (or local part).
    */
  inline def unescapeNode(node: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unescapeNode")(node.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /** Functions: warn
    *  Log a message at the Strophe.LogLevel.WARN level.
    *
    *  Parameters:
    *    @param msg - The log message.
    */
  inline def warn(msg: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(msg.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** Function: xmlElement
    *  Create an XML DOM element.
    *
    *  This function creates an XML DOM element correctly across all
    *  implementations. Note that these are not HTML DOM elements, which
    *  aren't appropriate for XMPP stanzas.
    *
    *  Parameters:
    *    @param name - The name for the element.
    *    @param attrs - An optional array or object containing
    *      key/value pairs to use as element attributes. The object should
    *      be in the format {'key': 'value'} or {key: 'value'}. The array
    *      should have the format [['key1', 'value1'], ['key2', 'value2']].
    *    @param text - The text child data for the element.
    *
    *  Returns:
    *    @returns A new XML DOM element.
    */
  inline def xmlElement(name: String): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("xmlElement")(name.asInstanceOf[js.Any]).asInstanceOf[Element]
  inline def xmlElement(name: String, attrs: js.Array[js.Tuple2[String, String]]): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("xmlElement")(name.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).asInstanceOf[Element]
  inline def xmlElement(name: String, attrs: js.Array[js.Tuple2[String, String]], text: String): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("xmlElement")(name.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[Element]
  inline def xmlElement(name: String, attrs: Unit, text: String): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("xmlElement")(name.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[Element]
  inline def xmlElement(name: String, attrs: Record[String, String]): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("xmlElement")(name.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).asInstanceOf[Element]
  inline def xmlElement(name: String, attrs: Record[String, String], text: String): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("xmlElement")(name.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[Element]
  inline def xmlElement(name: String, text: String): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("xmlElement")(name.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[Element]
  inline def xmlElement(name: String, text: String, attrs: js.Array[js.Tuple2[String, String]]): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("xmlElement")(name.asInstanceOf[js.Any], text.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).asInstanceOf[Element]
  inline def xmlElement(name: String, text: String, attrs: Record[String, String]): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("xmlElement")(name.asInstanceOf[js.Any], text.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).asInstanceOf[Element]
  inline def xmlElement(name: String, text: Unit, attrs: js.Array[js.Tuple2[String, String]]): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("xmlElement")(name.asInstanceOf[js.Any], text.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).asInstanceOf[Element]
  inline def xmlElement(name: String, text: Unit, attrs: Record[String, String]): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("xmlElement")(name.asInstanceOf[js.Any], text.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).asInstanceOf[Element]
  
  /** Function: xmlGenerator
    *  Get the DOM document to generate elements.
    *
    *  Returns:
    *    @returns The currently used DOM document.
    */
  inline def xmlGenerator(): Document = ^.asInstanceOf[js.Dynamic].applyDynamic("xmlGenerator")().asInstanceOf[Document]
  
  /** Function: xmlHtmlNode
    *  Creates an XML DOM html node.
    *
    *  Parameters:
    *    @param html - The content of the html node.
    *
    *  Returns:
    *   @returns A new XML DOM text node.
    */
  inline def xmlHtmlNode(html: String): Document = ^.asInstanceOf[js.Dynamic].applyDynamic("xmlHtmlNode")(html.asInstanceOf[js.Any]).asInstanceOf[Document]
  
  /** Function: xmlTextNode
    *  Creates an XML DOM text node.
    *
    *  Provides a cross implementation version of document.createTextNode.
    *
    *  Parameters:
    *    @param text - The content of the text node.
    *
    *  Returns:
    *   @returns A new XML DOM text node.
    */
  inline def xmlTextNode(text: String): Text = ^.asInstanceOf[js.Dynamic].applyDynamic("xmlTextNode")(text.asInstanceOf[js.Any]).asInstanceOf[Text]
  
  /**  Function: xmlescape
    *  Escapes invalid xml characters.
    *
    *  Parameters:
    *     @param text - text to escape.
    *
    *  Returns:
    *     @returns Escaped text.
    */
  inline def xmlescape(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("xmlescape")(text.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**  Function: xmlunescape
    *  Unescapes invalid xml characters.
    *
    *  Parameters:
    *     @param text - text to unescape.
    *
    *  Returns:
    *     @returns Unescaped text.
    */
  inline def xmlunescape(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("xmlunescape")(text.asInstanceOf[js.Any]).asInstanceOf[String]
}
