package typings.vueTestUtils.anon

import typings.vueTestUtils.vueTestUtilsBooleans.`false`
import typings.vueTestUtils.vueTestUtilsStrings.GamepadEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `20` extends StObject {
  
  val bubbles: `false`
  
  val cancelable: `false`
  
  val eventInterface: GamepadEvent
}
object `20` {
  
  inline def apply(): `20` = {
    val __obj = js.Dynamic.literal(bubbles = false, cancelable = false, eventInterface = "GamepadEvent")
    __obj.asInstanceOf[`20`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `20`] (val x: Self) extends AnyVal {
    
    inline def setBubbles(value: `false`): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
    
    inline def setCancelable(value: `false`): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    inline def setEventInterface(value: GamepadEvent): Self = StObject.set(x, "eventInterface", value.asInstanceOf[js.Any])
  }
}
