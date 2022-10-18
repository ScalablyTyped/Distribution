package typings.vueTestUtils.anon

import typings.vueTestUtils.vueTestUtilsBooleans.`false`
import typings.vueTestUtils.vueTestUtilsStrings.UIEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `25` extends StObject {
  
  val bubbles: `false`
  
  val cancelable: `false`
  
  val eventInterface: UIEvent
}
object `25` {
  
  inline def apply(): `25` = {
    val __obj = js.Dynamic.literal(bubbles = false, cancelable = false, eventInterface = "UIEvent")
    __obj.asInstanceOf[`25`]
  }
  
  extension [Self <: `25`](x: Self) {
    
    inline def setBubbles(value: `false`): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
    
    inline def setCancelable(value: `false`): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    inline def setEventInterface(value: UIEvent): Self = StObject.set(x, "eventInterface", value.asInstanceOf[js.Any])
  }
}
