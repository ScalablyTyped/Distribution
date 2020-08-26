package typings.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopRecordOptions
  extends BaseOptions[js.Any, js.Any] {
  @JSName("success")
  var success_StopRecordOptions: js.UndefOr[js.Function1[/* res */ RecordResponse, Unit]] = js.native
}

object StopRecordOptions {
  @scala.inline
  def apply(): StopRecordOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopRecordOptions]
  }
  @scala.inline
  implicit class StopRecordOptionsOps[Self <: StopRecordOptions] (val x: Self) extends AnyVal {
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
    def setSuccess(value: /* res */ RecordResponse => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
  
}

