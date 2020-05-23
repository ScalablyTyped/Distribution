package typings.winrtUwp.global.Windows.ApplicationModel.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a delayed data loader for a contact card. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactCardDelayedDataLoader")
@js.native
abstract class ContactCardDelayedDataLoader ()
  extends typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactCardDelayedDataLoader {
  /** Closes the delayed data loader. This informs the contact card to complete the UI (for example, remove any progress indications, like the progress bar) because no more updates to the contact card UI will be requested. The user then can determine that the contact data shown in the UI is complete. */
  /* CompleteClass */
  override def close(): Unit = js.native
  /**
    * Updates the contact card with the Contact object and completes the contact card UI.
    * @param contact The contact to update the contact card with.
    */
  /* CompleteClass */
  override def setData(contact: typings.winrtUwp.Windows.ApplicationModel.Contacts.Contact): Unit = js.native
}

