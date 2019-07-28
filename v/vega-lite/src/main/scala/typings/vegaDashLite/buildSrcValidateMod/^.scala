package typings.vegaDashLite.buildSrcValidateMod

import typings.vegaDashLite.buildSrcSpecMod.FacetedCompositeUnitSpec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-lite/build/src/validate", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val DEFAULT_REQUIRED_CHANNEL_MAP: RequiredChannelMap = js.native
  val DEFAULT_SUPPORTED_CHANNEL_TYPE: SupportedChannelMap = js.native
  def getEncodingMappingError(spec: FacetedCompositeUnitSpec): String = js.native
  def getEncodingMappingError(spec: FacetedCompositeUnitSpec, requiredChannelMap: RequiredChannelMap): String = js.native
  def getEncodingMappingError(
    spec: FacetedCompositeUnitSpec,
    requiredChannelMap: RequiredChannelMap,
    supportedChannelMap: SupportedChannelMap
  ): String = js.native
}

