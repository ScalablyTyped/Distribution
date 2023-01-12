package typings.winrtUwp.Windows.ApplicationModel.Email

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a deferred process that will halt a thread until the deferral is complete. */
trait EmailMailboxChangedDeferral extends StObject {
  
  /** Indicates to waiting processes that the deferral is complete. */
  def complete(): Unit
}
object EmailMailboxChangedDeferral {
  
  inline def apply(complete: () => Unit): EmailMailboxChangedDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[EmailMailboxChangedDeferral]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EmailMailboxChangedDeferral] (val x: Self) extends AnyVal {
    
    inline def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
  }
}
