package typings.winrtUwp.global.Windows.ApplicationModel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Manages a delayed app suspending operation. */
@JSGlobal("Windows.ApplicationModel.SuspendingDeferral")
@js.native
abstract class SuspendingDeferral ()
  extends typings.winrtUwp.Windows.ApplicationModel.SuspendingDeferral {
  /** Notifies the operating system that the app has saved its data and is ready to be suspended. */
  /* CompleteClass */
  override def complete(): Unit = js.native
}

