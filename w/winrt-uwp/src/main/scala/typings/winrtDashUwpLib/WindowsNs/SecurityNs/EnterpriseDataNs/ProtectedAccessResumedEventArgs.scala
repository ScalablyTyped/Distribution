package typings
package winrtDashUwpLib.WindowsNs.SecurityNs.EnterpriseDataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data when content protection is resumed. */
@JSGlobal("Windows.Security.EnterpriseData.ProtectedAccessResumedEventArgs")
@js.native
abstract class ProtectedAccessResumedEventArgs () extends js.Object {
  /** Contains the enterprise identities for which content protection is being resumed. */
  var identities: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String] = js.native
}

