package typings.twineSugarcube.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Audio extends StObject {
  
  val audio: Boolean
  
  val fileAPI: Boolean
  
  val geolocation: Boolean
  
  val mutationObserver: Boolean
  
  val performance: Boolean
  
  val touch: Boolean
  
  val transitionEndEvent: String
}
object Audio {
  
  @scala.inline
  def apply(
    audio: Boolean,
    fileAPI: Boolean,
    geolocation: Boolean,
    mutationObserver: Boolean,
    performance: Boolean,
    touch: Boolean,
    transitionEndEvent: String
  ): Audio = {
    val __obj = js.Dynamic.literal(audio = audio.asInstanceOf[js.Any], fileAPI = fileAPI.asInstanceOf[js.Any], geolocation = geolocation.asInstanceOf[js.Any], mutationObserver = mutationObserver.asInstanceOf[js.Any], performance = performance.asInstanceOf[js.Any], touch = touch.asInstanceOf[js.Any], transitionEndEvent = transitionEndEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Audio]
  }
  
  @scala.inline
  implicit class AudioMutableBuilder[Self <: Audio] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudio(value: Boolean): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileAPI(value: Boolean): Self = StObject.set(x, "fileAPI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeolocation(value: Boolean): Self = StObject.set(x, "geolocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMutationObserver(value: Boolean): Self = StObject.set(x, "mutationObserver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerformance(value: Boolean): Self = StObject.set(x, "performance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouch(value: Boolean): Self = StObject.set(x, "touch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionEndEvent(value: String): Self = StObject.set(x, "transitionEndEvent", value.asInstanceOf[js.Any])
  }
}
