package typings
package terserLib.terserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MinifyOptions extends js.Object {
  var compress: js.UndefOr[scala.Boolean | CompressOptions] = js.undefined
  var fromString: js.UndefOr[scala.Boolean] = js.undefined
  var inSourceMap: js.UndefOr[java.lang.String] = js.undefined
  var mangle: js.UndefOr[scala.Boolean | MangleOptions] = js.undefined
  var nameCache: js.UndefOr[js.Object] = js.undefined
  var outSourceMap: js.UndefOr[java.lang.String] = js.undefined
  var output: js.UndefOr[OutputOptions] = js.undefined
  var sourceRoot: js.UndefOr[java.lang.String] = js.undefined
  var spidermonkey: js.UndefOr[scala.Boolean] = js.undefined
  var warnings: js.UndefOr[scala.Boolean] = js.undefined
}

