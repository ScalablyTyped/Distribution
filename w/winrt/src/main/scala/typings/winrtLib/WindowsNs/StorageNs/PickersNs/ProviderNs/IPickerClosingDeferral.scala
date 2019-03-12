package typings
package winrtLib.WindowsNs.StorageNs.PickersNs.ProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPickerClosingDeferral extends js.Object {
  def complete(): scala.Unit
}

object IPickerClosingDeferral {
  @scala.inline
  def apply(complete: () => scala.Unit): IPickerClosingDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
  
    __obj.asInstanceOf[IPickerClosingDeferral]
  }
}

