package typings.surveyKnockout.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncludeEmpty extends StObject {
  
  var calculations: js.UndefOr[js.Array[PropertyName]] = js.undefined
  
  var includeEmpty: js.UndefOr[Boolean] = js.undefined
  
  var includeQuestionTypes: js.UndefOr[Boolean] = js.undefined
}
object IncludeEmpty {
  
  @scala.inline
  def apply(): IncludeEmpty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IncludeEmpty]
  }
  
  @scala.inline
  implicit class IncludeEmptyMutableBuilder[Self <: IncludeEmpty] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setIncludeQuestionTypes(value: Boolean): Self = StObject.set(x, "includeQuestionTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeQuestionTypesUndefined: Self = StObject.set(x, "includeQuestionTypes", js.undefined)
  }
}
