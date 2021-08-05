package typings.vegaLite.anon

import typings.vegaTypings.legendMod.LegendOrient
import typings.vegaTypings.legendMod.LegendType
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LegendConfig extends StObject {
  
  var legend: typings.vegaLite.legendMod.Legend[SignalRef]
  
  var legendConfig: typings.vegaLite.legendMod.LegendConfig[SignalRef]
  
  var legendType: LegendType
  
  var orient: LegendOrient
}
object LegendConfig {
  
  inline def apply(
    legend: typings.vegaLite.legendMod.Legend[SignalRef],
    legendConfig: typings.vegaLite.legendMod.LegendConfig[SignalRef],
    legendType: LegendType,
    orient: LegendOrient
  ): LegendConfig = {
    val __obj = js.Dynamic.literal(legend = legend.asInstanceOf[js.Any], legendConfig = legendConfig.asInstanceOf[js.Any], legendType = legendType.asInstanceOf[js.Any], orient = orient.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegendConfig]
  }
  
  extension [Self <: LegendConfig](x: Self) {
    
    inline def setLegend(value: typings.vegaLite.legendMod.Legend[SignalRef]): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
    
    inline def setLegendConfig(value: typings.vegaLite.legendMod.LegendConfig[SignalRef]): Self = StObject.set(x, "legendConfig", value.asInstanceOf[js.Any])
    
    inline def setLegendType(value: LegendType): Self = StObject.set(x, "legendType", value.asInstanceOf[js.Any])
    
    inline def setOrient(value: LegendOrient): Self = StObject.set(x, "orient", value.asInstanceOf[js.Any])
  }
}
