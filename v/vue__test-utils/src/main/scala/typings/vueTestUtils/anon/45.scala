package typings.vueTestUtils.anon

import typings.vueTestUtils.vueTestUtilsBooleans.`false`
import typings.vueTestUtils.vueTestUtilsStrings.UserProximityEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `45` extends StObject {
  
  val bubbles: `false`
  
  val cancelable: `false`
  
  val eventInterface: UserProximityEvent
}
object `45` {
  
  inline def apply(): `45` = {
    val __obj = js.Dynamic.literal(bubbles = false, cancelable = false, eventInterface = "UserProximityEvent")
    __obj.asInstanceOf[`45`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `45`] (val x: Self) extends AnyVal {
    
    inline def setBubbles(value: `false`): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
    
    inline def setCancelable(value: `false`): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    inline def setEventInterface(value: UserProximityEvent): Self = StObject.set(x, "eventInterface", value.asInstanceOf[js.Any])
  }
}
