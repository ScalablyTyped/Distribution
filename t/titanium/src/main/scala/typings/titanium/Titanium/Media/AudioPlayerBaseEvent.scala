package typings.titanium.Titanium.Media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Base event for class Titanium.Media.AudioPlayer
		 */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ trait AudioPlayerBaseEvent extends js.Object {
  /**
  			 * Source object that fired the event.
  			 */
  var source: AudioPlayer
}

object AudioPlayerBaseEvent {
  @scala.inline
  def apply(source: AudioPlayer): AudioPlayerBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioPlayerBaseEvent]
  }
}

