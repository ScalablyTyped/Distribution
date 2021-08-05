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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ControllerBarProps
  extends StObject
     with ViewProps {
  
  var backgroundColor: js.UndefOr[String] = js.undefined
  
  var backgroundType: js.UndefOr[alpha | pure] = js.undefined
  
  var button: js.Array[ButtonProps]
  
  var hasBottomBorder: js.UndefOr[Boolean] = js.undefined
  
  var size: js.UndefOr[large | normal | small | Double] = js.undefined
  
  var stretch: js.UndefOr[Boolean] = js.undefined
  
  var `type`: js.UndefOr[primary | normal] = js.undefined
  
  var wrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}
object ControllerBarProps {
  
  inline def apply(button: js.Array[ButtonProps]): ControllerBarProps = {
    val __obj = js.Dynamic.literal(button = button.asInstanceOf[js.Any])
    __obj.asInstanceOf[ControllerBarProps]
  }
  
  extension [Self <: ControllerBarProps](x: Self) {
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setBackgroundType(value: alpha | pure): Self = StObject.set(x, "backgroundType", value.asInstanceOf[js.Any])
    
    inline def setBackgroundTypeUndefined: Self = StObject.set(x, "backgroundType", js.undefined)
    
    inline def setButton(value: js.Array[ButtonProps]): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    inline def setButtonVarargs(value: ButtonProps*): Self = StObject.set(x, "button", js.Array(value :_*))
    
    inline def setHasBottomBorder(value: Boolean): Self = StObject.set(x, "hasBottomBorder", value.asInstanceOf[js.Any])
    
    inline def setHasBottomBorderUndefined: Self = StObject.set(x, "hasBottomBorder", js.undefined)
    
    inline def setSize(value: large | normal | small | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setStretch(value: Boolean): Self = StObject.set(x, "stretch", value.asInstanceOf[js.Any])
    
    inline def setStretchUndefined: Self = StObject.set(x, "stretch", js.undefined)
    
    inline def setType(value: primary | normal): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setWrapperStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "wrapperStyle", value.asInstanceOf[js.Any])
    
    inline def setWrapperStyleNull: Self = StObject.set(x, "wrapperStyle", null)
    
    inline def setWrapperStyleUndefined: Self = StObject.set(x, "wrapperStyle", js.undefined)
  }
}
