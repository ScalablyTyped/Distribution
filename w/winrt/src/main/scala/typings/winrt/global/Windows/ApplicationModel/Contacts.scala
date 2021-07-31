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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Contacts {
  
  @JSGlobal("Windows.ApplicationModel.Contacts.Contact")
  @js.native
  class Contact ()
    extends StObject
       with typings.winrt.Windows.ApplicationModel.Contacts.Contact {
    
    /* CompleteClass */
    var fields: IVector[IContactField] = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    var thumbnail: IRandomAccessStreamReference = js.native
  }
  
  @JSGlobal("Windows.ApplicationModel.Contacts.ContactField")
  @js.native
  class ContactField protected ()
    extends StObject
       with typings.winrt.Windows.ApplicationModel.Contacts.ContactField {
    def this(value: String, `type`: ContactFieldType) = this()
    def this(value: String, `type`: ContactFieldType, category: ContactFieldCategory) = this()
    def this(name: String, value: String, `type`: ContactFieldType, category: ContactFieldCategory) = this()
    
    /* CompleteClass */
    var category: ContactFieldCategory = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    var `type`: ContactFieldType = js.native
    
    /* CompleteClass */
    var value: String = js.native
  }
  
  @JSGlobal("Windows.ApplicationModel.Contacts.ContactFieldCategory")
  @js.native
  object ContactFieldCategory extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.ApplicationModel.Contacts.ContactFieldCategory & Double] = js.native
    
    /* 1 */ val home: typings.winrt.Windows.ApplicationModel.Contacts.ContactFieldCategory.home & Double = js.native
    
    /* 3 */ val mobile: typings.winrt.Windows.ApplicationModel.Contacts.ContactFieldCategory.mobile & Double = js.native
    
    /* 0 */ val none: typings.winrt.Windows.ApplicationModel.Contacts.ContactFieldCategory.none & Double = js.native
    
    /* 4 */ val other: typings.winrt.Windows.ApplicationModel.Contacts.ContactFieldCategory.other & Double = js.native
    
    /* 2 */ val work: typings.winrt.Windows.ApplicationModel.Contacts.ContactFieldCategory.work & Double = js.native
  }
  
  @JSGlobal("Windows.ApplicationModel.Contacts.ContactFieldFactory")
  @js.native
  class ContactFieldFactory ()
    extends StObject
       with typings.winrt.Windows.ApplicationModel.Contacts.ContactFieldFactory
  
  @JSGlobal("Windows.ApplicationModel.Contacts.ContactFieldType")
  @js.native
  object ContactFieldType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.ApplicationModel.Contacts.ContactFieldType & Double] = js.native
    
    /* 4 */ val custom: typings.winrt.Windows.ApplicationModel.Contacts.ContactFieldType.custom & Double = js.native
    
    /* 0 */ val email: typings.winrt.Windows.ApplicationModel.Contacts.ContactFieldType.email & Double = js.native
    
    /* 3 */ val instantMessage: typings.winrt.Windows.ApplicationModel.Contacts.ContactFieldType.instantMessage & Double = js.native
    
    /* 2 */ val location: typings.winrt.Windows.ApplicationModel.Contacts.ContactFieldType.location & Double = js.native
    
    /* 1 */ val phoneNumber: typings.winrt.Windows.ApplicationModel.Contacts.ContactFieldType.phoneNumber & Double = js.native
  }
  
  @JSGlobal("Windows.ApplicationModel.Contacts.ContactInformation")
  @js.native
  class ContactInformation ()
    extends StObject
       with typings.winrt.Windows.ApplicationModel.Contacts.ContactInformation {
    
    /* CompleteClass */
    var customFields: IVectorView[typings.winrt.Windows.ApplicationModel.Contacts.ContactField] = js.native
    
    /* CompleteClass */
    var emails: IVectorView[typings.winrt.Windows.ApplicationModel.Contacts.ContactField] = js.native
    
    /* CompleteClass */
    override def getThumbnailAsync(): IAsyncOperation[IRandomAccessStreamWithContentType] = js.native
    
    /* CompleteClass */
    var instantMessages: IVectorView[typings.winrt.Windows.ApplicationModel.Contacts.ContactInstantMessageField] = js.native
    
    /* CompleteClass */
    var locations: IVectorView[typings.winrt.Windows.ApplicationModel.Contacts.ContactLocationField] = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    var phoneNumbers: IVectorView[typings.winrt.Windows.ApplicationModel.Contacts.ContactField] = js.native
    
    /* CompleteClass */
    override def queryCustomFields(customName: String): IVectorView[typings.winrt.Windows.ApplicationModel.Contacts.ContactField] = js.native
  }
  
  @JSGlobal("Windows.ApplicationModel.Contacts.ContactInstantMessageField")
  @js.native
  class ContactInstantMessageField protected ()
    extends StObject
       with typings.winrt.Windows.ApplicationModel.Contacts.ContactInstantMessageField {
    def this(userName: String) = this()
    def this(userName: String, category: ContactFieldCategory) = this()
    def this(userName: String, category: ContactFieldCategory, service: String, displayText: String, verb: Uri) = this()
    
    /* CompleteClass */
    var category: ContactFieldCategory = js.native
    
    /* CompleteClass */
    var displayText: String = js.native
    
    /* CompleteClass */
    var launchUri: Uri = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    var service: String = js.native
    
    /* CompleteClass */
    var `type`: ContactFieldType = js.native
    
    /* CompleteClass */
    var userName: String = js.native
    
    /* CompleteClass */
    var value: String = js.native
  }
  
  @JSGlobal("Windows.ApplicationModel.Contacts.ContactLocationField")
  @js.native
  class ContactLocationField protected ()
    extends StObject
       with typings.winrt.Windows.ApplicationModel.Contacts.ContactLocationField {
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
    var category: ContactFieldCategory = js.native
    
    /* CompleteClass */
    var city: String = js.native
    
    /* CompleteClass */
    var country: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    var postalCode: String = js.native
    
    /* CompleteClass */
    var region: String = js.native
    
    /* CompleteClass */
    var street: String = js.native
    
    /* CompleteClass */
    var `type`: ContactFieldType = js.native
    
    /* CompleteClass */
    var unstructuredAddress: String = js.native
    
    /* CompleteClass */
    var value: String = js.native
  }
  
  @JSGlobal("Windows.ApplicationModel.Contacts.ContactPicker")
  @js.native
  class ContactPicker ()
    extends StObject
       with typings.winrt.Windows.ApplicationModel.Contacts.ContactPicker {
    
    /* CompleteClass */
    var commitButtonText: String = js.native
    
    /* CompleteClass */
    var desiredFields: IVector[String] = js.native
    
    /* CompleteClass */
    override def pickMultipleContactsAsync(): IAsyncOperation[IVectorView[typings.winrt.Windows.ApplicationModel.Contacts.ContactInformation]] = js.native
    
    /* CompleteClass */
    override def pickSingleContactAsync(): IAsyncOperation[typings.winrt.Windows.ApplicationModel.Contacts.ContactInformation] = js.native
    
    /* CompleteClass */
    var selectionMode: ContactSelectionMode = js.native
  }
  
  @JSGlobal("Windows.ApplicationModel.Contacts.ContactSelectionMode")
  @js.native
  object ContactSelectionMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.ApplicationModel.Contacts.ContactSelectionMode & Double] = js.native
    
    /* 0 */ val contacts: typings.winrt.Windows.ApplicationModel.Contacts.ContactSelectionMode.contacts & Double = js.native
    
    /* 1 */ val fields: typings.winrt.Windows.ApplicationModel.Contacts.ContactSelectionMode.fields & Double = js.native
  }
  
  @JSGlobal("Windows.ApplicationModel.Contacts.KnownContactField")
  @js.native
  class KnownContactField ()
    extends StObject
       with typings.winrt.Windows.ApplicationModel.Contacts.KnownContactField
  /* static members */
  object KnownContactField {
    
    @JSGlobal("Windows.ApplicationModel.Contacts.KnownContactField")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def convertNameToType(name: String): ContactFieldType = ^.asInstanceOf[js.Dynamic].applyDynamic("convertNameToType")(name.asInstanceOf[js.Any]).asInstanceOf[ContactFieldType]
    
    @scala.inline
    def convertTypeToName(`type`: ContactFieldType): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertTypeToName")(`type`.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSGlobal("Windows.ApplicationModel.Contacts.KnownContactField.email")
    @js.native
    def email: String = js.native
    @scala.inline
    def email_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("email")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.ApplicationModel.Contacts.KnownContactField.instantMessage")
    @js.native
    def instantMessage: String = js.native
    @scala.inline
    def instantMessage_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("instantMessage")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.ApplicationModel.Contacts.KnownContactField.location")
    @js.native
    def location: String = js.native
    @scala.inline
    def location_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("location")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.ApplicationModel.Contacts.KnownContactField.phoneNumber")
    @js.native
    def phoneNumber: String = js.native
    @scala.inline
    def phoneNumber_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("phoneNumber")(x.asInstanceOf[js.Any])
  }
  
  object Provider {
    
    @JSGlobal("Windows.ApplicationModel.Contacts.Provider.AddContactResult")
    @js.native
    object AddContactResult extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.winrt.Windows.ApplicationModel.Contacts.Provider.AddContactResult & Double
          ] = js.native
      
      /* 0 */ val added: typings.winrt.Windows.ApplicationModel.Contacts.Provider.AddContactResult.added & Double = js.native
      
      /* 1 */ val alreadyAdded: typings.winrt.Windows.ApplicationModel.Contacts.Provider.AddContactResult.alreadyAdded & Double = js.native
      
      /* 2 */ val unavailable: typings.winrt.Windows.ApplicationModel.Contacts.Provider.AddContactResult.unavailable & Double = js.native
    }
    
    @JSGlobal("Windows.ApplicationModel.Contacts.Provider.ContactPickerUI")
    @js.native
    class ContactPickerUI ()
      extends StObject
         with typings.winrt.Windows.ApplicationModel.Contacts.Provider.ContactPickerUI {
      
      /* CompleteClass */
      override def addContact(id: String, contact: typings.winrt.Windows.ApplicationModel.Contacts.Contact): AddContactResult = js.native
      
      /* CompleteClass */
      override def containsContact(id: String): Boolean = js.native
      
      /* CompleteClass */
      var desiredFields: IVectorView[String] = js.native
      
      /* CompleteClass */
      var oncontactremoved: js.Any = js.native
      
      /* CompleteClass */
      override def removeContact(id: String): Unit = js.native
      
      /* CompleteClass */
      var selectionMode: ContactSelectionMode = js.native
    }
    
    @JSGlobal("Windows.ApplicationModel.Contacts.Provider.ContactRemovedEventArgs")
    @js.native
    class ContactRemovedEventArgs ()
      extends StObject
         with typings.winrt.Windows.ApplicationModel.Contacts.Provider.ContactRemovedEventArgs {
      
      /* CompleteClass */
      var id: String = js.native
    }
  }
}
