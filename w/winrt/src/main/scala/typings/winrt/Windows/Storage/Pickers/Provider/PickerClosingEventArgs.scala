package typings.winrt.Windows.Storage.Pickers.Provider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PickerClosingEventArgs extends IPickerClosingEventArgs

object PickerClosingEventArgs {
  @scala.inline
  def apply(closingOperation: PickerClosingOperation, isCanceled: Boolean): PickerClosingEventArgs = {
    val __obj = js.Dynamic.literal(closingOperation = closingOperation.asInstanceOf[js.Any], isCanceled = isCanceled.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickerClosingEventArgs]
  }
}

