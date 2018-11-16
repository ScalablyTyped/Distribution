package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.UserDataAccountsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a data store that contains user accounts. */
@JSGlobal("Windows.ApplicationModel.UserDataAccounts.UserDataAccountStore")
@js.native
abstract class UserDataAccountStore () extends js.Object {
  /**
                   * Asynchronously creates a user data account.
                   * @param userDisplayName A string containing the user name that is suitable for display.
                   * @return Returns the newly created UserDataAccount .
                   */
  def createAccountAsync(userDisplayName: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[UserDataAccount] = js.native
  /**
                   * Returns a collection of UserDataAccount objects from the store based on the UserDataAccountStoreAccessType value passed into RequestStoreAsync .
                   * @return Returns the collection of user data accounts, scoped by access request.
                   */
  def findAccountsAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[_]] = js.native
  /**
                   * Asynchronously gets the specified account.
                   * @param id The Id string identifying the account.
                   * @return Returns the UserDataAccount identified by the id parameter.
                   */
  def getAccountAsync(id: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[UserDataAccount] = js.native
}

