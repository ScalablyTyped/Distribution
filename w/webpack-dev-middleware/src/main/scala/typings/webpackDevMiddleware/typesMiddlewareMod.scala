package typings.webpackDevMiddleware

import typings.webpackDevMiddleware.mod.Context
import typings.webpackDevMiddleware.mod.Middleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMiddlewareMod {
  
  /**
    * @template {IncomingMessage} Request
    * @template {ServerResponse} Response
    * @param {import("./index.js").Context<Request, Response>} context
    * @return {import("./index.js").Middleware<Request, Response>}
    */
  inline def apply[Request_1 /* <: typings.node.httpMod.IncomingMessage */, Response_1 /* <: typings.webpackDevMiddleware.mod.ServerResponse */](context: Context[Request_1, Response_1]): Middleware[Request_1, Response_1] = ^.asInstanceOf[js.Dynamic].apply(context.asInstanceOf[js.Any]).asInstanceOf[Middleware[Request_1, Response_1]]
  
  @JSImport("webpack-dev-middleware/types/middleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type IncomingMessage = typings.webpackDevMiddleware.mod.IncomingMessage
  
  type NextFunction = typings.webpackDevMiddleware.mod.NextFunction
  
  type ServerResponse = typings.webpackDevMiddleware.mod.ServerResponse
}
