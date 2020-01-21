package typings.winrtUwp.Windows.UI.WebUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for an app suspension event. */
@JSGlobal("Windows.UI.WebUI.SuspendingEventArgs")
@js.native
abstract class SuspendingEventArgs () extends js.Object {
  /** Gets the app suspension operation. */
  var suspendingOperation: typings.winrtUwp.Windows.ApplicationModel.SuspendingOperation = js.native
}

