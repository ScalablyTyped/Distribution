package typings.winrtDashUwp.WindowsNs.MediaNs.MediaPropertiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes the format of an audio stream. */
@JSGlobal("Windows.Media.MediaProperties.AudioEncodingProperties")
@js.native
/** Creates a new instance of the AudioEncodingProperties class. */
class AudioEncodingProperties () extends js.Object {
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

/* static members */
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
  def createAac(sampleRate: Double, channelCount: Double, bitrate: Double): AudioEncodingProperties = js.native
  /**
    * Creates an instance of AudioEncodingProperties for Advanced Audio Coding (AAC) audio in Audio Data Transport Stream (ADTS) format.
    * @param sampleRate The audio sampling rate.
    * @param channelCount The number of audio channels.
    * @param bitrate The audio bit rate.
    * @return The audio encoding properties.
    */
  def createAacAdts(sampleRate: Double, channelCount: Double, bitrate: Double): AudioEncodingProperties = js.native
  /**
    * Creates an instance of AudioEncodingProperties for MPEG Audio Layer-3 (MP3) audio.
    * @param sampleRate The audio sampling rate.
    * @param channelCount The number of audio channels.
    * @param bitrate The audio bit rate.
    * @return The audio encoding properties.
    */
  def createMp3(sampleRate: Double, channelCount: Double, bitrate: Double): AudioEncodingProperties = js.native
  /**
    * Creates an instance of AudioEncodingProperties for Pulse Code Modulation (PCM) audio.
    * @param sampleRate The audio sampling rate.
    * @param channelCount The number of audio channels.
    * @param bitsPerSample The audio bit depth.
    * @return The audio encoding properties.
    */
  def createPcm(sampleRate: Double, channelCount: Double, bitsPerSample: Double): AudioEncodingProperties = js.native
  /**
    * Creates an instance of AudioEncodingProperties for Windows Media Audio (WMA).
    * @param sampleRate The audio sampling rate.
    * @param channelCount The number of audio channels.
    * @param bitrate The audio bit rate.
    * @return The audio encoding properties.
    */
  def createWma(sampleRate: Double, channelCount: Double, bitrate: Double): AudioEncodingProperties = js.native
}

