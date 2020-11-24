package typings.winrtUwp.Windows.ApplicationModel.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a delayed data loader for a contact card. */
@js.native
trait ContactCardDelayedDataLoader extends js.Object {
  
  /** Closes the delayed data loader. This informs the contact card to complete the UI (for example, remove any progress indications, like the progress bar) because no more updates to the contact card UI will be requested. The user then can determine that the contact data shown in the UI is complete. */
  def close(): Unit = js.native
  
  /**
    * Updates the contact card with the Contact object and completes the contact card UI.
    * @param contact The contact to update the contact card with.
    */
  def setData(contact: Contact): Unit = js.native
}
object ContactCardDelayedDataLoader {
  
  @scala.inline
  def apply(close: () => Unit, setData: Contact => Unit): ContactCardDelayedDataLoader = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), setData = js.Any.fromFunction1(setData))
    __obj.asInstanceOf[ContactCardDelayedDataLoader]
  }
  
  @scala.inline
  implicit class ContactCardDelayedDataLoaderOps[Self <: ContactCardDelayedDataLoader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClose(value: () => Unit): Self = this.set("close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetData(value: Contact => Unit): Self = this.set("setData", js.Any.fromFunction1(value))
  }
}
