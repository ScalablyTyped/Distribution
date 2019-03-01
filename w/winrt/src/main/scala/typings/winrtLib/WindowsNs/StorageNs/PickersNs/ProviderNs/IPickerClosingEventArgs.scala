package typings
package winrtLib.WindowsNs.StorageNs.PickersNs.ProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPickerClosingEventArgs extends js.Object {
  var closingOperation: PickerClosingOperation
  var isCanceled: scala.Boolean
}

object IPickerClosingEventArgs {
  @scala.inline
  def apply(closingOperation: PickerClosingOperation, isCanceled: scala.Boolean): IPickerClosingEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("closingOperation")(closingOperation)
    __obj.updateDynamic("isCanceled")(isCanceled)
    __obj.asInstanceOf[IPickerClosingEventArgs]
  }
}

