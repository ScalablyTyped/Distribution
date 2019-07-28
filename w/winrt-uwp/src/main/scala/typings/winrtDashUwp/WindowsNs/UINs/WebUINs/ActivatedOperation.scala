package typings.winrtDashUwp.WindowsNs.UINs.WebUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Manages an app activation operation. */
@JSGlobal("Windows.UI.WebUI.ActivatedOperation")
@js.native
abstract class ActivatedOperation () extends js.Object {
  /**
    * Requests that the completion of app activation be delayed.
    * @return The activation deferral object.
    */
  def getDeferral(): ActivatedDeferral = js.native
}

