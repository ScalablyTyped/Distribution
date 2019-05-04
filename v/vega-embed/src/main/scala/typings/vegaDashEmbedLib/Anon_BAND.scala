package typings
package vegaDashEmbedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BAND extends js.Object {
  val BAND: vegaDashEmbedLib.vegaDashEmbedLibStrings.band
  val BIN_LINEAR: vegaDashEmbedLib.vegaDashEmbedLibStrings.`bin-linear`
  val BIN_ORDINAL: vegaDashEmbedLib.vegaDashEmbedLibStrings.`bin-ordinal`
  val LINEAR: vegaDashEmbedLib.vegaDashEmbedLibStrings.linear
  val LOG: vegaDashEmbedLib.vegaDashEmbedLibStrings.log
  val ORDINAL: vegaDashEmbedLib.vegaDashEmbedLibStrings.ordinal
  val POINT: vegaDashEmbedLib.vegaDashEmbedLibStrings.point
  val POW: vegaDashEmbedLib.vegaDashEmbedLibStrings.pow
  val QUANTILE: vegaDashEmbedLib.vegaDashEmbedLibStrings.quantile
  val QUANTIZE: vegaDashEmbedLib.vegaDashEmbedLibStrings.quantize
  val SEQUENTIAL: vegaDashEmbedLib.vegaDashEmbedLibStrings.sequential
  val SQRT: vegaDashEmbedLib.vegaDashEmbedLibStrings.sqrt
  val THRESHOLD: vegaDashEmbedLib.vegaDashEmbedLibStrings.threshold
  val TIME: vegaDashEmbedLib.vegaDashEmbedLibStrings.time
  val UTC: vegaDashEmbedLib.vegaDashEmbedLibStrings.utc
}

@js.native
trait Anon_Band extends js.Object {
  val CONTINUOUS_DOMAIN_SCALES: js.Array[vegaDashLiteLib.buildSrcScaleMod.ScaleType] = js.native
  val CONTINUOUS_TO_CONTINUOUS_SCALES: js.Array[vegaDashLiteLib.buildSrcScaleMod.ScaleType] = js.native
  val DISCRETE_DOMAIN_SCALES: js.Array[vegaDashLiteLib.buildSrcScaleMod.ScaleType] = js.native
  val NON_TYPE_DOMAIN_RANGE_VEGA_SCALE_PROPERTIES: js.Array[
    vegaDashEmbedLib.vegaDashEmbedLibStrings.reverse | vegaDashEmbedLib.vegaDashEmbedLibStrings.base | vegaDashEmbedLib.vegaDashEmbedLibStrings.padding | vegaDashEmbedLib.vegaDashEmbedLibStrings.zero | vegaDashEmbedLib.vegaDashEmbedLibStrings.nice | vegaDashEmbedLib.vegaDashEmbedLibStrings.round | vegaDashEmbedLib.vegaDashEmbedLibStrings.paddingInner | vegaDashEmbedLib.vegaDashEmbedLibStrings.paddingOuter | vegaDashEmbedLib.vegaDashEmbedLibStrings.clamp | vegaDashEmbedLib.vegaDashEmbedLibStrings.exponent | vegaDashEmbedLib.vegaDashEmbedLibStrings.interpolate
  ] = js.native
  val SCALE_PROPERTIES: js.Array[
    vegaDashEmbedLib.vegaDashEmbedLibStrings.reverse | vegaDashEmbedLib.vegaDashEmbedLibStrings.base | vegaDashEmbedLib.vegaDashEmbedLibStrings.padding | vegaDashEmbedLib.vegaDashEmbedLibStrings.`type` | vegaDashEmbedLib.vegaDashEmbedLibStrings.domain | vegaDashEmbedLib.vegaDashEmbedLibStrings.range | vegaDashEmbedLib.vegaDashEmbedLibStrings.zero | vegaDashEmbedLib.vegaDashEmbedLibStrings.nice | vegaDashEmbedLib.vegaDashEmbedLibStrings.rangeStep | vegaDashEmbedLib.vegaDashEmbedLibStrings.scheme | vegaDashEmbedLib.vegaDashEmbedLibStrings.round | vegaDashEmbedLib.vegaDashEmbedLibStrings.paddingInner | vegaDashEmbedLib.vegaDashEmbedLibStrings.paddingOuter | vegaDashEmbedLib.vegaDashEmbedLibStrings.clamp | vegaDashEmbedLib.vegaDashEmbedLibStrings.exponent | vegaDashEmbedLib.vegaDashEmbedLibStrings.interpolate
  ] = js.native
  val SCALE_TYPES: js.Array[vegaDashLiteLib.buildSrcScaleMod.ScaleType] = js.native
  val SCALE_TYPE_INDEX: vegaDashLiteLib.buildSrcScaleMod.ScaleTypeIndex = js.native
  val ScaleTypeNs: Anon_BAND = js.native
  val TIME_SCALE_TYPES: js.Array[vegaDashLiteLib.buildSrcScaleMod.ScaleType] = js.native
  val defaultScaleConfig: Anon_BandPaddingInner = js.native
  def channelScalePropertyIncompatability(
    channel: vegaDashLiteLib.buildSrcChannelMod.Channel,
    propName: vegaDashEmbedLib.vegaDashEmbedLibStrings.`type` | vegaDashEmbedLib.vegaDashEmbedLibStrings.domain | vegaDashEmbedLib.vegaDashEmbedLibStrings.reverse | vegaDashEmbedLib.vegaDashEmbedLibStrings.range | vegaDashEmbedLib.vegaDashEmbedLibStrings.rangeStep | vegaDashEmbedLib.vegaDashEmbedLibStrings.scheme | vegaDashEmbedLib.vegaDashEmbedLibStrings.round | vegaDashEmbedLib.vegaDashEmbedLibStrings.padding | vegaDashEmbedLib.vegaDashEmbedLibStrings.paddingInner | vegaDashEmbedLib.vegaDashEmbedLibStrings.paddingOuter | vegaDashEmbedLib.vegaDashEmbedLibStrings.clamp | vegaDashEmbedLib.vegaDashEmbedLibStrings.nice | vegaDashEmbedLib.vegaDashEmbedLibStrings.base | vegaDashEmbedLib.vegaDashEmbedLibStrings.exponent | vegaDashEmbedLib.vegaDashEmbedLibStrings.zero | vegaDashEmbedLib.vegaDashEmbedLibStrings.interpolate
  ): java.lang.String = js.native
  def channelSupportScaleType(
    channel: vegaDashLiteLib.buildSrcChannelMod.Channel,
    scaleType: vegaDashLiteLib.buildSrcScaleMod.ScaleType
  ): scala.Boolean = js.native
  def getSupportedScaleType(
    channel: vegaDashLiteLib.buildSrcChannelMod.Channel,
    fieldDefType: vegaDashLiteLib.buildSrcTypeMod.Type
  ): js.Array[vegaDashLiteLib.buildSrcScaleMod.ScaleType] = js.native
  def getSupportedScaleType(
    channel: vegaDashLiteLib.buildSrcChannelMod.Channel,
    fieldDefType: vegaDashLiteLib.buildSrcTypeMod.Type,
    bin: scala.Boolean
  ): js.Array[vegaDashLiteLib.buildSrcScaleMod.ScaleType] = js.native
  def hasContinuousDomain(`type`: vegaDashLiteLib.buildSrcScaleMod.ScaleType): scala.Boolean = js.native
  def hasDiscreteDomain(`type`: vegaDashLiteLib.buildSrcScaleMod.ScaleType): scala.Boolean = js.native
  def isBinScale(`type`: vegaDashLiteLib.buildSrcScaleMod.ScaleType): scala.Boolean = js.native
  def isContinuousToContinuous(`type`: vegaDashLiteLib.buildSrcScaleMod.ScaleType): scala.Boolean = js.native
  def isExtendedScheme(scheme: java.lang.String): /* is vega-lite.vega-lite/build/src/scale.SchemeParams */ scala.Boolean = js.native
  def isExtendedScheme(scheme: vegaDashLiteLib.buildSrcScaleMod.SchemeParams): /* is vega-lite.vega-lite/build/src/scale.SchemeParams */ scala.Boolean = js.native
  def isSelectionDomain(domain: vegaDashLiteLib.buildSrcScaleMod.Domain): /* is vega-lite.vega-lite/build/src/scale.SelectionDomain */ scala.Boolean = js.native
  def scaleCompatible(
    scaleType1: vegaDashLiteLib.buildSrcScaleMod.ScaleType,
    scaleType2: vegaDashLiteLib.buildSrcScaleMod.ScaleType
  ): scala.Boolean = js.native
  def scaleTypePrecedence(scaleType: vegaDashLiteLib.buildSrcScaleMod.ScaleType): scala.Double = js.native
  def scaleTypeSupportDataType(
    specifiedType: vegaDashLiteLib.buildSrcScaleMod.ScaleType,
    fieldDefType: vegaDashLiteLib.buildSrcTypeMod.Type,
    bin: scala.Boolean
  ): scala.Boolean = js.native
  def scaleTypeSupportDataType(
    specifiedType: vegaDashLiteLib.buildSrcScaleMod.ScaleType,
    fieldDefType: vegaDashLiteLib.buildSrcTypeMod.Type,
    bin: vegaDashLiteLib.buildSrcBinMod.BinParams
  ): scala.Boolean = js.native
  def scaleTypeSupportProperty(
    scaleType: vegaDashLiteLib.buildSrcScaleMod.ScaleType,
    propName: vegaDashEmbedLib.vegaDashEmbedLibStrings.`type` | vegaDashEmbedLib.vegaDashEmbedLibStrings.domain | vegaDashEmbedLib.vegaDashEmbedLibStrings.reverse | vegaDashEmbedLib.vegaDashEmbedLibStrings.range | vegaDashEmbedLib.vegaDashEmbedLibStrings.rangeStep | vegaDashEmbedLib.vegaDashEmbedLibStrings.scheme | vegaDashEmbedLib.vegaDashEmbedLibStrings.round | vegaDashEmbedLib.vegaDashEmbedLibStrings.padding | vegaDashEmbedLib.vegaDashEmbedLibStrings.paddingInner | vegaDashEmbedLib.vegaDashEmbedLibStrings.paddingOuter | vegaDashEmbedLib.vegaDashEmbedLibStrings.clamp | vegaDashEmbedLib.vegaDashEmbedLibStrings.nice | vegaDashEmbedLib.vegaDashEmbedLibStrings.base | vegaDashEmbedLib.vegaDashEmbedLibStrings.exponent | vegaDashEmbedLib.vegaDashEmbedLibStrings.zero | vegaDashEmbedLib.vegaDashEmbedLibStrings.interpolate
  ): scala.Boolean = js.native
}

object Anon_BAND {
  @scala.inline
  def apply(
    BAND: vegaDashEmbedLib.vegaDashEmbedLibStrings.band,
    BIN_LINEAR: vegaDashEmbedLib.vegaDashEmbedLibStrings.`bin-linear`,
    BIN_ORDINAL: vegaDashEmbedLib.vegaDashEmbedLibStrings.`bin-ordinal`,
    LINEAR: vegaDashEmbedLib.vegaDashEmbedLibStrings.linear,
    LOG: vegaDashEmbedLib.vegaDashEmbedLibStrings.log,
    ORDINAL: vegaDashEmbedLib.vegaDashEmbedLibStrings.ordinal,
    POINT: vegaDashEmbedLib.vegaDashEmbedLibStrings.point,
    POW: vegaDashEmbedLib.vegaDashEmbedLibStrings.pow,
    QUANTILE: vegaDashEmbedLib.vegaDashEmbedLibStrings.quantile,
    QUANTIZE: vegaDashEmbedLib.vegaDashEmbedLibStrings.quantize,
    SEQUENTIAL: vegaDashEmbedLib.vegaDashEmbedLibStrings.sequential,
    SQRT: vegaDashEmbedLib.vegaDashEmbedLibStrings.sqrt,
    THRESHOLD: vegaDashEmbedLib.vegaDashEmbedLibStrings.threshold,
    TIME: vegaDashEmbedLib.vegaDashEmbedLibStrings.time,
    UTC: vegaDashEmbedLib.vegaDashEmbedLibStrings.utc
  ): Anon_BAND = {
    val __obj = js.Dynamic.literal(BAND = BAND, BIN_LINEAR = BIN_LINEAR, BIN_ORDINAL = BIN_ORDINAL, LINEAR = LINEAR, LOG = LOG, ORDINAL = ORDINAL, POINT = POINT, POW = POW, QUANTILE = QUANTILE, QUANTIZE = QUANTIZE, SEQUENTIAL = SEQUENTIAL, SQRT = SQRT, THRESHOLD = THRESHOLD, TIME = TIME, UTC = UTC)
  
    __obj.asInstanceOf[Anon_BAND]
  }
}

