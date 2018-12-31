package typings
package uglifyjsDashWebpackDashPluginLib.uglifyjsDashWebpackDashPluginMod.UglifyJsPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UglifyJsPluginOptions extends js.Object {
  var cache: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  var exclude: js.UndefOr[stdLib.RegExp | js.Array[stdLib.RegExp]] = js.undefined
  var extractComments: js.UndefOr[
    scala.Boolean | stdLib.RegExp | (js.Function2[/* node */ js.Object, /* comment */ java.lang.String, scala.Boolean]) | ExtractCommentsOptions
  ] = js.undefined
  var include: js.UndefOr[stdLib.RegExp | js.Array[stdLib.RegExp]] = js.undefined
  var parallel: js.UndefOr[scala.Boolean | scala.Double] = js.undefined
  var sourceMap: js.UndefOr[scala.Boolean] = js.undefined
  var test: js.UndefOr[stdLib.RegExp | js.Array[stdLib.RegExp]] = js.undefined
  var uglifyOptions: js.UndefOr[UglifyJsOptions] = js.undefined
  var warningsFilter: js.UndefOr[js.Function1[/* source */ java.lang.String, scala.Boolean]] = js.undefined
}

