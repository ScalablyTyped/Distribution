package typings.vegaDashEmbed

import typings.vegaDashLite.Anon_Compatible
import typings.vegaDashLite.Anon_Signal
import typings.vegaDashLite.Anon_Time
import typings.vegaDashLite.buildSrcBinMod.BinParams
import typings.vegaDashLite.buildSrcChannelMod.Channel
import typings.vegaDashLite.buildSrcConfigMod.Config
import typings.vegaDashLite.buildSrcDatetimeMod.DateTime
import typings.vegaDashLite.buildSrcFielddefMod.ChannelDef
import typings.vegaDashLite.buildSrcFielddefMod.Conditional
import typings.vegaDashLite.buildSrcFielddefMod.Field
import typings.vegaDashLite.buildSrcFielddefMod.FieldDef
import typings.vegaDashLite.buildSrcFielddefMod.FieldDefBase
import typings.vegaDashLite.buildSrcFielddefMod.FieldRefOption
import typings.vegaDashLite.buildSrcFielddefMod.FieldTitleFormatter
import typings.vegaDashLite.buildSrcFielddefMod.RepeatRef
import typings.vegaDashLite.buildSrcTransformMod.AggregatedFieldDef
import typings.vegaDashLite.buildSrcTransformMod.WindowFieldDef
import typings.vegaDashLite.buildSrcTypeMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeoffieldDef extends js.Object {
  def channelCompatibility(fieldDef: FieldDef[Field], channel: Channel): Anon_Compatible = js.native
  def defaultTitleFormatter(fieldDef: FieldDefBase[String], config: Config): String = js.native
  def defaultType(fieldDef: FieldDef[Field], channel: Channel): Type = js.native
  def functionalTitleFormatter(fieldDef: FieldDefBase[String], config: Config): String = js.native
  def getFieldDef[F](channelDef: ChannelDef[F]): FieldDef[F] = js.native
  def hasConditionalFieldDef[F](channelDef: ChannelDef[F]): Boolean = js.native
  def hasConditionalValueDef[F](channelDef: ChannelDef[F]): Boolean = js.native
  def isConditionalDef[F](channelDef: ChannelDef[F]): /* is vega-lite.vega-lite/build/src/fielddef.ChannelDefWithCondition<vega-lite.vega-lite/build/src/fielddef.FieldDef<F>> */ Boolean = js.native
  def isConditionalSelection[T](c: Conditional[T]): /* is vega-lite.vega-lite/build/src/fielddef.ConditionalSelection<T> */ Boolean = js.native
  def isContinuous(fieldDef: FieldDef[Field]): Boolean = js.native
  def isCount(fieldDef: FieldDefBase[Field]): Boolean = js.native
  def isDiscrete(fieldDef: FieldDef[Field]): Boolean = js.native
  def isFieldDef[F](channelDef: ChannelDef[F]): Boolean = js.native
  def isNumberFieldDef(fieldDef: FieldDef[_]): Boolean = js.native
  def isRepeatRef(field: Field): /* is vega-lite.vega-lite/build/src/fielddef.RepeatRef */ Boolean = js.native
  def isScaleFieldDef[F](channelDef: ChannelDef[F]): /* is vega-lite.vega-lite/build/src/fielddef.ScaleFieldDef<F> */ Boolean = js.native
  def isStringFieldDef(fieldDef: ChannelDef[String | RepeatRef]): /* is vega-lite.vega-lite/build/src/fielddef.FieldDef<string> */ Boolean = js.native
  def isTimeFieldDef(fieldDef: FieldDef[_]): Boolean = js.native
  def isValueDef[F](channelDef: ChannelDef[F]): /* is vega-lite.vega-lite/build/src/fielddef.ValueDef */ Boolean = js.native
  def normalize(channelDef: ChannelDef[String], channel: Channel): ChannelDef[_] = js.native
  def normalizeBin(bin: Boolean, channel: Channel): BinParams = js.native
  def normalizeBin(bin: BinParams, channel: Channel): BinParams = js.native
  def normalizeFieldDef(fieldDef: FieldDef[String], channel: Channel): FieldDef[String] = js.native
  def resetTitleFormatter(): Unit = js.native
  def setTitleFormatter(formatter: FieldTitleFormatter): Unit = js.native
  def title(fieldDef: FieldDefBase[String], config: Config): String = js.native
  def toFieldDefBase(fieldDef: FieldDef[String]): FieldDefBase[String] = js.native
  def valueArray(fieldDef: FieldDef[String], values: js.Array[Double | String | Boolean | DateTime]): js.Array[String | Double | Boolean | DateTime | Anon_Signal] = js.native
  def valueExpr(v: String, hasTimeUnitTypeTimeUndefinedIfExprNotRequired: Anon_Time): String = js.native
  def valueExpr(v: Boolean, hasTimeUnitTypeTimeUndefinedIfExprNotRequired: Anon_Time): String = js.native
  def valueExpr(v: Double, hasTimeUnitTypeTimeUndefinedIfExprNotRequired: Anon_Time): String = js.native
  def valueExpr(v: DateTime, hasTimeUnitTypeTimeUndefinedIfExprNotRequired: Anon_Time): String = js.native
  def verbalTitleFormatter(fieldDef: FieldDefBase[String], config: Config): String = js.native
  def vgField(fieldDef: FieldDefBase[String]): String = js.native
  def vgField(fieldDef: FieldDefBase[String], opt: FieldRefOption): String = js.native
  def vgField(fieldDef: AggregatedFieldDef): String = js.native
  def vgField(fieldDef: AggregatedFieldDef, opt: FieldRefOption): String = js.native
  def vgField(fieldDef: WindowFieldDef): String = js.native
  def vgField(fieldDef: WindowFieldDef, opt: FieldRefOption): String = js.native
}

