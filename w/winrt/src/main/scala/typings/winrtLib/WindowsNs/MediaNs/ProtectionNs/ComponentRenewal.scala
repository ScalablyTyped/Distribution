package typings
package winrtLib.WindowsNs.MediaNs.ProtectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Media.Protection.ComponentRenewal")
@js.native
class ComponentRenewal () extends js.Object

@JSGlobal("Windows.Media.Protection.ComponentRenewal")
@js.native
object ComponentRenewal extends js.Object {
  def renewSystemComponentsAsync(information: winrtLib.WindowsNs.MediaNs.ProtectionNs.RevocationAndRenewalInformation): winrtLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[winrtLib.WindowsNs.MediaNs.ProtectionNs.RenewalStatus, scala.Double] = js.native
}

