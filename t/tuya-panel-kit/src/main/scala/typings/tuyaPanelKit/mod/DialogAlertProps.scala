package typings.tuyaPanelKit.mod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.tuyaPanelKit.anon.`21`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DialogAlertProps extends DialogProps {
  
  var confirmAccessibilityLabel: js.UndefOr[String] = js.native
  
  var confirmText: String = js.native
  
  var confirmTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  
  var footerWrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var onConfirm: js.UndefOr[js.Function2[/* data */ js.Any, /* args */ `21`, Unit]] = js.native
}
object DialogAlertProps {
  
  @scala.inline
  def apply(confirmText: String, title: String): DialogAlertProps = {
    val __obj = js.Dynamic.literal(confirmText = confirmText.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogAlertProps]
  }
  
  @scala.inline
  implicit class DialogAlertPropsOps[Self <: DialogAlertProps] (val x: Self) extends AnyVal {
    
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
    def setConfirmText(value: String): Self = this.set("confirmText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfirmAccessibilityLabel(value: String): Self = this.set("confirmAccessibilityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfirmAccessibilityLabel: Self = this.set("confirmAccessibilityLabel", js.undefined)
    
    @scala.inline
    def setConfirmTextStyle(value: StyleProp[TextStyle]): Self = this.set("confirmTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfirmTextStyle: Self = this.set("confirmTextStyle", js.undefined)
    
    @scala.inline
    def setConfirmTextStyleNull: Self = this.set("confirmTextStyle", null)
    
    @scala.inline
    def setFooterWrapperStyle(value: StyleProp[ViewStyle]): Self = this.set("footerWrapperStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFooterWrapperStyle: Self = this.set("footerWrapperStyle", js.undefined)
    
    @scala.inline
    def setFooterWrapperStyleNull: Self = this.set("footerWrapperStyle", null)
    
    @scala.inline
    def setOnConfirm(value: (/* data */ js.Any, /* args */ `21`) => Unit): Self = this.set("onConfirm", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnConfirm: Self = this.set("onConfirm", js.undefined)
  }
}
