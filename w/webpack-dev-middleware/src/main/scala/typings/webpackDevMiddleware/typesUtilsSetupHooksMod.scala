package typings.webpackDevMiddleware

import typings.std.Exclude
import typings.webpackDevMiddleware.mod.Context
import typings.webpackDevMiddleware.webpackDevMiddlewareStrings.`errors-only`
import typings.webpackDevMiddleware.webpackDevMiddlewareStrings.`errors-warnings`
import typings.webpackDevMiddleware.webpackDevMiddlewareStrings.detailed
import typings.webpackDevMiddleware.webpackDevMiddlewareStrings.minimal
import typings.webpackDevMiddleware.webpackDevMiddlewareStrings.none
import typings.webpackDevMiddleware.webpackDevMiddlewareStrings.normal
import typings.webpackDevMiddleware.webpackDevMiddlewareStrings.summary
import typings.webpackDevMiddleware.webpackDevMiddlewareStrings.verbose
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUtilsSetupHooksMod {
  
  /** @typedef {import("webpack").Configuration} Configuration */
  /** @typedef {import("webpack").Compiler} Compiler */
  /** @typedef {import("webpack").MultiCompiler} MultiCompiler */
  /** @typedef {import("webpack").Stats} Stats */
  /** @typedef {import("webpack").MultiStats} MultiStats */
  /** @typedef {import("../index.js").IncomingMessage} IncomingMessage */
  /** @typedef {import("../index.js").ServerResponse} ServerResponse */
  /** @typedef {Configuration["stats"]} StatsOptions */
  /** @typedef {{ children: Configuration["stats"][] }} MultiStatsOptions */
  /** @typedef {Exclude<Configuration["stats"], boolean | string | undefined>} NormalizedStatsOptions */
  /**
    * @template {IncomingMessage} Request
    * @template {ServerResponse} Response
    * @param {import("../index.js").Context<Request, Response>} context
    */
  inline def apply[Request_1 /* <: typings.node.httpMod.IncomingMessage */, Response_1 /* <: typings.webpackDevMiddleware.mod.ServerResponse */](context: Context[Request_1, Response_1]): Unit = ^.asInstanceOf[js.Dynamic].apply(context.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("webpack-dev-middleware/types/utils/setupHooks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Compiler = typings.webpack.mod.Compiler
  
  type Configuration = typings.webpack.mod.Configuration
  
  type IncomingMessage = typings.webpackDevMiddleware.mod.IncomingMessage
  
  type MultiCompiler = typings.webpack.mod.MultiCompiler
  
  type MultiStats = typings.webpack.mod.MultiStats
  
  trait MultiStatsOptions extends StObject {
    
    var children: js.Array[
        js.UndefOr[
          Boolean | typings.webpack.mod.StatsOptions | none | verbose | summary | `errors-only` | `errors-warnings` | minimal | normal | detailed
        ]
      ]
  }
  object MultiStatsOptions {
    
    inline def apply(
      children: js.Array[
          js.UndefOr[
            Boolean | typings.webpack.mod.StatsOptions | none | verbose | summary | `errors-only` | `errors-warnings` | minimal | normal | detailed
          ]
        ]
    ): MultiStatsOptions = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[MultiStatsOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MultiStatsOptions] (val x: Self) extends AnyVal {
      
      inline def setChildren(
        value: js.Array[
              js.UndefOr[
                Boolean | typings.webpack.mod.StatsOptions | none | verbose | summary | `errors-only` | `errors-warnings` | minimal | normal | detailed
              ]
            ]
      ): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(
        value: (js.UndefOr[
              Boolean | typings.webpack.mod.StatsOptions | none | verbose | summary | `errors-only` | `errors-warnings` | minimal | normal | detailed
            ])*
      ): Self = StObject.set(x, "children", js.Array(value*))
    }
  }
  
  type NormalizedStatsOptions = Exclude[
    js.UndefOr[
      Boolean | typings.webpack.mod.StatsOptions | none | verbose | summary | `errors-only` | `errors-warnings` | minimal | normal | detailed
    ], 
    js.UndefOr[Boolean | String]
  ]
  
  type ServerResponse = typings.webpackDevMiddleware.mod.ServerResponse
  
  type Stats = typings.webpack.mod.Stats
  
  /* Rewritten from type alias, can be one of: 
    - scala.Boolean
    - typings.webpack.mod.StatsOptions
    - typings.webpackDevMiddleware.webpackDevMiddlewareStrings.none
    - typings.webpackDevMiddleware.webpackDevMiddlewareStrings.verbose
    - typings.webpackDevMiddleware.webpackDevMiddlewareStrings.summary
    - typings.webpackDevMiddleware.webpackDevMiddlewareStrings.`errors-only`
    - typings.webpackDevMiddleware.webpackDevMiddlewareStrings.`errors-warnings`
    - typings.webpackDevMiddleware.webpackDevMiddlewareStrings.minimal
    - typings.webpackDevMiddleware.webpackDevMiddlewareStrings.normal
    - typings.webpackDevMiddleware.webpackDevMiddlewareStrings.detailed
    - scala.Unit
  */
  type StatsOptions = js.UndefOr[_StatsOptions | Boolean | typings.webpack.mod.StatsOptions]
  
  trait _StatsOptions extends StObject
}
