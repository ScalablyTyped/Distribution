package typings
package vegaDashLiteLib.buildSrcValidateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-lite/build/src/validate", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val DEFAULT_REQUIRED_CHANNEL_MAP: RequiredChannelMap = js.native
  val DEFAULT_SUPPORTED_CHANNEL_TYPE: SupportedChannelMap = js.native
  def getEncodingMappingError(spec: vegaDashLiteLib.buildSrcSpecMod.FacetedCompositeUnitSpec): java.lang.String = js.native
  def getEncodingMappingError(
    spec: vegaDashLiteLib.buildSrcSpecMod.FacetedCompositeUnitSpec,
    requiredChannelMap: RequiredChannelMap
  ): java.lang.String = js.native
  def getEncodingMappingError(
    spec: vegaDashLiteLib.buildSrcSpecMod.FacetedCompositeUnitSpec,
    requiredChannelMap: RequiredChannelMap,
    supportedChannelMap: SupportedChannelMap
  ): java.lang.String = js.native
}

