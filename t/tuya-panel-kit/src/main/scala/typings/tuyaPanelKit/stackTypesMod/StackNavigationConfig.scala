package typings.tuyaPanelKit.stackTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StackNavigationConfig extends StObject {
  
  /**
    * Whether inactive screens should be detached from the view hierarchy to save memory.
    * Make sure to call `enableScreens` from `react-native-screens` to make it work.
    * Defaults to `true` on Android, depends on the version of `react-native-screens` on iOS.
    */
  var detachInactiveScreens: js.UndefOr[Boolean] = js.undefined
  
  var headerMode: js.UndefOr[StackHeaderMode] = js.undefined
  
  /**
    * If `false`, the keyboard will NOT automatically dismiss when navigating to a new screen.
    * Defaults to `true`.
    */
  var keyboardHandlingEnabled: js.UndefOr[Boolean] = js.undefined
  
  var mode: js.UndefOr[StackCardMode] = js.undefined
}
object StackNavigationConfig {
  
  inline def apply(): StackNavigationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StackNavigationConfig]
  }
  
  extension [Self <: StackNavigationConfig](x: Self) {
    
    inline def setDetachInactiveScreens(value: Boolean): Self = StObject.set(x, "detachInactiveScreens", value.asInstanceOf[js.Any])
    
    inline def setDetachInactiveScreensUndefined: Self = StObject.set(x, "detachInactiveScreens", js.undefined)
    
    inline def setHeaderMode(value: StackHeaderMode): Self = StObject.set(x, "headerMode", value.asInstanceOf[js.Any])
    
    inline def setHeaderModeUndefined: Self = StObject.set(x, "headerMode", js.undefined)
    
    inline def setKeyboardHandlingEnabled(value: Boolean): Self = StObject.set(x, "keyboardHandlingEnabled", value.asInstanceOf[js.Any])
    
    inline def setKeyboardHandlingEnabledUndefined: Self = StObject.set(x, "keyboardHandlingEnabled", js.undefined)
    
    inline def setMode(value: StackCardMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
