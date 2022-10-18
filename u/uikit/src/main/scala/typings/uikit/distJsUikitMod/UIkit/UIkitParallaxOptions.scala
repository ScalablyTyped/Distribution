package typings.uikit.distJsUikitMod.UIkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UIkitParallaxOptions extends StObject {
  
  var easing: js.UndefOr[Double] = js.undefined
  
  var end: js.UndefOr[Double | String] = js.undefined
  
  var media: js.UndefOr[Double | String] = js.undefined
  
  var start: js.UndefOr[Double | String] = js.undefined
  
  var target: js.UndefOr[String] = js.undefined
}
object UIkitParallaxOptions {
  
  inline def apply(): UIkitParallaxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIkitParallaxOptions]
  }
  
  extension [Self <: UIkitParallaxOptions](x: Self) {
    
    inline def setEasing(value: Double): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    
    inline def setEnd(value: Double | String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setMedia(value: Double | String): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    inline def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
    
    inline def setStart(value: Double | String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
