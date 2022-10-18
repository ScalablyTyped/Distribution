package typings.webpackDevMiddleware

import typings.webpackDevMiddleware.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUtilsReadyMod {
  
  /** @typedef {import("../index.js").IncomingMessage} IncomingMessage */
  /** @typedef {import("../index.js").ServerResponse} ServerResponse */
  /**
    * @template {IncomingMessage} Request
    * @template {ServerResponse} Response
    * @param {import("../index.js").Context<Request, Response>} context
    * @param {(...args: any[]) => any} callback
    * @param {Request} [req]
    * @returns {void}
    */
  inline def apply[Request_1 /* <: typings.node.httpMod.IncomingMessage */, Response_1 /* <: typings.webpackDevMiddleware.mod.ServerResponse */](context: Context[Request_1, Response_1], callback: js.Function1[/* repeated */ Any, Any]): Unit = (^.asInstanceOf[js.Dynamic].apply(context.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply[Request_1 /* <: typings.node.httpMod.IncomingMessage */, Response_1 /* <: typings.webpackDevMiddleware.mod.ServerResponse */](
    context: Context[Request_1, Response_1],
    callback: js.Function1[/* repeated */ Any, Any],
    req: Request_1
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(context.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], req.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("webpack-dev-middleware/types/utils/ready", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type IncomingMessage = typings.webpackDevMiddleware.mod.IncomingMessage
  
  type ServerResponse = typings.webpackDevMiddleware.mod.ServerResponse
}
