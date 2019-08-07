package typings.atTensorflowTfjsDashCore.distBackendsWebglTexUnderscoreUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextureConfig extends js.Object {
  var defaultNumChannels: Double
  var downloadTextureFormat: Double
  var downloadUnpackNumChannels: Double
  var internalFormatFloat: Double
  var internalFormatHalfFloat: Double
  var internalFormatPackedFloat: Double
  var internalFormatPackedHalfFloat: Double
  var textureFormatFloat: Double
  var textureTypeFloat: Double
  var textureTypeHalfFloat: Double
}

object TextureConfig {
  @scala.inline
  def apply(
    defaultNumChannels: Double,
    downloadTextureFormat: Double,
    downloadUnpackNumChannels: Double,
    internalFormatFloat: Double,
    internalFormatHalfFloat: Double,
    internalFormatPackedFloat: Double,
    internalFormatPackedHalfFloat: Double,
    textureFormatFloat: Double,
    textureTypeFloat: Double,
    textureTypeHalfFloat: Double
  ): TextureConfig = {
    val __obj = js.Dynamic.literal(defaultNumChannels = defaultNumChannels, downloadTextureFormat = downloadTextureFormat, downloadUnpackNumChannels = downloadUnpackNumChannels, internalFormatFloat = internalFormatFloat, internalFormatHalfFloat = internalFormatHalfFloat, internalFormatPackedFloat = internalFormatPackedFloat, internalFormatPackedHalfFloat = internalFormatPackedHalfFloat, textureFormatFloat = textureFormatFloat, textureTypeFloat = textureTypeFloat, textureTypeHalfFloat = textureTypeHalfFloat)
  
    __obj.asInstanceOf[TextureConfig]
  }
}

