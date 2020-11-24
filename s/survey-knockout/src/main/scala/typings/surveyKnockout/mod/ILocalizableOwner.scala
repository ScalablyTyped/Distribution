package typings.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILocalizableOwner extends js.Object {
  
  def getLocale(): String = js.native
  
  def getMarkdownHtml(text: String): String = js.native
  
  def getProcessedText(text: String): String = js.native
}
object ILocalizableOwner {
  
  @scala.inline
  def apply(getLocale: () => String, getMarkdownHtml: String => String, getProcessedText: String => String): ILocalizableOwner = {
    val __obj = js.Dynamic.literal(getLocale = js.Any.fromFunction0(getLocale), getMarkdownHtml = js.Any.fromFunction1(getMarkdownHtml), getProcessedText = js.Any.fromFunction1(getProcessedText))
    __obj.asInstanceOf[ILocalizableOwner]
  }
  
  @scala.inline
  implicit class ILocalizableOwnerOps[Self <: ILocalizableOwner] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetLocale(value: () => String): Self = this.set("getLocale", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMarkdownHtml(value: String => String): Self = this.set("getMarkdownHtml", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetProcessedText(value: String => String): Self = this.set("getProcessedText", js.Any.fromFunction1(value))
  }
}
