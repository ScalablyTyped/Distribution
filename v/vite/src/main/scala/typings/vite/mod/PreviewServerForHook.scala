package typings.vite.mod

import org.scalablytyped.runtime.Instantiable1
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.node.nodeColonhttpMod.Server
import typings.node.nodeColonnetMod.Socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreviewServerForHook extends StObject {
  
  /**
    * The resolved vite config object
    */
  var config: ResolvedConfig
  
  /**
    * native Node http server instance
    */
  var httpServer: Server[
    Instantiable1[/* socket */ Socket, IncomingMessage], 
    Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
      ServerResponse[IncomingMessage]
    ]
  ]
  
  /**
    * A connect app instance.
    * - Can be used to attach custom middlewares to the preview server.
    * - Can also be used as the handler function of a custom http server
    *   or as a middleware in any connect-style Node.js frameworks
    *
    * https://github.com/senchalabs/connect#use-middleware
    */
  def middlewares(
    req: typings.node.nodeColonhttpMod.IncomingMessage,
    res: typings.node.nodeColonhttpMod.ServerResponse[IncomingMessage]
  ): Unit
  def middlewares(
    req: typings.node.nodeColonhttpMod.IncomingMessage,
    res: typings.node.nodeColonhttpMod.ServerResponse[IncomingMessage],
    next: js.Function
  ): Unit
  /**
    * A connect app instance.
    * - Can be used to attach custom middlewares to the preview server.
    * - Can also be used as the handler function of a custom http server
    *   or as a middleware in any connect-style Node.js frameworks
    *
    * https://github.com/senchalabs/connect#use-middleware
    */
  @JSName("middlewares")
  var middlewares_Original: typings.vite.mod.Connect.Server
  
  /**
    * Print server urls
    */
  def printUrls(): Unit
  
  /**
    * The resolved urls Vite prints on the CLI
    */
  var resolvedUrls: ResolvedServerUrls | Null
}
object PreviewServerForHook {
  
  inline def apply(
    config: ResolvedConfig,
    httpServer: Server[
      Instantiable1[/* socket */ Socket, IncomingMessage], 
      Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        ServerResponse[IncomingMessage]
      ]
    ],
    middlewares: typings.vite.mod.Connect.Server,
    printUrls: () => Unit
  ): PreviewServerForHook = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], httpServer = httpServer.asInstanceOf[js.Any], middlewares = middlewares.asInstanceOf[js.Any], printUrls = js.Any.fromFunction0(printUrls), resolvedUrls = null)
    __obj.asInstanceOf[PreviewServerForHook]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PreviewServerForHook] (val x: Self) extends AnyVal {
    
    inline def setConfig(value: ResolvedConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setHttpServer(
      value: Server[
          Instantiable1[/* socket */ Socket, IncomingMessage], 
          Instantiable1[
            /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
            ServerResponse[IncomingMessage]
          ]
        ]
    ): Self = StObject.set(x, "httpServer", value.asInstanceOf[js.Any])
    
    inline def setMiddlewares(value: typings.vite.mod.Connect.Server): Self = StObject.set(x, "middlewares", value.asInstanceOf[js.Any])
    
    inline def setPrintUrls(value: () => Unit): Self = StObject.set(x, "printUrls", js.Any.fromFunction0(value))
    
    inline def setResolvedUrls(value: ResolvedServerUrls): Self = StObject.set(x, "resolvedUrls", value.asInstanceOf[js.Any])
    
    inline def setResolvedUrlsNull: Self = StObject.set(x, "resolvedUrls", null)
  }
}
