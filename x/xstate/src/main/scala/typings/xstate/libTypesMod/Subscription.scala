package typings.xstate.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Subscription extends StObject {
  
  def unsubscribe(): Unit
}
object Subscription {
  
  inline def apply(unsubscribe: () => Unit): Subscription = {
    val __obj = js.Dynamic.literal(unsubscribe = js.Any.fromFunction0(unsubscribe))
    __obj.asInstanceOf[Subscription]
  }
  
  extension [Self <: Subscription](x: Self) {
    
    inline def setUnsubscribe(value: () => Unit): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction0(value))
  }
}
