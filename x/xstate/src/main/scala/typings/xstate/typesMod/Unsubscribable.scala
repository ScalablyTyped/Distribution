package typings.xstate.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Unsubscribable extends StObject {
  
  def unsubscribe(): Unit
}
object Unsubscribable {
  
  @scala.inline
  def apply(unsubscribe: () => Unit): Unsubscribable = {
    val __obj = js.Dynamic.literal(unsubscribe = js.Any.fromFunction0(unsubscribe))
    __obj.asInstanceOf[Unsubscribable]
  }
  
  @scala.inline
  implicit class UnsubscribableMutableBuilder[Self <: Unsubscribable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUnsubscribe(value: () => Unit): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction0(value))
  }
}
