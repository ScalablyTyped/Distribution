package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DownloadManager extends StObject {
  
  /**
    * Abandons a download operation that is specified by the _downloadId_ parameter.
    * The abandoned download operation cannot be resumed later with the _resume()_ method.
    * Trying to resume this download operation will result in _InvalidValuesError_ exception.
    * Calling the _pause()_ method or the _cancel()_ method with this _downloadId_ will also result in _InvalidValuesError_ exception.
    * All resources needed by download operation are freed.
    *
    * @since 5.5
    *
    * @param downloadId The ID of the ongoing download operation to abandon.
    *
    * @throws WebAPIException with error type InvalidValuesError, if any of the input parameters contain an invalid value.
    * @throws WebAPIException with error type UnknownError, if any other error occurs.
    */
  def abandon(downloadId: Double): Unit = js.native
  
  /**
    * Cancels an ongoing download operation that is specified by the _downloadId_ parameter.
    * The abandoned download operation cannot be canceled and trying to do so will result in InvalidValuesError exception.
    *
    * @param downloadId The ID of the ongoing download operation to stop.
    *
    * @throws WebAPIException with error type InvalidValuesError, if any of the input parameters contain an invalid value.
    * @throws WebAPIException with error type UnknownError, if any other error occurs.
    */
  def cancel(downloadId: Double): Unit = js.native
  
  /**
    * Gets the DownloadRequest object from a given ID.
    *
    * @param downloadId The ID to get the download request information.
    *
    * @returns The download request information of the given ID.
    *
    * @throws WebAPIException with error type NotFoundError, if the identifier does not match
    * any download operation in progress.
    * @throws WebAPIException with error type TypeMismatchError, if the input parameter is not
    * compatible with the expected type for that parameter.
    * @throws WebAPIException with error type InvalidValuesError, if any of the input
    * parameters contain an invalid value.
    * @throws WebAPIException with error type UnknownError, in any other error case.
    */
  def getDownloadRequest(downloadId: Double): DownloadRequest = js.native
  
  /**
    * Gets the MIME type of the downloaded file.
    *
    * @remark This function returns a valid MIME type when the download operation has been started
    * and successfully retrieves the file header.
    *
    * @param downloadId The ID to get the MIME type information.
    *
    * @returns The MIME type of the downloaded file.
    *
    * @throws WebAPIException with error type NotFoundError, if the identifier does not match
    * any download operation in progress.
    * @throws WebAPIException with error type TypeMismatchError, if the input parameter is not
    * compatible with the expected type for that parameter.
    * @throws WebAPIException with error type InvalidValuesError, if any of the input
    * parameters contain an invalid value.
    * @throws WebAPIException with error type UnknownError, in any other error case.
    */
  def getMIMEType(downloadId: Double): String = js.native
  
  /**
    * Gets the download state of an operation synchronously with the specified ID.
    *
    * @param downloadId The ID to get the current state of the download operation.
    *
    * @returns The current download state of the specified ID.
    *
    * @throws WebAPIException with error type NotFoundError, if the identifier does not match any download operation in progress.
    * @throws WebAPIException with error type TypeMismatchError, if the input parameter is not compatible with the expected type for that parameter.
    * @throws WebAPIException with error type InvalidValuesError, if any of the input parameters contain an invalid value.
    * @throws WebAPIException with error type UnknownError, if any other error occurs.
    */
  def getState(downloadId: Double): DownloadState = js.native
  
  /**
    * Pauses an ongoing download operation that is specified by the _downloadId_ parameter.
    * The paused download operation can be resumed later by the _resume()_ method.
    *
    * The abandoned download operation cannot be paused and trying to do so will result in InvalidValuesError exception.
    *
    * @param downloadId The ID of the ongoing download operation to pause.
    *
    * @throws WebAPIException with error type InvalidValuesError, if any of the input parameters contain an invalid value.
    * @throws WebAPIException with error type UnknownError, if any other error occurs.
    */
  def pause(downloadId: Double): Unit = js.native
  
  /**
    * Resumes a paused download operation that is specified by the _downloadId_ parameter.
    *
    * The abandoned download operation cannot be resumed and trying to do so will result in InvalidValuesError exception.
    * Resuming operation that is queued, completed or currently in progress will have no effect.
    *
    * @param downloadId The ID of the paused download operation to resume.
    *
    * @throws WebAPIException with error type InvalidValuesError, if any of the input parameters contain an invalid value or in case of an attempt to resume abandoned download operation.
    * @throws WebAPIException with error type UnknownError, if any other error occurs.
    */
  def resume(downloadId: Double): Unit = js.native
  
  /**
    * Sets the download callback to the download operation of the given ID.
    * It's possible to change or register the listener of the download operation using the saved ID.
    *
    * @param downloadId The ID to set the download callback.
    * @param downloadCallback The method to invoke when the download state changes or an error occurs.
    *
    * @throws WebAPIException with error type NotFoundError, if the identifier does not match
    * any download operation in progress.
    * @throws WebAPIException with error type TypeMismatchError, if the input parameter is not
    * compatible with the expected type for that parameter.
    * @throws WebAPIException with error type InvalidValuesError, if any of the input
    * parameters contain an invalid value.
    * @throws WebAPIException with error type UnknownError, in any other error case.
    */
  def setListener(downloadId: Double, downloadCallback: DownloadCallback): Unit = js.native
  
  /**
    * Starts a download operation with the specified URL information.
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/download
    *
    * @remark To check if CELLULAR type is supported, use tizen.systeminfo.getCapability("http://tizen.org/feature/network.telephony")
    * @remark To check if WIFI type is supported, use tizen.systeminfo.getCapability("http://tizen.org/feature/network.wifi")
    *
    * @param downloadRequest The URL and destination information of the object to download.
    * @param downloadCallback The method to invoke when the download state changes or an error occurs.
    *
    * @returns An identifier for each download operation.
    * If the network is not available for downloading, the return value is -1 since Tizen 2.3.
    *
    * @throws WebAPIException with error type TypeMismatchError, if the input parameter is not compatible with the expected type for that parameter.
    * @throws WebAPIException with error type NotSupportedError, if the _networkType_ of the given DownloadRequest is not supported on a device.
    * @throws WebAPIException with error type InvalidValuesError, if any of the input parameters contain an invalid value.
    * @throws WebAPIException with error type SecurityError, if the application does not have the privilege to call this method or the application does not have privilege to access the storage. For more information, see [Storage privileges](#StorageRemark).
    * @throws WebAPIException with error type UnknownError, if any other error occurs.
    */
  def start(downloadRequest: DownloadRequest): Double = js.native
  def start(downloadRequest: DownloadRequest, downloadCallback: DownloadCallback): Double = js.native
}
