package typings.titanium.Titanium.Media

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base event for class Titanium.Media.Sound
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ @js.native
trait SoundBaseEvent extends StObject {
  
  /**
    * Source object that fired the event.
    */
  var source: Sound = js.native
}
object SoundBaseEvent {
  
  @scala.inline
  def apply(source: Sound): SoundBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[SoundBaseEvent]
  }
  
  @scala.inline
  implicit class SoundBaseEventMutableBuilder[Self <: SoundBaseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: Sound): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
