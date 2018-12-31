package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.BackgroundTransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Used to configure downloads prior to the actual creation of the download operation using CreateDownload . For an overview of Background Transfer capabilities, see Transferring data in the background. Download the Background Transfer sample for examples in JavaScript, C#, and C++. */
@JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundDownloader")
@js.native
/** Creates a new BackgroundDownloader object. */
class BackgroundDownloader () extends js.Object {
  /**
    * Creates a new BackgroundDownloader object with a BackgroundTransferCompletionGroup .
    * @param completionGroup The completion group to associate with this BackgroundDownloader object.
    */
  def this(completionGroup: BackgroundTransferCompletionGroup) = this()
  /** Gets the BackgroundTransferCompletionGroup associated with the BackgroundDownloader . */
  var completionGroup: BackgroundTransferCompletionGroup = js.native
  /** Gets or sets the cost policy for the background download operation. */
  var costPolicy: BackgroundTransferCostPolicy = js.native
  /** Gets or sets the TileNotification used to define the visuals, identification tag, and expiration time of a tile notification used to update the app tile when indicating failure of a download to the user. */
  var failureTileNotification: winrtDashUwpLib.WindowsNs.UINs.NotificationsNs.TileNotification = js.native
  /** Gets or sets the ToastNotification that defines the content, associated metadata, and events used in a toast notification to indicate failure of a download to the user. */
  var failureToastNotification: winrtDashUwpLib.WindowsNs.UINs.NotificationsNs.ToastNotification = js.native
  /** Gets or sets a string value (e.g. a GUID) indicating the group the transfer will belong to. A download operation with a group ID will only appear in operation enumerations using GetCurrentDownloadsAsync(String) with the specific group string value. */
  var group: java.lang.String = js.native
  /** Gets or sets the HTTP method used for the background download. The default method used for download operations is GET. */
  var method: java.lang.String = js.native
  /** Gets or sets the proxy credentials for the background transfer. */
  var proxyCredential: winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.PasswordCredential = js.native
  /** Gets or sets the credentials to use to authenticate with the origin server. */
  var serverCredential: winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.PasswordCredential = js.native
  /** Gets or sets the TileNotification used to define the visuals, identification tag, and expiration time of a tile notification used to update the app tile when indicating success of a download to the user. */
  var successTileNotification: winrtDashUwpLib.WindowsNs.UINs.NotificationsNs.TileNotification = js.native
  /** Gets or sets the ToastNotification that defines the content, associated metadata, and events used in a toast notification to indicate success of a download to the user. */
  var successToastNotification: winrtDashUwpLib.WindowsNs.UINs.NotificationsNs.ToastNotification = js.native
  /** Gets or sets the group that a download operation will belong to. */
  var transferGroup: BackgroundTransferGroup = js.native
  /**
    * Initializes a DownloadOperation object that contains the specified Uri and the file that the response is written to.
    * @param uri The location of the resource.
    * @param resultFile The file that the response will be written to.
    * @return The resultant download operation.
    */
  def createDownload(
    uri: winrtDashUwpLib.WindowsNs.FoundationNs.Uri,
    resultFile: winrtDashUwpLib.WindowsNs.StorageNs.IStorageFile
  ): DownloadOperation = js.native
  /**
    * Initializes a DownloadOperation object with the resource Uri , the file that the response is written to, and the request entity body.
    * @param uri The location of the resource.
    * @param resultFile The file that the response will be written to.
    * @param requestBodyFile A file that represents the request entity body, which contains additional data the server requires before the download can begin. The file this object points to must be valid for the duration of the download.
    * @return The resultant download operation.
    */
  def createDownload(
    uri: winrtDashUwpLib.WindowsNs.FoundationNs.Uri,
    resultFile: winrtDashUwpLib.WindowsNs.StorageNs.IStorageFile,
    requestBodyFile: winrtDashUwpLib.WindowsNs.StorageNs.IStorageFile
  ): DownloadOperation = js.native
  /**
    * Creates an asynchronous download operation that includes a URI, the file that the response will be written to, and the IInputStream object from which the file contents are read.
    * @param uri The location of the resource.
    * @param resultFile Represents the file that the response will be written to.
    * @param requestBodyStream A stream that represents the request entity body.
    * @return The resultant asynchronous download operation.
    */
  def createDownloadAsync(
    uri: winrtDashUwpLib.WindowsNs.FoundationNs.Uri,
    resultFile: winrtDashUwpLib.WindowsNs.StorageNs.IStorageFile,
    requestBodyStream: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IInputStream
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[DownloadOperation] = js.native
  /**
    * Used to set an HTTP request header.
    * @param headerName The header name.
    * @param headerValue The header value.
    */
  def setRequestHeader(headerName: java.lang.String, headerValue: java.lang.String): scala.Unit = js.native
}

/** Used to configure downloads prior to the actual creation of the download operation using CreateDownload . For an overview of Background Transfer capabilities, see Transferring data in the background. Download the Background Transfer sample for examples in JavaScript, C#, and C++. */
@JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundDownloader")
@js.native
object BackgroundDownloader extends js.Object {
  /**
    * Returns a collection of pending downloads that are not associated with a group.
    * @return A collection of pending downloads for the current application instance.
    */
  def getCurrentDownloadsAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[_]] = js.native
  /**
    * Returns a collection of pending downloads for a specific Group .
    * @param group A string indicating a specific group of transfers.
    * @return A collection of pending downloads for the specific group.
    */
  def getCurrentDownloadsAsync(group: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[_]] = js.native
  /**
    * Gets all downloads associated with the provided BackgroundTransferGroup .
    * @param group Contains information used to identify a group of downloads.
    * @return A list of downloads currently associated with the specified group.
    */
  def getCurrentDownloadsForTransferGroupAsync(group: winrtDashUwpLib.WindowsNs.NetworkingNs.BackgroundTransferNs.BackgroundTransferGroup): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[_]] = js.native
  /**
    * Used to request an unconstrained download operation. When this method is called the user is provided with a UI prompt that they can use to indicate their consent for an unconstrained operation.
    * @param operations The download operation to run unconstrained.
    * @return Indicates if the operations will run unconstrained.
    */
  def requestUnconstrainedDownloadsAsync(
    operations: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[winrtDashUwpLib.WindowsNs.NetworkingNs.BackgroundTransferNs.DownloadOperation]
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[
    winrtDashUwpLib.WindowsNs.NetworkingNs.BackgroundTransferNs.UnconstrainedTransferRequestResult
  ] = js.native
}

