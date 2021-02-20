package typings.vegaLite.anon

import typings.vegaLite.channeldefMod.DatumDef
import typings.vegaLite.channeldefMod.PrimitiveValue
import typings.vegaLite.channeldefMod.SecondaryChannelDef
import typings.vegaLite.datetimeMod.DateTime
import typings.vegaLite.exprMod.ExprRef
import typings.vegaLite.srcMarkMod.Mark
import typings.vegaLite.srcStackMod.StackProperties
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Channel extends StObject {
  
  var channel: typings.vegaLite.channelMod.Channel = js.native
  
  var config: typings.vegaLite.srcConfigMod.Config[SignalRef] = js.native
  
  var fieldDef: (typings.vegaLite.channeldefMod.FieldDef[String, _]) | (DatumDef[String, PrimitiveValue | DateTime | ExprRef | SignalRef]) = js.native
  
  var fieldDef2: js.UndefOr[SecondaryChannelDef[String]] = js.native
  
  var isMidPoint: js.UndefOr[Boolean] = js.native
  
  var markDef: typings.vegaLite.srcMarkMod.MarkDef[Mark, SignalRef] = js.native
  
  var stack: StackProperties = js.native
}
object Channel {
  
  @scala.inline
  def apply(
    channel: typings.vegaLite.channelMod.Channel,
    config: typings.vegaLite.srcConfigMod.Config[SignalRef],
    fieldDef: (typings.vegaLite.channeldefMod.FieldDef[String, _]) | (DatumDef[String, PrimitiveValue | DateTime | ExprRef | SignalRef]),
    markDef: typings.vegaLite.srcMarkMod.MarkDef[Mark, SignalRef],
    stack: StackProperties
  ): Channel = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], fieldDef = fieldDef.asInstanceOf[js.Any], markDef = markDef.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[Channel]
  }
  
  @scala.inline
  implicit class ChannelMutableBuilder[Self <: Channel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannel(value: typings.vegaLite.channelMod.Channel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfig(value: typings.vegaLite.srcConfigMod.Config[SignalRef]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldDef(
      value: (typings.vegaLite.channeldefMod.FieldDef[String, _]) | (DatumDef[String, PrimitiveValue | DateTime | ExprRef | SignalRef])
    ): Self = StObject.set(x, "fieldDef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldDef2(value: SecondaryChannelDef[String]): Self = StObject.set(x, "fieldDef2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldDef2Undefined: Self = StObject.set(x, "fieldDef2", js.undefined)
    
    @scala.inline
    def setIsMidPoint(value: Boolean): Self = StObject.set(x, "isMidPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMidPointUndefined: Self = StObject.set(x, "isMidPoint", js.undefined)
    
    @scala.inline
    def setMarkDef(value: typings.vegaLite.srcMarkMod.MarkDef[Mark, SignalRef]): Self = StObject.set(x, "markDef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStack(value: StackProperties): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
  }
}
