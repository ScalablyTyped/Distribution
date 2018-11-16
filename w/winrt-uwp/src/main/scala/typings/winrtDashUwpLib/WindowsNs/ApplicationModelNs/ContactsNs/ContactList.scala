package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a list of Contact objects. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactList")
@js.native
abstract class ContactList () extends js.Object {
  /** Gets the app's ContactChangeTracker for this ContactList . */
  var changeTracker: ContactChangeTracker = js.native
  /** Gets or puts the name of the ContactList , suitable for display in the user interface. */
  var displayName: java.lang.String = js.native
  /** Gets the locally unique identifier for this ContactList . */
  var id: java.lang.String = js.native
  /** Gets or puts a Boolean value indicating of the ContactList is hidden in the user interface. */
  var isHidden: scala.Boolean = js.native
  /** Occurs when a Contact in this ContactList has been changed. */
  @JSName("oncontactchanged")
  var oncontactchanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[ContactList, ContactChangedEventArgs] = js.native
  /** Gets or puts a value indicating the read access level to this ContactList for other apps on the system. */
  var otherAppReadAccess: ContactListOtherAppReadAccess = js.native
  /** Gets or puts a value indicating the write access level to this ContactList for other apps on the system. */
  var otherAppWriteAccess: ContactListOtherAppWriteAccess = js.native
  /** Gets the name of the source of the ContactList , suitable for display in the user interface. */
  var sourceDisplayName: java.lang.String = js.native
  /** Gets a Boolean value indicating if you can search the remote server with this ContactList . */
  var supportsServerSearch: scala.Boolean = js.native
  /** Gets the ContactListSyncManager used to communicate with the server. */
  var syncManager: ContactListSyncManager = js.native
  /** Gets a string that represents the ID of the user data account for this ContactList . */
  var userDataAccountId: java.lang.String = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_contactchanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.contactchanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[ContactList, ContactChangedEventArgs]
  ): scala.Unit = js.native
  /**
                   * Asynchronously deletes this ContactList , including all Contact objects in the ContactStore .
                   * @return An async action indicating that the method is complete.
                   */
  def deleteAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
                   * Asynchronously deletes and individual Contact from this ContactList and the ContactStore .
                   * @param contact The Contact to delete.
                   * @return An async action indicating that the method is complete.
                   */
  def deleteContactAsync(contact: Contact): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
                   * Asynchronously retrieves the specified Contact object from the ContactList .
                   * @param contactId The string that identifies the Contact to return.
                   * @return The Contact identified by the contactId parameter.
                   */
  def getContactAsync(contactId: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[Contact] = js.native
  /**
                   * Asynchronously gets the Contact identified by the specified RemoteId .
                   * @param remoteId An ID that can be used by a service provider to access the Contact in their remote system.
                   * @return The Contact identified by the remoteId parameter.
                   */
  def getContactFromRemoteIdAsync(remoteId: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[Contact] = js.native
  /**
                   * Gets a ContactReader object associated with this ContactList .
                   * @return A ContactReader object associated with this ContactList .
                   */
  def getContactReader(): ContactReader = js.native
  /**
                   * Gets a ContactReader object associated with this ContactList and using the specified ContactQueryOptions .
                   * @param options The ContactQueryOptions to use when creating the ContactReader .
                   * @return A ContactReader object associated with this ContactList .
                   */
  def getContactReader(options: ContactQueryOptions): ContactReader = js.native
  /**
                   * Asynchronously gets the Contact object for the current user.
                   * @return The Contact object for the current user.
                   */
  def getMeContactAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[Contact] = js.native
  /** Occurs when a Contact in this ContactList has been changed. */
  def oncontactchanged(ev: ContactChangedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[ContactList]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_contactchanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.contactchanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[ContactList, ContactChangedEventArgs]
  ): scala.Unit = js.native
  /**
                   * Asynchronously saves this ContactList .
                   * @return An async action indicating that the method has completed.
                   */
  def saveAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
                   * Asynchronously saves the specified Contact to the ContactStore .
                   * @param contact The contact to save.
                   * @return An async action indicating that the method has completed.
                   */
  def saveContactAsync(contact: Contact): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
}

