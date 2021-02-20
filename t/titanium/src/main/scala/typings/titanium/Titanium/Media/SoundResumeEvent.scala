package typings.titanium.Titanium.Media

import org.scalablytyped.runtime.StObject
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
  implicit class SoundResumeEventMutableBuilder[Self <: SoundResumeEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInterruption(value: Boolean): Self = StObject.set(x, "interruption", value.asInstanceOf[js.Any])
  }
}
