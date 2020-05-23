package typings.titanium.Titanium.Media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Base event for class Titanium.Media.VideoPlayer
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ trait VideoPlayerBaseEvent extends js.Object {
  /**
    * Source object that fired the event.
    */
  var source: VideoPlayer
}

object VideoPlayerBaseEvent {
  @scala.inline
  def apply(source: VideoPlayer): VideoPlayerBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoPlayerBaseEvent]
  }
}

