package typings.winrtUwp.global.Windows.UI.ViewManagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents UI states and behaviors associated with the device mode (Tablet or Desktop) and input device type. */
@JSGlobal("Windows.UI.ViewManagement.UIViewSettings")
@js.native
abstract class UIViewSettings ()
  extends typings.winrtUwp.Windows.UI.ViewManagement.UIViewSettings
/* static members */
@JSGlobal("Windows.UI.ViewManagement.UIViewSettings")
@js.native
object UIViewSettings extends js.Object {
  
  /**
    * Gets the UI states and behaviors associated with the device mode (Tablet or Desktop) for the active app.
    * @return A UIViewSettings instance that can be used to get and set view settings properties.
    */
  def getForCurrentView(): typings.winrtUwp.Windows.UI.ViewManagement.UIViewSettings = js.native
}
