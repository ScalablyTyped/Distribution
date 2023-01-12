package typings.uikit.distJsUikitMod.UIkit

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
  
  inline def apply(): UIkitToggleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIkitToggleOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UIkitToggleOptions] (val x: Self) extends AnyVal {
    
    inline def setAnimation(value: String): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setCls(value: String): Self = StObject.set(x, "cls", value.asInstanceOf[js.Any])
    
    inline def setClsUndefined: Self = StObject.set(x, "cls", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setMedia(value: Double | String): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    inline def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setQueued(value: Boolean): Self = StObject.set(x, "queued", value.asInstanceOf[js.Any])
    
    inline def setQueuedUndefined: Self = StObject.set(x, "queued", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
