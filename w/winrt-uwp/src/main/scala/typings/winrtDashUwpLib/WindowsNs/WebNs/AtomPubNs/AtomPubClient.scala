package typings
package winrtDashUwpLib.WindowsNs.WebNs.AtomPubNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Encapsulates the methods needed to implement the AtomPub protocol which enables HTTP CRUD access to Web resources using the Atom 1.0 wire format. */
@JSGlobal("Windows.Web.AtomPub.AtomPubClient")
@js.native
class AtomPubClient () extends js.Object {
  /**
                   * Creates a new AtomPubClient object with the credential to use when making requests to the server. Initially, a 'username/password' tuple. However, for domain credentials, the username must be in 'domain\\user form'.
                   * @param serverCredential The specified security credentials.
                   */
  def this(serverCredential: winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.PasswordCredential) = this()
  /** Gets or sets a Boolean value that specifies whether to bypass the cache when retrieving the feed. */
  var bypassCacheOnRetrieve: scala.Boolean = js.native
  /** Gets or sets the maximum number of bytes to buffer when receiving a response from a server. */
  var maxResponseBufferSize: scala.Double = js.native
  /** Gets or sets the credentials to use when making requests via a proxy. */
  var proxyCredential: winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.PasswordCredential = js.native
  /** Gets or sets the credentials to use when making requests to the server. */
  var serverCredential: winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.PasswordCredential = js.native
  /** Gets or sets the maximum amount of time, in milliseconds, to wait for any of the asynchronous operations to complete. If the operation is not complete within this amount of time, it will fail with a status code indicating that it timed out. */
  var timeout: scala.Double = js.native
  /** Cancels any in-progress asynchronous operations, causing them to fail (asynchronously) with an error code indicating cancellation. */
  def cancelAsyncOperations(): scala.Unit = js.native
  /**
                   * Creates a new media resource in the specified collection.
                   * @param uri The URI of the specified collection in which the new resource should be created.
                   * @param mediaType The type for the media resource.
                   * @param description The description of the new resource that is turned into the Slug: header of the POST request.
                   * @param mediaStream Specifies the IInputStream to use as the media resource.
                   * @return The object that is used to create the resource asynchronously and to report the progress and completion status of the operation.
                   */
  def createMediaResourceAsync(
    uri: winrtDashUwpLib.WindowsNs.FoundationNs.Uri,
    mediaType: java.lang.String,
    description: java.lang.String,
    mediaStream: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IInputStream
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperationWithProgress[
    winrtDashUwpLib.WindowsNs.WebNs.SyndicationNs.SyndicationItem, 
    winrtDashUwpLib.WindowsNs.WebNs.SyndicationNs.TransferProgress
  ] = js.native
  /**
                   * Creates a new Entry resource in the specified collection. The Uri of the collection in which to create the new resource can be discovered from the ResourceCollection object retrieved from the RetrieveResourceAsync method.
                   * @param uri The Uri of the specified collection in which the new resource should be created.
                   * @param description The description of the new resource that is turned into the Slug: header of the POST request.
                   * @param item The new resource to be created.
                   * @return The object that is used to create the resource asynchronously and to report the progress and completion status of the operation.
                   */
  def createResourceAsync(
    uri: winrtDashUwpLib.WindowsNs.FoundationNs.Uri,
    description: java.lang.String,
    item: winrtDashUwpLib.WindowsNs.WebNs.SyndicationNs.SyndicationItem
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperationWithProgress[
    winrtDashUwpLib.WindowsNs.WebNs.SyndicationNs.SyndicationItem, 
    winrtDashUwpLib.WindowsNs.WebNs.SyndicationNs.TransferProgress
  ] = js.native
  /**
                   * Deletes an existing Entry or Media Link resource.
                   * @param uri The Uri of the resource to be deleted.
                   * @return The object that is used to delete the resource asynchronously and to report the progress and completion status of the operation.
                   */
  def deleteResourceAsync(uri: winrtDashUwpLib.WindowsNs.FoundationNs.Uri): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncActionWithProgress[winrtDashUwpLib.WindowsNs.WebNs.SyndicationNs.TransferProgress] = js.native
  /**
                   * Deletes an existing Entry or Media Link resource. This differs from the DeleteResourceAsync method in that the SyndicationItem object that represents the resource to be deleted is specified instead of the Uri. The DeleteResourceItemAsync method uses the EditUri property of the specified SyndicationItem as the Uri of the resource to be deleted.
                   * @param item The resource to be deleted.
                   * @return The object that is used to delete the resource asynchronously and to report the progress and completion status of the operation.
                   */
  def deleteResourceItemAsync(item: winrtDashUwpLib.WindowsNs.WebNs.SyndicationNs.SyndicationItem): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncActionWithProgress[winrtDashUwpLib.WindowsNs.WebNs.SyndicationNs.TransferProgress] = js.native
  /**
                   * Starts an asynchronous operation to download the syndication feed from the given URI. This method instantiates a SyndicationFeed object from the feed string, which can be in one of the formats specified in SyndicationFormat .
                   * @param uri The URI from which the feed is downloaded.
                   * @return Contains the results of the operation.
                   */
  def retrieveFeedAsync(uri: winrtDashUwpLib.WindowsNs.FoundationNs.Uri): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperationWithProgress[
    winrtDashUwpLib.WindowsNs.WebNs.SyndicationNs.SyndicationFeed, 
    winrtDashUwpLib.WindowsNs.WebNs.SyndicationNs.RetrievalProgress
  ] = js.native
  /**
                   * Retrieves a media link resource from the specified Uniform Resource Identifier (URI).
                   * @param uri The URI for the media resource.
                   * @return The object used to retrieve the media resource and report the progress and completion status of the operation.
                   */
  def retrieveMediaResourceAsync(uri: winrtDashUwpLib.WindowsNs.FoundationNs.Uri): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperationWithProgress[
    winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IInputStream, 
    winrtDashUwpLib.WindowsNs.WebNs.SyndicationNs.RetrievalProgress
  ] = js.native
  /**
                   * Retrieves an Entry resource or Media Link resource from the specified Uniform Resource Identifier (URI).
                   * @param uri The specified URI.
                   * @return The object that is used to retrieve the resource asynchronously and to report the progress and completion status of the operation.
                   */
  def retrieveResourceAsync(uri: winrtDashUwpLib.WindowsNs.FoundationNs.Uri): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperationWithProgress[
    winrtDashUwpLib.WindowsNs.WebNs.SyndicationNs.SyndicationItem, 
    winrtDashUwpLib.WindowsNs.WebNs.SyndicationNs.RetrievalProgress
  ] = js.native
  /**
                   * Retrieves a service document from the specified Uri.
                   * @param uri The specified Uri.
                   * @return The object that is used to retrieve the service document asynchronously and to report the progress and completion status of the operation.
                   */
  def retrieveServiceDocumentAsync(uri: winrtDashUwpLib.WindowsNs.FoundationNs.Uri): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperationWithProgress[ServiceDocument, winrtDashUwpLib.WindowsNs.WebNs.SyndicationNs.RetrievalProgress] = js.native
  /**
                   * Sets an HTTP header for the request. This method can be called multiple times to set multiple headers. When the same header is set multiple times, the values will be concatenated and separated by ",".
                   * @param name The name of the header.
                   * @param value The value of the header.
                   */
  def setRequestHeader(name: java.lang.String, value: java.lang.String): scala.Unit = js.native
  /**
                   * Updates a media link resource from the specified Uniform Resource Identifier (URI).
                   * @param uri The URI of the resource to be updated.
                   * @param mediaType The media type of the resource.
                   * @param mediaStream The IInputStream of the media that is updating the media resource.
                   * @return Completion status or error codes.
                   */
  def updateMediaResourceAsync(
    uri: winrtDashUwpLib.WindowsNs.FoundationNs.Uri,
    mediaType: java.lang.String,
    mediaStream: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IInputStream
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncActionWithProgress[winrtDashUwpLib.WindowsNs.WebNs.SyndicationNs.TransferProgress] = js.native
  /**
                   * Updates an existing Entry or Media Link resource. If an ETag: header has previously been seen while retrieving this resource (in a response to RetrieveResourceAsync , CreateResourceAsync or a previous call to UpdateResourceAsync), this method automatically sends an If-Match: header with the remembered value.
                   * @param uri The URI of the resource to be updated.
                   * @param item The resource to be updated.
                   * @return The object that is used to update the resource asynchronously and to report the progress and completion status of the operation.
                   */
  def updateResourceAsync(
    uri: winrtDashUwpLib.WindowsNs.FoundationNs.Uri,
    item: winrtDashUwpLib.WindowsNs.WebNs.SyndicationNs.SyndicationItem
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncActionWithProgress[winrtDashUwpLib.WindowsNs.WebNs.SyndicationNs.TransferProgress] = js.native
  /**
                   * Updates an existing Entry or Media Link resource. This differs from the UpdateResourceAsync method in that the EditUri property of the specified SyndicationItem object is used as the Uri of the resource to be updated.
                   * @param item The resource to be updated.
                   * @return The object that is used to update the resource asynchronously and to report the progress and completion status of the operation.
                   */
  def updateResourceItemAsync(item: winrtDashUwpLib.WindowsNs.WebNs.SyndicationNs.SyndicationItem): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncActionWithProgress[winrtDashUwpLib.WindowsNs.WebNs.SyndicationNs.TransferProgress] = js.native
}

