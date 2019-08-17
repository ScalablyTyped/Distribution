package typings.webpackDashBundleDashAnalyzer.webpackDashBundleDashAnalyzerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object BundleAnalyzerPluginNs {
  import typings.std.RegExp

  type ExcludeAssetsPattern = String | RegExp | ExcludeAssetsPatternFn
  type ExcludeAssetsPatternFn = js.Function1[/* assetName */ String, Boolean]
}
