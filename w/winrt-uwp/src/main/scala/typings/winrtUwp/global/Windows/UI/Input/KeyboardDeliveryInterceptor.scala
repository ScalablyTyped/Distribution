package typings.winrtUwp.global.Windows.UI.Input

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Enables an app to override the system processing of raw keyboard input, including key combinations such as shortcut keys, access keys (or hot keys), accelerator keys, and application keys. */
@JSGlobal("Windows.UI.Input.KeyboardDeliveryInterceptor")
@js.native
abstract class KeyboardDeliveryInterceptor ()
  extends StObject
     with typings.winrtUwp.Windows.UI.Input.KeyboardDeliveryInterceptor
object KeyboardDeliveryInterceptor {
  
  @JSGlobal("Windows.UI.Input.KeyboardDeliveryInterceptor")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Retrieves a KeyboardDeliveryInterceptor object associated with the current app view.
    * @return The KeyboardDeliveryInterceptor object associated with the current app.
    */
  /* static member */
  @scala.inline
  def getForCurrentView(): typings.winrtUwp.Windows.UI.Input.KeyboardDeliveryInterceptor = ^.asInstanceOf[js.Dynamic].applyDynamic("getForCurrentView")().asInstanceOf[typings.winrtUwp.Windows.UI.Input.KeyboardDeliveryInterceptor]
}
