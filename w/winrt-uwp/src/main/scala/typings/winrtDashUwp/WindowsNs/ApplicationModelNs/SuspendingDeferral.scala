package typings.winrtDashUwp.WindowsNs.ApplicationModelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Manages a delayed app suspending operation. */
@JSGlobal("Windows.ApplicationModel.SuspendingDeferral")
@js.native
abstract class SuspendingDeferral () extends js.Object {
  /** Notifies the operating system that the app has saved its data and is ready to be suspended. */
  def complete(): Unit = js.native
}

