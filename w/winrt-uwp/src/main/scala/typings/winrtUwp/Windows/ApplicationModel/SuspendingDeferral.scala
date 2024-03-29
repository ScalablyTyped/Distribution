package typings.winrtUwp.Windows.ApplicationModel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Manages a delayed app suspending operation. */
trait SuspendingDeferral extends StObject {
  
  /** Notifies the operating system that the app has saved its data and is ready to be suspended. */
  def complete(): Unit
}
object SuspendingDeferral {
  
  inline def apply(complete: () => Unit): SuspendingDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[SuspendingDeferral]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SuspendingDeferral] (val x: Self) extends AnyVal {
    
    inline def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
  }
}
