package typings.vueTestUtils.anon

import typings.vueTestUtils.vueTestUtilsBooleans.`false`
import typings.vueTestUtils.vueTestUtilsBooleans.`true`
import typings.vueTestUtils.vueTestUtilsStrings.SVGEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `39` extends StObject {
  
  val bubbles: `true`
  
  val cancelable: `false`
  
  val eventInterface: SVGEvent
}
object `39` {
  
  inline def apply(): `39` = {
    val __obj = js.Dynamic.literal(bubbles = true, cancelable = false, eventInterface = "SVGEvent")
    __obj.asInstanceOf[`39`]
  }
  
  extension [Self <: `39`](x: Self) {
    
    inline def setBubbles(value: `true`): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
    
    inline def setCancelable(value: `false`): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    inline def setEventInterface(value: SVGEvent): Self = StObject.set(x, "eventInterface", value.asInstanceOf[js.Any])
  }
}
