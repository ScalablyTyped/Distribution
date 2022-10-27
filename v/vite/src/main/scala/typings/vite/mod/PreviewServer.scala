package typings.vite.mod

import org.scalablytyped.runtime.Instantiable1
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.node.nodeColonhttpMod.Server
import typings.node.nodeColonnetMod.Socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreviewServer extends StObject {
  
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
    * Print server urls
    */
  def printUrls(): Unit
  
  /**
    * The resolved urls Vite prints on the CLI
    */
  var resolvedUrls: ResolvedServerUrls
}
object PreviewServer {
  
  inline def apply(
    config: ResolvedConfig,
    httpServer: Server[
      Instantiable1[/* socket */ Socket, IncomingMessage], 
      Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        ServerResponse[IncomingMessage]
      ]
    ],
    printUrls: () => Unit,
    resolvedUrls: ResolvedServerUrls
  ): PreviewServer = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], httpServer = httpServer.asInstanceOf[js.Any], printUrls = js.Any.fromFunction0(printUrls), resolvedUrls = resolvedUrls.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviewServer]
  }
  
  extension [Self <: PreviewServer](x: Self) {
    
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
    
    inline def setPrintUrls(value: () => Unit): Self = StObject.set(x, "printUrls", js.Any.fromFunction0(value))
    
    inline def setResolvedUrls(value: ResolvedServerUrls): Self = StObject.set(x, "resolvedUrls", value.asInstanceOf[js.Any])
  }
}
