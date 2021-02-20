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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotificationProps extends TouchableOpacityProps {
  
  var autoCloseTime: js.UndefOr[Double] = js.native
  
  var backIcon: js.UndefOr[String] = js.native
  
  var backIconCenter: js.UndefOr[Boolean] = js.native
  
  var backIconSize: js.UndefOr[Double] = js.native
  
  var enableClose: js.UndefOr[Boolean] = js.native
  
  var icon: js.UndefOr[String] = js.native
  
  var imageSource: js.UndefOr[ImageSourcePropType] = js.native
  
  var imageStyle: js.UndefOr[StyleProp[ImageStyle]] = js.native
  
  var message: String = js.native
  
  var motionConfig: js.UndefOr[MotionProps] = js.native
  
  var motionStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var onClose: js.UndefOr[js.Function0[Unit]] = js.native
  
  var show: js.UndefOr[Boolean] = js.native
  
  var theme: js.UndefOr[CloseIcon] = js.native
  
  var variant: js.UndefOr[success | warning | error] = js.native
}
object NotificationProps {
  
  @scala.inline
  def apply(message: String): NotificationProps = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationProps]
  }
  
  @scala.inline
  implicit class NotificationPropsMutableBuilder[Self <: NotificationProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoCloseTime(value: Double): Self = StObject.set(x, "autoCloseTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoCloseTimeUndefined: Self = StObject.set(x, "autoCloseTime", js.undefined)
    
    @scala.inline
    def setBackIcon(value: String): Self = StObject.set(x, "backIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackIconCenter(value: Boolean): Self = StObject.set(x, "backIconCenter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackIconCenterUndefined: Self = StObject.set(x, "backIconCenter", js.undefined)
    
    @scala.inline
    def setBackIconSize(value: Double): Self = StObject.set(x, "backIconSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackIconSizeUndefined: Self = StObject.set(x, "backIconSize", js.undefined)
    
    @scala.inline
    def setBackIconUndefined: Self = StObject.set(x, "backIcon", js.undefined)
    
    @scala.inline
    def setEnableClose(value: Boolean): Self = StObject.set(x, "enableClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableCloseUndefined: Self = StObject.set(x, "enableClose", js.undefined)
    
    @scala.inline
    def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setImageSource(value: ImageSourcePropType): Self = StObject.set(x, "imageSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageSourceUndefined: Self = StObject.set(x, "imageSource", js.undefined)
    
    @scala.inline
    def setImageSourceVarargs(value: ImageURISource*): Self = StObject.set(x, "imageSource", js.Array(value :_*))
    
    @scala.inline
    def setImageStyle(value: StyleProp[ImageStyle]): Self = StObject.set(x, "imageStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageStyleNull: Self = StObject.set(x, "imageStyle", null)
    
    @scala.inline
    def setImageStyleUndefined: Self = StObject.set(x, "imageStyle", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMotionConfig(value: MotionProps): Self = StObject.set(x, "motionConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMotionConfigUndefined: Self = StObject.set(x, "motionConfig", js.undefined)
    
    @scala.inline
    def setMotionStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "motionStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMotionStyleNull: Self = StObject.set(x, "motionStyle", null)
    
    @scala.inline
    def setMotionStyleUndefined: Self = StObject.set(x, "motionStyle", js.undefined)
    
    @scala.inline
    def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
    
    @scala.inline
    def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
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
