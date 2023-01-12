package typings.tuyaPanelKit.mod

import typings.reactNative.mod.ImageSourcePropType
import typings.reactNative.mod.ImageStyle
import typings.reactNative.mod.ImageURISource
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TouchableOpacityProps
import typings.reactNative.mod.ViewStyle
import typings.tuyaPanelKit.anon.CloseIcon
import typings.tuyaPanelKit.tuyaPanelKitStrings.error
import typings.tuyaPanelKit.tuyaPanelKitStrings.success
import typings.tuyaPanelKit.tuyaPanelKitStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotificationProps
  extends StObject
     with TouchableOpacityProps {
  
  /**
    * @language zh-CN
    * @description 自动关闭时间。需配合 enableClose: false 使用
    * @defaultValue 1500
    */
  /**
    * @language en-US
    * @description Auto off time. It should be used with enableclose: false
    * @defaultValue 1500
    */
  var autoCloseTime: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 通知栏文案后面的图标路径
    * @defaultValue 'M329.557333 281.9072a32.8704 32.8704 0 0 1 0.887467 0.853333l177.527467 178.449067 161.6896-171.281067a33.1776 33.1776 0 0 1 47.581866-0.682666l0.682667 0.682666a34.133333 34.133333 0 0 1 0.682667 47.581867l-162.474667 172.100267 162.269867 163.157333a34.133333 34.133333 0 0 1 0.750933 47.377067l-0.853333 0.9216a32.8704 32.8704 0 0 1-46.455467 1.604266l-0.887467-0.853333-161.6896-162.577067-155.7504 165.034667a33.1776 33.1776 0 0 1-46.865066 1.365333l-1.365334-1.365333a34.133333 34.133333 0 0 1-0.682666-47.581867l156.501333-165.853866L282.999467 331.776a34.133333 34.133333 0 0 1-0.750934-47.342933l0.853334-0.9216a32.8704 32.8704 0 0 1 46.455466-1.604267z'
    */
  /**
    * @language en-US
    * @description Path notification icon behind the copybar
    * @defaultValue 'M329.557333 281.9072a32.8704 32.8704 0 0 1 0.887467 0.853333l177.527467 178.449067 161.6896-171.281067a33.1776 33.1776 0 0 1 47.581866-0.682666l0.682667 0.682666a34.133333 34.133333 0 0 1 0.682667 47.581867l-162.474667 172.100267 162.269867 163.157333a34.133333 34.133333 0 0 1 0.750933 47.377067l-0.853333 0.9216a32.8704 32.8704 0 0 1-46.455467 1.604266l-0.887467-0.853333-161.6896-162.577067-155.7504 165.034667a33.1776 33.1776 0 0 1-46.865066 1.365333l-1.365334-1.365333a34.133333 34.133333 0 0 1-0.682666-47.581867l156.501333-165.853866L282.999467 331.776a34.133333 34.133333 0 0 1-0.750934-47.342933l0.853334-0.9216a32.8704 32.8704 0 0 1 46.455466-1.604267z'
    */
  var backIcon: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 文案后面图标是否垂直居中
    * @defaultValue false
    */
  /**
    * @language en-US
    * @description Is the icon behind the copy centered vertically
    * @defaultValue false
    */
  var backIconCenter: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description 文案后面图标大小
    * @defaultValue 24
    */
  /**
    * @language en-US
    * @description Size icon behind copy
    * @defaultValue 24
    */
  var backIconSize: js.UndefOr[Double] = js.undefined
  
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
  var enableClose: js.UndefOr[Boolean] = js.undefined
  
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
    * @description 图片资源
    * @types <a target="_blank" href="https://reactnative.dev/docs/image#source">ImageSourcePropType</a>
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Image source
    * @types <a target="_blank" href="https://reactnative.dev/docs/image#source">ImageSourcePropType</a>
    * @defaultValue null
    */
  var imageSource: js.UndefOr[ImageSourcePropType] = js.undefined
  
  /**
    * @language zh-CN
    * @description 图片样式
    * @types <a target="_blank" href="https://reactnative.dev/docs/image-style-props">StyleProp<ImageStyle></a>
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Image style
    * @types <a target="_blank" href="https://reactnative.dev/docs/image-style-props">StyleProp<ImageStyle></a>
    * @defaultValue null
    */
  var imageStyle: js.UndefOr[StyleProp[ImageStyle]] = js.undefined
  
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
  var message: String
  
  /**
    * @language zh-CN
    * @description Notification 动画配置，参考 PushDown 属性
    * @types <a target='_blank' href='https://github.com/DefinitelyTyped/DefinitelyTyped/blob/15d697b0e21723a4c284a837cddc9c35e86a85a3/types/tuya-panel-kit/index.d.ts#L563'>MotionProps<ViewStyle></a>
    * @defaultValue {}
    */
  /**
    * @language en-US
    * @description For notification animation configuration, refer to pushdown property
    * @types <a target='_blank' href='https://github.com/DefinitelyTyped/DefinitelyTyped/blob/15d697b0e21723a4c284a837cddc9c35e86a85a3/types/tuya-panel-kit/index.d.ts#L563'>MotionProps<ViewStyle></a>
    * @defaultValue {}
    */
  var motionConfig: js.UndefOr[MotionProps] = js.undefined
  
  /**
    * @language zh-CN
    * @description 动画样式
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Motion style
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue null
    */
  var motionStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
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
    * @description Show notification bar
    * @defaultValue false
    */
  /**
    * @language en-US
    * @description Show notification bar
    * @defaultValue false
    */
  var show: js.UndefOr[Boolean] = js.undefined
  
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
object NotificationProps {
  
  inline def apply(message: String): NotificationProps = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NotificationProps] (val x: Self) extends AnyVal {
    
    inline def setAutoCloseTime(value: Double): Self = StObject.set(x, "autoCloseTime", value.asInstanceOf[js.Any])
    
    inline def setAutoCloseTimeUndefined: Self = StObject.set(x, "autoCloseTime", js.undefined)
    
    inline def setBackIcon(value: String): Self = StObject.set(x, "backIcon", value.asInstanceOf[js.Any])
    
    inline def setBackIconCenter(value: Boolean): Self = StObject.set(x, "backIconCenter", value.asInstanceOf[js.Any])
    
    inline def setBackIconCenterUndefined: Self = StObject.set(x, "backIconCenter", js.undefined)
    
    inline def setBackIconSize(value: Double): Self = StObject.set(x, "backIconSize", value.asInstanceOf[js.Any])
    
    inline def setBackIconSizeUndefined: Self = StObject.set(x, "backIconSize", js.undefined)
    
    inline def setBackIconUndefined: Self = StObject.set(x, "backIcon", js.undefined)
    
    inline def setEnableClose(value: Boolean): Self = StObject.set(x, "enableClose", value.asInstanceOf[js.Any])
    
    inline def setEnableCloseUndefined: Self = StObject.set(x, "enableClose", js.undefined)
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setImageSource(value: ImageSourcePropType): Self = StObject.set(x, "imageSource", value.asInstanceOf[js.Any])
    
    inline def setImageSourceUndefined: Self = StObject.set(x, "imageSource", js.undefined)
    
    inline def setImageSourceVarargs(value: ImageURISource*): Self = StObject.set(x, "imageSource", js.Array(value*))
    
    inline def setImageStyle(value: StyleProp[ImageStyle]): Self = StObject.set(x, "imageStyle", value.asInstanceOf[js.Any])
    
    inline def setImageStyleNull: Self = StObject.set(x, "imageStyle", null)
    
    inline def setImageStyleUndefined: Self = StObject.set(x, "imageStyle", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMotionConfig(value: MotionProps): Self = StObject.set(x, "motionConfig", value.asInstanceOf[js.Any])
    
    inline def setMotionConfigUndefined: Self = StObject.set(x, "motionConfig", js.undefined)
    
    inline def setMotionStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "motionStyle", value.asInstanceOf[js.Any])
    
    inline def setMotionStyleNull: Self = StObject.set(x, "motionStyle", null)
    
    inline def setMotionStyleUndefined: Self = StObject.set(x, "motionStyle", js.undefined)
    
    inline def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
    
    inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
    
    inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    inline def setTheme(value: CloseIcon): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setVariant(value: success | warning | error): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
  }
}
