package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContentManager extends StObject {
  
  /**
    * Adds a listener which receives notifications when content changes.
    *
    * @since 3.0
    *
    * @param changeCallback Callback to be invoked when a content change is detected.
    * @returns Identifier of the newly added listener.
    *
    * @throw WebAPIException with error type TypeMismatchError, if any input parameter is not compatible with the expected type for that parameter.
    * @throw WebAPIException with error type AbortError, if the operation cannot be finished properly.
    */
  def addChangeListener(changeCallback: ContentChangeCallback): Double = js.native
  
  /**
    * Cancels a scan process of a content directory.
    *
    * When a scan of a given directory is running it may be canceled by this function.
    *
    * @since 2.4
    * @privilegeLevel public
    *
    * @privilegeName http://tizen.org/privilege/content.write
    *
    * @param contentDirURI URI of a content directory with a scan process running which is canceled.
    *
    * @throw WebAPIException with error type InvalidValuesError, if any of the input parameters
    * contain an invalid value (e.g. given _contentDirURI_ is an empty string).
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    * @throw WebAPIException with error type UnknownError, if any other error occurs.
    */
  def cancelScanDirectory(contentDirURI: String): Unit = js.native
  
  /**
    * Creates a new playlist.
    *
    * The errorCallback is launched with these error types:
    *
    * *   InvalidValuesError: If name is empty or is same as the name of an existing playlist
    * *   UnknownError: In case of any other error
    *
    *
    * @since 2.3
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/content.write
    *
    * @param name Name of the new playlist (case sensitive).
    * @param successCallback Callback method to be invoked to provide a created playlist.
    * @param errorCallback Callback method to be invoked when an error occurs.
    * @param sourcePlaylist Optional existing playlist to clone.
    *
    * @throw WebAPIException with error type TypeMismatchError, if any input parameter is not compatible with the expected type for that parameter.
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    */
  def createPlaylist(name: String, successCallback: PlaylistSuccessCallback): Unit = js.native
  def createPlaylist(
    name: String,
    successCallback: PlaylistSuccessCallback,
    errorCallback: Null,
    sourcePlaylist: Playlist
  ): Unit = js.native
  def createPlaylist(
    name: String,
    successCallback: PlaylistSuccessCallback,
    errorCallback: Unit,
    sourcePlaylist: Playlist
  ): Unit = js.native
  def createPlaylist(name: String, successCallback: PlaylistSuccessCallback, errorCallback: ErrorCallback): Unit = js.native
  def createPlaylist(
    name: String,
    successCallback: PlaylistSuccessCallback,
    errorCallback: ErrorCallback,
    sourcePlaylist: Playlist
  ): Unit = js.native
  
  /**
    * Creates a content's thumbnail.
    *
    * The errorCallback is launched with these error types:
    *
    * *   InvalidValuesError: In case of invalid content object.
    * *   AbortError: In case of any error.
    *
    *
    * @since 3.0
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/content.write
    *
    * @param content Content object for which a new thumbnail will be created.
    * @param successCallback Callback method to be invoked when the thumbnail is created.
    * @param errorCallback Callback method to be invoked when an error occurs.
    *
    * @throw WebAPIException with error type TypeMismatchError, if any input parameter is not compatible with the expected type for that parameter.
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    */
  def createThumbnail(content: Content_, successCallback: ThumbnailSuccessCallback): Unit = js.native
  def createThumbnail(content: Content_, successCallback: ThumbnailSuccessCallback, errorCallback: ErrorCallback): Unit = js.native
  
  /**
    * Finds contents that satisfy the conditions set by a filter.
    *
    * This method allows searching based on a supplied filter. For more details on AbstractFilter, see the
    * [Tizen](tizen.html#::Tizen::AbstractFilter) module. The filter allows precise searching such
    * as "return all songs by artist U2, ordered by name".
    *
    * The errorCallback is launched with these error types:
    *
    * *   InvalidValuesError: If any of the input parameters contain an invalid value.
    * *   UnknownError: In any other error case.
    *
    *
    * @privilegeLevel public
    *
    * @privilegeName http://tizen.org/privilege/content.read
    *
    * @remark Attributes available for _Content_ objects filtering are listed in
    * [Data Filtering and Sorting guide](/application/web/guides/data/data-filter#content-filter-attributes).
    *
    * @param successCallback Callback method to be invoked when content has been retrieved.
    * @param errorCallback Callback method to be invoked when an error has occurred.
    * @param directoryId Directory ID that is used to select content to retrieve in a specified directory.
    * @param filter Filter that is used to select content to retrieve.
    * @param sortMode Used to determine the sort order in which the contents are returned.
    * @param count Maximum amount of content to return. If _count_ is negative, InvalidValuesError is reported through the errorCallback.
    * @param offset Offset of the result set. If _offset_ is a negative number, InvalidValuesError is reported through the errorCallback.
    *
    * @throw WebAPIException with error type TypeMismatchError, if the input parameter
    * is not compatible with the expected type for that parameter.
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    */
  def find(
    successCallback: ContentArraySuccessCallback,
    errorCallback: js.UndefOr[ErrorCallback | Null],
    directoryId: js.UndefOr[ContentDirectoryId | Null],
    filter: js.UndefOr[AbstractFilter | Null],
    sortMode: js.UndefOr[SortMode | Null],
    count: js.UndefOr[Double | Null],
    offset: js.UndefOr[Double | Null]
  ): Unit = js.native
  
  /**
    * Gets a list of content directories.
    *
    * This method returns (via callback) a list of content directory objects. To obtain a list of contents
    * in a specific directory, use the find() method with the directory ID.
    *
    * The errorCallback is launched with this error type:
    *
    * *   UnknownError: In any other error case.
    *
    *
    * @param successCallback Callback method to be invoked when content directories have been retrieved successfully.
    * @param errorCallback Callback method to be invoked when an error has occurred.
    *
    * @throw WebAPIException with error type TypeMismatchError, if the input parameter
    * is not compatible with the expected type for that parameter.
    */
  def getDirectories(successCallback: ContentDirectoryArraySuccessCallback): Unit = js.native
  def getDirectories(successCallback: ContentDirectoryArraySuccessCallback, errorCallback: ErrorCallback): Unit = js.native
  
  /**
    * Gets all playlists.
    *
    * The errorCallback is launched with these error types:
    *
    * *   UnknownError: In case of any error
    *
    *
    * @since 2.3
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/content.read
    *
    * @param successCallback Callback method to be invoked when retrieving a list of all playlists completes.
    * @param errorCallback Callback method to be invoked when an error occurs.
    *
    * @throw WebAPIException with error type TypeMismatchError, if any input parameter is not compatible with the expected type for that parameter.
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    */
  def getPlaylists(successCallback: PlaylistArraySuccessCallback): Unit = js.native
  def getPlaylists(successCallback: PlaylistArraySuccessCallback, errorCallback: ErrorCallback): Unit = js.native
  
  /**
    * Removes a listener which receives notifications about content changes.
    *
    * Calling this function has no effect if there is no listener with given id.
    *
    * @since 3.0
    *
    * @param listenerId Identifier of the listener to be removed. It is returned by.
    * [addChangeListener()](./content.html#ContentManager::addChangeListener) when a listener is successfully added.
    *
    * @throw WebAPIException with error type AbortError, if the operation cannot be finished properly.
    */
  def removeChangeListener(listenerId: Double): Unit = js.native
  
  /**
    * Removes a playlist.
    *
    * The errorCallback is launched with these error types:
    *
    * *   UnknownError: In case of any error
    *
    *
    * @since 2.3
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/content.write
    *
    * @param id Identifier of a playlist to remove.
    * @param successCallback Callback method to be invoked when removing a playlist completes.
    * @param errorCallback Callback method to be invoked when an error occurs.
    *
    * @throw WebAPIException with error type TypeMismatchError, if any input parameter is not compatible with the expected type for that parameter.
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    */
  def removePlaylist(id: PlaylistId): Unit = js.native
  def removePlaylist(id: PlaylistId, successCallback: Null, errorCallback: ErrorCallback): Unit = js.native
  def removePlaylist(id: PlaylistId, successCallback: Unit, errorCallback: ErrorCallback): Unit = js.native
  def removePlaylist(id: PlaylistId, successCallback: SuccessCallback): Unit = js.native
  def removePlaylist(id: PlaylistId, successCallback: SuccessCallback, errorCallback: ErrorCallback): Unit = js.native
  
  /**
    * Scans a content directory to create or update content in the content database.
    *
    * When an application creates or updates content in a directory, this method allows
    * to scan it and then insert or update the content in the content database.
    * If a directory must not be scanned, the file _.scan\_ignore_ has to be created in it.
    *
    * The errorCallback is launched with these error types:
    *
    * *   UnknownError: In case of any error detected asynchronously
    *
    *
    * @since 2.4
    * @privilegeLevel public
    *
    * @privilegeName http://tizen.org/privilege/content.write
    *
    * @param contentDirURI URI of a content directory to scan.
    * @param recursive Used to determine whether the function makes recursive scan or not.
    * If set to true, the function makes recursive scan.
    * @param successCallback Callback method to be invoked when scanning has been completed.
    * @param errorCallback Callback method to be invoked when an error has occurred.
    *
    * @throw WebAPIException with error type TypeMismatchError, if any input parameter
    * is not compatible with the expected type for that parameter.
    * @throw WebAPIException with error type InvalidValuesError, if any of the input parameters
    * contain an invalid value (e.g. given _contentDirURI_ is an empty string).
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method or the application does not have privilege to access the storage. For more information, see [Storage privileges](#StorageRemark).
    * @throw WebAPIException with error type UnknownError, if any other error occurs.
    */
  def scanDirectory(contentDirURI: String, recursive: Boolean): Unit = js.native
  def scanDirectory(contentDirURI: String, recursive: Boolean, successCallback: Null, errorCallback: ErrorCallback): Unit = js.native
  def scanDirectory(contentDirURI: String, recursive: Boolean, successCallback: Unit, errorCallback: ErrorCallback): Unit = js.native
  def scanDirectory(contentDirURI: String, recursive: Boolean, successCallback: ContentScanSuccessCallback): Unit = js.native
  def scanDirectory(
    contentDirURI: String,
    recursive: Boolean,
    successCallback: ContentScanSuccessCallback,
    errorCallback: ErrorCallback
  ): Unit = js.native
  
  /**
    * Scans a file to create or update content in the content database.
    *
    * When an application creates or updates content, this method allows to scan it
    * and then insert or update the content in the content database.
    *
    * The errorCallback is launched with these error types:
    *
    * *   UnknownError: In case of any error detected asynchronously
    * *   NotSupportedError: In case of trying to scan content of not supported type (since 4.0)
    *
    *
    * @since 2.1
    * @privilegeLevel public
    *
    * @privilegeName http://tizen.org/privilege/content.write
    *
    * @param contentURI URI of content to scan.
    * @param successCallback Callback method to be invoked when scanning has been completed.
    * @param errorCallback Callback method to be invoked when an error has occurred.
    *
    * @throw WebAPIException with error type TypeMismatchError, if any input parameter
    * is not compatible with the expected type for that parameter.
    * @throw WebAPIException with error type InvalidValuesError, if any of the input parameters
    * contain an invalid value (e.g. given _contentURI_ is an empty string).
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method or the application does not have privilege to access the storage. For more information, see [Storage privileges](#StorageRemark).
    */
  def scanFile(contentURI: String): Unit = js.native
  def scanFile(contentURI: String, successCallback: Null, errorCallback: ErrorCallback): Unit = js.native
  def scanFile(contentURI: String, successCallback: Unit, errorCallback: ErrorCallback): Unit = js.native
  def scanFile(contentURI: String, successCallback: ContentScanSuccessCallback): Unit = js.native
  def scanFile(contentURI: String, successCallback: ContentScanSuccessCallback, errorCallback: ErrorCallback): Unit = js.native
  
  /**
    * Sets a listener to receive notifications of content changes.
    *
    * @note _deprecated_ 3.0 Deprecated since 3.0. Instead, [addChangeListener()](./content.html#ContentManager::addChangeListener) allows application
    * developers to add a listener and get notified when content is added, removed or updated on a device.
    *
    * @since 2.1
    * @privilegeLevel public
    *
    * @privilegeName http://tizen.org/privilege/content.read
    *
    * @param changeCallback A callback to be invoked for receiving a content change notification.
    *
    * @throw WebAPIException with error type TypeMismatchError, if any input parameter is not compatible with the expected type for that parameter.
    * @throw WebAPIException with error type InvalidValuesError, if any of the input parameters contain an invalid value.
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    * @throw WebAPIException with error type UnknownError, if any other error occurs.
    */
  def setChangeListener(changeCallback: ContentChangeCallback): Unit = js.native
  
  /**
    * Unsets the listener to unsubscribe from receiving notifications for content changes.
    *
    * Calling this function has no effect if listener is not set.
    *
    * @note _deprecated_ 3.0 Deprecated since 3.0. Instead, use [removeChangeListener()](./content.html#ContentManager::removeChangeListener).
    *
    * @since 2.1
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/content.read
    *
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    * @throw WebAPIException with error type UnknownError, if any other error occurs.
    */
  def unsetChangeListener(): Unit = js.native
  
  /**
    * Updates attributes of content in the content database synchronously.
    *
    * When an application has changed some attributes of the content, this method allows
    * writing it back to the content database.
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/content.write
    *
    * @remark The _editableAttributes_ in the _Content_ interface indicates
    * the attributes that can be changed.
    * This API does not support updating the metadata of a file.
    *
    * @param content The content to update.
    *
    * @throw WebAPIException with error type TypeMismatchError, if any input parameter
    * is not compatible with the expected type for that parameter.
    * @throw WebAPIException with error type InvalidValuesError, if any of the input parameters
    * contain an invalid value.
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    * @throw WebAPIException with error type UnknownError, in any other error case.
    */
  def update(content: Content_): Unit = js.native
  
  /**
    * Updates a batch of content attributes in the content database asynchronously.
    *
    * When an application has changed any attributes in the array of content, this method allows writing them
    * back to the content database.
    *
    * The errorCallback is launched with these error types:
    *
    * *   InvalidValuesError: If any of the input parameters contain an invalid value.
    * *   UnknownError: In any other error case.
    *
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/content.write
    *
    * @remark The _editableAttributes_ in the _Content_ interface indicates
    * the attributes that can be changed.
    * This API does not support updating the metadata of a file.
    *
    * @param contents Array of content to change.
    * @param successCallback Callback method to be invoked when attributes have been changed.
    * @param errorCallback Callback method to be invoked when an error has occurred.
    *
    * @throw WebAPIException with error type TypeMismatchError, if the input parameter
    * is not compatible with the expected type for that parameter.
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    */
  def updateBatch(contents: js.Array[Content_]): Unit = js.native
  def updateBatch(contents: js.Array[Content_], successCallback: Null, errorCallback: ErrorCallback): Unit = js.native
  def updateBatch(contents: js.Array[Content_], successCallback: Unit, errorCallback: ErrorCallback): Unit = js.native
  def updateBatch(contents: js.Array[Content_], successCallback: SuccessCallback): Unit = js.native
  def updateBatch(contents: js.Array[Content_], successCallback: SuccessCallback, errorCallback: ErrorCallback): Unit = js.native
}
