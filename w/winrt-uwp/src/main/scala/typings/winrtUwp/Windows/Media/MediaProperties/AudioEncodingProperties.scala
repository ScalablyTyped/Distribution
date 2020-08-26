package typings.winrtUwp.Windows.Media.MediaProperties

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes the format of an audio stream. */
@js.native
trait AudioEncodingProperties extends js.Object {
  /** Gets or sets the audio bit rate. */
  var bitrate: Double = js.native
  /** Gets or sets the number of bits per audio sample. */
  var bitsPerSample: Double = js.native
  /** Gets or sets the number of audio channels. */
  var channelCount: Double = js.native
  /** Gets additional format properties for the audio stream. */
  var properties: MediaPropertySet = js.native
  /** Gets or sets audio sampling rate. */
  var sampleRate: Double = js.native
  /** Gets or sets the subtype of the format. */
  var subtype: String = js.native
  /** Gets the format type. */
  var `type`: String = js.native
  /**
    * Gets the media format user data.
    * @return Receives the media format data.
    */
  def getFormatUserData(): js.Array[Double] = js.native
  /**
    * Sets the media format user data.
    * @param value The media data to set.
    */
  def setFormatUserData(value: js.Array[Double]): Unit = js.native
}

object AudioEncodingProperties {
  @scala.inline
  def apply(
    bitrate: Double,
    bitsPerSample: Double,
    channelCount: Double,
    getFormatUserData: () => js.Array[Double],
    properties: MediaPropertySet,
    sampleRate: Double,
    setFormatUserData: js.Array[Double] => Unit,
    subtype: String,
    `type`: String
  ): AudioEncodingProperties = {
    val __obj = js.Dynamic.literal(bitrate = bitrate.asInstanceOf[js.Any], bitsPerSample = bitsPerSample.asInstanceOf[js.Any], channelCount = channelCount.asInstanceOf[js.Any], getFormatUserData = js.Any.fromFunction0(getFormatUserData), properties = properties.asInstanceOf[js.Any], sampleRate = sampleRate.asInstanceOf[js.Any], setFormatUserData = js.Any.fromFunction1(setFormatUserData), subtype = subtype.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioEncodingProperties]
  }
  @scala.inline
  implicit class AudioEncodingPropertiesOps[Self <: AudioEncodingProperties] (val x: Self) extends AnyVal {
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
    def setGetFormatUserData(value: () => js.Array[Double]): Self = this.set("getFormatUserData", js.Any.fromFunction0(value))
    @scala.inline
    def setProperties(value: MediaPropertySet): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def setSampleRate(value: Double): Self = this.set("sampleRate", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetFormatUserData(value: js.Array[Double] => Unit): Self = this.set("setFormatUserData", js.Any.fromFunction1(value))
    @scala.inline
    def setSubtype(value: String): Self = this.set("subtype", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

