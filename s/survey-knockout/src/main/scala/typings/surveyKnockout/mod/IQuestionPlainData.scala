package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IQuestionPlainData extends StObject {
  
  var data: js.UndefOr[Any] = js.undefined
  
  var displayValue: Any
  
  def getString(`val`: Any): String
  
  var isComment: js.UndefOr[Boolean] = js.undefined
  
  var isNode: Boolean
  
  var name: String | Double
  
  var questionType: js.UndefOr[String] = js.undefined
  
  var title: String
  
  var value: Any
}
object IQuestionPlainData {
  
  inline def apply(
    displayValue: Any,
    getString: Any => String,
    isNode: Boolean,
    name: String | Double,
    title: String,
    value: Any
  ): IQuestionPlainData = {
    val __obj = js.Dynamic.literal(displayValue = displayValue.asInstanceOf[js.Any], getString = js.Any.fromFunction1(getString), isNode = isNode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IQuestionPlainData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IQuestionPlainData] (val x: Self) extends AnyVal {
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDisplayValue(value: Any): Self = StObject.set(x, "displayValue", value.asInstanceOf[js.Any])
    
    inline def setGetString(value: Any => String): Self = StObject.set(x, "getString", js.Any.fromFunction1(value))
    
    inline def setIsComment(value: Boolean): Self = StObject.set(x, "isComment", value.asInstanceOf[js.Any])
    
    inline def setIsCommentUndefined: Self = StObject.set(x, "isComment", js.undefined)
    
    inline def setIsNode(value: Boolean): Self = StObject.set(x, "isNode", value.asInstanceOf[js.Any])
    
    inline def setName(value: String | Double): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setQuestionType(value: String): Self = StObject.set(x, "questionType", value.asInstanceOf[js.Any])
    
    inline def setQuestionTypeUndefined: Self = StObject.set(x, "questionType", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
