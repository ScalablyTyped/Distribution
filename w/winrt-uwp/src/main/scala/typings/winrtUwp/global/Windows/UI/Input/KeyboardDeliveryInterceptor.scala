package typings.winrtUwp.global.Windows.UI.Input

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Enables an app to override the system processing of raw keyboard input, including key combinations such as shortcut keys, access keys (or hot keys), accelerator keys, and application keys. */
@JSGlobal("Windows.UI.Input.KeyboardDeliveryInterceptor")
@js.native
abstract class KeyboardDeliveryInterceptor ()
  extends typings.winrtUwp.Windows.UI.Input.KeyboardDeliveryInterceptor
object KeyboardDeliveryInterceptor {
  
  /**
    * Retrieves a KeyboardDeliveryInterceptor object associated with the current app view.
    * @return The KeyboardDeliveryInterceptor object associated with the current app.
    */
  /* static member */
  @JSGlobal("Windows.UI.Input.KeyboardDeliveryInterceptor.getForCurrentView")
  @js.native
  def getForCurrentView(): typings.winrtUwp.Windows.UI.Input.KeyboardDeliveryInterceptor = js.native
}
