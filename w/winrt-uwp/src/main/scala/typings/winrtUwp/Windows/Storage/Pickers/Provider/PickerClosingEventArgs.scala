package typings.winrtUwp.Windows.Storage.Pickers.Provider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about a closing event. */
trait PickerClosingEventArgs extends js.Object {
  /** Gets a pickerClosingOperation object that is used to respond to a closing event. */
  var closingOperation: PickerClosingOperation
  /** Gets a value that indicates whether the file picker is closing because the user cancelled it. */
  var isCanceled: Boolean
}

object PickerClosingEventArgs {
  @scala.inline
  def apply(closingOperation: PickerClosingOperation, isCanceled: Boolean): PickerClosingEventArgs = {
    val __obj = js.Dynamic.literal(closingOperation = closingOperation.asInstanceOf[js.Any], isCanceled = isCanceled.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickerClosingEventArgs]
  }
}

