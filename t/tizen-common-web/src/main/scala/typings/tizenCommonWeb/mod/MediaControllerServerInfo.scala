package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaControllerServerInfo extends StObject {
  
  /**
    * Abilities of the media controller server.
    *
    * @since 5.5
    */
  val abilities: MediaControllerAbilitiesInfo = js.native
  
  /**
    * Adds the listener for a media playback info changes.
    *
    * @param listener Status change listener to add.
    *
    * @returns The identifier used to clear the watch subscription.
    *
    * @throws WebAPIException with error type TypeMismatchError, if any input parameter is not compatible with the expected type for that parameter.
    * @throws WebAPIException with error type UnknownError, if any other error occurs.
    */
  def addPlaybackInfoChangeListener(listener: MediaControllerPlaybackInfoChangeCallback): Double = js.native
  
  /**
    * Adds listener to be invoked when playlist is updated by server.
    *
    * @since 5.5
    *
    * @param listener Listener for adding, updating or deleting of any playlist.
    *
    * @returns The identifier used to clear the watch subscription.
    *
    * @throws WebAPIException with error type TypeMismatchError, if any input parameter is not compatible with the expected type for that parameter.
    * @throws WebAPIException with error type UnknownError, if any other error occurs.
    */
  def addPlaylistUpdatedListener(listener: MediaControllerPlaylistUpdatedCallback): Double = js.native
  
  /**
    * Adds the listener for a media controller server status change.
    *
    * @param listener Status change listener to add.
    *
    * @returns The identifier used to clear the watch subscription.
    *
    * @throws WebAPIException with error type TypeMismatchError, if any input parameter is not compatible with the expected type for that parameter.
    * @throws WebAPIException with error type UnknownError, if any other error occurs.
    */
  def addServerStatusChangeListener(listener: MediaControllerServerStatusChangeCallback): Double = js.native
  
  /**
    * Object representing features related to display mode control of a media controller server.
    *
    * @since 5.5
    */
  val displayMode: MediaControllerDisplayModeInfo = js.native
  
  /**
    * Object representing features related to display rotation control of a media controller server.
    *
    * @since 5.5
    */
  val displayRotation: MediaControllerDisplayRotationInfo = js.native
  
  /**
    * Retrieves all playlists saved in local database.
    *
    * The _errorCallback_ may be triggered for one of the following errors:
    *
    * *   _UnknownError_: if any other error prevents function from successful completion.
    *
    *
    * @since 5.5
    *
    * @param successCallback Function to be called upon success.
    * @param errorCallback Function to be called upon failure.
    *
    * @throws WebAPIException with error type TypeMismatchError, if any parameter has invalid type.
    * @throws WebAPIException with error type UnknownError, if any other error occurs.
    */
  def getAllPlaylists(successCallback: MediaControllerGetAllPlaylistsSuccessCallback): Unit = js.native
  def getAllPlaylists(successCallback: MediaControllerGetAllPlaylistsSuccessCallback, errorCallback: ErrorCallback): Unit = js.native
  
  /**
    * Server icon URI.
    *
    * @since 5.5
    *
    * @throws WebAPIException with error type UnknownError, if any error occurs.
    */
  val iconURI: String | Null = js.native
  
  /**
    * Object representing features related to spherical (360°) mode control of a media controller server.
    *
    * @since 5.5
    */
  val mode360: MediaControllerMode360Info = js.native
  
  /**
    * The appId of the media controller server.
    */
  val name: ApplicationId = js.native
  
  /**
    * Current playback info.
    *
    * @throws WebAPIException with error type UnknownError, if any error occurs.
    */
  val playbackInfo: MediaControllerPlaybackInfo = js.native
  
  /**
    * Removes the listener, so stop receiving notifications about media playback info changes.
    *
    * Calling this function has no effect if there is no listener with given id.
    *
    * @param watchId Subscription identifier.
    *
    * @throws WebAPIException with error type UnknownError, if any error occurs.
    */
  def removePlaybackInfoChangeListener(watchId: Double): Unit = js.native
  
  /**
    * Stops listening for playlist updates and removals.
    *
    * @since 5.5
    *
    * @remark This function has no effect, if there is no listener for given id.
    *
    * @param listenerId Listener ID returned by _addPlaylistUpdatedListener_.
    *
    * @throws WebAPIException with error type UnknownError, if any error occurs.
    */
  def removePlaylistUpdatedListener(listenerId: Double): Unit = js.native
  
  /**
    * Removes the listener, so stop receiving notifications about media controller server status.
    *
    * Calling this function has no effect if there is no listener with given id.
    *
    * @param watchId Subscription identifier.
    *
    * @throws WebAPIException with error type UnknownError, if any error occurs.
    */
  def removeServerStatusChangeListener(watchId: Double): Unit = js.native
  
  def sendCommand(command: String, data: Null, successCallback: MediaControllerSendCommandSuccessCallback): Unit = js.native
  def sendCommand(
    command: String,
    data: Null,
    successCallback: MediaControllerSendCommandSuccessCallback,
    errorCallback: ErrorCallback
  ): Unit = js.native
  /**
    * Allows to send custom command to media controller server.
    *
    * @remark See [addCommandListener()](#MediaControllerServer::addCommandListener) method to check how to receive
    * and respond to custom commands.
    *
    * @param command Custom command name which is handled on server side.
    * @param data Additional data for custom command which is send to server.
    * @param successCallback The method to invoke when server responded to custom command.
    * @param errorCallback The method to invoke on operation failure.
    *
    * @throws WebAPIException with error type TypeMismatchError, if any input parameter is not compatible with the expected type for that parameter.
    * @throws WebAPIException with error type UnknownError, if any other error occurs.
    */
  def sendCommand(command: String, data: Bundle, successCallback: MediaControllerSendCommandSuccessCallback): Unit = js.native
  def sendCommand(
    command: String,
    data: Bundle,
    successCallback: MediaControllerSendCommandSuccessCallback,
    errorCallback: ErrorCallback
  ): Unit = js.native
  
  /**
    * Requests setting new playback item to server.
    *
    * @since 5.5
    *
    * @remark _PlaybackInfoChangeListener_ should be invoked, if registered.
    *
    * @param playlistName Name of playlist to be set.
    * @param index Index of item on playlist to be set.
    * @param state Playback state.
    * @param position Playback position.
    *
    * @throws WebAPIException with error type UnknownError, if any error occurs.
    */
  def sendPlaybackItem(playlistName: String, index: String, state: MediaControllerPlaybackState, position: Double): Unit = js.native
  
  /**
    * Allows to change playback position of media controller server.
    *
    * @param position Playback position.
    * @param successCallback The method to invoke when playback position was changed.
    * @param errorCallback The method to invoke on operation failure.
    *
    * @throws WebAPIException with error type InvalidValuesError, if any of the input parameters contain an invalid value.
    * @throws WebAPIException with error type TypeMismatchError, if any input parameter is not compatible with the expected type for that parameter.
    * @throws WebAPIException with error type UnknownError, if any other error occurs.
    */
  def sendPlaybackPosition(position: Double): Unit = js.native
  def sendPlaybackPosition(position: Double, successCallback: Null, errorCallback: ErrorCallback): Unit = js.native
  def sendPlaybackPosition(position: Double, successCallback: Unit, errorCallback: ErrorCallback): Unit = js.native
  def sendPlaybackPosition(position: Double, successCallback: SuccessCallback): Unit = js.native
  def sendPlaybackPosition(position: Double, successCallback: SuccessCallback, errorCallback: ErrorCallback): Unit = js.native
  
  /**
    * Allows to change playback state of media controller server.
    *
    * @param state Playback state.
    * @param successCallback The method to invoke when playback state was changed.
    * @param errorCallback The method to invoke on operation failure.
    *
    * @throws WebAPIException with error type TypeMismatchError, if any input parameter is not compatible with the expected type for that parameter.
    * @throws WebAPIException with error type UnknownError, if any other error occurs.
    */
  def sendPlaybackState(state: MediaControllerPlaybackState): Unit = js.native
  def sendPlaybackState(state: MediaControllerPlaybackState, successCallback: Null, errorCallback: ErrorCallback): Unit = js.native
  def sendPlaybackState(state: MediaControllerPlaybackState, successCallback: Unit, errorCallback: ErrorCallback): Unit = js.native
  def sendPlaybackState(state: MediaControllerPlaybackState, successCallback: SuccessCallback): Unit = js.native
  def sendPlaybackState(
    state: MediaControllerPlaybackState,
    successCallback: SuccessCallback,
    errorCallback: ErrorCallback
  ): Unit = js.native
  
  /**
    * Allows to change repeat mode of media controller server.
    *
    * @note _deprecated_ 5.5 Deprecated since 5.5. Instead, use [sendRepeatState](#MediaControllerServerInfo::sendRepeatState).
    *
    * @param mode Repeat mode.
    * @param successCallback The method to invoke when repeat mode was changed.
    * @param errorCallback The method to invoke on operation failure.
    *
    * @throws WebAPIException with error type TypeMismatchError, if any input parameter is not compatible with the expected type for that parameter.
    * @throws WebAPIException with error type UnknownError, if any other error occurs.
    */
  def sendRepeatMode(mode: Boolean): Unit = js.native
  def sendRepeatMode(mode: Boolean, successCallback: Null, errorCallback: ErrorCallback): Unit = js.native
  def sendRepeatMode(mode: Boolean, successCallback: Unit, errorCallback: ErrorCallback): Unit = js.native
  def sendRepeatMode(mode: Boolean, successCallback: SuccessCallback): Unit = js.native
  def sendRepeatMode(mode: Boolean, successCallback: SuccessCallback, errorCallback: ErrorCallback): Unit = js.native
  
  /**
    * Allows to change repeat state of media controller server.
    *
    * @since 5.5
    *
    * @param state Repeat state to be set.
    * @param successCallback The method to invoke when repeat state was changed.
    * @param errorCallback The method to invoke on operation failure.
    *
    * @throws WebAPIException with error type TypeMismatchError, if any input parameter is not compatible with the expected type for that parameter.
    * @throws WebAPIException with error type UnknownError, if any other error occurs.
    */
  def sendRepeatState(state: MediaControllerRepeatState): Unit = js.native
  def sendRepeatState(state: MediaControllerRepeatState, successCallback: Null, errorCallback: ErrorCallback): Unit = js.native
  def sendRepeatState(state: MediaControllerRepeatState, successCallback: Unit, errorCallback: ErrorCallback): Unit = js.native
  def sendRepeatState(state: MediaControllerRepeatState, successCallback: SuccessCallback): Unit = js.native
  def sendRepeatState(state: MediaControllerRepeatState, successCallback: SuccessCallback, errorCallback: ErrorCallback): Unit = js.native
  
  /**
    * Sends a search request to the media controller server.
    *
    * The _errorCallback_ may be triggered for one of the following errors:
    *
    * *   _UnknownError_: if any error prevents function from successful completion.
    *
    *
    * @since 5.5
    *
    * @remark Search request handler should be specified on the server using
    * [setSearchRequestListener()](#MediaControllerServer::setSearchRequestListener) method.
    *
    * @param request A collection of between 1 and 20 SearchFilter objects.
    * @param replyCallback Function to be invoked when server reply is received.
    * @param errorCallback Function to be invoked if server reports failure.
    *
    * @throws WebAPIException with error type InvalidValuesError, if request has invalid number of filters.
    * @throws WebAPIException with error type TypeMismatchError, if any input parameter is not compatible with the expected type for that parameter.
    * @throws WebAPIException with error type UnknownError, if any other error occurs.
    */
  def sendSearchRequest(request: js.Array[SearchFilter], replyCallback: MediaControllerSearchRequestReplyCallback): Unit = js.native
  def sendSearchRequest(
    request: js.Array[SearchFilter],
    replyCallback: MediaControllerSearchRequestReplyCallback,
    errorCallback: ErrorCallback
  ): Unit = js.native
  
  /**
    * Allows to change shuffle mode of media controller server.
    *
    * @param mode Shuffle mode.
    * @param successCallback The method to invoke when shuffle mode was changed.
    * @param errorCallback The method to invoke on operation failure.
    *
    * @throws WebAPIException with error type TypeMismatchError, if any input parameter is not compatible with the expected type for that parameter.
    * @throws WebAPIException with error type UnknownError, if any other error occurs.
    */
  def sendShuffleMode(mode: Boolean): Unit = js.native
  def sendShuffleMode(mode: Boolean, successCallback: Null, errorCallback: ErrorCallback): Unit = js.native
  def sendShuffleMode(mode: Boolean, successCallback: Unit, errorCallback: ErrorCallback): Unit = js.native
  def sendShuffleMode(mode: Boolean, successCallback: SuccessCallback): Unit = js.native
  def sendShuffleMode(mode: Boolean, successCallback: SuccessCallback, errorCallback: ErrorCallback): Unit = js.native
  
  /**
    * State of the media controller server.
    */
  val state: MediaControllerServerState = js.native
  
  /**
    * Object representing features related to subtitles control of a media controller server.
    *
    * @since 5.5
    */
  val subtitles: MediaControllerSubtitlesInfo = js.native
}
