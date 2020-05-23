package typings.winrtUwp.Windows.Media.Editing

import typings.winrtUwp.Windows.Foundation.Collections.IMap
import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Media.Effects.IAudioEffectDefinition
import typings.winrtUwp.Windows.Media.MediaProperties.AudioEncodingProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a single audio track for accompanying a video clip. */
trait BackgroundAudioTrack extends js.Object {
  /** Gets the list of audio effect definitions for processing the background audio track. */
  var audioEffectDefinitions: IVector[IAudioEffectDefinition]
  /** Specifies how long to wait before starting background audio playback. */
  var delay: Double
  /** Original playback time of the background audio track, without the effects of the TrimTimeFromStart and TrimTimeFromEnd properties. */
  var originalDuration: Double
  /** The amount of time to trim from the end of the background audio track. */
  var trimTimeFromEnd: Double
  /** The amount of time to trim from the beginning of the background audio track. */
  var trimTimeFromStart: Double
  /** Duration of the background audio track with TrimTimeFromStart and TrimTimeFromEnd applied to playback. */
  var trimmedDuration: Double
  /** An associative collection for storing custom properties associated with the background audio track. */
  var userData: IMap[String, String]
  /** Gets or sets the volume of the background audio track. */
  var volume: Double
  /**
    * Gets the AudioEncodingProperties for the background audio track.
    * @return The AudioEncodingProperties for the background audio track.
    */
  def getAudioEncodingProperties(): AudioEncodingProperties
}

object BackgroundAudioTrack {
  @scala.inline
  def apply(
    audioEffectDefinitions: IVector[IAudioEffectDefinition],
    delay: Double,
    getAudioEncodingProperties: () => AudioEncodingProperties,
    originalDuration: Double,
    trimTimeFromEnd: Double,
    trimTimeFromStart: Double,
    trimmedDuration: Double,
    userData: IMap[String, String],
    volume: Double
  ): BackgroundAudioTrack = {
    val __obj = js.Dynamic.literal(audioEffectDefinitions = audioEffectDefinitions.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], getAudioEncodingProperties = js.Any.fromFunction0(getAudioEncodingProperties), originalDuration = originalDuration.asInstanceOf[js.Any], trimTimeFromEnd = trimTimeFromEnd.asInstanceOf[js.Any], trimTimeFromStart = trimTimeFromStart.asInstanceOf[js.Any], trimmedDuration = trimmedDuration.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundAudioTrack]
  }
}

