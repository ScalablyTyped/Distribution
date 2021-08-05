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
  
  var autoCloseTime: js.UndefOr[Double] = js.undefined
  
  var backIcon: js.UndefOr[String] = js.undefined
  
  var backIconCenter: js.UndefOr[Boolean] = js.undefined
  
  var backIconSize: js.UndefOr[Double] = js.undefined
  
  var enableClose: js.UndefOr[Boolean] = js.undefined
  
  var icon: js.UndefOr[String] = js.undefined
  
  var imageSource: js.UndefOr[ImageSourcePropType] = js.undefined
  
  var imageStyle: js.UndefOr[StyleProp[ImageStyle]] = js.undefined
  
  var message: String
  
  var motionConfig: js.UndefOr[MotionProps] = js.undefined
  
  var motionStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var show: js.UndefOr[Boolean] = js.undefined
  
  var theme: js.UndefOr[CloseIcon] = js.undefined
  
  var variant: js.UndefOr[success | warning | error] = js.undefined
}
object NotificationProps {
  
  inline def apply(message: String): NotificationProps = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationProps]
  }
  
  extension [Self <: NotificationProps](x: Self) {
    
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
    
    inline def setImageSourceVarargs(value: ImageURISource*): Self = StObject.set(x, "imageSource", js.Array(value :_*))
    
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
