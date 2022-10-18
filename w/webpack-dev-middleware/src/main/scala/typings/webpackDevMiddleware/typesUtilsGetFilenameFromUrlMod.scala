package typings.webpackDevMiddleware

import typings.webpackDevMiddleware.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUtilsGetFilenameFromUrlMod {
  
  /**
    * @template {IncomingMessage} Request
    * @template {ServerResponse} Response
    * @param {import("../index.js").Context<Request, Response>} context
    * @param {string} url
    * @returns {string | undefined}
    */
  inline def apply[Request_1 /* <: typings.node.httpMod.IncomingMessage */, Response_1 /* <: typings.webpackDevMiddleware.mod.ServerResponse */](context: Context[Request_1, Response_1], url: String): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].apply(context.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  
  @JSImport("webpack-dev-middleware/types/utils/getFilenameFromUrl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type IncomingMessage = typings.webpackDevMiddleware.mod.IncomingMessage
  
  type ServerResponse = typings.webpackDevMiddleware.mod.ServerResponse
}
