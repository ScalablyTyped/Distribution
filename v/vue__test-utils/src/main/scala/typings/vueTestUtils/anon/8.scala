package typings.vueTestUtils.anon

import typings.vueTestUtils.vueTestUtilsBooleans.`false`
import typings.vueTestUtils.vueTestUtilsStrings.DeviceMotionEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `8` extends StObject {
  
  val bubbles: `false`
  
  val cancelable: `false`
  
  val eventInterface: DeviceMotionEvent
}
object `8` {
  
  inline def apply(): `8` = {
    val __obj = js.Dynamic.literal(bubbles = false, cancelable = false, eventInterface = "DeviceMotionEvent")
    __obj.asInstanceOf[`8`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `8`] (val x: Self) extends AnyVal {
    
    inline def setBubbles(value: `false`): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
    
    inline def setCancelable(value: `false`): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    inline def setEventInterface(value: DeviceMotionEvent): Self = StObject.set(x, "eventInterface", value.asInstanceOf[js.Any])
  }
}
