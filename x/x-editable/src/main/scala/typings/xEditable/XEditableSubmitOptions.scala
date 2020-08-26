package typings.xEditable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XEditableSubmitOptions extends js.Object {
  var ajaxOptions: js.UndefOr[js.Any] = js.native
  var data: js.UndefOr[js.Any] = js.native
  var url: js.UndefOr[js.Any] = js.native
  def error(obj: js.Any): Unit = js.native
  def success(obj: js.Any, config: js.Any): Unit = js.native
}

object XEditableSubmitOptions {
  @scala.inline
  def apply(error: js.Any => Unit, success: (js.Any, js.Any) => Unit): XEditableSubmitOptions = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), success = js.Any.fromFunction2(success))
    __obj.asInstanceOf[XEditableSubmitOptions]
  }
  @scala.inline
  implicit class XEditableSubmitOptionsOps[Self <: XEditableSubmitOptions] (val x: Self) extends AnyVal {
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
    def setError(value: js.Any => Unit): Self = this.set("error", js.Any.fromFunction1(value))
    @scala.inline
    def setSuccess(value: (js.Any, js.Any) => Unit): Self = this.set("success", js.Any.fromFunction2(value))
    @scala.inline
    def setAjaxOptions(value: js.Any): Self = this.set("ajaxOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAjaxOptions: Self = this.set("ajaxOptions", js.undefined)
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setUrl(value: js.Any): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

