package typings.surveyKnockout.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Calculations extends StObject {
  
  var calculations: js.UndefOr[js.Array[PropertyName]] = js.undefined
  
  var includeEmpty: js.UndefOr[Boolean] = js.undefined
}
object Calculations {
  
  inline def apply(): Calculations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Calculations]
  }
  
  extension [Self <: Calculations](x: Self) {
    
    inline def setCalculations(value: js.Array[PropertyName]): Self = StObject.set(x, "calculations", value.asInstanceOf[js.Any])
    
    inline def setCalculationsUndefined: Self = StObject.set(x, "calculations", js.undefined)
    
    inline def setCalculationsVarargs(value: PropertyName*): Self = StObject.set(x, "calculations", js.Array(value :_*))
    
    inline def setIncludeEmpty(value: Boolean): Self = StObject.set(x, "includeEmpty", value.asInstanceOf[js.Any])
    
    inline def setIncludeEmptyUndefined: Self = StObject.set(x, "includeEmpty", js.undefined)
  }
}
