package typings.titanium.Titanium.App

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base event for class Titanium.App.Properties
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ @js.native
trait PropertiesBaseEvent extends StObject {
  
  /**
    * Source object that fired the event.
    */
  var source: Properties = js.native
}
object PropertiesBaseEvent {
  
  @scala.inline
  def apply(source: Properties): PropertiesBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertiesBaseEvent]
  }
  
  @scala.inline
  implicit class PropertiesBaseEventMutableBuilder[Self <: PropertiesBaseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: Properties): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
