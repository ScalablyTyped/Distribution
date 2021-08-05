package typings.uikit.mod.UIkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UIkitSlideshowOptions extends StObject {
  
  var animation: js.UndefOr[String] = js.undefined
  
  var autoplay: js.UndefOr[Boolean] = js.undefined
  
  var `autoplay-interval`: js.UndefOr[Double] = js.undefined
  
  var draggable: js.UndefOr[Boolean] = js.undefined
  
  var easing: js.UndefOr[String] = js.undefined
  
  var finite: js.UndefOr[Boolean] = js.undefined
  
  var index: js.UndefOr[Double] = js.undefined
  
  var `max-height`: js.UndefOr[Boolean | Double] = js.undefined
  
  var `min-height`: js.UndefOr[Boolean | Double] = js.undefined
  
  var `pause-on-hover`: js.UndefOr[Boolean] = js.undefined
  
  var ratio: js.UndefOr[String | Double] = js.undefined
  
  var velocity: js.UndefOr[Double] = js.undefined
}
object UIkitSlideshowOptions {
  
  inline def apply(): UIkitSlideshowOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIkitSlideshowOptions]
  }
  
  extension [Self <: UIkitSlideshowOptions](x: Self) {
    
    inline def setAnimation(value: String): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setAutoplay(value: Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
    
    inline def `setAutoplay-interval`(value: Double): Self = StObject.set(x, "autoplay-interval", value.asInstanceOf[js.Any])
    
    inline def `setAutoplay-intervalUndefined`: Self = StObject.set(x, "autoplay-interval", js.undefined)
    
    inline def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
    
    inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    inline def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    
    inline def setFinite(value: Boolean): Self = StObject.set(x, "finite", value.asInstanceOf[js.Any])
    
    inline def setFiniteUndefined: Self = StObject.set(x, "finite", js.undefined)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def `setMax-height`(value: Boolean | Double): Self = StObject.set(x, "max-height", value.asInstanceOf[js.Any])
    
    inline def `setMax-heightUndefined`: Self = StObject.set(x, "max-height", js.undefined)
    
    inline def `setMin-height`(value: Boolean | Double): Self = StObject.set(x, "min-height", value.asInstanceOf[js.Any])
    
    inline def `setMin-heightUndefined`: Self = StObject.set(x, "min-height", js.undefined)
    
    inline def `setPause-on-hover`(value: Boolean): Self = StObject.set(x, "pause-on-hover", value.asInstanceOf[js.Any])
    
    inline def `setPause-on-hoverUndefined`: Self = StObject.set(x, "pause-on-hover", js.undefined)
    
    inline def setRatio(value: String | Double): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
    
    inline def setRatioUndefined: Self = StObject.set(x, "ratio", js.undefined)
    
    inline def setVelocity(value: Double): Self = StObject.set(x, "velocity", value.asInstanceOf[js.Any])
    
    inline def setVelocityUndefined: Self = StObject.set(x, "velocity", js.undefined)
  }
}
