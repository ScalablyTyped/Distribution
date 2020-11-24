package typings.tuyaPanelKit.mod

import org.scalablytyped.runtime.StringDictionary
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.tuyaPanelKit.anon.ActiveSize
import typings.tuyaPanelKit.anon.Margin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SwitchButtonProps extends js.Object {
  
  var accessibilityLabel: js.UndefOr[String] = js.native
  
  var borderColor: js.UndefOr[String] = js.native
  
  var defaultValue: js.UndefOr[Boolean] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var offText: js.UndefOr[String] = js.native
  
  var offTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  
  var onText: js.UndefOr[String] = js.native
  
  var onTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  
  var onThumbTintColor: js.UndefOr[String] = js.native
  
  var onTintColor: js.UndefOr[String | StringDictionary[String]] = js.native
  
  def onValueChange(value: Boolean): Unit = js.native
  
  var size: js.UndefOr[ActiveSize] = js.native
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var theme: js.UndefOr[Margin] = js.native
  
  var thumbStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var thumbTintColor: js.UndefOr[String] = js.native
  
  var tintColor: js.UndefOr[String | StringDictionary[String]] = js.native
  
  var useNativeDriver: js.UndefOr[Boolean] = js.native
  
  var value: js.UndefOr[Boolean] = js.native
}
object SwitchButtonProps {
  
  @scala.inline
  def apply(onValueChange: Boolean => Unit): SwitchButtonProps = {
    val __obj = js.Dynamic.literal(onValueChange = js.Any.fromFunction1(onValueChange))
    __obj.asInstanceOf[SwitchButtonProps]
  }
  
  @scala.inline
  implicit class SwitchButtonPropsOps[Self <: SwitchButtonProps] (val x: Self) extends AnyVal {
    
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
    def setOnValueChange(value: Boolean => Unit): Self = this.set("onValueChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAccessibilityLabel(value: String): Self = this.set("accessibilityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityLabel: Self = this.set("accessibilityLabel", js.undefined)
    
    @scala.inline
    def setBorderColor(value: String): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderColor: Self = this.set("borderColor", js.undefined)
    
    @scala.inline
    def setDefaultValue(value: Boolean): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setOffText(value: String): Self = this.set("offText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffText: Self = this.set("offText", js.undefined)
    
    @scala.inline
    def setOffTextStyle(value: StyleProp[TextStyle]): Self = this.set("offTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffTextStyle: Self = this.set("offTextStyle", js.undefined)
    
    @scala.inline
    def setOffTextStyleNull: Self = this.set("offTextStyle", null)
    
    @scala.inline
    def setOnText(value: String): Self = this.set("onText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnText: Self = this.set("onText", js.undefined)
    
    @scala.inline
    def setOnTextStyle(value: StyleProp[TextStyle]): Self = this.set("onTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnTextStyle: Self = this.set("onTextStyle", js.undefined)
    
    @scala.inline
    def setOnTextStyleNull: Self = this.set("onTextStyle", null)
    
    @scala.inline
    def setOnThumbTintColor(value: String): Self = this.set("onThumbTintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnThumbTintColor: Self = this.set("onThumbTintColor", js.undefined)
    
    @scala.inline
    def setOnTintColor(value: String | StringDictionary[String]): Self = this.set("onTintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnTintColor: Self = this.set("onTintColor", js.undefined)
    
    @scala.inline
    def setSize(value: ActiveSize): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
    
    @scala.inline
    def setTheme(value: Margin): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    
    @scala.inline
    def setThumbStyle(value: StyleProp[ViewStyle]): Self = this.set("thumbStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbStyle: Self = this.set("thumbStyle", js.undefined)
    
    @scala.inline
    def setThumbStyleNull: Self = this.set("thumbStyle", null)
    
    @scala.inline
    def setThumbTintColor(value: String): Self = this.set("thumbTintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbTintColor: Self = this.set("thumbTintColor", js.undefined)
    
    @scala.inline
    def setTintColor(value: String | StringDictionary[String]): Self = this.set("tintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTintColor: Self = this.set("tintColor", js.undefined)
    
    @scala.inline
    def setUseNativeDriver(value: Boolean): Self = this.set("useNativeDriver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseNativeDriver: Self = this.set("useNativeDriver", js.undefined)
    
    @scala.inline
    def setValue(value: Boolean): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
