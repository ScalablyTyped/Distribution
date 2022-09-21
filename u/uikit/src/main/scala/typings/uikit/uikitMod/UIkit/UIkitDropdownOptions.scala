package typings.uikit.uikitMod.UIkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UIkitDropdownOptions extends StObject {
  
  var animation: js.UndefOr[String] = js.undefined
  
  var boundary: js.UndefOr[String] = js.undefined
  
  var `boundary-align`: js.UndefOr[Boolean] = js.undefined
  
  var `delay-hide`: js.UndefOr[Double] = js.undefined
  
  var `delay-show`: js.UndefOr[Double] = js.undefined
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var flip: js.UndefOr[Boolean | String] = js.undefined
  
  var mode: js.UndefOr[String] = js.undefined
  
  var offset: js.UndefOr[Double] = js.undefined
  
  var pos: js.UndefOr[String] = js.undefined
  
  var toggle: js.UndefOr[String | Boolean] = js.undefined
}
object UIkitDropdownOptions {
  
  inline def apply(): UIkitDropdownOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIkitDropdownOptions]
  }
  
  extension [Self <: UIkitDropdownOptions](x: Self) {
    
    inline def setAnimation(value: String): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setBoundary(value: String): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
    
    inline def `setBoundary-align`(value: Boolean): Self = StObject.set(x, "boundary-align", value.asInstanceOf[js.Any])
    
    inline def `setBoundary-alignUndefined`: Self = StObject.set(x, "boundary-align", js.undefined)
    
    inline def setBoundaryUndefined: Self = StObject.set(x, "boundary", js.undefined)
    
    inline def `setDelay-hide`(value: Double): Self = StObject.set(x, "delay-hide", value.asInstanceOf[js.Any])
    
    inline def `setDelay-hideUndefined`: Self = StObject.set(x, "delay-hide", js.undefined)
    
    inline def `setDelay-show`(value: Double): Self = StObject.set(x, "delay-show", value.asInstanceOf[js.Any])
    
    inline def `setDelay-showUndefined`: Self = StObject.set(x, "delay-show", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setFlip(value: Boolean | String): Self = StObject.set(x, "flip", value.asInstanceOf[js.Any])
    
    inline def setFlipUndefined: Self = StObject.set(x, "flip", js.undefined)
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setPos(value: String): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
    
    inline def setPosUndefined: Self = StObject.set(x, "pos", js.undefined)
    
    inline def setToggle(value: String | Boolean): Self = StObject.set(x, "toggle", value.asInstanceOf[js.Any])
    
    inline def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
  }
}
