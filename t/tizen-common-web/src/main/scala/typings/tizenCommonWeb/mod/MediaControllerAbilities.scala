package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaControllerAbilities extends StObject {
  
  /**
    * Represents server's ability to receive custom commands from the media controller client.
    *
    * Default value is UNDECIDED.
    *
    * @throw WebAPIException with error type TypeMismatchError, if set value will not be compatible with MediaControllerAbilitySupport enum.
    * @throw WebAPIException with error type InvalidValuesError, if set value will be "UNDECIDED".
    * @throw WebAPIException with error type UnknownError, if any other error occurs.
    */
  var clientCustom: MediaControllerAbilitySupport
  
  /**
    * Represents abilities of server's display modes.
    */
  val displayMode: MediaControllerDisplayModeAbilities
  
  /**
    * Represents display orientations supported by the media controller server.
    */
  val displayRotation: MediaControllerDisplayRotationAbilities
  
  /**
    * Represents server's ability to receive requests for spherical (360°) mode change from the media controller client.
    *
    * Default value is NO.
    *
    * @throw WebAPIException with error type TypeMismatchError, if set value will not be compatible with MediaControllerAbilitySupport enum.
    * @throw WebAPIException with error type InvalidValuesError, if set value will be "UNDECIDED".
    * @throw WebAPIException with error type UnknownError, if any other error occurs.
    */
  var mode360: MediaControllerAbilitySupport
  
  /**
    * Represents abilities of server's playback actions.
    */
  val playback: MediaControllerPlaybackAbilities
  
  /**
    * Represents server's ability to change playback position.
    *
    * Default value is UNDECIDED.
    *
    * @throw WebAPIException with error type TypeMismatchError, if set value will not be compatible with MediaControllerAbilitySupport enum.
    * @throw WebAPIException with error type InvalidValuesError, if set value will be "UNDECIDED".
    * @throw WebAPIException with error type UnknownError, if any other error occurs.
    */
  var playbackPosition: MediaControllerAbilitySupport
  
  /**
    * Represents server's ability to add/change/remove playlists.
    *
    * Default value is UNDECIDED.
    *
    * @throw WebAPIException with error type TypeMismatchError, if set value will not be compatible with MediaControllerAbilitySupport enum.
    * @throw WebAPIException with error type InvalidValuesError, if set value will be "UNDECIDED".
    * @throw WebAPIException with error type UnknownError, if any other error occurs.
    */
  var playlist: MediaControllerAbilitySupport
  
  /**
    * Represents server's ability to change repeat state.
    *
    * Default value is UNDECIDED.
    *
    * @throw WebAPIException with error type TypeMismatchError, if set value will not be compatible with MediaControllerAbilitySupport enum.
    * @throw WebAPIException with error type InvalidValuesError, if set value will be "UNDECIDED".
    * @throw WebAPIException with error type UnknownError, if any other error occurs.
    */
  var repeat: MediaControllerAbilitySupport
  
  /**
    * Represents server's ability to receive search requests from the media controller client.
    *
    * Default value is UNDECIDED.
    *
    * @throw WebAPIException with error type TypeMismatchError, if set value will not be compatible with MediaControllerAbilitySupport enum.
    * @throw WebAPIException with error type InvalidValuesError, if set value will be "UNDECIDED".
    * @throw WebAPIException with error type UnknownError, if any other error occurs.
    */
  var search: MediaControllerAbilitySupport
  
  /**
    * Represents server's ability to change shuffle mode.
    *
    * Default value is UNDECIDED.
    *
    * @throw WebAPIException with error type TypeMismatchError, if set value will not be compatible with MediaControllerAbilitySupport enum.
    * @throw WebAPIException with error type InvalidValuesError, if set value will be "UNDECIDED".
    * @throw WebAPIException with error type UnknownError, if any other error occurs.
    */
  var shuffle: MediaControllerAbilitySupport
  
  /**
    * Represents server's ability to receive requests for subtitles mode change from the media controller client.
    *
    * Default value is NO.
    *
    * @throw WebAPIException with error type TypeMismatchError, if set value will not be compatible with MediaControllerAbilitySupport enum.
    * @throw WebAPIException with error type InvalidValuesError, if set value will be "UNDECIDED".
    * @throw WebAPIException with error type UnknownError, if any other error occurs.
    */
  var subtitles: MediaControllerAbilitySupport
}
object MediaControllerAbilities {
  
  inline def apply(
    clientCustom: MediaControllerAbilitySupport,
    displayMode: MediaControllerDisplayModeAbilities,
    displayRotation: MediaControllerDisplayRotationAbilities,
    mode360: MediaControllerAbilitySupport,
    playback: MediaControllerPlaybackAbilities,
    playbackPosition: MediaControllerAbilitySupport,
    playlist: MediaControllerAbilitySupport,
    repeat: MediaControllerAbilitySupport,
    search: MediaControllerAbilitySupport,
    shuffle: MediaControllerAbilitySupport,
    subtitles: MediaControllerAbilitySupport
  ): MediaControllerAbilities = {
    val __obj = js.Dynamic.literal(clientCustom = clientCustom.asInstanceOf[js.Any], displayMode = displayMode.asInstanceOf[js.Any], displayRotation = displayRotation.asInstanceOf[js.Any], mode360 = mode360.asInstanceOf[js.Any], playback = playback.asInstanceOf[js.Any], playbackPosition = playbackPosition.asInstanceOf[js.Any], playlist = playlist.asInstanceOf[js.Any], repeat = repeat.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], shuffle = shuffle.asInstanceOf[js.Any], subtitles = subtitles.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaControllerAbilities]
  }
  
  extension [Self <: MediaControllerAbilities](x: Self) {
    
    inline def setClientCustom(value: MediaControllerAbilitySupport): Self = StObject.set(x, "clientCustom", value.asInstanceOf[js.Any])
    
    inline def setDisplayMode(value: MediaControllerDisplayModeAbilities): Self = StObject.set(x, "displayMode", value.asInstanceOf[js.Any])
    
    inline def setDisplayRotation(value: MediaControllerDisplayRotationAbilities): Self = StObject.set(x, "displayRotation", value.asInstanceOf[js.Any])
    
    inline def setMode360(value: MediaControllerAbilitySupport): Self = StObject.set(x, "mode360", value.asInstanceOf[js.Any])
    
    inline def setPlayback(value: MediaControllerPlaybackAbilities): Self = StObject.set(x, "playback", value.asInstanceOf[js.Any])
    
    inline def setPlaybackPosition(value: MediaControllerAbilitySupport): Self = StObject.set(x, "playbackPosition", value.asInstanceOf[js.Any])
    
    inline def setPlaylist(value: MediaControllerAbilitySupport): Self = StObject.set(x, "playlist", value.asInstanceOf[js.Any])
    
    inline def setRepeat(value: MediaControllerAbilitySupport): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
    
    inline def setSearch(value: MediaControllerAbilitySupport): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    inline def setShuffle(value: MediaControllerAbilitySupport): Self = StObject.set(x, "shuffle", value.asInstanceOf[js.Any])
    
    inline def setSubtitles(value: MediaControllerAbilitySupport): Self = StObject.set(x, "subtitles", value.asInstanceOf[js.Any])
  }
}
