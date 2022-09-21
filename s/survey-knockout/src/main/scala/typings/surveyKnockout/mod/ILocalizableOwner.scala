package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILocalizableOwner extends StObject {
  
  def getLocale(): String
  
  def getMarkdownHtml(text: String, name: String): String
  
  def getProcessedText(text: String): String
  
  def getRenderer(name: String): String
  
  def getRendererContext(locStr: LocalizableString): Any
}
object ILocalizableOwner {
  
  inline def apply(
    getLocale: () => String,
    getMarkdownHtml: (String, String) => String,
    getProcessedText: String => String,
    getRenderer: String => String,
    getRendererContext: LocalizableString => Any
  ): ILocalizableOwner = {
    val __obj = js.Dynamic.literal(getLocale = js.Any.fromFunction0(getLocale), getMarkdownHtml = js.Any.fromFunction2(getMarkdownHtml), getProcessedText = js.Any.fromFunction1(getProcessedText), getRenderer = js.Any.fromFunction1(getRenderer), getRendererContext = js.Any.fromFunction1(getRendererContext))
    __obj.asInstanceOf[ILocalizableOwner]
  }
  
  extension [Self <: ILocalizableOwner](x: Self) {
    
    inline def setGetLocale(value: () => String): Self = StObject.set(x, "getLocale", js.Any.fromFunction0(value))
    
    inline def setGetMarkdownHtml(value: (String, String) => String): Self = StObject.set(x, "getMarkdownHtml", js.Any.fromFunction2(value))
    
    inline def setGetProcessedText(value: String => String): Self = StObject.set(x, "getProcessedText", js.Any.fromFunction1(value))
    
    inline def setGetRenderer(value: String => String): Self = StObject.set(x, "getRenderer", js.Any.fromFunction1(value))
    
    inline def setGetRendererContext(value: LocalizableString => Any): Self = StObject.set(x, "getRendererContext", js.Any.fromFunction1(value))
  }
}
