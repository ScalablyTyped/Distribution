package typings
package vegaDashLiteLib.buildSrcScaleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-lite/build/src/scale", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val CONTINUOUS_DOMAIN_SCALES: js.Array[ScaleType] = js.native
  val CONTINUOUS_TO_CONTINUOUS_SCALES: js.Array[ScaleType] = js.native
  val DISCRETE_DOMAIN_SCALES: js.Array[ScaleType] = js.native
  val NON_TYPE_DOMAIN_RANGE_VEGA_SCALE_PROPERTIES: js.Array[
    vegaDashLiteLib.vegaDashLiteLibStrings.reverse | vegaDashLiteLib.vegaDashLiteLibStrings.base | vegaDashLiteLib.vegaDashLiteLibStrings.padding | vegaDashLiteLib.vegaDashLiteLibStrings.zero | vegaDashLiteLib.vegaDashLiteLibStrings.nice | vegaDashLiteLib.vegaDashLiteLibStrings.round | vegaDashLiteLib.vegaDashLiteLibStrings.paddingInner | vegaDashLiteLib.vegaDashLiteLibStrings.paddingOuter | vegaDashLiteLib.vegaDashLiteLibStrings.clamp | vegaDashLiteLib.vegaDashLiteLibStrings.exponent | vegaDashLiteLib.vegaDashLiteLibStrings.interpolate
  ] = js.native
  val SCALE_PROPERTIES: js.Array[
    vegaDashLiteLib.vegaDashLiteLibStrings.reverse | vegaDashLiteLib.vegaDashLiteLibStrings.base | vegaDashLiteLib.vegaDashLiteLibStrings.padding | vegaDashLiteLib.vegaDashLiteLibStrings.`type` | vegaDashLiteLib.vegaDashLiteLibStrings.domain | vegaDashLiteLib.vegaDashLiteLibStrings.range | vegaDashLiteLib.vegaDashLiteLibStrings.zero | vegaDashLiteLib.vegaDashLiteLibStrings.nice | vegaDashLiteLib.vegaDashLiteLibStrings.rangeStep | vegaDashLiteLib.vegaDashLiteLibStrings.scheme | vegaDashLiteLib.vegaDashLiteLibStrings.round | vegaDashLiteLib.vegaDashLiteLibStrings.paddingInner | vegaDashLiteLib.vegaDashLiteLibStrings.paddingOuter | vegaDashLiteLib.vegaDashLiteLibStrings.clamp | vegaDashLiteLib.vegaDashLiteLibStrings.exponent | vegaDashLiteLib.vegaDashLiteLibStrings.interpolate
  ] = js.native
  val SCALE_TYPES: js.Array[ScaleType] = js.native
  val SCALE_TYPE_INDEX: ScaleTypeIndex = js.native
  val TIME_SCALE_TYPES: js.Array[ScaleType] = js.native
  def channelScalePropertyIncompatability(
    channel: vegaDashLiteLib.buildSrcChannelMod.Channel,
    propName: vegaDashLiteLib.vegaDashLiteLibStrings.`type` | vegaDashLiteLib.vegaDashLiteLibStrings.domain | vegaDashLiteLib.vegaDashLiteLibStrings.reverse | vegaDashLiteLib.vegaDashLiteLibStrings.range | vegaDashLiteLib.vegaDashLiteLibStrings.rangeStep | vegaDashLiteLib.vegaDashLiteLibStrings.scheme | vegaDashLiteLib.vegaDashLiteLibStrings.round | vegaDashLiteLib.vegaDashLiteLibStrings.padding | vegaDashLiteLib.vegaDashLiteLibStrings.paddingInner | vegaDashLiteLib.vegaDashLiteLibStrings.paddingOuter | vegaDashLiteLib.vegaDashLiteLibStrings.clamp | vegaDashLiteLib.vegaDashLiteLibStrings.nice | vegaDashLiteLib.vegaDashLiteLibStrings.base | vegaDashLiteLib.vegaDashLiteLibStrings.exponent | vegaDashLiteLib.vegaDashLiteLibStrings.zero | vegaDashLiteLib.vegaDashLiteLibStrings.interpolate
  ): java.lang.String = js.native
  def channelSupportScaleType(channel: vegaDashLiteLib.buildSrcChannelMod.Channel, scaleType: ScaleType): scala.Boolean = js.native
  def getSupportedScaleType(
    channel: vegaDashLiteLib.buildSrcChannelMod.Channel,
    fieldDefType: vegaDashLiteLib.buildSrcTypeMod.Type
  ): js.Array[ScaleType] = js.native
  def getSupportedScaleType(
    channel: vegaDashLiteLib.buildSrcChannelMod.Channel,
    fieldDefType: vegaDashLiteLib.buildSrcTypeMod.Type,
    bin: scala.Boolean
  ): js.Array[ScaleType] = js.native
  def hasContinuousDomain(`type`: ScaleType): scala.Boolean = js.native
  def hasDiscreteDomain(`type`: ScaleType): scala.Boolean = js.native
  def isBinScale(`type`: ScaleType): scala.Boolean = js.native
  def isContinuousToContinuous(`type`: ScaleType): scala.Boolean = js.native
  def isExtendedScheme(scheme: java.lang.String): /* is vega-lite.vega-lite/build/src/scale.SchemeParams */ scala.Boolean = js.native
  def isExtendedScheme(scheme: SchemeParams): /* is vega-lite.vega-lite/build/src/scale.SchemeParams */ scala.Boolean = js.native
  def isSelectionDomain(domain: Domain): /* is vega-lite.vega-lite/build/src/scale.SelectionDomain */ scala.Boolean = js.native
  def scaleCompatible(scaleType1: ScaleType, scaleType2: ScaleType): scala.Boolean = js.native
  def scaleTypePrecedence(scaleType: ScaleType): scala.Double = js.native
  def scaleTypeSupportDataType(specifiedType: ScaleType, fieldDefType: vegaDashLiteLib.buildSrcTypeMod.Type, bin: scala.Boolean): scala.Boolean = js.native
  def scaleTypeSupportDataType(
    specifiedType: ScaleType,
    fieldDefType: vegaDashLiteLib.buildSrcTypeMod.Type,
    bin: vegaDashLiteLib.buildSrcBinMod.BinParams
  ): scala.Boolean = js.native
  def scaleTypeSupportProperty(
    scaleType: ScaleType,
    propName: vegaDashLiteLib.vegaDashLiteLibStrings.`type` | vegaDashLiteLib.vegaDashLiteLibStrings.domain | vegaDashLiteLib.vegaDashLiteLibStrings.reverse | vegaDashLiteLib.vegaDashLiteLibStrings.range | vegaDashLiteLib.vegaDashLiteLibStrings.rangeStep | vegaDashLiteLib.vegaDashLiteLibStrings.scheme | vegaDashLiteLib.vegaDashLiteLibStrings.round | vegaDashLiteLib.vegaDashLiteLibStrings.padding | vegaDashLiteLib.vegaDashLiteLibStrings.paddingInner | vegaDashLiteLib.vegaDashLiteLibStrings.paddingOuter | vegaDashLiteLib.vegaDashLiteLibStrings.clamp | vegaDashLiteLib.vegaDashLiteLibStrings.nice | vegaDashLiteLib.vegaDashLiteLibStrings.base | vegaDashLiteLib.vegaDashLiteLibStrings.exponent | vegaDashLiteLib.vegaDashLiteLibStrings.zero | vegaDashLiteLib.vegaDashLiteLibStrings.interpolate
  ): scala.Boolean = js.native
}

