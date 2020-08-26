package typings.titanium.Titanium.Media

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SoundEventMap extends ProxyEventMap {
  var change: SoundChangeEvent = js.native
  var complete: SoundCompleteEvent = js.native
  var error: SoundErrorEvent = js.native
  var interrupted: SoundInterruptedEvent = js.native
  var resume: SoundResumeEvent = js.native
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
  @scala.inline
  implicit class SoundEventMapOps[Self <: SoundEventMap] (val x: Self) extends AnyVal {
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
    def setChange(value: SoundChangeEvent): Self = this.set("change", value.asInstanceOf[js.Any])
    @scala.inline
    def setComplete(value: SoundCompleteEvent): Self = this.set("complete", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: SoundErrorEvent): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setInterrupted(value: SoundInterruptedEvent): Self = this.set("interrupted", value.asInstanceOf[js.Any])
    @scala.inline
    def setResume(value: SoundResumeEvent): Self = this.set("resume", value.asInstanceOf[js.Any])
  }
  
}

