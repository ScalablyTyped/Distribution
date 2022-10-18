package typings.vegaLite.anon

import typings.vegaLite.buildSrcChanneldefMod.ChannelDef
import typings.vegaLite.buildSrcChanneldefMod.FieldDefWithoutScale
import typings.vegaLite.buildSrcChanneldefMod.OrderFieldDef
import typings.vegaLite.buildSrcChanneldefMod.SecondaryChannelDef
import typings.vegaLite.buildSrcChanneldefMod.StringFieldDef
import typings.vegaLite.buildSrcCompileScaleComponentMod.ScaleComponent
import typings.vegaLite.buildSrcStackMod.StackProperties
import typings.vegaLite.buildSrcTypeMod.StandardType
import typings.vegaLite.buildSrcVegaDotschemaMod.VgValueRef
import typings.vegaLite.vegaLiteStrings.radius2
import typings.vegaLite.vegaLiteStrings.theta2
import typings.vegaLite.vegaLiteStrings.x2
import typings.vegaLite.vegaLiteStrings.y2
import typings.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined vega-lite.vega-lite/build/src/compile/mark/encode/valueref.MidPointParams & {  channel :'x2' | 'y2' | 'radius2' | 'theta2'} */
trait MidPointParamschannelx2y2 extends StObject {
  
  var bandPosition: js.UndefOr[Double | SignalRef] = js.undefined
  
  var channel: typings.vegaLite.buildSrcChannelMod.Channel & (x2 | y2 | radius2 | theta2)
  
  var channel2Def: js.UndefOr[SecondaryChannelDef[String]] = js.undefined
  
  var channelDef: ChannelDef[String]
  
  var config: typings.vegaLite.buildSrcConfigMod.Config[SignalRef]
  
  var defaultRef: VgValueRef | js.Function0[VgValueRef]
  
  var markDef: typings.vegaLite.buildSrcMarkMod.MarkDef[typings.vegaLite.buildSrcMarkMod.Mark, SignalRef]
  
  var offset: js.UndefOr[Double | SignalRef | VgValueRef] = js.undefined
  
  var scale: ScaleComponent
  
  var scaleName: String
  
  var stack: js.UndefOr[StackProperties] = js.undefined
}
object MidPointParamschannelx2y2 {
  
  inline def apply(
    channel: typings.vegaLite.buildSrcChannelMod.Channel & (x2 | y2 | radius2 | theta2),
    config: typings.vegaLite.buildSrcConfigMod.Config[SignalRef],
    defaultRef: VgValueRef | js.Function0[VgValueRef],
    markDef: typings.vegaLite.buildSrcMarkMod.MarkDef[typings.vegaLite.buildSrcMarkMod.Mark, SignalRef],
    scale: ScaleComponent,
    scaleName: String
  ): MidPointParamschannelx2y2 = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], defaultRef = defaultRef.asInstanceOf[js.Any], markDef = markDef.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], scaleName = scaleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MidPointParamschannelx2y2]
  }
  
  extension [Self <: MidPointParamschannelx2y2](x: Self) {
    
    inline def setBandPosition(value: Double | SignalRef): Self = StObject.set(x, "bandPosition", value.asInstanceOf[js.Any])
    
    inline def setBandPositionUndefined: Self = StObject.set(x, "bandPosition", js.undefined)
    
    inline def setChannel(value: typings.vegaLite.buildSrcChannelMod.Channel & (x2 | y2 | radius2 | theta2)): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setChannel2Def(value: SecondaryChannelDef[String]): Self = StObject.set(x, "channel2Def", value.asInstanceOf[js.Any])
    
    inline def setChannel2DefUndefined: Self = StObject.set(x, "channel2Def", js.undefined)
    
    inline def setChannelDef(value: ChannelDef[String]): Self = StObject.set(x, "channelDef", value.asInstanceOf[js.Any])
    
    inline def setChannelDefNull: Self = StObject.set(x, "channelDef", null)
    
    inline def setChannelDefUndefined: Self = StObject.set(x, "channelDef", js.undefined)
    
    inline def setChannelDefVarargs(
      value: ((FieldDefWithoutScale[String, StandardType]) | OrderFieldDef[String] | StringFieldDef[String])*
    ): Self = StObject.set(x, "channelDef", js.Array(value*))
    
    inline def setConfig(value: typings.vegaLite.buildSrcConfigMod.Config[SignalRef]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setDefaultRef(value: VgValueRef | js.Function0[VgValueRef]): Self = StObject.set(x, "defaultRef", value.asInstanceOf[js.Any])
    
    inline def setDefaultRefFunction0(value: () => VgValueRef): Self = StObject.set(x, "defaultRef", js.Any.fromFunction0(value))
    
    inline def setMarkDef(value: typings.vegaLite.buildSrcMarkMod.MarkDef[typings.vegaLite.buildSrcMarkMod.Mark, SignalRef]): Self = StObject.set(x, "markDef", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Double | SignalRef | VgValueRef): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setScale(value: ScaleComponent): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleName(value: String): Self = StObject.set(x, "scaleName", value.asInstanceOf[js.Any])
    
    inline def setStack(value: StackProperties): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
  }
}
