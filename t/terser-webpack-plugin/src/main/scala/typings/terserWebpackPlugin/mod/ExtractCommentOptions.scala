package typings.terserWebpackPlugin.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtractCommentOptions extends js.Object {
  var banner: js.UndefOr[Boolean | String | FormatFn] = js.native
  var condition: String | RegExp | ExtractCommentFn = js.native
  var filename: js.UndefOr[String | FilenameFn] = js.native
}

object ExtractCommentOptions {
  @scala.inline
  def apply(condition: String | RegExp | ExtractCommentFn): ExtractCommentOptions = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtractCommentOptions]
  }
  @scala.inline
  implicit class ExtractCommentOptionsOps[Self <: ExtractCommentOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConditionFunction2(value: (/* astNode */ js.Any, /* comment */ js.Any) => Boolean | js.Object): Self = this.set("condition", js.Any.fromFunction2(value))
    @scala.inline
    def setCondition(value: String | RegExp | ExtractCommentFn): Self = this.set("condition", value.asInstanceOf[js.Any])
    @scala.inline
    def setBannerFunction1(value: /* input */ String => String): Self = this.set("banner", js.Any.fromFunction1(value))
    @scala.inline
    def setBanner(value: Boolean | String | FormatFn): Self = this.set("banner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBanner: Self = this.set("banner", js.undefined)
    @scala.inline
    def setFilenameFunction1(value: /* fileData */ FileData => String): Self = this.set("filename", js.Any.fromFunction1(value))
    @scala.inline
    def setFilename(value: String | FilenameFn): Self = this.set("filename", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
  }
  
}

