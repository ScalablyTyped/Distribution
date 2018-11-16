package typings
package winrtDashUwpLib.WindowsNs.SecurityNs.EnterpriseDataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data when content protection has been revoked. */
@JSGlobal("Windows.Security.EnterpriseData.ProtectedContentRevokedEventArgs")
@js.native
abstract class ProtectedContentRevokedEventArgs () extends js.Object {
  /** Contains the enterprise identities for which content protection has been revoked. */
  var identities: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String] = js.native
}

