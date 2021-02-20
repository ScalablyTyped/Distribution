package typings.titanium.Titanium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base event for class Titanium.Platform
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ @js.native
trait PlatformBaseEvent extends StObject {
  
  /**
    * Source object that fired the event.
    */
  var source: Platform = js.native
}
object PlatformBaseEvent {
  
  @scala.inline
  def apply(source: Platform): PlatformBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlatformBaseEvent]
  }
  
  @scala.inline
  implicit class PlatformBaseEventMutableBuilder[Self <: PlatformBaseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: Platform): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
