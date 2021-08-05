package typings.winrt.Windows.UI.ViewManagement

import typings.winrt.Windows.Foundation.Size
import typings.winrt.Windows.UI.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IUISettings extends StObject {
  
  var animationsEnabled: Boolean
  
  var caretBlinkRate: Double
  
  var caretBrowsingEnabled: Boolean
  
  var caretWidth: Double
  
  var cursorSize: Size
  
  var doubleClickTime: Double
  
  var handPreference: HandPreference
  
  var messageDuration: Double
  
  var mouseHoverTime: Double
  
  var scrollBarArrowSize: Size
  
  var scrollBarSize: Size
  
  var scrollBarThumbBoxSize: Size
  
  def uIElementColor(desiredElement: UIElementType): Color
}
object IUISettings {
  
  inline def apply(
    animationsEnabled: Boolean,
    caretBlinkRate: Double,
    caretBrowsingEnabled: Boolean,
    caretWidth: Double,
    cursorSize: Size,
    doubleClickTime: Double,
    handPreference: HandPreference,
    messageDuration: Double,
    mouseHoverTime: Double,
    scrollBarArrowSize: Size,
    scrollBarSize: Size,
    scrollBarThumbBoxSize: Size,
    uIElementColor: UIElementType => Color
  ): IUISettings = {
    val __obj = js.Dynamic.literal(animationsEnabled = animationsEnabled.asInstanceOf[js.Any], caretBlinkRate = caretBlinkRate.asInstanceOf[js.Any], caretBrowsingEnabled = caretBrowsingEnabled.asInstanceOf[js.Any], caretWidth = caretWidth.asInstanceOf[js.Any], cursorSize = cursorSize.asInstanceOf[js.Any], doubleClickTime = doubleClickTime.asInstanceOf[js.Any], handPreference = handPreference.asInstanceOf[js.Any], messageDuration = messageDuration.asInstanceOf[js.Any], mouseHoverTime = mouseHoverTime.asInstanceOf[js.Any], scrollBarArrowSize = scrollBarArrowSize.asInstanceOf[js.Any], scrollBarSize = scrollBarSize.asInstanceOf[js.Any], scrollBarThumbBoxSize = scrollBarThumbBoxSize.asInstanceOf[js.Any], uIElementColor = js.Any.fromFunction1(uIElementColor))
    __obj.asInstanceOf[IUISettings]
  }
  
  extension [Self <: IUISettings](x: Self) {
    
    inline def setAnimationsEnabled(value: Boolean): Self = StObject.set(x, "animationsEnabled", value.asInstanceOf[js.Any])
    
    inline def setCaretBlinkRate(value: Double): Self = StObject.set(x, "caretBlinkRate", value.asInstanceOf[js.Any])
    
    inline def setCaretBrowsingEnabled(value: Boolean): Self = StObject.set(x, "caretBrowsingEnabled", value.asInstanceOf[js.Any])
    
    inline def setCaretWidth(value: Double): Self = StObject.set(x, "caretWidth", value.asInstanceOf[js.Any])
    
    inline def setCursorSize(value: Size): Self = StObject.set(x, "cursorSize", value.asInstanceOf[js.Any])
    
    inline def setDoubleClickTime(value: Double): Self = StObject.set(x, "doubleClickTime", value.asInstanceOf[js.Any])
    
    inline def setHandPreference(value: HandPreference): Self = StObject.set(x, "handPreference", value.asInstanceOf[js.Any])
    
    inline def setMessageDuration(value: Double): Self = StObject.set(x, "messageDuration", value.asInstanceOf[js.Any])
    
    inline def setMouseHoverTime(value: Double): Self = StObject.set(x, "mouseHoverTime", value.asInstanceOf[js.Any])
    
    inline def setScrollBarArrowSize(value: Size): Self = StObject.set(x, "scrollBarArrowSize", value.asInstanceOf[js.Any])
    
    inline def setScrollBarSize(value: Size): Self = StObject.set(x, "scrollBarSize", value.asInstanceOf[js.Any])
    
    inline def setScrollBarThumbBoxSize(value: Size): Self = StObject.set(x, "scrollBarThumbBoxSize", value.asInstanceOf[js.Any])
    
    inline def setUIElementColor(value: UIElementType => Color): Self = StObject.set(x, "uIElementColor", js.Any.fromFunction1(value))
  }
}
