package typings.vegaLite.anon

import typings.vegaLite.buildSrcChannelMod.PolarPositionChannel
import typings.vegaLite.buildSrcChannelMod.PositionChannel
import typings.vegaLite.buildSrcExprMod.ExprRef
import typings.vegaLite.buildSrcVegaDotschemaMod.VgValueRef
import typings.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ref extends StObject {
  
  var channel: PositionChannel | PolarPositionChannel
  
  var config: typings.vegaLite.buildSrcConfigMod.Config[SignalRef]
  
  var fieldDef: typings.vegaLite.buildSrcChanneldefMod.FieldDef[String, Any]
  
  var markDef: typings.vegaLite.buildSrcMarkMod.MarkDef[typings.vegaLite.buildSrcMarkMod.Mark, ExprRef | SignalRef]
  
  var ref: VgValueRef
}
object Ref {
  
  inline def apply(
    channel: PositionChannel | PolarPositionChannel,
    config: typings.vegaLite.buildSrcConfigMod.Config[SignalRef],
    fieldDef: typings.vegaLite.buildSrcChanneldefMod.FieldDef[String, Any],
    markDef: typings.vegaLite.buildSrcMarkMod.MarkDef[typings.vegaLite.buildSrcMarkMod.Mark, ExprRef | SignalRef],
    ref: VgValueRef
  ): Ref = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], fieldDef = fieldDef.asInstanceOf[js.Any], markDef = markDef.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ref]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ref] (val x: Self) extends AnyVal {
    
    inline def setChannel(value: PositionChannel | PolarPositionChannel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setConfig(value: typings.vegaLite.buildSrcConfigMod.Config[SignalRef]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setFieldDef(value: typings.vegaLite.buildSrcChanneldefMod.FieldDef[String, Any]): Self = StObject.set(x, "fieldDef", value.asInstanceOf[js.Any])
    
    inline def setMarkDef(
      value: typings.vegaLite.buildSrcMarkMod.MarkDef[typings.vegaLite.buildSrcMarkMod.Mark, ExprRef | SignalRef]
    ): Self = StObject.set(x, "markDef", value.asInstanceOf[js.Any])
    
    inline def setRef(value: VgValueRef): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
  }
}
