package typings.winrt.Windows.Media.MediaProperties

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAudioEncodingProperties extends IMediaEncodingProperties {
  var bitrate: Double = js.native
  var bitsPerSample: Double = js.native
  var channelCount: Double = js.native
  var sampleRate: Double = js.native
}

object IAudioEncodingProperties {
  @scala.inline
  def apply(
    bitrate: Double,
    bitsPerSample: Double,
    channelCount: Double,
    properties: MediaPropertySet,
    sampleRate: Double,
    subtype: String,
    `type`: String
  ): IAudioEncodingProperties = {
    val __obj = js.Dynamic.literal(bitrate = bitrate.asInstanceOf[js.Any], bitsPerSample = bitsPerSample.asInstanceOf[js.Any], channelCount = channelCount.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], sampleRate = sampleRate.asInstanceOf[js.Any], subtype = subtype.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAudioEncodingProperties]
  }
  @scala.inline
  implicit class IAudioEncodingPropertiesOps[Self <: IAudioEncodingProperties] (val x: Self) extends AnyVal {
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
    def setBitrate(value: Double): Self = this.set("bitrate", value.asInstanceOf[js.Any])
    @scala.inline
    def setBitsPerSample(value: Double): Self = this.set("bitsPerSample", value.asInstanceOf[js.Any])
    @scala.inline
    def setChannelCount(value: Double): Self = this.set("channelCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setSampleRate(value: Double): Self = this.set("sampleRate", value.asInstanceOf[js.Any])
  }
  
}

