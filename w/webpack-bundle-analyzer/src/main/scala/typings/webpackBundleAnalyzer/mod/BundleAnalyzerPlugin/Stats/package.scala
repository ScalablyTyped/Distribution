package typings.webpackBundleAnalyzer.mod.BundleAnalyzerPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Stats {
  
  /* Rewritten from type alias, can be one of: 
    - scala.Boolean
    - typings.webpackBundleAnalyzer.webpackBundleAnalyzerStrings.`errors-only`
    - typings.webpackBundleAnalyzer.webpackBundleAnalyzerStrings.`errors-warnings`
    - typings.webpackBundleAnalyzer.webpackBundleAnalyzerStrings.minimal
    - typings.webpackBundleAnalyzer.webpackBundleAnalyzerStrings.none
    - typings.webpackBundleAnalyzer.webpackBundleAnalyzerStrings.normal
    - typings.webpackBundleAnalyzer.webpackBundleAnalyzerStrings.verbose
  */
  type Preset = typings.webpackBundleAnalyzer.mod.BundleAnalyzerPlugin.Stats._Preset | scala.Boolean
  
  type StatsExcludeFilter = java.lang.String | (js.Array[
    (js.Function1[/* assetName */ java.lang.String, scala.Boolean]) | typings.std.RegExp | java.lang.String
  ]) | typings.std.RegExp | (js.Function1[/* assetName */ java.lang.String, scala.Boolean])
  
  /* Rewritten from type alias, can be one of: 
    - typings.webpackBundleAnalyzer.mod.BundleAnalyzerPlugin.Stats.Preset
    - typings.webpackBundleAnalyzer.mod.BundleAnalyzerPlugin.Stats.ToJsonOptionsObject
  */
  type ToJsonOptions = typings.webpackBundleAnalyzer.mod.BundleAnalyzerPlugin.Stats._ToJsonOptions | scala.Boolean
}
