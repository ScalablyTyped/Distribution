package typings
package winrtLib.WindowsNs.StorageNs.PickersNs.ProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPickerClosingOperation extends js.Object {
  var deadline: stdLib.Date
  def getDeferral(): PickerClosingDeferral
}

object IPickerClosingOperation {
  @scala.inline
  def apply(deadline: stdLib.Date, getDeferral: js.Function0[PickerClosingDeferral]): IPickerClosingOperation = {
    val __obj = js.Dynamic.literal(deadline = deadline, getDeferral = getDeferral)
  
    __obj.asInstanceOf[IPickerClosingOperation]
  }
}

