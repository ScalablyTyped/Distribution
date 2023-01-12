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
    getMarkdownHtml: (String, String) => String,
    getProcessedText: String => String,
    getRenderer: String => String,
    getRendererContext: LocalizableString => Any
  ): ISurveyErrorOwner = {
    val __obj = js.Dynamic.literal(getErrorCustomText = js.Any.fromFunction2(getErrorCustomText), getLocale = js.Any.fromFunction0(getLocale), getMarkdownHtml = js.Any.fromFunction2(getMarkdownHtml), getProcessedText = js.Any.fromFunction1(getProcessedText), getRenderer = js.Any.fromFunction1(getRenderer), getRendererContext = js.Any.fromFunction1(getRendererContext))
    __obj.asInstanceOf[ISurveyErrorOwner]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISurveyErrorOwner] (val x: Self) extends AnyVal {
    
    inline def setGetErrorCustomText(value: (String, SurveyError) => String): Self = StObject.set(x, "getErrorCustomText", js.Any.fromFunction2(value))
  }
}
