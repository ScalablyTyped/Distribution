package typings.titanium.Titanium.UI.iOS

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimatorEventMap extends ProxyEventMap {
  
  var pause: AnimatorPauseEvent = js.native
  
  var resume: AnimatorResumeEvent = js.native
}
object AnimatorEventMap {
  
  @scala.inline
  def apply(pause: AnimatorPauseEvent, resume: AnimatorResumeEvent): AnimatorEventMap = {
    val __obj = js.Dynamic.literal(pause = pause.asInstanceOf[js.Any], resume = resume.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimatorEventMap]
  }
  
  @scala.inline
  implicit class AnimatorEventMapOps[Self <: AnimatorEventMap] (val x: Self) extends AnyVal {
    
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
    def setPause(value: AnimatorPauseEvent): Self = this.set("pause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResume(value: AnimatorResumeEvent): Self = this.set("resume", value.asInstanceOf[js.Any])
  }
}
