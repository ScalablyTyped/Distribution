package typings.winrtUwp.Windows.ApplicationModel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for an app suspending event. */
@JSGlobal("Windows.ApplicationModel.SuspendingEventArgs")
@js.native
abstract class SuspendingEventArgs () extends js.Object {
  /** Gets the app suspending operation. */
  var suspendingOperation: SuspendingOperation = js.native
}

