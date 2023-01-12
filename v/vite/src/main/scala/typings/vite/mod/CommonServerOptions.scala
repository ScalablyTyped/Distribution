package typings.vite.mod

import org.scalablytyped.runtime.Instantiable1
import typings.node.httpMod.OutgoingHttpHeaders
import typings.node.nodeColonhttpMod.IncomingMessage
import typings.node.nodeColonhttpMod.ServerResponse
import typings.node.nodeColonnetMod.Socket
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommonServerOptions extends StObject {
  
  /**
    * Configure CORS for the dev server.
    * Uses https://github.com/expressjs/cors.
    * Set to `true` to allow all methods from any origin, or configure separately
    * using an object.
    */
  var cors: js.UndefOr[CorsOptions | Boolean] = js.undefined
  
  /**
    * Specify server response headers.
    */
  var headers: js.UndefOr[OutgoingHttpHeaders] = js.undefined
  
  /**
    * Specify which IP addresses the server should listen on.
    * Set to 0.0.0.0 to listen on all addresses, including LAN and public addresses.
    */
  var host: js.UndefOr[String | Boolean] = js.undefined
  
  /**
    * Enable TLS + HTTP/2.
    * Note: this downgrades to TLS only when the proxy option is also used.
    */
  var https: js.UndefOr[
    Boolean | (typings.node.httpsMod.ServerOptions[
      Instantiable1[/* socket */ Socket, IncomingMessage], 
      Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        ServerResponse[typings.node.httpMod.IncomingMessage]
      ]
    ])
  ] = js.undefined
  
  /**
    * Open browser window on startup
    */
  var open: js.UndefOr[Boolean | String] = js.undefined
  
  /**
    * Specify server port. Note if the port is already being used, Vite will
    * automatically try the next available port so this may not be the actual
    * port the server ends up listening on.
    */
  var port: js.UndefOr[Double] = js.undefined
  
  /**
    * Configure custom proxy rules for the dev server. Expects an object
    * of `{ key: options }` pairs.
    * Uses [`http-proxy`](https://github.com/http-party/node-http-proxy).
    * Full options [here](https://github.com/http-party/node-http-proxy#options).
    *
    * Example `vite.config.js`:
    * ``` js
    * module.exports = {
    *   proxy: {
    *     // string shorthand
    *     '/foo': 'http://localhost:4567/foo',
    *     // with options
    *     '/api': {
    *       target: 'http://jsonplaceholder.typicode.com',
    *       changeOrigin: true,
    *       rewrite: path => path.replace(/^\/api/, '')
    *     }
    *   }
    * }
    * ```
    */
  var proxy: js.UndefOr[Record[String, String | ProxyOptions]] = js.undefined
  
  /**
    * If enabled, vite will exit if specified port is already in use
    */
  var strictPort: js.UndefOr[Boolean] = js.undefined
}
object CommonServerOptions {
  
  inline def apply(): CommonServerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonServerOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CommonServerOptions] (val x: Self) extends AnyVal {
    
    inline def setCors(value: CorsOptions | Boolean): Self = StObject.set(x, "cors", value.asInstanceOf[js.Any])
    
    inline def setCorsUndefined: Self = StObject.set(x, "cors", js.undefined)
    
    inline def setHeaders(value: OutgoingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setHost(value: String | Boolean): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setHttps(
      value: Boolean | (typings.node.httpsMod.ServerOptions[
          Instantiable1[/* socket */ Socket, IncomingMessage], 
          Instantiable1[
            /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
            ServerResponse[typings.node.httpMod.IncomingMessage]
          ]
        ])
    ): Self = StObject.set(x, "https", value.asInstanceOf[js.Any])
    
    inline def setHttpsUndefined: Self = StObject.set(x, "https", js.undefined)
    
    inline def setOpen(value: Boolean | String): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setProxy(value: Record[String, String | ProxyOptions]): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
    
    inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
    
    inline def setStrictPort(value: Boolean): Self = StObject.set(x, "strictPort", value.asInstanceOf[js.Any])
    
    inline def setStrictPortUndefined: Self = StObject.set(x, "strictPort", js.undefined)
  }
}
