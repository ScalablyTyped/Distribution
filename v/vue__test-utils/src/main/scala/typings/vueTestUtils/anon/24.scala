package typings.vueTestUtils.anon

import typings.vueTestUtils.vueTestUtilsBooleans.`true`
import typings.vueTestUtils.vueTestUtilsStrings.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `24` extends StObject {
  
  val bubbles: `true`
  
  val cancelable: `true`
  
  val eventInterface: KeyboardEvent
}
object `24` {
  
  inline def apply(): `24` = {
    val __obj = js.Dynamic.literal(bubbles = true, cancelable = true, eventInterface = "KeyboardEvent")
    __obj.asInstanceOf[`24`]
  }
  
  extension [Self <: `24`](x: Self) {
    
    inline def setBubbles(value: `true`): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
    
    inline def setCancelable(value: `true`): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    inline def setEventInterface(value: KeyboardEvent): Self = StObject.set(x, "eventInterface", value.asInstanceOf[js.Any])
  }
}
