package typings.testingLibraryUserEvent.anon

import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.InputEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventType extends StObject {
  
  val EventType: InputEvent
  
  val defaultInit: Bubbles
}
object EventType {
  
  inline def apply(defaultInit: Bubbles): EventType = {
    val __obj = js.Dynamic.literal(EventType = "InputEvent", defaultInit = defaultInit.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventType]
  }
  
  extension [Self <: EventType](x: Self) {
    
    inline def setDefaultInit(value: Bubbles): Self = StObject.set(x, "defaultInit", value.asInstanceOf[js.Any])
    
    inline def setEventType(value: InputEvent): Self = StObject.set(x, "EventType", value.asInstanceOf[js.Any])
  }
}
