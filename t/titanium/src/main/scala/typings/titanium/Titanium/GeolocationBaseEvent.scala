package typings.titanium.Titanium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base event for class Titanium.Geolocation
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ @js.native
trait GeolocationBaseEvent extends StObject {
  
  /**
    * Source object that fired the event.
    */
  var source: Geolocation = js.native
}
object GeolocationBaseEvent {
  
  @scala.inline
  def apply(source: Geolocation): GeolocationBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeolocationBaseEvent]
  }
  
  @scala.inline
  implicit class GeolocationBaseEventMutableBuilder[Self <: GeolocationBaseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: Geolocation): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
