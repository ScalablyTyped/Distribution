package typings.terser.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MangleOptions extends js.Object {
  var eval: js.UndefOr[Boolean] = js.native
  var keep_classnames: js.UndefOr[Boolean | RegExp] = js.native
  var keep_fnames: js.UndefOr[Boolean | RegExp] = js.native
  var module: js.UndefOr[Boolean] = js.native
  var properties: js.UndefOr[Boolean | ManglePropertiesOptions] = js.native
  var reserved: js.UndefOr[js.Array[String]] = js.native
  var safari10: js.UndefOr[Boolean] = js.native
  var toplevel: js.UndefOr[Boolean] = js.native
}

object MangleOptions {
  @scala.inline
  def apply(): MangleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MangleOptions]
  }
  @scala.inline
  implicit class MangleOptionsOps[Self <: MangleOptions] (val x: Self) extends AnyVal {
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
    def setEval(value: Boolean): Self = this.set("eval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEval: Self = this.set("eval", js.undefined)
    @scala.inline
    def setKeep_classnames(value: Boolean | RegExp): Self = this.set("keep_classnames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeep_classnames: Self = this.set("keep_classnames", js.undefined)
    @scala.inline
    def setKeep_fnames(value: Boolean | RegExp): Self = this.set("keep_fnames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeep_fnames: Self = this.set("keep_fnames", js.undefined)
    @scala.inline
    def setModule(value: Boolean): Self = this.set("module", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModule: Self = this.set("module", js.undefined)
    @scala.inline
    def setProperties(value: Boolean | ManglePropertiesOptions): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    @scala.inline
    def setReservedVarargs(value: String*): Self = this.set("reserved", js.Array(value :_*))
    @scala.inline
    def setReserved(value: js.Array[String]): Self = this.set("reserved", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReserved: Self = this.set("reserved", js.undefined)
    @scala.inline
    def setSafari10(value: Boolean): Self = this.set("safari10", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSafari10: Self = this.set("safari10", js.undefined)
    @scala.inline
    def setToplevel(value: Boolean): Self = this.set("toplevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToplevel: Self = this.set("toplevel", js.undefined)
  }
  
}

