package typings.winrtUwp.global.Windows.Media.MediaProperties

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes the format of an audio stream. */
@JSGlobal("Windows.Media.MediaProperties.AudioEncodingProperties")
@js.native
/** Creates a new instance of the AudioEncodingProperties class. */
class AudioEncodingProperties ()
  extends typings.winrtUwp.Windows.Media.MediaProperties.AudioEncodingProperties

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
  def createAac(sampleRate: Double, channelCount: Double, bitrate: Double): typings.winrtUwp.Windows.Media.MediaProperties.AudioEncodingProperties = js.native
  /**
    * Creates an instance of AudioEncodingProperties for Advanced Audio Coding (AAC) audio in Audio Data Transport Stream (ADTS) format.
    * @param sampleRate The audio sampling rate.
    * @param channelCount The number of audio channels.
    * @param bitrate The audio bit rate.
    * @return The audio encoding properties.
    */
  def createAacAdts(sampleRate: Double, channelCount: Double, bitrate: Double): typings.winrtUwp.Windows.Media.MediaProperties.AudioEncodingProperties = js.native
  /**
    * Creates an instance of AudioEncodingProperties for MPEG Audio Layer-3 (MP3) audio.
    * @param sampleRate The audio sampling rate.
    * @param channelCount The number of audio channels.
    * @param bitrate The audio bit rate.
    * @return The audio encoding properties.
    */
  def createMp3(sampleRate: Double, channelCount: Double, bitrate: Double): typings.winrtUwp.Windows.Media.MediaProperties.AudioEncodingProperties = js.native
  /**
    * Creates an instance of AudioEncodingProperties for Pulse Code Modulation (PCM) audio.
    * @param sampleRate The audio sampling rate.
    * @param channelCount The number of audio channels.
    * @param bitsPerSample The audio bit depth.
    * @return The audio encoding properties.
    */
  def createPcm(sampleRate: Double, channelCount: Double, bitsPerSample: Double): typings.winrtUwp.Windows.Media.MediaProperties.AudioEncodingProperties = js.native
  /**
    * Creates an instance of AudioEncodingProperties for Windows Media Audio (WMA).
    * @param sampleRate The audio sampling rate.
    * @param channelCount The number of audio channels.
    * @param bitrate The audio bit rate.
    * @return The audio encoding properties.
    */
  def createWma(sampleRate: Double, channelCount: Double, bitrate: Double): typings.winrtUwp.Windows.Media.MediaProperties.AudioEncodingProperties = js.native
}

