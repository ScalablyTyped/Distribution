package typings.vite.anon

import org.scalablytyped.runtime.Instantiable1
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.node.nodeColonhttpMod.Server
import typings.node.nodeColonnetMod.Socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpServer extends StObject {
  
  var httpServer: Server[
    Instantiable1[/* socket */ Socket, IncomingMessage], 
    Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
      ServerResponse[IncomingMessage]
    ]
  ]
  
  def middlewares(
    req: typings.node.nodeColonhttpMod.IncomingMessage,
    res: typings.node.nodeColonhttpMod.ServerResponse[IncomingMessage]
  ): Unit
  def middlewares(
    req: typings.node.nodeColonhttpMod.IncomingMessage,
    res: typings.node.nodeColonhttpMod.ServerResponse[IncomingMessage],
    next: js.Function
  ): Unit
  @JSName("middlewares")
  var middlewares_Original: typings.vite.mod.Connect.Server
}
object HttpServer {
  
  inline def apply(
    httpServer: Server[
      Instantiable1[/* socket */ Socket, IncomingMessage], 
      Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        ServerResponse[IncomingMessage]
      ]
    ],
    middlewares: typings.vite.mod.Connect.Server
  ): HttpServer = {
    val __obj = js.Dynamic.literal(httpServer = httpServer.asInstanceOf[js.Any], middlewares = middlewares.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpServer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HttpServer] (val x: Self) extends AnyVal {
    
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
  }
}
