package typings.vegaLite.anon

import typings.vegaLite.channelMod.PolarPositionChannel
import typings.vegaLite.channelMod.PositionChannel
import typings.vegaLite.scaleComponentMod.ScaleComponent
import typings.vegaLite.unitMod.UnitModel
import typings.vegaLite.vegaLiteStrings.mid
import typings.vegaLite.vegaLiteStrings.zeroOrMax
import typings.vegaLite.vegaLiteStrings.zeroOrMin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Model extends StObject {
  
  var channel: PositionChannel | PolarPositionChannel = js.native
  
  var defaultPos: mid | zeroOrMin | zeroOrMax | Null = js.native
  
  var model: UnitModel = js.native
  
  var scale: ScaleComponent = js.native
  
  var scaleName: String = js.native
}
object Model {
  
  @scala.inline
  def apply(
    channel: PositionChannel | PolarPositionChannel,
    model: UnitModel,
    scale: ScaleComponent,
    scaleName: String
  ): Model = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], scaleName = scaleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
  
  @scala.inline
  implicit class ModelMutableBuilder[Self <: Model] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannel(value: PositionChannel | PolarPositionChannel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPos(value: mid | zeroOrMin | zeroOrMax): Self = StObject.set(x, "defaultPos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPosNull: Self = StObject.set(x, "defaultPos", null)
    
    @scala.inline
    def setModel(value: UnitModel): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScale(value: ScaleComponent): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleName(value: String): Self = StObject.set(x, "scaleName", value.asInstanceOf[js.Any])
  }
}
