package typings.tuyaPanelKit.mod

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
  
  /**
    * @language zh-CN
    * @description 自动关闭时间。需配合 enableClose: false 使用
    * @defaultValue 1500
    */
  /**
    * @language en-US
    * @description Auto off time. It should be used with enableClose: false
    * @defaultValue 1500
    */
  var autoCloseTime: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 是否显示关闭按钮。若为false，则会在 autoCloseTime 后自动触发 onClose 回调
    * @defaultValue true
    */
  /**
    * @language en-US
    * @description Whether the close button is displayed. If false, the onclose callback is automatically triggered after autoCloseTime
    * @defaultValue true
    */
  var enableClose: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 通知栏自定义的图标路径
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description Custom icon path for notification bar
    * @defaultValue undefined
    */
  var icon: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 通知栏文案
    * @defaultValue ''
    */
  /**
    * @language en-US
    * @description Notice board copy
    * @defaultValue ''
    */
  var message: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 关闭回调
    * @defaultValue () => {}
    */
  /**
    * @language en-US
    * @description Close callback
    * @defaultValue () => {}
    */
  var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 主题配置
    * @defaultValue { background: '#fff', text: '#495054', iconColor: undefined, successIcon: undefined, warningIcon: undefined, errorIcon: undefined, closeIcon: '#81828B' }
    */
  /**
    * @language en-US
    * @description Theme configuration
    * @defaultValue { background: '#fff', text: '#495054', iconColor: undefined, successIcon: undefined, warningIcon: undefined, errorIcon: undefined, closeIcon: '#81828B' }
    */
  var theme: js.UndefOr[CloseIcon] = js.undefined
  
  /**
    * @language zh-CN
    * @description 通知栏类型
    * @defaultValue 'warning'
    */
  /**
    * @language en-US
    * @description Type of notification bar
    * @defaultValue 'warning'
    */
  var variant: js.UndefOr[success | warning | error] = js.undefined
}
object NotificationLegacyProps {
  
  inline def apply(): NotificationLegacyProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotificationLegacyProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NotificationLegacyProps] (val x: Self) extends AnyVal {
    
    inline def setAutoCloseTime(value: Double): Self = StObject.set(x, "autoCloseTime", value.asInstanceOf[js.Any])
    
    inline def setAutoCloseTimeUndefined: Self = StObject.set(x, "autoCloseTime", js.undefined)
    
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
