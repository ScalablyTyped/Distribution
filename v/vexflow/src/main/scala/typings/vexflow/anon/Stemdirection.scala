package typings.vexflow.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Stemdirection extends StObject {
  
  var stem_direction: js.UndefOr[Double] = js.undefined
  
  var stem_extension: js.UndefOr[Double] = js.undefined
  
  var x_begin: js.UndefOr[Double] = js.undefined
  
  var x_end: js.UndefOr[Double] = js.undefined
  
  var y_bottom: js.UndefOr[Double] = js.undefined
  
  var y_extend: js.UndefOr[Double] = js.undefined
  
  var y_top: js.UndefOr[Double] = js.undefined
}
object Stemdirection {
  
  inline def apply(): Stemdirection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Stemdirection]
  }
  
  extension [Self <: Stemdirection](x: Self) {
    
    inline def setStem_direction(value: Double): Self = StObject.set(x, "stem_direction", value.asInstanceOf[js.Any])
    
    inline def setStem_directionUndefined: Self = StObject.set(x, "stem_direction", js.undefined)
    
    inline def setStem_extension(value: Double): Self = StObject.set(x, "stem_extension", value.asInstanceOf[js.Any])
    
    inline def setStem_extensionUndefined: Self = StObject.set(x, "stem_extension", js.undefined)
    
    inline def setX_begin(value: Double): Self = StObject.set(x, "x_begin", value.asInstanceOf[js.Any])
    
    inline def setX_beginUndefined: Self = StObject.set(x, "x_begin", js.undefined)
    
    inline def setX_end(value: Double): Self = StObject.set(x, "x_end", value.asInstanceOf[js.Any])
    
    inline def setX_endUndefined: Self = StObject.set(x, "x_end", js.undefined)
    
    inline def setY_bottom(value: Double): Self = StObject.set(x, "y_bottom", value.asInstanceOf[js.Any])
    
    inline def setY_bottomUndefined: Self = StObject.set(x, "y_bottom", js.undefined)
    
    inline def setY_extend(value: Double): Self = StObject.set(x, "y_extend", value.asInstanceOf[js.Any])
    
    inline def setY_extendUndefined: Self = StObject.set(x, "y_extend", js.undefined)
    
    inline def setY_top(value: Double): Self = StObject.set(x, "y_top", value.asInstanceOf[js.Any])
    
    inline def setY_topUndefined: Self = StObject.set(x, "y_top", js.undefined)
  }
}
