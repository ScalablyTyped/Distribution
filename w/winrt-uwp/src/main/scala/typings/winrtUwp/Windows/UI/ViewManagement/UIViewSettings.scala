package typings.winrtUwp.Windows.UI.ViewManagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents UI states and behaviors associated with the device mode (Tablet or Desktop) and input device type. */
@JSGlobal("Windows.UI.ViewManagement.UIViewSettings")
@js.native
abstract class UIViewSettings () extends js.Object {
  /** Gets a value that indicates whether the device UI is optimized for touch input or mouse input. */
  var userInteractionMode: UserInteractionMode = js.native
}

/* static members */
@JSGlobal("Windows.UI.ViewManagement.UIViewSettings")
@js.native
object UIViewSettings extends js.Object {
  /**
    * Gets the UI states and behaviors associated with the device mode (Tablet or Desktop) for the active app.
    * @return A UIViewSettings instance that can be used to get and set view settings properties.
    */
  def getForCurrentView(): UIViewSettings = js.native
}

