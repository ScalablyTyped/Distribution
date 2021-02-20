package typings.tuyaPanelKit.anon

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccessibilityLabel extends StObject {
  
  var accessibilityLabel: js.UndefOr[String] = js.native
  
  var activeStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var activeTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  
  var key: String = js.native
  
  var onItemPress: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onPress: js.UndefOr[js.Function1[/* index */ String, Unit]] = js.native
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var textAccessibilityLabel: js.UndefOr[String] = js.native
  
  var textStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  
  var title: String = js.native
}
object AccessibilityLabel {
  
  @scala.inline
  def apply(key: String, title: String): AccessibilityLabel = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessibilityLabel]
  }
  
  @scala.inline
  implicit class AccessibilityLabelMutableBuilder[Self <: AccessibilityLabel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
    
    @scala.inline
    def setActiveStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "activeStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveStyleNull: Self = StObject.set(x, "activeStyle", null)
    
    @scala.inline
    def setActiveStyleUndefined: Self = StObject.set(x, "activeStyle", js.undefined)
    
    @scala.inline
    def setActiveTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "activeTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveTextStyleNull: Self = StObject.set(x, "activeTextStyle", null)
    
    @scala.inline
    def setActiveTextStyleUndefined: Self = StObject.set(x, "activeTextStyle", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnItemPress(value: () => Unit): Self = StObject.set(x, "onItemPress", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnItemPressUndefined: Self = StObject.set(x, "onItemPress", js.undefined)
    
    @scala.inline
    def setOnPress(value: /* index */ String => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
    
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleNull: Self = StObject.set(x, "style", null)
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setTextAccessibilityLabel(value: String): Self = StObject.set(x, "textAccessibilityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextAccessibilityLabelUndefined: Self = StObject.set(x, "textAccessibilityLabel", js.undefined)
    
    @scala.inline
    def setTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextStyleNull: Self = StObject.set(x, "textStyle", null)
    
    @scala.inline
    def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
