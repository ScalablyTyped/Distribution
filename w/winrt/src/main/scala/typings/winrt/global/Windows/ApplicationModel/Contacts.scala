package typings.winrt.global.Windows.ApplicationModel

import typings.winrt.Windows.ApplicationModel.Contacts.ContactFieldCategory
import typings.winrt.Windows.ApplicationModel.Contacts.ContactFieldType
import typings.winrt.Windows.Foundation.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Contacts {
  
  @JSGlobal("Windows.ApplicationModel.Contacts.Contact")
  @js.native
  class Contact ()
    extends typings.winrt.Windows.ApplicationModel.Contacts.Contact
  
  @JSGlobal("Windows.ApplicationModel.Contacts.ContactField")
  @js.native
  class ContactField protected ()
    extends typings.winrt.Windows.ApplicationModel.Contacts.ContactField {
    def this(value: String, `type`: ContactFieldType) = this()
    def this(value: String, `type`: ContactFieldType, category: ContactFieldCategory) = this()
    def this(name: String, value: String, `type`: ContactFieldType, category: ContactFieldCategory) = this()
  }
  
  @JSGlobal("Windows.ApplicationModel.Contacts.ContactFieldCategory")
  @js.native
  object ContactFieldCategory extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.ApplicationModel.Contacts.ContactFieldCategory with Double] = js.native
    
    /* 1 */ val home: typings.winrt.Windows.ApplicationModel.Contacts.ContactFieldCategory.home with Double = js.native
    
    /* 3 */ val mobile: typings.winrt.Windows.ApplicationModel.Contacts.ContactFieldCategory.mobile with Double = js.native
    
    /* 0 */ val none: typings.winrt.Windows.ApplicationModel.Contacts.ContactFieldCategory.none with Double = js.native
    
    /* 4 */ val other: typings.winrt.Windows.ApplicationModel.Contacts.ContactFieldCategory.other with Double = js.native
    
    /* 2 */ val work: typings.winrt.Windows.ApplicationModel.Contacts.ContactFieldCategory.work with Double = js.native
  }
  
  @JSGlobal("Windows.ApplicationModel.Contacts.ContactFieldFactory")
  @js.native
  class ContactFieldFactory ()
    extends typings.winrt.Windows.ApplicationModel.Contacts.ContactFieldFactory
  
  @JSGlobal("Windows.ApplicationModel.Contacts.ContactFieldType")
  @js.native
  object ContactFieldType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.ApplicationModel.Contacts.ContactFieldType with Double] = js.native
    
    /* 4 */ val custom: typings.winrt.Windows.ApplicationModel.Contacts.ContactFieldType.custom with Double = js.native
    
    /* 0 */ val email: typings.winrt.Windows.ApplicationModel.Contacts.ContactFieldType.email with Double = js.native
    
    /* 3 */ val instantMessage: typings.winrt.Windows.ApplicationModel.Contacts.ContactFieldType.instantMessage with Double = js.native
    
    /* 2 */ val location: typings.winrt.Windows.ApplicationModel.Contacts.ContactFieldType.location with Double = js.native
    
    /* 1 */ val phoneNumber: typings.winrt.Windows.ApplicationModel.Contacts.ContactFieldType.phoneNumber with Double = js.native
  }
  
  @JSGlobal("Windows.ApplicationModel.Contacts.ContactInformation")
  @js.native
  class ContactInformation ()
    extends typings.winrt.Windows.ApplicationModel.Contacts.ContactInformation
  
  @JSGlobal("Windows.ApplicationModel.Contacts.ContactInstantMessageField")
  @js.native
  class ContactInstantMessageField protected ()
    extends typings.winrt.Windows.ApplicationModel.Contacts.ContactInstantMessageField {
    def this(userName: String) = this()
    def this(userName: String, category: ContactFieldCategory) = this()
    def this(userName: String, category: ContactFieldCategory, service: String, displayText: String, verb: Uri) = this()
  }
  
  @JSGlobal("Windows.ApplicationModel.Contacts.ContactLocationField")
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
  }
  
  @JSGlobal("Windows.ApplicationModel.Contacts.ContactPicker")
  @js.native
  class ContactPicker ()
    extends typings.winrt.Windows.ApplicationModel.Contacts.ContactPicker
  
  @JSGlobal("Windows.ApplicationModel.Contacts.ContactSelectionMode")
  @js.native
  object ContactSelectionMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.ApplicationModel.Contacts.ContactSelectionMode with Double] = js.native
    
    /* 0 */ val contacts: typings.winrt.Windows.ApplicationModel.Contacts.ContactSelectionMode.contacts with Double = js.native
    
    /* 1 */ val fields: typings.winrt.Windows.ApplicationModel.Contacts.ContactSelectionMode.fields with Double = js.native
  }
  
  @JSGlobal("Windows.ApplicationModel.Contacts.KnownContactField")
  @js.native
  class KnownContactField ()
    extends typings.winrt.Windows.ApplicationModel.Contacts.KnownContactField
  /* static members */
  object KnownContactField {
    
    @JSGlobal("Windows.ApplicationModel.Contacts.KnownContactField")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Windows.ApplicationModel.Contacts.KnownContactField.convertNameToType")
    @js.native
    def convertNameToType(name: String): ContactFieldType = js.native
    
    @JSGlobal("Windows.ApplicationModel.Contacts.KnownContactField.convertTypeToName")
    @js.native
    def convertTypeToName(`type`: ContactFieldType): String = js.native
    
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
            typings.winrt.Windows.ApplicationModel.Contacts.Provider.AddContactResult with Double
          ] = js.native
      
      /* 0 */ val added: typings.winrt.Windows.ApplicationModel.Contacts.Provider.AddContactResult.added with Double = js.native
      
      /* 1 */ val alreadyAdded: typings.winrt.Windows.ApplicationModel.Contacts.Provider.AddContactResult.alreadyAdded with Double = js.native
      
      /* 2 */ val unavailable: typings.winrt.Windows.ApplicationModel.Contacts.Provider.AddContactResult.unavailable with Double = js.native
    }
    
    @JSGlobal("Windows.ApplicationModel.Contacts.Provider.ContactPickerUI")
    @js.native
    class ContactPickerUI ()
      extends typings.winrt.Windows.ApplicationModel.Contacts.Provider.ContactPickerUI
    
    @JSGlobal("Windows.ApplicationModel.Contacts.Provider.ContactRemovedEventArgs")
    @js.native
    class ContactRemovedEventArgs ()
      extends typings.winrt.Windows.ApplicationModel.Contacts.Provider.ContactRemovedEventArgs
  }
}
