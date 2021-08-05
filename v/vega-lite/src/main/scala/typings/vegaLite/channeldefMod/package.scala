package typings.vegaLite.channeldefMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def binRequiresRange(
  fieldDef: typings.vegaLite.channeldefMod.FieldDef[java.lang.String, js.Any],
  channel: typings.vegaLite.channelMod.Channel
): scala.Boolean = (typings.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("binRequiresRange")(fieldDef.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]

inline def channelCompatibility_binned(
  fieldDef: typings.vegaLite.channeldefMod.TypedFieldDef[
  typings.vegaLite.channeldefMod.Field, 
  js.Any, 
  scala.Boolean | typings.vegaLite.binMod.BinParams | typings.vegaLite.vegaLiteStrings.binned | scala.Null
],
  channel: typings.vegaLite.channelMod.ExtendedChannel
): typings.vegaLite.anon.Compatible = (typings.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("channelCompatibility")(fieldDef.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[typings.vegaLite.anon.Compatible]

inline def channelDefType[F /* <: typings.vegaLite.channeldefMod.Field */](channelDef: typings.vegaLite.channeldefMod.ChannelDef[F]): js.UndefOr[typings.vegaLite.srcTypeMod.Type] = typings.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("channelDefType")(channelDef.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typings.vegaLite.srcTypeMod.Type]]

inline def defaultTitle(
  fieldDef: typings.vegaLite.channeldefMod.FieldDefBase[java.lang.String, typings.vegaLite.binMod.Bin],
  config: typings.vegaLite.srcConfigMod.Config[typings.vegaLite.exprMod.ExprRef | typings.vegaTypings.signalMod.SignalRef]
): java.lang.String = (typings.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("defaultTitle")(fieldDef.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]

inline def defaultTitleFormatter: typings.vegaLite.channeldefMod.FieldTitleFormatter = typings.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].selectDynamic("defaultTitleFormatter").asInstanceOf[typings.vegaLite.channeldefMod.FieldTitleFormatter]

inline def defaultType[T /* <: typings.vegaLite.channeldefMod.TypedFieldDef[
typings.vegaLite.channeldefMod.Field, 
js.Any, 
scala.Boolean | typings.vegaLite.binMod.BinParams | typings.vegaLite.vegaLiteStrings.binned | scala.Null] */](fieldDef: T, channel: typings.vegaLite.channelMod.ExtendedChannel): typings.vegaLite.srcTypeMod.Type = (typings.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("defaultType")(fieldDef.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[typings.vegaLite.srcTypeMod.Type]

inline def functionalTitleFormatter(
  fieldDef: typings.vegaLite.channeldefMod.FieldDefBase[java.lang.String, typings.vegaLite.binMod.Bin]
): java.lang.String = typings.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("functionalTitleFormatter")(fieldDef.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]

inline def getBand(hasChannelFieldDefFieldDef2MarkStackConfigIsMidPoint: typings.vegaLite.anon.Channel): scala.Double = typings.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("getBand")(hasChannelFieldDefFieldDef2MarkStackConfigIsMidPoint.asInstanceOf[js.Any]).asInstanceOf[scala.Double]

inline def getFieldDef[F /* <: typings.vegaLite.channeldefMod.Field */](channelDef: typings.vegaLite.channeldefMod.ChannelDef[F]): typings.vegaLite.channeldefMod.FieldDef[F, js.Any] = typings.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("getFieldDef")(channelDef.asInstanceOf[js.Any]).asInstanceOf[typings.vegaLite.channeldefMod.FieldDef[F, js.Any]]

inline def getFieldOrDatumDef[F /* <: typings.vegaLite.channeldefMod.Field */, CD /* <: typings.vegaLite.channeldefMod.ChannelDef[F] */](channelDef: CD): (typings.vegaLite.channeldefMod.FieldDef[F, js.Any]) | (typings.vegaLite.channeldefMod.DatumDef[
F, 
typings.vegaLite.channeldefMod.PrimitiveValue | typings.vegaLite.datetimeMod.DateTime | typings.vegaLite.exprMod.ExprRef | typings.vegaTypings.signalMod.SignalRef]) = typings.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("getFieldOrDatumDef")(channelDef.asInstanceOf[js.Any]).asInstanceOf[(typings.vegaLite.channeldefMod.FieldDef[F, js.Any]) | (typings.vegaLite.channeldefMod.DatumDef[
F, 
typings.vegaLite.channeldefMod.PrimitiveValue | typings.vegaLite.datetimeMod.DateTime | typings.vegaLite.exprMod.ExprRef | typings.vegaTypings.signalMod.SignalRef])]

inline def getFormatMixins(
  fieldDef: typings.vegaLite.channeldefMod.DatumDef[
  java.lang.String, 
  typings.vegaLite.channeldefMod.PrimitiveValue | typings.vegaLite.datetimeMod.DateTime | typings.vegaLite.exprMod.ExprRef | typings.vegaTypings.signalMod.SignalRef
]
): typings.vegaLite.anon.Format = typings.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("getFormatMixins")(fieldDef.asInstanceOf[js.Any]).asInstanceOf[typings.vegaLite.anon.Format]

inline def getFormatMixins_binned(
  fieldDef: typings.vegaLite.channeldefMod.TypedFieldDef[
  java.lang.String, 
  js.Any, 
  scala.Boolean | typings.vegaLite.binMod.BinParams | typings.vegaLite.vegaLiteStrings.binned | scala.Null
]
): typings.vegaLite.anon.Format = typings.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("getFormatMixins")(fieldDef.asInstanceOf[js.Any]).asInstanceOf[typings.vegaLite.anon.Format]

inline def getGuide(
  fieldDef: typings.vegaLite.channeldefMod.DatumDef[
  java.lang.String, 
  typings.vegaLite.channeldefMod.PrimitiveValue | typings.vegaLite.datetimeMod.DateTime | typings.vegaLite.exprMod.ExprRef | typings.vegaTypings.signalMod.SignalRef
]
): typings.vegaLite.srcGuideMod.Guide = typings.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("getGuide")(fieldDef.asInstanceOf[js.Any]).asInstanceOf[typings.vegaLite.srcGuideMod.Guide]
inline def getGuide(fieldDef: typings.vegaLite.channeldefMod.SecondaryFieldDef[java.lang.String]): typings.vegaLite.srcGuideMod.Guide = typings.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("getGuide")(fieldDef.asInstanceOf[js.Any]).asInstanceOf[typings.vegaLite.srcGuideMod.Guide]

inline def getGuide_binned(
  fieldDef: typings.vegaLite.channeldefMod.TypedFieldDef[
  java.lang.String, 
  js.Any, 
  scala.Boolean | typings.vegaLite.binMod.BinParams | typings.vegaLite.vegaLiteStrings.binned | scala.Null
]
): typings.vegaLite.srcGuideMod.Guide = typings.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("getGuide")(fieldDef.asInstanceOf[js.Any]).asInstanceOf[typings.vegaLite.srcGuideMod.Guide]

inline def hasBand(
  channel: typings.vegaLite.channelMod.Channel,
  fieldDef: typings.vegaLite.channeldefMod.FieldDef[java.lang.String, js.Any],
  fieldDef2: typings.vegaLite.channeldefMod.SecondaryChannelDef[java.lang.String],
  stack: typings.vegaLite.srcStackMod.StackProperties,
  markDef: typings.vegaLite.srcMarkMod.MarkDef[typings.vegaLite.srcMarkMod.Mark, typings.vegaTypings.signalMod.SignalRef],
  config: typings.vegaLite.srcConfigMod.Config[typings.vegaTypings.signalMod.SignalRef]
): scala.Boolean = (typings.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("hasBand")(channel.asInstanceOf[js.Any], fieldDef.asInstanceOf[js.Any], fieldDef2.asInstanceOf[js.Any], stack.asInstanceOf[js.Any], markDef.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]

inline def hasConditionalFieldDef[F /* <: typings.vegaLite.channeldefMod.Field */](channelDef: typings.std.Partial[typings.vegaLite.channeldefMod.ChannelDef[F]]): /* is vega-lite.anon.0<F> */ scala.Boolean = typings.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("hasConditionalFieldDef")(channelDef.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.anon.0<F> */ scala.Boolean]

inline def hasConditionalFieldOrDatumDef[F /* <: typings.vegaLite.channeldefMod.Field */](channelDef: typings.vegaLite.channeldefMod.ChannelDef[F]): /* is vega-lite.anon.0<F> */ scala.Boolean = typings.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("hasConditionalFieldOrDatumDef")(channelDef.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.anon.0<F> */ scala.Boolean]

inline def hasConditionalValueDef[F /* <: typings.vegaLite.channeldefMod.Field */](channelDef: typings.vegaLite.channeldefMod.ChannelDef[F]): /* is vega-lite.anon.ValueDefanyconditionCondi */ scala.Boolean = typings.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("hasConditionalValueDef")(channelDef.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.anon.ValueDefanyconditionCondi */ scala.Boolean]

inline def initChannelDef(
  channelDef: typings.vegaLite.channeldefMod.ChannelDef[java.lang.String],
  channel: typings.vegaLite.channelMod.ExtendedChannel,
  config: typings.vegaLite.srcConfigMod.Config[typings.vegaLite.exprMod.ExprRef | typings.vegaTypings.signalMod.SignalRef]
): typings.vegaLite.channeldefMod.ChannelDef[java.lang.String] = (typings.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("initChannelDef")(channelDef.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[typings.vegaLite.channeldefMod.ChannelDef[java.lang.String]]
inline def initChannelDef(
  channelDef: typings.vegaLite.channeldefMod.ChannelDef[java.lang.String],
  channel: typings.vegaLite.channelMod.ExtendedChannel,
  config: typings.vegaLite.srcConfigMod.Config[typings.vegaLite.exprMod.ExprRef | typings.vegaTypings.signalMod.SignalRef],
  opt: typings.vegaLite.anon.CompositeMark
): typings.vegaLite.channeldefMod.ChannelDef[java.lang.String] = (typings.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("initChannelDef")(channelDef.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], config.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[typings.vegaLite.channeldefMod.ChannelDef[java.lang.String]]

inline def initFieldDef(
  fd: typings.vegaLite.channeldefMod.FieldDef[java.lang.String, js.Any],
  channel: typings.vegaLite.channelMod.ExtendedChannel
): typings.vegaLite.anon.Aggregate | typings.vegaLite.anon.Band | typings.vegaLite.anon.Bin | typings.vegaLite.anon.Field | typings.vegaLite.anon.Header = (typings.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("initFieldDef")(fd.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[typings.vegaLite.anon.Aggregate | typings.vegaLite.anon.Band | typings.vegaLite.anon.Bin | typings.vegaLite.anon.Field | typings.vegaLite.anon.Header]
inline def initFieldDef(
  fd: typings.vegaLite.channeldefMod.FieldDef[java.lang.String, js.Any],
  channel: typings.vegaLite.channelMod.ExtendedChannel,
  hasCompositeMark: typings.vegaLite.anon.CompositeMark
): typings.vegaLite.anon.Aggregate | typings.vegaLite.anon.Band | typings.vegaLite.anon.Bin | typings.vegaLite.anon.Field | typings.vegaLite.anon.Header = (typings.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("initFieldDef")(fd.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], hasCompositeMark.asInstanceOf[js.Any])).asInstanceOf[typings.vegaLite.anon.Aggregate | typings.vegaLite.anon.Band | typings.vegaLite.anon.Bin | typings.vegaLite.anon.Field | typings.vegaLite.anon.Header]

inline def initFieldOrDatumDef(
  fd: typings.vegaLite.channeldefMod.DatumDef[
  java.lang.String, 
  typings.vegaLite.channeldefMod.PrimitiveValue | typings.vegaLite.datetimeMod.DateTime | typings.vegaLite.exprMod.ExprRef | typings.vegaTypings.signalMod.SignalRef
],
  channel: typings.vegaLite.channelMod.ExtendedChannel,
  config: typings.vegaLite.srcConfigMod.Config[typings.vegaLite.exprMod.ExprRef | typings.vegaTypings.signalMod.SignalRef],
  opt: typings.vegaLite.anon.CompositeMark
): (typings.vegaLite.channeldefMod.FieldDef[java.lang.String, js.Any]) | (typings.vegaLite.channeldefMod.DatumDef[
java.lang.String, 
typings.vegaLite.channeldefMod.PrimitiveValue | typings.vegaLite.datetimeMod.DateTime | typings.vegaLite.exprMod.ExprRef | typings.vegaTypings.signalMod.SignalRef]) = (typings.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("initFieldOrDatumDef")(fd.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], config.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[(typings.vegaLite.channeldefMod.FieldDef[java.lang.String, js.Any]) | (typings.vegaLite.channeldefMod.DatumDef[
java.lang.String, 
typings.vegaLite.channeldefMod.PrimitiveValue | typings.vegaLite.datetimeMod.DateTime | typings.vegaLite.exprMod.ExprRef | typings.vegaTypings.signalMod.SignalRef])]
inline def initFieldOrDatumDef(
  fd: typings.vegaLite.channeldefMod.FieldDef[java.lang.String, js.Any],
  channel: typings.vegaLite.channelMod.ExtendedChannel,
  config: typings.vegaLite.srcConfigMod.Config[typings.vegaLite.exprMod.ExprRef | typings.vegaTypings.signalMod.SignalRef],
  opt: typings.vegaLite.anon.CompositeMark
): (typings.vegaLite.channeldefMod.FieldDef[java.lang.String, js.Any]) | (typings.vegaLite.channeldefMod.DatumDef[
java.lang.String, 
typings.vegaLite.channeldefMod.PrimitiveValue | typings.vegaLite.datetimeMod.DateTime | typings.vegaLite.exprMod.ExprRef | typings.vegaTypings.signalMod.SignalRef]) = (typings.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("initFieldOrDatumDef")(fd.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], config.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[(typings.vegaLite.channeldefMod.FieldDef[java.lang.String, js.Any]) | (typings.vegaLite.channeldefMod.DatumDef[
java.lang.String, 
typings.vegaLite.channeldefMod.PrimitiveValue | typings.vegaLite.datetimeMod.DateTime | typings.vegaLite.exprMod.ExprRef | typings.vegaTypings.signalMod.SignalRef])]

inline def isConditionalDef(channelDef: typings.vegaLite.exprMod.ExprRef): scala.Boolean = typings.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("isConditionalDef")(channelDef.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
inline def isConditionalDef(channelDef: typings.vegaLite.srcGuideMod.GuideEncodingConditionalValueDef): scala.Boolean = typings.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("isConditionalDef")(channelDef.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
inline def isConditionalDef(channelDef: typings.vegaTypings.signalMod.SignalRef): scala.Boolean = typings.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("isConditionalDef")(channelDef.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
inline def isConditionalDef[CD /* <: js.UndefOr[
typings.vegaLite.channeldefMod.Position2Def[js.Any] | typings.vegaLite.channeldefMod.TextDef[js.Any] | typings.vegaLite.channeldefMod.ColorDef[js.Any] | typings.vegaLite.channeldefMod.PositionDef[js.Any] | typings.vegaLite.channeldefMod.OrderFieldDef[js.Any] | (js.Array[
  (typings.vegaLite.channeldefMod.FieldDefWithoutScale[js.Any, typings.vegaLite.srcTypeMod.StandardType]) | typings.vegaLite.channeldefMod.OrderFieldDef[js.Any] | typings.vegaLite.channeldefMod.StringFieldDef[js.Any]
]) | typings.vegaLite.channeldefMod.OrderValueDef | typings.vegaLite.channeldefMod.NumericArrayMarkPropDef[js.Any] | typings.vegaLite.channeldefMod.LatLongDef[js.Any] | (typings.vegaLite.channeldefMod.FieldDefWithoutScale[js.Any, typings.vegaLite.srcTypeMod.StandardType]) | typings.vegaLite.channeldefMod.ShapeDef[js.Any] | typings.vegaLite.channeldefMod.StringFieldDefWithCondition[js.Any] | (typings.vegaLite.channeldefMod.StringValueDefWithCondition[js.Any, typings.vegaLite.srcTypeMod.StandardType]) | typings.vegaLite.channeldefMod.NumericMarkPropDef[js.Any] | typings.vegaLite.channeldefMod.PolarDef[js.Any] | scala.Null] */](channelDef: CD): scala.Boolean = typings.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("isConditionalDef")(channelDef.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]

inline def isConditionalSelection[T](c: typings.vegaLite.channeldefMod.Conditional[T]): /* is vega-lite.vega-lite/build/src/channeldef.ConditionalSelection<T> */ scala.Boolean = typings.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("isConditionalSelection")(c.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/channeldef.ConditionalSelection<T> */ scala.Boolean]

inline def isContinuousFieldOrDatumDef[F /* <: typings.vegaLite.channeldefMod.Field */](cd: typings.vegaLite.channeldefMod.ChannelDef[F]): scala.Boolean = typings.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("isContinuousFieldOrDatumDef")(cd.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]

inline def isContinuous_binned(
  fieldDef: typings.vegaLite.channeldefMod.TypedFieldDef[
  typings.vegaLite.channeldefMod.Field, 
  js.Any, 
  scala.Boolean | typings.vegaLite.binMod.BinParams | typings.vegaLite.vegaLiteStrings.binned | scala.Null
]
): scala.Boolean = typings.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("isContinuous")(fieldDef.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]

inline def isCount(
  fieldDef: typings.vegaLite.channeldefMod.FieldDefBase[typings.vegaLite.channeldefMod.Field, typings.vegaLite.binMod.Bin]
): scala.Boolean = typings.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("isCount")(fieldDef.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]

inline def isDatumDef[F /* <: typings.vegaLite.channeldefMod.Field */](channelDef: typings.std.Partial[typings.vegaLite.channeldefMod.ChannelDef[F]]): /* is vega-lite.vega-lite/build/src/channeldef.DatumDef<F, any> */ scala.Boolean = typings.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("isDatumDef")(channelDef.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/channeldef.DatumDef<F, any> */ scala.Boolean]
inline def isDatumDef[F /* <: typings.vegaLite.channeldefMod.Field */](channelDef: typings.vegaLite.channeldefMod.DatumDef[F, js.Any]): /* is vega-lite.vega-lite/build/src/channeldef.DatumDef<F, any> */ scala.Boolean = typings.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("isDatumDef")(channelDef.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/channeldef.DatumDef<F, any> */ scala.Boolean]
inline def isDatumDef[F /* <: typings.vegaLite.channeldefMod.Field */](channelDef: typings.vegaLite.channeldefMod.FieldDefBase[F, typings.vegaLite.binMod.Bin]): /* is vega-lite.vega-lite/build/src/channeldef.DatumDef<F, any> */ scala.Boolean = typings.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("isDatumDef")(channelDef.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/channeldef.DatumDef<F, any> */ scala.Boolean]

inline def isDiscrete(`def`: typings.vegaLite.channeldefMod.DatumDef[js.Any, js.Any]): scala.Boolean = typings.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("isDiscrete")(`def`.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]

inline def isDiscrete_binned(
  `def`: typings.vegaLite.channeldefMod.TypedFieldDef[
  typings.vegaLite.channeldefMod.Field, 
  js.Any, 
  scala.Boolean | typings.vegaLite.binMod.BinParams | typings.vegaLite.vegaLiteStrings.binned | scala.Null
]
): scala.Boolean = typings.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("isDiscrete")(`def`.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]

inline def isFieldDef[F /* <: typings.vegaLite.channeldefMod.Field */](channelDef: typings.std.Partial[typings.vegaLite.channeldefMod.ChannelDef[F]]): scala.Boolean = typings.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("isFieldDef")(channelDef.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
inline def isFieldDef[F /* <: typings.vegaLite.channeldefMod.Field */](channelDef: typings.vegaLite.channeldefMod.DatumDef[F, js.Any]): scala.Boolean = typings.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("isFieldDef")(channelDef.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
inline def isFieldDef[F /* <: typings.vegaLite.channeldefMod.Field */](channelDef: typings.vegaLite.channeldefMod.FieldDefBase[F, typings.vegaLite.binMod.Bin]): scala.Boolean = typings.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("isFieldDef")(channelDef.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]

inline def isFieldOrDatumDef[F /* <: typings.vegaLite.channeldefMod.Field */](channelDef: typings.std.Partial[typings.vegaLite.channeldefMod.ChannelDef[F]]): scala.Boolean = typings.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("isFieldOrDatumDef")(channelDef.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]

inline def isFieldOrDatumDefForTimeFormat(
  fieldOrDatumDef: typings.vegaLite.channeldefMod.DatumDef[
  java.lang.String, 
  typings.vegaLite.channeldefMod.PrimitiveValue | typings.vegaLite.datetimeMod.DateTime | typings.vegaLite.exprMod.ExprRef | typings.vegaTypings.signalMod.SignalRef
]
): scala.Boolean = typings.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("isFieldOrDatumDefForTimeFormat")(fieldOrDatumDef.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
inline def isFieldOrDatumDefForTimeFormat(fieldOrDatumDef: typings.vegaLite.channeldefMod.FieldDef[java.lang.String, js.Any]): scala.Boolean = typings.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("isFieldOrDatumDefForTimeFormat")(fieldOrDatumDef.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]

inline def isMarkPropFieldOrDatumDef[F /* <: typings.vegaLite.channeldefMod.Field */](channelDef: typings.vegaLite.channeldefMod.ChannelDef[F]): scala.Boolean = typings.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("isMarkPropFieldOrDatumDef")(channelDef.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]

inline def isNumericDataDef[F /* <: typings.vegaLite.channeldefMod.Field */](cd: typings.vegaLite.channeldefMod.ChannelDef[F]): /* is vega-lite.vega-lite/build/src/channeldef.DatumDef<F, number> */ scala.Boolean = typings.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("isNumericDataDef")(cd.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/channeldef.DatumDef<F, number> */ scala.Boolean]

inline def isPositionFieldOrDatumDef[F /* <: typings.vegaLite.channeldefMod.Field */](channelDef: typings.vegaLite.channeldefMod.ChannelDef[F]): scala.Boolean = typings.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("isPositionFieldOrDatumDef")(channelDef.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]

inline def isQuantitativeFieldOrDatumDef[F /* <: typings.vegaLite.channeldefMod.Field */](cd: typings.vegaLite.channeldefMod.ChannelDef[F]): scala.Boolean = typings.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("isQuantitativeFieldOrDatumDef")(cd.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]

inline def isRepeatRef(field: js.Any): /* is vega-lite.vega-lite/build/src/channeldef.RepeatRef */ scala.Boolean = typings.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("isRepeatRef")(field.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/channeldef.RepeatRef */ scala.Boolean]
inline def isRepeatRef(field: typings.vegaLite.channeldefMod.Field): /* is vega-lite.vega-lite/build/src/channeldef.RepeatRef */ scala.Boolean = typings.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("isRepeatRef")(field.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/channeldef.RepeatRef */ scala.Boolean]

inline def isScaleFieldDef[F /* <: typings.vegaLite.channeldefMod.Field */](channelDef: typings.vegaLite.channeldefMod.ChannelDef[F]): /* is vega-lite.vega-lite/build/src/channeldef.ScaleFieldDef<F, vega-lite.vega-lite/build/src/type.StandardType, boolean | vega-lite.vega-lite/build/src/bin.BinParams | null> */ scala.Boolean = typings.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("isScaleFieldDef")(channelDef.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/channeldef.ScaleFieldDef<F, vega-lite.vega-lite/build/src/type.StandardType, boolean | vega-lite.vega-lite/build/src/bin.BinParams | null> */ scala.Boolean]

inline def isSortableFieldDef[F /* <: typings.vegaLite.channeldefMod.Field */](fieldDef: typings.vegaLite.channeldefMod.FieldDef[F, js.Any]): /* is vega-lite.vega-lite/build/src/channeldef.SortableFieldDef<F, vega-lite.vega-lite/build/src/type.StandardType, boolean | vega-lite.vega-lite/build/src/bin.BinParams | null> */ scala.Boolean = typings.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("isSortableFieldDef")(fieldDef.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/channeldef.SortableFieldDef<F, vega-lite.vega-lite/build/src/type.StandardType, boolean | vega-lite.vega-lite/build/src/bin.BinParams | null> */ scala.Boolean]

inline def isStringFieldOrDatumDef[F /* <: typings.vegaLite.channeldefMod.Field */](channelDef: typings.vegaLite.channeldefMod.ChannelDef[F]): scala.Boolean = typings.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("isStringFieldOrDatumDef")(channelDef.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]

inline def isTimeFieldDef(
  `def`: typings.vegaLite.channeldefMod.DatumDef[
  java.lang.String, 
  typings.vegaLite.channeldefMod.PrimitiveValue | typings.vegaLite.datetimeMod.DateTime | typings.vegaLite.exprMod.ExprRef | typings.vegaTypings.signalMod.SignalRef
]
): scala.Boolean = typings.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("isTimeFieldDef")(`def`.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
inline def isTimeFieldDef(`def`: typings.vegaLite.channeldefMod.FieldDef[js.Any, js.Any]): scala.Boolean = typings.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("isTimeFieldDef")(`def`.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]

inline def isTypedFieldDef[F /* <: typings.vegaLite.channeldefMod.Field */](channelDef: typings.vegaLite.channeldefMod.ChannelDef[F]): /* is vega-lite.vega-lite/build/src/channeldef.TypedFieldDef<F, any, boolean | vega-lite.vega-lite/build/src/bin.BinParams | 'binned' | null> */ scala.Boolean = typings.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("isTypedFieldDef")(channelDef.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/channeldef.TypedFieldDef<F, any, boolean | vega-lite.vega-lite/build/src/bin.BinParams | 'binned' | null> */ scala.Boolean]

inline def isValueDef[F /* <: typings.vegaLite.channeldefMod.Field */](channelDef: typings.std.Partial[typings.vegaLite.channeldefMod.ChannelDef[F]]): /* is vega-lite.vega-lite/build/src/channeldef.ValueDef<any> */ scala.Boolean = typings.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("isValueDef")(channelDef.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/channeldef.ValueDef<any> */ scala.Boolean]

inline def normalizeBin(bin: scala.Boolean): typings.vegaLite.binMod.BinParams = typings.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("normalizeBin")(bin.asInstanceOf[js.Any]).asInstanceOf[typings.vegaLite.binMod.BinParams]
inline def normalizeBin(bin: scala.Boolean, channel: typings.vegaLite.channelMod.ExtendedChannel): typings.vegaLite.binMod.BinParams = (typings.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("normalizeBin")(bin.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[typings.vegaLite.binMod.BinParams]
inline def normalizeBin(bin: typings.vegaLite.binMod.BinParams): typings.vegaLite.binMod.BinParams = typings.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("normalizeBin")(bin.asInstanceOf[js.Any]).asInstanceOf[typings.vegaLite.binMod.BinParams]
inline def normalizeBin(bin: typings.vegaLite.binMod.BinParams, channel: typings.vegaLite.channelMod.ExtendedChannel): typings.vegaLite.binMod.BinParams = (typings.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("normalizeBin")(bin.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[typings.vegaLite.binMod.BinParams]

inline def normalizeBin_binned(bin: typings.vegaLite.vegaLiteStrings.binned): typings.vegaLite.binMod.BinParams = typings.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("normalizeBin")(bin.asInstanceOf[js.Any]).asInstanceOf[typings.vegaLite.binMod.BinParams]
inline def normalizeBin_binned(bin: typings.vegaLite.vegaLiteStrings.binned, channel: typings.vegaLite.channelMod.ExtendedChannel): typings.vegaLite.binMod.BinParams = (typings.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("normalizeBin")(bin.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[typings.vegaLite.binMod.BinParams]

inline def resetTitleFormatter(): scala.Unit = typings.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("resetTitleFormatter")().asInstanceOf[scala.Unit]

inline def setTitleFormatter(formatter: typings.vegaLite.channeldefMod.FieldTitleFormatter): scala.Unit = typings.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("setTitleFormatter")(formatter.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

inline def title(
  fieldOrDatumDef: typings.vegaLite.channeldefMod.DatumDef[
  java.lang.String, 
  typings.vegaLite.channeldefMod.PrimitiveValue | typings.vegaLite.datetimeMod.DateTime | typings.vegaLite.exprMod.ExprRef | typings.vegaTypings.signalMod.SignalRef
],
  config: typings.vegaLite.srcConfigMod.Config[typings.vegaLite.exprMod.ExprRef | typings.vegaTypings.signalMod.SignalRef],
  hasAllowDisablingIncludeDefault: typings.vegaLite.anon.AllowDisabling
): java.lang.String | js.Array[java.lang.String] | typings.vegaTypings.signalMod.SignalRef = (typings.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("title")(fieldOrDatumDef.asInstanceOf[js.Any], config.asInstanceOf[js.Any], hasAllowDisablingIncludeDefault.asInstanceOf[js.Any])).asInstanceOf[java.lang.String | js.Array[java.lang.String] | typings.vegaTypings.signalMod.SignalRef]
inline def title(
  fieldOrDatumDef: typings.vegaLite.channeldefMod.SecondaryFieldDef[java.lang.String],
  config: typings.vegaLite.srcConfigMod.Config[typings.vegaLite.exprMod.ExprRef | typings.vegaTypings.signalMod.SignalRef],
  hasAllowDisablingIncludeDefault: typings.vegaLite.anon.AllowDisabling
): java.lang.String | js.Array[java.lang.String] | typings.vegaTypings.signalMod.SignalRef = (typings.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("title")(fieldOrDatumDef.asInstanceOf[js.Any], config.asInstanceOf[js.Any], hasAllowDisablingIncludeDefault.asInstanceOf[js.Any])).asInstanceOf[java.lang.String | js.Array[java.lang.String] | typings.vegaTypings.signalMod.SignalRef]

inline def title_binned(
  fieldOrDatumDef: typings.vegaLite.channeldefMod.TypedFieldDef[
  java.lang.String, 
  js.Any, 
  scala.Boolean | typings.vegaLite.binMod.BinParams | typings.vegaLite.vegaLiteStrings.binned | scala.Null
],
  config: typings.vegaLite.srcConfigMod.Config[typings.vegaLite.exprMod.ExprRef | typings.vegaTypings.signalMod.SignalRef],
  hasAllowDisablingIncludeDefault: typings.vegaLite.anon.AllowDisabling
): java.lang.String | js.Array[java.lang.String] | typings.vegaTypings.signalMod.SignalRef = (typings.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("title")(fieldOrDatumDef.asInstanceOf[js.Any], config.asInstanceOf[js.Any], hasAllowDisablingIncludeDefault.asInstanceOf[js.Any])).asInstanceOf[java.lang.String | js.Array[java.lang.String] | typings.vegaTypings.signalMod.SignalRef]

inline def toFieldDefBase(fieldDef: typings.vegaLite.channeldefMod.FieldDef[java.lang.String, js.Any]): typings.vegaLite.channeldefMod.FieldDefBase[java.lang.String, typings.vegaLite.binMod.Bin] = typings.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("toFieldDefBase")(fieldDef.asInstanceOf[js.Any]).asInstanceOf[typings.vegaLite.channeldefMod.FieldDefBase[java.lang.String, typings.vegaLite.binMod.Bin]]

inline def toStringFieldDef[F /* <: typings.vegaLite.channeldefMod.Field */](fieldDef: typings.vegaLite.channeldefMod.FieldDef[F, js.Any]): typings.vegaLite.channeldefMod.StringFieldDef[F] = typings.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("toStringFieldDef")(fieldDef.asInstanceOf[js.Any]).asInstanceOf[typings.vegaLite.channeldefMod.StringFieldDef[F]]

inline def valueArray(
  fieldOrDatumDef: typings.vegaLite.channeldefMod.DatumDef[
  java.lang.String, 
  typings.vegaLite.channeldefMod.PrimitiveValue | typings.vegaLite.datetimeMod.DateTime | typings.vegaLite.exprMod.ExprRef | typings.vegaTypings.signalMod.SignalRef
],
  values: js.Array[
  scala.Double | java.lang.String | scala.Boolean | typings.vegaLite.datetimeMod.DateTime
]
): js.Array[
java.lang.String | scala.Double | scala.Boolean | typings.vegaLite.datetimeMod.DateTime | typings.vegaLite.anon.Signal] = (typings.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("valueArray")(fieldOrDatumDef.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[js.Array[
java.lang.String | scala.Double | scala.Boolean | typings.vegaLite.datetimeMod.DateTime | typings.vegaLite.anon.Signal]]

inline def valueArray_binned(
  fieldOrDatumDef: typings.vegaLite.channeldefMod.TypedFieldDef[
  java.lang.String, 
  js.Any, 
  scala.Boolean | typings.vegaLite.binMod.BinParams | typings.vegaLite.vegaLiteStrings.binned | scala.Null
],
  values: js.Array[
  scala.Double | java.lang.String | scala.Boolean | typings.vegaLite.datetimeMod.DateTime
]
): js.Array[
java.lang.String | scala.Double | scala.Boolean | typings.vegaLite.datetimeMod.DateTime | typings.vegaLite.anon.Signal] = (typings.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("valueArray")(fieldOrDatumDef.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[js.Array[
java.lang.String | scala.Double | scala.Boolean | typings.vegaLite.datetimeMod.DateTime | typings.vegaLite.anon.Signal]]

inline def valueExpr(
  v: java.lang.String,
  hasTimeUnitTypeWrapTimeUndefinedIfExprNotRequired: typings.vegaLite.anon.TimeUnit
): java.lang.String = (typings.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("valueExpr")(v.asInstanceOf[js.Any], hasTimeUnitTypeWrapTimeUndefinedIfExprNotRequired.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def valueExpr(
  v: js.Array[scala.Double],
  hasTimeUnitTypeWrapTimeUndefinedIfExprNotRequired: typings.vegaLite.anon.TimeUnit
): java.lang.String = (typings.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("valueExpr")(v.asInstanceOf[js.Any], hasTimeUnitTypeWrapTimeUndefinedIfExprNotRequired.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def valueExpr(
  v: scala.Boolean,
  hasTimeUnitTypeWrapTimeUndefinedIfExprNotRequired: typings.vegaLite.anon.TimeUnit
): java.lang.String = (typings.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("valueExpr")(v.asInstanceOf[js.Any], hasTimeUnitTypeWrapTimeUndefinedIfExprNotRequired.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def valueExpr(v: scala.Double, hasTimeUnitTypeWrapTimeUndefinedIfExprNotRequired: typings.vegaLite.anon.TimeUnit): java.lang.String = (typings.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("valueExpr")(v.asInstanceOf[js.Any], hasTimeUnitTypeWrapTimeUndefinedIfExprNotRequired.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def valueExpr(
  v: typings.vegaLite.datetimeMod.DateTime,
  hasTimeUnitTypeWrapTimeUndefinedIfExprNotRequired: typings.vegaLite.anon.TimeUnit
): java.lang.String = (typings.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("valueExpr")(v.asInstanceOf[js.Any], hasTimeUnitTypeWrapTimeUndefinedIfExprNotRequired.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def valueExpr(
  v: typings.vegaLite.exprMod.ExprRef,
  hasTimeUnitTypeWrapTimeUndefinedIfExprNotRequired: typings.vegaLite.anon.TimeUnit
): java.lang.String = (typings.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("valueExpr")(v.asInstanceOf[js.Any], hasTimeUnitTypeWrapTimeUndefinedIfExprNotRequired.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def valueExpr(
  v: typings.vegaTypings.signalMod.SignalRef,
  hasTimeUnitTypeWrapTimeUndefinedIfExprNotRequired: typings.vegaLite.anon.TimeUnit
): java.lang.String = (typings.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("valueExpr")(v.asInstanceOf[js.Any], hasTimeUnitTypeWrapTimeUndefinedIfExprNotRequired.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]

inline def verbalTitleFormatter(
  fieldDef: typings.vegaLite.channeldefMod.FieldDefBase[java.lang.String, typings.vegaLite.binMod.Bin],
  config: typings.vegaLite.srcConfigMod.Config[typings.vegaLite.exprMod.ExprRef | typings.vegaTypings.signalMod.SignalRef]
): java.lang.String = (typings.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("verbalTitleFormatter")(fieldDef.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]

inline def vgField(
  fieldDef: typings.vegaLite.channeldefMod.FieldDefBase[java.lang.String, typings.vegaLite.binMod.Bin]
): java.lang.String = typings.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("vgField")(fieldDef.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
inline def vgField(
  fieldDef: typings.vegaLite.channeldefMod.FieldDefBase[java.lang.String, typings.vegaLite.binMod.Bin],
  opt: typings.vegaLite.channeldefMod.FieldRefOption
): java.lang.String = (typings.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("vgField")(fieldDef.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def vgField(fieldDef: typings.vegaLite.transformMod.AggregatedFieldDef): java.lang.String = typings.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("vgField")(fieldDef.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
inline def vgField(
  fieldDef: typings.vegaLite.transformMod.AggregatedFieldDef,
  opt: typings.vegaLite.channeldefMod.FieldRefOption
): java.lang.String = (typings.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("vgField")(fieldDef.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def vgField(fieldDef: typings.vegaLite.transformMod.WindowFieldDef): java.lang.String = typings.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("vgField")(fieldDef.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
inline def vgField(
  fieldDef: typings.vegaLite.transformMod.WindowFieldDef,
  opt: typings.vegaLite.channeldefMod.FieldRefOption
): java.lang.String = (typings.vegaLite.channeldefMod.^.asInstanceOf[js.Dynamic].applyDynamic("vgField")(fieldDef.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]

/* Rewritten from type alias, can be one of: 
  - typings.vegaLite.channeldefMod.TextDef[F]
  - scala.Unit
  - typings.vegaLite.channeldefMod.PositionDef[F]
  - typings.vegaLite.channeldefMod.Position2Def[F]
  - typings.vegaLite.channeldefMod.FieldDefWithoutScale[F, typings.vegaLite.srcTypeMod.StandardType]
  - typings.vegaLite.channeldefMod.NumericArrayMarkPropDef[F]
  - typings.vegaLite.channeldefMod.StringFieldDefWithCondition[F]
  - typings.vegaLite.channeldefMod.StringValueDefWithCondition[F, typings.vegaLite.srcTypeMod.StandardType]
  - typings.vegaLite.channeldefMod.OrderFieldDef[F]
  - js.Array[
(typings.vegaLite.channeldefMod.FieldDefWithoutScale[F, typings.vegaLite.srcTypeMod.StandardType]) | typings.vegaLite.channeldefMod.OrderFieldDef[F] | typings.vegaLite.channeldefMod.StringFieldDef[F]]
  - typings.vegaLite.channeldefMod.OrderValueDef
  - typings.vegaLite.channeldefMod.PolarDef[F]
  - typings.vegaLite.channeldefMod.LatLongDef[F]
  - typings.vegaLite.channeldefMod.NumericMarkPropDef[F]
  - scala.Null
  - typings.vegaLite.channeldefMod.ColorDef[F]
  - typings.vegaLite.channeldefMod.ShapeDef[F]
*/
type ChannelDef[F /* <: typings.vegaLite.channeldefMod.Field */] = js.UndefOr[
typings.vegaLite.channeldefMod._ChannelDef[F] | (typings.vegaLite.channeldefMod.FieldDefWithoutScale[F, typings.vegaLite.srcTypeMod.StandardType]) | (typings.vegaLite.channeldefMod.StringValueDefWithCondition[F, typings.vegaLite.srcTypeMod.StandardType]) | (js.Array[
  (typings.vegaLite.channeldefMod.FieldDefWithoutScale[F, typings.vegaLite.srcTypeMod.StandardType]) | typings.vegaLite.channeldefMod.OrderFieldDef[F] | typings.vegaLite.channeldefMod.StringFieldDef[F]
]) | typings.vegaLite.channeldefMod.TextDef[F] | typings.vegaLite.channeldefMod.PositionDef[F] | typings.vegaLite.channeldefMod.Position2Def[F] | typings.vegaLite.channeldefMod.NumericArrayMarkPropDef[F] | typings.vegaLite.channeldefMod.StringFieldDefWithCondition[F] | typings.vegaLite.channeldefMod.PolarDef[F] | typings.vegaLite.channeldefMod.LatLongDef[F] | typings.vegaLite.channeldefMod.NumericMarkPropDef[F] | scala.Null | typings.vegaLite.channeldefMod.ColorDef[F] | typings.vegaLite.channeldefMod.ShapeDef[F]]

type ColorDef[F /* <: typings.vegaLite.channeldefMod.Field */] = typings.vegaLite.channeldefMod.MarkPropDef[
F, 
typings.vegaTypings.encodeMod.Gradient | java.lang.String | scala.Null, 
typings.vegaLite.srcTypeMod.StandardType]

type Conditional[CD /* <: (typings.vegaLite.channeldefMod.FieldDef[js.Any, js.Any]) | (typings.vegaLite.channeldefMod.DatumDef[
java.lang.String, 
typings.vegaLite.channeldefMod.PrimitiveValue | typings.vegaLite.datetimeMod.DateTime | typings.vegaLite.exprMod.ExprRef | typings.vegaTypings.signalMod.SignalRef]) | typings.vegaLite.channeldefMod.ValueDef[js.Any] | typings.vegaLite.exprMod.ExprRef | typings.vegaTypings.signalMod.SignalRef */] = typings.vegaLite.channeldefMod.ConditionalPredicate[CD] | typings.vegaLite.channeldefMod.ConditionalSelection[CD]

type ConditionalPredicate[CD /* <: (typings.vegaLite.channeldefMod.FieldDef[js.Any, js.Any]) | (typings.vegaLite.channeldefMod.DatumDef[
java.lang.String, 
typings.vegaLite.channeldefMod.PrimitiveValue | typings.vegaLite.datetimeMod.DateTime | typings.vegaLite.exprMod.ExprRef | typings.vegaTypings.signalMod.SignalRef]) | typings.vegaLite.channeldefMod.ValueDef[js.Any] | typings.vegaLite.exprMod.ExprRef | typings.vegaTypings.signalMod.SignalRef */] = typings.vegaLite.anon.Test & CD

type ConditionalSelection[CD /* <: (typings.vegaLite.channeldefMod.FieldDef[js.Any, js.Any]) | (typings.vegaLite.channeldefMod.DatumDef[
java.lang.String, 
typings.vegaLite.channeldefMod.PrimitiveValue | typings.vegaLite.datetimeMod.DateTime | typings.vegaLite.exprMod.ExprRef | typings.vegaTypings.signalMod.SignalRef]) | typings.vegaLite.channeldefMod.ValueDef[js.Any] | typings.vegaLite.exprMod.ExprRef | typings.vegaTypings.signalMod.SignalRef */] = typings.vegaLite.anon.Selection & CD

type Field = typings.vegaLite.channeldefMod.FieldName | typings.vegaLite.channeldefMod.RepeatRef

type FieldDef[F /* <: typings.vegaLite.channeldefMod.Field */, T /* <: typings.vegaLite.srcTypeMod.Type */] = typings.vegaLite.channeldefMod.SecondaryFieldDef[F] | (typings.vegaLite.channeldefMod.TypedFieldDef[
F, 
T, 
scala.Boolean | typings.vegaLite.binMod.BinParams | typings.vegaLite.vegaLiteStrings.binned | scala.Null])

type FieldDefWithoutScale[F /* <: typings.vegaLite.channeldefMod.Field */, T /* <: typings.vegaLite.srcTypeMod.Type */] = typings.vegaLite.channeldefMod.TypedFieldDef[
F, 
T, 
scala.Boolean | typings.vegaLite.binMod.BinParams | typings.vegaLite.vegaLiteStrings.binned | scala.Null]

type FieldName = java.lang.String

type FieldOrDatumDefWithCondition[F /* <: (typings.vegaLite.channeldefMod.FieldDef[js.Any, js.Any]) | (typings.vegaLite.channeldefMod.DatumDef[
js.Any, 
typings.vegaLite.channeldefMod.PrimitiveValue | typings.vegaLite.datetimeMod.DateTime | typings.vegaLite.exprMod.ExprRef | typings.vegaTypings.signalMod.SignalRef]) */, V /* <: typings.vegaLite.channeldefMod.Value[typings.vegaLite.exprMod.ExprRef | typings.vegaTypings.signalMod.SignalRef] */] = F & (typings.vegaLite.channeldefMod.ConditionValueDefMixins[V | typings.vegaLite.exprMod.ExprRef | typings.vegaTypings.signalMod.SignalRef])

type FieldTitleFormatter = js.Function2[
/* fieldDef */ typings.vegaLite.channeldefMod.FieldDefBase[java.lang.String, typings.vegaLite.binMod.Bin], 
/* config */ typings.vegaLite.srcConfigMod.Config[typings.vegaLite.exprMod.ExprRef | typings.vegaTypings.signalMod.SignalRef], 
java.lang.String]

type HiddenCompositeAggregate = typings.vegaLite.compositemarkMod.CompositeAggregate

type LatLongDef[F /* <: typings.vegaLite.channeldefMod.Field */] = typings.vegaLite.channeldefMod.LatLongFieldDef[F] | (typings.vegaLite.channeldefMod.DatumDef[
F, 
typings.vegaLite.channeldefMod.PrimitiveValue | typings.vegaLite.datetimeMod.DateTime | typings.vegaLite.exprMod.ExprRef | typings.vegaTypings.signalMod.SignalRef]) | typings.vegaLite.channeldefMod.NumericValueDef

type MarkPropDef[F /* <: typings.vegaLite.channeldefMod.Field */, V /* <: typings.vegaLite.channeldefMod.Value[typings.vegaLite.exprMod.ExprRef | typings.vegaTypings.signalMod.SignalRef] */, T /* <: typings.vegaLite.srcTypeMod.Type */] = (typings.vegaLite.channeldefMod.FieldOrDatumDefWithCondition[
(typings.vegaLite.channeldefMod.DatumDef[
  F, 
  typings.vegaLite.channeldefMod.PrimitiveValue | typings.vegaLite.datetimeMod.DateTime | typings.vegaLite.exprMod.ExprRef | typings.vegaTypings.signalMod.SignalRef
]) | (typings.vegaLite.channeldefMod.MarkPropFieldDef[F, T]), 
V]) | (typings.vegaLite.channeldefMod.ValueDefWithCondition[typings.vegaLite.channeldefMod.MarkPropFieldOrDatumDef[F, T], V])

type MarkPropFieldDef[F /* <: typings.vegaLite.channeldefMod.Field */, T /* <: typings.vegaLite.srcTypeMod.Type */] = (typings.vegaLite.channeldefMod.ScaleFieldDef[F, T, scala.Boolean | typings.vegaLite.binMod.BinParams | scala.Null]) & typings.vegaLite.channeldefMod.LegendMixins

type MarkPropFieldOrDatumDef[F /* <: typings.vegaLite.channeldefMod.Field */, T /* <: typings.vegaLite.srcTypeMod.Type */] = (typings.vegaLite.channeldefMod.MarkPropFieldDef[F, T]) | typings.vegaLite.channeldefMod.MarkPropDatumDef[F]

type NumericArrayMarkPropDef[F /* <: typings.vegaLite.channeldefMod.Field */] = typings.vegaLite.channeldefMod.MarkPropDef[F, js.Array[scala.Double], typings.vegaLite.srcTypeMod.StandardType]

type NumericMarkPropDef[F /* <: typings.vegaLite.channeldefMod.Field */] = typings.vegaLite.channeldefMod.MarkPropDef[F, scala.Double, typings.vegaLite.srcTypeMod.StandardType]

type NumericValueDef = typings.vegaLite.channeldefMod.ValueDef[
scala.Double | typings.vegaLite.exprMod.ExprRef | typings.vegaTypings.signalMod.SignalRef]

type PolarDef[F /* <: typings.vegaLite.channeldefMod.Field */] = typings.vegaLite.channeldefMod.PositionFieldDefBase[F] | typings.vegaLite.channeldefMod.PositionDatumDefBase[F] | typings.vegaLite.channeldefMod.PositionValueDef

type Position2Def[F /* <: typings.vegaLite.channeldefMod.Field */] = typings.vegaLite.channeldefMod.SecondaryFieldDef[F] | (typings.vegaLite.channeldefMod.DatumDef[
F, 
typings.vegaLite.channeldefMod.PrimitiveValue | typings.vegaLite.datetimeMod.DateTime | typings.vegaLite.exprMod.ExprRef | typings.vegaTypings.signalMod.SignalRef]) | typings.vegaLite.channeldefMod.PositionValueDef

type PositionDef[F /* <: typings.vegaLite.channeldefMod.Field */] = typings.vegaLite.channeldefMod.PositionFieldDef[F] | typings.vegaLite.channeldefMod.PositionDatumDef[F] | typings.vegaLite.channeldefMod.PositionValueDef

type PositionFieldDef[F /* <: typings.vegaLite.channeldefMod.Field */] = typings.vegaLite.channeldefMod.PositionFieldDefBase[F] & typings.vegaLite.channeldefMod.PositionMixins

type PositionFieldDefBase[F /* <: typings.vegaLite.channeldefMod.Field */] = (typings.vegaLite.channeldefMod.ScaleFieldDef[
F, 
typings.vegaLite.srcTypeMod.StandardType, 
scala.Boolean | typings.vegaLite.binMod.BinParams | typings.vegaLite.vegaLiteStrings.binned | scala.Null]) & typings.vegaLite.channeldefMod.PositionBaseMixins

type PositionValueDef = typings.vegaLite.channeldefMod.ValueDef[
scala.Double | typings.vegaLite.vegaLiteStrings.width | typings.vegaLite.vegaLiteStrings.height | typings.vegaLite.exprMod.ExprRef | typings.vegaTypings.signalMod.SignalRef]

type PrimitiveValue = scala.Double | java.lang.String | scala.Boolean | scala.Null

type SecondaryChannelDef[F /* <: typings.vegaLite.channeldefMod.Field */] = js.UndefOr[typings.vegaLite.channeldefMod.Position2Def[F]]

type ShapeDef[F /* <: typings.vegaLite.channeldefMod.Field */] = typings.vegaLite.channeldefMod.MarkPropDef[F, java.lang.String | scala.Null, typings.vegaLite.channeldefMod.TypeForShape]

type StringFieldDefWithCondition[F /* <: typings.vegaLite.channeldefMod.Field */] = typings.vegaLite.channeldefMod.FieldOrDatumDefWithCondition[typings.vegaLite.channeldefMod.StringFieldDef[F], java.lang.String]

type TextDef[F /* <: typings.vegaLite.channeldefMod.Field */] = (typings.vegaLite.channeldefMod.FieldOrDatumDefWithCondition[
typings.vegaLite.channeldefMod.StringDatumDef[F] | typings.vegaLite.channeldefMod.StringFieldDef[F], 
typings.vegaTypings.encodeMod.Text]) | (typings.vegaLite.channeldefMod.ValueDefWithCondition[
typings.vegaLite.channeldefMod.StringFieldDef[F], 
typings.vegaTypings.encodeMod.Text])

type Value[ES /* <: typings.vegaLite.exprMod.ExprRef | typings.vegaTypings.signalMod.SignalRef */] = typings.vegaLite.channeldefMod.PrimitiveValue | js.Array[scala.Double] | typings.vegaTypings.encodeMod.Gradient | typings.vegaTypings.encodeMod.Text | ES
