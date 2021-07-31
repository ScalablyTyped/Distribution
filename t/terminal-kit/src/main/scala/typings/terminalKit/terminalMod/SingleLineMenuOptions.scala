package typings.terminalKit.terminalMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SingleLineMenuOptions extends StObject {
  
  var cancelable: js.UndefOr[Boolean] = js.undefined
  
  var exitOnUnexpectedKey: js.UndefOr[Boolean] = js.undefined
  
  var keyBindings: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var nextPageHint: js.UndefOr[String] = js.undefined
  
  var previousPageHint: js.UndefOr[String] = js.undefined
  
  var selectedStyle: js.UndefOr[CTerminal] = js.undefined
  
  var separator: js.UndefOr[String] = js.undefined
  
  var style: js.UndefOr[CTerminal] = js.undefined
  
  var y: js.UndefOr[Double] = js.undefined
}
object SingleLineMenuOptions {
  
  @scala.inline
  def apply(): SingleLineMenuOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SingleLineMenuOptions]
  }
  
  @scala.inline
  implicit class SingleLineMenuOptionsMutableBuilder[Self <: SingleLineMenuOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancelable(value: Boolean): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelableUndefined: Self = StObject.set(x, "cancelable", js.undefined)
    
    @scala.inline
    def setExitOnUnexpectedKey(value: Boolean): Self = StObject.set(x, "exitOnUnexpectedKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExitOnUnexpectedKeyUndefined: Self = StObject.set(x, "exitOnUnexpectedKey", js.undefined)
    
    @scala.inline
    def setKeyBindings(value: StringDictionary[String]): Self = StObject.set(x, "keyBindings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyBindingsUndefined: Self = StObject.set(x, "keyBindings", js.undefined)
    
    @scala.inline
    def setNextPageHint(value: String): Self = StObject.set(x, "nextPageHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageHintUndefined: Self = StObject.set(x, "nextPageHint", js.undefined)
    
    @scala.inline
    def setPreviousPageHint(value: String): Self = StObject.set(x, "previousPageHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousPageHintUndefined: Self = StObject.set(x, "previousPageHint", js.undefined)
    
    @scala.inline
    def setSelectedStyle(value: CTerminal): Self = StObject.set(x, "selectedStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedStyleUndefined: Self = StObject.set(x, "selectedStyle", js.undefined)
    
    @scala.inline
    def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
    
    @scala.inline
    def setStyle(value: CTerminal): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
