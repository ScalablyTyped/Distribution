package typings.vueTestUtils.anon

import typings.vueTestUtils.vueTestUtilsBooleans.`false`
import typings.vueTestUtils.vueTestUtilsStrings.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bubbles extends StObject {
  
  val bubbles: `false`
  
  val cancelable: `false`
  
  val eventInterface: Event
}
object Bubbles {
  
  inline def apply(): Bubbles = {
    val __obj = js.Dynamic.literal(bubbles = false, cancelable = false, eventInterface = "Event")
    __obj.asInstanceOf[Bubbles]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Bubbles] (val x: Self) extends AnyVal {
    
    inline def setBubbles(value: `false`): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
    
    inline def setCancelable(value: `false`): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    inline def setEventInterface(value: Event): Self = StObject.set(x, "eventInterface", value.asInstanceOf[js.Any])
  }
}
