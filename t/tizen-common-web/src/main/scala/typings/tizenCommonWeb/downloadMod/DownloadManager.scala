package typings.tizenCommonWeb.downloadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DownloadManager extends js.Object {
  
  /**
    * Abandons a download operation that is specified by the `downloadId` parameter.
    * The abandoned download operation cannot be resumed later with the `resume()` method.
    * Trying to resume this download operation will result in `InvalidValuesError` exception.
    * Calling the `pause()` method or the `cancel()` method with this `downloadId` will also result in `InvalidValuesError` exception.
    * All resources needed by download operation are freed.
    *
    * @since 5.5
    *
    * @param downloadId The ID of the ongoing download operation to abandon.
    *
    * @throw WebAPIException InvalidValuesError, UnknownError
    *
    */
  def abandon(downloadId: Double): Unit = js.native
  
  /**
    * Cancels an ongoing download operation that is specified by the `downloadId` parameter.
    * The abandoned download operation cannot be canceled and trying to do so will result in InvalidValuesError exception.
    *
    *
    * @param downloadId The ID of the ongoing download operation to stop.
    *
    * @throw WebAPIException InvalidValuesError, UnknownError
    *
    */
  def cancel(downloadId: Double): Unit = js.native
  
  /**
    * Gets the DownloadRequest object from a given ID.
    *
    *
    * @param downloadId The ID to get the download request information.
    *
    * @returns The download request information of the given ID.
    *
    * @throw WebAPIException NotFoundError, TypeMismatchError, InvalidValuesError, UnknownError
    *
    */
  def getDownloadRequest(downloadId: Double): DownloadRequest = js.native
  
  /**
    * Gets the MIME type of the downloaded file.
    *
    *
    * @remark This function returns a valid MIME type when the download operation has been started
    *         and successfully retrieves the file header.
    *
    * @param downloadId The ID to get the MIME type information.
    *
    * @returns The MIME type of the downloaded file.
    *
    * @throw WebAPIException NotFoundError, TypeMismatchError, InvalidValuesError, UnknownError
    *
    */
  def getMIMEType(downloadId: Double): String = js.native
  
  /**
    * Gets the download state of an operation synchronously with the specified ID.
    *
    *
    * @param downloadId The ID to get the current state of the download operation.
    *
    * @returns The current download state of the specified ID.
    *
    * @throw WebAPIException NotFoundError, TypeMismatchError, InvalidValuesError, UnknownError
    *
    */
  def getState(downloadId: Double): DownloadState = js.native
  
  /**
    * Pauses an ongoing download operation that is specified by the `downloadId` parameter.
    * The paused download operation can be resumed later by the `resume()` method.
    *
    * The abandoned download operation cannot be paused and trying to do so will result in InvalidValuesError exception.
    *
    *
    * @param downloadId The ID of the ongoing download operation to pause.
    *
    * @throw WebAPIException InvalidValuesError, UnknownError
    *
    */
  def pause(downloadId: Double): Unit = js.native
  
  /**
    * Resumes a paused download operation that is specified by the `downloadId` parameter.
    *
    * The abandoned download operation cannot be resumed and trying to do so will result in InvalidValuesError exception.
    * Resuming operation that is queued, completed or currently in progress will have no effect.
    *
    *
    * @param downloadId The ID of the paused download operation to resume.
    *
    * @throw WebAPIException InvalidValuesError, UnknownError
    *
    */
  def resume(downloadId: Double): Unit = js.native
  
  /**
    * Sets the download callback to the download operation of the given ID.
    * It's possible to change or register the listener of the download operation using the saved ID.
    *
    *
    * @param downloadId The ID to set the download callback.
    * @param downloadCallback The method to invoke when the download state changes or an error occurs.
    *
    * @throw WebAPIException NotFoundError, TypeMismatchError, InvalidValuesError, UnknownError
    *
    */
  def setListener(downloadId: Double, downloadCallback: DownloadCallback): Unit = js.native
  
  /**
    * Starts a download operation with the specified URL information.
    *
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/download
    *
    * @remark To check if ***CELLULAR*** type is supported, use ***tizen.systeminfo.getCapability("http://tizen.org/feature/network.telephony")***
    * @remark To check if ***WIFI*** type is supported, use ***tizen.systeminfo.getCapability("http://tizen.org/feature/network.wifi")***
    *
    * @param downloadRequest The URL and destination information of the object to download.
    * @param downloadCallback The method to invoke when the download state changes or an error occurs.
    *
    * @returns An identifier for each download operation.
    *   If the network is not available for downloading, the return value is -1 since Tizen 2.3.
    *
    * @throw WebAPIException TypeMismatchError, NotSupportedError, InvalidValuesError, SecurityError, UnknownError
    *
    */
  def start(downloadRequest: DownloadRequest): Double = js.native
  def start(downloadRequest: DownloadRequest, downloadCallback: DownloadCallback): Double = js.native
}
