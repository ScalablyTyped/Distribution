package typings.winrtUwp.Windows.Networking.NetworkOperators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The results object returned to the application when the provisioning operation has completed. */
@js.native
trait ProvisionFromXmlDocumentResults extends js.Object {
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
  implicit class ProvisionFromXmlDocumentResultsOps[Self <: ProvisionFromXmlDocumentResults] (val x: Self) extends AnyVal {
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

