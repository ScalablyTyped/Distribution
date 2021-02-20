package typings.winrtUwp.Windows.Media.Devices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains information for the DialRequested event. */
@js.native
trait DialRequestedEventArgs extends StObject {
  
  /** Returns the contact that was dialed. */
  var contact: js.Any = js.native
  
  /** Indicates that the DialRequested event has been handled. */
  def handled(): Unit = js.native
}
object DialRequestedEventArgs {
  
  @scala.inline
  def apply(contact: js.Any, handled: () => Unit): DialRequestedEventArgs = {
    val __obj = js.Dynamic.literal(contact = contact.asInstanceOf[js.Any], handled = js.Any.fromFunction0(handled))
    __obj.asInstanceOf[DialRequestedEventArgs]
  }
  
  @scala.inline
  implicit class DialRequestedEventArgsMutableBuilder[Self <: DialRequestedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContact(value: js.Any): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandled(value: () => Unit): Self = StObject.set(x, "handled", js.Any.fromFunction0(value))
  }
}
