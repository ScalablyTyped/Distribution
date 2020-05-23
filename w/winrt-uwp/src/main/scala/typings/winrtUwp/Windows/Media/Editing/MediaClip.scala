package typings.winrtUwp.Windows.Media.Editing

import typings.winrtUwp.Windows.Foundation.Collections.IMap
import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Media.Effects.IAudioEffectDefinition
import typings.winrtUwp.Windows.Media.Effects.IVideoEffectDefinition
import typings.winrtUwp.Windows.Media.MediaProperties.VideoEncodingProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a single media object. */
trait MediaClip extends js.Object {
  /** Gets the list of audio effect definitions for processing the media clip. */
  var audioEffectDefinitions: IVector[IAudioEffectDefinition]
  /** The list of embedded audio tracks in this media clip. */
  var embeddedAudioTracks: IVectorView[EmbeddedAudioTrack]
  /** The time when the media clip stops playing within a MediaComposition . */
  var endTimeInComposition: Double
  /** Original playback time of the media clip, without the effects of TrimTimeFromStart and TrimTimeFromEnd properties. */
  var originalDuration: Double
  /** The index of the audio track within the media clip that is used for playback. */
  var selectedEmbeddedAudioTrackIndex: Double
  /** The time when the media clip starts playing within a MediaComposition . */
  var startTimeInComposition: Double
  /** The amount of time to trim from the end of the media clip. */
  var trimTimeFromEnd: Double
  /** The amount of time to trim from the beginning of the media clip. */
  var trimTimeFromStart: Double
  /** Duration of the media clip with TrimTimeFromStart and TrimTimeFromEnd applied to playback. */
  var trimmedDuration: Double
  /** An associative collection for storing custom properties associated with the media clip. */
  var userData: IMap[String, String]
  /** Gets the list of video effect definitions for processing the media clip. */
  var videoEffectDefinitions: IVector[IVideoEffectDefinition]
  /** Gets or sets the volume of the media clip. */
  var volume: Double
  /**
    * Gets the VideoEncodingProperties for the media clip.
    * @return The VideoEncodingProperties for the media clip.
    */
  def getVideoEncodingProperties(): VideoEncodingProperties
}

object MediaClip {
  @scala.inline
  def apply(
    audioEffectDefinitions: IVector[IAudioEffectDefinition],
    embeddedAudioTracks: IVectorView[EmbeddedAudioTrack],
    endTimeInComposition: Double,
    getVideoEncodingProperties: () => VideoEncodingProperties,
    originalDuration: Double,
    selectedEmbeddedAudioTrackIndex: Double,
    startTimeInComposition: Double,
    trimTimeFromEnd: Double,
    trimTimeFromStart: Double,
    trimmedDuration: Double,
    userData: IMap[String, String],
    videoEffectDefinitions: IVector[IVideoEffectDefinition],
    volume: Double
  ): MediaClip = {
    val __obj = js.Dynamic.literal(audioEffectDefinitions = audioEffectDefinitions.asInstanceOf[js.Any], embeddedAudioTracks = embeddedAudioTracks.asInstanceOf[js.Any], endTimeInComposition = endTimeInComposition.asInstanceOf[js.Any], getVideoEncodingProperties = js.Any.fromFunction0(getVideoEncodingProperties), originalDuration = originalDuration.asInstanceOf[js.Any], selectedEmbeddedAudioTrackIndex = selectedEmbeddedAudioTrackIndex.asInstanceOf[js.Any], startTimeInComposition = startTimeInComposition.asInstanceOf[js.Any], trimTimeFromEnd = trimTimeFromEnd.asInstanceOf[js.Any], trimTimeFromStart = trimTimeFromStart.asInstanceOf[js.Any], trimmedDuration = trimmedDuration.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any], videoEffectDefinitions = videoEffectDefinitions.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaClip]
  }
}

