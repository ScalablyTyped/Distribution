package typings.winrtUwp.Windows.Networking.NetworkOperators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The results object returned to the application when the provisioning operation has completed. */
trait ProvisionFromXmlDocumentResults extends js.Object {
  /** Determines whether all elements specified in the provisioning XML were applied. */
  var allElementsProvisioned: Boolean
  /** Indicates which elements in the provisioning profile could not be successfully provisioned. */
  var provisionResultsXml: String
}

object ProvisionFromXmlDocumentResults {
  @scala.inline
  def apply(allElementsProvisioned: Boolean, provisionResultsXml: String): ProvisionFromXmlDocumentResults = {
    val __obj = js.Dynamic.literal(allElementsProvisioned = allElementsProvisioned.asInstanceOf[js.Any], provisionResultsXml = provisionResultsXml.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvisionFromXmlDocumentResults]
  }
}

