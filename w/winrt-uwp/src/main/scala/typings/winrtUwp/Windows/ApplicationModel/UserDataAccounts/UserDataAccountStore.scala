package typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a data store that contains user accounts. */
trait UserDataAccountStore extends js.Object {
  /**
    * Asynchronously creates a user data account.
    * @param userDisplayName A string containing the user name that is suitable for display.
    * @return Returns the newly created UserDataAccount .
    */
  def createAccountAsync(userDisplayName: String): IPromiseWithIAsyncOperation[UserDataAccount]
  /**
    * Returns a collection of UserDataAccount objects from the store based on the UserDataAccountStoreAccessType value passed into RequestStoreAsync .
    * @return Returns the collection of user data accounts, scoped by access request.
    */
  def findAccountsAsync(): IPromiseWithIAsyncOperation[IVectorView[_]]
  /**
    * Asynchronously gets the specified account.
    * @param id The Id string identifying the account.
    * @return Returns the UserDataAccount identified by the id parameter.
    */
  def getAccountAsync(id: String): IPromiseWithIAsyncOperation[UserDataAccount]
}

object UserDataAccountStore {
  @scala.inline
  def apply(
    createAccountAsync: String => IPromiseWithIAsyncOperation[UserDataAccount],
    findAccountsAsync: () => IPromiseWithIAsyncOperation[IVectorView[_]],
    getAccountAsync: String => IPromiseWithIAsyncOperation[UserDataAccount]
  ): UserDataAccountStore = {
    val __obj = js.Dynamic.literal(createAccountAsync = js.Any.fromFunction1(createAccountAsync), findAccountsAsync = js.Any.fromFunction0(findAccountsAsync), getAccountAsync = js.Any.fromFunction1(getAccountAsync))
    __obj.asInstanceOf[UserDataAccountStore]
  }
}

