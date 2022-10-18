package typings.vueTestUtils.anon

import typings.vueTestUtils.vueTestUtilsBooleans.`false`
import typings.vueTestUtils.vueTestUtilsStrings.DeviceOrientationEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `9` extends StObject {
  
  val bubbles: `false`
  
  val cancelable: `false`
  
  val eventInterface: DeviceOrientationEvent
}
object `9` {
  
  inline def apply(): `9` = {
    val __obj = js.Dynamic.literal(bubbles = false, cancelable = false, eventInterface = "DeviceOrientationEvent")
    __obj.asInstanceOf[`9`]
  }
  
  extension [Self <: `9`](x: Self) {
    
    inline def setBubbles(value: `false`): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
    
    inline def setCancelable(value: `false`): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    inline def setEventInterface(value: DeviceOrientationEvent): Self = StObject.set(x, "eventInterface", value.asInstanceOf[js.Any])
  }
}
