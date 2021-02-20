package typings.titanium.Titanium.Media

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base event for class Titanium.Media.AudioPlayer
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ @js.native
trait AudioPlayerBaseEvent extends StObject {
  
  /**
    * Source object that fired the event.
    */
  var source: AudioPlayer = js.native
}
object AudioPlayerBaseEvent {
  
  @scala.inline
  def apply(source: AudioPlayer): AudioPlayerBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioPlayerBaseEvent]
  }
  
  @scala.inline
  implicit class AudioPlayerBaseEventMutableBuilder[Self <: AudioPlayerBaseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: AudioPlayer): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
