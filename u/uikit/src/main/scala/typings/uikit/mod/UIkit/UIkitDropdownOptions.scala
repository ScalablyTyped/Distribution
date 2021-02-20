package typings.uikit.mod.UIkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UIkitDropdownOptions extends StObject {
  
  var animation: js.UndefOr[String] = js.native
  
  var boundary: js.UndefOr[String] = js.native
  
  var `boundary-align`: js.UndefOr[Boolean] = js.native
  
  var `delay-hide`: js.UndefOr[Double] = js.native
  
  var `delay-show`: js.UndefOr[Double] = js.native
  
  var duration: js.UndefOr[Double] = js.native
  
  var flip: js.UndefOr[Boolean | String] = js.native
  
  var mode: js.UndefOr[String] = js.native
  
  var offset: js.UndefOr[Double] = js.native
  
  var pos: js.UndefOr[String] = js.native
  
  var toggle: js.UndefOr[String | Boolean] = js.native
}
object UIkitDropdownOptions {
  
  @scala.inline
  def apply(): UIkitDropdownOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIkitDropdownOptions]
  }
  
  @scala.inline
  implicit class UIkitDropdownOptionsMutableBuilder[Self <: UIkitDropdownOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimation(value: String): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    @scala.inline
    def setBoundary(value: String): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBoundary-align`(value: Boolean): Self = StObject.set(x, "boundary-align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBoundary-alignUndefined`: Self = StObject.set(x, "boundary-align", js.undefined)
    
    @scala.inline
    def setBoundaryUndefined: Self = StObject.set(x, "boundary", js.undefined)
    
    @scala.inline
    def `setDelay-hide`(value: Double): Self = StObject.set(x, "delay-hide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setDelay-hideUndefined`: Self = StObject.set(x, "delay-hide", js.undefined)
    
    @scala.inline
    def `setDelay-show`(value: Double): Self = StObject.set(x, "delay-show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setDelay-showUndefined`: Self = StObject.set(x, "delay-show", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setFlip(value: Boolean | String): Self = StObject.set(x, "flip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlipUndefined: Self = StObject.set(x, "flip", js.undefined)
    
    @scala.inline
    def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setPos(value: String): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosUndefined: Self = StObject.set(x, "pos", js.undefined)
    
    @scala.inline
    def setToggle(value: String | Boolean): Self = StObject.set(x, "toggle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
  }
}
