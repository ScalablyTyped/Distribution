package typings.vegaLite.anon

import typings.vegaLite.channelMod.PolarPositionChannel
import typings.vegaLite.channelMod.PositionChannel
import typings.vegaLite.exprMod.ExprRef
import typings.vegaLite.srcMarkMod.Mark
import typings.vegaLite.vegaSchemaMod.VgValueRef
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MarkDef extends StObject {
  
  var channel: PositionChannel | PolarPositionChannel = js.native
  
  var config: typings.vegaLite.srcConfigMod.Config[SignalRef] = js.native
  
  var fieldDef: typings.vegaLite.channeldefMod.FieldDef[String, _] = js.native
  
  var markDef: typings.vegaLite.srcMarkMod.MarkDef[Mark, ExprRef | SignalRef] = js.native
  
  var ref: VgValueRef = js.native
}
object MarkDef {
  
  @scala.inline
  def apply(
    channel: PositionChannel | PolarPositionChannel,
    config: typings.vegaLite.srcConfigMod.Config[SignalRef],
    fieldDef: typings.vegaLite.channeldefMod.FieldDef[String, _],
    markDef: typings.vegaLite.srcMarkMod.MarkDef[Mark, ExprRef | SignalRef],
    ref: VgValueRef
  ): MarkDef = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], fieldDef = fieldDef.asInstanceOf[js.Any], markDef = markDef.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkDef]
  }
  
  @scala.inline
  implicit class MarkDefMutableBuilder[Self <: MarkDef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannel(value: PositionChannel | PolarPositionChannel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfig(value: typings.vegaLite.srcConfigMod.Config[SignalRef]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldDef(value: typings.vegaLite.channeldefMod.FieldDef[String, _]): Self = StObject.set(x, "fieldDef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkDef(value: typings.vegaLite.srcMarkMod.MarkDef[Mark, ExprRef | SignalRef]): Self = StObject.set(x, "markDef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRef(value: VgValueRef): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
  }
}
