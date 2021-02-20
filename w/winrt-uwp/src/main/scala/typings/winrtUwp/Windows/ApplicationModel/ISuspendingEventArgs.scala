package typings.winrtUwp.Windows.ApplicationModel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for an app suspending event. */
@js.native
trait ISuspendingEventArgs extends StObject {
  
  /** Gets the app suspending operation. */
  var suspendingOperation: SuspendingOperation = js.native
}
object ISuspendingEventArgs {
  
  @scala.inline
  def apply(suspendingOperation: SuspendingOperation): ISuspendingEventArgs = {
    val __obj = js.Dynamic.literal(suspendingOperation = suspendingOperation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISuspendingEventArgs]
  }
  
  @scala.inline
  implicit class ISuspendingEventArgsMutableBuilder[Self <: ISuspendingEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSuspendingOperation(value: SuspendingOperation): Self = StObject.set(x, "suspendingOperation", value.asInstanceOf[js.Any])
  }
}
