package typings.uikit.uikitMod.UIkit

import typings.uikit.uikitStrings.bottom
import typings.uikit.uikitStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UIkitStickyOptions extends StObject {
  
  var animation: js.UndefOr[String | Boolean] = js.undefined
  
  var `cls-active`: js.UndefOr[String] = js.undefined
  
  var `cls-inactive`: js.UndefOr[String] = js.undefined
  
  var end: js.UndefOr[Boolean | Double | String] = js.undefined
  
  var media: js.UndefOr[Double | String | Boolean] = js.undefined
  
  var offset: js.UndefOr[Double | String] = js.undefined
  
  var `overflow-flip`: js.UndefOr[Boolean] = js.undefined
  
  var position: js.UndefOr[top | bottom] = js.undefined
  
  var `show-on-up`: js.UndefOr[Boolean] = js.undefined
  
  var start: js.UndefOr[Double | String] = js.undefined
  
  var `target-offset`: js.UndefOr[Boolean | Double] = js.undefined
  
  var `width-element`: js.UndefOr[String | Boolean] = js.undefined
}
object UIkitStickyOptions {
  
  inline def apply(): UIkitStickyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIkitStickyOptions]
  }
  
  extension [Self <: UIkitStickyOptions](x: Self) {
    
    inline def setAnimation(value: String | Boolean): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def `setCls-active`(value: String): Self = StObject.set(x, "cls-active", value.asInstanceOf[js.Any])
    
    inline def `setCls-activeUndefined`: Self = StObject.set(x, "cls-active", js.undefined)
    
    inline def `setCls-inactive`(value: String): Self = StObject.set(x, "cls-inactive", value.asInstanceOf[js.Any])
    
    inline def `setCls-inactiveUndefined`: Self = StObject.set(x, "cls-inactive", js.undefined)
    
    inline def setEnd(value: Boolean | Double | String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setMedia(value: Double | String | Boolean): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    inline def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
    
    inline def setOffset(value: Double | String): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def `setOverflow-flip`(value: Boolean): Self = StObject.set(x, "overflow-flip", value.asInstanceOf[js.Any])
    
    inline def `setOverflow-flipUndefined`: Self = StObject.set(x, "overflow-flip", js.undefined)
    
    inline def setPosition(value: top | bottom): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def `setShow-on-up`(value: Boolean): Self = StObject.set(x, "show-on-up", value.asInstanceOf[js.Any])
    
    inline def `setShow-on-upUndefined`: Self = StObject.set(x, "show-on-up", js.undefined)
    
    inline def setStart(value: Double | String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def `setTarget-offset`(value: Boolean | Double): Self = StObject.set(x, "target-offset", value.asInstanceOf[js.Any])
    
    inline def `setTarget-offsetUndefined`: Self = StObject.set(x, "target-offset", js.undefined)
    
    inline def `setWidth-element`(value: String | Boolean): Self = StObject.set(x, "width-element", value.asInstanceOf[js.Any])
    
    inline def `setWidth-elementUndefined`: Self = StObject.set(x, "width-element", js.undefined)
  }
}
