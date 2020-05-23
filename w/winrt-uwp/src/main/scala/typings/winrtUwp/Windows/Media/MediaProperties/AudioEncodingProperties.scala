package typings.winrtUwp.Windows.Media.MediaProperties

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes the format of an audio stream. */
trait AudioEncodingProperties extends js.Object {
  /** Gets or sets the audio bit rate. */
  var bitrate: Double
  /** Gets or sets the number of bits per audio sample. */
  var bitsPerSample: Double
  /** Gets or sets the number of audio channels. */
  var channelCount: Double
  /** Gets additional format properties for the audio stream. */
  var properties: MediaPropertySet
  /** Gets or sets audio sampling rate. */
  var sampleRate: Double
  /** Gets or sets the subtype of the format. */
  var subtype: String
  /** Gets the format type. */
  var `type`: String
  /**
    * Gets the media format user data.
    * @return Receives the media format data.
    */
  def getFormatUserData(): js.Array[Double]
  /**
    * Sets the media format user data.
    * @param value The media data to set.
    */
  def setFormatUserData(value: js.Array[Double]): Unit
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
}

