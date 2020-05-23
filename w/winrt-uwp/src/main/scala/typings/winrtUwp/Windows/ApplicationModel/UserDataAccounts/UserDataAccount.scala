package typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a user data account used to access email, contacts, calendars, and so on. */
trait UserDataAccount extends js.Object {
  /** Gets the unique identifier for the type of the account. */
  var deviceAccountTypeId: String
  /** Gets the enterprise identity associated with the user account. */
  var enterpriseId: String
  /** Gets the icon associated with the UserDataAccount . */
  var icon: IRandomAccessStreamReference
  /** Gets a string that uniquely identifies the UserDataAccount on the local device. */
  var id: String
  /** Gets a Boolean value indicating if the user account data is encrypted when the device becomes locked. */
  var isProtectedUnderLock: Boolean
  /** Gets or sets a value indicating whether other apps on the device have read access to the UserDataAccount . */
  var otherAppReadAccess: UserDataAccountOtherAppReadAccess
  /** Gets the unique identifier for the app package that created the UserDataAccount . */
  var packageFamilyName: String
  /** Gets or sets a user name associated with the UserDataAccount that is suitable for displaying. */
  var userDisplayName: String
  /**
    * Asynchronously deletes all the contact, calendar and email data associated with the account.
    * @return An async action indicating success or failure.
    */
  def deleteAsync(): IPromiseWithIAsyncAction
  /**
    * Returns a collection of AppointmentCalendar instances associated with the UserDataAccount .
    * @return A collection of AppointmentCalendar instances associated with the UserDataAccount .
    */
  def findAppointmentCalendarsAsync(): IPromiseWithIAsyncOperation[IVectorView[_]]
  /**
    * Returns a collection of ContactAnnotationList instances associated with the UserDataAccount .
    * @return A collection of ContactAnnotationList instances associated with the UserDataAccount .
    */
  def findContactAnnotationListsAsync(): IPromiseWithIAsyncOperation[IVectorView[_]]
  /**
    * Returns a collection of ContactList instances associated with the UserDataAccount .
    * @return A collection of ContactList instances associated with the UserDataAccount .
    */
  def findContactListsAsync(): IPromiseWithIAsyncOperation[IVectorView[_]]
  /**
    * Returns a collection of EmailMailbox instances associated with the UserDataAccount .
    * @return A collection of EmailMailbox instances associated with the UserDataAccount .
    */
  def findEmailMailboxesAsync(): IPromiseWithIAsyncOperation[IVectorView[_]]
  /**
    * Asynchronously persists the UserDataAccount to the database.
    * @return Async action that indicates completion of the save operation.
    */
  def saveAsync(): IPromiseWithIAsyncAction
}

object UserDataAccount {
  @scala.inline
  def apply(
    deleteAsync: () => IPromiseWithIAsyncAction,
    deviceAccountTypeId: String,
    enterpriseId: String,
    findAppointmentCalendarsAsync: () => IPromiseWithIAsyncOperation[IVectorView[_]],
    findContactAnnotationListsAsync: () => IPromiseWithIAsyncOperation[IVectorView[_]],
    findContactListsAsync: () => IPromiseWithIAsyncOperation[IVectorView[_]],
    findEmailMailboxesAsync: () => IPromiseWithIAsyncOperation[IVectorView[_]],
    icon: IRandomAccessStreamReference,
    id: String,
    isProtectedUnderLock: Boolean,
    otherAppReadAccess: UserDataAccountOtherAppReadAccess,
    packageFamilyName: String,
    saveAsync: () => IPromiseWithIAsyncAction,
    userDisplayName: String
  ): UserDataAccount = {
    val __obj = js.Dynamic.literal(deleteAsync = js.Any.fromFunction0(deleteAsync), deviceAccountTypeId = deviceAccountTypeId.asInstanceOf[js.Any], enterpriseId = enterpriseId.asInstanceOf[js.Any], findAppointmentCalendarsAsync = js.Any.fromFunction0(findAppointmentCalendarsAsync), findContactAnnotationListsAsync = js.Any.fromFunction0(findContactAnnotationListsAsync), findContactListsAsync = js.Any.fromFunction0(findContactListsAsync), findEmailMailboxesAsync = js.Any.fromFunction0(findEmailMailboxesAsync), icon = icon.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isProtectedUnderLock = isProtectedUnderLock.asInstanceOf[js.Any], otherAppReadAccess = otherAppReadAccess.asInstanceOf[js.Any], packageFamilyName = packageFamilyName.asInstanceOf[js.Any], saveAsync = js.Any.fromFunction0(saveAsync), userDisplayName = userDisplayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserDataAccount]
  }
}

