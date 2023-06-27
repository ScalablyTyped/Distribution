package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaControllerPlaylist extends StObject {
  
  /**
    * Adds new item to the playlist.
    *
    * @param index Index for new item, should be unique within playlist.
    * @param metadata Metadata to be associated with new item.
    *
    * @throws WebAPIException with error type TypeMismatchError, if any input parameter is not compatible with the expected type for that parameter.
    * @throws WebAPIException with error type UnknownError, if any other error occurs.
    */
  def addItem(index: String, metadata: MediaControllerMetadataInit): Unit = js.native
  
  /**
    * Gets all items from playlist.
    *
    * @remark Note that getItems() method return only those items from playlist which been saved by [savePlaylist()](#MediaControllerServer::savePlaylist) method.
    *
    * The _errorCallback_ may be triggered for one of the following errors:
    *
    * *   _UnknownError_: if any error prevents function from successful completion.
    *
    *
    * @param successCallback Function to be called when _getItems_ is finished without error.
    * @param errorCallback Function to be called when _getItems_ fails.
    *
    * @throws WebAPIException with error type TypeMismatchError, if any input parameter is not compatible with the expected type for that parameter.
    * @throws WebAPIException with error type UnknownError, if any other error occurs.
    */
  def getItems(successCallback: MediaControllerGetItemsSuccessCallback): Unit = js.native
  def getItems(successCallback: MediaControllerGetItemsSuccessCallback, errorCallback: ErrorCallback): Unit = js.native
  
  /**
    * Name of this playlist.
    */
  val name: String = js.native
}
