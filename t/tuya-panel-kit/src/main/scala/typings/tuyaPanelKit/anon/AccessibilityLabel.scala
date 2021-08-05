package typings.tuyaPanelKit.anon

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessibilityLabel extends StObject {
  
  var accessibilityLabel: js.UndefOr[String] = js.undefined
  
  var activeStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var activeTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  var key: String
  
  var onItemPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onPress: js.UndefOr[js.Function1[/* index */ String, Unit]] = js.undefined
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var textAccessibilityLabel: js.UndefOr[String] = js.undefined
  
  var textStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  var title: String
}
object AccessibilityLabel {
  
  inline def apply(key: String, title: String): AccessibilityLabel = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessibilityLabel]
  }
  
  extension [Self <: AccessibilityLabel](x: Self) {
    
    inline def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
    
    inline def setActiveStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "activeStyle", value.asInstanceOf[js.Any])
    
    inline def setActiveStyleNull: Self = StObject.set(x, "activeStyle", null)
    
    inline def setActiveStyleUndefined: Self = StObject.set(x, "activeStyle", js.undefined)
    
    inline def setActiveTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "activeTextStyle", value.asInstanceOf[js.Any])
    
    inline def setActiveTextStyleNull: Self = StObject.set(x, "activeTextStyle", null)
    
    inline def setActiveTextStyleUndefined: Self = StObject.set(x, "activeTextStyle", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setOnItemPress(value: () => Unit): Self = StObject.set(x, "onItemPress", js.Any.fromFunction0(value))
    
    inline def setOnItemPressUndefined: Self = StObject.set(x, "onItemPress", js.undefined)
    
    inline def setOnPress(value: /* index */ String => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction1(value))
    
    inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
    
    inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTextAccessibilityLabel(value: String): Self = StObject.set(x, "textAccessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setTextAccessibilityLabelUndefined: Self = StObject.set(x, "textAccessibilityLabel", js.undefined)
    
    inline def setTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
    
    inline def setTextStyleNull: Self = StObject.set(x, "textStyle", null)
    
    inline def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
