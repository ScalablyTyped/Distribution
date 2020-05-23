package typings.winrt.global.Windows.ApplicationModel

import typings.winrt.Windows.ApplicationModel.Contacts.ContactFieldCategory
import typings.winrt.Windows.ApplicationModel.Contacts.ContactFieldType
import typings.winrt.Windows.ApplicationModel.Contacts.ContactSelectionMode
import typings.winrt.Windows.ApplicationModel.Contacts.IContactField
import typings.winrt.Windows.ApplicationModel.Contacts.Provider.AddContactResult
import typings.winrt.Windows.Foundation.Collections.IVector
import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Foundation.Uri
import typings.winrt.Windows.Storage.Streams.IRandomAccessStreamReference
import typings.winrt.Windows.Storage.Streams.IRandomAccessStreamWithContentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.Contacts")
@js.native
object Contacts extends js.Object {
  @js.native
  class Contact ()
    extends typings.winrt.Windows.ApplicationModel.Contacts.Contact {
    /* CompleteClass */
    override var fields: IVector[IContactField] = js.native
    /* CompleteClass */
    override var name: String = js.native
    /* CompleteClass */
    override var thumbnail: IRandomAccessStreamReference = js.native
  }
  
  @js.native
  class ContactField protected ()
    extends typings.winrt.Windows.ApplicationModel.Contacts.ContactField {
    def this(value: String, `type`: ContactFieldType) = this()
    def this(value: String, `type`: ContactFieldType, category: ContactFieldCategory) = this()
    def this(name: String, value: String, `type`: ContactFieldType, category: ContactFieldCategory) = this()
    /* CompleteClass */
    override var category: ContactFieldCategory = js.native
    /* CompleteClass */
    override var name: String = js.native
    /* CompleteClass */
    override var `type`: ContactFieldType = js.native
    /* CompleteClass */
    override var value: String = js.native
  }
  
  @js.native
  class ContactFieldFactory ()
    extends typings.winrt.Windows.ApplicationModel.Contacts.ContactFieldFactory
  
  @js.native
  class ContactInformation ()
    extends typings.winrt.Windows.ApplicationModel.Contacts.ContactInformation {
    /* CompleteClass */
    override var customFields: IVectorView[typings.winrt.Windows.ApplicationModel.Contacts.ContactField] = js.native
    /* CompleteClass */
    override var emails: IVectorView[typings.winrt.Windows.ApplicationModel.Contacts.ContactField] = js.native
    /* CompleteClass */
    override var instantMessages: IVectorView[typings.winrt.Windows.ApplicationModel.Contacts.ContactInstantMessageField] = js.native
    /* CompleteClass */
    override var locations: IVectorView[typings.winrt.Windows.ApplicationModel.Contacts.ContactLocationField] = js.native
    /* CompleteClass */
    override var name: String = js.native
    /* CompleteClass */
    override var phoneNumbers: IVectorView[typings.winrt.Windows.ApplicationModel.Contacts.ContactField] = js.native
    /* CompleteClass */
    override def getThumbnailAsync(): IAsyncOperation[IRandomAccessStreamWithContentType] = js.native
    /* CompleteClass */
    override def queryCustomFields(customName: String): IVectorView[typings.winrt.Windows.ApplicationModel.Contacts.ContactField] = js.native
  }
  
  @js.native
  class ContactInstantMessageField protected ()
    extends typings.winrt.Windows.ApplicationModel.Contacts.ContactInstantMessageField {
    def this(userName: String) = this()
    def this(userName: String, category: ContactFieldCategory) = this()
    def this(userName: String, category: ContactFieldCategory, service: String, displayText: String, verb: Uri) = this()
    /* CompleteClass */
    override var category: ContactFieldCategory = js.native
    /* CompleteClass */
    override var displayText: String = js.native
    /* CompleteClass */
    override var launchUri: Uri = js.native
    /* CompleteClass */
    override var name: String = js.native
    /* CompleteClass */
    override var service: String = js.native
    /* CompleteClass */
    override var `type`: ContactFieldType = js.native
    /* CompleteClass */
    override var userName: String = js.native
    /* CompleteClass */
    override var value: String = js.native
  }
  
  @js.native
  class ContactLocationField protected ()
    extends typings.winrt.Windows.ApplicationModel.Contacts.ContactLocationField {
    def this(unstructuredAddress: String) = this()
    def this(unstructuredAddress: String, category: ContactFieldCategory) = this()
    def this(
      unstructuredAddress: String,
      category: ContactFieldCategory,
      street: String,
      city: String,
      region: String,
      country: String,
      postalCode: String
    ) = this()
    /* CompleteClass */
    override var category: ContactFieldCategory = js.native
    /* CompleteClass */
    override var city: String = js.native
    /* CompleteClass */
    override var country: String = js.native
    /* CompleteClass */
    override var name: String = js.native
    /* CompleteClass */
    override var postalCode: String = js.native
    /* CompleteClass */
    override var region: String = js.native
    /* CompleteClass */
    override var street: String = js.native
    /* CompleteClass */
    override var `type`: ContactFieldType = js.native
    /* CompleteClass */
    override var unstructuredAddress: String = js.native
    /* CompleteClass */
    override var value: String = js.native
  }
  
  @js.native
  class ContactPicker ()
    extends typings.winrt.Windows.ApplicationModel.Contacts.ContactPicker {
    /* CompleteClass */
    override var commitButtonText: String = js.native
    /* CompleteClass */
    override var desiredFields: IVector[String] = js.native
    /* CompleteClass */
    override var selectionMode: ContactSelectionMode = js.native
    /* CompleteClass */
    override def pickMultipleContactsAsync(): IAsyncOperation[IVectorView[typings.winrt.Windows.ApplicationModel.Contacts.ContactInformation]] = js.native
    /* CompleteClass */
    override def pickSingleContactAsync(): IAsyncOperation[typings.winrt.Windows.ApplicationModel.Contacts.ContactInformation] = js.native
  }
  
  @js.native
  class KnownContactField ()
    extends typings.winrt.Windows.ApplicationModel.Contacts.KnownContactField
  
  @js.native
  object ContactFieldCategory extends js.Object {
    /* 1 */ val home: typings.winrt.Windows.ApplicationModel.Contacts.ContactFieldCategory.home with Double = js.native
    /* 3 */ val mobile: typings.winrt.Windows.ApplicationModel.Contacts.ContactFieldCategory.mobile with Double = js.native
    /* 0 */ val none: typings.winrt.Windows.ApplicationModel.Contacts.ContactFieldCategory.none with Double = js.native
    /* 4 */ val other: typings.winrt.Windows.ApplicationModel.Contacts.ContactFieldCategory.other with Double = js.native
    /* 2 */ val work: typings.winrt.Windows.ApplicationModel.Contacts.ContactFieldCategory.work with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.ApplicationModel.Contacts.ContactFieldCategory with Double] = js.native
  }
  
  @js.native
  object ContactFieldType extends js.Object {
    /* 4 */ val custom: typings.winrt.Windows.ApplicationModel.Contacts.ContactFieldType.custom with Double = js.native
    /* 0 */ val email: typings.winrt.Windows.ApplicationModel.Contacts.ContactFieldType.email with Double = js.native
    /* 3 */ val instantMessage: typings.winrt.Windows.ApplicationModel.Contacts.ContactFieldType.instantMessage with Double = js.native
    /* 2 */ val location: typings.winrt.Windows.ApplicationModel.Contacts.ContactFieldType.location with Double = js.native
    /* 1 */ val phoneNumber: typings.winrt.Windows.ApplicationModel.Contacts.ContactFieldType.phoneNumber with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.ApplicationModel.Contacts.ContactFieldType with Double] = js.native
  }
  
  @js.native
  object ContactSelectionMode extends js.Object {
    /* 0 */ val contacts: typings.winrt.Windows.ApplicationModel.Contacts.ContactSelectionMode.contacts with Double = js.native
    /* 1 */ val fields: typings.winrt.Windows.ApplicationModel.Contacts.ContactSelectionMode.fields with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.ApplicationModel.Contacts.ContactSelectionMode with Double] = js.native
  }
  
  /* static members */
  @js.native
  object KnownContactField extends js.Object {
    var email: String = js.native
    var instantMessage: String = js.native
    var location: String = js.native
    var phoneNumber: String = js.native
    def convertNameToType(name: String): ContactFieldType = js.native
    def convertTypeToName(`type`: ContactFieldType): String = js.native
  }
  
  @js.native
  object Provider extends js.Object {
    @js.native
    class ContactPickerUI ()
      extends typings.winrt.Windows.ApplicationModel.Contacts.Provider.ContactPickerUI {
      /* CompleteClass */
      override var desiredFields: IVectorView[String] = js.native
      /* CompleteClass */
      override var oncontactremoved: js.Any = js.native
      /* CompleteClass */
      override var selectionMode: ContactSelectionMode = js.native
      /* CompleteClass */
      override def addContact(id: String, contact: typings.winrt.Windows.ApplicationModel.Contacts.Contact): AddContactResult = js.native
      /* CompleteClass */
      override def containsContact(id: String): Boolean = js.native
      /* CompleteClass */
      override def removeContact(id: String): Unit = js.native
    }
    
    @js.native
    class ContactRemovedEventArgs ()
      extends typings.winrt.Windows.ApplicationModel.Contacts.Provider.ContactRemovedEventArgs {
      /* CompleteClass */
      override var id: String = js.native
    }
    
    @js.native
    object AddContactResult extends js.Object {
      /* 0 */ val added: typings.winrt.Windows.ApplicationModel.Contacts.Provider.AddContactResult.added with Double = js.native
      /* 1 */ val alreadyAdded: typings.winrt.Windows.ApplicationModel.Contacts.Provider.AddContactResult.alreadyAdded with Double = js.native
      /* 2 */ val unavailable: typings.winrt.Windows.ApplicationModel.Contacts.Provider.AddContactResult.unavailable with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.winrt.Windows.ApplicationModel.Contacts.Provider.AddContactResult with Double
          ] = js.native
    }
    
  }
  
}

