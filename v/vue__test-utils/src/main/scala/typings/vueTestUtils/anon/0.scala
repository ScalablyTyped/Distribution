package typings.vueTestUtils.anon

import typings.vueTestUtils.vueTestUtilsBooleans.`false`
import typings.vueTestUtils.vueTestUtilsStrings.SpeechSynthesisEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  val bubbles: `false`
  
  val cancelable: `false`
  
  val eventInterface: SpeechSynthesisEvent
}
object `0` {
  
  inline def apply(): `0` = {
    val __obj = js.Dynamic.literal(bubbles = false, cancelable = false, eventInterface = "SpeechSynthesisEvent")
    __obj.asInstanceOf[`0`]
  }
  
  extension [Self <: `0`](x: Self) {
    
    inline def setBubbles(value: `false`): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
    
    inline def setCancelable(value: `false`): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    inline def setEventInterface(value: SpeechSynthesisEvent): Self = StObject.set(x, "eventInterface", value.asInstanceOf[js.Any])
  }
}
