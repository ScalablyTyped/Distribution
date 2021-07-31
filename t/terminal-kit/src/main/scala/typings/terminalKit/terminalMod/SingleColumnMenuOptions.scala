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
  
  @scala.inline
  def apply(): SingleColumnMenuOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SingleColumnMenuOptions]
  }
  
  @scala.inline
  implicit class SingleColumnMenuOptionsMutableBuilder[Self <: SingleColumnMenuOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancelable(value: Boolean): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelableUndefined: Self = StObject.set(x, "cancelable", js.undefined)
    
    @scala.inline
    def setContinueOnSubmit(value: Boolean): Self = StObject.set(x, "continueOnSubmit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContinueOnSubmitUndefined: Self = StObject.set(x, "continueOnSubmit", js.undefined)
    
    @scala.inline
    def setExitOnUnexpectedKey(value: Boolean): Self = StObject.set(x, "exitOnUnexpectedKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExitOnUnexpectedKeyUndefined: Self = StObject.set(x, "exitOnUnexpectedKey", js.undefined)
    
    @scala.inline
    def setExtraLines(value: Double): Self = StObject.set(x, "extraLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraLinesUndefined: Self = StObject.set(x, "extraLines", js.undefined)
    
    @scala.inline
    def setItemMaxWidth(value: Double): Self = StObject.set(x, "itemMaxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemMaxWidthUndefined: Self = StObject.set(x, "itemMaxWidth", js.undefined)
    
    @scala.inline
    def setKeyBindings(value: StringDictionary[String]): Self = StObject.set(x, "keyBindings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyBindingsUndefined: Self = StObject.set(x, "keyBindings", js.undefined)
    
    @scala.inline
    def setLeftPadding(value: String): Self = StObject.set(x, "leftPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftPaddingUndefined: Self = StObject.set(x, "leftPadding", js.undefined)
    
    @scala.inline
    def setOneLineItem(value: Boolean): Self = StObject.set(x, "oneLineItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOneLineItemUndefined: Self = StObject.set(x, "oneLineItem", js.undefined)
    
    @scala.inline
    def setSelectedIndex(value: Double): Self = StObject.set(x, "selectedIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedIndexUndefined: Self = StObject.set(x, "selectedIndex", js.undefined)
    
    @scala.inline
    def setSelectedLeftPadding(value: String): Self = StObject.set(x, "selectedLeftPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedLeftPaddingUndefined: Self = StObject.set(x, "selectedLeftPadding", js.undefined)
    
    @scala.inline
    def setSelectedStyle(value: CTerminal): Self = StObject.set(x, "selectedStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedStyleUndefined: Self = StObject.set(x, "selectedStyle", js.undefined)
    
    @scala.inline
    def setStyle(value: CTerminal): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setSubmittedLeftPadding(value: String): Self = StObject.set(x, "submittedLeftPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubmittedLeftPaddingUndefined: Self = StObject.set(x, "submittedLeftPadding", js.undefined)
    
    @scala.inline
    def setSubmittedStyle(value: CTerminal): Self = StObject.set(x, "submittedStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubmittedStyleUndefined: Self = StObject.set(x, "submittedStyle", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
