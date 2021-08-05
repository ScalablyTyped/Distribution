package typings.vegaLite

import typings.vegaLite.anon.BandOffset
import typings.vegaLite.anon.FieldGroup
import typings.vegaLite.anon.FieldOrDatumDef2
import typings.vegaLite.anon.FieldTest
import typings.vegaLite.anon.MarkDef
import typings.vegaLite.anon.MidPointParamschannelPosi
import typings.vegaLite.anon.TestValue
import typings.vegaLite.anon.ValueValue
import typings.vegaLite.binMod.Bin
import typings.vegaLite.channelMod.Channel
import typings.vegaLite.channelMod.PolarPositionChannel
import typings.vegaLite.channelMod.PositionChannel
import typings.vegaLite.channeldefMod.ChannelDef
import typings.vegaLite.channeldefMod.DatumDef
import typings.vegaLite.channeldefMod.FieldDef
import typings.vegaLite.channeldefMod.FieldDefBase
import typings.vegaLite.channeldefMod.FieldDefWithoutScale
import typings.vegaLite.channeldefMod.FieldName
import typings.vegaLite.channeldefMod.FieldRefOption
import typings.vegaLite.channeldefMod.OrderFieldDef
import typings.vegaLite.channeldefMod.PrimitiveValue
import typings.vegaLite.channeldefMod.SecondaryChannelDef
import typings.vegaLite.channeldefMod.StringFieldDef
import typings.vegaLite.channeldefMod.Value
import typings.vegaLite.datetimeMod.DateTime
import typings.vegaLite.exprMod.ExprRef
import typings.vegaLite.scaleComponentMod.ScaleComponent
import typings.vegaLite.srcConfigMod.Config
import typings.vegaLite.srcMarkMod.Mark
import typings.vegaLite.srcStackMod.StackProperties
import typings.vegaLite.srcTypeMod.StandardType
import typings.vegaLite.vegaSchemaMod.VgValueRef
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object valuerefMod {
  
  @JSImport("vega-lite/build/src/compile/mark/encode/valueref", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def datumDefToExpr(datumDef: DatumDef[String, PrimitiveValue | DateTime | ExprRef | SignalRef]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("datumDefToExpr")(datumDef.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def fieldInvalidPredicate(field: FieldDef[String, js.Any]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fieldInvalidPredicate")(field.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def fieldInvalidPredicate(field: FieldDef[String, js.Any], invalid: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("fieldInvalidPredicate")(field.asInstanceOf[js.Any], invalid.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def fieldInvalidPredicate(field: FieldName): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fieldInvalidPredicate")(field.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def fieldInvalidPredicate(field: FieldName, invalid: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("fieldInvalidPredicate")(field.asInstanceOf[js.Any], invalid.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def fieldInvalidTestValueRef(fieldDef: FieldDef[String, js.Any], channel: PolarPositionChannel): FieldTest | TestValue = (^.asInstanceOf[js.Dynamic].applyDynamic("fieldInvalidTestValueRef")(fieldDef.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[FieldTest | TestValue]
  inline def fieldInvalidTestValueRef(fieldDef: FieldDef[String, js.Any], channel: PositionChannel): FieldTest | TestValue = (^.asInstanceOf[js.Dynamic].applyDynamic("fieldInvalidTestValueRef")(fieldDef.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[FieldTest | TestValue]
  
  inline def interpolatedSignalRef(hasScaleNameFieldOrDatumDefFieldOrDatumDef2OffsetStartSuffixBand: FieldOrDatumDef2): VgValueRef = ^.asInstanceOf[js.Dynamic].applyDynamic("interpolatedSignalRef")(hasScaleNameFieldOrDatumDefFieldOrDatumDef2OffsetStartSuffixBand.asInstanceOf[js.Any]).asInstanceOf[VgValueRef]
  
  inline def midPoint(
    hasChannelChannelDefChannel2DefMarkDefConfigScaleNameScaleStackOffsetDefaultRefBand: MidPointParams
  ): VgValueRef = ^.asInstanceOf[js.Dynamic].applyDynamic("midPoint")(hasChannelChannelDefChannel2DefMarkDefConfigScaleNameScaleStackOffsetDefaultRefBand.asInstanceOf[js.Any]).asInstanceOf[VgValueRef]
  
  inline def midPointRefWithPositionInvalidTest(params: MidPointParamschannelPosi): VgValueRef | js.Array[VgValueRef] = ^.asInstanceOf[js.Dynamic].applyDynamic("midPointRefWithPositionInvalidTest")(params.asInstanceOf[js.Any]).asInstanceOf[VgValueRef | js.Array[VgValueRef]]
  
  inline def valueRefForFieldOrDatumDef(
    fieldDef: DatumDef[String, PrimitiveValue | DateTime | ExprRef | SignalRef],
    scaleName: String,
    opt: FieldRefOption,
    encode: BandOffset
  ): VgValueRef = (^.asInstanceOf[js.Dynamic].applyDynamic("valueRefForFieldOrDatumDef")(fieldDef.asInstanceOf[js.Any], scaleName.asInstanceOf[js.Any], opt.asInstanceOf[js.Any], encode.asInstanceOf[js.Any])).asInstanceOf[VgValueRef]
  inline def valueRefForFieldOrDatumDef(fieldDef: FieldDefBase[String, Bin], scaleName: String, opt: FieldRefOption, encode: BandOffset): VgValueRef = (^.asInstanceOf[js.Dynamic].applyDynamic("valueRefForFieldOrDatumDef")(fieldDef.asInstanceOf[js.Any], scaleName.asInstanceOf[js.Any], opt.asInstanceOf[js.Any], encode.asInstanceOf[js.Any])).asInstanceOf[VgValueRef]
  
  inline def widthHeightValueOrSignalRef(channel: Channel, value: Value[ExprRef | SignalRef]): SignalRef | ValueValue | FieldGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("widthHeightValueOrSignalRef")(channel.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[SignalRef | ValueValue | FieldGroup]
  inline def widthHeightValueOrSignalRef(channel: Channel, value: SignalRef): SignalRef | ValueValue | FieldGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("widthHeightValueOrSignalRef")(channel.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[SignalRef | ValueValue | FieldGroup]
  
  inline def wrapPositionInvalidTest(hasFieldDefChannelMarkDefRefConfig: MarkDef): VgValueRef | js.Array[VgValueRef] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapPositionInvalidTest")(hasFieldDefChannelMarkDefRefConfig.asInstanceOf[js.Any]).asInstanceOf[VgValueRef | js.Array[VgValueRef]]
  
  trait MidPointParams extends StObject {
    
    /**
      * Allow overriding band instead of reading to field def since band is applied to size (width/height) instead of the position for x/y-position with band scales.
      */
    var band: js.UndefOr[Double] = js.undefined
    
    var channel: Channel
    
    var channel2Def: js.UndefOr[SecondaryChannelDef[String]] = js.undefined
    
    var channelDef: ChannelDef[String]
    
    var config: Config[SignalRef]
    
    var defaultRef: VgValueRef | js.Function0[VgValueRef]
    
    var markDef: typings.vegaLite.srcMarkMod.MarkDef[Mark, SignalRef]
    
    var offset: js.UndefOr[Double | SignalRef] = js.undefined
    
    var scale: ScaleComponent
    
    var scaleName: String
    
    var stack: js.UndefOr[StackProperties] = js.undefined
  }
  object MidPointParams {
    
    inline def apply(
      channel: Channel,
      config: Config[SignalRef],
      defaultRef: VgValueRef | js.Function0[VgValueRef],
      markDef: typings.vegaLite.srcMarkMod.MarkDef[Mark, SignalRef],
      scale: ScaleComponent,
      scaleName: String
    ): MidPointParams = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], defaultRef = defaultRef.asInstanceOf[js.Any], markDef = markDef.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], scaleName = scaleName.asInstanceOf[js.Any])
      __obj.asInstanceOf[MidPointParams]
    }
    
    extension [Self <: MidPointParams](x: Self) {
      
      inline def setBand(value: Double): Self = StObject.set(x, "band", value.asInstanceOf[js.Any])
      
      inline def setBandUndefined: Self = StObject.set(x, "band", js.undefined)
      
      inline def setChannel(value: Channel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setChannel2Def(value: SecondaryChannelDef[String]): Self = StObject.set(x, "channel2Def", value.asInstanceOf[js.Any])
      
      inline def setChannel2DefUndefined: Self = StObject.set(x, "channel2Def", js.undefined)
      
      inline def setChannelDef(value: ChannelDef[String]): Self = StObject.set(x, "channelDef", value.asInstanceOf[js.Any])
      
      inline def setChannelDefNull: Self = StObject.set(x, "channelDef", null)
      
      inline def setChannelDefUndefined: Self = StObject.set(x, "channelDef", js.undefined)
      
      inline def setChannelDefVarargs(
        value: ((FieldDefWithoutScale[String, StandardType]) | OrderFieldDef[String] | StringFieldDef[String])*
      ): Self = StObject.set(x, "channelDef", js.Array(value :_*))
      
      inline def setConfig(value: Config[SignalRef]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setDefaultRef(value: VgValueRef | js.Function0[VgValueRef]): Self = StObject.set(x, "defaultRef", value.asInstanceOf[js.Any])
      
      inline def setDefaultRefFunction0(value: () => VgValueRef): Self = StObject.set(x, "defaultRef", js.Any.fromFunction0(value))
      
      inline def setMarkDef(value: typings.vegaLite.srcMarkMod.MarkDef[Mark, SignalRef]): Self = StObject.set(x, "markDef", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double | SignalRef): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setScale(value: ScaleComponent): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleName(value: String): Self = StObject.set(x, "scaleName", value.asInstanceOf[js.Any])
      
      inline def setStack(value: StackProperties): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    }
  }
}
