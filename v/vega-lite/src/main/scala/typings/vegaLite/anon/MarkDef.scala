package typings.vegaLite.anon

import typings.vegaLite.buildSrcChannelMod.PolarPositionChannel
import typings.vegaLite.buildSrcChannelMod.PositionChannel
import typings.vegaLite.buildSrcCompileUnitMod.UnitModel
import typings.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarkDef extends StObject {
  
  var bandPosition: js.UndefOr[Double] = js.undefined
  
  var channel: PositionChannel | PolarPositionChannel
  
  var encoding: js.UndefOr[typings.vegaLite.buildSrcEncodingMod.Encoding[String]] = js.undefined
  
  var markDef: typings.vegaLite.buildSrcMarkMod.MarkDef[typings.vegaLite.buildSrcMarkMod.Mark, SignalRef]
  
  var model: js.UndefOr[UnitModel] = js.undefined
}
object MarkDef {
  
  inline def apply(
    channel: PositionChannel | PolarPositionChannel,
    markDef: typings.vegaLite.buildSrcMarkMod.MarkDef[typings.vegaLite.buildSrcMarkMod.Mark, SignalRef]
  ): MarkDef = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], markDef = markDef.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkDef]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MarkDef] (val x: Self) extends AnyVal {
    
    inline def setBandPosition(value: Double): Self = StObject.set(x, "bandPosition", value.asInstanceOf[js.Any])
    
    inline def setBandPositionUndefined: Self = StObject.set(x, "bandPosition", js.undefined)
    
    inline def setChannel(value: PositionChannel | PolarPositionChannel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setEncoding(value: typings.vegaLite.buildSrcEncodingMod.Encoding[String]): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    inline def setMarkDef(value: typings.vegaLite.buildSrcMarkMod.MarkDef[typings.vegaLite.buildSrcMarkMod.Mark, SignalRef]): Self = StObject.set(x, "markDef", value.asInstanceOf[js.Any])
    
    inline def setModel(value: UnitModel): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
  }
}
