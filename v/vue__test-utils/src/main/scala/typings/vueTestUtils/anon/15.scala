package typings.vueTestUtils.anon

import typings.vueTestUtils.vueTestUtilsBooleans.`true`
import typings.vueTestUtils.vueTestUtilsStrings.FocusEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `15` extends StObject {
  
  val bubbles: `true`
  
  val cancelable: `true`
  
  val eventInterface: FocusEvent
}
object `15` {
  
  inline def apply(): `15` = {
    val __obj = js.Dynamic.literal(bubbles = true, cancelable = true, eventInterface = "FocusEvent")
    __obj.asInstanceOf[`15`]
  }
  
  extension [Self <: `15`](x: Self) {
    
    inline def setBubbles(value: `true`): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
    
    inline def setCancelable(value: `true`): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    inline def setEventInterface(value: FocusEvent): Self = StObject.set(x, "eventInterface", value.asInstanceOf[js.Any])
  }
}
