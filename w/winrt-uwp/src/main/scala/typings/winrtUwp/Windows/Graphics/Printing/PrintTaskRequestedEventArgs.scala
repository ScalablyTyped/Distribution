package typings.winrtUwp.Windows.Graphics.Printing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Event arguments associated with the PrintTaskRequest . */
@js.native
trait PrintTaskRequestedEventArgs extends StObject {
  
  /** Gets the PrintTaskRequest object for a print task. */
  var request: PrintTaskRequest = js.native
}
object PrintTaskRequestedEventArgs {
  
  @scala.inline
  def apply(request: PrintTaskRequest): PrintTaskRequestedEventArgs = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintTaskRequestedEventArgs]
  }
  
  @scala.inline
  implicit class PrintTaskRequestedEventArgsMutableBuilder[Self <: PrintTaskRequestedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequest(value: PrintTaskRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
