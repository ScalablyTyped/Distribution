package typings.tuyaPanelKit.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultPrevented extends StObject {
  
  /**
    * Whether `event.preventDefault()` was called on this event object.
    */
  val defaultPrevented: Boolean
  
  /**
    * Prevent the default action which happens on this event.
    */
  def preventDefault(): Unit
}
object DefaultPrevented {
  
  @scala.inline
  def apply(defaultPrevented: Boolean, preventDefault: () => Unit): DefaultPrevented = {
    val __obj = js.Dynamic.literal(defaultPrevented = defaultPrevented.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault))
    __obj.asInstanceOf[DefaultPrevented]
  }
  
  @scala.inline
  implicit class DefaultPreventedMutableBuilder[Self <: DefaultPrevented] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultPrevented(value: Boolean): Self = StObject.set(x, "defaultPrevented", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
  }
}
