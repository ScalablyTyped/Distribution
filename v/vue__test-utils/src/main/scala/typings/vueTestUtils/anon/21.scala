package typings.vueTestUtils.anon

import typings.vueTestUtils.vueTestUtilsBooleans.`false`
import typings.vueTestUtils.vueTestUtilsStrings.PointerEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `21` extends StObject {
  
  val bubbles: `false`
  
  val cancelable: `false`
  
  val eventInterface: PointerEvent
}
object `21` {
  
  inline def apply(): `21` = {
    val __obj = js.Dynamic.literal(bubbles = false, cancelable = false, eventInterface = "PointerEvent")
    __obj.asInstanceOf[`21`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `21`] (val x: Self) extends AnyVal {
    
    inline def setBubbles(value: `false`): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
    
    inline def setCancelable(value: `false`): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    inline def setEventInterface(value: PointerEvent): Self = StObject.set(x, "eventInterface", value.asInstanceOf[js.Any])
  }
}
