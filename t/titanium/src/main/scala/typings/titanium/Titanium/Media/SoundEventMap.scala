package typings.titanium.Titanium.Media

import typings.titanium.ProxyEventMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class SoundEventMapMutableBuilder[Self <: SoundEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChange(value: SoundChangeEvent): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComplete(value: SoundCompleteEvent): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: SoundErrorEvent): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterrupted(value: SoundInterruptedEvent): Self = StObject.set(x, "interrupted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResume(value: SoundResumeEvent): Self = StObject.set(x, "resume", value.asInstanceOf[js.Any])
  }
}
