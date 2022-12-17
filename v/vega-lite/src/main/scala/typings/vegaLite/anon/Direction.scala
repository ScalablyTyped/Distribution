package typings.vegaLite.anon

import typings.vegaTypings.typesSpecEncodeMod.Orientation
import typings.vegaTypings.typesSpecLegendMod.LegendOrient
import typings.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Direction extends StObject {
  
  var direction: Orientation
  
  var legendConfig: typings.vegaLite.buildSrcLegendMod.LegendConfig[SignalRef]
  
  var model: typings.vegaLite.buildSrcCompileModelMod.Model
  
  var orient: LegendOrient
  
  var scaleType: typings.vegaLite.buildSrcScaleMod.ScaleType
}
object Direction {
  
  inline def apply(
    direction: Orientation,
    legendConfig: typings.vegaLite.buildSrcLegendMod.LegendConfig[SignalRef],
    model: typings.vegaLite.buildSrcCompileModelMod.Model,
    orient: LegendOrient,
    scaleType: typings.vegaLite.buildSrcScaleMod.ScaleType
  ): Direction = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], legendConfig = legendConfig.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], orient = orient.asInstanceOf[js.Any], scaleType = scaleType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Direction]
  }
  
  extension [Self <: Direction](x: Self) {
    
    inline def setDirection(value: Orientation): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setLegendConfig(value: typings.vegaLite.buildSrcLegendMod.LegendConfig[SignalRef]): Self = StObject.set(x, "legendConfig", value.asInstanceOf[js.Any])
    
    inline def setModel(value: typings.vegaLite.buildSrcCompileModelMod.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setOrient(value: LegendOrient): Self = StObject.set(x, "orient", value.asInstanceOf[js.Any])
    
    inline def setScaleType(value: typings.vegaLite.buildSrcScaleMod.ScaleType): Self = StObject.set(x, "scaleType", value.asInstanceOf[js.Any])
  }
}
