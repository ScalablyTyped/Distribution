package typings.winrt.Windows.Storage.Pickers.Provider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPickerClosingEventArgs extends js.Object {
  var closingOperation: PickerClosingOperation = js.native
  var isCanceled: Boolean = js.native
}

object IPickerClosingEventArgs {
  @scala.inline
  def apply(closingOperation: PickerClosingOperation, isCanceled: Boolean): IPickerClosingEventArgs = {
    val __obj = js.Dynamic.literal(closingOperation = closingOperation.asInstanceOf[js.Any], isCanceled = isCanceled.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPickerClosingEventArgs]
  }
  @scala.inline
  implicit class IPickerClosingEventArgsOps[Self <: IPickerClosingEventArgs] (val x: Self) extends AnyVal {
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
    def setClosingOperation(value: PickerClosingOperation): Self = this.set("closingOperation", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsCanceled(value: Boolean): Self = this.set("isCanceled", value.asInstanceOf[js.Any])
  }
  
}

