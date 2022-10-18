package typings.stropheJs.stropheMod.global.Strophe

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for the Strophe Connection
  *  shared options between WebSocket and BOSH are:
  *   - cookies
  *   - mechanisms (for SASL)
  *   - explicitResourceBinding (to have additional step for connections setups)
  *  WebSocket only:
  *   - protocol (upgrade current protocol to ws or wss)
  *   - worker (url to load the worker script from, for example for shared sessions)
  *  BOSH only:
  *   - sync (make requests synchronous)
  *   - customHeaders (add custom headers to requests)
  *   - keepalive (store session data for reconnections)
  *   - withCredentials (if you need to add auth cookies to ajax requests)
  *   - contentType (default is "text/xml; charset=utf-8")
  */
trait ConnectionOptions extends StObject {
  
  /**
    * contentType - BOSH option:
    *  The *contentType* option can be set to change the default Content-Type
    *  of "text/xml; charset=utf-8", which can be useful to reduce the amount of
    *  CORS preflight requests that are sent to the server.
    */
  var contentType: js.UndefOr[String] = js.undefined
  
  /**
    * cookies - Common option for Websocket and Bosh:
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
    */
  var cookies: js.UndefOr[Record[String, Record[String, String]]] = js.undefined
  
  /**
    * customHeaders - BOSH option:
    *  The *customHeaders* option can be used to provide custom HTTP headers to be
    *  included in the XMLHttpRequests made.
    */
  var customHeaders: js.UndefOr[Record[String, String]] = js.undefined
  
  /**
    * explicitResourceBinding - Common option for Websocket and Bosh:
    *  If `explicitResourceBinding` is set to a truthy value, then the XMPP client
    *  needs to explicitly call `Strophe.Connection.prototype.bind` once the XMPP
    *  server has advertised the "urn:ietf:params:xml:ns:xmpp-bind" feature.
    *
    *  Making this step explicit allows client authors to first finish other
    *  stream related tasks, such as setting up an XEP-0198 Stream Management
    *  session, before binding the JID resource for this session.
    */
  var explicitResourceBinding: js.UndefOr[Boolean] = js.undefined
  
  /**
    * keepalive - BOSH option:
    *  The *keepalive* option can be used to instruct Strophe to maintain the
    *  current BOSH session across interruptions such as webpage reloads.
    *
    *  It will do this by caching the sessions tokens in sessionStorage, and when
    *  "restore" is called it will check whether there are cached tokens with
    *  which it can resume an existing session.
    */
  var keepalive: js.UndefOr[Boolean] = js.undefined
  
  /**
    * mechanisms - Common option for Websocket and Bosh:
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
    */
  var mechanisms: js.UndefOr[js.Array[SASLMechanism]] = js.undefined
  
  /**
    * protocol - WebSocket option:
    *  If you want to connect to the current host with a WebSocket connection you
    *  can tell Strophe to use WebSockets through a "protocol" attribute in the
    *  optional options parameter. Valid values are "ws" for WebSocket and "wss"
    *  for Secure WebSocket.
    *  So to connect to "wss://CURRENT_HOSTNAME/xmpp-websocket" you would call
    *
    *  > const conn = new Strophe.Connection("/xmpp-websocket/", {protocol: "wss"});
    *
    *  Note that relative URLs _NOT_ starting with a "/" will also include the path
    *  of the current site.
    *
    *  Also, because downgrading security is not permitted by browsers, when using
    *  relative URLs both BOSH and WebSocket connections will use their secure
    *  variants if the current connection to the site is also secure (https).
    */
  var protocol: js.UndefOr[String] = js.undefined
  
  /**
    * sync - BOSH option:
    *  By adding "sync" to the options, you can control if requests will
    *  be made synchronously or not. The default behaviour is asynchronous.
    *  If you want to make requests synchronous, make "sync" evaluate to true.
    *  > let conn = new Strophe.Connection("/http-bind/", {sync: true});
    *
    *  You can also toggle this on an already established connection.
    *  > conn.options.sync = true;
    */
  var sync: js.UndefOr[Boolean] = js.undefined
  
  /**
    * withCredentials - BOSH option:
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
    */
  var withCredentials: js.UndefOr[Boolean] = js.undefined
  
  /**
    * worker - WebSocket option:
    *  Set this option to URL from where the shared worker script should be loaded.
    *
    *  To run the websocket connection inside a shared worker.
    *  This allows you to share a single websocket-based connection between
    *  multiple Strophe.Connection instances, for example one per browser tab.
    *
    *  The script to use is the one in `src/shared-connection-worker.js`.
    */
  var worker: js.UndefOr[String] = js.undefined
}
object ConnectionOptions {
  
  inline def apply(): ConnectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionOptions]
  }
  
  extension [Self <: ConnectionOptions](x: Self) {
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setCookies(value: Record[String, Record[String, String]]): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
    
    inline def setCookiesUndefined: Self = StObject.set(x, "cookies", js.undefined)
    
    inline def setCustomHeaders(value: Record[String, String]): Self = StObject.set(x, "customHeaders", value.asInstanceOf[js.Any])
    
    inline def setCustomHeadersUndefined: Self = StObject.set(x, "customHeaders", js.undefined)
    
    inline def setExplicitResourceBinding(value: Boolean): Self = StObject.set(x, "explicitResourceBinding", value.asInstanceOf[js.Any])
    
    inline def setExplicitResourceBindingUndefined: Self = StObject.set(x, "explicitResourceBinding", js.undefined)
    
    inline def setKeepalive(value: Boolean): Self = StObject.set(x, "keepalive", value.asInstanceOf[js.Any])
    
    inline def setKeepaliveUndefined: Self = StObject.set(x, "keepalive", js.undefined)
    
    inline def setMechanisms(value: js.Array[SASLMechanism]): Self = StObject.set(x, "mechanisms", value.asInstanceOf[js.Any])
    
    inline def setMechanismsUndefined: Self = StObject.set(x, "mechanisms", js.undefined)
    
    inline def setMechanismsVarargs(value: SASLMechanism*): Self = StObject.set(x, "mechanisms", js.Array(value*))
    
    inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    inline def setSync(value: Boolean): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
    
    inline def setSyncUndefined: Self = StObject.set(x, "sync", js.undefined)
    
    inline def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
    
    inline def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
    
    inline def setWorker(value: String): Self = StObject.set(x, "worker", value.asInstanceOf[js.Any])
    
    inline def setWorkerUndefined: Self = StObject.set(x, "worker", js.undefined)
  }
}
