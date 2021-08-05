package typings.uikit.mod.UIkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UIkitParallaxOptions extends StObject {
  
  var easing: js.UndefOr[Double] = js.undefined
  
  var media: js.UndefOr[Double | String] = js.undefined
  
  var target: js.UndefOr[String] = js.undefined
  
  var viewport: js.UndefOr[Double] = js.undefined
}
object UIkitParallaxOptions {
  
  inline def apply(): UIkitParallaxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIkitParallaxOptions]
  }
  
  extension [Self <: UIkitParallaxOptions](x: Self) {
    
    inline def setEasing(value: Double): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    
    inline def setMedia(value: Double | String): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    inline def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setViewport(value: Double): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
    
    inline def setViewportUndefined: Self = StObject.set(x, "viewport", js.undefined)
  }
}
