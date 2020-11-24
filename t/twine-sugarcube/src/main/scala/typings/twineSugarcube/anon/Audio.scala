package typings.twineSugarcube.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Audio extends js.Object {
  
  val audio: Boolean = js.native
  
  val fileAPI: Boolean = js.native
  
  val geolocation: Boolean = js.native
  
  val mutationObserver: Boolean = js.native
  
  val performance: Boolean = js.native
  
  val touch: Boolean = js.native
  
  val transitionEndEvent: String = js.native
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
  implicit class AudioOps[Self <: Audio] (val x: Self) extends AnyVal {
    
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
    def setAudio(value: Boolean): Self = this.set("audio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileAPI(value: Boolean): Self = this.set("fileAPI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeolocation(value: Boolean): Self = this.set("geolocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMutationObserver(value: Boolean): Self = this.set("mutationObserver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerformance(value: Boolean): Self = this.set("performance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouch(value: Boolean): Self = this.set("touch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionEndEvent(value: String): Self = this.set("transitionEndEvent", value.asInstanceOf[js.Any])
  }
}
