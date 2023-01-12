package typings.winrtUwp.Windows.Media.PlayTo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a deferred operation when you're supplying a source media element for Play To. */
trait PlayToSourceDeferral extends StObject {
  
  /** Ends the deferral. */
  def complete(): Unit
}
object PlayToSourceDeferral {
  
  inline def apply(complete: () => Unit): PlayToSourceDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[PlayToSourceDeferral]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlayToSourceDeferral] (val x: Self) extends AnyVal {
    
    inline def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
  }
}
