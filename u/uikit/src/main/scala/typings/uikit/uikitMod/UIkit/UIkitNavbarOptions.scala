package typings.uikit.uikitMod.UIkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UIkitNavbarOptions extends StObject {
  
  var align: js.UndefOr[String] = js.undefined
  
  var boundary: js.UndefOr[String] = js.undefined
  
  var `boundary-align`: js.UndefOr[Boolean] = js.undefined
  
  var `delay-hide`: js.UndefOr[Double] = js.undefined
  
  var `delay-show`: js.UndefOr[Double] = js.undefined
  
  var dropbar: js.UndefOr[Boolean] = js.undefined
  
  var `dropbar-mode`: js.UndefOr[String] = js.undefined
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var mode: js.UndefOr[String] = js.undefined
  
  var offset: js.UndefOr[Double] = js.undefined
}
object UIkitNavbarOptions {
  
  inline def apply(): UIkitNavbarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIkitNavbarOptions]
  }
  
  extension [Self <: UIkitNavbarOptions](x: Self) {
    
    inline def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setBoundary(value: String): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
    
    inline def `setBoundary-align`(value: Boolean): Self = StObject.set(x, "boundary-align", value.asInstanceOf[js.Any])
    
    inline def `setBoundary-alignUndefined`: Self = StObject.set(x, "boundary-align", js.undefined)
    
    inline def setBoundaryUndefined: Self = StObject.set(x, "boundary", js.undefined)
    
    inline def `setDelay-hide`(value: Double): Self = StObject.set(x, "delay-hide", value.asInstanceOf[js.Any])
    
    inline def `setDelay-hideUndefined`: Self = StObject.set(x, "delay-hide", js.undefined)
    
    inline def `setDelay-show`(value: Double): Self = StObject.set(x, "delay-show", value.asInstanceOf[js.Any])
    
    inline def `setDelay-showUndefined`: Self = StObject.set(x, "delay-show", js.undefined)
    
    inline def setDropbar(value: Boolean): Self = StObject.set(x, "dropbar", value.asInstanceOf[js.Any])
    
    inline def `setDropbar-mode`(value: String): Self = StObject.set(x, "dropbar-mode", value.asInstanceOf[js.Any])
    
    inline def `setDropbar-modeUndefined`: Self = StObject.set(x, "dropbar-mode", js.undefined)
    
    inline def setDropbarUndefined: Self = StObject.set(x, "dropbar", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
  }
}
