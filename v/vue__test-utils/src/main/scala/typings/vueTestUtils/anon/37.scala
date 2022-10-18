package typings.vueTestUtils.anon

import typings.vueTestUtils.vueTestUtilsBooleans.`false`
import typings.vueTestUtils.vueTestUtilsBooleans.`true`
import typings.vueTestUtils.vueTestUtilsStrings.UIEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `37` extends StObject {
  
  val bubbles: `true`
  
  val cancelable: `false`
  
  val eventInterface: UIEvent
}
object `37` {
  
  inline def apply(): `37` = {
    val __obj = js.Dynamic.literal(bubbles = true, cancelable = false, eventInterface = "UIEvent")
    __obj.asInstanceOf[`37`]
  }
  
  extension [Self <: `37`](x: Self) {
    
    inline def setBubbles(value: `true`): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
    
    inline def setCancelable(value: `false`): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    inline def setEventInterface(value: UIEvent): Self = StObject.set(x, "eventInterface", value.asInstanceOf[js.Any])
  }
}
