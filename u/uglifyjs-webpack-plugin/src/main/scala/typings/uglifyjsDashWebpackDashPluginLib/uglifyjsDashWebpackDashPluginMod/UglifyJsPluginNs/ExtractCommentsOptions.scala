package typings
package uglifyjsDashWebpackDashPluginLib.uglifyjsDashWebpackDashPluginMod.UglifyJsPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ExtractCommentsOptions extends js.Object {
  var banner: js.UndefOr[
    scala.Boolean | java.lang.String | (js.Function1[/* fileName */ java.lang.String, java.lang.String])
  ] = js.undefined
  var condition: js.UndefOr[
    stdLib.RegExp | (js.Function2[/* node */ js.Object, /* comment */ java.lang.String, scala.Boolean])
  ] = js.undefined
  var filename: js.UndefOr[
    java.lang.String | (js.Function1[/* originalFileName */ java.lang.String, java.lang.String])
  ] = js.undefined
}

