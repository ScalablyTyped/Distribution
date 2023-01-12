package typings.winrtUwp.Windows.Graphics.Printing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Used to defer the request for a print task. */
trait PrintTaskRequestedDeferral extends StObject {
  
  /** Indicates when the deferral for the print task request is over. */
  def complete(): Unit
}
object PrintTaskRequestedDeferral {
  
  inline def apply(complete: () => Unit): PrintTaskRequestedDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[PrintTaskRequestedDeferral]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PrintTaskRequestedDeferral] (val x: Self) extends AnyVal {
    
    inline def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
  }
}
