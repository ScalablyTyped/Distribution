package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The results object returned to the application when the provisioning operation has completed. */
@JSGlobal("Windows.Networking.NetworkOperators.ProvisionFromXmlDocumentResults")
@js.native
abstract class ProvisionFromXmlDocumentResults () extends js.Object {
  /** Determines whether all elements specified in the provisioning XML were applied. */
  var allElementsProvisioned: scala.Boolean = js.native
  /** Indicates which elements in the provisioning profile could not be successfully provisioned. */
  var provisionResultsXml: java.lang.String = js.native
}

