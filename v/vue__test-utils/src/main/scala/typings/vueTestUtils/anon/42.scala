package typings.vueTestUtils.anon

import typings.vueTestUtils.vueTestUtilsBooleans.`false`
import typings.vueTestUtils.vueTestUtilsBooleans.`true`
import typings.vueTestUtils.vueTestUtilsStrings.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `42` extends StObject {
  
  val bubbles: `true`
  
  val cancelable: `false`
  
  val eventInterface: TouchEvent
}
object `42` {
  
  inline def apply(): `42` = {
    val __obj = js.Dynamic.literal(bubbles = true, cancelable = false, eventInterface = "TouchEvent")
    __obj.asInstanceOf[`42`]
  }
  
  extension [Self <: `42`](x: Self) {
    
    inline def setBubbles(value: `true`): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
    
    inline def setCancelable(value: `false`): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    inline def setEventInterface(value: TouchEvent): Self = StObject.set(x, "eventInterface", value.asInstanceOf[js.Any])
  }
}
