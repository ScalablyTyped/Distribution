package typings.winrtUwp.Windows.ApplicationModel.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the ContactChanged event. */
@js.native
trait ContactChangedEventArgs extends js.Object {
  
  /**
    * Gets the ContactChangedDeferral object to use for asynchronous operations.
    * @return The deferral object to use for asynchronous operations.
    */
  def getDeferral(): ContactChangedDeferral = js.native
}
object ContactChangedEventArgs {
  
  @scala.inline
  def apply(getDeferral: () => ContactChangedDeferral): ContactChangedEventArgs = {
    val __obj = js.Dynamic.literal(getDeferral = js.Any.fromFunction0(getDeferral))
    __obj.asInstanceOf[ContactChangedEventArgs]
  }
  
  @scala.inline
  implicit class ContactChangedEventArgsOps[Self <: ContactChangedEventArgs] (val x: Self) extends AnyVal {
    
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
    def setGetDeferral(value: () => ContactChangedDeferral): Self = this.set("getDeferral", js.Any.fromFunction0(value))
  }
}
