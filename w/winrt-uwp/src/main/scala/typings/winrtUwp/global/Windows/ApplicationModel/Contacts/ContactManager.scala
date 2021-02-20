package typings.winrtUwp.global.Windows.ApplicationModel.Contacts

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.Rect
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamReference
import typings.winrtUwp.Windows.Storage.Streams.RandomAccessStreamReference
import typings.winrtUwp.Windows.UI.Popups.Placement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a service that source apps can call to access contact data. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactManager")
@js.native
abstract class ContactManager ()
  extends typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactManager
object ContactManager {
  
  @JSGlobal("Windows.ApplicationModel.Contacts.ContactManager")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Asynchronously converts a Contact to a vCard.
    * @param contact The Contact to convert.
    * @return A stream containing the vCard data.
    */
  /* static member */
  @JSGlobal("Windows.ApplicationModel.Contacts.ContactManager.convertContactToVCardAsync")
  @js.native
  def convertContactToVCardAsync(contact: typings.winrtUwp.Windows.ApplicationModel.Contacts.Contact): IPromiseWithIAsyncOperation[RandomAccessStreamReference] = js.native
  /**
    * Asynchronously converts a Contact to a vCard.
    * @param contact The Contact to convert.
    * @param maxBytes The maximum size for the vCard in bytes.
    * @return A stream containing the vCard data.
    */
  /* static member */
  @JSGlobal("Windows.ApplicationModel.Contacts.ContactManager.convertContactToVCardAsync")
  @js.native
  def convertContactToVCardAsync(contact: typings.winrtUwp.Windows.ApplicationModel.Contacts.Contact, maxBytes: Double): IPromiseWithIAsyncOperation[RandomAccessStreamReference] = js.native
  
  /**
    * Asynchronously converts a vCard to a Contact .
    * @param vCard A stream containing the vCard data.
    * @return The converted Contact .
    */
  /* static member */
  @JSGlobal("Windows.ApplicationModel.Contacts.ContactManager.convertVCardToContactAsync")
  @js.native
  def convertVCardToContactAsync(vCard: IRandomAccessStreamReference): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.ApplicationModel.Contacts.Contact] = js.native
  
  /**
    * Gets a Boolean value indicating if the ShowContactCard method is supported on the current platform.
    * @return A Boolean value indicating if the ShowContactCard method is supported on the current platform.
    */
  /* static member */
  @JSGlobal("Windows.ApplicationModel.Contacts.ContactManager.isShowContactCardSupported")
  @js.native
  def isShowContactCardSupported(): Boolean = js.native
  
  /**
    * Gets a Boolean value indicating if the ShowDelayLoadedContactCard method is supported on the current platform.
    * @return A Boolean value indicating if the ShowDelayLoadedContactCard method is supported on the current platform.
    */
  /* static member */
  @JSGlobal("Windows.ApplicationModel.Contacts.ContactManager.isShowDelayLoadedContactCardSupported")
  @js.native
  def isShowDelayLoadedContactCardSupported(): Boolean = js.native
  
  /**
    * Asynchronously requests access to the ContactAnnotationStore .
    * @param accessType Specifies the type of access request, app contact annotations or all annotations.
    * @return The requested ContactAnnotationStore .
    */
  /* static member */
  @JSGlobal("Windows.ApplicationModel.Contacts.ContactManager.requestAnnotationStoreAsync")
  @js.native
  def requestAnnotationStoreAsync(accessType: typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactAnnotationStoreAccessType): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactAnnotationStore] = js.native
  
  /**
    * Retrieves a ContactStore object that enables searching or retrieving contacts on the device.
    * @return An asynchronous operation that returns a ContactStore object on successful completion.
    */
  /* static member */
  @JSGlobal("Windows.ApplicationModel.Contacts.ContactManager.requestStoreAsync")
  @js.native
  def requestStoreAsync(): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactStore] = js.native
  /**
    * Retrieves a ContactStore object that enables searching or retrieving contacts on the device.
    * @param accessType Specifies the type of read/write access requested.
    * @return An asynchronous operation that returns a ContactStore object on successful completion.
    */
  /* static member */
  @JSGlobal("Windows.ApplicationModel.Contacts.ContactManager.requestStoreAsync")
  @js.native
  def requestStoreAsync(accessType: typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactStoreAccessType): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactStore] = js.native
  
  /**
    * Queries the operating system for a user’s contact and shows the contact data in a contact card.
    * @param contact The object that represents the contact that the app wants to display the contact card for.
    * @param selection The Rect is the rectangular area of user selection (for example, pressing a button), around which the operating system displays the contact card, not within that rectangular area. For example, if an app uses a button to show the contact card, pass the Rect of the button so the contact card displays around the button, not overlapping it.
    */
  /* static member */
  @JSGlobal("Windows.ApplicationModel.Contacts.ContactManager.showContactCard")
  @js.native
  def showContactCard(contact: typings.winrtUwp.Windows.ApplicationModel.Contacts.Contact, selection: Rect): Unit = js.native
  /**
    * Queries the operating system for a user’s contact and shows the contact data in a contact card.
    * @param contact The object that represents the contact that the app wants to display the contact card for.
    * @param selection The Rect is the rectangular area of user selection (for example, pressing a button), around which the operating system displays the contact card, not within that rectangular area. For example, if an app uses a button to show the contact card, pass the Rect of the button so the contact card displays around the button, not overlapping it.
    * @param preferredPlacement The Placement that describes the preferred placement of the contact card.
    */
  /* static member */
  @JSGlobal("Windows.ApplicationModel.Contacts.ContactManager.showContactCard")
  @js.native
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
  /* static member */
  @JSGlobal("Windows.ApplicationModel.Contacts.ContactManager.showContactCard")
  @js.native
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
  /* static member */
  @JSGlobal("Windows.ApplicationModel.Contacts.ContactManager.showDelayLoadedContactCard")
  @js.native
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
  /* static member */
  @JSGlobal("Windows.ApplicationModel.Contacts.ContactManager.showDelayLoadedContactCard")
  @js.native
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
  /* static member */
  @JSGlobal("Windows.ApplicationModel.Contacts.ContactManager.showFullContactCard")
  @js.native
  def showFullContactCard(
    contact: typings.winrtUwp.Windows.ApplicationModel.Contacts.Contact,
    fullContactCardOptions: typings.winrtUwp.Windows.ApplicationModel.Contacts.FullContactCardOptions
  ): Unit = js.native
  
  /** Gets or puts the display name order. */
  /* static member */
  @JSGlobal("Windows.ApplicationModel.Contacts.ContactManager.systemDisplayNameOrder")
  @js.native
  def systemDisplayNameOrder: typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactNameOrder = js.native
  @scala.inline
  def systemDisplayNameOrder_=(x: typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactNameOrder): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("systemDisplayNameOrder")(x.asInstanceOf[js.Any])
  
  /** Gets or puts the sort order. */
  /* static member */
  @JSGlobal("Windows.ApplicationModel.Contacts.ContactManager.systemSortOrder")
  @js.native
  def systemSortOrder: typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactNameOrder = js.native
  @scala.inline
  def systemSortOrder_=(x: typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactNameOrder): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("systemSortOrder")(x.asInstanceOf[js.Any])
}
