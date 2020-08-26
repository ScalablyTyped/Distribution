package typings.titanium.Titanium.Media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Base event for class Titanium.Media.AudioPlayer
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ @js.native
trait AudioPlayerBaseEvent extends js.Object {
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
  implicit class AudioPlayerBaseEventOps[Self <: AudioPlayerBaseEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSource(value: AudioPlayer): Self = this.set("source", value.asInstanceOf[js.Any])
  }
  
}

