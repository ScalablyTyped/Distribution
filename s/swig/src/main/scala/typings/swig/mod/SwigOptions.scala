package typings.swig.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwigOptions extends js.Object {
  var autoescape: js.UndefOr[Boolean] = js.native
  var cache: js.UndefOr[js.Any] = js.native
  var cmtControls: js.UndefOr[js.Array[String]] = js.native
  var loader: js.UndefOr[TemplateLoader] = js.native
  var locals: js.UndefOr[js.Any] = js.native
  var tagControls: js.UndefOr[js.Array[String]] = js.native
  var varControls: js.UndefOr[js.Array[String]] = js.native
}

object SwigOptions {
  @scala.inline
  def apply(): SwigOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwigOptions]
  }
  @scala.inline
  implicit class SwigOptionsOps[Self <: SwigOptions] (val x: Self) extends AnyVal {
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
    def setAutoescape(value: Boolean): Self = this.set("autoescape", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoescape: Self = this.set("autoescape", js.undefined)
    @scala.inline
    def setCache(value: js.Any): Self = this.set("cache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    @scala.inline
    def setCmtControlsVarargs(value: String*): Self = this.set("cmtControls", js.Array(value :_*))
    @scala.inline
    def setCmtControls(value: js.Array[String]): Self = this.set("cmtControls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCmtControls: Self = this.set("cmtControls", js.undefined)
    @scala.inline
    def setLoader(value: TemplateLoader): Self = this.set("loader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoader: Self = this.set("loader", js.undefined)
    @scala.inline
    def setLocals(value: js.Any): Self = this.set("locals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocals: Self = this.set("locals", js.undefined)
    @scala.inline
    def setTagControlsVarargs(value: String*): Self = this.set("tagControls", js.Array(value :_*))
    @scala.inline
    def setTagControls(value: js.Array[String]): Self = this.set("tagControls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagControls: Self = this.set("tagControls", js.undefined)
    @scala.inline
    def setVarControlsVarargs(value: String*): Self = this.set("varControls", js.Array(value :_*))
    @scala.inline
    def setVarControls(value: js.Array[String]): Self = this.set("varControls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVarControls: Self = this.set("varControls", js.undefined)
  }
  
}

