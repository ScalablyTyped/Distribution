package typings.vegaLite.anon

import typings.vegaLite.binMod.BinParams
import typings.vegaLite.channelMod.PolarPositionChannel
import typings.vegaLite.channelMod.PositionChannel
import typings.vegaLite.channeldefMod.TypedFieldDef
import typings.vegaLite.exprMod.ExprRef
import typings.vegaLite.srcMarkMod.Mark
import typings.vegaLite.vegaLiteStrings.binned
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldDef extends StObject {
  
  var band: Double
  
  var channel: PositionChannel | PolarPositionChannel
  
  var config: js.UndefOr[typings.vegaLite.srcConfigMod.Config[SignalRef]] = js.undefined
  
  var fieldDef: TypedFieldDef[String, js.Any, Boolean | BinParams | binned | Null]
  
  var markDef: typings.vegaLite.srcMarkMod.MarkDef[Mark, ExprRef | SignalRef]
  
  var offset: js.UndefOr[Double | SignalRef] = js.undefined
  
  var scaleName: String
}
object FieldDef {
  
  inline def apply(
    band: Double,
    channel: PositionChannel | PolarPositionChannel,
    fieldDef: TypedFieldDef[String, js.Any, Boolean | BinParams | binned | Null],
    markDef: typings.vegaLite.srcMarkMod.MarkDef[Mark, ExprRef | SignalRef],
    scaleName: String
  ): FieldDef = {
    val __obj = js.Dynamic.literal(band = band.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], fieldDef = fieldDef.asInstanceOf[js.Any], markDef = markDef.asInstanceOf[js.Any], scaleName = scaleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldDef]
  }
  
  extension [Self <: FieldDef](x: Self) {
    
    inline def setBand(value: Double): Self = StObject.set(x, "band", value.asInstanceOf[js.Any])
    
    inline def setChannel(value: PositionChannel | PolarPositionChannel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setConfig(value: typings.vegaLite.srcConfigMod.Config[SignalRef]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setFieldDef(value: TypedFieldDef[String, js.Any, Boolean | BinParams | binned | Null]): Self = StObject.set(x, "fieldDef", value.asInstanceOf[js.Any])
    
    inline def setMarkDef(value: typings.vegaLite.srcMarkMod.MarkDef[Mark, ExprRef | SignalRef]): Self = StObject.set(x, "markDef", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Double | SignalRef): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setScaleName(value: String): Self = StObject.set(x, "scaleName", value.asInstanceOf[js.Any])
  }
}
