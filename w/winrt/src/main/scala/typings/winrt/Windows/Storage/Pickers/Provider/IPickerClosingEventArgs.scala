package typings.winrt.Windows.Storage.Pickers.Provider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPickerClosingEventArgs extends js.Object {
  var closingOperation: PickerClosingOperation
  var isCanceled: Boolean
}

object IPickerClosingEventArgs {
  @scala.inline
  def apply(closingOperation: PickerClosingOperation, isCanceled: Boolean): IPickerClosingEventArgs = {
    val __obj = js.Dynamic.literal(closingOperation = closingOperation, isCanceled = isCanceled)
  
    __obj.asInstanceOf[IPickerClosingEventArgs]
  }
}

