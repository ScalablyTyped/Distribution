package typings.vegaTypings.encodeMod

import typings.vegaTypings.anon.Test
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageEncodeEntry
  extends StObject
     with EncodeEntry
     with AlignProperty {
  
  var aspect: js.UndefOr[ProductionRule[BooleanValueRef]] = js.undefined
  
  var baseline: js.UndefOr[ProductionRule[ScaledValueRef[Baseline]]] = js.undefined
  
  var smooth: js.UndefOr[ProductionRule[BooleanValueRef]] = js.undefined
  
  var url: js.UndefOr[ProductionRule[StringValueRef]] = js.undefined
}
object ImageEncodeEntry {
  
  inline def apply(): ImageEncodeEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageEncodeEntry]
  }
  
  extension [Self <: ImageEncodeEntry](x: Self) {
    
    inline def setAspect(value: ProductionRule[BooleanValueRef]): Self = StObject.set(x, "aspect", value.asInstanceOf[js.Any])
    
    inline def setAspectUndefined: Self = StObject.set(x, "aspect", js.undefined)
    
    inline def setAspectVarargs(value: (Test & BooleanValueRef)*): Self = StObject.set(x, "aspect", js.Array(value :_*))
    
    inline def setBaseline(value: ProductionRule[ScaledValueRef[Baseline]]): Self = StObject.set(x, "baseline", value.asInstanceOf[js.Any])
    
    inline def setBaselineUndefined: Self = StObject.set(x, "baseline", js.undefined)
    
    inline def setBaselineVarargs(value: (Test & ScaledValueRef[Baseline])*): Self = StObject.set(x, "baseline", js.Array(value :_*))
    
    inline def setSmooth(value: ProductionRule[BooleanValueRef]): Self = StObject.set(x, "smooth", value.asInstanceOf[js.Any])
    
    inline def setSmoothUndefined: Self = StObject.set(x, "smooth", js.undefined)
    
    inline def setSmoothVarargs(value: (Test & BooleanValueRef)*): Self = StObject.set(x, "smooth", js.Array(value :_*))
    
    inline def setUrl(value: ProductionRule[StringValueRef]): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setUrlVarargs(value: (Test & StringValueRef)*): Self = StObject.set(x, "url", js.Array(value :_*))
  }
}
