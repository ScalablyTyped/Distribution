package typings.vegaDashEmbed

import typings.vegaDashEmbed.vegaDashEmbedStrings.`type`
import typings.vegaDashEmbed.vegaDashEmbedStrings.base
import typings.vegaDashEmbed.vegaDashEmbedStrings.clamp
import typings.vegaDashEmbed.vegaDashEmbedStrings.domain
import typings.vegaDashEmbed.vegaDashEmbedStrings.exponent
import typings.vegaDashEmbed.vegaDashEmbedStrings.interpolate
import typings.vegaDashEmbed.vegaDashEmbedStrings.nice
import typings.vegaDashEmbed.vegaDashEmbedStrings.padding
import typings.vegaDashEmbed.vegaDashEmbedStrings.paddingInner
import typings.vegaDashEmbed.vegaDashEmbedStrings.paddingOuter
import typings.vegaDashEmbed.vegaDashEmbedStrings.range
import typings.vegaDashEmbed.vegaDashEmbedStrings.rangeStep
import typings.vegaDashEmbed.vegaDashEmbedStrings.reverse
import typings.vegaDashEmbed.vegaDashEmbedStrings.round
import typings.vegaDashEmbed.vegaDashEmbedStrings.scheme
import typings.vegaDashEmbed.vegaDashEmbedStrings.zero
import typings.vegaDashLite.buildSrcBinMod.BinParams
import typings.vegaDashLite.buildSrcChannelMod.Channel
import typings.vegaDashLite.buildSrcScaleMod.Domain
import typings.vegaDashLite.buildSrcScaleMod.ScaleType
import typings.vegaDashLite.buildSrcScaleMod.ScaleTypeIndex
import typings.vegaDashLite.buildSrcScaleMod.SchemeParams
import typings.vegaDashLite.buildSrcTypeMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofscale extends js.Object {
  val CONTINUOUS_DOMAIN_SCALES: js.Array[ScaleType] = js.native
  val CONTINUOUS_TO_CONTINUOUS_SCALES: js.Array[ScaleType] = js.native
  val DISCRETE_DOMAIN_SCALES: js.Array[ScaleType] = js.native
  val NON_TYPE_DOMAIN_RANGE_VEGA_SCALE_PROPERTIES: js.Array[
    reverse | base | padding | zero | nice | round | paddingInner | paddingOuter | clamp | exponent | interpolate
  ] = js.native
  val SCALE_PROPERTIES: js.Array[
    reverse | base | padding | `type` | domain | range | zero | nice | rangeStep | scheme | round | paddingInner | paddingOuter | clamp | exponent | interpolate
  ] = js.native
  val SCALE_TYPES: js.Array[ScaleType] = js.native
  val SCALE_TYPE_INDEX: ScaleTypeIndex = js.native
  val ScaleTypeNs: TypeofScaleType = js.native
  val TIME_SCALE_TYPES: js.Array[ScaleType] = js.native
  val defaultScaleConfig: Anon_BandPaddingInner = js.native
  def channelScalePropertyIncompatability(
    channel: Channel,
    propName: `type` | domain | reverse | range | rangeStep | scheme | round | padding | paddingInner | paddingOuter | clamp | nice | base | exponent | zero | interpolate
  ): String = js.native
  def channelSupportScaleType(channel: Channel, scaleType: ScaleType): Boolean = js.native
  def getSupportedScaleType(channel: Channel, fieldDefType: Type): js.Array[ScaleType] = js.native
  def getSupportedScaleType(channel: Channel, fieldDefType: Type, bin: Boolean): js.Array[ScaleType] = js.native
  def hasContinuousDomain(`type`: ScaleType): Boolean = js.native
  def hasDiscreteDomain(`type`: ScaleType): Boolean = js.native
  def isBinScale(`type`: ScaleType): Boolean = js.native
  def isContinuousToContinuous(`type`: ScaleType): Boolean = js.native
  def isExtendedScheme(scheme: String): /* is vega-lite.vega-lite/build/src/scale.SchemeParams */ Boolean = js.native
  def isExtendedScheme(scheme: SchemeParams): /* is vega-lite.vega-lite/build/src/scale.SchemeParams */ Boolean = js.native
  def isSelectionDomain(domain: Domain): /* is vega-lite.vega-lite/build/src/scale.SelectionDomain */ Boolean = js.native
  def scaleCompatible(scaleType1: ScaleType, scaleType2: ScaleType): Boolean = js.native
  def scaleTypePrecedence(scaleType: ScaleType): Double = js.native
  def scaleTypeSupportDataType(specifiedType: ScaleType, fieldDefType: Type, bin: Boolean): Boolean = js.native
  def scaleTypeSupportDataType(specifiedType: ScaleType, fieldDefType: Type, bin: BinParams): Boolean = js.native
  def scaleTypeSupportProperty(
    scaleType: ScaleType,
    propName: `type` | domain | reverse | range | rangeStep | scheme | round | padding | paddingInner | paddingOuter | clamp | nice | base | exponent | zero | interpolate
  ): Boolean = js.native
}

