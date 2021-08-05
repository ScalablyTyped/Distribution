package typings.surveyKnockout.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnCellQuestionUpdate extends StObject {
  
  def onCellQuestionUpdate(cellQuestion: js.Any, column: js.Any, question: js.Any, data: js.Any): Unit
  
  var properties: js.Array[String]
}
object OnCellQuestionUpdate {
  
  inline def apply(onCellQuestionUpdate: (js.Any, js.Any, js.Any, js.Any) => Unit, properties: js.Array[String]): OnCellQuestionUpdate = {
    val __obj = js.Dynamic.literal(onCellQuestionUpdate = js.Any.fromFunction4(onCellQuestionUpdate), properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnCellQuestionUpdate]
  }
  
  extension [Self <: OnCellQuestionUpdate](x: Self) {
    
    inline def setOnCellQuestionUpdate(value: (js.Any, js.Any, js.Any, js.Any) => Unit): Self = StObject.set(x, "onCellQuestionUpdate", js.Any.fromFunction4(value))
    
    inline def setProperties(value: js.Array[String]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesVarargs(value: String*): Self = StObject.set(x, "properties", js.Array(value :_*))
  }
}
