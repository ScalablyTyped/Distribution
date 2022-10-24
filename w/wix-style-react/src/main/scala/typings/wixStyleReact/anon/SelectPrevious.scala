package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectPrevious extends StObject {
  
  var selectPrevious: js.Function
  
  var unselectPrevious: js.Function
}
object SelectPrevious {
  
  inline def apply(selectPrevious: js.Function, unselectPrevious: js.Function): SelectPrevious = {
    val __obj = js.Dynamic.literal(selectPrevious = selectPrevious.asInstanceOf[js.Any], unselectPrevious = unselectPrevious.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectPrevious]
  }
  
  extension [Self <: SelectPrevious](x: Self) {
    
    inline def setSelectPrevious(value: js.Function): Self = StObject.set(x, "selectPrevious", value.asInstanceOf[js.Any])
    
    inline def setUnselectPrevious(value: js.Function): Self = StObject.set(x, "unselectPrevious", value.asInstanceOf[js.Any])
  }
}
