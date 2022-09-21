package typings.tengitsui.mod

import typings.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoCompleteOpts extends StObject {
  
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  
  var backfill: js.UndefOr[Boolean] = js.undefined
  
  var dropdownMenuStyle: js.UndefOr[CSSProperties] = js.undefined
  
  var optionLabelProp: js.UndefOr[String] = js.undefined
}
object AutoCompleteOpts {
  
  inline def apply(): AutoCompleteOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoCompleteOpts]
  }
  
  extension [Self <: AutoCompleteOpts](x: Self) {
    
    inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
    
    inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
    
    inline def setBackfill(value: Boolean): Self = StObject.set(x, "backfill", value.asInstanceOf[js.Any])
    
    inline def setBackfillUndefined: Self = StObject.set(x, "backfill", js.undefined)
    
    inline def setDropdownMenuStyle(value: CSSProperties): Self = StObject.set(x, "dropdownMenuStyle", value.asInstanceOf[js.Any])
    
    inline def setDropdownMenuStyleUndefined: Self = StObject.set(x, "dropdownMenuStyle", js.undefined)
    
    inline def setOptionLabelProp(value: String): Self = StObject.set(x, "optionLabelProp", value.asInstanceOf[js.Any])
    
    inline def setOptionLabelPropUndefined: Self = StObject.set(x, "optionLabelProp", js.undefined)
  }
}
