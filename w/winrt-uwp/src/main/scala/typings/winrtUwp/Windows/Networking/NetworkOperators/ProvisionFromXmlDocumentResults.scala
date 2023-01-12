package typings.winrtUwp.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The results object returned to the application when the provisioning operation has completed. */
trait ProvisionFromXmlDocumentResults extends StObject {
  
  /** Determines whether all elements specified in the provisioning XML were applied. */
  var allElementsProvisioned: Boolean
  
  /** Indicates which elements in the provisioning profile could not be successfully provisioned. */
  var provisionResultsXml: String
}
object ProvisionFromXmlDocumentResults {
  
  inline def apply(allElementsProvisioned: Boolean, provisionResultsXml: String): ProvisionFromXmlDocumentResults = {
    val __obj = js.Dynamic.literal(allElementsProvisioned = allElementsProvisioned.asInstanceOf[js.Any], provisionResultsXml = provisionResultsXml.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvisionFromXmlDocumentResults]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProvisionFromXmlDocumentResults] (val x: Self) extends AnyVal {
    
    inline def setAllElementsProvisioned(value: Boolean): Self = StObject.set(x, "allElementsProvisioned", value.asInstanceOf[js.Any])
    
    inline def setProvisionResultsXml(value: String): Self = StObject.set(x, "provisionResultsXml", value.asInstanceOf[js.Any])
  }
}
