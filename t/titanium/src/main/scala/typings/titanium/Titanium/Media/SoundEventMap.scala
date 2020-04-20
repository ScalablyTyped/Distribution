package typings.titanium.Titanium.Media

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SoundEventMap extends ProxyEventMap {
  var change: SoundChangeEvent
  var complete: SoundCompleteEvent
  var error: SoundErrorEvent
  var interrupted: SoundInterruptedEvent
  var resume: SoundResumeEvent
}

object SoundEventMap {
  @scala.inline
  def apply(
    change: SoundChangeEvent,
    complete: SoundCompleteEvent,
    error: SoundErrorEvent,
    interrupted: SoundInterruptedEvent,
    resume: SoundResumeEvent
  ): SoundEventMap = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any], complete = complete.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], interrupted = interrupted.asInstanceOf[js.Any], resume = resume.asInstanceOf[js.Any])
    __obj.asInstanceOf[SoundEventMap]
  }
}

