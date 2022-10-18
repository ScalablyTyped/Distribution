package typings.winrtUwp.global.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The results object returned to the application when the provisioning operation has completed. */
/* note: abstract class */ @JSGlobal("Windows.Networking.NetworkOperators.ProvisionFromXmlDocumentResults")
@js.native
open class ProvisionFromXmlDocumentResults ()
  extends StObject
     with typings.winrtUwp.Windows.Networking.NetworkOperators.ProvisionFromXmlDocumentResults {
  
  /** Determines whether all elements specified in the provisioning XML were applied. */
  /* CompleteClass */
  var allElementsProvisioned: Boolean = js.native
  
  /** Indicates which elements in the provisioning profile could not be successfully provisioned. */
  /* CompleteClass */
  var provisionResultsXml: String = js.native
}
