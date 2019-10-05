package typings.winrtDashUwp.Windows.Storage.Pickers.Provider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about a closing event. */
@JSGlobal("Windows.Storage.Pickers.Provider.PickerClosingEventArgs")
@js.native
abstract class PickerClosingEventArgs () extends js.Object {
  /** Gets a pickerClosingOperation object that is used to respond to a closing event. */
  var closingOperation: PickerClosingOperation = js.native
  /** Gets a value that indicates whether the file picker is closing because the user cancelled it. */
  var isCanceled: Boolean = js.native
}

