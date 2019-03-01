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

object ExtractCommentsOptions {
  @scala.inline
  def apply(
    banner: scala.Boolean | java.lang.String | (js.Function1[/* fileName */ java.lang.String, java.lang.String]) = null,
    condition: stdLib.RegExp | (js.Function2[/* node */ js.Object, /* comment */ java.lang.String, scala.Boolean]) = null,
    filename: java.lang.String | (js.Function1[/* originalFileName */ java.lang.String, java.lang.String]) = null
  ): ExtractCommentsOptions = {
    val __obj = js.Dynamic.literal()
    if (banner != null) __obj.updateDynamic("banner")(banner.asInstanceOf[js.Any])
    if (condition != null) __obj.updateDynamic("condition")(condition.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtractCommentsOptions]
  }
}

