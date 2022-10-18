package typings.vueTestUtils.anon

import typings.vueTestUtils.vueTestUtilsBooleans.`false`
import typings.vueTestUtils.vueTestUtilsStrings.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `28` extends StObject {
  
  val bubbles: `false`
  
  val cancelable: `false`
  
  val eventInterface: MouseEvent
}
object `28` {
  
  inline def apply(): `28` = {
    val __obj = js.Dynamic.literal(bubbles = false, cancelable = false, eventInterface = "MouseEvent")
    __obj.asInstanceOf[`28`]
  }
  
  extension [Self <: `28`](x: Self) {
    
    inline def setBubbles(value: `false`): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
    
    inline def setCancelable(value: `false`): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    inline def setEventInterface(value: MouseEvent): Self = StObject.set(x, "eventInterface", value.asInstanceOf[js.Any])
  }
}
