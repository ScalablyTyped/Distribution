package typings.uikit.distJsUikitMod.UIkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UIkitLightboxPanelOptions extends StObject {
  
  var animation: js.UndefOr[String] = js.undefined
  
  var autoplay: js.UndefOr[Boolean] = js.undefined
  
  var `autoplay-interval`: js.UndefOr[Double] = js.undefined
  
  var container: js.UndefOr[String] = js.undefined
  
  var `delay-controls`: js.UndefOr[Double] = js.undefined
  
  var index: js.UndefOr[Double] = js.undefined
  
  var items: js.UndefOr[js.Array[js.Object]] = js.undefined
  
  var `pause-on-hover`: js.UndefOr[Boolean] = js.undefined
  
  var preload: js.UndefOr[Double] = js.undefined
  
  var template: js.UndefOr[String] = js.undefined
  
  var velocity: js.UndefOr[Double] = js.undefined
  
  var `video-autoplay`: js.UndefOr[Boolean] = js.undefined
}
object UIkitLightboxPanelOptions {
  
  inline def apply(): UIkitLightboxPanelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIkitLightboxPanelOptions]
  }
  
  extension [Self <: UIkitLightboxPanelOptions](x: Self) {
    
    inline def setAnimation(value: String): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setAutoplay(value: Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
    
    inline def `setAutoplay-interval`(value: Double): Self = StObject.set(x, "autoplay-interval", value.asInstanceOf[js.Any])
    
    inline def `setAutoplay-intervalUndefined`: Self = StObject.set(x, "autoplay-interval", js.undefined)
    
    inline def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
    
    inline def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def `setDelay-controls`(value: Double): Self = StObject.set(x, "delay-controls", value.asInstanceOf[js.Any])
    
    inline def `setDelay-controlsUndefined`: Self = StObject.set(x, "delay-controls", js.undefined)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setItems(value: js.Array[js.Object]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: js.Object*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def `setPause-on-hover`(value: Boolean): Self = StObject.set(x, "pause-on-hover", value.asInstanceOf[js.Any])
    
    inline def `setPause-on-hoverUndefined`: Self = StObject.set(x, "pause-on-hover", js.undefined)
    
    inline def setPreload(value: Double): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
    
    inline def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
    
    inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    inline def setVelocity(value: Double): Self = StObject.set(x, "velocity", value.asInstanceOf[js.Any])
    
    inline def setVelocityUndefined: Self = StObject.set(x, "velocity", js.undefined)
    
    inline def `setVideo-autoplay`(value: Boolean): Self = StObject.set(x, "video-autoplay", value.asInstanceOf[js.Any])
    
    inline def `setVideo-autoplayUndefined`: Self = StObject.set(x, "video-autoplay", js.undefined)
  }
}
