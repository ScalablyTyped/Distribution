package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILocalizableOwner extends StObject {
  
  def getLocale(): String
  
  def getMarkdownHtml(text: String): String
  
  def getProcessedText(text: String): String
}
object ILocalizableOwner {
  
  @scala.inline
  def apply(getLocale: () => String, getMarkdownHtml: String => String, getProcessedText: String => String): ILocalizableOwner = {
    val __obj = js.Dynamic.literal(getLocale = js.Any.fromFunction0(getLocale), getMarkdownHtml = js.Any.fromFunction1(getMarkdownHtml), getProcessedText = js.Any.fromFunction1(getProcessedText))
    __obj.asInstanceOf[ILocalizableOwner]
  }
  
  @scala.inline
  implicit class ILocalizableOwnerMutableBuilder[Self <: ILocalizableOwner] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetLocale(value: () => String): Self = StObject.set(x, "getLocale", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMarkdownHtml(value: String => String): Self = StObject.set(x, "getMarkdownHtml", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetProcessedText(value: String => String): Self = StObject.set(x, "getProcessedText", js.Any.fromFunction1(value))
  }
}
