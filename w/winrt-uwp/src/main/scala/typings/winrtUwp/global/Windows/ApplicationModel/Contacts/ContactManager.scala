package typings.winrtUwp.global.Windows.ApplicationModel.Contacts

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.Rect
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamReference
import typings.winrtUwp.Windows.Storage.Streams.RandomAccessStreamReference
import typings.winrtUwp.Windows.UI.Popups.Placement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a service that source apps can call to access contact data. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactManager")
@js.native
abstract class ContactManager ()
  extends typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactManager

/* static members */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactManager")
@js.native
object ContactManager extends js.Object {
  /** Gets or puts the display name order. */
  var systemDisplayNameOrder: typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactNameOrder = js.native
  /** Gets or puts the sort order. */
  var systemSortOrder: typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactNameOrder = js.native
  /**
    * Asynchronously converts a Contact to a vCard.
    * @param contact The Contact to convert.
    * @return A stream containing the vCard data.
    */
  def convertContactToVCardAsync(contact: typings.winrtUwp.Windows.ApplicationModel.Contacts.Contact): IPromiseWithIAsyncOperation[RandomAccessStreamReference] = js.native
  /**
    * Asynchronously converts a Contact to a vCard.
    * @param contact The Contact to convert.
    * @param maxBytes The maximum size for the vCard in bytes.
    * @return A stream containing the vCard data.
    */
  def convertContactToVCardAsync(contact: typings.winrtUwp.Windows.ApplicationModel.Contacts.Contact, maxBytes: Double): IPromiseWithIAsyncOperation[RandomAccessStreamReference] = js.native
  /**
    * Asynchronously converts a vCard to a Contact .
    * @param vCard A stream containing the vCard data.
    * @return The converted Contact .
    */
  def convertVCardToContactAsync(vCard: IRandomAccessStreamReference): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.ApplicationModel.Contacts.Contact] = js.native
  /**
    * Gets a Boolean value indicating if the ShowContactCard method is supported on the current platform.
    * @return A Boolean value indicating if the ShowContactCard method is supported on the current platform.
    */
  def isShowContactCardSupported(): Boolean = js.native
  /**
    * Gets a Boolean value indicating if the ShowDelayLoadedContactCard method is supported on the current platform.
    * @return A Boolean value indicating if the ShowDelayLoadedContactCard method is supported on the current platform.
    */
  def isShowDelayLoadedContactCardSupported(): Boolean = js.native
  /**
    * Asynchronously requests access to the ContactAnnotationStore .
    * @param accessType Specifies the type of access request, app contact annotations or all annotations.
    * @return The requested ContactAnnotationStore .
    */
  def requestAnnotationStoreAsync(accessType: typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactAnnotationStoreAccessType): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactAnnotationStore] = js.native
  /**
    * Retrieves a ContactStore object that enables searching or retrieving contacts on the device.
    * @return An asynchronous operation that returns a ContactStore object on successful completion.
    */
  def requestStoreAsync(): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactStore] = js.native
  /**
    * Retrieves a ContactStore object that enables searching or retrieving contacts on the device.
    * @param accessType Specifies the type of read/write access requested.
    * @return An asynchronous operation that returns a ContactStore object on successful completion.
    */
  def requestStoreAsync(accessType: typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactStoreAccessType): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactStore] = js.native
  /**
    * Queries the operating system for a user’s contact and shows the contact data in a contact card.
    * @param contact The object that represents the contact that the app wants to display the contact card for.
    * @param selection The Rect is the rectangular area of user selection (for example, pressing a button), around which the operating system displays the contact card, not within that rectangular area. For example, if an app uses a button to show the contact card, pass the Rect of the button so the contact card displays around the button, not overlapping it.
    */
  def showContactCard(contact: typings.winrtUwp.Windows.ApplicationModel.Contacts.Contact, selection: Rect): Unit = js.native
  /**
    * Queries the operating system for a user’s contact and shows the contact data in a contact card.
    * @param contact The object that represents the contact that the app wants to display the contact card for.
    * @param selection The Rect is the rectangular area of user selection (for example, pressing a button), around which the operating system displays the contact card, not within that rectangular area. For example, if an app uses a button to show the contact card, pass the Rect of the button so the contact card displays around the button, not overlapping it.
    * @param preferredPlacement The Placement that describes the preferred placement of the contact card.
    */
  def showContactCard(
    contact: typings.winrtUwp.Windows.ApplicationModel.Contacts.Contact,
    selection: Rect,
    preferredPlacement: Placement
  ): Unit = js.native
  /**
    * Shows a contact card with the specified parameters.
    * @param contact The object that represents the contact that the app wants to display the contact card for.
    * @param selection The Rect is the rectangular area of user selection (for example, pressing a button), around which the operating system displays the contact card, not within that rectangular area. For example, if an app uses a button to show the contact card, pass the Rect of the button so the contact card displays around the button, not overlapping it.
    * @param preferredPlacement The Placement that describes the preferred placement of the contact card.
    * @param contactCardOptions Specifies how to display the contact card, such as which tab to start on when displaying a mini contact card.
    */
  def showContactCard(
    contact: typings.winrtUwp.Windows.ApplicationModel.Contacts.Contact,
    selection: Rect,
    preferredPlacement: Placement,
    contactCardOptions: typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactCardOptions
  ): Unit = js.native
  /**
    * Shows a contact card that can be updated later if the contact does not exist in the user’s contact database.
    * @param contact The object that represents the contact that the app wants to display the contact card for.
    * @param selection The Rect is the rectangular area of user selection (for example, pressing a button), around which the operating system displays the contact card, not within that rectangular area. For example, if an app uses a button to show the contact card, pass the Rect of the button so the contact card displays around the button, not overlapping it.
    * @param preferredPlacement The Placement that describes the preferred placement of the contact card.
    * @return Returns the ContactCardDelayedDataLoader object that can be used to update the contact card.
    */
  def showDelayLoadedContactCard(
    contact: typings.winrtUwp.Windows.ApplicationModel.Contacts.Contact,
    selection: Rect,
    preferredPlacement: Placement
  ): typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactCardDelayedDataLoader = js.native
  /**
    * Shows a contact card that can be updated later if the contact does not exist in the user’s contact database.
    * @param contact The object that represents the contact that the app wants to display the contact card for.
    * @param selection The Rect is the rectangular area of user selection (for example, pressing a button), around which the operating system displays the contact card, not within that rectangular area. For example, if an app uses a button to show the contact card, pass the Rect of the button so the contact card displays around the button, not overlapping it.
    * @param preferredPlacement The Placement that describes the preferred placement of the contact card.
    * @param contactCardOptions Specifies how to display the contact card, such as which tab to start on if you are displaying a mini contact card, or what header type to use if you are showing a full contact card.
    * @return Returns the ContactCardDelayedDataLoader object that can be used to update the contact card.
    */
  def showDelayLoadedContactCard(
    contact: typings.winrtUwp.Windows.ApplicationModel.Contacts.Contact,
    selection: Rect,
    preferredPlacement: Placement,
    contactCardOptions: typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactCardOptions
  ): typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactCardDelayedDataLoader = js.native
  /**
    * Queries the operating system for a user’s contact and shows the contact data in a full contact card.
    * @param contact The object that represents the contact that the app wants to display the contact card for.
    * @param fullContactCardOptions Specifies how to display the full contact card.
    */
  def showFullContactCard(
    contact: typings.winrtUwp.Windows.ApplicationModel.Contacts.Contact,
    fullContactCardOptions: typings.winrtUwp.Windows.ApplicationModel.Contacts.FullContactCardOptions
  ): Unit = js.native
}

