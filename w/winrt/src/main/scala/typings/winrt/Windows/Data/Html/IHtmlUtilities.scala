package typings.winrt.Windows.Data.Html

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IHtmlUtilities extends js.Object {
  
  def convertToText(html: String): String = js.native
}
object IHtmlUtilities {
  
  @scala.inline
  def apply(convertToText: String => String): IHtmlUtilities = {
    val __obj = js.Dynamic.literal(convertToText = js.Any.fromFunction1(convertToText))
    __obj.asInstanceOf[IHtmlUtilities]
  }
  
  @scala.inline
  implicit class IHtmlUtilitiesOps[Self <: IHtmlUtilities] (val x: Self) extends AnyVal {
    
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
    def setConvertToText(value: String => String): Self = this.set("convertToText", js.Any.fromFunction1(value))
  }
}
