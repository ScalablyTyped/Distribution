package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaControllerChangeRequestPlaybackInfoCallback extends StObject {
  
  /**
    * Called when client request change of playback item.
    *
    * @since 5.5
    *
    * @param playlistName Name of playlist.
    * @param index Index of the item to be changed.
    * @param state Playback state.
    * @param position Playback position.
    * @param clientName Id of client application, which sent a command.
    */
  def onplaybackitemrequest(
    playlistName: String,
    index: String,
    state: MediaControllerPlaybackState,
    position: Double,
    clientName: ApplicationId
  ): Unit
  
  /**
    * Called when client requested playback position changes.
    *
    * @param position Requested playback position.
    * @param clientName Id of client application, which sent a command.
    *
    * @remark Parameter _clientName_ is passed since Tizen 5.5.
    */
  def onplaybackpositionrequest(position: Double, clientName: ApplicationId): Unit
  
  /**
    * Called when client requested playback state changes.
    *
    * @param state Requested playback state.
    * @param clientName Id of client application, which sent a command.
    *
    * @remark Parameter _clientName_ is passed since Tizen 5.5.
    */
  def onplaybackstaterequest(state: MediaControllerPlaybackState, clientName: ApplicationId): Unit
  
  /**
    * Called when client requested repeat mode changes.
    *
    * @note _deprecated_ 5.5 Deprecated since 5.5. Instead, use [onrepeatstaterequest](#MediaControllerChangeRequestPlaybackInfoCallback::onrepeatstaterequest).
    *
    * @remark The [onrepeatmoderequest](#MediaControllerChangeRequestPlaybackInfoCallback::onrepeatmoderequest) callback
    * will not be invoked, if the [repeatState](#MediaControllerPlaybackInfo::repeatState) is requested to be changed to REPEAT\_ONE.
    *
    * @param mode Requested repeat mode.
    * @param clientName Client application id which sent command.
    *
    * @remark Parameter _clientName_ is passed since Tizen 5.5.
    */
  def onrepeatmoderequest(mode: Boolean, clientName: ApplicationId): Unit
  
  /**
    * Called when client requested change of repeat state.
    *
    * @since 5.5
    *
    * @param state Requested repeat state.
    * @param clientName Id of client application, which sent a command.
    *
    * It is guaranteed that the [onrepeatstaterequest](#MediaControllerChangeRequestPlaybackInfoCallback::onrepeatstaterequest) callback
    * will be invoked after the [onrepeatmoderequest](#MediaControllerChangeRequestPlaybackInfoCallback::onrepeatmoderequest).
    */
  def onrepeatstaterequest(state: MediaControllerRepeatState, clientName: ApplicationId): Unit
  
  /**
    * Called when client requested shuffle mode changes.
    *
    * @param mode Requested shuffle mode.
    * @param clientName Id of client application, which sent a command.
    *
    * @remark Parameter _clientName_ is passed since Tizen 5.5.
    */
  def onshufflemoderequest(mode: Boolean, clientName: ApplicationId): Unit
}
object MediaControllerChangeRequestPlaybackInfoCallback {
  
  inline def apply(
    onplaybackitemrequest: (String, String, MediaControllerPlaybackState, Double, ApplicationId) => Unit,
    onplaybackpositionrequest: (Double, ApplicationId) => Unit,
    onplaybackstaterequest: (MediaControllerPlaybackState, ApplicationId) => Unit,
    onrepeatmoderequest: (Boolean, ApplicationId) => Unit,
    onrepeatstaterequest: (MediaControllerRepeatState, ApplicationId) => Unit,
    onshufflemoderequest: (Boolean, ApplicationId) => Unit
  ): MediaControllerChangeRequestPlaybackInfoCallback = {
    val __obj = js.Dynamic.literal(onplaybackitemrequest = js.Any.fromFunction5(onplaybackitemrequest), onplaybackpositionrequest = js.Any.fromFunction2(onplaybackpositionrequest), onplaybackstaterequest = js.Any.fromFunction2(onplaybackstaterequest), onrepeatmoderequest = js.Any.fromFunction2(onrepeatmoderequest), onrepeatstaterequest = js.Any.fromFunction2(onrepeatstaterequest), onshufflemoderequest = js.Any.fromFunction2(onshufflemoderequest))
    __obj.asInstanceOf[MediaControllerChangeRequestPlaybackInfoCallback]
  }
  
  extension [Self <: MediaControllerChangeRequestPlaybackInfoCallback](x: Self) {
    
    inline def setOnplaybackitemrequest(value: (String, String, MediaControllerPlaybackState, Double, ApplicationId) => Unit): Self = StObject.set(x, "onplaybackitemrequest", js.Any.fromFunction5(value))
    
    inline def setOnplaybackpositionrequest(value: (Double, ApplicationId) => Unit): Self = StObject.set(x, "onplaybackpositionrequest", js.Any.fromFunction2(value))
    
    inline def setOnplaybackstaterequest(value: (MediaControllerPlaybackState, ApplicationId) => Unit): Self = StObject.set(x, "onplaybackstaterequest", js.Any.fromFunction2(value))
    
    inline def setOnrepeatmoderequest(value: (Boolean, ApplicationId) => Unit): Self = StObject.set(x, "onrepeatmoderequest", js.Any.fromFunction2(value))
    
    inline def setOnrepeatstaterequest(value: (MediaControllerRepeatState, ApplicationId) => Unit): Self = StObject.set(x, "onrepeatstaterequest", js.Any.fromFunction2(value))
    
    inline def setOnshufflemoderequest(value: (Boolean, ApplicationId) => Unit): Self = StObject.set(x, "onshufflemoderequest", js.Any.fromFunction2(value))
  }
}
