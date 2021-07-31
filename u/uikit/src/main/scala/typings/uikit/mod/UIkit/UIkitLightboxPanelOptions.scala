package typings.uikit.mod.UIkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UIkitLightboxPanelOptions extends StObject {
  
  var animation: js.UndefOr[String] = js.undefined
  
  var autoplay: js.UndefOr[Boolean] = js.undefined
  
  var `autoplay-interval`: js.UndefOr[Double] = js.undefined
  
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
  
  @scala.inline
  def apply(): UIkitLightboxPanelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIkitLightboxPanelOptions]
  }
  
  @scala.inline
  implicit class UIkitLightboxPanelOptionsMutableBuilder[Self <: UIkitLightboxPanelOptions] (val x: Self) extends AnyVal {
    
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
    def `setDelay-controls`(value: Double): Self = StObject.set(x, "delay-controls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setDelay-controlsUndefined`: Self = StObject.set(x, "delay-controls", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setItems(value: js.Array[js.Object]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: js.Object*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def `setPause-on-hover`(value: Boolean): Self = StObject.set(x, "pause-on-hover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPause-on-hoverUndefined`: Self = StObject.set(x, "pause-on-hover", js.undefined)
    
    @scala.inline
    def setPreload(value: Double): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
    
    @scala.inline
    def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    @scala.inline
    def setVelocity(value: Double): Self = StObject.set(x, "velocity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVelocityUndefined: Self = StObject.set(x, "velocity", js.undefined)
    
    @scala.inline
    def `setVideo-autoplay`(value: Boolean): Self = StObject.set(x, "video-autoplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setVideo-autoplayUndefined`: Self = StObject.set(x, "video-autoplay", js.undefined)
  }
}
