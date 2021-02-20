package typings.titanium.Titanium.Media

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base event for class Titanium.Media.MusicPlayer
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ @js.native
trait MusicPlayerBaseEvent extends StObject {
  
  /**
    * Source object that fired the event.
    */
  var source: MusicPlayer = js.native
}
object MusicPlayerBaseEvent {
  
  @scala.inline
  def apply(source: MusicPlayer): MusicPlayerBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[MusicPlayerBaseEvent]
  }
  
  @scala.inline
  implicit class MusicPlayerBaseEventMutableBuilder[Self <: MusicPlayerBaseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: MusicPlayer): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
