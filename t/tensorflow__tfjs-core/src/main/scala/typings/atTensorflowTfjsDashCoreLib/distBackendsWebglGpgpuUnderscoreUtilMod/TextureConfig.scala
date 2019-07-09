package typings
package atTensorflowTfjsDashCoreLib.distBackendsWebglGpgpuUnderscoreUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextureConfig extends js.Object {
  var defaultNumChannels: scala.Double
  var downloadTextureFormat: scala.Double
  var downloadUnpackNumChannels: scala.Double
  var internalFormatFloat: scala.Double
  var internalFormatHalfFloat: scala.Double
  var internalFormatPackedFloat: scala.Double
  var internalFormatPackedHalfFloat: scala.Double
  var textureFormatFloat: scala.Double
  var textureTypeHalfFloat: scala.Double
}

object TextureConfig {
  @scala.inline
  def apply(
    defaultNumChannels: scala.Double,
    downloadTextureFormat: scala.Double,
    downloadUnpackNumChannels: scala.Double,
    internalFormatFloat: scala.Double,
    internalFormatHalfFloat: scala.Double,
    internalFormatPackedFloat: scala.Double,
    internalFormatPackedHalfFloat: scala.Double,
    textureFormatFloat: scala.Double,
    textureTypeHalfFloat: scala.Double
  ): TextureConfig = {
    val __obj = js.Dynamic.literal(defaultNumChannels = defaultNumChannels, downloadTextureFormat = downloadTextureFormat, downloadUnpackNumChannels = downloadUnpackNumChannels, internalFormatFloat = internalFormatFloat, internalFormatHalfFloat = internalFormatHalfFloat, internalFormatPackedFloat = internalFormatPackedFloat, internalFormatPackedHalfFloat = internalFormatPackedHalfFloat, textureFormatFloat = textureFormatFloat, textureTypeHalfFloat = textureTypeHalfFloat)
  
    __obj.asInstanceOf[TextureConfig]
  }
}

