package typings
package winrtLib.WindowsNs.MediaNs.MediaPropertiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAudioEncodingProperties extends IMediaEncodingProperties {
  var bitrate: scala.Double
  var bitsPerSample: scala.Double
  var channelCount: scala.Double
  var sampleRate: scala.Double
}

object IAudioEncodingProperties {
  @scala.inline
  def apply(
    bitrate: scala.Double,
    bitsPerSample: scala.Double,
    channelCount: scala.Double,
    properties: MediaPropertySet,
    sampleRate: scala.Double,
    subtype: java.lang.String,
    `type`: java.lang.String
  ): IAudioEncodingProperties = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("bitrate")(bitrate)
    __obj.updateDynamic("bitsPerSample")(bitsPerSample)
    __obj.updateDynamic("channelCount")(channelCount)
    __obj.updateDynamic("properties")(properties)
    __obj.updateDynamic("sampleRate")(sampleRate)
    __obj.updateDynamic("subtype")(subtype)
    __obj.asInstanceOf[IAudioEncodingProperties]
  }
}

