package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Playlist extends StObject {
  
  /**
    * Adds a content item to a playlist.
    *
    * See code example for the _createPlaylist()_ method.
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/content.write
    *
    * @param item Content to add.
    *
    * @throw WebAPIException with error type TypeMismatchError, if any input parameter is not compatible with the expected type for that parameter.
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    * @throw WebAPIException with error type UnknownError, if any other error occurs.
    */
  def add(item: Content_): Unit = js.native
  
  /**
    * Adds tracks to a playlist as a batch, asynchronously.
    *
    * The errorCallback is launched with these error types:
    *
    * *   UnknownError: In case of any error
    *
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/content.write
    *
    * @param items List of tracks (Content objects) to add.
    * @param successCallback Callback method to be invoked when adding a list of content items to a playlist completes successfully.
    * @param errorCallback Callback method to be invoked when an error occurs.
    *
    * @throw WebAPIException with error type TypeMismatchError, if any input parameter is not compatible with the expected type for that parameter.
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    */
  def addBatch(items: js.Array[Content_]): Unit = js.native
  def addBatch(items: js.Array[Content_], successCallback: Null, errorCallback: ErrorCallback): Unit = js.native
  def addBatch(items: js.Array[Content_], successCallback: Unit, errorCallback: ErrorCallback): Unit = js.native
  def addBatch(items: js.Array[Content_], successCallback: SuccessCallback): Unit = js.native
  def addBatch(items: js.Array[Content_], successCallback: SuccessCallback, errorCallback: ErrorCallback): Unit = js.native
  
  /**
    * Gets playlist items from a playlist.
    *
    * The errorCallback is launched with these error types:
    *
    * *   InvalidValuesError: If any of the input parameters contain an invalid value (e.g _count_ or _offset_ is a negative number)
    * *   UnknownError: In case of any error
    *
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/content.read
    *
    * @param successCallback Callback method to be invoked for a list of tracks in the playlist.
    * @param errorCallback Callback method to be invoked when an error occurs.
    * @param count Number of playlist items to return
    * If the count is not passed, all playlist items are retrieved.
    * @param offset Offset of the track from the beginning of the playlist
    * The default value is 0
    * It means no offset.
    *
    * @throw WebAPIException with error type TypeMismatchError, if any input parameter is not compatible with the expected type for that parameter.
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    */
  def get(successCallback: PlaylistItemArraySuccessCallback): Unit = js.native
  def get(successCallback: PlaylistItemArraySuccessCallback, errorCallback: Null, count: Double): Unit = js.native
  def get(
    successCallback: PlaylistItemArraySuccessCallback,
    errorCallback: Null,
    count: Double,
    offset: Double
  ): Unit = js.native
  def get(
    successCallback: PlaylistItemArraySuccessCallback,
    errorCallback: Null,
    count: Null,
    offset: Double
  ): Unit = js.native
  def get(
    successCallback: PlaylistItemArraySuccessCallback,
    errorCallback: Null,
    count: Unit,
    offset: Double
  ): Unit = js.native
  def get(successCallback: PlaylistItemArraySuccessCallback, errorCallback: Unit, count: Double): Unit = js.native
  def get(
    successCallback: PlaylistItemArraySuccessCallback,
    errorCallback: Unit,
    count: Double,
    offset: Double
  ): Unit = js.native
  def get(
    successCallback: PlaylistItemArraySuccessCallback,
    errorCallback: Unit,
    count: Null,
    offset: Double
  ): Unit = js.native
  def get(
    successCallback: PlaylistItemArraySuccessCallback,
    errorCallback: Unit,
    count: Unit,
    offset: Double
  ): Unit = js.native
  def get(successCallback: PlaylistItemArraySuccessCallback, errorCallback: ErrorCallback): Unit = js.native
  def get(successCallback: PlaylistItemArraySuccessCallback, errorCallback: ErrorCallback, count: Double): Unit = js.native
  def get(
    successCallback: PlaylistItemArraySuccessCallback,
    errorCallback: ErrorCallback,
    count: Double,
    offset: Double
  ): Unit = js.native
  def get(
    successCallback: PlaylistItemArraySuccessCallback,
    errorCallback: ErrorCallback,
    count: Null,
    offset: Double
  ): Unit = js.native
  def get(
    successCallback: PlaylistItemArraySuccessCallback,
    errorCallback: ErrorCallback,
    count: Unit,
    offset: Double
  ): Unit = js.native
  
  /**
    * Identifier of a playlist.
    */
  val id: PlaylistId = js.native
  
  /**
    * Moves the specified item up or down a specified amount in the play order.
    *
    * If current index + delta is:
    *
    * *   < 0 then the item is moved to the first position in the playlist
    * *   ≥ number of tracks then the item is moved to the last position in the playlist
    *
    *
    * The errorCallback is launched with these error types:
    *
    * *   InvalidValuesError: In case the item in the passed _items_ array is not inside this playlist or some item of this playlist is not included in _items_
    * *   UnknownError: In case of any other error
    *
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/content.write
    *
    * @param item Playlist item to move.
    * @param delta How many positions to move the item, negative value means move up, positive means move down.
    * @param successCallback Callback method to be invoked when the playlist item has successfully been moved.
    * @param errorCallback Callback method to be invoked when an error occurs.
    *
    * @throw WebAPIException with error type TypeMismatchError, if any input parameter is not compatible with the expected type for that parameter.
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    */
  def move(item: PlaylistItem, delta: Double): Unit = js.native
  def move(item: PlaylistItem, delta: Double, successCallback: Null, errorCallback: ErrorCallback): Unit = js.native
  def move(item: PlaylistItem, delta: Double, successCallback: Unit, errorCallback: ErrorCallback): Unit = js.native
  def move(item: PlaylistItem, delta: Double, successCallback: SuccessCallback): Unit = js.native
  def move(item: PlaylistItem, delta: Double, successCallback: SuccessCallback, errorCallback: ErrorCallback): Unit = js.native
  
  /**
    * Name of a playlist (case sensitive and unique).
    *
    * When name is set, the change is recorded in the database.
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/content.write
    *
    * @throw WebAPIException with error type InvalidValuesError, when assigning an invalid value (e.g. playlist of the same name already exists).
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to change this attribute.
    */
  var name: String = js.native
  
  /**
    * Number of playlist items in the playlist.
    */
  val numberOfTracks: Double = js.native
  
  /**
    * Removes a track from a playlist.
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/content.write
    *
    * @param item Playlist item to remove.
    *
    * @throw WebAPIException with error type TypeMismatchError, if any input parameter is not compatible with the expected type for that parameter.
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    * @throw WebAPIException with error type UnknownError, if any other error occurs.
    */
  def remove(item: PlaylistItem): Unit = js.native
  
  /**
    * Removes tracks from a playlist as a batch, asynchronously.
    *
    * The errorCallback is launched with these error types:
    *
    * *   UnknownError: In case of any other error
    *
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/content.write
    *
    * @param items List of tracks to remove.
    *
    * @param successCallback Callback method to be invoked when removing a list of content items from a playlist completes successfully.
    * @param errorCallback Callback method to be invoked when an error occurs.
    *
    * @throw WebAPIException with error type TypeMismatchError, if any input parameter is not compatible with the expected type for that parameter.
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    */
  def removeBatch(items: js.Array[PlaylistItem]): Unit = js.native
  def removeBatch(items: js.Array[PlaylistItem], successCallback: Null, errorCallback: ErrorCallback): Unit = js.native
  def removeBatch(items: js.Array[PlaylistItem], successCallback: Unit, errorCallback: ErrorCallback): Unit = js.native
  def removeBatch(items: js.Array[PlaylistItem], successCallback: SuccessCallback): Unit = js.native
  def removeBatch(items: js.Array[PlaylistItem], successCallback: SuccessCallback, errorCallback: ErrorCallback): Unit = js.native
  
  /**
    * Changes the play order of all playlist items in the playlist.
    *
    * The errorCallback is launched with these error types:
    *
    * *   InvalidValuesError: In case the item in the passed _items_ array is not inside this playlist, or the _items_ array does not contain all items from the playlist
    * *   UnknownError: In case of any other error
    *
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/content.write
    *
    * @param items List of playlist items to set in play order
    * This list must include all playlist items of this playlist
    * If not, InvalidValuesError is thrown.
    * @param successCallback Callback method to be invoked when changing the positions of items in the playlist is successfully completed.
    * @param errorCallback Callback method to be invoked when an error occurs.
    *
    * @throw WebAPIException with error type TypeMismatchError, if the input parameter is not compatible with the expected type for that parameter.
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    */
  def setOrder(items: js.Array[PlaylistItem]): Unit = js.native
  def setOrder(items: js.Array[PlaylistItem], successCallback: Null, errorCallback: ErrorCallback): Unit = js.native
  def setOrder(items: js.Array[PlaylistItem], successCallback: Unit, errorCallback: ErrorCallback): Unit = js.native
  def setOrder(items: js.Array[PlaylistItem], successCallback: SuccessCallback): Unit = js.native
  def setOrder(items: js.Array[PlaylistItem], successCallback: SuccessCallback, errorCallback: ErrorCallback): Unit = js.native
  
  /**
    * Thumbnail URI of a playlist.
    *
    * By default, this attribute is set to null.
    * When thumbnailURI is set, the change is recorded in the database.
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/content.write
    *
    * @throw WebAPIException with error type InvalidValuesError, when assigning an invalid value (e.g. if the URI does not start with "file:///").
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to change this attribute or the application does not have privilege to access the storage. For more information, see [Storage privileges](#StorageRemark).
    */
  var thumbnailURI: String | Null = js.native
}
