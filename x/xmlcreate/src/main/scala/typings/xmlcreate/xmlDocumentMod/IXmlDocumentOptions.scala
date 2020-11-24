package typings.xmlcreate.xmlDocumentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IXmlDocumentOptions extends js.Object {
  
  /**
    * Whether to throw an exception if basic XML validation fails while
    * building the document.
    */
  var validation: js.UndefOr[Boolean] = js.native
}
object IXmlDocumentOptions {
  
  @scala.inline
  def apply(): IXmlDocumentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IXmlDocumentOptions]
  }
  
  @scala.inline
  implicit class IXmlDocumentOptionsOps[Self <: IXmlDocumentOptions] (val x: Self) extends AnyVal {
    
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
    def setValidation(value: Boolean): Self = this.set("validation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidation: Self = this.set("validation", js.undefined)
  }
}
