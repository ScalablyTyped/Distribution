package typings.winrt.Windows.Media.Devices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRedialRequestedEventArgs extends StObject {
  
  def handled(): Unit
}
object IRedialRequestedEventArgs {
  
  inline def apply(handled: () => Unit): IRedialRequestedEventArgs = {
    val __obj = js.Dynamic.literal(handled = js.Any.fromFunction0(handled))
    __obj.asInstanceOf[IRedialRequestedEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IRedialRequestedEventArgs] (val x: Self) extends AnyVal {
    
    inline def setHandled(value: () => Unit): Self = StObject.set(x, "handled", js.Any.fromFunction0(value))
  }
}
