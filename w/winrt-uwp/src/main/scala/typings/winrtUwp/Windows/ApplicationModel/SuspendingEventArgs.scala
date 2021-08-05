package typings.winrtUwp.Windows.ApplicationModel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for an app suspending event. */
trait SuspendingEventArgs extends StObject {
  
  /** Gets the app suspending operation. */
  var suspendingOperation: SuspendingOperation
}
object SuspendingEventArgs {
  
  inline def apply(suspendingOperation: SuspendingOperation): SuspendingEventArgs = {
    val __obj = js.Dynamic.literal(suspendingOperation = suspendingOperation.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuspendingEventArgs]
  }
  
  extension [Self <: SuspendingEventArgs](x: Self) {
    
    inline def setSuspendingOperation(value: SuspendingOperation): Self = StObject.set(x, "suspendingOperation", value.asInstanceOf[js.Any])
  }
}
