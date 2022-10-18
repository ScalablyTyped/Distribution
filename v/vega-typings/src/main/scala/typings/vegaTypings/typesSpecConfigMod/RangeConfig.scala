package typings.vegaTypings.typesSpecConfigMod

import org.scalablytyped.runtime.StringDictionary
import typings.vegaTypings.typesSpecColorMod.Color
import typings.vegaTypings.typesSpecEncodeMod.SymbolShape
import typings.vegaTypings.typesSpecScaleMod.RangeRawArray
import typings.vegaTypings.typesSpecScaleMod.RangeScheme
import typings.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RangeConfig
  extends StObject
     with /* name */ StringDictionary[RangeScheme | (js.Array[Boolean | Double | String | SymbolShape])] {
  
  /**
    * Default [color scheme](https://vega.github.io/vega/docs/schemes/) for categorical data.
    */
  var category: js.UndefOr[RangeScheme | js.Array[Color]] = js.undefined
  
  /**
    * Default [color scheme](https://vega.github.io/vega/docs/schemes/) for diverging quantitative ramps.
    */
  var diverging: js.UndefOr[RangeScheme | js.Array[Color]] = js.undefined
  
  /**
    * Default [color scheme](https://vega.github.io/vega/docs/schemes/) for quantitative heatmaps.
    */
  var heatmap: js.UndefOr[RangeScheme | js.Array[Color]] = js.undefined
  
  /**
    * Default [color scheme](https://vega.github.io/vega/docs/schemes/) for rank-ordered data.
    */
  var ordinal: js.UndefOr[RangeScheme | js.Array[Color]] = js.undefined
  
  /**
    * Default [color scheme](https://vega.github.io/vega/docs/schemes/) for sequential quantitative ramps.
    */
  var ramp: js.UndefOr[RangeScheme | js.Array[Color]] = js.undefined
  
  /**
    * Array of [symbol](https://vega.github.io/vega/docs/marks/symbol/) names or paths for the default shape palette.
    */
  var symbol: js.UndefOr[js.Array[SymbolShape]] = js.undefined
}
object RangeConfig {
  
  inline def apply(): RangeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeConfig]
  }
  
  extension [Self <: RangeConfig](x: Self) {
    
    inline def setCategory(value: RangeScheme | js.Array[Color]): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setCategoryVarargs(value: (Boolean | Color | Double | Null | RangeRawArray | SignalRef | String)*): Self = StObject.set(x, "category", js.Array(value*))
    
    inline def setDiverging(value: RangeScheme | js.Array[Color]): Self = StObject.set(x, "diverging", value.asInstanceOf[js.Any])
    
    inline def setDivergingUndefined: Self = StObject.set(x, "diverging", js.undefined)
    
    inline def setDivergingVarargs(value: (Boolean | Color | Double | Null | RangeRawArray | SignalRef | String)*): Self = StObject.set(x, "diverging", js.Array(value*))
    
    inline def setHeatmap(value: RangeScheme | js.Array[Color]): Self = StObject.set(x, "heatmap", value.asInstanceOf[js.Any])
    
    inline def setHeatmapUndefined: Self = StObject.set(x, "heatmap", js.undefined)
    
    inline def setHeatmapVarargs(value: (Boolean | Color | Double | Null | RangeRawArray | SignalRef | String)*): Self = StObject.set(x, "heatmap", js.Array(value*))
    
    inline def setOrdinal(value: RangeScheme | js.Array[Color]): Self = StObject.set(x, "ordinal", value.asInstanceOf[js.Any])
    
    inline def setOrdinalUndefined: Self = StObject.set(x, "ordinal", js.undefined)
    
    inline def setOrdinalVarargs(value: (Boolean | Color | Double | Null | RangeRawArray | SignalRef | String)*): Self = StObject.set(x, "ordinal", js.Array(value*))
    
    inline def setRamp(value: RangeScheme | js.Array[Color]): Self = StObject.set(x, "ramp", value.asInstanceOf[js.Any])
    
    inline def setRampUndefined: Self = StObject.set(x, "ramp", js.undefined)
    
    inline def setRampVarargs(value: (Boolean | Color | Double | Null | RangeRawArray | SignalRef | String)*): Self = StObject.set(x, "ramp", js.Array(value*))
    
    inline def setSymbol(value: js.Array[SymbolShape]): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    inline def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
    
    inline def setSymbolVarargs(value: SymbolShape*): Self = StObject.set(x, "symbol", js.Array(value*))
  }
}
