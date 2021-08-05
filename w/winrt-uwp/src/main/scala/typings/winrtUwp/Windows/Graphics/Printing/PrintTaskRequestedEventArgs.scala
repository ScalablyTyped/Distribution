package typings.winrtUwp.Windows.Graphics.Printing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Event arguments associated with the PrintTaskRequest . */
trait PrintTaskRequestedEventArgs extends StObject {
  
  /** Gets the PrintTaskRequest object for a print task. */
  var request: PrintTaskRequest
}
object PrintTaskRequestedEventArgs {
  
  inline def apply(request: PrintTaskRequest): PrintTaskRequestedEventArgs = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintTaskRequestedEventArgs]
  }
  
  extension [Self <: PrintTaskRequestedEventArgs](x: Self) {
    
    inline def setRequest(value: PrintTaskRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
