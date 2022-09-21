package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaControllerPlaybackInfo extends StObject {
  
  /**
    * Current playback age rating.
    *
    * @since 5.5
    */
  val ageRating: MediaControllerContentAgeRating
  
  /**
    * Current playback content type.
    *
    * Default value is UNDECIDED.
    *
    * @since 5.5
    */
  val contentType: MediaControllerContentType
  
  /**
    * Current item index.
    * @since 5.5
    * @remark Null if no item currently in playback.
    */
  val index: String | Null
  
  /**
    * Current playback metadata.
    */
  val metadata: MediaControllerMetadata
  
  /**
    * Current playlist name.
    * @since 5.5
    * @remark Null if no item currently in playback.
    */
  val playlistName: String | Null
  
  /**
    * Current playback position.
    */
  val position: Double
  
  /**
    * Current repeat mode.
    *
    * Any change in value of _repeatMode_ will also change the value of _repeatState_.
    *
    * The _repeatMode_ equal to true is equivalent to _repeatState_ equal to REPEAT\_ALL and
    * _repeatMode_ equal to false is equivalent to _repeatState_ equal to REPEAT\_OFF.
    *
    * @note _deprecated_ 5.5 Deprecated since 5.5. Instead, use [repeatState](#MediaControllerPlaybackInfo::repeatState).
    */
  val repeatMode: Boolean
  
  /**
    * Current repeat state.
    *
    * Any change in value of _repeatState_ will also change the value of _repeatMode_, except the REPEAT\_ONE value.
    * In this case the _repeatMode_ value will not change.
    *
    * The _repeatState_ equals to REPEAT\_ALL is equivalent to _repeatMode_ equals to true and
    * _repeatState_ equals to REPEAT\_OFF is equivalent to _repeatMode_ equals to false.
    *
    * Default value is REPEAT\_ALL.
    *
    * @since 5.5
    */
  val repeatState: MediaControllerRepeatState
  
  /**
    * Current shuffle mode.
    */
  val shuffleMode: Boolean
  
  /**
    * Current playback state.
    */
  val state: MediaControllerPlaybackState
}
object MediaControllerPlaybackInfo {
  
  inline def apply(
    ageRating: MediaControllerContentAgeRating,
    contentType: MediaControllerContentType,
    metadata: MediaControllerMetadata,
    position: Double,
    repeatMode: Boolean,
    repeatState: MediaControllerRepeatState,
    shuffleMode: Boolean,
    state: MediaControllerPlaybackState
  ): MediaControllerPlaybackInfo = {
    val __obj = js.Dynamic.literal(ageRating = ageRating.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], repeatMode = repeatMode.asInstanceOf[js.Any], repeatState = repeatState.asInstanceOf[js.Any], shuffleMode = shuffleMode.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], index = null, playlistName = null)
    __obj.asInstanceOf[MediaControllerPlaybackInfo]
  }
  
  extension [Self <: MediaControllerPlaybackInfo](x: Self) {
    
    inline def setAgeRating(value: MediaControllerContentAgeRating): Self = StObject.set(x, "ageRating", value.asInstanceOf[js.Any])
    
    inline def setContentType(value: MediaControllerContentType): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexNull: Self = StObject.set(x, "index", null)
    
    inline def setMetadata(value: MediaControllerMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setPlaylistName(value: String): Self = StObject.set(x, "playlistName", value.asInstanceOf[js.Any])
    
    inline def setPlaylistNameNull: Self = StObject.set(x, "playlistName", null)
    
    inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setRepeatMode(value: Boolean): Self = StObject.set(x, "repeatMode", value.asInstanceOf[js.Any])
    
    inline def setRepeatState(value: MediaControllerRepeatState): Self = StObject.set(x, "repeatState", value.asInstanceOf[js.Any])
    
    inline def setShuffleMode(value: Boolean): Self = StObject.set(x, "shuffleMode", value.asInstanceOf[js.Any])
    
    inline def setState(value: MediaControllerPlaybackState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
