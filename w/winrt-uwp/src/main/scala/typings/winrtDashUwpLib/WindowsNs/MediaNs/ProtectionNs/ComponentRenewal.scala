package typings
package winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Enables applications to initiate renewal of components which need updating in order to play protected media content. */
@JSGlobal("Windows.Media.Protection.ComponentRenewal")
@js.native
abstract class ComponentRenewal () extends js.Object

/** Enables applications to initiate renewal of components which need updating in order to play protected media content. */
@JSGlobal("Windows.Media.Protection.ComponentRenewal")
@js.native
object ComponentRenewal extends js.Object {
  /**
    * Initiates updating of critical content protection components after prompting the user.
    * @param information Revocation and renewal information.
    * @return An object that is used to control the asynchronous operation.
    */
  def renewSystemComponentsAsync(information: winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.RevocationAndRenewalInformation): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperationWithProgress[winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.RenewalStatus, scala.Double] = js.native
}

