package typings.winrtUwp.Windows.Storage.Pickers.Provider

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Lets an app that provides files get the deadline for responding to a closing event and get a deferral so the app can respond to the event asynchronously. */
trait PickerClosingOperation extends js.Object {
  /** Gets a dateTime object that indicates when the system will shut down the app that is providing files through the file picker without further notice. */
  var deadline: Date
  /**
    * Gets a pickerClosingDeferral that the app providing files through the file picker can use to respond asynchronously to a closing event.
    * @return The pickerClosingDeferral that the app providing files through the file picker can use to respond asynchronously to a closing event.
    */
  def getDeferral(): PickerClosingDeferral
}

object PickerClosingOperation {
  @scala.inline
  def apply(deadline: Date, getDeferral: () => PickerClosingDeferral): PickerClosingOperation = {
    val __obj = js.Dynamic.literal(deadline = deadline.asInstanceOf[js.Any], getDeferral = js.Any.fromFunction0(getDeferral))
    __obj.asInstanceOf[PickerClosingOperation]
  }
}

