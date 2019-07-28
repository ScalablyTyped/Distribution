package typings.vegaDashLite.buildSrcScaleMod

import typings.vegaDashLite.buildSrcBinMod.BinParams
import typings.vegaDashLite.buildSrcChannelMod.Channel
import typings.vegaDashLite.buildSrcTypeMod.Type
import typings.vegaDashLite.vegaDashLiteStrings.`type`
import typings.vegaDashLite.vegaDashLiteStrings.base
import typings.vegaDashLite.vegaDashLiteStrings.clamp
import typings.vegaDashLite.vegaDashLiteStrings.domain
import typings.vegaDashLite.vegaDashLiteStrings.exponent
import typings.vegaDashLite.vegaDashLiteStrings.interpolate
import typings.vegaDashLite.vegaDashLiteStrings.nice
import typings.vegaDashLite.vegaDashLiteStrings.padding
import typings.vegaDashLite.vegaDashLiteStrings.paddingInner
import typings.vegaDashLite.vegaDashLiteStrings.paddingOuter
import typings.vegaDashLite.vegaDashLiteStrings.range
import typings.vegaDashLite.vegaDashLiteStrings.rangeStep
import typings.vegaDashLite.vegaDashLiteStrings.reverse
import typings.vegaDashLite.vegaDashLiteStrings.round
import typings.vegaDashLite.vegaDashLiteStrings.scheme
import typings.vegaDashLite.vegaDashLiteStrings.zero
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
    reverse | base | padding | zero | nice | round | paddingInner | paddingOuter | clamp | exponent | interpolate
  ] = js.native
  val SCALE_PROPERTIES: js.Array[
    reverse | base | padding | `type` | domain | range | zero | nice | rangeStep | scheme | round | paddingInner | paddingOuter | clamp | exponent | interpolate
  ] = js.native
  val SCALE_TYPES: js.Array[ScaleType] = js.native
  val SCALE_TYPE_INDEX: ScaleTypeIndex = js.native
  val TIME_SCALE_TYPES: js.Array[ScaleType] = js.native
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

