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
import org.scalablytyped.runtime.StObject
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
  implicit class ControllerBarPropsMutableBuilder[Self <: ControllerBarProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setBackgroundType(value: alpha | pure): Self = StObject.set(x, "backgroundType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundTypeUndefined: Self = StObject.set(x, "backgroundType", js.undefined)
    
    @scala.inline
    def setButton(value: js.Array[ButtonProps]): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonVarargs(value: ButtonProps*): Self = StObject.set(x, "button", js.Array(value :_*))
    
    @scala.inline
    def setHasBottomBorder(value: Boolean): Self = StObject.set(x, "hasBottomBorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasBottomBorderUndefined: Self = StObject.set(x, "hasBottomBorder", js.undefined)
    
    @scala.inline
    def setSize(value: large | normal | small | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setStretch(value: Boolean): Self = StObject.set(x, "stretch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStretchUndefined: Self = StObject.set(x, "stretch", js.undefined)
    
    @scala.inline
    def setType(value: primary | normal): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setWrapperStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "wrapperStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapperStyleNull: Self = StObject.set(x, "wrapperStyle", null)
    
    @scala.inline
    def setWrapperStyleUndefined: Self = StObject.set(x, "wrapperStyle", js.undefined)
  }
}
