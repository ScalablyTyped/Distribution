package typings.winrt.WindowsNs.MediaNs.ProtectionNs

import typings.winrt.WindowsNs.FoundationNs.IAsyncOperationWithProgress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Media.Protection.ComponentRenewal")
@js.native
class ComponentRenewal () extends js.Object

/* static members */
@JSGlobal("Windows.Media.Protection.ComponentRenewal")
@js.native
object ComponentRenewal extends js.Object {
  def renewSystemComponentsAsync(information: RevocationAndRenewalInformation): IAsyncOperationWithProgress[RenewalStatus, Double] = js.native
}

