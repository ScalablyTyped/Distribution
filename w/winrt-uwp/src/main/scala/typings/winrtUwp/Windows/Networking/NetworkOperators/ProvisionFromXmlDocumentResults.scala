package typings.winrtUwp.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The results object returned to the application when the provisioning operation has completed. */
@js.native
trait ProvisionFromXmlDocumentResults extends StObject {
  
  /** Determines whether all elements specified in the provisioning XML were applied. */
  var allElementsProvisioned: Boolean = js.native
  
  /** Indicates which elements in the provisioning profile could not be successfully provisioned. */
  var provisionResultsXml: String = js.native
}
object ProvisionFromXmlDocumentResults {
  
  @scala.inline
  def apply(allElementsProvisioned: Boolean, provisionResultsXml: String): ProvisionFromXmlDocumentResults = {
    val __obj = js.Dynamic.literal(allElementsProvisioned = allElementsProvisioned.asInstanceOf[js.Any], provisionResultsXml = provisionResultsXml.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvisionFromXmlDocumentResults]
  }
  
  @scala.inline
  implicit class ProvisionFromXmlDocumentResultsMutableBuilder[Self <: ProvisionFromXmlDocumentResults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllElementsProvisioned(value: Boolean): Self = StObject.set(x, "allElementsProvisioned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisionResultsXml(value: String): Self = StObject.set(x, "provisionResultsXml", value.asInstanceOf[js.Any])
  }
}
