package typings.tuyaPanelKit.mod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewProps
import typings.reactNative.mod.ViewStyle
import typings.tuyaPanelKit.tuyaPanelKitStrings.alpha
import typings.tuyaPanelKit.tuyaPanelKitStrings.large
import typings.tuyaPanelKit.tuyaPanelKitStrings.normal
import typings.tuyaPanelKit.tuyaPanelKitStrings.primary
import typings.tuyaPanelKit.tuyaPanelKitStrings.pure
import typings.tuyaPanelKit.tuyaPanelKitStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ControllerBarProps extends ViewProps {
  
  var backgroundColor: js.UndefOr[String] = js.native
  
  var backgroundType: js.UndefOr[alpha | pure] = js.native
  
  var button: js.Array[ButtonProps] = js.native
  
  var hasBottomBorder: js.UndefOr[Boolean] = js.native
  
  var size: js.UndefOr[large | normal | small | Double] = js.native
  
  var stretch: js.UndefOr[Boolean] = js.native
  
  var `type`: js.UndefOr[primary | normal] = js.native
  
  var wrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
}
object ControllerBarProps {
  
  @scala.inline
  def apply(button: js.Array[ButtonProps]): ControllerBarProps = {
    val __obj = js.Dynamic.literal(button = button.asInstanceOf[js.Any])
    __obj.asInstanceOf[ControllerBarProps]
  }
  
  @scala.inline
  implicit class ControllerBarPropsOps[Self <: ControllerBarProps] (val x: Self) extends AnyVal {
    
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
    def setButtonVarargs(value: ButtonProps*): Self = this.set("button", js.Array(value :_*))
    
    @scala.inline
    def setButton(value: js.Array[ButtonProps]): Self = this.set("button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setBackgroundType(value: alpha | pure): Self = this.set("backgroundType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundType: Self = this.set("backgroundType", js.undefined)
    
    @scala.inline
    def setHasBottomBorder(value: Boolean): Self = this.set("hasBottomBorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasBottomBorder: Self = this.set("hasBottomBorder", js.undefined)
    
    @scala.inline
    def setSize(value: large | normal | small | Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setStretch(value: Boolean): Self = this.set("stretch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStretch: Self = this.set("stretch", js.undefined)
    
    @scala.inline
    def setType(value: primary | normal): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setWrapperStyle(value: StyleProp[ViewStyle]): Self = this.set("wrapperStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapperStyle: Self = this.set("wrapperStyle", js.undefined)
    
    @scala.inline
    def setWrapperStyleNull: Self = this.set("wrapperStyle", null)
  }
}
