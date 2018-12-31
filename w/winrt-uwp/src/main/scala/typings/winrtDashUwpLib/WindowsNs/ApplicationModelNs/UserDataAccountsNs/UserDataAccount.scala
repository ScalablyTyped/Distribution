package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.UserDataAccountsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a user data account used to access email, contacts, calendars, and so on. */
@JSGlobal("Windows.ApplicationModel.UserDataAccounts.UserDataAccount")
@js.native
abstract class UserDataAccount () extends js.Object {
  /** Gets the unique identifier for the type of the account. */
  var deviceAccountTypeId: java.lang.String = js.native
  /** Gets the enterprise identity associated with the user account. */
  var enterpriseId: java.lang.String = js.native
  /** Gets the icon associated with the UserDataAccount . */
  var icon: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStreamReference = js.native
  /** Gets a string that uniquely identifies the UserDataAccount on the local device. */
  var id: java.lang.String = js.native
  /** Gets a Boolean value indicating if the user account data is encrypted when the device becomes locked. */
  var isProtectedUnderLock: scala.Boolean = js.native
  /** Gets or sets a value indicating whether other apps on the device have read access to the UserDataAccount . */
  var otherAppReadAccess: UserDataAccountOtherAppReadAccess = js.native
  /** Gets the unique identifier for the app package that created the UserDataAccount . */
  var packageFamilyName: java.lang.String = js.native
  /** Gets or sets a user name associated with the UserDataAccount that is suitable for displaying. */
  var userDisplayName: java.lang.String = js.native
  /**
    * Asynchronously deletes all the contact, calendar and email data associated with the account.
    * @return An async action indicating success or failure.
    */
  def deleteAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
    * Returns a collection of AppointmentCalendar instances associated with the UserDataAccount .
    * @return A collection of AppointmentCalendar instances associated with the UserDataAccount .
    */
  def findAppointmentCalendarsAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[_]] = js.native
  /**
    * Returns a collection of ContactAnnotationList instances associated with the UserDataAccount .
    * @return A collection of ContactAnnotationList instances associated with the UserDataAccount .
    */
  def findContactAnnotationListsAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[_]] = js.native
  /**
    * Returns a collection of ContactList instances associated with the UserDataAccount .
    * @return A collection of ContactList instances associated with the UserDataAccount .
    */
  def findContactListsAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[_]] = js.native
  /**
    * Returns a collection of EmailMailbox instances associated with the UserDataAccount .
    * @return A collection of EmailMailbox instances associated with the UserDataAccount .
    */
  def findEmailMailboxesAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[_]] = js.native
  /**
    * Asynchronously persists the UserDataAccount to the database.
    * @return Async action that indicates completion of the save operation.
    */
  def saveAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
}

