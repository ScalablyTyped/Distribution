package typings.webpack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type BannerPlugin = typings.webpack.mod.BannerPlugin_
  /**
    * @deprecated Use RuleSetCondition instead
    */
  type Condition = typings.webpack.mod.RuleSetCondition
  type ConfigurationFactory = js.Function2[
    /* env */ java.lang.String | (typings.std.Record[java.lang.String, scala.Boolean | scala.Double | java.lang.String]), 
    /* args */ typings.webpack.mod.CliConfigOptions, 
    typings.webpack.mod.Configuration | js.Promise[typings.webpack.mod.Configuration]
  ]
  type DllPlugin = typings.webpack.mod.DllPlugin_
  type DllReferencePlugin = typings.webpack.mod.DllReferencePlugin_
  type Entry = org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]]
  type EntryFunc = js.Function0[
    java.lang.String | js.Array[java.lang.String] | typings.webpack.mod.Entry | (js.Promise[java.lang.String | js.Array[java.lang.String] | typings.webpack.mod.Entry])
  ]
  type EvalSourceMapDevToolPlugin = typings.webpack.mod.EvalSourceMapDevToolPlugin_
  /** @deprecated use webpack.EvalSourceMapDevToolPlugin.Options */
  type EvalSourceMapDevToolPluginOptions = typings.webpack.mod.EvalSourceMapDevToolPlugin.Options
  type ExternalsElement = java.lang.String | typings.std.RegExp | typings.webpack.mod.ExternalsObjectElement | typings.webpack.mod.ExternalsFunctionElement
  type ExternalsFunctionElement = js.Function3[
    /* context */ js.Any, 
    /* request */ js.Any, 
    /* callback */ typings.webpack.mod.ExternalsFunctionCallback, 
    js.Any
  ]
  type ExternalsObjectElement = org.scalablytyped.runtime.StringDictionary[
    scala.Boolean | java.lang.String | js.Array[java.lang.String] | (typings.std.Record[java.lang.String, java.lang.String | js.Array[java.lang.String]])
  ]
  type ICompiler = typings.webpack.mod.ICompiler_
  type Loader_ = java.lang.String | typings.webpack.mod.NewLoader
  type MultiConfigurationFactory = js.Function2[
    /* env */ java.lang.String | (typings.std.Record[java.lang.String, scala.Boolean | scala.Double | java.lang.String]), 
    /* args */ typings.webpack.mod.CliConfigOptions, 
    js.Array[typings.webpack.mod.Configuration] | js.Promise[js.Array[typings.webpack.mod.Configuration]]
  ]
  /** @deprecated use webpack.Options.Performance */
  type PerformanceOptions = typings.webpack.mod.Options.Performance
  type ProgressPlugin = typings.webpack.mod.ProgressPlugin_
  /**
    * @deprecated Use RuleSetRule instead
    */
  type Rule = typings.webpack.mod.RuleSetRule
  /* Rewritten from type alias, can be one of: 
    - typings.std.RegExp
    - java.lang.String
    - js.Function1[/ * path * / java.lang.String, scala.Boolean]
    - typings.webpack.mod.RuleSetConditions
    - typings.webpack.anon.And
  */
  type RuleSetCondition = typings.webpack.mod._RuleSetCondition | (js.Function1[/* path */ java.lang.String, scala.Boolean]) | typings.std.RegExp | java.lang.String
  type RuleSetQuery = java.lang.String | org.scalablytyped.runtime.StringDictionary[js.Any]
  type RuleSetUse = typings.webpack.mod.RuleSetUseItem | js.Array[typings.webpack.mod.RuleSetUseItem] | (js.Function1[
    /* data */ js.Any, 
    typings.webpack.mod.RuleSetUseItem | js.Array[typings.webpack.mod.RuleSetUseItem]
  ])
  type RuleSetUseItem = java.lang.String | typings.webpack.mod.RuleSetLoader | (js.Function1[/* data */ js.Any, java.lang.String | typings.webpack.mod.RuleSetLoader])
  type SourceMapDevToolPlugin = typings.webpack.mod.SourceMapDevToolPlugin_
  /** @deprecated use webpack.SourceMapDevToolPlugin.Options */
  type SourceMapDevToolPluginOptions = typings.webpack.mod.SourceMapDevToolPlugin.Options
  type Stats = typings.webpack.mod.Stats_
  /** @deprecated use webpack.optimize.UglifyJsPlugin.CommentFilter */
  type UglifyCommentFunction = typings.webpack.mod.optimize.UglifyJsPlugin.CommentFilter
  /** @deprecated use webpack.optimize.UglifyJsPlugin.Options */
  type UglifyPluginOptions = typings.webpack.mod.optimize.UglifyJsPlugin.Options
  /** @deprecated use webpack.Options.WatchOptions */
  type WatchOptions = typings.webpack.mod.Options.WatchOptions
}
