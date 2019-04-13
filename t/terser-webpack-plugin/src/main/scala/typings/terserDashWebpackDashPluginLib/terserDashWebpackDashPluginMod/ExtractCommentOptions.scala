package typings
package terserDashWebpackDashPluginLib.terserDashWebpackDashPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtractCommentOptions extends js.Object {
  var banner: js.UndefOr[scala.Boolean | java.lang.String | FormatFn] = js.undefined
  var condition: scala.Boolean | java.lang.String | stdLib.RegExp | ExtractCommentFn | js.Object
  var filename: js.UndefOr[java.lang.String | FormatFn] = js.undefined
}

object ExtractCommentOptions {
  @scala.inline
  def apply(
    condition: scala.Boolean | java.lang.String | stdLib.RegExp | ExtractCommentFn | js.Object,
    banner: scala.Boolean | java.lang.String | FormatFn = null,
    filename: java.lang.String | FormatFn = null
  ): ExtractCommentOptions = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any])
    if (banner != null) __obj.updateDynamic("banner")(banner.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtractCommentOptions]
  }
}

