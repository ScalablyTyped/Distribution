package typings.winrtUwp.Windows.ApplicationModel.Contacts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the ContactChanged event. */
@js.native
trait ContactChangedEventArgs extends StObject {
  
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
  implicit class ContactChangedEventArgsMutableBuilder[Self <: ContactChangedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetDeferral(value: () => ContactChangedDeferral): Self = StObject.set(x, "getDeferral", js.Any.fromFunction0(value))
  }
}
