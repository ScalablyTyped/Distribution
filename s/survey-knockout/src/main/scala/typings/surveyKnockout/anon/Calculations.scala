package typings.surveyKnockout.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Calculations extends StObject {
  
  var calculations: js.UndefOr[js.Array[PropertyName]] = js.undefined
  
  var includeEmpty: js.UndefOr[Boolean] = js.undefined
}
object Calculations {
  
  @scala.inline
  def apply(): Calculations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Calculations]
  }
  
  @scala.inline
  implicit class CalculationsMutableBuilder[Self <: Calculations] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCalculations(value: js.Array[PropertyName]): Self = StObject.set(x, "calculations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalculationsUndefined: Self = StObject.set(x, "calculations", js.undefined)
    
    @scala.inline
    def setCalculationsVarargs(value: PropertyName*): Self = StObject.set(x, "calculations", js.Array(value :_*))
    
    @scala.inline
    def setIncludeEmpty(value: Boolean): Self = StObject.set(x, "includeEmpty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeEmptyUndefined: Self = StObject.set(x, "includeEmpty", js.undefined)
  }
}
