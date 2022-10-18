package typings.winrtUwp.global.Windows.ApplicationModel.Contacts

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.Rect
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamReference
import typings.winrtUwp.Windows.Storage.Streams.RandomAccessStreamReference
import typings.winrtUwp.Windows.UI.Popups.Placement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a service that source apps can call to access contact data. */
/* note: abstract class */ @JSGlobal("Windows.ApplicationModel.Contacts.ContactManager")
@js.native
open class ContactManager ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactManager
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
  inline def convertContactToVCardAsync(contact: typings.winrtUwp.Windows.ApplicationModel.Contacts.Contact): IPromiseWithIAsyncOperation[RandomAccessStreamReference] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertContactToVCardAsync")(contact.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[RandomAccessStreamReference]]
  /**
    * Asynchronously converts a Contact to a vCard.
    * @param contact The Contact to convert.
    * @param maxBytes The maximum size for the vCard in bytes.
    * @return A stream containing the vCard data.
    */
  /* static member */
  inline def convertContactToVCardAsync(contact: typings.winrtUwp.Windows.ApplicationModel.Contacts.Contact, maxBytes: Double): IPromiseWithIAsyncOperation[RandomAccessStreamReference] = (^.asInstanceOf[js.Dynamic].applyDynamic("convertContactToVCardAsync")(contact.asInstanceOf[js.Any], maxBytes.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[RandomAccessStreamReference]]
  
  /**
    * Asynchronously converts a vCard to a Contact .
    * @param vCard A stream containing the vCard data.
    * @return The converted Contact .
    */
  /* static member */
  inline def convertVCardToContactAsync(vCard: IRandomAccessStreamReference): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.ApplicationModel.Contacts.Contact] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertVCardToContactAsync")(vCard.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.ApplicationModel.Contacts.Contact]]
  
  /**
    * Gets a Boolean value indicating if the ShowContactCard method is supported on the current platform.
    * @return A Boolean value indicating if the ShowContactCard method is supported on the current platform.
    */
  /* static member */
  inline def isShowContactCardSupported(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isShowContactCardSupported")().asInstanceOf[Boolean]
  
  /**
    * Gets a Boolean value indicating if the ShowDelayLoadedContactCard method is supported on the current platform.
    * @return A Boolean value indicating if the ShowDelayLoadedContactCard method is supported on the current platform.
    */
  /* static member */
  inline def isShowDelayLoadedContactCardSupported(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isShowDelayLoadedContactCardSupported")().asInstanceOf[Boolean]
  
  /**
    * Asynchronously requests access to the ContactAnnotationStore .
    * @param accessType Specifies the type of access request, app contact annotations or all annotations.
    * @return The requested ContactAnnotationStore .
    */
  /* static member */
  inline def requestAnnotationStoreAsync(accessType: typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactAnnotationStoreAccessType): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactAnnotationStore] = ^.asInstanceOf[js.Dynamic].applyDynamic("requestAnnotationStoreAsync")(accessType.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactAnnotationStore]]
  
  /**
    * Retrieves a ContactStore object that enables searching or retrieving contacts on the device.
    * @return An asynchronous operation that returns a ContactStore object on successful completion.
    */
  /* static member */
  inline def requestStoreAsync(): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactStore] = ^.asInstanceOf[js.Dynamic].applyDynamic("requestStoreAsync")().asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactStore]]
  /**
    * Retrieves a ContactStore object that enables searching or retrieving contacts on the device.
    * @param accessType Specifies the type of read/write access requested.
    * @return An asynchronous operation that returns a ContactStore object on successful completion.
    */
  /* static member */
  inline def requestStoreAsync(accessType: typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactStoreAccessType): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactStore] = ^.asInstanceOf[js.Dynamic].applyDynamic("requestStoreAsync")(accessType.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactStore]]
  
  /**
    * Queries the operating system for a user’s contact and shows the contact data in a contact card.
    * @param contact The object that represents the contact that the app wants to display the contact card for.
    * @param selection The Rect is the rectangular area of user selection (for example, pressing a button), around which the operating system displays the contact card, not within that rectangular area. For example, if an app uses a button to show the contact card, pass the Rect of the button so the contact card displays around the button, not overlapping it.
    */
  /* static member */
  inline def showContactCard(contact: typings.winrtUwp.Windows.ApplicationModel.Contacts.Contact, selection: Rect): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("showContactCard")(contact.asInstanceOf[js.Any], selection.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /**
    * Queries the operating system for a user’s contact and shows the contact data in a contact card.
    * @param contact The object that represents the contact that the app wants to display the contact card for.
    * @param selection The Rect is the rectangular area of user selection (for example, pressing a button), around which the operating system displays the contact card, not within that rectangular area. For example, if an app uses a button to show the contact card, pass the Rect of the button so the contact card displays around the button, not overlapping it.
    * @param preferredPlacement The Placement that describes the preferred placement of the contact card.
    */
  /* static member */
  inline def showContactCard(
    contact: typings.winrtUwp.Windows.ApplicationModel.Contacts.Contact,
    selection: Rect,
    preferredPlacement: Placement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("showContactCard")(contact.asInstanceOf[js.Any], selection.asInstanceOf[js.Any], preferredPlacement.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /**
    * Shows a contact card with the specified parameters.
    * @param contact The object that represents the contact that the app wants to display the contact card for.
    * @param selection The Rect is the rectangular area of user selection (for example, pressing a button), around which the operating system displays the contact card, not within that rectangular area. For example, if an app uses a button to show the contact card, pass the Rect of the button so the contact card displays around the button, not overlapping it.
    * @param preferredPlacement The Placement that describes the preferred placement of the contact card.
    * @param contactCardOptions Specifies how to display the contact card, such as which tab to start on when displaying a mini contact card.
    */
  /* static member */
  inline def showContactCard(
    contact: typings.winrtUwp.Windows.ApplicationModel.Contacts.Contact,
    selection: Rect,
    preferredPlacement: Placement,
    contactCardOptions: typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactCardOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("showContactCard")(contact.asInstanceOf[js.Any], selection.asInstanceOf[js.Any], preferredPlacement.asInstanceOf[js.Any], contactCardOptions.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Shows a contact card that can be updated later if the contact does not exist in the user’s contact database.
    * @param contact The object that represents the contact that the app wants to display the contact card for.
    * @param selection The Rect is the rectangular area of user selection (for example, pressing a button), around which the operating system displays the contact card, not within that rectangular area. For example, if an app uses a button to show the contact card, pass the Rect of the button so the contact card displays around the button, not overlapping it.
    * @param preferredPlacement The Placement that describes the preferred placement of the contact card.
    * @return Returns the ContactCardDelayedDataLoader object that can be used to update the contact card.
    */
  /* static member */
  inline def showDelayLoadedContactCard(
    contact: typings.winrtUwp.Windows.ApplicationModel.Contacts.Contact,
    selection: Rect,
    preferredPlacement: Placement
  ): typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactCardDelayedDataLoader = (^.asInstanceOf[js.Dynamic].applyDynamic("showDelayLoadedContactCard")(contact.asInstanceOf[js.Any], selection.asInstanceOf[js.Any], preferredPlacement.asInstanceOf[js.Any])).asInstanceOf[typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactCardDelayedDataLoader]
  /**
    * Shows a contact card that can be updated later if the contact does not exist in the user’s contact database.
    * @param contact The object that represents the contact that the app wants to display the contact card for.
    * @param selection The Rect is the rectangular area of user selection (for example, pressing a button), around which the operating system displays the contact card, not within that rectangular area. For example, if an app uses a button to show the contact card, pass the Rect of the button so the contact card displays around the button, not overlapping it.
    * @param preferredPlacement The Placement that describes the preferred placement of the contact card.
    * @param contactCardOptions Specifies how to display the contact card, such as which tab to start on if you are displaying a mini contact card, or what header type to use if you are showing a full contact card.
    * @return Returns the ContactCardDelayedDataLoader object that can be used to update the contact card.
    */
  /* static member */
  inline def showDelayLoadedContactCard(
    contact: typings.winrtUwp.Windows.ApplicationModel.Contacts.Contact,
    selection: Rect,
    preferredPlacement: Placement,
    contactCardOptions: typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactCardOptions
  ): typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactCardDelayedDataLoader = (^.asInstanceOf[js.Dynamic].applyDynamic("showDelayLoadedContactCard")(contact.asInstanceOf[js.Any], selection.asInstanceOf[js.Any], preferredPlacement.asInstanceOf[js.Any], contactCardOptions.asInstanceOf[js.Any])).asInstanceOf[typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactCardDelayedDataLoader]
  
  /**
    * Queries the operating system for a user’s contact and shows the contact data in a full contact card.
    * @param contact The object that represents the contact that the app wants to display the contact card for.
    * @param fullContactCardOptions Specifies how to display the full contact card.
    */
  /* static member */
  inline def showFullContactCard(
    contact: typings.winrtUwp.Windows.ApplicationModel.Contacts.Contact,
    fullContactCardOptions: typings.winrtUwp.Windows.ApplicationModel.Contacts.FullContactCardOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("showFullContactCard")(contact.asInstanceOf[js.Any], fullContactCardOptions.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** Gets or puts the display name order. */
  /* static member */
  @JSGlobal("Windows.ApplicationModel.Contacts.ContactManager.systemDisplayNameOrder")
  @js.native
  def systemDisplayNameOrder: typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactNameOrder = js.native
  inline def systemDisplayNameOrder_=(x: typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactNameOrder): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("systemDisplayNameOrder")(x.asInstanceOf[js.Any])
  
  /** Gets or puts the sort order. */
  /* static member */
  @JSGlobal("Windows.ApplicationModel.Contacts.ContactManager.systemSortOrder")
  @js.native
  def systemSortOrder: typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactNameOrder = js.native
  inline def systemSortOrder_=(x: typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactNameOrder): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("systemSortOrder")(x.asInstanceOf[js.Any])
}
