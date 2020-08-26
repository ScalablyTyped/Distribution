package typings.winrtUwp.Windows.Storage.Pickers.Provider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about a closing event. */
@js.native
trait PickerClosingEventArgs extends js.Object {
  /** Gets a pickerClosingOperation object that is used to respond to a closing event. */
  var closingOperation: PickerClosingOperation = js.native
  /** Gets a value that indicates whether the file picker is closing because the user cancelled it. */
  var isCanceled: Boolean = js.native
}

object PickerClosingEventArgs {
  @scala.inline
  def apply(closingOperation: PickerClosingOperation, isCanceled: Boolean): PickerClosingEventArgs = {
    val __obj = js.Dynamic.literal(closingOperation = closingOperation.asInstanceOf[js.Any], isCanceled = isCanceled.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickerClosingEventArgs]
  }
  @scala.inline
  implicit class PickerClosingEventArgsOps[Self <: PickerClosingEventArgs] (val x: Self) extends AnyVal {
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

