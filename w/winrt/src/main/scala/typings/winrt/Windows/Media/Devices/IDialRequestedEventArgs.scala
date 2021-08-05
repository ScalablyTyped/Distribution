package typings.winrt.Windows.Media.Devices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDialRequestedEventArgs extends StObject {
  
  var contact: js.Any
  
  def handled(): Unit
}
object IDialRequestedEventArgs {
  
  inline def apply(contact: js.Any, handled: () => Unit): IDialRequestedEventArgs = {
    val __obj = js.Dynamic.literal(contact = contact.asInstanceOf[js.Any], handled = js.Any.fromFunction0(handled))
    __obj.asInstanceOf[IDialRequestedEventArgs]
  }
  
  extension [Self <: IDialRequestedEventArgs](x: Self) {
    
    inline def setContact(value: js.Any): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
    
    inline def setHandled(value: () => Unit): Self = StObject.set(x, "handled", js.Any.fromFunction0(value))
  }
}
