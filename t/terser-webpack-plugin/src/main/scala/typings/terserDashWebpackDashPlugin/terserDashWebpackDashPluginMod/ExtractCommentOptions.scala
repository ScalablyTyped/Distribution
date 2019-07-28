package typings.terserDashWebpackDashPlugin.terserDashWebpackDashPluginMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtractCommentOptions extends js.Object {
  var banner: js.UndefOr[Boolean | String | FormatFn] = js.undefined
  var condition: Boolean | String | RegExp | ExtractCommentFn | js.Object
  var filename: js.UndefOr[String | FormatFn] = js.undefined
}

object ExtractCommentOptions {
  @scala.inline
  def apply(
    condition: Boolean | String | RegExp | ExtractCommentFn | js.Object,
    banner: Boolean | String | FormatFn = null,
    filename: String | FormatFn = null
  ): ExtractCommentOptions = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any])
    if (banner != null) __obj.updateDynamic("banner")(banner.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtractCommentOptions]
  }
}

