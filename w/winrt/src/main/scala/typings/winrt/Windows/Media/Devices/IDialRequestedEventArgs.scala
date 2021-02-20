package typings.winrt.Windows.Media.Devices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDialRequestedEventArgs extends StObject {
  
  var contact: js.Any = js.native
  
  def handled(): Unit = js.native
}
object IDialRequestedEventArgs {
  
  @scala.inline
  def apply(contact: js.Any, handled: () => Unit): IDialRequestedEventArgs = {
    val __obj = js.Dynamic.literal(contact = contact.asInstanceOf[js.Any], handled = js.Any.fromFunction0(handled))
    __obj.asInstanceOf[IDialRequestedEventArgs]
  }
  
  @scala.inline
  implicit class IDialRequestedEventArgsMutableBuilder[Self <: IDialRequestedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContact(value: js.Any): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandled(value: () => Unit): Self = StObject.set(x, "handled", js.Any.fromFunction0(value))
  }
}
