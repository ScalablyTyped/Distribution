package typings.vegaTypings.typesSpecScaleMod

import typings.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseBandScale
  extends StObject
     with BaseScale {
  
  var align: js.UndefOr[Double | SignalRef] = js.undefined
  
  var padding: js.UndefOr[Double | SignalRef] = js.undefined
  
  var paddingOuter: js.UndefOr[Double | SignalRef] = js.undefined
  
  var range: js.UndefOr[RangeBand] = js.undefined
}
object BaseBandScale {
  
  inline def apply(name: String): BaseBandScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseBandScale]
  }
  
  extension [Self <: BaseBandScale](x: Self) {
    
    inline def setAlign(value: Double | SignalRef): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setPadding(value: Double | SignalRef): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingOuter(value: Double | SignalRef): Self = StObject.set(x, "paddingOuter", value.asInstanceOf[js.Any])
    
    inline def setPaddingOuterUndefined: Self = StObject.set(x, "paddingOuter", js.undefined)
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setRange(value: RangeBand): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setRangeVarargs(value: (Null | Boolean | String | Double | SignalRef | RangeRawArray)*): Self = StObject.set(x, "range", js.Array(value*))
  }
}
