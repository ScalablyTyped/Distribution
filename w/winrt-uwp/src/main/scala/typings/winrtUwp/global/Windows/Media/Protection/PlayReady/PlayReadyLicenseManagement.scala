package typings.winrtUwp.global.Windows.Media.Protection.PlayReady

import typings.winrtUwp.Windows.Foundation.IAsyncAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Performs license management operations. */
@JSGlobal("Windows.Media.Protection.PlayReady.PlayReadyLicenseManagement")
@js.native
abstract class PlayReadyLicenseManagement ()
  extends typings.winrtUwp.Windows.Media.Protection.PlayReady.PlayReadyLicenseManagement

/* static members */
@JSGlobal("Windows.Media.Protection.PlayReady.PlayReadyLicenseManagement")
@js.native
object PlayReadyLicenseManagement extends js.Object {
  /**
    * Deletes licenses that match the specified content header.
    * @param contentHeader Content header with a key identifier with which to match licenses.
    * @return The asynchronous operation performing the deletion.
    */
  def deleteLicenses(contentHeader: typings.winrtUwp.Windows.Media.Protection.PlayReady.PlayReadyContentHeader): IAsyncAction = js.native
}

