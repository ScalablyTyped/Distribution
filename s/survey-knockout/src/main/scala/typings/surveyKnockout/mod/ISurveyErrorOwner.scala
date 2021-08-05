package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISurveyErrorOwner
  extends StObject
     with ILocalizableOwner {
  
  def getErrorCustomText(text: String, error: SurveyError): String
}
object ISurveyErrorOwner {
  
  inline def apply(
    getErrorCustomText: (String, SurveyError) => String,
    getLocale: () => String,
    getMarkdownHtml: String => String,
    getProcessedText: String => String
  ): ISurveyErrorOwner = {
    val __obj = js.Dynamic.literal(getErrorCustomText = js.Any.fromFunction2(getErrorCustomText), getLocale = js.Any.fromFunction0(getLocale), getMarkdownHtml = js.Any.fromFunction1(getMarkdownHtml), getProcessedText = js.Any.fromFunction1(getProcessedText))
    __obj.asInstanceOf[ISurveyErrorOwner]
  }
  
  extension [Self <: ISurveyErrorOwner](x: Self) {
    
    inline def setGetErrorCustomText(value: (String, SurveyError) => String): Self = StObject.set(x, "getErrorCustomText", js.Any.fromFunction2(value))
  }
}
