package typings.winrt.Windows.Media.MediaProperties

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAudioEncodingProperties extends IMediaEncodingProperties {
  var bitrate: Double
  var bitsPerSample: Double
  var channelCount: Double
  var sampleRate: Double
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
}

