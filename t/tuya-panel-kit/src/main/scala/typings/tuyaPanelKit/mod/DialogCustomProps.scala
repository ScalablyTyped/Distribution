package typings.tuyaPanelKit.mod

import typings.react.mod.ElementType
import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.tuyaPanelKit.anon.`21`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialogCustomProps
  extends StObject
     with DialogProps {
  
  var cancelAccessibilityLabel: js.UndefOr[String] = js.undefined
  
  var cancelText: String
  
  var cancelTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  var confirmAccessibilityLabel: js.UndefOr[String] = js.undefined
  
  var confirmText: String
  
  var confirmTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  var content: js.UndefOr[js.Any] = js.undefined
  
  var footer: js.UndefOr[ElementType[js.Any] | js.Function0[ReactNode]] = js.undefined
  
  var footerWrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var header: js.UndefOr[ElementType[js.Any] | js.Function0[ReactNode]] = js.undefined
  
  var headerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var onCancel: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onConfirm: js.UndefOr[js.Function2[/* data */ js.Any, /* args */ `21`, Unit]] = js.undefined
}
object DialogCustomProps {
  
  inline def apply(cancelText: String, confirmText: String, title: String): DialogCustomProps = {
    val __obj = js.Dynamic.literal(cancelText = cancelText.asInstanceOf[js.Any], confirmText = confirmText.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogCustomProps]
  }
  
  extension [Self <: DialogCustomProps](x: Self) {
    
    inline def setCancelAccessibilityLabel(value: String): Self = StObject.set(x, "cancelAccessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setCancelAccessibilityLabelUndefined: Self = StObject.set(x, "cancelAccessibilityLabel", js.undefined)
    
    inline def setCancelText(value: String): Self = StObject.set(x, "cancelText", value.asInstanceOf[js.Any])
    
    inline def setCancelTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "cancelTextStyle", value.asInstanceOf[js.Any])
    
    inline def setCancelTextStyleNull: Self = StObject.set(x, "cancelTextStyle", null)
    
    inline def setCancelTextStyleUndefined: Self = StObject.set(x, "cancelTextStyle", js.undefined)
    
    inline def setConfirmAccessibilityLabel(value: String): Self = StObject.set(x, "confirmAccessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setConfirmAccessibilityLabelUndefined: Self = StObject.set(x, "confirmAccessibilityLabel", js.undefined)
    
    inline def setConfirmText(value: String): Self = StObject.set(x, "confirmText", value.asInstanceOf[js.Any])
    
    inline def setConfirmTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "confirmTextStyle", value.asInstanceOf[js.Any])
    
    inline def setConfirmTextStyleNull: Self = StObject.set(x, "confirmTextStyle", null)
    
    inline def setConfirmTextStyleUndefined: Self = StObject.set(x, "confirmTextStyle", js.undefined)
    
    inline def setContent(value: js.Any): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setFooter(value: ElementType[js.Any] | js.Function0[ReactNode]): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    inline def setFooterFunction0(value: () => ReactNode): Self = StObject.set(x, "footer", js.Any.fromFunction0(value))
    
    inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
    
    inline def setFooterWrapperStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "footerWrapperStyle", value.asInstanceOf[js.Any])
    
    inline def setFooterWrapperStyleNull: Self = StObject.set(x, "footerWrapperStyle", null)
    
    inline def setFooterWrapperStyleUndefined: Self = StObject.set(x, "footerWrapperStyle", js.undefined)
    
    inline def setHeader(value: ElementType[js.Any] | js.Function0[ReactNode]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderFunction0(value: () => ReactNode): Self = StObject.set(x, "header", js.Any.fromFunction0(value))
    
    inline def setHeaderStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "headerStyle", value.asInstanceOf[js.Any])
    
    inline def setHeaderStyleNull: Self = StObject.set(x, "headerStyle", null)
    
    inline def setHeaderStyleUndefined: Self = StObject.set(x, "headerStyle", js.undefined)
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setOnCancel(value: () => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction0(value))
    
    inline def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
    
    inline def setOnConfirm(value: (/* data */ js.Any, /* args */ `21`) => Unit): Self = StObject.set(x, "onConfirm", js.Any.fromFunction2(value))
    
    inline def setOnConfirmUndefined: Self = StObject.set(x, "onConfirm", js.undefined)
  }
}
