package typings.vueTestUtils.anon

import typings.vueTestUtils.vueTestUtilsBooleans.`true`
import typings.vueTestUtils.vueTestUtilsStrings.MutationEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `13` extends StObject {
  
  val bubbles: `true`
  
  val cancelable: `true`
  
  val eventInterface: MutationEvent
}
object `13` {
  
  inline def apply(): `13` = {
    val __obj = js.Dynamic.literal(bubbles = true, cancelable = true, eventInterface = "MutationEvent")
    __obj.asInstanceOf[`13`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `13`] (val x: Self) extends AnyVal {
    
    inline def setBubbles(value: `true`): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
    
    inline def setCancelable(value: `true`): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    inline def setEventInterface(value: MutationEvent): Self = StObject.set(x, "eventInterface", value.asInstanceOf[js.Any])
  }
}
