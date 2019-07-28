package typings.winrtDashUwp.WindowsNs.UINs.WebUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Manages delayed activation for an app. */
@JSGlobal("Windows.UI.WebUI.ActivatedDeferral")
@js.native
abstract class ActivatedDeferral () extends js.Object {
  /** Notifies the system that the app has set up its state and initial UI and is ready to be displayed. */
  def complete(): Unit = js.native
}

