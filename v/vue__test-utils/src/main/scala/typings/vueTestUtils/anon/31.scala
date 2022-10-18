package typings.vueTestUtils.anon

import typings.vueTestUtils.vueTestUtilsBooleans.`false`
import typings.vueTestUtils.vueTestUtilsStrings.PageTransitionEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `31` extends StObject {
  
  val bubbles: `false`
  
  val cancelable: `false`
  
  val eventInterface: PageTransitionEvent
}
object `31` {
  
  inline def apply(): `31` = {
    val __obj = js.Dynamic.literal(bubbles = false, cancelable = false, eventInterface = "PageTransitionEvent")
    __obj.asInstanceOf[`31`]
  }
  
  extension [Self <: `31`](x: Self) {
    
    inline def setBubbles(value: `false`): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
    
    inline def setCancelable(value: `false`): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    inline def setEventInterface(value: PageTransitionEvent): Self = StObject.set(x, "eventInterface", value.asInstanceOf[js.Any])
  }
}
