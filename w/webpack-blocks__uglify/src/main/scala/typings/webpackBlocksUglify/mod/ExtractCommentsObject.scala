package typings.webpackBlocksUglify.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtractCommentsObject extends js.Object {
  var banner: js.UndefOr[Boolean | String | FileNameFunction] = js.native
  var condition: js.UndefOr[Boolean | String | RegExp | ExtractCommentsFunction] = js.native
  var filename: js.UndefOr[RegExp | FileNameFunction] = js.native
}

object ExtractCommentsObject {
  @scala.inline
  def apply(): ExtractCommentsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtractCommentsObject]
  }
  @scala.inline
  implicit class ExtractCommentsObjectOps[Self <: ExtractCommentsObject] (val x: Self) extends AnyVal {
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
    def setBannerFunction1(value: /* file */ String => String): Self = this.set("banner", js.Any.fromFunction1(value))
    @scala.inline
    def setBanner(value: Boolean | String | FileNameFunction): Self = this.set("banner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBanner: Self = this.set("banner", js.undefined)
    @scala.inline
    def setConditionFunction2(value: (/* node */ js.Any, /* comment */ js.Any) => Boolean | ExtractCommentsObject): Self = this.set("condition", js.Any.fromFunction2(value))
    @scala.inline
    def setCondition(value: Boolean | String | RegExp | ExtractCommentsFunction): Self = this.set("condition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCondition: Self = this.set("condition", js.undefined)
    @scala.inline
    def setFilenameFunction1(value: /* file */ String => String): Self = this.set("filename", js.Any.fromFunction1(value))
    @scala.inline
    def setFilename(value: RegExp | FileNameFunction): Self = this.set("filename", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
  }
  
}

