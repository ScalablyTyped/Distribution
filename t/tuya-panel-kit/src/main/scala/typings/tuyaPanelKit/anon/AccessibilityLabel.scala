package typings.tuyaPanelKit.anon

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccessibilityLabel extends js.Object {
  
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
  implicit class AccessibilityLabelOps[Self <: AccessibilityLabel] (val x: Self) extends AnyVal {
    
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityLabel(value: String): Self = this.set("accessibilityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityLabel: Self = this.set("accessibilityLabel", js.undefined)
    
    @scala.inline
    def setActiveStyle(value: StyleProp[ViewStyle]): Self = this.set("activeStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveStyle: Self = this.set("activeStyle", js.undefined)
    
    @scala.inline
    def setActiveStyleNull: Self = this.set("activeStyle", null)
    
    @scala.inline
    def setActiveTextStyle(value: StyleProp[TextStyle]): Self = this.set("activeTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveTextStyle: Self = this.set("activeTextStyle", js.undefined)
    
    @scala.inline
    def setActiveTextStyleNull: Self = this.set("activeTextStyle", null)
    
    @scala.inline
    def setOnItemPress(value: () => Unit): Self = this.set("onItemPress", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnItemPress: Self = this.set("onItemPress", js.undefined)
    
    @scala.inline
    def setOnPress(value: /* index */ String => Unit): Self = this.set("onPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPress: Self = this.set("onPress", js.undefined)
    
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
    
    @scala.inline
    def setTextAccessibilityLabel(value: String): Self = this.set("textAccessibilityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextAccessibilityLabel: Self = this.set("textAccessibilityLabel", js.undefined)
    
    @scala.inline
    def setTextStyle(value: StyleProp[TextStyle]): Self = this.set("textStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextStyle: Self = this.set("textStyle", js.undefined)
    
    @scala.inline
    def setTextStyleNull: Self = this.set("textStyle", null)
  }
}
