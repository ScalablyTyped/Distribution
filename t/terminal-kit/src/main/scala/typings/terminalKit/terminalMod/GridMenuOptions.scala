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
  
  @scala.inline
  def apply(): GridMenuOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridMenuOptions]
  }
  
  @scala.inline
  implicit class GridMenuOptionsMutableBuilder[Self <: GridMenuOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExitOnUnexpectedKey(value: Boolean): Self = StObject.set(x, "exitOnUnexpectedKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExitOnUnexpectedKeyUndefined: Self = StObject.set(x, "exitOnUnexpectedKey", js.undefined)
    
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
    def setRightPadding(value: String): Self = StObject.set(x, "rightPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightPaddingUndefined: Self = StObject.set(x, "rightPadding", js.undefined)
    
    @scala.inline
    def setSelectedLeftPadding(value: String): Self = StObject.set(x, "selectedLeftPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedLeftPaddingUndefined: Self = StObject.set(x, "selectedLeftPadding", js.undefined)
    
    @scala.inline
    def setSelectedRightPadding(value: String): Self = StObject.set(x, "selectedRightPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedRightPaddingUndefined: Self = StObject.set(x, "selectedRightPadding", js.undefined)
    
    @scala.inline
    def setSelectedStyle(value: CTerminal): Self = StObject.set(x, "selectedStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedStyleUndefined: Self = StObject.set(x, "selectedStyle", js.undefined)
    
    @scala.inline
    def setStyle(value: CTerminal): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
