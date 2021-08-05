package typings.tuyaPanelKit.stackTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StackHeaderInterpolatedStyle extends StObject {
  
  /**
    * Interpolated style for the header background.
    */
  var backgroundStyle: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Interpolated style for the left button (usually the back button).
    */
  var leftButtonStyle: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Interpolated style for the label of the left button (back button label).
    */
  var leftLabelStyle: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Interpolated style for the right button.
    */
  var rightButtonStyle: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Interpolated style for the header title text.
    */
  var titleStyle: js.UndefOr[js.Any] = js.undefined
}
object StackHeaderInterpolatedStyle {
  
  inline def apply(): StackHeaderInterpolatedStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StackHeaderInterpolatedStyle]
  }
  
  extension [Self <: StackHeaderInterpolatedStyle](x: Self) {
    
    inline def setBackgroundStyle(value: js.Any): Self = StObject.set(x, "backgroundStyle", value.asInstanceOf[js.Any])
    
    inline def setBackgroundStyleUndefined: Self = StObject.set(x, "backgroundStyle", js.undefined)
    
    inline def setLeftButtonStyle(value: js.Any): Self = StObject.set(x, "leftButtonStyle", value.asInstanceOf[js.Any])
    
    inline def setLeftButtonStyleUndefined: Self = StObject.set(x, "leftButtonStyle", js.undefined)
    
    inline def setLeftLabelStyle(value: js.Any): Self = StObject.set(x, "leftLabelStyle", value.asInstanceOf[js.Any])
    
    inline def setLeftLabelStyleUndefined: Self = StObject.set(x, "leftLabelStyle", js.undefined)
    
    inline def setRightButtonStyle(value: js.Any): Self = StObject.set(x, "rightButtonStyle", value.asInstanceOf[js.Any])
    
    inline def setRightButtonStyleUndefined: Self = StObject.set(x, "rightButtonStyle", js.undefined)
    
    inline def setTitleStyle(value: js.Any): Self = StObject.set(x, "titleStyle", value.asInstanceOf[js.Any])
    
    inline def setTitleStyleUndefined: Self = StObject.set(x, "titleStyle", js.undefined)
  }
}
