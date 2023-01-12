package typings.vegaLite.anon

import typings.vegaTypings.typesSpecLegendMod.LegendOrient
import typings.vegaTypings.typesSpecLegendMod.LegendType
import typings.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LegendConfig extends StObject {
  
  var legend: typings.vegaLite.buildSrcLegendMod.Legend[SignalRef]
  
  var legendConfig: typings.vegaLite.buildSrcLegendMod.LegendConfig[SignalRef]
  
  var legendType: LegendType
  
  var orient: LegendOrient
}
object LegendConfig {
  
  inline def apply(
    legend: typings.vegaLite.buildSrcLegendMod.Legend[SignalRef],
    legendConfig: typings.vegaLite.buildSrcLegendMod.LegendConfig[SignalRef],
    legendType: LegendType,
    orient: LegendOrient
  ): LegendConfig = {
    val __obj = js.Dynamic.literal(legend = legend.asInstanceOf[js.Any], legendConfig = legendConfig.asInstanceOf[js.Any], legendType = legendType.asInstanceOf[js.Any], orient = orient.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegendConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LegendConfig] (val x: Self) extends AnyVal {
    
    inline def setLegend(value: typings.vegaLite.buildSrcLegendMod.Legend[SignalRef]): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
    
    inline def setLegendConfig(value: typings.vegaLite.buildSrcLegendMod.LegendConfig[SignalRef]): Self = StObject.set(x, "legendConfig", value.asInstanceOf[js.Any])
    
    inline def setLegendType(value: LegendType): Self = StObject.set(x, "legendType", value.asInstanceOf[js.Any])
    
    inline def setOrient(value: LegendOrient): Self = StObject.set(x, "orient", value.asInstanceOf[js.Any])
  }
}
