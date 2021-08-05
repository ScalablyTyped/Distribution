package typings.swiper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MousewheelOptions extends StObject {
  
  var eventsTarged: js.UndefOr[SelectableElement] = js.undefined
  
  var forceToAxis: js.UndefOr[Boolean] = js.undefined
  
  var invert: js.UndefOr[Boolean] = js.undefined
  
  var releaseOnEdges: js.UndefOr[Boolean] = js.undefined
  
  var sensitivity: js.UndefOr[Double] = js.undefined
}
object MousewheelOptions {
  
  inline def apply(): MousewheelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MousewheelOptions]
  }
  
  extension [Self <: MousewheelOptions](x: Self) {
    
    inline def setEventsTarged(value: SelectableElement): Self = StObject.set(x, "eventsTarged", value.asInstanceOf[js.Any])
    
    inline def setEventsTargedUndefined: Self = StObject.set(x, "eventsTarged", js.undefined)
    
    inline def setForceToAxis(value: Boolean): Self = StObject.set(x, "forceToAxis", value.asInstanceOf[js.Any])
    
    inline def setForceToAxisUndefined: Self = StObject.set(x, "forceToAxis", js.undefined)
    
    inline def setInvert(value: Boolean): Self = StObject.set(x, "invert", value.asInstanceOf[js.Any])
    
    inline def setInvertUndefined: Self = StObject.set(x, "invert", js.undefined)
    
    inline def setReleaseOnEdges(value: Boolean): Self = StObject.set(x, "releaseOnEdges", value.asInstanceOf[js.Any])
    
    inline def setReleaseOnEdgesUndefined: Self = StObject.set(x, "releaseOnEdges", js.undefined)
    
    inline def setSensitivity(value: Double): Self = StObject.set(x, "sensitivity", value.asInstanceOf[js.Any])
    
    inline def setSensitivityUndefined: Self = StObject.set(x, "sensitivity", js.undefined)
  }
}
