package typings.stripeV3.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreventDefault extends StObject {
  
  def preventDefault(): Unit
}
object PreventDefault {
  
  inline def apply(preventDefault: () => Unit): PreventDefault = {
    val __obj = js.Dynamic.literal(preventDefault = js.Any.fromFunction0(preventDefault))
    __obj.asInstanceOf[PreventDefault]
  }
  
  extension [Self <: PreventDefault](x: Self) {
    
    inline def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
  }
}
