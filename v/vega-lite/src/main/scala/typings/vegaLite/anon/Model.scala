package typings.vegaLite.anon

import typings.vegaLite.buildSrcChannelMod.PolarPositionChannel
import typings.vegaLite.buildSrcChannelMod.PositionChannel
import typings.vegaLite.buildSrcCompileScaleComponentMod.ScaleComponent
import typings.vegaLite.buildSrcCompileUnitMod.UnitModel
import typings.vegaLite.vegaLiteStrings.mid
import typings.vegaLite.vegaLiteStrings.zeroOrMax
import typings.vegaLite.vegaLiteStrings.zeroOrMin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Model extends StObject {
  
  var channel: PositionChannel | PolarPositionChannel
  
  var defaultPos: mid | zeroOrMin | zeroOrMax | Null
  
  var model: UnitModel
  
  var scale: ScaleComponent
  
  var scaleName: String
}
object Model {
  
  inline def apply(
    channel: PositionChannel | PolarPositionChannel,
    model: UnitModel,
    scale: ScaleComponent,
    scaleName: String
  ): Model = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], scaleName = scaleName.asInstanceOf[js.Any], defaultPos = null)
    __obj.asInstanceOf[Model]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Model] (val x: Self) extends AnyVal {
    
    inline def setChannel(value: PositionChannel | PolarPositionChannel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setDefaultPos(value: mid | zeroOrMin | zeroOrMax): Self = StObject.set(x, "defaultPos", value.asInstanceOf[js.Any])
    
    inline def setDefaultPosNull: Self = StObject.set(x, "defaultPos", null)
    
    inline def setModel(value: UnitModel): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setScale(value: ScaleComponent): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleName(value: String): Self = StObject.set(x, "scaleName", value.asInstanceOf[js.Any])
  }
}
