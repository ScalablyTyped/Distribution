package typings.testingLibraryUserEvent.anon

import typings.testingLibraryUserEvent.testingLibraryUserEventStrings.PointerEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultInit extends StObject {
  
  val EventType: PointerEvent
  
  val defaultInit: Bubbles
}
object DefaultInit {
  
  inline def apply(defaultInit: Bubbles): DefaultInit = {
    val __obj = js.Dynamic.literal(EventType = "PointerEvent", defaultInit = defaultInit.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultInit]
  }
  
  extension [Self <: DefaultInit](x: Self) {
    
    inline def setDefaultInit(value: Bubbles): Self = StObject.set(x, "defaultInit", value.asInstanceOf[js.Any])
    
    inline def setEventType(value: PointerEvent): Self = StObject.set(x, "EventType", value.asInstanceOf[js.Any])
  }
}
