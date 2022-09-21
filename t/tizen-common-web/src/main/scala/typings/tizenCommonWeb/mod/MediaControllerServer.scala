package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaControllerServer extends StObject {
  
  /**
    * Abilities of the media controller server.
    *
    * @since 5.5
    */
  val abilities: MediaControllerAbilities = js.native
  
  /**
    * Adds the listener for a media playback info requests from client.
    * See _MediaControllerServerInfo_ to check how to send playback info change
    * requests from client.
    *
    * @param listener Change request listener to add.
    *
    * @returns The identifier used to clear the watch subscription.
    *
    * @throw WebAPIException with error type TypeMismatchError, if any input parameter is not compatible with the expected type for that parameter.
    * @throw WebAPIException with error type UnknownError, if any other error occurs.
    */
  def addChangeRequestPlaybackInfoListener(listener: MediaControllerChangeRequestPlaybackInfoCallback): Double = js.native
  
  /**
    * Adds the listener for receiving custom commands from client.
    * See _MediaControllerServerInfo_ to check how to [send custom commands](#MediaControllerServerInfo::sendCommand) from client.
    *
    * @param listener Custom commands listener to add.
    *
    * @returns The identifier used to clear the watch subscription.
    *
    * @throw WebAPIException with error type TypeMismatchError, if any input parameter is not compatible with the expected type for that parameter.
    * @throw WebAPIException with error type UnknownError, if any other error occurs.
    */
  def addCommandListener(listener: MediaControllerReceiveCommandCallback): Double = js.native
  
  /**
    * Creates _MediaControllerPlaylist_ object.
    *
    * @since 5.5
    *
    * @remark Please note that there is a need to use [savePlaylist()](#MediaControllerServer::savePlaylist), otherwise playlist creation will have no effect on a device. All playlists will be deleted after application is closed.
    *
    * @param name Name of the new playlist.
    *
    * @returns New empty _MediaControllerPlaylist_ object with given name.
    *
    * @throw WebAPIException with error type InvalidValuesError, if playlist with given name already exists.
    * @throw WebAPIException with error type UnknownError, if any other error occurs.
    */
  def createPlaylist(name: String): MediaControllerPlaylist = js.native
  
  /**
    * Deletes playlist from local database.
    *
    * The _errorCallback_ may be triggered for one of the following errors:
    *
    * *   _InvalidValuesError_: if playlist with given name does not exist.
    * *   _UnknownError_: if any other error prevents the function from successful completion.
    *
    *
    * @since 5.5
    *
    * @param playlistName Name of the playlist to remove.
    * @param successCallback Function to be called when _deletePlaylist_ is finished without error.
    * @param errorCallback Function to be called when _deletePlaylist_ fails.
    *
    * @throw WebAPIException with error type TypeMismatchError, if any input parameter is not compatible with the expected type for that parameter.
    * @throw WebAPIException with error type UnknownError, if any other error occurs.
    */
  def deletePlaylist(playlistName: String): Unit = js.native
  def deletePlaylist(playlistName: String, successCallback: Null, errorCallback: ErrorCallback): Unit = js.native
  def deletePlaylist(playlistName: String, successCallback: Unit, errorCallback: ErrorCallback): Unit = js.native
  def deletePlaylist(playlistName: String, successCallback: SuccessCallback): Unit = js.native
  def deletePlaylist(playlistName: String, successCallback: SuccessCallback, errorCallback: ErrorCallback): Unit = js.native
  
  /**
    * Object representing features related to display mode control of a media controller server.
    *
    * @since 5.5
    */
  val displayMode: MediaControllerDisplayMode = js.native
  
  /**
    * Object representing features related to display rotation control of a media controller server.
    *
    * @since 5.5
    */
  val displayRotation: MediaControllerDisplayRotation = js.native
  
  /**
    * Returns all existing clients info.
    *
    * @since 5.5
    *
    * @returns All existing clients info.
    *
    * @throw WebAPIException with error type UnknownError, if any platform error occurs.
    *
    * @remark Code example available at [sendEvent()](#MediaControllerClientInfo::sendEvent) method documentation.
    */
  def getAllClientsInfo(): js.Array[MediaControllerClientInfo] = js.native
  
  /**
    * Retrieves all playlists from a local database.
    *
    * The _errorCallback_ may be triggered for one of the following errors:
    *
    * *   _UnknownError_: if any error prevents function from successful completion.
    *
    *
    * @since 5.5
    *
    * @param successCallback Function to be called on _getAllPlaylists_ success.
    * @param errorCallback Function to be called when _getAllPlaylists_ fails.
    *
    * @throw WebAPIException with error type TypeMismatchError, if any parameter has invalid type.
    * @throw WebAPIException with error type UnknownError, if any other error occurs.
    */
  def getAllPlaylists(successCallback: MediaControllerGetAllPlaylistsSuccessCallback): Unit = js.native
  def getAllPlaylists(successCallback: MediaControllerGetAllPlaylistsSuccessCallback, errorCallback: ErrorCallback): Unit = js.native
  
  /**
    * Server icon URI.
    *
    * @since 5.5
    */
  val iconURI: String | Null = js.native
  
  /**
    * Object representing features related to spherical (360°) mode control of a media controller server.
    *
    * @since 5.5
    */
  val mode360: MediaControllerMode360 = js.native
  
  /**
    * Current playback info.
    *
    * @remark Object holds state which is automatically updated by update methods.
    */
  val playbackInfo: MediaControllerPlaybackInfo = js.native
  
  /**
    * Removes the listener, so stop receiving playback state requests from clients.
    *
    * Calling this function has no effect if there is no listener with given id.
    *
    * @param watchId Subscription identifier.
    *
    * @throw WebAPIException with error type UnknownError, if any error occurs.
    */
  def removeChangeRequestPlaybackInfoListener(watchId: Double): Unit = js.native
  
  /**
    * Removes the listener, so stop receiving custom commands from clients.
    *
    * Calling this function has no effect if there is no listener with given id.
    *
    * @param watchId Subscription identifier.
    *
    * @throw WebAPIException with error type UnknownError, if any error occurs.
    */
  def removeCommandListener(watchId: Double): Unit = js.native
  
  /**
    * Saves the playlist in a local database.
    *
    * The _errorCallback_ may be triggered for one of the following errors:
    *
    * *   _InvalidValuesError_: if playlist with given name does not exist.
    * *   _UnknownError_: if any other error prevents the function from successful completion.
    *
    *
    * @since 5.5
    *
    * @remark All playlists will be deleted after the application is closed.
    *
    * @param playlist _MediaControllerPlaylist_ object to save.
    * @param successCallback Function to be called when _savePlaylist_ is finished without error.
    * @param errorCallback Function to be called when _savePlaylist_ fails.
    *
    * @throw WebAPIException with error type TypeMismatchError, if any input parameter is not compatible with the expected type for that parameter.
    * @throw WebAPIException with error type UnknownError, if any other error occurs.
    */
  def savePlaylist(playlist: MediaControllerPlaylist): Unit = js.native
  def savePlaylist(playlist: MediaControllerPlaylist, successCallback: Null, errorCallback: ErrorCallback): Unit = js.native
  def savePlaylist(playlist: MediaControllerPlaylist, successCallback: Unit, errorCallback: ErrorCallback): Unit = js.native
  def savePlaylist(playlist: MediaControllerPlaylist, successCallback: SuccessCallback): Unit = js.native
  def savePlaylist(playlist: MediaControllerPlaylist, successCallback: SuccessCallback, errorCallback: ErrorCallback): Unit = js.native
  
  /**
    * Sets the listener for receiving search requests from a client.
    *
    * @since 5.5
    *
    * @param listener Function to be called for each search command received.
    *
    * @throw WebAPIException with error type TypeMismatchError, if any of the arguments has invalid type.
    * @throw WebAPIException with error type UnknownError, if any other error occurs.
    */
  def setSearchRequestListener(listener: MediaControllerSearchRequestCallback): Unit = js.native
  
  /**
    * Object representing features related to subtitles control of a media controller server.
    *
    * @since 5.5
    */
  val subtitles: MediaControllerSubtitles = js.native
  
  /**
    * Unsets search request listener.
    *
    * Calling this function has no effect if the listener was not set.
    *
    * @since 5.5
    *
    * @throw WebAPIException with error type UnknownError, if unknown error occurs.
    */
  def unsetSearchRequestListener(): Unit = js.native
  
  /**
    * Updates server icon URI.
    *
    * @since 5.5
    *
    * @param iconURI URI of the icon to be set.
    *
    * @throw WebAPIException with error type UnknownError, if any error occurs.
    */
  def updateIconURI(): Unit = js.native
  def updateIconURI(iconURI: String): Unit = js.native
  
  /**
    * Updates metadata and send notification to the listening clients.
    *
    * @param metadata Metadata object.
    *
    * @throw WebAPIException with error type TypeMismatchError, if any input parameter is not compatible with the expected type for that parameter.
    * @throw WebAPIException with error type UnknownError, if any other error occurs.
    */
  def updateMetadata(metadata: MediaControllerMetadata): Unit = js.native
  
  /**
    * Sets content age rating for current playback item.
    *
    * @since 5.5
    *
    * @param rating New age rating for current playback item.
    *
    * @throw WebAPIException with error type TypeMismatchError, if any input parameter is not compatible with the expected type for that parameter.
    * @throw WebAPIException with error type UnknownError, if any other error occurs.
    */
  def updatePlaybackAgeRating(rating: MediaControllerContentAgeRating): Unit = js.native
  
  /**
    * Sets content type for the current playback item.
    *
    * @since 5.5
    *
    * @param type New content type for the current playback item.
    *
    * @throw WebAPIException with error type TypeMismatchError, if any input parameter is not compatible with the expected type for that parameter.
    * @throw WebAPIException with error type UnknownError, if any other error occurs.
    */
  def updatePlaybackContentType(`type`: MediaControllerContentType): Unit = js.native
  
  /**
    * Sets index and playlist name properties of playback info object.
    *
    * @since 5.5
    *
    * @param playlistName Name of playlist to be set.
    * @param index Index of item on playlist _playlistName_ to be set.
    *
    * @throw WebAPIException with error type UnknownError, if any error occurs.
    */
  def updatePlaybackItem(playlistName: String, index: String): Unit = js.native
  
  /**
    * Updates playback position and send notification to the listening clients.
    *
    * @param position Playback position.
    *
    * @throw WebAPIException with error type InvalidValuesError, if any of the input parameters contain an invalid value.
    * @throw WebAPIException with error type UnknownError, if any other error occurs.
    */
  def updatePlaybackPosition(position: Double): Unit = js.native
  
  /**
    * Updates playback state and send notification to the listening clients.
    * See _MediaControllerServerInfo.addPlaybackInfoChangeListener_ to check
    * how to receive playback info changes from server on client side.
    *
    * @param state Playback state.
    *
    * @throw WebAPIException with error type TypeMismatchError, if any input parameter is not compatible with the expected type for that parameter.
    * @throw WebAPIException with error type UnknownError, if any other error occurs.
    */
  def updatePlaybackState(state: MediaControllerPlaybackState): Unit = js.native
  
  /**
    * Updates repeat mode and send notification to the listening clients.
    *
    * @note _deprecated_ 5.5 Deprecated since 5.5. Instead, use [updateRepeatState](#MediaControllerServer::updateRepeatState).
    *
    * @param mode Repeat mode.
    *
    * @throw WebAPIException with error type UnknownError, if any error occurs.
    */
  def updateRepeatMode(mode: Boolean): Unit = js.native
  
  /**
    * Updates repeat state and sends notification to the listening clients.
    *
    * @since 5.5
    *
    * @param state Repeat state to be set.
    *
    * @throw WebAPIException with error type TypeMismatchError, if any input parameter is not compatible with the expected type for that parameter.
    * @throw WebAPIException with error type UnknownError, if any other error occurs.
    */
  def updateRepeatState(state: MediaControllerRepeatState): Unit = js.native
  
  /**
    * Updates shuffle mode and send notification to the listening clients.
    *
    * @param mode Shuffle mode.
    *
    * @throw WebAPIException with error type UnknownError, if any error occurs.
    */
  def updateShuffleMode(mode: Boolean): Unit = js.native
}
