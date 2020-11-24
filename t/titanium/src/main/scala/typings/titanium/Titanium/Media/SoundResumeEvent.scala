package typings.titanium.Titanium.Media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when audio playback is resumed after an interruption.
  */
@js.native
trait SoundResumeEvent extends SoundBaseEvent {
  
  /**
    * Indicates if the resume was from an interruption.
    */
  var interruption: Boolean = js.native
}
object SoundResumeEvent {
  
  @scala.inline
  def apply(interruption: Boolean, source: Sound): SoundResumeEvent = {
    val __obj = js.Dynamic.literal(interruption = interruption.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[SoundResumeEvent]
  }
  
  @scala.inline
  implicit class SoundResumeEventOps[Self <: SoundResumeEvent] (val x: Self) extends AnyVal {
    
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
    def setInterruption(value: Boolean): Self = this.set("interruption", value.asInstanceOf[js.Any])
  }
}
