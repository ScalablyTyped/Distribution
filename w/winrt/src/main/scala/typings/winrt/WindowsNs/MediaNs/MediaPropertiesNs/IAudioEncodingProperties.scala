package typings.winrt.WindowsNs.MediaNs.MediaPropertiesNs

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
    val __obj = js.Dynamic.literal(bitrate = bitrate, bitsPerSample = bitsPerSample, channelCount = channelCount, properties = properties, sampleRate = sampleRate, subtype = subtype)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IAudioEncodingProperties]
  }
}

