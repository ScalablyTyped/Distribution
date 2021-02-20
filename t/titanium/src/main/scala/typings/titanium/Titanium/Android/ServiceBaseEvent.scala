package typings.titanium.Titanium.Android

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base event for class Titanium.Android.Service
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ @js.native
trait ServiceBaseEvent extends StObject {
  
  /**
    * Source object that fired the event.
    */
  var source: Service = js.native
}
object ServiceBaseEvent {
  
  @scala.inline
  def apply(source: Service): ServiceBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceBaseEvent]
  }
  
  @scala.inline
  implicit class ServiceBaseEventMutableBuilder[Self <: ServiceBaseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: Service): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
