package typings.uikit.mod.UIkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UIkitLightboxOptions extends StObject {
  
  var animation: js.UndefOr[String] = js.native
  
  var autoplay: js.UndefOr[Double] = js.native
  
  var `autoplay-interval`: js.UndefOr[Double] = js.native
  
  var index: js.UndefOr[String] = js.native
  
  var `pause-on-hover`: js.UndefOr[Boolean] = js.native
  
  var toggle: js.UndefOr[String] = js.native
  
  var `video-autoplay`: js.UndefOr[Boolean] = js.native
}
object UIkitLightboxOptions {
  
  @scala.inline
  def apply(): UIkitLightboxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIkitLightboxOptions]
  }
  
  @scala.inline
  implicit class UIkitLightboxOptionsMutableBuilder[Self <: UIkitLightboxOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimation(value: String): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    @scala.inline
    def setAutoplay(value: Double): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAutoplay-interval`(value: Double): Self = StObject.set(x, "autoplay-interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAutoplay-intervalUndefined`: Self = StObject.set(x, "autoplay-interval", js.undefined)
    
    @scala.inline
    def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
    
    @scala.inline
    def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def `setPause-on-hover`(value: Boolean): Self = StObject.set(x, "pause-on-hover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPause-on-hoverUndefined`: Self = StObject.set(x, "pause-on-hover", js.undefined)
    
    @scala.inline
    def setToggle(value: String): Self = StObject.set(x, "toggle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
    
    @scala.inline
    def `setVideo-autoplay`(value: Boolean): Self = StObject.set(x, "video-autoplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setVideo-autoplayUndefined`: Self = StObject.set(x, "video-autoplay", js.undefined)
  }
}
