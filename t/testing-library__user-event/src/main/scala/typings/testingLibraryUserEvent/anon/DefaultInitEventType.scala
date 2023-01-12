package typings.testingLibraryUserEvent.anon

import typings.std.EventInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultInitEventType extends StObject {
  
  var EventType: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventInterface */ Any
  
  var defaultInit: EventInit
}
object DefaultInitEventType {
  
  inline def apply(
    EventType: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventInterface */ Any,
    defaultInit: EventInit
  ): DefaultInitEventType = {
    val __obj = js.Dynamic.literal(EventType = EventType.asInstanceOf[js.Any], defaultInit = defaultInit.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultInitEventType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefaultInitEventType] (val x: Self) extends AnyVal {
    
    inline def setDefaultInit(value: EventInit): Self = StObject.set(x, "defaultInit", value.asInstanceOf[js.Any])
    
    inline def setEventType(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventInterface */ Any
    ): Self = StObject.set(x, "EventType", value.asInstanceOf[js.Any])
  }
}
