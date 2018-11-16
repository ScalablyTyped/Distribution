package typings
package winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about components that need to be revoked and renewed. */
@JSGlobal("Windows.Media.Protection.RevocationAndRenewalInformation")
@js.native
abstract class RevocationAndRenewalInformation () extends js.Object {
  /** Returns a list of components that need to be revoked and renewed with updated components. */
  var items: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[RevocationAndRenewalItem] = js.native
}

