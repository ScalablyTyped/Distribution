package typings.winrtUwp.Windows.Media.Devices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains information for the DialRequested event. */
trait DialRequestedEventArgs extends StObject {
  
  /** Returns the contact that was dialed. */
  var contact: js.Any
  
  /** Indicates that the DialRequested event has been handled. */
  def handled(): Unit
}
object DialRequestedEventArgs {
  
  inline def apply(contact: js.Any, handled: () => Unit): DialRequestedEventArgs = {
    val __obj = js.Dynamic.literal(contact = contact.asInstanceOf[js.Any], handled = js.Any.fromFunction0(handled))
    __obj.asInstanceOf[DialRequestedEventArgs]
  }
  
  extension [Self <: DialRequestedEventArgs](x: Self) {
    
    inline def setContact(value: js.Any): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
    
    inline def setHandled(value: () => Unit): Self = StObject.set(x, "handled", js.Any.fromFunction0(value))
  }
}
