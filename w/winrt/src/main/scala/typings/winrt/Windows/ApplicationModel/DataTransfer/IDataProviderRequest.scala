package typings.winrt.Windows.ApplicationModel.DataTransfer

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDataProviderRequest extends js.Object {
  var deadline: Date = js.native
  var formatId: String = js.native
  def getDeferral(): DataProviderDeferral = js.native
  def setData(value: js.Any): Unit = js.native
}

object IDataProviderRequest {
  @scala.inline
  def apply(deadline: Date, formatId: String, getDeferral: () => DataProviderDeferral, setData: js.Any => Unit): IDataProviderRequest = {
    val __obj = js.Dynamic.literal(deadline = deadline.asInstanceOf[js.Any], formatId = formatId.asInstanceOf[js.Any], getDeferral = js.Any.fromFunction0(getDeferral), setData = js.Any.fromFunction1(setData))
    __obj.asInstanceOf[IDataProviderRequest]
  }
  @scala.inline
  implicit class IDataProviderRequestOps[Self <: IDataProviderRequest] (val x: Self) extends AnyVal {
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
    def setDeadline(value: Date): Self = this.set("deadline", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormatId(value: String): Self = this.set("formatId", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetDeferral(value: () => DataProviderDeferral): Self = this.set("getDeferral", js.Any.fromFunction0(value))
    @scala.inline
    def setSetData(value: js.Any => Unit): Self = this.set("setData", js.Any.fromFunction1(value))
  }
  
}

