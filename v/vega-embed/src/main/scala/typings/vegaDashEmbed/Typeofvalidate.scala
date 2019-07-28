package typings.vegaDashEmbed

import typings.vegaDashLite.buildSrcSpecMod.FacetedCompositeUnitSpec
import typings.vegaDashLite.buildSrcValidateMod.RequiredChannelMap
import typings.vegaDashLite.buildSrcValidateMod.SupportedChannelMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofvalidate extends js.Object {
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

