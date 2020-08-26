package typings.tensorflowTfjsBackendWebgl.texUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextureConfig extends js.Object {
  var defaultNumChannels: Double = js.native
  var downloadTextureFormat: Double = js.native
  var downloadUnpackNumChannels: Double = js.native
  var internalFormatFloat: Double = js.native
  var internalFormatHalfFloat: Double = js.native
  var internalFormatPackedFloat: Double = js.native
  var internalFormatPackedHalfFloat: Double = js.native
  var textureFormatFloat: Double = js.native
  var textureTypeFloat: Double = js.native
  var textureTypeHalfFloat: Double = js.native
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
    val __obj = js.Dynamic.literal(defaultNumChannels = defaultNumChannels.asInstanceOf[js.Any], downloadTextureFormat = downloadTextureFormat.asInstanceOf[js.Any], downloadUnpackNumChannels = downloadUnpackNumChannels.asInstanceOf[js.Any], internalFormatFloat = internalFormatFloat.asInstanceOf[js.Any], internalFormatHalfFloat = internalFormatHalfFloat.asInstanceOf[js.Any], internalFormatPackedFloat = internalFormatPackedFloat.asInstanceOf[js.Any], internalFormatPackedHalfFloat = internalFormatPackedHalfFloat.asInstanceOf[js.Any], textureFormatFloat = textureFormatFloat.asInstanceOf[js.Any], textureTypeFloat = textureTypeFloat.asInstanceOf[js.Any], textureTypeHalfFloat = textureTypeHalfFloat.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextureConfig]
  }
  @scala.inline
  implicit class TextureConfigOps[Self <: TextureConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDefaultNumChannels(value: Double): Self = this.set("defaultNumChannels", value.asInstanceOf[js.Any])
    @scala.inline
    def setDownloadTextureFormat(value: Double): Self = this.set("downloadTextureFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def setDownloadUnpackNumChannels(value: Double): Self = this.set("downloadUnpackNumChannels", value.asInstanceOf[js.Any])
    @scala.inline
    def setInternalFormatFloat(value: Double): Self = this.set("internalFormatFloat", value.asInstanceOf[js.Any])
    @scala.inline
    def setInternalFormatHalfFloat(value: Double): Self = this.set("internalFormatHalfFloat", value.asInstanceOf[js.Any])
    @scala.inline
    def setInternalFormatPackedFloat(value: Double): Self = this.set("internalFormatPackedFloat", value.asInstanceOf[js.Any])
    @scala.inline
    def setInternalFormatPackedHalfFloat(value: Double): Self = this.set("internalFormatPackedHalfFloat", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextureFormatFloat(value: Double): Self = this.set("textureFormatFloat", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextureTypeFloat(value: Double): Self = this.set("textureTypeFloat", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextureTypeHalfFloat(value: Double): Self = this.set("textureTypeHalfFloat", value.asInstanceOf[js.Any])
  }
  
}

