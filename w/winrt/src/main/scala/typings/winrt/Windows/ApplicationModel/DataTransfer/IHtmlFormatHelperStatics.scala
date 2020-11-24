package typings.winrt.Windows.ApplicationModel.DataTransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IHtmlFormatHelperStatics extends js.Object {
  
  def createHtmlFormat(htmlFragment: String): String = js.native
  
  def getStaticFragment(htmlFormat: String): String = js.native
}
object IHtmlFormatHelperStatics {
  
  @scala.inline
  def apply(createHtmlFormat: String => String, getStaticFragment: String => String): IHtmlFormatHelperStatics = {
    val __obj = js.Dynamic.literal(createHtmlFormat = js.Any.fromFunction1(createHtmlFormat), getStaticFragment = js.Any.fromFunction1(getStaticFragment))
    __obj.asInstanceOf[IHtmlFormatHelperStatics]
  }
  
  @scala.inline
  implicit class IHtmlFormatHelperStaticsOps[Self <: IHtmlFormatHelperStatics] (val x: Self) extends AnyVal {
    
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
    def setCreateHtmlFormat(value: String => String): Self = this.set("createHtmlFormat", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetStaticFragment(value: String => String): Self = this.set("getStaticFragment", js.Any.fromFunction1(value))
  }
}
