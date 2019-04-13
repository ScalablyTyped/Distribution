package typings
package webpackLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object webpackMod {
  type AuxiliaryCommentObject = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in webpack.webpack.LibraryTarget ]: string}
    */ webpackLib.webpackLibStrings.AuxiliaryCommentObject with js.Any
  /**
    * @deprecated Use RuleSetCondition instead
    */
  type Condition = RuleSetCondition
  type Entry = org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]]
  type EntryFunc = js.Function0[
    java.lang.String | js.Array[java.lang.String] | Entry | (js.Promise[java.lang.String | js.Array[java.lang.String] | Entry])
  ]
  /** @deprecated use webpack.EvalSourceMapDevToolPlugin.Options */
  type EvalSourceMapDevToolPluginOptions = webpackLib.webpackMod.EvalSourceMapDevToolPluginNs.Options
  type ExternalsElement = java.lang.String | stdLib.RegExp | ExternalsObjectElement | ExternalsFunctionElement
  type ExternalsFunctionElement = js.Function3[
    /* context */ js.Any, 
    /* request */ js.Any, 
    /* callback */ js.Function2[/* error */ js.Any, /* result */ js.Any, scala.Unit], 
    js.Any
  ]
  type ExternalsObjectElement = org.scalablytyped.runtime.StringDictionary[
    scala.Boolean | java.lang.String | js.Array[java.lang.String] | (stdLib.Record[java.lang.String, java.lang.String | js.Array[java.lang.String]])
  ]
  type Loader = java.lang.String | NewLoader
  /** @deprecated use webpack.Options.Performance */
  type PerformanceOptions = webpackLib.webpackMod.OptionsNs.Performance
  /**
    * @deprecated Use RuleSetRule instead
    */
  type Rule = RuleSetRule
  /* Rewritten from type alias, can be one of: 
    - stdLib.RegExp
    - java.lang.String
    - js.Function1[/ * path * / java.lang.String, scala.Boolean]
    - RuleSetConditions
    - webpackLib.Anon_And
  */
  type RuleSetCondition = _RuleSetCondition | (js.Function1[/* path */ java.lang.String, scala.Boolean]) | stdLib.RegExp | java.lang.String
  type RuleSetQuery = java.lang.String | org.scalablytyped.runtime.StringDictionary[js.Any]
  type RuleSetUse = RuleSetUseItem | js.Array[RuleSetUseItem] | (js.Function1[/* data */ js.Any, RuleSetUseItem | js.Array[RuleSetUseItem]])
  type RuleSetUseItem = java.lang.String | RuleSetLoader | (js.Function1[/* data */ js.Any, java.lang.String | RuleSetLoader])
  /** @deprecated use webpack.SourceMapDevToolPlugin.Options */
  type SourceMapDevToolPluginOptions = webpackLib.webpackMod.SourceMapDevToolPluginNs.Options
  /** @deprecated use webpack.optimize.UglifyJsPlugin.CommentFilter */
  type UglifyCommentFunction = webpackLib.webpackMod.optimizeNs.UglifyJsPluginNs.CommentFilter
  /** @deprecated use webpack.optimize.UglifyJsPlugin.Options */
  type UglifyPluginOptions = webpackLib.webpackMod.optimizeNs.UglifyJsPluginNs.Options
  /** @deprecated use webpack.Options.WatchOptions */
  type WatchOptions = webpackLib.webpackMod.OptionsNs.WatchOptions
}
