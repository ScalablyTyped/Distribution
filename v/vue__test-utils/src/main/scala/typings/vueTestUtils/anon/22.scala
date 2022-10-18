package typings.vueTestUtils.anon

import typings.vueTestUtils.vueTestUtilsBooleans.`false`
import typings.vueTestUtils.vueTestUtilsBooleans.`true`
import typings.vueTestUtils.vueTestUtilsStrings.HashChangeEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `22` extends StObject {
  
  val bubbles: `true`
  
  val cancelable: `false`
  
  val eventInterface: HashChangeEvent
}
object `22` {
  
  inline def apply(): `22` = {
    val __obj = js.Dynamic.literal(bubbles = true, cancelable = false, eventInterface = "HashChangeEvent")
    __obj.asInstanceOf[`22`]
  }
  
  extension [Self <: `22`](x: Self) {
    
    inline def setBubbles(value: `true`): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
    
    inline def setCancelable(value: `false`): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    inline def setEventInterface(value: HashChangeEvent): Self = StObject.set(x, "eventInterface", value.asInstanceOf[js.Any])
  }
}
