package typings.vueTestUtils.anon

import typings.vueTestUtils.vueTestUtilsBooleans.`false`
import typings.vueTestUtils.vueTestUtilsBooleans.`true`
import typings.vueTestUtils.vueTestUtilsStrings.AnimationEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cancelable extends StObject {
  
  val bubbles: `true`
  
  val cancelable: `false`
  
  val eventInterface: AnimationEvent
}
object Cancelable {
  
  inline def apply(): Cancelable = {
    val __obj = js.Dynamic.literal(bubbles = true, cancelable = false, eventInterface = "AnimationEvent")
    __obj.asInstanceOf[Cancelable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Cancelable] (val x: Self) extends AnyVal {
    
    inline def setBubbles(value: `true`): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
    
    inline def setCancelable(value: `false`): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    inline def setEventInterface(value: AnimationEvent): Self = StObject.set(x, "eventInterface", value.asInstanceOf[js.Any])
  }
}
