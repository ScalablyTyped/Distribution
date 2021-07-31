package typings.winrtUwp.Windows.Networking.BackgroundTransfer

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.Uri
import typings.winrtUwp.Windows.Security.Credentials.PasswordCredential
import typings.winrtUwp.Windows.Storage.IStorageFile
import typings.winrtUwp.Windows.Storage.Streams.IInputStream
import typings.winrtUwp.Windows.UI.Notifications.TileNotification
import typings.winrtUwp.Windows.UI.Notifications.ToastNotification
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Used to configure downloads prior to the actual creation of the download operation using CreateDownload . For an overview of Background Transfer capabilities, see Transferring data in the background. Download the Background Transfer sample for examples in JavaScript, C#, and C++. */
@js.native
trait BackgroundDownloader extends StObject {
  
  /** Gets the BackgroundTransferCompletionGroup associated with the BackgroundDownloader . */
  var completionGroup: BackgroundTransferCompletionGroup = js.native
  
  /** Gets or sets the cost policy for the background download operation. */
  var costPolicy: BackgroundTransferCostPolicy = js.native
  
  /**
    * Initializes a DownloadOperation object that contains the specified Uri and the file that the response is written to.
    * @param uri The location of the resource.
    * @param resultFile The file that the response will be written to.
    * @return The resultant download operation.
    */
  def createDownload(uri: Uri, resultFile: IStorageFile): DownloadOperation = js.native
  /**
    * Initializes a DownloadOperation object with the resource Uri , the file that the response is written to, and the request entity body.
    * @param uri The location of the resource.
    * @param resultFile The file that the response will be written to.
    * @param requestBodyFile A file that represents the request entity body, which contains additional data the server requires before the download can begin. The file this object points to must be valid for the duration of the download.
    * @return The resultant download operation.
    */
  def createDownload(uri: Uri, resultFile: IStorageFile, requestBodyFile: IStorageFile): DownloadOperation = js.native
  
  /**
    * Creates an asynchronous download operation that includes a URI, the file that the response will be written to, and the IInputStream object from which the file contents are read.
    * @param uri The location of the resource.
    * @param resultFile Represents the file that the response will be written to.
    * @param requestBodyStream A stream that represents the request entity body.
    * @return The resultant asynchronous download operation.
    */
  def createDownloadAsync(uri: Uri, resultFile: IStorageFile, requestBodyStream: IInputStream): IPromiseWithIAsyncOperation[DownloadOperation] = js.native
  
  /** Gets or sets the TileNotification used to define the visuals, identification tag, and expiration time of a tile notification used to update the app tile when indicating failure of a download to the user. */
  var failureTileNotification: TileNotification = js.native
  
  /** Gets or sets the ToastNotification that defines the content, associated metadata, and events used in a toast notification to indicate failure of a download to the user. */
  var failureToastNotification: ToastNotification = js.native
  
  /** Gets or sets a string value (e.g. a GUID) indicating the group the transfer will belong to. A download operation with a group ID will only appear in operation enumerations using GetCurrentDownloadsAsync(String) with the specific group string value. */
  var group: String = js.native
  
  /** Gets or sets the HTTP method used for the background download. The default method used for download operations is GET. */
  var method: String = js.native
  
  /** Gets or sets the proxy credentials for the background transfer. */
  var proxyCredential: PasswordCredential = js.native
  
  /** Gets or sets the credentials to use to authenticate with the origin server. */
  var serverCredential: PasswordCredential = js.native
  
  /**
    * Used to set an HTTP request header.
    * @param headerName The header name.
    * @param headerValue The header value.
    */
  def setRequestHeader(headerName: String, headerValue: String): Unit = js.native
  
  /** Gets or sets the TileNotification used to define the visuals, identification tag, and expiration time of a tile notification used to update the app tile when indicating success of a download to the user. */
  var successTileNotification: TileNotification = js.native
  
  /** Gets or sets the ToastNotification that defines the content, associated metadata, and events used in a toast notification to indicate success of a download to the user. */
  var successToastNotification: ToastNotification = js.native
  
  /** Gets or sets the group that a download operation will belong to. */
  var transferGroup: BackgroundTransferGroup = js.native
}
