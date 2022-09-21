package typings.surveyKnockout.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnCellQuestionUpdate extends StObject {
  
  def onCellQuestionUpdate(cellQuestion: Any, column: Any, question: Any, data: Any): Unit
}
object OnCellQuestionUpdate {
  
  inline def apply(onCellQuestionUpdate: (Any, Any, Any, Any) => Unit): OnCellQuestionUpdate = {
    val __obj = js.Dynamic.literal(onCellQuestionUpdate = js.Any.fromFunction4(onCellQuestionUpdate))
    __obj.asInstanceOf[OnCellQuestionUpdate]
  }
  
  extension [Self <: OnCellQuestionUpdate](x: Self) {
    
    inline def setOnCellQuestionUpdate(value: (Any, Any, Any, Any) => Unit): Self = StObject.set(x, "onCellQuestionUpdate", js.Any.fromFunction4(value))
  }
}
