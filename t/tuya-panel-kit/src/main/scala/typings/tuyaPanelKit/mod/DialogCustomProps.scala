package typings.tuyaPanelKit.mod

import typings.react.mod.ElementType
import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.tuyaPanelKit.anon.`21`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DialogCustomProps extends DialogProps {
  
  var cancelAccessibilityLabel: js.UndefOr[String] = js.native
  
  var cancelText: String = js.native
  
  var cancelTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  
  var confirmAccessibilityLabel: js.UndefOr[String] = js.native
  
  var confirmText: String = js.native
  
  var confirmTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  
  var content: js.UndefOr[js.Any] = js.native
  
  var footer: js.UndefOr[ElementType[_] | js.Function0[ReactNode]] = js.native
  
  var footerWrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var header: js.UndefOr[ElementType[_] | js.Function0[ReactNode]] = js.native
  
  var headerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var onCancel: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onConfirm: js.UndefOr[js.Function2[/* data */ js.Any, /* args */ `21`, Unit]] = js.native
}
object DialogCustomProps {
  
  @scala.inline
  def apply(cancelText: String, confirmText: String, title: String): DialogCustomProps = {
    val __obj = js.Dynamic.literal(cancelText = cancelText.asInstanceOf[js.Any], confirmText = confirmText.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogCustomProps]
  }
  
  @scala.inline
  implicit class DialogCustomPropsOps[Self <: DialogCustomProps] (val x: Self) extends AnyVal {
    
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
    def setCancelText(value: String): Self = this.set("cancelText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfirmText(value: String): Self = this.set("confirmText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelAccessibilityLabel(value: String): Self = this.set("cancelAccessibilityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelAccessibilityLabel: Self = this.set("cancelAccessibilityLabel", js.undefined)
    
    @scala.inline
    def setCancelTextStyle(value: StyleProp[TextStyle]): Self = this.set("cancelTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelTextStyle: Self = this.set("cancelTextStyle", js.undefined)
    
    @scala.inline
    def setCancelTextStyleNull: Self = this.set("cancelTextStyle", null)
    
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
    def setContent(value: js.Any): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setFooterFunction0(value: () => ReactNode): Self = this.set("footer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFooter(value: ElementType[_] | js.Function0[ReactNode]): Self = this.set("footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFooter: Self = this.set("footer", js.undefined)
    
    @scala.inline
    def setFooterWrapperStyle(value: StyleProp[ViewStyle]): Self = this.set("footerWrapperStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFooterWrapperStyle: Self = this.set("footerWrapperStyle", js.undefined)
    
    @scala.inline
    def setFooterWrapperStyleNull: Self = this.set("footerWrapperStyle", null)
    
    @scala.inline
    def setHeaderFunction0(value: () => ReactNode): Self = this.set("header", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHeader(value: ElementType[_] | js.Function0[ReactNode]): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    
    @scala.inline
    def setHeaderStyle(value: StyleProp[ViewStyle]): Self = this.set("headerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderStyle: Self = this.set("headerStyle", js.undefined)
    
    @scala.inline
    def setHeaderStyleNull: Self = this.set("headerStyle", null)
    
    @scala.inline
    def setOnCancel(value: () => Unit): Self = this.set("onCancel", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnCancel: Self = this.set("onCancel", js.undefined)
    
    @scala.inline
    def setOnConfirm(value: (/* data */ js.Any, /* args */ `21`) => Unit): Self = this.set("onConfirm", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnConfirm: Self = this.set("onConfirm", js.undefined)
  }
}
