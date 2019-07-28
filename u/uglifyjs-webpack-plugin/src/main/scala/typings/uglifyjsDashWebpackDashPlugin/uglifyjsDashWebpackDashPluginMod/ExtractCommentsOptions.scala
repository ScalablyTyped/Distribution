package typings.uglifyjsDashWebpackDashPlugin.uglifyjsDashWebpackDashPluginMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtractCommentsOptions extends js.Object {
  var banner: js.UndefOr[Boolean | String | (js.Function1[/* fileName */ String, String])] = js.undefined
  var condition: js.UndefOr[RegExp | (js.Function2[/* node */ js.Object, /* comment */ String, Boolean])] = js.undefined
  var filename: js.UndefOr[String | (js.Function1[/* originalFileName */ String, String])] = js.undefined
}

object ExtractCommentsOptions {
  @scala.inline
  def apply(
    banner: Boolean | String | (js.Function1[/* fileName */ String, String]) = null,
    condition: RegExp | (js.Function2[/* node */ js.Object, /* comment */ String, Boolean]) = null,
    filename: String | (js.Function1[/* originalFileName */ String, String]) = null
  ): ExtractCommentsOptions = {
    val __obj = js.Dynamic.literal()
    if (banner != null) __obj.updateDynamic("banner")(banner.asInstanceOf[js.Any])
    if (condition != null) __obj.updateDynamic("condition")(condition.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtractCommentsOptions]
  }
}

