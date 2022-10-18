package typings.vegaLite.anon

import typings.vegaLite.buildSrcChannelMod.PolarPositionScaleChannel
import typings.vegaLite.buildSrcChannelMod.PositionScaleChannel
import typings.vegaLite.buildSrcChanneldefMod.ChannelDef
import typings.vegaLite.buildSrcChanneldefMod.FieldDefWithoutScale
import typings.vegaLite.buildSrcChanneldefMod.OrderFieldDef
import typings.vegaLite.buildSrcChanneldefMod.SecondaryChannelDef
import typings.vegaLite.buildSrcChanneldefMod.StringFieldDef
import typings.vegaLite.buildSrcTypeMod.StandardType
import typings.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Channel extends StObject {
  
  var channel: PositionScaleChannel | PolarPositionScaleChannel
  
  var config: typings.vegaLite.buildSrcConfigMod.Config[SignalRef]
  
  var fieldDef: ChannelDef[String]
  
  var fieldDef2: js.UndefOr[SecondaryChannelDef[String]] = js.undefined
  
  var markDef: typings.vegaLite.buildSrcMarkMod.MarkDef[typings.vegaLite.buildSrcMarkMod.Mark, SignalRef]
  
  var scaleType: typings.vegaTypings.typesSpecScaleMod.ScaleType
  
  var useVlSizeChannel: js.UndefOr[Boolean] = js.undefined
}
object Channel {
  
  inline def apply(
    channel: PositionScaleChannel | PolarPositionScaleChannel,
    config: typings.vegaLite.buildSrcConfigMod.Config[SignalRef],
    markDef: typings.vegaLite.buildSrcMarkMod.MarkDef[typings.vegaLite.buildSrcMarkMod.Mark, SignalRef],
    scaleType: typings.vegaTypings.typesSpecScaleMod.ScaleType
  ): Channel = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], markDef = markDef.asInstanceOf[js.Any], scaleType = scaleType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Channel]
  }
  
  extension [Self <: Channel](x: Self) {
    
    inline def setChannel(value: PositionScaleChannel | PolarPositionScaleChannel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setConfig(value: typings.vegaLite.buildSrcConfigMod.Config[SignalRef]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setFieldDef(value: ChannelDef[String]): Self = StObject.set(x, "fieldDef", value.asInstanceOf[js.Any])
    
    inline def setFieldDef2(value: SecondaryChannelDef[String]): Self = StObject.set(x, "fieldDef2", value.asInstanceOf[js.Any])
    
    inline def setFieldDef2Undefined: Self = StObject.set(x, "fieldDef2", js.undefined)
    
    inline def setFieldDefNull: Self = StObject.set(x, "fieldDef", null)
    
    inline def setFieldDefUndefined: Self = StObject.set(x, "fieldDef", js.undefined)
    
    inline def setFieldDefVarargs(
      value: ((FieldDefWithoutScale[String, StandardType]) | OrderFieldDef[String] | StringFieldDef[String])*
    ): Self = StObject.set(x, "fieldDef", js.Array(value*))
    
    inline def setMarkDef(value: typings.vegaLite.buildSrcMarkMod.MarkDef[typings.vegaLite.buildSrcMarkMod.Mark, SignalRef]): Self = StObject.set(x, "markDef", value.asInstanceOf[js.Any])
    
    inline def setScaleType(value: typings.vegaTypings.typesSpecScaleMod.ScaleType): Self = StObject.set(x, "scaleType", value.asInstanceOf[js.Any])
    
    inline def setUseVlSizeChannel(value: Boolean): Self = StObject.set(x, "useVlSizeChannel", value.asInstanceOf[js.Any])
    
    inline def setUseVlSizeChannelUndefined: Self = StObject.set(x, "useVlSizeChannel", js.undefined)
  }
}
