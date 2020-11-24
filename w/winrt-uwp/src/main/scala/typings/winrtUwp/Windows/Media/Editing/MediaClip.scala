package typings.winrtUwp.Windows.Media.Editing

import typings.winrtUwp.Windows.Foundation.Collections.IMap
import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Media.Effects.IAudioEffectDefinition
import typings.winrtUwp.Windows.Media.Effects.IVideoEffectDefinition
import typings.winrtUwp.Windows.Media.MediaProperties.VideoEncodingProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a single media object. */
@js.native
trait MediaClip extends js.Object {
  
  /** Gets the list of audio effect definitions for processing the media clip. */
  var audioEffectDefinitions: IVector[IAudioEffectDefinition] = js.native
  
  /** The list of embedded audio tracks in this media clip. */
  var embeddedAudioTracks: IVectorView[EmbeddedAudioTrack] = js.native
  
  /** The time when the media clip stops playing within a MediaComposition . */
  var endTimeInComposition: Double = js.native
  
  /**
    * Gets the VideoEncodingProperties for the media clip.
    * @return The VideoEncodingProperties for the media clip.
    */
  def getVideoEncodingProperties(): VideoEncodingProperties = js.native
  
  /** Original playback time of the media clip, without the effects of TrimTimeFromStart and TrimTimeFromEnd properties. */
  var originalDuration: Double = js.native
  
  /** The index of the audio track within the media clip that is used for playback. */
  var selectedEmbeddedAudioTrackIndex: Double = js.native
  
  /** The time when the media clip starts playing within a MediaComposition . */
  var startTimeInComposition: Double = js.native
  
  /** The amount of time to trim from the end of the media clip. */
  var trimTimeFromEnd: Double = js.native
  
  /** The amount of time to trim from the beginning of the media clip. */
  var trimTimeFromStart: Double = js.native
  
  /** Duration of the media clip with TrimTimeFromStart and TrimTimeFromEnd applied to playback. */
  var trimmedDuration: Double = js.native
  
  /** An associative collection for storing custom properties associated with the media clip. */
  var userData: IMap[String, String] = js.native
  
  /** Gets the list of video effect definitions for processing the media clip. */
  var videoEffectDefinitions: IVector[IVideoEffectDefinition] = js.native
  
  /** Gets or sets the volume of the media clip. */
  var volume: Double = js.native
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
  
  @scala.inline
  implicit class MediaClipOps[Self <: MediaClip] (val x: Self) extends AnyVal {
    
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
    def setAudioEffectDefinitions(value: IVector[IAudioEffectDefinition]): Self = this.set("audioEffectDefinitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmbeddedAudioTracks(value: IVectorView[EmbeddedAudioTrack]): Self = this.set("embeddedAudioTracks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeInComposition(value: Double): Self = this.set("endTimeInComposition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetVideoEncodingProperties(value: () => VideoEncodingProperties): Self = this.set("getVideoEncodingProperties", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOriginalDuration(value: Double): Self = this.set("originalDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedEmbeddedAudioTrackIndex(value: Double): Self = this.set("selectedEmbeddedAudioTrackIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeInComposition(value: Double): Self = this.set("startTimeInComposition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrimTimeFromEnd(value: Double): Self = this.set("trimTimeFromEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrimTimeFromStart(value: Double): Self = this.set("trimTimeFromStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrimmedDuration(value: Double): Self = this.set("trimmedDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserData(value: IMap[String, String]): Self = this.set("userData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoEffectDefinitions(value: IVector[IVideoEffectDefinition]): Self = this.set("videoEffectDefinitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolume(value: Double): Self = this.set("volume", value.asInstanceOf[js.Any])
  }
}
