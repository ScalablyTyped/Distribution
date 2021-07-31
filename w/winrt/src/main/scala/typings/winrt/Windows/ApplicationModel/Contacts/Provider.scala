package typings.winrt.Windows.ApplicationModel.Contacts

import typings.winrt.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Provider {
  
  @js.native
  sealed trait AddContactResult extends StObject
  @JSGlobal("Windows.ApplicationModel.Contacts.Provider.AddContactResult")
  @js.native
  object AddContactResult extends StObject {
    
    @js.native
    sealed trait added
      extends StObject
         with AddContactResult
    
    @js.native
    sealed trait alreadyAdded
      extends StObject
         with AddContactResult
    
    @js.native
    sealed trait unavailable
      extends StObject
         with AddContactResult
  }
  
  trait ContactPickerUI
    extends StObject
       with IContactPickerUI
  object ContactPickerUI {
    
    @scala.inline
    def apply(
      addContact: (String, Contact) => AddContactResult,
      containsContact: String => Boolean,
      desiredFields: IVectorView[String],
      oncontactremoved: js.Any,
      removeContact: String => Unit,
      selectionMode: ContactSelectionMode
    ): ContactPickerUI = {
      val __obj = js.Dynamic.literal(addContact = js.Any.fromFunction2(addContact), containsContact = js.Any.fromFunction1(containsContact), desiredFields = desiredFields.asInstanceOf[js.Any], oncontactremoved = oncontactremoved.asInstanceOf[js.Any], removeContact = js.Any.fromFunction1(removeContact), selectionMode = selectionMode.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContactPickerUI]
    }
  }
  
  trait ContactRemovedEventArgs
    extends StObject
       with IContactRemovedEventArgs
  object ContactRemovedEventArgs {
    
    @scala.inline
    def apply(id: String): ContactRemovedEventArgs = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContactRemovedEventArgs]
    }
  }
  
  trait IContactPickerUI extends StObject {
    
    def addContact(id: String, contact: Contact): AddContactResult
    
    def containsContact(id: String): Boolean
    
    var desiredFields: IVectorView[String]
    
    var oncontactremoved: js.Any
    
    def removeContact(id: String): Unit
    
    var selectionMode: ContactSelectionMode
  }
  object IContactPickerUI {
    
    @scala.inline
    def apply(
      addContact: (String, Contact) => AddContactResult,
      containsContact: String => Boolean,
      desiredFields: IVectorView[String],
      oncontactremoved: js.Any,
      removeContact: String => Unit,
      selectionMode: ContactSelectionMode
    ): IContactPickerUI = {
      val __obj = js.Dynamic.literal(addContact = js.Any.fromFunction2(addContact), containsContact = js.Any.fromFunction1(containsContact), desiredFields = desiredFields.asInstanceOf[js.Any], oncontactremoved = oncontactremoved.asInstanceOf[js.Any], removeContact = js.Any.fromFunction1(removeContact), selectionMode = selectionMode.asInstanceOf[js.Any])
      __obj.asInstanceOf[IContactPickerUI]
    }
    
    @scala.inline
    implicit class IContactPickerUIMutableBuilder[Self <: IContactPickerUI] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddContact(value: (String, Contact) => AddContactResult): Self = StObject.set(x, "addContact", js.Any.fromFunction2(value))
      
      @scala.inline
      def setContainsContact(value: String => Boolean): Self = StObject.set(x, "containsContact", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDesiredFields(value: IVectorView[String]): Self = StObject.set(x, "desiredFields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOncontactremoved(value: js.Any): Self = StObject.set(x, "oncontactremoved", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveContact(value: String => Unit): Self = StObject.set(x, "removeContact", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSelectionMode(value: ContactSelectionMode): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
    }
  }
  
  trait IContactRemovedEventArgs extends StObject {
    
    var id: String
  }
  object IContactRemovedEventArgs {
    
    @scala.inline
    def apply(id: String): IContactRemovedEventArgs = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[IContactRemovedEventArgs]
    }
    
    @scala.inline
    implicit class IContactRemovedEventArgsMutableBuilder[Self <: IContactRemovedEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
}
