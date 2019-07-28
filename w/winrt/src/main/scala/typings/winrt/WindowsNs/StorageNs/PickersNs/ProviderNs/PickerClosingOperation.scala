package typings.winrt.WindowsNs.StorageNs.PickersNs.ProviderNs

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.Pickers.Provider.PickerClosingOperation")
@js.native
class PickerClosingOperation () extends IPickerClosingOperation {
  /* CompleteClass */
  override var deadline: Date = js.native
  /* CompleteClass */
  override def getDeferral(): PickerClosingDeferral = js.native
}

