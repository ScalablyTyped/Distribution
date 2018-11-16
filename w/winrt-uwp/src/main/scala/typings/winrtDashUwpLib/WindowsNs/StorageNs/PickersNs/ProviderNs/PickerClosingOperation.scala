package typings
package winrtDashUwpLib.WindowsNs.StorageNs.PickersNs.ProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Lets an app that provides files get the deadline for responding to a closing event and get a deferral so the app can respond to the event asynchronously. */
@JSGlobal("Windows.Storage.Pickers.Provider.PickerClosingOperation")
@js.native
abstract class PickerClosingOperation () extends js.Object {
  /** Gets a dateTime object that indicates when the system will shut down the app that is providing files through the file picker without further notice. */
  var deadline: stdLib.Date = js.native
  /**
                       * Gets a pickerClosingDeferral that the app providing files through the file picker can use to respond asynchronously to a closing event.
                       * @return The pickerClosingDeferral that the app providing files through the file picker can use to respond asynchronously to a closing event.
                       */
  def getDeferral(): PickerClosingDeferral = js.native
}

