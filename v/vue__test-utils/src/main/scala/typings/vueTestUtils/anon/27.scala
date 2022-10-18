package typings.vueTestUtils.anon

import typings.vueTestUtils.vueTestUtilsBooleans.`false`
import typings.vueTestUtils.vueTestUtilsStrings.MessageEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `27` extends StObject {
  
  val bubbles: `false`
  
  val cancelable: `false`
  
  val eventInterface: MessageEvent
}
object `27` {
  
  inline def apply(): `27` = {
    val __obj = js.Dynamic.literal(bubbles = false, cancelable = false, eventInterface = "MessageEvent")
    __obj.asInstanceOf[`27`]
  }
  
  extension [Self <: `27`](x: Self) {
    
    inline def setBubbles(value: `false`): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
    
    inline def setCancelable(value: `false`): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    inline def setEventInterface(value: MessageEvent): Self = StObject.set(x, "eventInterface", value.asInstanceOf[js.Any])
  }
}
