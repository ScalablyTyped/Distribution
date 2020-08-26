package typings.winrtUwp.Windows.Storage.Pickers.Provider

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Lets an app that provides files get the deadline for responding to a closing event and get a deferral so the app can respond to the event asynchronously. */
@js.native
trait PickerClosingOperation extends js.Object {
  /** Gets a dateTime object that indicates when the system will shut down the app that is providing files through the file picker without further notice. */
  var deadline: Date = js.native
  /**
    * Gets a pickerClosingDeferral that the app providing files through the file picker can use to respond asynchronously to a closing event.
    * @return The pickerClosingDeferral that the app providing files through the file picker can use to respond asynchronously to a closing event.
    */
  def getDeferral(): PickerClosingDeferral = js.native
}

object PickerClosingOperation {
  @scala.inline
  def apply(deadline: Date, getDeferral: () => PickerClosingDeferral): PickerClosingOperation = {
    val __obj = js.Dynamic.literal(deadline = deadline.asInstanceOf[js.Any], getDeferral = js.Any.fromFunction0(getDeferral))
    __obj.asInstanceOf[PickerClosingOperation]
  }
  @scala.inline
  implicit class PickerClosingOperationOps[Self <: PickerClosingOperation] (val x: Self) extends AnyVal {
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
    def setGetDeferral(value: () => PickerClosingDeferral): Self = this.set("getDeferral", js.Any.fromFunction0(value))
  }
  
}

