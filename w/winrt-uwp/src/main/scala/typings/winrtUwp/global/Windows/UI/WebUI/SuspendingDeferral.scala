package typings.winrtUwp.global.Windows.UI.WebUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Manages delayed suspension for an app. GetDeferral */
@JSGlobal("Windows.UI.WebUI.SuspendingDeferral")
@js.native
abstract class SuspendingDeferral ()
  extends typings.winrtUwp.Windows.UI.WebUI.SuspendingDeferral {
  /** Notifies the system that the app has saved its data and is ready to be suspended. */
  /* CompleteClass */
  override def complete(): Unit = js.native
}

