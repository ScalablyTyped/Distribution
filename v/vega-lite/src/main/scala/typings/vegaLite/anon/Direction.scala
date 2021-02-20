package typings.vegaLite.anon

import typings.vegaTypings.encodeMod.Orientation
import typings.vegaTypings.legendMod.LegendOrient
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Direction extends StObject {
  
  var direction: Orientation = js.native
  
  var legendConfig: typings.vegaLite.legendMod.LegendConfig[SignalRef] = js.native
  
  var model: typings.vegaLite.modelMod.Model = js.native
  
  var orient: LegendOrient = js.native
  
  var scaleType: typings.vegaLite.scaleMod.ScaleType = js.native
}
object Direction {
  
  @scala.inline
  def apply(
    direction: Orientation,
    legendConfig: typings.vegaLite.legendMod.LegendConfig[SignalRef],
    model: typings.vegaLite.modelMod.Model,
    orient: LegendOrient,
    scaleType: typings.vegaLite.scaleMod.ScaleType
  ): Direction = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], legendConfig = legendConfig.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], orient = orient.asInstanceOf[js.Any], scaleType = scaleType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Direction]
  }
  
  @scala.inline
  implicit class DirectionMutableBuilder[Self <: Direction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirection(value: Orientation): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegendConfig(value: typings.vegaLite.legendMod.LegendConfig[SignalRef]): Self = StObject.set(x, "legendConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModel(value: typings.vegaLite.modelMod.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrient(value: LegendOrient): Self = StObject.set(x, "orient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleType(value: typings.vegaLite.scaleMod.ScaleType): Self = StObject.set(x, "scaleType", value.asInstanceOf[js.Any])
  }
}
