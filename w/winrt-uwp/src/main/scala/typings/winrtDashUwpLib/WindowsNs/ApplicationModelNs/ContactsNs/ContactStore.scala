package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a database that contains contacts. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactStore")
@js.native
abstract class ContactStore () extends js.Object {
  /** Gets a contact manager that provides functionality for linking individual (raw) contacts across services together into a single aggregate contact. */
  var aggregateContactManager: AggregateContactManager = js.native
  /** Gets the ContactChangeTracker which provides functionality for monitoring changes to Contact objects in the ContactStore . */
  var changeTracker: ContactChangeTracker = js.native
  /** Occurs when a Contact in the ContactStore has been changed. */
  @JSName("oncontactchanged")
  var oncontactchanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[ContactStore, ContactChangedEventArgs] = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_contactchanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.contactchanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[ContactStore, ContactChangedEventArgs]
  ): scala.Unit = js.native
  /**
                   * Asynchronously creates a ContactList with the specified display name.
                   * @param displayName A name for the new ContactList , suitable for displaying in the user interface.
                   * @return The newly created ContactList .
                   */
  def createContactListAsync(displayName: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[ContactList] = js.native
  /**
                   * Asynchronously creates a ContactList with the specified display name and user account.
                   * @param displayName A name for the new ContactList , suitable for displaying in the user interface.
                   * @param userDataAccountId The ID for the UserDataAccount to use when creating the ContactList .
                   * @return The newly created ContactList .
                   */
  def createContactListAsync(displayName: java.lang.String, userDataAccountId: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[ContactList] = js.native
  /**
                   * Asynchronously returns the list of ContactList objects.
                   * @return The list of ContactList objects.
                   */
  def findContactListsAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[_]] = js.native
  /**
                   * Retrieves the list of all contacts in the contact store.
                   * @return An asynchronous operation that returns a list of all Contact objects in the contact store. If you use Asynchronous programming, the result type is a read-only list/vector of Contact items. (You can use APIs of IVectorView<Contact> for C++ or JavaScript, APIs of IReadOnlyList<Contact> for .NET.)
                   */
  def findContactsAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[Contact]] = js.native
  /**
                   * Retrieves a list of Contact objects based on the supplied search text.
                   * @param searchText The search string for the operation. The query will attempt to match the name ( Name ), email address ( Emails values), or phone number ( Phones values) of a contact.
                   * @return An asynchronous operation that returns a search-filtered list of contacts on successful completion. If you use Asynchronous programming, the result type is a read-only list/vector of Contact items. (You can use APIs of IVectorView<Contact> for C++ or JavaScript, APIs of IReadOnlyList<Contact> for .NET.)
                   */
  def findContactsAsync(searchText: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[Contact]] = js.native
  /**
                   * Retrieves a Contact object representing the contact with the specified Id value.
                   * @param contactId The Id of the contact to be retrieved.
                   * @return An asynchronous operation that returns a Contact object on successful completion. If you use Asynchronous programming, the result type is a single Contact object.
                   */
  def getContactAsync(contactId: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[Contact] = js.native
  /**
                   * Asynchronously gets the ContactList with the specified ID.
                   * @param contactListId The ID of the ContactList to retrieve.
                   * @return The ContactList with the specified ID or null if the list is not found.
                   */
  def getContactListAsync(contactListId: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[ContactList] = js.native
  /**
                   * Creates and returns a ContactReader for the ContactStore .
                   * @return The newly created ContactReader for the ContactStore .
                   */
  def getContactReader(): ContactReader = js.native
  /**
                   * Creates and returns a ContactReader for the ContactStore with the specified ContactQueryOptions .
                   * @param options The query options to use when creating the new ContactReader .
                   * @return The newly created ContactReader for the ContactStore .
                   */
  def getContactReader(options: ContactQueryOptions): ContactReader = js.native
  /**
                   * Get the Contact object for the current user.
                   * @return The Contact object for the current user.
                   */
  def getMeContactAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[Contact] = js.native
  /** Occurs when a Contact in the ContactStore has been changed. */
  def oncontactchanged(ev: ContactChangedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[ContactStore]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_contactchanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.contactchanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[ContactStore, ContactChangedEventArgs]
  ): scala.Unit = js.native
}

