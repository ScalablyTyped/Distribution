package typings.winrtUwp.Windows.Foundation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Stores a DeferralCompletedHandler to be invoked upon completion of the deferral and manipulates the state of the deferral. */
trait Deferral extends StObject {
  
  /** If the DeferralCompletedHandler has not yet been invoked, this will call it and drop the reference to the delegate. */
  def close(): Unit
  
  /** If the DeferralCompletedHandler has not yet been invoked, this will call it and drop the reference to the delegate. */
  def complete(): Unit
}
object Deferral {
  
  inline def apply(close: () => Unit, complete: () => Unit): Deferral = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[Deferral]
  }
  
  extension [Self <: Deferral](x: Self) {
    
    inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    inline def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
  }
}
