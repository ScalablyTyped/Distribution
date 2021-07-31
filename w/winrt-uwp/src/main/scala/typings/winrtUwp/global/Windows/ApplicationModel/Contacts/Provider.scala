package typings.winrtUwp.global.Windows.ApplicationModel.Contacts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Enables apps to create and remove contacts. */
object Provider {
  
  /** Indicates whether a contact was added successfully. */
  @JSGlobal("Windows.ApplicationModel.Contacts.Provider.AddContactResult")
  @js.native
  object AddContactResult extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.ApplicationModel.Contacts.Provider.AddContactResult & Double
      ] = js.native
    
    /* 0 */ val added: typings.winrtUwp.Windows.ApplicationModel.Contacts.Provider.AddContactResult.added & Double = js.native
    
    /* 1 */ val alreadyAdded: typings.winrtUwp.Windows.ApplicationModel.Contacts.Provider.AddContactResult.alreadyAdded & Double = js.native
    
    /* 2 */ val unavailable: typings.winrtUwp.Windows.ApplicationModel.Contacts.Provider.AddContactResult.unavailable & Double = js.native
  }
  
  /** Allows you to call the contact picker UI so you can select one or more contacts. */
  @JSGlobal("Windows.ApplicationModel.Contacts.Provider.ContactPickerUI")
  @js.native
  abstract class ContactPickerUI ()
    extends StObject
       with typings.winrtUwp.Windows.ApplicationModel.Contacts.Provider.ContactPickerUI
  
  /** Contains info about a removed contact. Returned when a ContactRemoved event occurs. */
  @JSGlobal("Windows.ApplicationModel.Contacts.Provider.ContactRemovedEventArgs")
  @js.native
  abstract class ContactRemovedEventArgs ()
    extends StObject
       with typings.winrtUwp.Windows.ApplicationModel.Contacts.Provider.ContactRemovedEventArgs {
    
    /** Contains a unique identifier for the contact. */
    /* CompleteClass */
    var id: String = js.native
  }
}
