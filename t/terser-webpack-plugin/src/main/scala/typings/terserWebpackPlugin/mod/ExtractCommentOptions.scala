package typings.terserWebpackPlugin.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtractCommentOptions extends js.Object {
  var banner: js.UndefOr[Boolean | String | FormatFn] = js.undefined
  var condition: String | RegExp | ExtractCommentFn
  var filename: js.UndefOr[String | FilenameFn] = js.undefined
}

object ExtractCommentOptions {
  @scala.inline
  def apply(
    condition: String | RegExp | ExtractCommentFn,
    banner: Boolean | String | FormatFn = null,
    filename: String | FilenameFn = null
  ): ExtractCommentOptions = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any])
    if (banner != null) __obj.updateDynamic("banner")(banner.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtractCommentOptions]
  }
}

