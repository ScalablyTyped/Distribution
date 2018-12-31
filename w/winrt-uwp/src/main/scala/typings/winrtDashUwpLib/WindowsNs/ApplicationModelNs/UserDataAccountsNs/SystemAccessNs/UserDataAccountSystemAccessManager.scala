package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.UserDataAccountsNs.SystemAccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the ability to display the system UI for managing sync relationships. */
@JSGlobal("Windows.ApplicationModel.UserDataAccounts.SystemAccess.UserDataAccountSystemAccessManager")
@js.native
abstract class UserDataAccountSystemAccessManager () extends js.Object

/** Provides the ability to display the system UI for managing sync relationships. */
@JSGlobal("Windows.ApplicationModel.UserDataAccounts.SystemAccess.UserDataAccountSystemAccessManager")
@js.native
object UserDataAccountSystemAccessManager extends js.Object {
  /**
    * Asynchronously displays the system UI to manage the sync relationships for the specified accounts.
    * @param accounts The list of accounts to manage in the system UI.
    * @return Returns an updated list of accounts.
    */
  def addAndShowDeviceAccountsAsync(
    accounts: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[
      winrtDashUwpLib.WindowsNs.ApplicationModelNs.UserDataAccountsNs.SystemAccessNs.DeviceAccountConfiguration
    ]
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[_]] = js.native
}

