package typings
package winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Performs license management operations. */
@JSGlobal("Windows.Media.Protection.PlayReady.PlayReadyLicenseManagement")
@js.native
abstract class PlayReadyLicenseManagement () extends js.Object

/** Performs license management operations. */
@JSGlobal("Windows.Media.Protection.PlayReady.PlayReadyLicenseManagement")
@js.native
object PlayReadyLicenseManagement extends js.Object {
  /**
                       * Deletes licenses that match the specified content header.
                       * @param contentHeader Content header with a key identifier with which to match licenses.
                       * @return The asynchronous operation performing the deletion.
                       */
  def deleteLicenses(contentHeader: winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.PlayReadyContentHeader): winrtDashUwpLib.WindowsNs.FoundationNs.IAsyncAction = js.native
}

