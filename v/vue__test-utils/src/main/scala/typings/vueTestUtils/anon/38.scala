package typings.vueTestUtils.anon

import typings.vueTestUtils.vueTestUtilsBooleans.`false`
import typings.vueTestUtils.vueTestUtilsStrings.StorageEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `38` extends StObject {
  
  val bubbles: `false`
  
  val cancelable: `false`
  
  val eventInterface: StorageEvent
}
object `38` {
  
  inline def apply(): `38` = {
    val __obj = js.Dynamic.literal(bubbles = false, cancelable = false, eventInterface = "StorageEvent")
    __obj.asInstanceOf[`38`]
  }
  
  extension [Self <: `38`](x: Self) {
    
    inline def setBubbles(value: `false`): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
    
    inline def setCancelable(value: `false`): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    inline def setEventInterface(value: StorageEvent): Self = StObject.set(x, "eventInterface", value.asInstanceOf[js.Any])
  }
}
