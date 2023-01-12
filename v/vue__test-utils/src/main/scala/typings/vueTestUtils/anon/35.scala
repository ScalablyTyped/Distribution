package typings.vueTestUtils.anon

import typings.vueTestUtils.vueTestUtilsBooleans.`false`
import typings.vueTestUtils.vueTestUtilsStrings.PushEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `35` extends StObject {
  
  val bubbles: `false`
  
  val cancelable: `false`
  
  val eventInterface: PushEvent
}
object `35` {
  
  inline def apply(): `35` = {
    val __obj = js.Dynamic.literal(bubbles = false, cancelable = false, eventInterface = "PushEvent")
    __obj.asInstanceOf[`35`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `35`] (val x: Self) extends AnyVal {
    
    inline def setBubbles(value: `false`): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
    
    inline def setCancelable(value: `false`): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    inline def setEventInterface(value: PushEvent): Self = StObject.set(x, "eventInterface", value.asInstanceOf[js.Any])
  }
}
