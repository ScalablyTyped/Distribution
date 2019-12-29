package typings.winrtDashUwp.Windows.ApplicationModel.Contacts

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Foundation.Collections.IVector
import typings.winrtDashUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtDashUwp.Windows.Foundation.EventHandler
import typings.winrtDashUwp.Windows.Foundation.TypedEventHandler
import typings.winrtDashUwp.Windows.WinRTEvent
import typings.winrtDashUwp.winrtDashUwpStrings.contactremoved
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Enables apps to create and remove contacts. */
@JSGlobal("Windows.ApplicationModel.Contacts.Provider")
@js.native
object Provider extends js.Object {
  @js.native
  sealed trait AddContactResult extends js.Object
  
  /** Allows you to call the contact picker UI so you can select one or more contacts. */
  @js.native
  abstract class ContactPickerUI () extends js.Object {
    /** Specifies the fields that you want returned after the user selects one or more contacts. */
    var desiredFields: IVectorView[String] = js.native
    /** Gets the fields with contact field type that you want returned after the user selects one or more contacts. */
    var desiredFieldsWithContactFieldType: IVector[ContactFieldType] = js.native
    /** Occurs when the user deselects or removes the contact. */
    @JSName("oncontactremoved")
    var oncontactremoved_Original: TypedEventHandler[ContactPickerUI, ContactRemovedEventArgs] = js.native
    /** Determines the selection mode for the contact picker. The most common options are PickSingleContactAsync or PickMultipleContactsAsync . */
    var selectionMode: ContactSelectionMode = js.native
    /**
      * Adds a Contact .
      * @param contact An object that contains the contact's information.
      * @return An AddContactResult -typed value that indicates whether the contact was added successfully.
      */
    def addContact(contact: Contact): AddContactResult = js.native
    /**
      * Adds a Contact .
      * @param id The ID for the contact.
      * @param contact An object that contains the contact's information.
      * @return An AddContactResult -typed value that indicates whether the contact was added successfully.
      */
    def addContact(id: String, contact: Contact): AddContactResult = js.native
    def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_contactremoved(`type`: contactremoved, listener: TypedEventHandler[ContactPickerUI, ContactRemovedEventArgs]): Unit = js.native
    /**
      * Checks to see whether the contact was already selected by the user.
      * @param id The ID of the contact.
      * @return True if the contact has already been selected; otherwise, false.
      */
    def containsContact(id: String): Boolean = js.native
    /** Occurs when the user deselects or removes the contact. */
    def oncontactremoved(ev: ContactRemovedEventArgs with WinRTEvent[ContactPickerUI]): Unit = js.native
    /**
      * Removes a contact.
      * @param id The ID of the contact to remove.
      */
    def removeContact(id: String): Unit = js.native
    def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_contactremoved(`type`: contactremoved, listener: TypedEventHandler[ContactPickerUI, ContactRemovedEventArgs]): Unit = js.native
  }
  
  /** Contains info about a removed contact. Returned when a ContactRemoved event occurs. */
  @js.native
  abstract class ContactRemovedEventArgs () extends js.Object {
    /** Contains a unique identifier for the contact. */
    var id: String = js.native
  }
  
  /** Indicates whether a contact was added successfully. */
  @js.native
  object AddContactResult extends js.Object {
    /** The contact was added. */
    @js.native
    sealed trait added extends AddContactResult
    
    /** The contact was already selected by the user. */
    @js.native
    sealed trait alreadyAdded extends AddContactResult
    
    /** The contact was unavailable and was not added. */
    @js.native
    sealed trait unavailable extends AddContactResult
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[AddContactResult with Double] = js.native
    /* 0 */ @js.native
    object added extends TopLevel[added with Double]
    
    /* 1 */ @js.native
    object alreadyAdded extends TopLevel[alreadyAdded with Double]
    
    /* 2 */ @js.native
    object unavailable extends TopLevel[unavailable with Double]
    
  }
  
}

