package typings.terminalKit.terminalMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridMenuOptions extends StObject {
  
  var exitOnUnexpectedKey: js.UndefOr[Boolean] = js.undefined
  
  var itemMaxWidth: js.UndefOr[Double] = js.undefined
  
  var keyBindings: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var leftPadding: js.UndefOr[String] = js.undefined
  
  var rightPadding: js.UndefOr[String] = js.undefined
  
  var selectedLeftPadding: js.UndefOr[String] = js.undefined
  
  var selectedRightPadding: js.UndefOr[String] = js.undefined
  
  var selectedStyle: js.UndefOr[CTerminal] = js.undefined
  
  var style: js.UndefOr[CTerminal] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
  
  var x: js.UndefOr[Double] = js.undefined
  
  var y: js.UndefOr[Double] = js.undefined
}
object GridMenuOptions {
  
  inline def apply(): GridMenuOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridMenuOptions]
  }
  
  extension [Self <: GridMenuOptions](x: Self) {
    
    inline def setExitOnUnexpectedKey(value: Boolean): Self = StObject.set(x, "exitOnUnexpectedKey", value.asInstanceOf[js.Any])
    
    inline def setExitOnUnexpectedKeyUndefined: Self = StObject.set(x, "exitOnUnexpectedKey", js.undefined)
    
    inline def setItemMaxWidth(value: Double): Self = StObject.set(x, "itemMaxWidth", value.asInstanceOf[js.Any])
    
    inline def setItemMaxWidthUndefined: Self = StObject.set(x, "itemMaxWidth", js.undefined)
    
    inline def setKeyBindings(value: StringDictionary[String]): Self = StObject.set(x, "keyBindings", value.asInstanceOf[js.Any])
    
    inline def setKeyBindingsUndefined: Self = StObject.set(x, "keyBindings", js.undefined)
    
    inline def setLeftPadding(value: String): Self = StObject.set(x, "leftPadding", value.asInstanceOf[js.Any])
    
    inline def setLeftPaddingUndefined: Self = StObject.set(x, "leftPadding", js.undefined)
    
    inline def setRightPadding(value: String): Self = StObject.set(x, "rightPadding", value.asInstanceOf[js.Any])
    
    inline def setRightPaddingUndefined: Self = StObject.set(x, "rightPadding", js.undefined)
    
    inline def setSelectedLeftPadding(value: String): Self = StObject.set(x, "selectedLeftPadding", value.asInstanceOf[js.Any])
    
    inline def setSelectedLeftPaddingUndefined: Self = StObject.set(x, "selectedLeftPadding", js.undefined)
    
    inline def setSelectedRightPadding(value: String): Self = StObject.set(x, "selectedRightPadding", value.asInstanceOf[js.Any])
    
    inline def setSelectedRightPaddingUndefined: Self = StObject.set(x, "selectedRightPadding", js.undefined)
    
    inline def setSelectedStyle(value: CTerminal): Self = StObject.set(x, "selectedStyle", value.asInstanceOf[js.Any])
    
    inline def setSelectedStyleUndefined: Self = StObject.set(x, "selectedStyle", js.undefined)
    
    inline def setStyle(value: CTerminal): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
