package typings.vueTestUtils.anon

import typings.vueTestUtils.vueTestUtilsBooleans.`true`
import typings.vueTestUtils.vueTestUtilsStrings.DragEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `17` extends StObject {
  
  val bubbles: `true`
  
  val cancelable: `true`
  
  val eventInterface: DragEvent
}
object `17` {
  
  inline def apply(): `17` = {
    val __obj = js.Dynamic.literal(bubbles = true, cancelable = true, eventInterface = "DragEvent")
    __obj.asInstanceOf[`17`]
  }
  
  extension [Self <: `17`](x: Self) {
    
    inline def setBubbles(value: `true`): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
    
    inline def setCancelable(value: `true`): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    inline def setEventInterface(value: DragEvent): Self = StObject.set(x, "eventInterface", value.asInstanceOf[js.Any])
  }
}
