package typings.uikit.distJsUikitMod.UIkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UIkitLightboxOptions extends StObject {
  
  var animation: js.UndefOr[String] = js.undefined
  
  var autoplay: js.UndefOr[Double] = js.undefined
  
  var `autoplay-interval`: js.UndefOr[Double] = js.undefined
  
  var index: js.UndefOr[String] = js.undefined
  
  var `pause-on-hover`: js.UndefOr[Boolean] = js.undefined
  
  var toggle: js.UndefOr[String] = js.undefined
  
  var `video-autoplay`: js.UndefOr[Boolean] = js.undefined
}
object UIkitLightboxOptions {
  
  inline def apply(): UIkitLightboxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIkitLightboxOptions]
  }
  
  extension [Self <: UIkitLightboxOptions](x: Self) {
    
    inline def setAnimation(value: String): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setAutoplay(value: Double): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
    
    inline def `setAutoplay-interval`(value: Double): Self = StObject.set(x, "autoplay-interval", value.asInstanceOf[js.Any])
    
    inline def `setAutoplay-intervalUndefined`: Self = StObject.set(x, "autoplay-interval", js.undefined)
    
    inline def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
    
    inline def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def `setPause-on-hover`(value: Boolean): Self = StObject.set(x, "pause-on-hover", value.asInstanceOf[js.Any])
    
    inline def `setPause-on-hoverUndefined`: Self = StObject.set(x, "pause-on-hover", js.undefined)
    
    inline def setToggle(value: String): Self = StObject.set(x, "toggle", value.asInstanceOf[js.Any])
    
    inline def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
    
    inline def `setVideo-autoplay`(value: Boolean): Self = StObject.set(x, "video-autoplay", value.asInstanceOf[js.Any])
    
    inline def `setVideo-autoplayUndefined`: Self = StObject.set(x, "video-autoplay", js.undefined)
  }
}
