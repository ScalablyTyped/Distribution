package typings.vueTestUtils.anon

import typings.vueTestUtils.vueTestUtilsBooleans.`false`
import typings.vueTestUtils.vueTestUtilsBooleans.`true`
import typings.vueTestUtils.vueTestUtilsStrings.PopStateEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `34` extends StObject {
  
  val bubbles: `true`
  
  val cancelable: `false`
  
  val eventInterface: PopStateEvent
}
object `34` {
  
  inline def apply(): `34` = {
    val __obj = js.Dynamic.literal(bubbles = true, cancelable = false, eventInterface = "PopStateEvent")
    __obj.asInstanceOf[`34`]
  }
  
  extension [Self <: `34`](x: Self) {
    
    inline def setBubbles(value: `true`): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
    
    inline def setCancelable(value: `false`): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    inline def setEventInterface(value: PopStateEvent): Self = StObject.set(x, "eventInterface", value.asInstanceOf[js.Any])
  }
}
