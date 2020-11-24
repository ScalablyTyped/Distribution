package typings.winrt.Windows.Networking.NetworkOperators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IProvisionFromXmlDocumentResults extends js.Object {
  
  var allElementsProvisioned: Boolean = js.native
  
  var provisionResultsXml: String = js.native
}
object IProvisionFromXmlDocumentResults {
  
  @scala.inline
  def apply(allElementsProvisioned: Boolean, provisionResultsXml: String): IProvisionFromXmlDocumentResults = {
    val __obj = js.Dynamic.literal(allElementsProvisioned = allElementsProvisioned.asInstanceOf[js.Any], provisionResultsXml = provisionResultsXml.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProvisionFromXmlDocumentResults]
  }
  
  @scala.inline
  implicit class IProvisionFromXmlDocumentResultsOps[Self <: IProvisionFromXmlDocumentResults] (val x: Self) extends AnyVal {
    
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
    def setAllElementsProvisioned(value: Boolean): Self = this.set("allElementsProvisioned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisionResultsXml(value: String): Self = this.set("provisionResultsXml", value.asInstanceOf[js.Any])
  }
}
