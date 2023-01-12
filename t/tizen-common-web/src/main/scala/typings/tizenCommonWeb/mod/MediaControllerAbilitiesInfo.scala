package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaControllerAbilitiesInfo extends StObject {
  
  /**
    * Represents server's ability to receive custom commands from media controller client.
    *
    * @throw WebAPIException with error type UnknownError, if any error occurs.
    */
  val clientCustom: MediaControllerAbilitySupport
  
  /**
    * Represents abilities of server's display modes.
    */
  val displayMode: MediaControllerDisplayModeAbilitiesInfo
  
  /**
    * Represents server abilities of setting display orientations.
    */
  val displayRotation: MediaControllerDisplayRotationAbilitiesInfo
  
  /**
    * Represents server's ability to receive requests for spherical (360°) mode change from media controller client.
    *
    * @throw WebAPIException with error type UnknownError, if any error occurs.
    */
  val mode360: MediaControllerAbilitySupport
  
  /**
    * Represents abilities of server's playback actions.
    */
  val playback: MediaControllerPlaybackAbilitiesInfo
  
  /**
    * Represents server's ability to change playback position.
    *
    * @throw WebAPIException with error type UnknownError, if any error occurs.
    */
  val playbackPosition: MediaControllerAbilitySupport
  
  /**
    * Represents server's ability to add/change/remove playlists.
    *
    * @throw WebAPIException with error type UnknownError, if any error occurs.
    */
  val playlist: MediaControllerAbilitySupport
  
  /**
    * Represents server's ability to change repeat state.
    *
    * @throw WebAPIException with error type UnknownError, if any error occurs.
    */
  val repeat: MediaControllerAbilitySupport
  
  /**
    * Represents server's ability to receive search requests from media controller client.
    *
    * @throw WebAPIException with error type UnknownError, if any error occurs.
    */
  val search: MediaControllerAbilitySupport
  
  /**
    * Represents server's ability to change shuffle mode.
    *
    * @throw WebAPIException with error type UnknownError, if any error occurs.
    */
  val shuffle: MediaControllerAbilitySupport
  
  /**
    * Adds a subscription for monitoring status of all abilities of server represented by this object.
    *
    * @remark Function [addAbilityChangeListener()](#MediaControllerClient::addAbilityChangeListener) must be called before current method.
    * For code example see [unsubscribe()](#MediaControllerAbilitiesInfo::unsubscribe).
    *
    * @throw WebAPIException with error type InvalidStateError, if [addAbilityChangeListener()](#MediaControllerClient::addAbilityChangeListener) is not set.
    * @throw WebAPIException with error type UnknownError, if any other error occurs.
    */
  def subscribe(): Unit
  
  /**
    * Represents server's ability to receive requests for subtitles mode change from media controller client.
    *
    * @throw WebAPIException with error type UnknownError, if any error occurs.
    */
  val subtitles: MediaControllerAbilitySupport
  
  /**
    * Removes a subscription for monitoring status of all abilities of server represented by this object.
    *
    * @throw WebAPIException with error type UnknownError, if any error occurs.
    */
  def unsubscribe(): Unit
}
object MediaControllerAbilitiesInfo {
  
  inline def apply(
    clientCustom: MediaControllerAbilitySupport,
    displayMode: MediaControllerDisplayModeAbilitiesInfo,
    displayRotation: MediaControllerDisplayRotationAbilitiesInfo,
    mode360: MediaControllerAbilitySupport,
    playback: MediaControllerPlaybackAbilitiesInfo,
    playbackPosition: MediaControllerAbilitySupport,
    playlist: MediaControllerAbilitySupport,
    repeat: MediaControllerAbilitySupport,
    search: MediaControllerAbilitySupport,
    shuffle: MediaControllerAbilitySupport,
    subscribe: () => Unit,
    subtitles: MediaControllerAbilitySupport,
    unsubscribe: () => Unit
  ): MediaControllerAbilitiesInfo = {
    val __obj = js.Dynamic.literal(clientCustom = clientCustom.asInstanceOf[js.Any], displayMode = displayMode.asInstanceOf[js.Any], displayRotation = displayRotation.asInstanceOf[js.Any], mode360 = mode360.asInstanceOf[js.Any], playback = playback.asInstanceOf[js.Any], playbackPosition = playbackPosition.asInstanceOf[js.Any], playlist = playlist.asInstanceOf[js.Any], repeat = repeat.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], shuffle = shuffle.asInstanceOf[js.Any], subscribe = js.Any.fromFunction0(subscribe), subtitles = subtitles.asInstanceOf[js.Any], unsubscribe = js.Any.fromFunction0(unsubscribe))
    __obj.asInstanceOf[MediaControllerAbilitiesInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MediaControllerAbilitiesInfo] (val x: Self) extends AnyVal {
    
    inline def setClientCustom(value: MediaControllerAbilitySupport): Self = StObject.set(x, "clientCustom", value.asInstanceOf[js.Any])
    
    inline def setDisplayMode(value: MediaControllerDisplayModeAbilitiesInfo): Self = StObject.set(x, "displayMode", value.asInstanceOf[js.Any])
    
    inline def setDisplayRotation(value: MediaControllerDisplayRotationAbilitiesInfo): Self = StObject.set(x, "displayRotation", value.asInstanceOf[js.Any])
    
    inline def setMode360(value: MediaControllerAbilitySupport): Self = StObject.set(x, "mode360", value.asInstanceOf[js.Any])
    
    inline def setPlayback(value: MediaControllerPlaybackAbilitiesInfo): Self = StObject.set(x, "playback", value.asInstanceOf[js.Any])
    
    inline def setPlaybackPosition(value: MediaControllerAbilitySupport): Self = StObject.set(x, "playbackPosition", value.asInstanceOf[js.Any])
    
    inline def setPlaylist(value: MediaControllerAbilitySupport): Self = StObject.set(x, "playlist", value.asInstanceOf[js.Any])
    
    inline def setRepeat(value: MediaControllerAbilitySupport): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
    
    inline def setSearch(value: MediaControllerAbilitySupport): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    inline def setShuffle(value: MediaControllerAbilitySupport): Self = StObject.set(x, "shuffle", value.asInstanceOf[js.Any])
    
    inline def setSubscribe(value: () => Unit): Self = StObject.set(x, "subscribe", js.Any.fromFunction0(value))
    
    inline def setSubtitles(value: MediaControllerAbilitySupport): Self = StObject.set(x, "subtitles", value.asInstanceOf[js.Any])
    
    inline def setUnsubscribe(value: () => Unit): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction0(value))
  }
}
