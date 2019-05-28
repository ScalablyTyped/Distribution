package typings
package vegaDashEmbedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofvalidate extends js.Object {
  val DEFAULT_REQUIRED_CHANNEL_MAP: vegaDashLiteLib.buildSrcValidateMod.RequiredChannelMap = js.native
  val DEFAULT_SUPPORTED_CHANNEL_TYPE: vegaDashLiteLib.buildSrcValidateMod.SupportedChannelMap = js.native
  def getEncodingMappingError(spec: vegaDashLiteLib.buildSrcSpecMod.FacetedCompositeUnitSpec): java.lang.String = js.native
  def getEncodingMappingError(
    spec: vegaDashLiteLib.buildSrcSpecMod.FacetedCompositeUnitSpec,
    requiredChannelMap: vegaDashLiteLib.buildSrcValidateMod.RequiredChannelMap
  ): java.lang.String = js.native
  def getEncodingMappingError(
    spec: vegaDashLiteLib.buildSrcSpecMod.FacetedCompositeUnitSpec,
    requiredChannelMap: vegaDashLiteLib.buildSrcValidateMod.RequiredChannelMap,
    supportedChannelMap: vegaDashLiteLib.buildSrcValidateMod.SupportedChannelMap
  ): java.lang.String = js.native
}

