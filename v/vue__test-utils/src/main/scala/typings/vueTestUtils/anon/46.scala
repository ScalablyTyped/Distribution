package typings.vueTestUtils.anon

import typings.vueTestUtils.vueTestUtilsBooleans.`true`
import typings.vueTestUtils.vueTestUtilsStrings.WheelEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `46` extends StObject {
  
  val bubbles: `true`
  
  val cancelable: `true`
  
  val eventInterface: WheelEvent
}
object `46` {
  
  inline def apply(): `46` = {
    val __obj = js.Dynamic.literal(bubbles = true, cancelable = true, eventInterface = "WheelEvent")
    __obj.asInstanceOf[`46`]
  }
  
  extension [Self <: `46`](x: Self) {
    
    inline def setBubbles(value: `true`): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
    
    inline def setCancelable(value: `true`): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    inline def setEventInterface(value: WheelEvent): Self = StObject.set(x, "eventInterface", value.asInstanceOf[js.Any])
  }
}
