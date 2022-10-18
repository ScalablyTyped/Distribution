package typings.vueTestUtils.anon

import typings.vueTestUtils.vueTestUtilsBooleans.`true`
import typings.vueTestUtils.vueTestUtilsStrings.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `43` extends StObject {
  
  val bubbles: `true`
  
  val cancelable: `true`
  
  val eventInterface: TouchEvent
}
object `43` {
  
  inline def apply(): `43` = {
    val __obj = js.Dynamic.literal(bubbles = true, cancelable = true, eventInterface = "TouchEvent")
    __obj.asInstanceOf[`43`]
  }
  
  extension [Self <: `43`](x: Self) {
    
    inline def setBubbles(value: `true`): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
    
    inline def setCancelable(value: `true`): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    inline def setEventInterface(value: TouchEvent): Self = StObject.set(x, "eventInterface", value.asInstanceOf[js.Any])
  }
}
