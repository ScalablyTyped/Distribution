package typings.vueTestUtils.anon

import typings.vueTestUtils.vueTestUtilsBooleans.`false`
import typings.vueTestUtils.vueTestUtilsBooleans.`true`
import typings.vueTestUtils.vueTestUtilsStrings.BeforeUnloadEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BubblesCancelable extends StObject {
  
  val bubbles: `false`
  
  val cancelable: `true`
  
  val eventInterface: BeforeUnloadEvent
}
object BubblesCancelable {
  
  inline def apply(): BubblesCancelable = {
    val __obj = js.Dynamic.literal(bubbles = false, cancelable = true, eventInterface = "BeforeUnloadEvent")
    __obj.asInstanceOf[BubblesCancelable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BubblesCancelable] (val x: Self) extends AnyVal {
    
    inline def setBubbles(value: `false`): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
    
    inline def setCancelable(value: `true`): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    inline def setEventInterface(value: BeforeUnloadEvent): Self = StObject.set(x, "eventInterface", value.asInstanceOf[js.Any])
  }
}
