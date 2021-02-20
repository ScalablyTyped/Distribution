package typings.surveyKnockout.anon

import typings.surveyKnockout.mod.IQuestion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanAddRow extends StObject {
  
  var canAddRow: Boolean = js.native
  
  var question: IQuestion = js.native
}
object CanAddRow {
  
  @scala.inline
  def apply(canAddRow: Boolean, question: IQuestion): CanAddRow = {
    val __obj = js.Dynamic.literal(canAddRow = canAddRow.asInstanceOf[js.Any], question = question.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanAddRow]
  }
  
  @scala.inline
  implicit class CanAddRowMutableBuilder[Self <: CanAddRow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanAddRow(value: Boolean): Self = StObject.set(x, "canAddRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuestion(value: IQuestion): Self = StObject.set(x, "question", value.asInstanceOf[js.Any])
  }
}
