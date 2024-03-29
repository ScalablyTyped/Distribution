package typings.winrtUwp.Windows.UI.WebUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for an app suspension event. */
trait SuspendingEventArgs extends StObject {
  
  /** Gets the app suspension operation. */
  var suspendingOperation: typings.winrtUwp.Windows.ApplicationModel.SuspendingOperation
}
object SuspendingEventArgs {
  
  inline def apply(suspendingOperation: typings.winrtUwp.Windows.ApplicationModel.SuspendingOperation): SuspendingEventArgs = {
    val __obj = js.Dynamic.literal(suspendingOperation = suspendingOperation.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuspendingEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SuspendingEventArgs] (val x: Self) extends AnyVal {
    
    inline def setSuspendingOperation(value: typings.winrtUwp.Windows.ApplicationModel.SuspendingOperation): Self = StObject.set(x, "suspendingOperation", value.asInstanceOf[js.Any])
  }
}
