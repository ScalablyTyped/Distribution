package typings.tuyaPanelKit.mod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.tuyaPanelKit.anon.`21`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialogConfirmProps
  extends StObject
     with DialogProps {
  
  var cancelAccessibilityLabel: js.UndefOr[String] = js.undefined
  
  var cancelText: String
  
  var cancelTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  var confirmAccessibilityLabel: js.UndefOr[String] = js.undefined
  
  var confirmText: String
  
  var confirmTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  var footerWrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var onCancel: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onConfirm: js.UndefOr[js.Function2[/* data */ js.Any, /* args */ `21`, Unit]] = js.undefined
}
object DialogConfirmProps {
  
  inline def apply(cancelText: String, confirmText: String, title: String): DialogConfirmProps = {
    val __obj = js.Dynamic.literal(cancelText = cancelText.asInstanceOf[js.Any], confirmText = confirmText.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogConfirmProps]
  }
  
  extension [Self <: DialogConfirmProps](x: Self) {
    
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
    
    inline def setFooterWrapperStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "footerWrapperStyle", value.asInstanceOf[js.Any])
    
    inline def setFooterWrapperStyleNull: Self = StObject.set(x, "footerWrapperStyle", null)
    
    inline def setFooterWrapperStyleUndefined: Self = StObject.set(x, "footerWrapperStyle", js.undefined)
    
    inline def setOnCancel(value: () => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction0(value))
    
    inline def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
    
    inline def setOnConfirm(value: (/* data */ js.Any, /* args */ `21`) => Unit): Self = StObject.set(x, "onConfirm", js.Any.fromFunction2(value))
    
    inline def setOnConfirmUndefined: Self = StObject.set(x, "onConfirm", js.undefined)
  }
}
