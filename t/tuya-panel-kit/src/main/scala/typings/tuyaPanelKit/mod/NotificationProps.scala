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
  implicit class NotificationPropsOps[Self <: NotificationProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoCloseTime(value: Double): Self = this.set("autoCloseTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoCloseTime: Self = this.set("autoCloseTime", js.undefined)
    
    @scala.inline
    def setBackIcon(value: String): Self = this.set("backIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackIcon: Self = this.set("backIcon", js.undefined)
    
    @scala.inline
    def setBackIconCenter(value: Boolean): Self = this.set("backIconCenter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackIconCenter: Self = this.set("backIconCenter", js.undefined)
    
    @scala.inline
    def setBackIconSize(value: Double): Self = this.set("backIconSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackIconSize: Self = this.set("backIconSize", js.undefined)
    
    @scala.inline
    def setEnableClose(value: Boolean): Self = this.set("enableClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableClose: Self = this.set("enableClose", js.undefined)
    
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setImageSourceVarargs(value: ImageURISource*): Self = this.set("imageSource", js.Array(value :_*))
    
    @scala.inline
    def setImageSource(value: ImageSourcePropType): Self = this.set("imageSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageSource: Self = this.set("imageSource", js.undefined)
    
    @scala.inline
    def setImageStyle(value: StyleProp[ImageStyle]): Self = this.set("imageStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageStyle: Self = this.set("imageStyle", js.undefined)
    
    @scala.inline
    def setImageStyleNull: Self = this.set("imageStyle", null)
    
    @scala.inline
    def setMotionConfig(value: MotionProps): Self = this.set("motionConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMotionConfig: Self = this.set("motionConfig", js.undefined)
    
    @scala.inline
    def setMotionStyle(value: StyleProp[ViewStyle]): Self = this.set("motionStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMotionStyle: Self = this.set("motionStyle", js.undefined)
    
    @scala.inline
    def setMotionStyleNull: Self = this.set("motionStyle", null)
    
    @scala.inline
    def setOnClose(value: () => Unit): Self = this.set("onClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
    
    @scala.inline
    def setShow(value: Boolean): Self = this.set("show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    
    @scala.inline
    def setTheme(value: CloseIcon): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    
    @scala.inline
    def setVariant(value: success | warning | error): Self = this.set("variant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVariant: Self = this.set("variant", js.undefined)
  }
}
