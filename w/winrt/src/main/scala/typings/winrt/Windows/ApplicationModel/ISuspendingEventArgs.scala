package typings.winrt.Windows.ApplicationModel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISuspendingEventArgs extends StObject {
  
  var suspendingOperation: SuspendingOperation
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
