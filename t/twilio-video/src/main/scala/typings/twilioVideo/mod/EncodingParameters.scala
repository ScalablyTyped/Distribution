package typings.twilioVideo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EncodingParameters extends js.Object {
  var maxAudioBitrate: js.UndefOr[Double | Null] = js.native
  var maxVideoBitrate: js.UndefOr[Double | Null] = js.native
}

object EncodingParameters {
  @scala.inline
  def apply(): EncodingParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncodingParameters]
  }
  @scala.inline
  implicit class EncodingParametersOps[Self <: EncodingParameters] (val x: Self) extends AnyVal {
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
    def setMaxAudioBitrate(value: Double): Self = this.set("maxAudioBitrate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxAudioBitrate: Self = this.set("maxAudioBitrate", js.undefined)
    @scala.inline
    def setMaxAudioBitrateNull: Self = this.set("maxAudioBitrate", null)
    @scala.inline
    def setMaxVideoBitrate(value: Double): Self = this.set("maxVideoBitrate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxVideoBitrate: Self = this.set("maxVideoBitrate", js.undefined)
    @scala.inline
    def setMaxVideoBitrateNull: Self = this.set("maxVideoBitrate", null)
  }
  
}

