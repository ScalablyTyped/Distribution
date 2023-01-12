package typings.surveyKnockout.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Checkbox extends StObject {
  
  var checkbox: Any
  
  var comment: Any
  
  var imagepicker: Any
  
  var question: Any
  
  var text: Any
}
object Checkbox {
  
  inline def apply(checkbox: Any, comment: Any, imagepicker: Any, question: Any, text: Any): Checkbox = {
    val __obj = js.Dynamic.literal(checkbox = checkbox.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], imagepicker = imagepicker.asInstanceOf[js.Any], question = question.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Checkbox]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Checkbox] (val x: Self) extends AnyVal {
    
    inline def setCheckbox(value: Any): Self = StObject.set(x, "checkbox", value.asInstanceOf[js.Any])
    
    inline def setComment(value: Any): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setImagepicker(value: Any): Self = StObject.set(x, "imagepicker", value.asInstanceOf[js.Any])
    
    inline def setQuestion(value: Any): Self = StObject.set(x, "question", value.asInstanceOf[js.Any])
    
    inline def setText(value: Any): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
