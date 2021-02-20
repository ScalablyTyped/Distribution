package typings.titanium.Titanium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base event for class Titanium.Media
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ @js.native
trait MediaBaseEvent extends StObject {
  
  /**
    * Source object that fired the event.
    */
  var source: Media = js.native
}
object MediaBaseEvent {
  
  @scala.inline
  def apply(source: Media): MediaBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaBaseEvent]
  }
  
  @scala.inline
  implicit class MediaBaseEventMutableBuilder[Self <: MediaBaseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: Media): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
