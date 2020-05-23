package typings.winrtUwp.global.Windows.UI.WebUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Manages delayed activation for an app. */
@JSGlobal("Windows.UI.WebUI.ActivatedDeferral")
@js.native
abstract class ActivatedDeferral ()
  extends typings.winrtUwp.Windows.UI.WebUI.ActivatedDeferral {
  /** Notifies the system that the app has set up its state and initial UI and is ready to be displayed. */
  /* CompleteClass */
  override def complete(): Unit = js.native
}

