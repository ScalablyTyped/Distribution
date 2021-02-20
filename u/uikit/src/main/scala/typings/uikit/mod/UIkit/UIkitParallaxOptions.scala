package typings.uikit.mod.UIkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UIkitParallaxOptions extends StObject {
  
  var easing: js.UndefOr[Double] = js.native
  
  var media: js.UndefOr[Double | String] = js.native
  
  var target: js.UndefOr[String] = js.native
  
  var viewport: js.UndefOr[Double] = js.native
}
object UIkitParallaxOptions {
  
  @scala.inline
  def apply(): UIkitParallaxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIkitParallaxOptions]
  }
  
  @scala.inline
  implicit class UIkitParallaxOptionsMutableBuilder[Self <: UIkitParallaxOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEasing(value: Double): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    
    @scala.inline
    def setMedia(value: Double | String): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    @scala.inline
    def setViewport(value: Double): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewportUndefined: Self = StObject.set(x, "viewport", js.undefined)
  }
}
