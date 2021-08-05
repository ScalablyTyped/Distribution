package typings.winrtUwp.Windows.Graphics.Printing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Used to defer the request for a print task source. */
trait PrintTaskSourceRequestedDeferral extends StObject {
  
  /** Indicates when the deferral for a print task source request is over. */
  def complete(): Unit
}
object PrintTaskSourceRequestedDeferral {
  
  inline def apply(complete: () => Unit): PrintTaskSourceRequestedDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[PrintTaskSourceRequestedDeferral]
  }
  
  extension [Self <: PrintTaskSourceRequestedDeferral](x: Self) {
    
    inline def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
  }
}
