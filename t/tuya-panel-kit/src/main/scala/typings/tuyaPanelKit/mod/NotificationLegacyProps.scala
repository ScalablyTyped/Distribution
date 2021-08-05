package typings.tuyaPanelKit.mod

import typings.react.mod.ReactNode
import typings.reactNative.mod.TouchableOpacityProps
import typings.tuyaPanelKit.anon.CloseIcon
import typings.tuyaPanelKit.tuyaPanelKitStrings.error
import typings.tuyaPanelKit.tuyaPanelKitStrings.success
import typings.tuyaPanelKit.tuyaPanelKitStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotificationLegacyProps
  extends StObject
     with TouchableOpacityProps {
  
  var autoCloseTime: js.UndefOr[Double] = js.undefined
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var enableClose: js.UndefOr[String] = js.undefined
  
  var icon: js.UndefOr[String] = js.undefined
  
  var message: js.UndefOr[String] = js.undefined
  
  var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var theme: js.UndefOr[CloseIcon] = js.undefined
  
  var variant: js.UndefOr[success | warning | error] = js.undefined
}
object NotificationLegacyProps {
  
  inline def apply(): NotificationLegacyProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotificationLegacyProps]
  }
  
  extension [Self <: NotificationLegacyProps](x: Self) {
    
    inline def setAutoCloseTime(value: Double): Self = StObject.set(x, "autoCloseTime", value.asInstanceOf[js.Any])
    
    inline def setAutoCloseTimeUndefined: Self = StObject.set(x, "autoCloseTime", js.undefined)
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setEnableClose(value: String): Self = StObject.set(x, "enableClose", value.asInstanceOf[js.Any])
    
    inline def setEnableCloseUndefined: Self = StObject.set(x, "enableClose", js.undefined)
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
    
    inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
    
    inline def setTheme(value: CloseIcon): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setVariant(value: success | warning | error): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
  }
}
