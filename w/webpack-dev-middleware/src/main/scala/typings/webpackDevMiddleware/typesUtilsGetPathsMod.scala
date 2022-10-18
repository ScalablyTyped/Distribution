package typings.webpackDevMiddleware

import typings.webpackDevMiddleware.anon.OutputPath
import typings.webpackDevMiddleware.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUtilsGetPathsMod {
  
  /** @typedef {import("webpack").Compiler} Compiler */
  /** @typedef {import("webpack").Stats} Stats */
  /** @typedef {import("webpack").MultiStats} MultiStats */
  /** @typedef {import("../index.js").IncomingMessage} IncomingMessage */
  /** @typedef {import("../index.js").ServerResponse} ServerResponse */
  /**
    * @template {IncomingMessage} Request
    * @template {ServerResponse} Response
    * @param {import("../index.js").Context<Request, Response>} context
    */
  inline def apply[Request_1 /* <: typings.node.httpMod.IncomingMessage */, Response_1 /* <: typings.webpackDevMiddleware.mod.ServerResponse */](context: Context[Request_1, Response_1]): js.Array[OutputPath] = ^.asInstanceOf[js.Dynamic].apply(context.asInstanceOf[js.Any]).asInstanceOf[js.Array[OutputPath]]
  
  @JSImport("webpack-dev-middleware/types/utils/getPaths", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Compiler = typings.webpack.mod.Compiler
  
  type IncomingMessage = typings.webpackDevMiddleware.mod.IncomingMessage
  
  type MultiStats = typings.webpack.mod.MultiStats
  
  type ServerResponse = typings.webpackDevMiddleware.mod.ServerResponse
  
  type Stats = typings.webpack.mod.Stats
}
