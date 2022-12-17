package typings.vegaLite.buildSrcChanneldefMod

import typings.std.Partial
import typings.vegaLite.anon.Aggregate
import typings.vegaLite.anon.AllowDisabling
import typings.vegaLite.anon.BandPosition
import typings.vegaLite.anon.Compatible
import typings.vegaLite.anon.CompositeMark
import typings.vegaLite.anon.Format
import typings.vegaLite.anon.Signal
import typings.vegaLite.anon.Test
import typings.vegaLite.anon.TimeUnit
import typings.vegaLite.buildSrcBinMod.Bin
import typings.vegaLite.buildSrcBinMod.BinParams
import typings.vegaLite.buildSrcChannelMod.Channel
import typings.vegaLite.buildSrcChannelMod.ExtendedChannel
import typings.vegaLite.buildSrcChanneldefMod.^
import typings.vegaLite.buildSrcCompositemarkMod.CompositeAggregate
import typings.vegaLite.buildSrcConfigMod.Config
import typings.vegaLite.buildSrcDatetimeMod.DateTime
import typings.vegaLite.buildSrcExprMod.ExprRef
import typings.vegaLite.buildSrcGuideMod.Guide
import typings.vegaLite.buildSrcGuideMod.GuideEncodingConditionalValueDef
import typings.vegaLite.buildSrcMarkMod.Mark
import typings.vegaLite.buildSrcMarkMod.MarkDef
import typings.vegaLite.buildSrcMarkMod.RelativeBandSize
import typings.vegaLite.buildSrcPredicateMod.ParameterPredicate
import typings.vegaLite.buildSrcTransformMod.AggregatedFieldDef
import typings.vegaLite.buildSrcTransformMod.WindowFieldDef
import typings.vegaLite.buildSrcTypeMod.StandardType
import typings.vegaLite.buildSrcTypeMod.Type
import typings.vegaLite.vegaLiteStrings.binned
import typings.vegaLite.vegaLiteStrings.height
import typings.vegaLite.vegaLiteStrings.width
import typings.vegaTypings.typesSpecEncodeMod.Gradient
import typings.vegaTypings.typesSpecEncodeMod.Text
import typings.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def binRequiresRange(fieldDef: FieldDef[String, Any], channel: Channel): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("binRequiresRange")(fieldDef.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def channelCompatibility_binned(fieldDef: TypedFieldDef[Field, Any, Boolean | BinParams | binned | Null], channel: ExtendedChannel): Compatible = (^.asInstanceOf[js.Dynamic].applyDynamic("channelCompatibility")(fieldDef.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[Compatible]

inline def channelDefType[F /* <: Field */](channelDef: ChannelDef[F]): js.UndefOr[Type] = ^.asInstanceOf[js.Dynamic].applyDynamic("channelDefType")(channelDef.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Type]]

inline def defaultTitle(fieldDef: FieldDefBase[String, Bin], config: Config[ExprRef | SignalRef]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultTitle")(fieldDef.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[String]

inline def defaultTitleFormatter: FieldTitleFormatter = ^.asInstanceOf[js.Dynamic].selectDynamic("defaultTitleFormatter").asInstanceOf[FieldTitleFormatter]

inline def defaultType[T /* <: TypedFieldDef[Field, Any, Boolean | BinParams | binned | Null] */](fieldDef: T, channel: ExtendedChannel): Type = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultType")(fieldDef.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[Type]

inline def functionalTitleFormatter(fieldDef: FieldDefBase[String, Bin]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("functionalTitleFormatter")(fieldDef.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getBandPosition(param0: typings.vegaLite.anon.Config): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getBandPosition")(param0.asInstanceOf[js.Any]).asInstanceOf[Double]

inline def getBandSize(param0: typings.vegaLite.anon.Channel): Double | RelativeBandSize | SignalRef = ^.asInstanceOf[js.Dynamic].applyDynamic("getBandSize")(param0.asInstanceOf[js.Any]).asInstanceOf[Double | RelativeBandSize | SignalRef]

inline def getFieldDef[F /* <: Field */](channelDef: ChannelDef[F]): FieldDef[F, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFieldDef")(channelDef.asInstanceOf[js.Any]).asInstanceOf[FieldDef[F, Any]]

inline def getFieldOrDatumDef[F /* <: Field */, CD /* <: ChannelDef[F] */](channelDef: CD): (FieldDef[F, Any]) | (DatumDef[F, PrimitiveValue | DateTime | ExprRef | SignalRef]) = ^.asInstanceOf[js.Dynamic].applyDynamic("getFieldOrDatumDef")(channelDef.asInstanceOf[js.Any]).asInstanceOf[(FieldDef[F, Any]) | (DatumDef[F, PrimitiveValue | DateTime | ExprRef | SignalRef])]

inline def getFormatMixins(fieldDef: DatumDef[String, PrimitiveValue | DateTime | ExprRef | SignalRef]): Format = ^.asInstanceOf[js.Dynamic].applyDynamic("getFormatMixins")(fieldDef.asInstanceOf[js.Any]).asInstanceOf[Format]

inline def getFormatMixins_binned(fieldDef: TypedFieldDef[String, Any, Boolean | BinParams | binned | Null]): Format = ^.asInstanceOf[js.Dynamic].applyDynamic("getFormatMixins")(fieldDef.asInstanceOf[js.Any]).asInstanceOf[Format]

inline def getGuide(fieldDef: DatumDef[String, PrimitiveValue | DateTime | ExprRef | SignalRef]): Guide = ^.asInstanceOf[js.Dynamic].applyDynamic("getGuide")(fieldDef.asInstanceOf[js.Any]).asInstanceOf[Guide]
inline def getGuide(fieldDef: SecondaryFieldDef[String]): Guide = ^.asInstanceOf[js.Dynamic].applyDynamic("getGuide")(fieldDef.asInstanceOf[js.Any]).asInstanceOf[Guide]

inline def getGuide_binned(fieldDef: TypedFieldDef[String, Any, Boolean | BinParams | binned | Null]): Guide = ^.asInstanceOf[js.Dynamic].applyDynamic("getGuide")(fieldDef.asInstanceOf[js.Any]).asInstanceOf[Guide]

inline def hasBandEnd(
  fieldDef: FieldDef[String, Any],
  fieldDef2: SecondaryChannelDef[String],
  markDef: MarkDef[Mark, SignalRef],
  config: Config[SignalRef]
): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasBandEnd")(fieldDef.asInstanceOf[js.Any], fieldDef2.asInstanceOf[js.Any], markDef.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def hasConditionalFieldDef[F /* <: Field */](channelDef: Partial[ChannelDef[F]]): /* is vega-lite.anon.0<F> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasConditionalFieldDef")(channelDef.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.anon.0<F> */ Boolean]

inline def hasConditionalFieldOrDatumDef[F /* <: Field */](channelDef: ChannelDef[F]): /* is vega-lite.anon.0<F> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasConditionalFieldOrDatumDef")(channelDef.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.anon.0<F> */ Boolean]

inline def hasConditionalValueDef[F /* <: Field */](channelDef: ChannelDef[F]): /* is vega-lite.anon.ValueDefanyconditionCondi */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasConditionalValueDef")(channelDef.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.anon.ValueDefanyconditionCondi */ Boolean]

inline def initChannelDef(channelDef: ChannelDef[String], channel: ExtendedChannel, config: Config[ExprRef | SignalRef]): ChannelDef[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("initChannelDef")(channelDef.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[ChannelDef[String]]
inline def initChannelDef(
  channelDef: ChannelDef[String],
  channel: ExtendedChannel,
  config: Config[ExprRef | SignalRef],
  opt: CompositeMark
): ChannelDef[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("initChannelDef")(channelDef.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], config.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[ChannelDef[String]]

inline def initFieldDef(fd: FieldDef[String, Any], channel: ExtendedChannel): (TypedFieldDef[String, Any, Boolean | BinParams | binned]) | Aggregate | BandPosition | typings.vegaLite.anon.Bin | typings.vegaLite.anon.Field = (^.asInstanceOf[js.Dynamic].applyDynamic("initFieldDef")(fd.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[(TypedFieldDef[String, Any, Boolean | BinParams | binned]) | Aggregate | BandPosition | typings.vegaLite.anon.Bin | typings.vegaLite.anon.Field]
inline def initFieldDef(fd: FieldDef[String, Any], channel: ExtendedChannel, param2: CompositeMark): (TypedFieldDef[String, Any, Boolean | BinParams | binned]) | Aggregate | BandPosition | typings.vegaLite.anon.Bin | typings.vegaLite.anon.Field = (^.asInstanceOf[js.Dynamic].applyDynamic("initFieldDef")(fd.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], param2.asInstanceOf[js.Any])).asInstanceOf[(TypedFieldDef[String, Any, Boolean | BinParams | binned]) | Aggregate | BandPosition | typings.vegaLite.anon.Bin | typings.vegaLite.anon.Field]

inline def initFieldOrDatumDef(
  fd: DatumDef[String, PrimitiveValue | DateTime | ExprRef | SignalRef],
  channel: ExtendedChannel,
  config: Config[ExprRef | SignalRef],
  opt: CompositeMark
): (FieldDef[String, Any]) | (DatumDef[String, PrimitiveValue | DateTime | ExprRef | SignalRef]) = (^.asInstanceOf[js.Dynamic].applyDynamic("initFieldOrDatumDef")(fd.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], config.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[(FieldDef[String, Any]) | (DatumDef[String, PrimitiveValue | DateTime | ExprRef | SignalRef])]
inline def initFieldOrDatumDef(
  fd: FieldDef[String, Any],
  channel: ExtendedChannel,
  config: Config[ExprRef | SignalRef],
  opt: CompositeMark
): (FieldDef[String, Any]) | (DatumDef[String, PrimitiveValue | DateTime | ExprRef | SignalRef]) = (^.asInstanceOf[js.Dynamic].applyDynamic("initFieldOrDatumDef")(fd.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], config.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[(FieldDef[String, Any]) | (DatumDef[String, PrimitiveValue | DateTime | ExprRef | SignalRef])]

inline def isConditionalDef(channelDef: ExprRef): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isConditionalDef")(channelDef.asInstanceOf[js.Any]).asInstanceOf[Boolean]
inline def isConditionalDef(channelDef: GuideEncodingConditionalValueDef): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isConditionalDef")(channelDef.asInstanceOf[js.Any]).asInstanceOf[Boolean]
inline def isConditionalDef(channelDef: SignalRef): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isConditionalDef")(channelDef.asInstanceOf[js.Any]).asInstanceOf[Boolean]
inline def isConditionalDef[CD /* <: js.UndefOr[
Position2Def[Any] | TextDef[Any] | ColorDef[Any] | PositionDef[Any] | OrderFieldDef[Any] | (js.Array[
  (FieldDefWithoutScale[Any, StandardType]) | OrderFieldDef[Any] | StringFieldDef[Any]
]) | OrderValueDef | NumericArrayMarkPropDef[Any] | LatLongDef[Any] | (OffsetDef[Any, StandardType]) | (FieldDefWithoutScale[Any, StandardType]) | ShapeDef[Any] | StringFieldDefWithCondition[Any] | (StringValueDefWithCondition[Any, StandardType]) | NumericMarkPropDef[Any] | PolarDef[Any] | Null] */](channelDef: CD): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isConditionalDef")(channelDef.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isConditionalParameter[T](c: Conditional[T]): /* is vega-lite.vega-lite/build/src/channeldef.ConditionalParameter<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isConditionalParameter")(c.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/channeldef.ConditionalParameter<T> */ Boolean]

inline def isContinuousFieldOrDatumDef[F /* <: Field */](cd: ChannelDef[F]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isContinuousFieldOrDatumDef")(cd.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isCount(fieldDef: FieldDefBase[Field, Bin]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCount")(fieldDef.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isDatumDef[F /* <: Field */](channelDef: Partial[ChannelDef[F]]): /* is vega-lite.vega-lite/build/src/channeldef.DatumDef<F, any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDatumDef")(channelDef.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/channeldef.DatumDef<F, any> */ Boolean]
inline def isDatumDef[F /* <: Field */](channelDef: DatumDef[F, Any]): /* is vega-lite.vega-lite/build/src/channeldef.DatumDef<F, any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDatumDef")(channelDef.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/channeldef.DatumDef<F, any> */ Boolean]
inline def isDatumDef[F /* <: Field */](channelDef: FieldDefBase[F, Bin]): /* is vega-lite.vega-lite/build/src/channeldef.DatumDef<F, any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDatumDef")(channelDef.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/channeldef.DatumDef<F, any> */ Boolean]

inline def isDiscrete(`def`: DatumDef[Any, Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDiscrete")(`def`.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isDiscrete_binned(`def`: TypedFieldDef[Field, Any, Boolean | BinParams | binned | Null]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDiscrete")(`def`.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isDiscretizing(`def`: DatumDef[Any, Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDiscretizing")(`def`.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isDiscretizing_binned(`def`: TypedFieldDef[Field, Any, Boolean | BinParams | binned | Null]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDiscretizing")(`def`.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isFieldDef[F /* <: Field */](channelDef: Partial[ChannelDef[F]]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFieldDef")(channelDef.asInstanceOf[js.Any]).asInstanceOf[Boolean]
inline def isFieldDef[F /* <: Field */](channelDef: DatumDef[F, Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFieldDef")(channelDef.asInstanceOf[js.Any]).asInstanceOf[Boolean]
inline def isFieldDef[F /* <: Field */](channelDef: FieldDefBase[F, Bin]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFieldDef")(channelDef.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isFieldOrDatumDef[F /* <: Field */](channelDef: Partial[ChannelDef[F]]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFieldOrDatumDef")(channelDef.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isFieldOrDatumDefForTimeFormat(fieldOrDatumDef: DatumDef[String, PrimitiveValue | DateTime | ExprRef | SignalRef]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFieldOrDatumDefForTimeFormat")(fieldOrDatumDef.asInstanceOf[js.Any]).asInstanceOf[Boolean]
inline def isFieldOrDatumDefForTimeFormat(fieldOrDatumDef: FieldDef[String, Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFieldOrDatumDefForTimeFormat")(fieldOrDatumDef.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isMarkPropFieldOrDatumDef[F /* <: Field */](channelDef: ChannelDef[F]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMarkPropFieldOrDatumDef")(channelDef.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isNumericDataDef[F /* <: Field */](cd: ChannelDef[F]): /* is vega-lite.vega-lite/build/src/channeldef.DatumDef<F, number> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumericDataDef")(cd.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/channeldef.DatumDef<F, number> */ Boolean]

inline def isPositionFieldOrDatumDef[F /* <: Field */](channelDef: ChannelDef[F]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPositionFieldOrDatumDef")(channelDef.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isQuantitativeFieldOrDatumDef[F /* <: Field */](cd: ChannelDef[F]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isQuantitativeFieldOrDatumDef")(cd.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isRepeatRef(field: Any | Field): /* is vega-lite.vega-lite/build/src/channeldef.RepeatRef */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRepeatRef")(field.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/channeldef.RepeatRef */ Boolean]

inline def isScaleFieldDef[F /* <: Field */](channelDef: ChannelDef[F]): /* is vega-lite.vega-lite/build/src/channeldef.ScaleFieldDef<F, vega-lite.vega-lite/build/src/type.StandardType, boolean | vega-lite.vega-lite/build/src/bin.BinParams | null> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isScaleFieldDef")(channelDef.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/channeldef.ScaleFieldDef<F, vega-lite.vega-lite/build/src/type.StandardType, boolean | vega-lite.vega-lite/build/src/bin.BinParams | null> */ Boolean]

inline def isSortableFieldDef[F /* <: Field */](fieldDef: FieldDef[F, Any]): /* is vega-lite.vega-lite/build/src/channeldef.SortableFieldDef<F, vega-lite.vega-lite/build/src/type.StandardType, boolean | vega-lite.vega-lite/build/src/bin.BinParams | null> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSortableFieldDef")(fieldDef.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/channeldef.SortableFieldDef<F, vega-lite.vega-lite/build/src/type.StandardType, boolean | vega-lite.vega-lite/build/src/bin.BinParams | null> */ Boolean]

inline def isStringFieldOrDatumDef[F /* <: Field */](channelDef: ChannelDef[F]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStringFieldOrDatumDef")(channelDef.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isTimeFieldDef(`def`: DatumDef[String, PrimitiveValue | DateTime | ExprRef | SignalRef]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTimeFieldDef")(`def`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
inline def isTimeFieldDef(`def`: FieldDef[Any, Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTimeFieldDef")(`def`.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isTypedFieldDef[F /* <: Field */](channelDef: ChannelDef[F]): /* is vega-lite.vega-lite/build/src/channeldef.TypedFieldDef<F, any, boolean | vega-lite.vega-lite/build/src/bin.BinParams | 'binned' | null> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTypedFieldDef")(channelDef.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/channeldef.TypedFieldDef<F, any, boolean | vega-lite.vega-lite/build/src/bin.BinParams | 'binned' | null> */ Boolean]

inline def isValueDef[F /* <: Field */](channelDef: Partial[ChannelDef[F]]): /* is vega-lite.vega-lite/build/src/channeldef.ValueDef<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValueDef")(channelDef.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/channeldef.ValueDef<any> */ Boolean]

inline def normalizeBin(bin: Boolean): BinParams = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeBin")(bin.asInstanceOf[js.Any]).asInstanceOf[BinParams]
inline def normalizeBin(bin: Boolean, channel: ExtendedChannel): BinParams = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeBin")(bin.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[BinParams]
inline def normalizeBin(bin: BinParams): BinParams = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeBin")(bin.asInstanceOf[js.Any]).asInstanceOf[BinParams]
inline def normalizeBin(bin: BinParams, channel: ExtendedChannel): BinParams = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeBin")(bin.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[BinParams]

inline def normalizeBin_binned(bin: binned): BinParams = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeBin")(bin.asInstanceOf[js.Any]).asInstanceOf[BinParams]
inline def normalizeBin_binned(bin: binned, channel: ExtendedChannel): BinParams = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeBin")(bin.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[BinParams]

inline def resetTitleFormatter(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetTitleFormatter")().asInstanceOf[Unit]

inline def setTitleFormatter(formatter: FieldTitleFormatter): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setTitleFormatter")(formatter.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def title(
  fieldOrDatumDef: DatumDef[String, PrimitiveValue | DateTime | ExprRef | SignalRef],
  config: Config[ExprRef | SignalRef],
  param2: AllowDisabling
): SignalRef | Text = (^.asInstanceOf[js.Dynamic].applyDynamic("title")(fieldOrDatumDef.asInstanceOf[js.Any], config.asInstanceOf[js.Any], param2.asInstanceOf[js.Any])).asInstanceOf[SignalRef | Text]
inline def title(
  fieldOrDatumDef: SecondaryFieldDef[String],
  config: Config[ExprRef | SignalRef],
  param2: AllowDisabling
): SignalRef | Text = (^.asInstanceOf[js.Dynamic].applyDynamic("title")(fieldOrDatumDef.asInstanceOf[js.Any], config.asInstanceOf[js.Any], param2.asInstanceOf[js.Any])).asInstanceOf[SignalRef | Text]

inline def title_binned(
  fieldOrDatumDef: TypedFieldDef[String, Any, Boolean | BinParams | binned | Null],
  config: Config[ExprRef | SignalRef],
  param2: AllowDisabling
): SignalRef | Text = (^.asInstanceOf[js.Dynamic].applyDynamic("title")(fieldOrDatumDef.asInstanceOf[js.Any], config.asInstanceOf[js.Any], param2.asInstanceOf[js.Any])).asInstanceOf[SignalRef | Text]

inline def toFieldDefBase(fieldDef: FieldDef[String, Any]): FieldDefBase[String, Bin] = ^.asInstanceOf[js.Dynamic].applyDynamic("toFieldDefBase")(fieldDef.asInstanceOf[js.Any]).asInstanceOf[FieldDefBase[String, Bin]]

inline def toStringFieldDef[F /* <: Field */](fieldDef: FieldDef[F, Any]): StringFieldDef[F] = ^.asInstanceOf[js.Dynamic].applyDynamic("toStringFieldDef")(fieldDef.asInstanceOf[js.Any]).asInstanceOf[StringFieldDef[F]]

inline def valueArray(
  fieldOrDatumDef: DatumDef[String, PrimitiveValue | DateTime | ExprRef | SignalRef],
  values: js.Array[Double | String | Boolean | DateTime]
): js.Array[String | Double | Boolean | DateTime | Signal] = (^.asInstanceOf[js.Dynamic].applyDynamic("valueArray")(fieldOrDatumDef.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[js.Array[String | Double | Boolean | DateTime | Signal]]

inline def valueArray_binned(
  fieldOrDatumDef: TypedFieldDef[String, Any, Boolean | BinParams | binned | Null],
  values: js.Array[Double | String | Boolean | DateTime]
): js.Array[String | Double | Boolean | DateTime | Signal] = (^.asInstanceOf[js.Dynamic].applyDynamic("valueArray")(fieldOrDatumDef.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[js.Array[String | Double | Boolean | DateTime | Signal]]

inline def valueExpr(v: String, param1: TimeUnit): String = (^.asInstanceOf[js.Dynamic].applyDynamic("valueExpr")(v.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[String]
inline def valueExpr(v: js.Array[Double], param1: TimeUnit): String = (^.asInstanceOf[js.Dynamic].applyDynamic("valueExpr")(v.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[String]
inline def valueExpr(v: Boolean, param1: TimeUnit): String = (^.asInstanceOf[js.Dynamic].applyDynamic("valueExpr")(v.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[String]
inline def valueExpr(v: Double, param1: TimeUnit): String = (^.asInstanceOf[js.Dynamic].applyDynamic("valueExpr")(v.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[String]
inline def valueExpr(v: DateTime, param1: TimeUnit): String = (^.asInstanceOf[js.Dynamic].applyDynamic("valueExpr")(v.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[String]
inline def valueExpr(v: ExprRef, param1: TimeUnit): String = (^.asInstanceOf[js.Dynamic].applyDynamic("valueExpr")(v.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[String]
inline def valueExpr(v: SignalRef, param1: TimeUnit): String = (^.asInstanceOf[js.Dynamic].applyDynamic("valueExpr")(v.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[String]

inline def verbalTitleFormatter(fieldDef: FieldDefBase[String, Bin], config: Config[ExprRef | SignalRef]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("verbalTitleFormatter")(fieldDef.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[String]

inline def vgField(fieldDef: FieldDefBase[String, Bin]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("vgField")(fieldDef.asInstanceOf[js.Any]).asInstanceOf[String]
inline def vgField(fieldDef: FieldDefBase[String, Bin], opt: FieldRefOption): String = (^.asInstanceOf[js.Dynamic].applyDynamic("vgField")(fieldDef.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[String]
inline def vgField(fieldDef: AggregatedFieldDef): String = ^.asInstanceOf[js.Dynamic].applyDynamic("vgField")(fieldDef.asInstanceOf[js.Any]).asInstanceOf[String]
inline def vgField(fieldDef: AggregatedFieldDef, opt: FieldRefOption): String = (^.asInstanceOf[js.Dynamic].applyDynamic("vgField")(fieldDef.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[String]
inline def vgField(fieldDef: WindowFieldDef): String = ^.asInstanceOf[js.Dynamic].applyDynamic("vgField")(fieldDef.asInstanceOf[js.Any]).asInstanceOf[String]
inline def vgField(fieldDef: WindowFieldDef, opt: FieldRefOption): String = (^.asInstanceOf[js.Dynamic].applyDynamic("vgField")(fieldDef.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[String]

/* Rewritten from type alias, can be one of: 
  - typings.vegaLite.buildSrcChanneldefMod.TextDef[F]
  - scala.Unit
  - typings.vegaLite.buildSrcChanneldefMod.PositionDef[F]
  - typings.vegaLite.buildSrcChanneldefMod.Position2Def[F]
  - typings.vegaLite.buildSrcChanneldefMod.FieldDefWithoutScale[F, typings.vegaLite.buildSrcTypeMod.StandardType]
  - typings.vegaLite.buildSrcChanneldefMod.NumericArrayMarkPropDef[F]
  - typings.vegaLite.buildSrcChanneldefMod.StringFieldDefWithCondition[F]
  - typings.vegaLite.buildSrcChanneldefMod.StringValueDefWithCondition[F, typings.vegaLite.buildSrcTypeMod.StandardType]
  - typings.vegaLite.buildSrcChanneldefMod.OffsetDef[F, typings.vegaLite.buildSrcTypeMod.StandardType]
  - typings.vegaLite.buildSrcChanneldefMod.OrderFieldDef[F]
  - js.Array[
(typings.vegaLite.buildSrcChanneldefMod.FieldDefWithoutScale[F, typings.vegaLite.buildSrcTypeMod.StandardType]) | typings.vegaLite.buildSrcChanneldefMod.OrderFieldDef[F] | typings.vegaLite.buildSrcChanneldefMod.StringFieldDef[F]]
  - typings.vegaLite.buildSrcChanneldefMod.OrderValueDef
  - typings.vegaLite.buildSrcChanneldefMod.PolarDef[F]
  - typings.vegaLite.buildSrcChanneldefMod.LatLongDef[F]
  - typings.vegaLite.buildSrcChanneldefMod.NumericMarkPropDef[F]
  - scala.Null
  - typings.vegaLite.buildSrcChanneldefMod.ColorDef[F]
  - typings.vegaLite.buildSrcChanneldefMod.ShapeDef[F]
*/
type ChannelDef[F /* <: Field */] = js.UndefOr[
_ChannelDef[F] | (FieldDefWithoutScale[F, StandardType]) | (StringValueDefWithCondition[F, StandardType]) | (OffsetDef[F, StandardType]) | (js.Array[(FieldDefWithoutScale[F, StandardType]) | OrderFieldDef[F] | StringFieldDef[F]]) | TextDef[F] | PositionDef[F] | Position2Def[F] | NumericArrayMarkPropDef[F] | StringFieldDefWithCondition[F] | PolarDef[F] | LatLongDef[F] | NumericMarkPropDef[F] | Null | ColorDef[F] | ShapeDef[F]]

type ColorDef[F /* <: Field */] = MarkPropDef[F, Gradient | String | Null, StandardType]

type Conditional[CD /* <: (FieldDef[Any, Any]) | (DatumDef[String, PrimitiveValue | DateTime | ExprRef | SignalRef]) | ValueDef[Any] | ExprRef | SignalRef */] = ConditionalPredicate[CD] | ConditionalParameter[CD]

type ConditionalParameter[CD /* <: (FieldDef[Any, Any]) | (DatumDef[String, PrimitiveValue | DateTime | ExprRef | SignalRef]) | ValueDef[Any] | ExprRef | SignalRef */] = ParameterPredicate & CD

type ConditionalPredicate[CD /* <: (FieldDef[Any, Any]) | (DatumDef[String, PrimitiveValue | DateTime | ExprRef | SignalRef]) | ValueDef[Any] | ExprRef | SignalRef */] = Test & CD

type Field = FieldName | RepeatRef

type FieldDef[F /* <: Field */, T /* <: Type */] = SecondaryFieldDef[F] | (TypedFieldDef[F, T, Boolean | BinParams | binned | Null])

type FieldDefWithoutScale[F /* <: Field */, T /* <: Type */] = TypedFieldDef[F, T, Boolean | BinParams | binned | Null]

type FieldName = String

type FieldOrDatumDefWithCondition[F /* <: (FieldDef[Any, Any]) | (DatumDef[Any, PrimitiveValue | DateTime | ExprRef | SignalRef]) */, V /* <: Value[ExprRef | SignalRef] */] = F & (ConditionValueDefMixins[V | ExprRef | SignalRef])

type FieldTitleFormatter = js.Function2[
/* fieldDef */ FieldDefBase[String, Bin], 
/* config */ Config[ExprRef | SignalRef], 
String]

type HiddenCompositeAggregate = CompositeAggregate

type LatLongDef[F /* <: Field */] = LatLongFieldDef[F] | (DatumDef[F, PrimitiveValue | DateTime | ExprRef | SignalRef])

type MarkPropDef[F /* <: Field */, V /* <: Value[ExprRef | SignalRef] */, T /* <: Type */] = (FieldOrDatumDefWithCondition[
(DatumDef[F, PrimitiveValue | DateTime | ExprRef | SignalRef]) | (MarkPropFieldDef[F, T]), 
V]) | (ValueDefWithCondition[MarkPropFieldOrDatumDef[F, T], V])

type MarkPropFieldDef[F /* <: Field */, T /* <: Type */] = (ScaleFieldDef[F, T, Boolean | BinParams | Null]) & LegendMixins

type MarkPropFieldOrDatumDef[F /* <: Field */, T /* <: Type */] = (MarkPropFieldDef[F, T]) | MarkPropDatumDef[F]

type NumericArrayMarkPropDef[F /* <: Field */] = MarkPropDef[F, js.Array[Double], StandardType]

type NumericMarkPropDef[F /* <: Field */] = MarkPropDef[F, Double, StandardType]

type NumericValueDef = ValueDef[Double | ExprRef | SignalRef]

type OffsetDef[F /* <: Field */, T /* <: Type */] = (ScaleFieldDef[F, T, Boolean | BinParams | Null]) | ScaleDatumDef[F] | ValueDef[Double]

type PolarDef[F /* <: Field */] = PositionFieldDefBase[F] | PositionDatumDefBase[F] | PositionValueDef

type Position2Def[F /* <: Field */] = SecondaryFieldDef[F] | (DatumDef[F, PrimitiveValue | DateTime | ExprRef | SignalRef]) | PositionValueDef

type PositionDef[F /* <: Field */] = PositionFieldDef[F] | PositionDatumDef[F] | PositionValueDef

type PositionFieldDef[F /* <: Field */] = PositionFieldDefBase[F] & PositionMixins

type PositionFieldDefBase[F /* <: Field */] = (ScaleFieldDef[F, StandardType, Boolean | BinParams | binned | Null]) & PositionBaseMixins

type PositionValueDef = ValueDef[Double | width | height | ExprRef | SignalRef]

type PrimitiveValue = Double | String | Boolean | Null

type SecondaryChannelDef[F /* <: Field */] = js.UndefOr[Position2Def[F]]

type ShapeDef[F /* <: Field */] = MarkPropDef[F, String | Null, TypeForShape]

type StringFieldDefWithCondition[F /* <: Field */] = FieldOrDatumDefWithCondition[StringFieldDef[F], String]

type TextDef[F /* <: Field */] = (FieldOrDatumDefWithCondition[StringDatumDef[F] | StringFieldDef[F], Text]) | (ValueDefWithCondition[StringFieldDef[F], Text])

type Value[ES /* <: ExprRef | SignalRef */] = PrimitiveValue | js.Array[Double] | Gradient | Text | ES
