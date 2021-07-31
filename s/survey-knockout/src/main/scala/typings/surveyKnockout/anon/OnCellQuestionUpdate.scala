package typings.surveyKnockout.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnCellQuestionUpdate extends StObject {
  
  def onCellQuestionUpdate(cellQuestion: js.Any, column: js.Any, question: js.Any, data: js.Any): Unit
  
  var properties: js.Array[String]
}
object OnCellQuestionUpdate {
  
  @scala.inline
  def apply(onCellQuestionUpdate: (js.Any, js.Any, js.Any, js.Any) => Unit, properties: js.Array[String]): OnCellQuestionUpdate = {
    val __obj = js.Dynamic.literal(onCellQuestionUpdate = js.Any.fromFunction4(onCellQuestionUpdate), properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnCellQuestionUpdate]
  }
  
  @scala.inline
  implicit class OnCellQuestionUpdateMutableBuilder[Self <: OnCellQuestionUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnCellQuestionUpdate(value: (js.Any, js.Any, js.Any, js.Any) => Unit): Self = StObject.set(x, "onCellQuestionUpdate", js.Any.fromFunction4(value))
    
    @scala.inline
    def setProperties(value: js.Array[String]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesVarargs(value: String*): Self = StObject.set(x, "properties", js.Array(value :_*))
  }
}
