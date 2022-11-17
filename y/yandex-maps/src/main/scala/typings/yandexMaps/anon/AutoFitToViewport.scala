package typings.yandexMaps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoFitToViewport extends StObject {
  
  var autoFitToViewport: js.UndefOr["none" | "ifNull" | "always"] = js.undefined
  
  var controls: js.UndefOr[js.Array[String]] = js.undefined
  
  var direction: js.UndefOr[js.Array[Double] | String] = js.undefined
  
  var hotkeysEnabled: js.UndefOr[Boolean] = js.undefined
  
  var scrollZoomBehavior: js.UndefOr[Boolean] = js.undefined
  
  var span: js.UndefOr[js.Array[Double] | String] = js.undefined
  
  var suppressMapOpenBlock: js.UndefOr[Boolean] = js.undefined
}
object AutoFitToViewport {
  
  inline def apply(): AutoFitToViewport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoFitToViewport]
  }
  
  extension [Self <: AutoFitToViewport](x: Self) {
    
    inline def setAutoFitToViewport(value: "none" | "ifNull" | "always"): Self = StObject.set(x, "autoFitToViewport", value.asInstanceOf[js.Any])
    
    inline def setAutoFitToViewportUndefined: Self = StObject.set(x, "autoFitToViewport", js.undefined)
    
    inline def setControls(value: js.Array[String]): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
    
    inline def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
    
    inline def setControlsVarargs(value: String*): Self = StObject.set(x, "controls", js.Array(value*))
    
    inline def setDirection(value: js.Array[Double] | String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setDirectionVarargs(value: Double*): Self = StObject.set(x, "direction", js.Array(value*))
    
    inline def setHotkeysEnabled(value: Boolean): Self = StObject.set(x, "hotkeysEnabled", value.asInstanceOf[js.Any])
    
    inline def setHotkeysEnabledUndefined: Self = StObject.set(x, "hotkeysEnabled", js.undefined)
    
    inline def setScrollZoomBehavior(value: Boolean): Self = StObject.set(x, "scrollZoomBehavior", value.asInstanceOf[js.Any])
    
    inline def setScrollZoomBehaviorUndefined: Self = StObject.set(x, "scrollZoomBehavior", js.undefined)
    
    inline def setSpan(value: js.Array[Double] | String): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
    
    inline def setSpanUndefined: Self = StObject.set(x, "span", js.undefined)
    
    inline def setSpanVarargs(value: Double*): Self = StObject.set(x, "span", js.Array(value*))
    
    inline def setSuppressMapOpenBlock(value: Boolean): Self = StObject.set(x, "suppressMapOpenBlock", value.asInstanceOf[js.Any])
    
    inline def setSuppressMapOpenBlockUndefined: Self = StObject.set(x, "suppressMapOpenBlock", js.undefined)
  }
}
