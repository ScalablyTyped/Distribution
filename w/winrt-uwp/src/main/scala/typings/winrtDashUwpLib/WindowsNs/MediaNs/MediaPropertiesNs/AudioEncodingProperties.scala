package typings
package winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes the format of an audio stream. */
@JSGlobal("Windows.Media.MediaProperties.AudioEncodingProperties")
@js.native
/** Creates a new instance of the AudioEncodingProperties class. */
class AudioEncodingProperties () extends js.Object {
  /** Gets or sets the audio bit rate. */
  var bitrate: scala.Double = js.native
  /** Gets or sets the number of bits per audio sample. */
  var bitsPerSample: scala.Double = js.native
  /** Gets or sets the number of audio channels. */
  var channelCount: scala.Double = js.native
  /** Gets additional format properties for the audio stream. */
  var properties: MediaPropertySet = js.native
  /** Gets or sets audio sampling rate. */
  var sampleRate: scala.Double = js.native
  /** Gets or sets the subtype of the format. */
  var subtype: java.lang.String = js.native
  /** Gets the format type. */
  var `type`: java.lang.String = js.native
  /**
    * Gets the media format user data.
    * @return Receives the media format data.
    */
  def getFormatUserData(): js.Array[scala.Double] = js.native
  /**
    * Sets the media format user data.
    * @param value The media data to set.
    */
  def setFormatUserData(value: js.Array[scala.Double]): scala.Unit = js.native
}

/** Describes the format of an audio stream. */
@JSGlobal("Windows.Media.MediaProperties.AudioEncodingProperties")
@js.native
object AudioEncodingProperties extends js.Object {
  /**
    * Creates an instance of AudioEncodingProperties for Advanced Audio Coding (AAC) audio.
    * @param sampleRate The audio sampling rate.
    * @param channelCount The number of audio channels.
    * @param bitrate The audio bit rate.
    * @return The audio encoding properties.
    */
  def createAac(sampleRate: scala.Double, channelCount: scala.Double, bitrate: scala.Double): winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.AudioEncodingProperties = js.native
  /**
    * Creates an instance of AudioEncodingProperties for Advanced Audio Coding (AAC) audio in Audio Data Transport Stream (ADTS) format.
    * @param sampleRate The audio sampling rate.
    * @param channelCount The number of audio channels.
    * @param bitrate The audio bit rate.
    * @return The audio encoding properties.
    */
  def createAacAdts(sampleRate: scala.Double, channelCount: scala.Double, bitrate: scala.Double): winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.AudioEncodingProperties = js.native
  /**
    * Creates an instance of AudioEncodingProperties for MPEG Audio Layer-3 (MP3) audio.
    * @param sampleRate The audio sampling rate.
    * @param channelCount The number of audio channels.
    * @param bitrate The audio bit rate.
    * @return The audio encoding properties.
    */
  def createMp3(sampleRate: scala.Double, channelCount: scala.Double, bitrate: scala.Double): winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.AudioEncodingProperties = js.native
  /**
    * Creates an instance of AudioEncodingProperties for Pulse Code Modulation (PCM) audio.
    * @param sampleRate The audio sampling rate.
    * @param channelCount The number of audio channels.
    * @param bitsPerSample The audio bit depth.
    * @return The audio encoding properties.
    */
  def createPcm(sampleRate: scala.Double, channelCount: scala.Double, bitsPerSample: scala.Double): winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.AudioEncodingProperties = js.native
  /**
    * Creates an instance of AudioEncodingProperties for Windows Media Audio (WMA).
    * @param sampleRate The audio sampling rate.
    * @param channelCount The number of audio channels.
    * @param bitrate The audio bit rate.
    * @return The audio encoding properties.
    */
  def createWma(sampleRate: scala.Double, channelCount: scala.Double, bitrate: scala.Double): winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.AudioEncodingProperties = js.native
}

