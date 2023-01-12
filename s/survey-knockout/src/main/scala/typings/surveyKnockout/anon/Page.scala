package typings.surveyKnockout.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Page extends StObject {
  
  var page: String
  
  var panel: String
  
  var question: String
  
  var survey: String
}
object Page {
  
  inline def apply(page: String, panel: String, question: String, survey: String): Page = {
    val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any], panel = panel.asInstanceOf[js.Any], question = question.asInstanceOf[js.Any], survey = survey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Page]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Page] (val x: Self) extends AnyVal {
    
    inline def setPage(value: String): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPanel(value: String): Self = StObject.set(x, "panel", value.asInstanceOf[js.Any])
    
    inline def setQuestion(value: String): Self = StObject.set(x, "question", value.asInstanceOf[js.Any])
    
    inline def setSurvey(value: String): Self = StObject.set(x, "survey", value.asInstanceOf[js.Any])
  }
}
