package typings.vueTestUtils.anon

import typings.vueTestUtils.vueTestUtilsBooleans.`false`
import typings.vueTestUtils.vueTestUtilsBooleans.`true`
import typings.vueTestUtils.vueTestUtilsStrings.CompositionEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `5` extends StObject {
  
  val bubbles: `true`
  
  val cancelable: `false`
  
  val eventInterface: CompositionEvent
}
object `5` {
  
  inline def apply(): `5` = {
    val __obj = js.Dynamic.literal(bubbles = true, cancelable = false, eventInterface = "CompositionEvent")
    __obj.asInstanceOf[`5`]
  }
  
  extension [Self <: `5`](x: Self) {
    
    inline def setBubbles(value: `true`): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
    
    inline def setCancelable(value: `false`): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    inline def setEventInterface(value: CompositionEvent): Self = StObject.set(x, "eventInterface", value.asInstanceOf[js.Any])
  }
}
