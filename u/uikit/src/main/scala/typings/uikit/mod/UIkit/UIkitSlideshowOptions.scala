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
  
  @scala.inline
  def apply(): UIkitSlideshowOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIkitSlideshowOptions]
  }
  
  @scala.inline
  implicit class UIkitSlideshowOptionsMutableBuilder[Self <: UIkitSlideshowOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimation(value: String): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    @scala.inline
    def setAutoplay(value: Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAutoplay-interval`(value: Double): Self = StObject.set(x, "autoplay-interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAutoplay-intervalUndefined`: Self = StObject.set(x, "autoplay-interval", js.undefined)
    
    @scala.inline
    def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
    
    @scala.inline
    def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    @scala.inline
    def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    
    @scala.inline
    def setFinite(value: Boolean): Self = StObject.set(x, "finite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiniteUndefined: Self = StObject.set(x, "finite", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def `setMax-height`(value: Boolean | Double): Self = StObject.set(x, "max-height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMax-heightUndefined`: Self = StObject.set(x, "max-height", js.undefined)
    
    @scala.inline
    def `setMin-height`(value: Boolean | Double): Self = StObject.set(x, "min-height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMin-heightUndefined`: Self = StObject.set(x, "min-height", js.undefined)
    
    @scala.inline
    def `setPause-on-hover`(value: Boolean): Self = StObject.set(x, "pause-on-hover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPause-on-hoverUndefined`: Self = StObject.set(x, "pause-on-hover", js.undefined)
    
    @scala.inline
    def setRatio(value: String | Double): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRatioUndefined: Self = StObject.set(x, "ratio", js.undefined)
    
    @scala.inline
    def setVelocity(value: Double): Self = StObject.set(x, "velocity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVelocityUndefined: Self = StObject.set(x, "velocity", js.undefined)
  }
}
