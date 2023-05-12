package typings.vite.mod

import org.scalablytyped.runtime.Instantiable1
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.node.nodeColonhttpMod.Server
import typings.node.nodeColonnetMod.Socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreviewServer
  extends StObject
     with PreviewServerForHook {
  
  @JSName("resolvedUrls")
  var resolvedUrls_PreviewServer: ResolvedServerUrls
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
    middlewares: typings.vite.mod.Connect.Server,
    printUrls: () => Unit,
    resolvedUrls: ResolvedServerUrls
  ): PreviewServer = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], httpServer = httpServer.asInstanceOf[js.Any], middlewares = middlewares.asInstanceOf[js.Any], printUrls = js.Any.fromFunction0(printUrls), resolvedUrls = resolvedUrls.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviewServer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PreviewServer] (val x: Self) extends AnyVal {
    
    inline def setResolvedUrls(value: ResolvedServerUrls): Self = StObject.set(x, "resolvedUrls", value.asInstanceOf[js.Any])
  }
}
