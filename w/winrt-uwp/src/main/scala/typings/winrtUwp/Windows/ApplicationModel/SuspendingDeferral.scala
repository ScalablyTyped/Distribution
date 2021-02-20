package typings.winrtUwp.Windows.ApplicationModel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Manages a delayed app suspending operation. */
@js.native
trait SuspendingDeferral extends StObject {
  
  /** Notifies the operating system that the app has saved its data and is ready to be suspended. */
  def complete(): Unit = js.native
}
object SuspendingDeferral {
  
  @scala.inline
  def apply(complete: () => Unit): SuspendingDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[SuspendingDeferral]
  }
  
  @scala.inline
  implicit class SuspendingDeferralMutableBuilder[Self <: SuspendingDeferral] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
  }
}
