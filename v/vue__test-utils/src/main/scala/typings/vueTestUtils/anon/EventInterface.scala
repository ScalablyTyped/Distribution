package typings.vueTestUtils.anon

import typings.vueTestUtils.vueTestUtilsBooleans.`false`
import typings.vueTestUtils.vueTestUtilsStrings.AudioProcessingEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventInterface extends StObject {
  
  val bubbles: `false`
  
  val cancelable: `false`
  
  val eventInterface: AudioProcessingEvent
}
object EventInterface {
  
  inline def apply(): EventInterface = {
    val __obj = js.Dynamic.literal(bubbles = false, cancelable = false, eventInterface = "AudioProcessingEvent")
    __obj.asInstanceOf[EventInterface]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventInterface] (val x: Self) extends AnyVal {
    
    inline def setBubbles(value: `false`): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
    
    inline def setCancelable(value: `false`): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    inline def setEventInterface(value: AudioProcessingEvent): Self = StObject.set(x, "eventInterface", value.asInstanceOf[js.Any])
  }
}
