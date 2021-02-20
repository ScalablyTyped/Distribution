package typings.titanium.Titanium.UI.iOS

import typings.titanium.ProxyEventMap
import org.scalablytyped.runtime.StObject
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
  implicit class AnimatorEventMapMutableBuilder[Self <: AnimatorEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPause(value: AnimatorPauseEvent): Self = StObject.set(x, "pause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResume(value: AnimatorResumeEvent): Self = StObject.set(x, "resume", value.asInstanceOf[js.Any])
  }
}
