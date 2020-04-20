package typings.winrt.Windows.Storage.Pickers.Provider

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPickerClosingOperation extends js.Object {
  var deadline: Date
  def getDeferral(): PickerClosingDeferral
}

object IPickerClosingOperation {
  @scala.inline
  def apply(deadline: Date, getDeferral: () => PickerClosingDeferral): IPickerClosingOperation = {
    val __obj = js.Dynamic.literal(deadline = deadline.asInstanceOf[js.Any], getDeferral = js.Any.fromFunction0(getDeferral))
    __obj.asInstanceOf[IPickerClosingOperation]
  }
}

