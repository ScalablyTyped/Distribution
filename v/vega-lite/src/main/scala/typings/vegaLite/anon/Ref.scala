package typings.vegaLite.anon

import typings.vegaLite.channelMod.PolarPositionChannel
import typings.vegaLite.channelMod.PositionChannel
import typings.vegaLite.exprMod.ExprRef
import typings.vegaLite.vegaSchemaMod.VgValueRef
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ref extends StObject {
  
  var channel: PositionChannel | PolarPositionChannel
  
  var config: typings.vegaLite.srcConfigMod.Config[SignalRef]
  
  var fieldDef: typings.vegaLite.channeldefMod.FieldDef[String, Any]
  
  var markDef: typings.vegaLite.srcMarkMod.MarkDef[typings.vegaLite.srcMarkMod.Mark, ExprRef | SignalRef]
  
  var ref: VgValueRef
}
object Ref {
  
  inline def apply(
    channel: PositionChannel | PolarPositionChannel,
    config: typings.vegaLite.srcConfigMod.Config[SignalRef],
    fieldDef: typings.vegaLite.channeldefMod.FieldDef[String, Any],
    markDef: typings.vegaLite.srcMarkMod.MarkDef[typings.vegaLite.srcMarkMod.Mark, ExprRef | SignalRef],
    ref: VgValueRef
  ): Ref = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], fieldDef = fieldDef.asInstanceOf[js.Any], markDef = markDef.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ref]
  }
  
  extension [Self <: Ref](x: Self) {
    
    inline def setChannel(value: PositionChannel | PolarPositionChannel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setConfig(value: typings.vegaLite.srcConfigMod.Config[SignalRef]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setFieldDef(value: typings.vegaLite.channeldefMod.FieldDef[String, Any]): Self = StObject.set(x, "fieldDef", value.asInstanceOf[js.Any])
    
    inline def setMarkDef(value: typings.vegaLite.srcMarkMod.MarkDef[typings.vegaLite.srcMarkMod.Mark, ExprRef | SignalRef]): Self = StObject.set(x, "markDef", value.asInstanceOf[js.Any])
    
    inline def setRef(value: VgValueRef): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
  }
}
