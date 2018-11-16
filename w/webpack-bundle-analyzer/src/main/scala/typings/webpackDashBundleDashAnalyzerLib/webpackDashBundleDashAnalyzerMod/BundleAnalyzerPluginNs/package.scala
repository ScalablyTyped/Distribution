package typings
package webpackDashBundleDashAnalyzerLib.webpackDashBundleDashAnalyzerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object BundleAnalyzerPluginNs {
  type ExcludeAssetsPattern = java.lang.String | stdLib.RegExp | ExcludeAssetsPatternFn
  type ExcludeAssetsPatternFn = js.Function1[/* assetName */ java.lang.String, scala.Boolean]
}
