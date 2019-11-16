package typings.webpack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object webpackMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.std.Record
  import typings.std.RegExp
  import typings.webpack.webpackMod.Options.Performance
  import typings.webpack.webpackMod.optimize.UglifyJsPlugin.CommentFilter

  type AuxiliaryCommentObject = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in webpack.webpack.LibraryTarget ]: string}
    */ typings.webpack.webpackStrings.AuxiliaryCommentObject with js.Any
  type BannerPlugin = BannerPlugin_
  /**
    * @deprecated Use RuleSetCondition instead
    */
  type Condition = RuleSetCondition
  type ConfigurationFactory = js.Function2[
    /* env */ String | (Record[String, Boolean | Double | String]), 
    /* args */ CliConfigOptions, 
    Configuration | js.Promise[Configuration]
  ]
  type DllPlugin = DllPlugin_
  type DllReferencePlugin = DllReferencePlugin_
  type Entry = StringDictionary[String | js.Array[String]]
  type EntryFunc = js.Function0[
    String | js.Array[String] | Entry | (js.Promise[String | js.Array[String] | Entry])
  ]
  type EvalSourceMapDevToolPlugin = EvalSourceMapDevToolPlugin_
  /** @deprecated use webpack.EvalSourceMapDevToolPlugin.Options */
  type EvalSourceMapDevToolPluginOptions = typings.webpack.webpackMod.EvalSourceMapDevToolPlugin.Options
  type ExternalsElement = String | RegExp | ExternalsObjectElement | ExternalsFunctionElement
  type ExternalsFunctionElement = js.Function3[
    /* context */ js.Any, 
    /* request */ js.Any, 
    /* callback */ js.Function2[/* error */ js.Any, /* result */ js.Any, Unit], 
    js.Any
  ]
  type ExternalsObjectElement = StringDictionary[
    Boolean | String | js.Array[String] | (Record[String, String | js.Array[String]])
  ]
  type ICompiler = ICompiler_
  type Loader = String | NewLoader
  type MultiConfigurationFactory = js.Function2[
    /* env */ String | (Record[String, Boolean | Double | String]), 
    /* args */ CliConfigOptions, 
    js.Array[Configuration] | js.Promise[js.Array[Configuration]]
  ]
  /** @deprecated use webpack.Options.Performance */
  type PerformanceOptions = Performance
  /**
    * @deprecated Use RuleSetRule instead
    */
  type Rule = RuleSetRule
  /* Rewritten from type alias, can be one of: 
    - typings.std.RegExp
    - java.lang.String
    - js.Function1[/ * path * / java.lang.String, scala.Boolean]
    - typings.webpack.webpackMod.RuleSetConditions
    - typings.webpack.Anon_And
  */
  type RuleSetCondition = _RuleSetCondition | (js.Function1[/* path */ String, Boolean]) | RegExp | String
  type RuleSetQuery = String | StringDictionary[js.Any]
  type RuleSetUse = RuleSetUseItem | js.Array[RuleSetUseItem] | (js.Function1[/* data */ js.Any, RuleSetUseItem | js.Array[RuleSetUseItem]])
  type RuleSetUseItem = String | RuleSetLoader | (js.Function1[/* data */ js.Any, String | RuleSetLoader])
  type SourceMapDevToolPlugin = SourceMapDevToolPlugin_
  /** @deprecated use webpack.SourceMapDevToolPlugin.Options */
  type SourceMapDevToolPluginOptions = typings.webpack.webpackMod.SourceMapDevToolPlugin.Options
  type Stats = Stats_
  /** @deprecated use webpack.optimize.UglifyJsPlugin.CommentFilter */
  type UglifyCommentFunction = CommentFilter
  /** @deprecated use webpack.optimize.UglifyJsPlugin.Options */
  type UglifyPluginOptions = typings.webpack.webpackMod.optimize.UglifyJsPlugin.Options
  /** @deprecated use webpack.Options.WatchOptions */
  type WatchOptions = typings.webpack.webpackMod.Options.WatchOptions
}
