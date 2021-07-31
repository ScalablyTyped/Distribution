package typings.tuyaPanelKit.mod

import org.scalablytyped.runtime.StringDictionary
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.tuyaPanelKit.anon.ActiveSize
import typings.tuyaPanelKit.anon.Margin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SwitchButtonProps extends StObject {
  
  var accessibilityLabel: js.UndefOr[String] = js.undefined
  
  var borderColor: js.UndefOr[String] = js.undefined
  
  var defaultValue: js.UndefOr[Boolean] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var offText: js.UndefOr[String] = js.undefined
  
  var offTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  var onText: js.UndefOr[String] = js.undefined
  
  var onTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  var onThumbTintColor: js.UndefOr[String] = js.undefined
  
  var onTintColor: js.UndefOr[String | StringDictionary[String]] = js.undefined
  
  def onValueChange(value: Boolean): Unit
  
  var size: js.UndefOr[ActiveSize] = js.undefined
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var theme: js.UndefOr[Margin] = js.undefined
  
  var thumbStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var thumbTintColor: js.UndefOr[String] = js.undefined
  
  var tintColor: js.UndefOr[String | StringDictionary[String]] = js.undefined
  
  var useNativeDriver: js.UndefOr[Boolean] = js.undefined
  
  var value: js.UndefOr[Boolean] = js.undefined
}
object SwitchButtonProps {
  
  @scala.inline
  def apply(onValueChange: Boolean => Unit): SwitchButtonProps = {
    val __obj = js.Dynamic.literal(onValueChange = js.Any.fromFunction1(onValueChange))
    __obj.asInstanceOf[SwitchButtonProps]
  }
  
  @scala.inline
  implicit class SwitchButtonPropsMutableBuilder[Self <: SwitchButtonProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
    
    @scala.inline
    def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    @scala.inline
    def setDefaultValue(value: Boolean): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setOffText(value: String): Self = StObject.set(x, "offText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "offTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffTextStyleNull: Self = StObject.set(x, "offTextStyle", null)
    
    @scala.inline
    def setOffTextStyleUndefined: Self = StObject.set(x, "offTextStyle", js.undefined)
    
    @scala.inline
    def setOffTextUndefined: Self = StObject.set(x, "offText", js.undefined)
    
    @scala.inline
    def setOnText(value: String): Self = StObject.set(x, "onText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "onTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnTextStyleNull: Self = StObject.set(x, "onTextStyle", null)
    
    @scala.inline
    def setOnTextStyleUndefined: Self = StObject.set(x, "onTextStyle", js.undefined)
    
    @scala.inline
    def setOnTextUndefined: Self = StObject.set(x, "onText", js.undefined)
    
    @scala.inline
    def setOnThumbTintColor(value: String): Self = StObject.set(x, "onThumbTintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnThumbTintColorUndefined: Self = StObject.set(x, "onThumbTintColor", js.undefined)
    
    @scala.inline
    def setOnTintColor(value: String | StringDictionary[String]): Self = StObject.set(x, "onTintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnTintColorUndefined: Self = StObject.set(x, "onTintColor", js.undefined)
    
    @scala.inline
    def setOnValueChange(value: Boolean => Unit): Self = StObject.set(x, "onValueChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSize(value: ActiveSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleNull: Self = StObject.set(x, "style", null)
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setTheme(value: Margin): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    @scala.inline
    def setThumbStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "thumbStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbStyleNull: Self = StObject.set(x, "thumbStyle", null)
    
    @scala.inline
    def setThumbStyleUndefined: Self = StObject.set(x, "thumbStyle", js.undefined)
    
    @scala.inline
    def setThumbTintColor(value: String): Self = StObject.set(x, "thumbTintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbTintColorUndefined: Self = StObject.set(x, "thumbTintColor", js.undefined)
    
    @scala.inline
    def setTintColor(value: String | StringDictionary[String]): Self = StObject.set(x, "tintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTintColorUndefined: Self = StObject.set(x, "tintColor", js.undefined)
    
    @scala.inline
    def setUseNativeDriver(value: Boolean): Self = StObject.set(x, "useNativeDriver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseNativeDriverUndefined: Self = StObject.set(x, "useNativeDriver", js.undefined)
    
    @scala.inline
    def setValue(value: Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
