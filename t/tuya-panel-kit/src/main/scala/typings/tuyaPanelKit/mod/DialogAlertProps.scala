package typings.tuyaPanelKit.mod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.tuyaPanelKit.anon.`21`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialogAlertProps
  extends StObject
     with DialogProps {
  
  var confirmAccessibilityLabel: js.UndefOr[String] = js.undefined
  
  var confirmText: String
  
  var confirmTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  var footerWrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var onConfirm: js.UndefOr[js.Function2[/* data */ js.Any, /* args */ `21`, Unit]] = js.undefined
}
object DialogAlertProps {
  
  @scala.inline
  def apply(confirmText: String, title: String): DialogAlertProps = {
    val __obj = js.Dynamic.literal(confirmText = confirmText.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogAlertProps]
  }
  
  @scala.inline
  implicit class DialogAlertPropsMutableBuilder[Self <: DialogAlertProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfirmAccessibilityLabel(value: String): Self = StObject.set(x, "confirmAccessibilityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfirmAccessibilityLabelUndefined: Self = StObject.set(x, "confirmAccessibilityLabel", js.undefined)
    
    @scala.inline
    def setConfirmText(value: String): Self = StObject.set(x, "confirmText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfirmTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "confirmTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfirmTextStyleNull: Self = StObject.set(x, "confirmTextStyle", null)
    
    @scala.inline
    def setConfirmTextStyleUndefined: Self = StObject.set(x, "confirmTextStyle", js.undefined)
    
    @scala.inline
    def setFooterWrapperStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "footerWrapperStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterWrapperStyleNull: Self = StObject.set(x, "footerWrapperStyle", null)
    
    @scala.inline
    def setFooterWrapperStyleUndefined: Self = StObject.set(x, "footerWrapperStyle", js.undefined)
    
    @scala.inline
    def setOnConfirm(value: (/* data */ js.Any, /* args */ `21`) => Unit): Self = StObject.set(x, "onConfirm", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnConfirmUndefined: Self = StObject.set(x, "onConfirm", js.undefined)
  }
}
