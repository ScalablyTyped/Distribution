package typings.winrt.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IProvisionFromXmlDocumentResults extends StObject {
  
  var allElementsProvisioned: Boolean
  
  var provisionResultsXml: String
}
object IProvisionFromXmlDocumentResults {
  
  @scala.inline
  def apply(allElementsProvisioned: Boolean, provisionResultsXml: String): IProvisionFromXmlDocumentResults = {
    val __obj = js.Dynamic.literal(allElementsProvisioned = allElementsProvisioned.asInstanceOf[js.Any], provisionResultsXml = provisionResultsXml.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProvisionFromXmlDocumentResults]
  }
  
  @scala.inline
  implicit class IProvisionFromXmlDocumentResultsMutableBuilder[Self <: IProvisionFromXmlDocumentResults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllElementsProvisioned(value: Boolean): Self = StObject.set(x, "allElementsProvisioned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisionResultsXml(value: String): Self = StObject.set(x, "provisionResultsXml", value.asInstanceOf[js.Any])
  }
}
