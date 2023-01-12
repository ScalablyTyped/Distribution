package typings.terminalKit.terminalMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SingleColumnMenuOptions extends StObject {
  
  var cancelable: js.UndefOr[Boolean] = js.undefined
  
  var continueOnSubmit: js.UndefOr[Boolean] = js.undefined
  
  var exitOnUnexpectedKey: js.UndefOr[Boolean] = js.undefined
  
  var extraLines: js.UndefOr[Double] = js.undefined
  
  var itemMaxWidth: js.UndefOr[Double] = js.undefined
  
  var keyBindings: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var leftPadding: js.UndefOr[String] = js.undefined
  
  var oneLineItem: js.UndefOr[Boolean] = js.undefined
  
  var selectedIndex: js.UndefOr[Double] = js.undefined
  
  var selectedLeftPadding: js.UndefOr[String] = js.undefined
  
  var selectedStyle: js.UndefOr[CTerminal] = js.undefined
  
  var style: js.UndefOr[CTerminal] = js.undefined
  
  var submittedLeftPadding: js.UndefOr[String] = js.undefined
  
  var submittedStyle: js.UndefOr[CTerminal] = js.undefined
  
  var y: js.UndefOr[Double] = js.undefined
}
object SingleColumnMenuOptions {
  
  inline def apply(): SingleColumnMenuOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SingleColumnMenuOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SingleColumnMenuOptions] (val x: Self) extends AnyVal {
    
    inline def setCancelable(value: Boolean): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    inline def setCancelableUndefined: Self = StObject.set(x, "cancelable", js.undefined)
    
    inline def setContinueOnSubmit(value: Boolean): Self = StObject.set(x, "continueOnSubmit", value.asInstanceOf[js.Any])
    
    inline def setContinueOnSubmitUndefined: Self = StObject.set(x, "continueOnSubmit", js.undefined)
    
    inline def setExitOnUnexpectedKey(value: Boolean): Self = StObject.set(x, "exitOnUnexpectedKey", value.asInstanceOf[js.Any])
    
    inline def setExitOnUnexpectedKeyUndefined: Self = StObject.set(x, "exitOnUnexpectedKey", js.undefined)
    
    inline def setExtraLines(value: Double): Self = StObject.set(x, "extraLines", value.asInstanceOf[js.Any])
    
    inline def setExtraLinesUndefined: Self = StObject.set(x, "extraLines", js.undefined)
    
    inline def setItemMaxWidth(value: Double): Self = StObject.set(x, "itemMaxWidth", value.asInstanceOf[js.Any])
    
    inline def setItemMaxWidthUndefined: Self = StObject.set(x, "itemMaxWidth", js.undefined)
    
    inline def setKeyBindings(value: StringDictionary[String]): Self = StObject.set(x, "keyBindings", value.asInstanceOf[js.Any])
    
    inline def setKeyBindingsUndefined: Self = StObject.set(x, "keyBindings", js.undefined)
    
    inline def setLeftPadding(value: String): Self = StObject.set(x, "leftPadding", value.asInstanceOf[js.Any])
    
    inline def setLeftPaddingUndefined: Self = StObject.set(x, "leftPadding", js.undefined)
    
    inline def setOneLineItem(value: Boolean): Self = StObject.set(x, "oneLineItem", value.asInstanceOf[js.Any])
    
    inline def setOneLineItemUndefined: Self = StObject.set(x, "oneLineItem", js.undefined)
    
    inline def setSelectedIndex(value: Double): Self = StObject.set(x, "selectedIndex", value.asInstanceOf[js.Any])
    
    inline def setSelectedIndexUndefined: Self = StObject.set(x, "selectedIndex", js.undefined)
    
    inline def setSelectedLeftPadding(value: String): Self = StObject.set(x, "selectedLeftPadding", value.asInstanceOf[js.Any])
    
    inline def setSelectedLeftPaddingUndefined: Self = StObject.set(x, "selectedLeftPadding", js.undefined)
    
    inline def setSelectedStyle(value: CTerminal): Self = StObject.set(x, "selectedStyle", value.asInstanceOf[js.Any])
    
    inline def setSelectedStyleUndefined: Self = StObject.set(x, "selectedStyle", js.undefined)
    
    inline def setStyle(value: CTerminal): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setSubmittedLeftPadding(value: String): Self = StObject.set(x, "submittedLeftPadding", value.asInstanceOf[js.Any])
    
    inline def setSubmittedLeftPaddingUndefined: Self = StObject.set(x, "submittedLeftPadding", js.undefined)
    
    inline def setSubmittedStyle(value: CTerminal): Self = StObject.set(x, "submittedStyle", value.asInstanceOf[js.Any])
    
    inline def setSubmittedStyleUndefined: Self = StObject.set(x, "submittedStyle", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
