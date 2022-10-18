package typings.vueTestUtils.anon

import typings.vueTestUtils.vueTestUtilsBooleans.`false`
import typings.vueTestUtils.vueTestUtilsBooleans.`true`
import typings.vueTestUtils.vueTestUtilsStrings.DragEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `18` extends StObject {
  
  val bubbles: `true`
  
  val cancelable: `false`
  
  val eventInterface: DragEvent
}
object `18` {
  
  inline def apply(): `18` = {
    val __obj = js.Dynamic.literal(bubbles = true, cancelable = false, eventInterface = "DragEvent")
    __obj.asInstanceOf[`18`]
  }
  
  extension [Self <: `18`](x: Self) {
    
    inline def setBubbles(value: `true`): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
    
    inline def setCancelable(value: `false`): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    inline def setEventInterface(value: DragEvent): Self = StObject.set(x, "eventInterface", value.asInstanceOf[js.Any])
  }
}
