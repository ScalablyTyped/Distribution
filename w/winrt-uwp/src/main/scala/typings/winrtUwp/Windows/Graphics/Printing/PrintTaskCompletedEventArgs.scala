package typings.winrtUwp.Windows.Graphics.Printing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Reports the completion of the print task. */
trait PrintTaskCompletedEventArgs extends StObject {
  
  /** Gets the completion status of the print task. */
  var completion: PrintTaskCompletion
}
object PrintTaskCompletedEventArgs {
  
  inline def apply(completion: PrintTaskCompletion): PrintTaskCompletedEventArgs = {
    val __obj = js.Dynamic.literal(completion = completion.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintTaskCompletedEventArgs]
  }
  
  extension [Self <: PrintTaskCompletedEventArgs](x: Self) {
    
    inline def setCompletion(value: PrintTaskCompletion): Self = StObject.set(x, "completion", value.asInstanceOf[js.Any])
  }
}
