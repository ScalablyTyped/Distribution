package typings.vueTestUtils.anon

import typings.vueTestUtils.vueTestUtilsBooleans.`true`
import typings.vueTestUtils.vueTestUtilsStrings.TransitionEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `44` extends StObject {
  
  val bubbles: `true`
  
  val cancelable: `true`
  
  val eventInterface: TransitionEvent
}
object `44` {
  
  inline def apply(): `44` = {
    val __obj = js.Dynamic.literal(bubbles = true, cancelable = true, eventInterface = "TransitionEvent")
    __obj.asInstanceOf[`44`]
  }
  
  extension [Self <: `44`](x: Self) {
    
    inline def setBubbles(value: `true`): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
    
    inline def setCancelable(value: `true`): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    inline def setEventInterface(value: TransitionEvent): Self = StObject.set(x, "eventInterface", value.asInstanceOf[js.Any])
  }
}
