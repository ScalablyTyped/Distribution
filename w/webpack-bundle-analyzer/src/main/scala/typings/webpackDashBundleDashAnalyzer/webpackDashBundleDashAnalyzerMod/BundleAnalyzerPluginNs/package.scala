package typings.webpackDashBundleDashAnalyzer.webpackDashBundleDashAnalyzerMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object BundleAnalyzerPluginNs {
  type ExcludeAssetsPattern = String | RegExp | ExcludeAssetsPatternFn
  type ExcludeAssetsPatternFn = js.Function1[/* assetName */ String, Boolean]
}
