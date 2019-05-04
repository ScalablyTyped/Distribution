package typings
package vegaDashLiteLib.buildSrcFielddefMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-lite/build/src/fielddef", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val defaultTitleFormatter: FieldTitleFormatter = js.native
  def channelCompatibility(fieldDef: FieldDef[Field], channel: vegaDashLiteLib.buildSrcChannelMod.Channel): vegaDashLiteLib.Anon_Compatible = js.native
  def defaultType(fieldDef: FieldDef[Field], channel: vegaDashLiteLib.buildSrcChannelMod.Channel): vegaDashLiteLib.buildSrcTypeMod.Type = js.native
  def functionalTitleFormatter(fieldDef: FieldDefBase[java.lang.String], config: vegaDashLiteLib.buildSrcConfigMod.Config): java.lang.String = js.native
  def getFieldDef[F](channelDef: ChannelDef[F]): FieldDef[F] = js.native
  def hasConditionalFieldDef[F](channelDef: ChannelDef[F]): scala.Boolean = js.native
  def hasConditionalValueDef[F](channelDef: ChannelDef[F]): scala.Boolean = js.native
  def isConditionalDef[F](channelDef: ChannelDef[F]): /* is vega-lite.vega-lite/build/src/fielddef.ChannelDefWithCondition<vega-lite.vega-lite/build/src/fielddef.FieldDef<F>> */ scala.Boolean = js.native
  def isConditionalSelection[T](c: Conditional[T]): /* is vega-lite.vega-lite/build/src/fielddef.ConditionalSelection<T> */ scala.Boolean = js.native
  def isContinuous(fieldDef: FieldDef[Field]): scala.Boolean = js.native
  def isCount(fieldDef: FieldDefBase[Field]): scala.Boolean = js.native
  def isDiscrete(fieldDef: FieldDef[Field]): scala.Boolean = js.native
  def isFieldDef[F](channelDef: ChannelDef[F]): scala.Boolean = js.native
  def isNumberFieldDef(fieldDef: FieldDef[_]): scala.Boolean = js.native
  def isRepeatRef(field: Field): /* is vega-lite.vega-lite/build/src/fielddef.RepeatRef */ scala.Boolean = js.native
  def isScaleFieldDef[F](channelDef: ChannelDef[F]): /* is vega-lite.vega-lite/build/src/fielddef.ScaleFieldDef<F> */ scala.Boolean = js.native
  def isStringFieldDef(fieldDef: ChannelDef[java.lang.String | RepeatRef]): /* is vega-lite.vega-lite/build/src/fielddef.FieldDef<string> */ scala.Boolean = js.native
  def isTimeFieldDef(fieldDef: FieldDef[_]): scala.Boolean = js.native
  def isValueDef[F](channelDef: ChannelDef[F]): /* is vega-lite.vega-lite/build/src/fielddef.ValueDef */ scala.Boolean = js.native
  def normalize(channelDef: ChannelDef[java.lang.String], channel: vegaDashLiteLib.buildSrcChannelMod.Channel): ChannelDef[_] = js.native
  def normalizeBin(bin: scala.Boolean, channel: vegaDashLiteLib.buildSrcChannelMod.Channel): vegaDashLiteLib.buildSrcBinMod.BinParams = js.native
  def normalizeBin(bin: vegaDashLiteLib.buildSrcBinMod.BinParams, channel: vegaDashLiteLib.buildSrcChannelMod.Channel): vegaDashLiteLib.buildSrcBinMod.BinParams = js.native
  def normalizeFieldDef(fieldDef: FieldDef[java.lang.String], channel: vegaDashLiteLib.buildSrcChannelMod.Channel): FieldDef[java.lang.String] = js.native
  def resetTitleFormatter(): scala.Unit = js.native
  def setTitleFormatter(formatter: FieldTitleFormatter): scala.Unit = js.native
  def title(fieldDef: FieldDefBase[java.lang.String], config: vegaDashLiteLib.buildSrcConfigMod.Config): java.lang.String = js.native
  def toFieldDefBase(fieldDef: FieldDef[java.lang.String]): FieldDefBase[java.lang.String] = js.native
  def valueArray(
    fieldDef: FieldDef[java.lang.String],
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
  def verbalTitleFormatter(fieldDef: FieldDefBase[java.lang.String], config: vegaDashLiteLib.buildSrcConfigMod.Config): java.lang.String = js.native
  def vgField(fieldDef: FieldDefBase[java.lang.String]): java.lang.String = js.native
  def vgField(fieldDef: FieldDefBase[java.lang.String], opt: FieldRefOption): java.lang.String = js.native
  def vgField(fieldDef: vegaDashLiteLib.buildSrcTransformMod.AggregatedFieldDef): java.lang.String = js.native
  def vgField(fieldDef: vegaDashLiteLib.buildSrcTransformMod.AggregatedFieldDef, opt: FieldRefOption): java.lang.String = js.native
  def vgField(fieldDef: vegaDashLiteLib.buildSrcTransformMod.WindowFieldDef): java.lang.String = js.native
  def vgField(fieldDef: vegaDashLiteLib.buildSrcTransformMod.WindowFieldDef, opt: FieldRefOption): java.lang.String = js.native
}

