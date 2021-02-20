package typings.tuyaPanelKit.mod

import typings.react.mod.ReactNode
import typings.reactNative.mod.TouchableOpacityProps
import typings.tuyaPanelKit.anon.CloseIcon
import typings.tuyaPanelKit.tuyaPanelKitStrings.error
import typings.tuyaPanelKit.tuyaPanelKitStrings.success
import typings.tuyaPanelKit.tuyaPanelKitStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotificationLegacyProps extends TouchableOpacityProps {
  
  var autoCloseTime: js.UndefOr[Double] = js.native
  
  var children: js.UndefOr[ReactNode] = js.native
  
  var enableClose: js.UndefOr[String] = js.native
  
  var icon: js.UndefOr[String] = js.native
  
  var message: js.UndefOr[String] = js.native
  
  var onClose: js.UndefOr[js.Function0[Unit]] = js.native
  
  var theme: js.UndefOr[CloseIcon] = js.native
  
  var variant: js.UndefOr[success | warning | error] = js.native
}
object NotificationLegacyProps {
  
  @scala.inline
  def apply(): NotificationLegacyProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotificationLegacyProps]
  }
  
  @scala.inline
  implicit class NotificationLegacyPropsMutableBuilder[Self <: NotificationLegacyProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoCloseTime(value: Double): Self = StObject.set(x, "autoCloseTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoCloseTimeUndefined: Self = StObject.set(x, "autoCloseTime", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setEnableClose(value: String): Self = StObject.set(x, "enableClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableCloseUndefined: Self = StObject.set(x, "enableClose", js.undefined)
    
    @scala.inline
    def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
    
    @scala.inline
    def setTheme(value: CloseIcon): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    @scala.inline
    def setVariant(value: success | warning | error): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
  }
}
