package typings.winrtUwp.global.Windows.UI.WebUI

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Manages an app suspension operation. */
@JSGlobal("Windows.UI.WebUI.SuspendingOperation")
@js.native
abstract class SuspendingOperation ()
  extends typings.winrtUwp.Windows.UI.WebUI.SuspendingOperation {
  /** Gets the time remaining before a delayed app suspension operation continues. */
  /* CompleteClass */
  override var deadline: Date = js.native
  /**
    * Requests that the app suspension operation be delayed.
    * @return The suspension deferral.
    */
  /* CompleteClass */
  override def getDeferral(): typings.winrtUwp.Windows.ApplicationModel.SuspendingDeferral = js.native
}

