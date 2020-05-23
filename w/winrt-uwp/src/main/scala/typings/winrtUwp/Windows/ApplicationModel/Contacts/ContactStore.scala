package typings.winrtUwp.Windows.ApplicationModel.Contacts

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.contactchanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a database that contains contacts. */
@js.native
trait ContactStore extends js.Object {
  /** Gets a contact manager that provides functionality for linking individual (raw) contacts across services together into a single aggregate contact. */
  var aggregateContactManager: AggregateContactManager = js.native
  /** Gets the ContactChangeTracker which provides functionality for monitoring changes to Contact objects in the ContactStore . */
  var changeTracker: ContactChangeTracker = js.native
  /** Occurs when a Contact in the ContactStore has been changed. */
  @JSName("oncontactchanged")
  var oncontactchanged_Original: TypedEventHandler[ContactStore, ContactChangedEventArgs] = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_contactchanged(`type`: contactchanged, listener: TypedEventHandler[ContactStore, ContactChangedEventArgs]): Unit = js.native
  /**
    * Asynchronously creates a ContactList with the specified display name.
    * @param displayName A name for the new ContactList , suitable for displaying in the user interface.
    * @return The newly created ContactList .
    */
  def createContactListAsync(displayName: String): IPromiseWithIAsyncOperation[ContactList] = js.native
  /**
    * Asynchronously creates a ContactList with the specified display name and user account.
    * @param displayName A name for the new ContactList , suitable for displaying in the user interface.
    * @param userDataAccountId The ID for the UserDataAccount to use when creating the ContactList .
    * @return The newly created ContactList .
    */
  def createContactListAsync(displayName: String, userDataAccountId: String): IPromiseWithIAsyncOperation[ContactList] = js.native
  /**
    * Asynchronously returns the list of ContactList objects.
    * @return The list of ContactList objects.
    */
  def findContactListsAsync(): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /**
    * Retrieves the list of all contacts in the contact store.
    * @return An asynchronous operation that returns a list of all Contact objects in the contact store. If you use Asynchronous programming, the result type is a read-only list/vector of Contact items. (You can use APIs of IVectorView<Contact> for C++ or JavaScript, APIs of IReadOnlyList<Contact> for .NET.)
    */
  def findContactsAsync(): IPromiseWithIAsyncOperation[IVectorView[Contact]] = js.native
  /**
    * Retrieves a list of Contact objects based on the supplied search text.
    * @param searchText The search string for the operation. The query will attempt to match the name ( Name ), email address ( Emails values), or phone number ( Phones values) of a contact.
    * @return An asynchronous operation that returns a search-filtered list of contacts on successful completion. If you use Asynchronous programming, the result type is a read-only list/vector of Contact items. (You can use APIs of IVectorView<Contact> for C++ or JavaScript, APIs of IReadOnlyList<Contact> for .NET.)
    */
  def findContactsAsync(searchText: String): IPromiseWithIAsyncOperation[IVectorView[Contact]] = js.native
  /**
    * Retrieves a Contact object representing the contact with the specified Id value.
    * @param contactId The Id of the contact to be retrieved.
    * @return An asynchronous operation that returns a Contact object on successful completion. If you use Asynchronous programming, the result type is a single Contact object.
    */
  def getContactAsync(contactId: String): IPromiseWithIAsyncOperation[Contact] = js.native
  /**
    * Asynchronously gets the ContactList with the specified ID.
    * @param contactListId The ID of the ContactList to retrieve.
    * @return The ContactList with the specified ID or null if the list is not found.
    */
  def getContactListAsync(contactListId: String): IPromiseWithIAsyncOperation[ContactList] = js.native
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
  def getMeContactAsync(): IPromiseWithIAsyncOperation[Contact] = js.native
  /** Occurs when a Contact in the ContactStore has been changed. */
  def oncontactchanged(ev: ContactChangedEventArgs with WinRTEvent[ContactStore]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_contactchanged(`type`: contactchanged, listener: TypedEventHandler[ContactStore, ContactChangedEventArgs]): Unit = js.native
}

