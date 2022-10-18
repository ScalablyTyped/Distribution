package typings.vueTestUtils.anon

import typings.vueTestUtils.vueTestUtilsBooleans.`false`
import typings.vueTestUtils.vueTestUtilsStrings.FocusEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BubblesCancelableEventInterface extends StObject {
  
  val bubbles: `false`
  
  val cancelable: `false`
  
  val eventInterface: FocusEvent
}
object BubblesCancelableEventInterface {
  
  inline def apply(): BubblesCancelableEventInterface = {
    val __obj = js.Dynamic.literal(bubbles = false, cancelable = false, eventInterface = "FocusEvent")
    __obj.asInstanceOf[BubblesCancelableEventInterface]
  }
  
  extension [Self <: BubblesCancelableEventInterface](x: Self) {
    
    inline def setBubbles(value: `false`): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
    
    inline def setCancelable(value: `false`): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    inline def setEventInterface(value: FocusEvent): Self = StObject.set(x, "eventInterface", value.asInstanceOf[js.Any])
  }
}
