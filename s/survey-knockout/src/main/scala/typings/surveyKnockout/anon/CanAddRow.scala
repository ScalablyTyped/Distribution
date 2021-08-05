package typings.surveyKnockout.anon

import typings.surveyKnockout.mod.IQuestion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanAddRow extends StObject {
  
  var canAddRow: Boolean
  
  var question: IQuestion
}
object CanAddRow {
  
  inline def apply(canAddRow: Boolean, question: IQuestion): CanAddRow = {
    val __obj = js.Dynamic.literal(canAddRow = canAddRow.asInstanceOf[js.Any], question = question.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanAddRow]
  }
  
  extension [Self <: CanAddRow](x: Self) {
    
    inline def setCanAddRow(value: Boolean): Self = StObject.set(x, "canAddRow", value.asInstanceOf[js.Any])
    
    inline def setQuestion(value: IQuestion): Self = StObject.set(x, "question", value.asInstanceOf[js.Any])
  }
}
