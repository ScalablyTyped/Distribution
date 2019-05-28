package typings
package vegaDashEmbedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeoffieldDef extends js.Object {
  def channelCompatibility(
    fieldDef: vegaDashLiteLib.buildSrcFielddefMod.FieldDef[vegaDashLiteLib.buildSrcFielddefMod.Field],
    channel: vegaDashLiteLib.buildSrcChannelMod.Channel
  ): vegaDashLiteLib.Anon_Compatible = js.native
  def defaultTitleFormatter(
    fieldDef: vegaDashLiteLib.buildSrcFielddefMod.FieldDefBase[java.lang.String],
    config: vegaDashLiteLib.buildSrcConfigMod.Config
  ): java.lang.String = js.native
  def defaultType(
    fieldDef: vegaDashLiteLib.buildSrcFielddefMod.FieldDef[vegaDashLiteLib.buildSrcFielddefMod.Field],
    channel: vegaDashLiteLib.buildSrcChannelMod.Channel
  ): vegaDashLiteLib.buildSrcTypeMod.Type = js.native
  def functionalTitleFormatter(
    fieldDef: vegaDashLiteLib.buildSrcFielddefMod.FieldDefBase[java.lang.String],
    config: vegaDashLiteLib.buildSrcConfigMod.Config
  ): java.lang.String = js.native
  def getFieldDef[F](channelDef: vegaDashLiteLib.buildSrcFielddefMod.ChannelDef[F]): vegaDashLiteLib.buildSrcFielddefMod.FieldDef[F] = js.native
  def hasConditionalFieldDef[F](channelDef: vegaDashLiteLib.buildSrcFielddefMod.ChannelDef[F]): scala.Boolean = js.native
  def hasConditionalValueDef[F](channelDef: vegaDashLiteLib.buildSrcFielddefMod.ChannelDef[F]): scala.Boolean = js.native
  def isConditionalDef[F](channelDef: vegaDashLiteLib.buildSrcFielddefMod.ChannelDef[F]): /* is vega-lite.vega-lite/build/src/fielddef.ChannelDefWithCondition<vega-lite.vega-lite/build/src/fielddef.FieldDef<F>> */ scala.Boolean = js.native
  def isConditionalSelection[T](c: vegaDashLiteLib.buildSrcFielddefMod.Conditional[T]): /* is vega-lite.vega-lite/build/src/fielddef.ConditionalSelection<T> */ scala.Boolean = js.native
  def isContinuous(fieldDef: vegaDashLiteLib.buildSrcFielddefMod.FieldDef[vegaDashLiteLib.buildSrcFielddefMod.Field]): scala.Boolean = js.native
  def isCount(
    fieldDef: vegaDashLiteLib.buildSrcFielddefMod.FieldDefBase[vegaDashLiteLib.buildSrcFielddefMod.Field]
  ): scala.Boolean = js.native
  def isDiscrete(fieldDef: vegaDashLiteLib.buildSrcFielddefMod.FieldDef[vegaDashLiteLib.buildSrcFielddefMod.Field]): scala.Boolean = js.native
  def isFieldDef[F](channelDef: vegaDashLiteLib.buildSrcFielddefMod.ChannelDef[F]): scala.Boolean = js.native
  def isNumberFieldDef(fieldDef: vegaDashLiteLib.buildSrcFielddefMod.FieldDef[_]): scala.Boolean = js.native
  def isRepeatRef(field: vegaDashLiteLib.buildSrcFielddefMod.Field): /* is vega-lite.vega-lite/build/src/fielddef.RepeatRef */ scala.Boolean = js.native
  def isScaleFieldDef[F](channelDef: vegaDashLiteLib.buildSrcFielddefMod.ChannelDef[F]): /* is vega-lite.vega-lite/build/src/fielddef.ScaleFieldDef<F> */ scala.Boolean = js.native
  def isStringFieldDef(
    fieldDef: vegaDashLiteLib.buildSrcFielddefMod.ChannelDef[java.lang.String | vegaDashLiteLib.buildSrcFielddefMod.RepeatRef]
  ): /* is vega-lite.vega-lite/build/src/fielddef.FieldDef<string> */ scala.Boolean = js.native
  def isTimeFieldDef(fieldDef: vegaDashLiteLib.buildSrcFielddefMod.FieldDef[_]): scala.Boolean = js.native
  def isValueDef[F](channelDef: vegaDashLiteLib.buildSrcFielddefMod.ChannelDef[F]): /* is vega-lite.vega-lite/build/src/fielddef.ValueDef */ scala.Boolean = js.native
  def normalize(
    channelDef: vegaDashLiteLib.buildSrcFielddefMod.ChannelDef[java.lang.String],
    channel: vegaDashLiteLib.buildSrcChannelMod.Channel
  ): vegaDashLiteLib.buildSrcFielddefMod.ChannelDef[_] = js.native
  def normalizeBin(bin: scala.Boolean, channel: vegaDashLiteLib.buildSrcChannelMod.Channel): vegaDashLiteLib.buildSrcBinMod.BinParams = js.native
  def normalizeBin(bin: vegaDashLiteLib.buildSrcBinMod.BinParams, channel: vegaDashLiteLib.buildSrcChannelMod.Channel): vegaDashLiteLib.buildSrcBinMod.BinParams = js.native
  def normalizeFieldDef(
    fieldDef: vegaDashLiteLib.buildSrcFielddefMod.FieldDef[java.lang.String],
    channel: vegaDashLiteLib.buildSrcChannelMod.Channel
  ): vegaDashLiteLib.buildSrcFielddefMod.FieldDef[java.lang.String] = js.native
  def resetTitleFormatter(): scala.Unit = js.native
  def setTitleFormatter(formatter: vegaDashLiteLib.buildSrcFielddefMod.FieldTitleFormatter): scala.Unit = js.native
  def title(
    fieldDef: vegaDashLiteLib.buildSrcFielddefMod.FieldDefBase[java.lang.String],
    config: vegaDashLiteLib.buildSrcConfigMod.Config
  ): java.lang.String = js.native
  def toFieldDefBase(fieldDef: vegaDashLiteLib.buildSrcFielddefMod.FieldDef[java.lang.String]): vegaDashLiteLib.buildSrcFielddefMod.FieldDefBase[java.lang.String] = js.native
  def valueArray(
    fieldDef: vegaDashLiteLib.buildSrcFielddefMod.FieldDef[java.lang.String],
    values: js.Array[
      scala.Double | java.lang.String | scala.Boolean | vegaDashLiteLib.buildSrcDatetimeMod.DateTime
    ]
  ): js.Array[
    java.lang.String | scala.Double | scala.Boolean | vegaDashLiteLib.buildSrcDatetimeMod.DateTime | vegaDashLiteLib.Anon_Signal
  ] = js.native
  def valueExpr(v: java.lang.String, hasTimeUnitTypeTimeUndefinedIfExprNotRequired: vegaDashLiteLib.Anon_Time): java.lang.String = js.native
  def valueExpr(v: scala.Boolean, hasTimeUnitTypeTimeUndefinedIfExprNotRequired: vegaDashLiteLib.Anon_Time): java.lang.String = js.native
  def valueExpr(v: scala.Double, hasTimeUnitTypeTimeUndefinedIfExprNotRequired: vegaDashLiteLib.Anon_Time): java.lang.String = js.native
  def valueExpr(
    v: vegaDashLiteLib.buildSrcDatetimeMod.DateTime,
    hasTimeUnitTypeTimeUndefinedIfExprNotRequired: vegaDashLiteLib.Anon_Time
  ): java.lang.String = js.native
  def verbalTitleFormatter(
    fieldDef: vegaDashLiteLib.buildSrcFielddefMod.FieldDefBase[java.lang.String],
    config: vegaDashLiteLib.buildSrcConfigMod.Config
  ): java.lang.String = js.native
  def vgField(fieldDef: vegaDashLiteLib.buildSrcFielddefMod.FieldDefBase[java.lang.String]): java.lang.String = js.native
  def vgField(
    fieldDef: vegaDashLiteLib.buildSrcFielddefMod.FieldDefBase[java.lang.String],
    opt: vegaDashLiteLib.buildSrcFielddefMod.FieldRefOption
  ): java.lang.String = js.native
  def vgField(fieldDef: vegaDashLiteLib.buildSrcTransformMod.AggregatedFieldDef): java.lang.String = js.native
  def vgField(
    fieldDef: vegaDashLiteLib.buildSrcTransformMod.AggregatedFieldDef,
    opt: vegaDashLiteLib.buildSrcFielddefMod.FieldRefOption
  ): java.lang.String = js.native
  def vgField(fieldDef: vegaDashLiteLib.buildSrcTransformMod.WindowFieldDef): java.lang.String = js.native
  def vgField(
    fieldDef: vegaDashLiteLib.buildSrcTransformMod.WindowFieldDef,
    opt: vegaDashLiteLib.buildSrcFielddefMod.FieldRefOption
  ): java.lang.String = js.native
}

