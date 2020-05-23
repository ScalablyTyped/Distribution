package typings.winrtUwp.global.Windows.Networking.NetworkOperators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The results object returned to the application when the provisioning operation has completed. */
@JSGlobal("Windows.Networking.NetworkOperators.ProvisionFromXmlDocumentResults")
@js.native
abstract class ProvisionFromXmlDocumentResults ()
  extends typings.winrtUwp.Windows.Networking.NetworkOperators.ProvisionFromXmlDocumentResults {
  /** Determines whether all elements specified in the provisioning XML were applied. */
  /* CompleteClass */
  override var allElementsProvisioned: Boolean = js.native
  /** Indicates which elements in the provisioning profile could not be successfully provisioned. */
  /* CompleteClass */
  override var provisionResultsXml: String = js.native
}

