package typings.vueTestUtils.anon

import typings.vueTestUtils.vueTestUtilsBooleans.`false`
import typings.vueTestUtils.vueTestUtilsStrings.SpeechRecognitionEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `29` extends StObject {
  
  val bubbles: `false`
  
  val cancelable: `false`
  
  val eventInterface: SpeechRecognitionEvent
}
object `29` {
  
  inline def apply(): `29` = {
    val __obj = js.Dynamic.literal(bubbles = false, cancelable = false, eventInterface = "SpeechRecognitionEvent")
    __obj.asInstanceOf[`29`]
  }
  
  extension [Self <: `29`](x: Self) {
    
    inline def setBubbles(value: `false`): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
    
    inline def setCancelable(value: `false`): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    inline def setEventInterface(value: SpeechRecognitionEvent): Self = StObject.set(x, "eventInterface", value.asInstanceOf[js.Any])
  }
}
