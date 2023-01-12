package typings.vueTestUtils.anon

import typings.vueTestUtils.vueTestUtilsBooleans.`false`
import typings.vueTestUtils.vueTestUtilsStrings.NotificationEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `30` extends StObject {
  
  val bubbles: `false`
  
  val cancelable: `false`
  
  val eventInterface: NotificationEvent
}
object `30` {
  
  inline def apply(): `30` = {
    val __obj = js.Dynamic.literal(bubbles = false, cancelable = false, eventInterface = "NotificationEvent")
    __obj.asInstanceOf[`30`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `30`] (val x: Self) extends AnyVal {
    
    inline def setBubbles(value: `false`): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
    
    inline def setCancelable(value: `false`): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    inline def setEventInterface(value: NotificationEvent): Self = StObject.set(x, "eventInterface", value.asInstanceOf[js.Any])
  }
}
