package typings.uikit.mod.UIkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UIkitToggleOptions extends StObject {
  
  var animation: js.UndefOr[String] = js.undefined
  
  var cls: js.UndefOr[String] = js.undefined
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var media: js.UndefOr[Double | String] = js.undefined
  
  var mode: js.UndefOr[String] = js.undefined
  
  var queued: js.UndefOr[Boolean] = js.undefined
  
  var target: js.UndefOr[String] = js.undefined
}
object UIkitToggleOptions {
  
  @scala.inline
  def apply(): UIkitToggleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIkitToggleOptions]
  }
  
  @scala.inline
  implicit class UIkitToggleOptionsMutableBuilder[Self <: UIkitToggleOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimation(value: String): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    @scala.inline
    def setCls(value: String): Self = StObject.set(x, "cls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClsUndefined: Self = StObject.set(x, "cls", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setMedia(value: Double | String): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
    
    @scala.inline
    def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setQueued(value: Boolean): Self = StObject.set(x, "queued", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueuedUndefined: Self = StObject.set(x, "queued", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
