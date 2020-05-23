package typings.winrtUwp.Windows.Web.AtomPub

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncActionWithProgress
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import typings.winrtUwp.Windows.Foundation.Uri
import typings.winrtUwp.Windows.Security.Credentials.PasswordCredential
import typings.winrtUwp.Windows.Storage.Streams.IInputStream
import typings.winrtUwp.Windows.Web.Syndication.RetrievalProgress
import typings.winrtUwp.Windows.Web.Syndication.SyndicationFeed
import typings.winrtUwp.Windows.Web.Syndication.SyndicationItem
import typings.winrtUwp.Windows.Web.Syndication.TransferProgress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Encapsulates the methods needed to implement the AtomPub protocol which enables HTTP CRUD access to Web resources using the Atom 1.0 wire format. */
trait AtomPubClient extends js.Object {
  /** Gets or sets a Boolean value that specifies whether to bypass the cache when retrieving the feed. */
  var bypassCacheOnRetrieve: Boolean
  /** Gets or sets the maximum number of bytes to buffer when receiving a response from a server. */
  var maxResponseBufferSize: Double
  /** Gets or sets the credentials to use when making requests via a proxy. */
  var proxyCredential: PasswordCredential
  /** Gets or sets the credentials to use when making requests to the server. */
  var serverCredential: PasswordCredential
  /** Gets or sets the maximum amount of time, in milliseconds, to wait for any of the asynchronous operations to complete. If the operation is not complete within this amount of time, it will fail with a status code indicating that it timed out. */
  var timeout: Double
  /** Cancels any in-progress asynchronous operations, causing them to fail (asynchronously) with an error code indicating cancellation. */
  def cancelAsyncOperations(): Unit
  /**
    * Creates a new media resource in the specified collection.
    * @param uri The URI of the specified collection in which the new resource should be created.
    * @param mediaType The type for the media resource.
    * @param description The description of the new resource that is turned into the Slug: header of the POST request.
    * @param mediaStream Specifies the IInputStream to use as the media resource.
    * @return The object that is used to create the resource asynchronously and to report the progress and completion status of the operation.
    */
  def createMediaResourceAsync(uri: Uri, mediaType: String, description: String, mediaStream: IInputStream): IPromiseWithIAsyncOperationWithProgress[SyndicationItem, TransferProgress]
  /**
    * Creates a new Entry resource in the specified collection. The Uri of the collection in which to create the new resource can be discovered from the ResourceCollection object retrieved from the RetrieveResourceAsync method.
    * @param uri The Uri of the specified collection in which the new resource should be created.
    * @param description The description of the new resource that is turned into the Slug: header of the POST request.
    * @param item The new resource to be created.
    * @return The object that is used to create the resource asynchronously and to report the progress and completion status of the operation.
    */
  def createResourceAsync(uri: Uri, description: String, item: SyndicationItem): IPromiseWithIAsyncOperationWithProgress[SyndicationItem, TransferProgress]
  /**
    * Deletes an existing Entry or Media Link resource.
    * @param uri The Uri of the resource to be deleted.
    * @return The object that is used to delete the resource asynchronously and to report the progress and completion status of the operation.
    */
  def deleteResourceAsync(uri: Uri): IPromiseWithIAsyncActionWithProgress[TransferProgress]
  /**
    * Deletes an existing Entry or Media Link resource. This differs from the DeleteResourceAsync method in that the SyndicationItem object that represents the resource to be deleted is specified instead of the Uri. The DeleteResourceItemAsync method uses the EditUri property of the specified SyndicationItem as the Uri of the resource to be deleted.
    * @param item The resource to be deleted.
    * @return The object that is used to delete the resource asynchronously and to report the progress and completion status of the operation.
    */
  def deleteResourceItemAsync(item: SyndicationItem): IPromiseWithIAsyncActionWithProgress[TransferProgress]
  /**
    * Starts an asynchronous operation to download the syndication feed from the given URI. This method instantiates a SyndicationFeed object from the feed string, which can be in one of the formats specified in SyndicationFormat .
    * @param uri The URI from which the feed is downloaded.
    * @return Contains the results of the operation.
    */
  def retrieveFeedAsync(uri: Uri): IPromiseWithIAsyncOperationWithProgress[SyndicationFeed, RetrievalProgress]
  /**
    * Retrieves a media link resource from the specified Uniform Resource Identifier (URI).
    * @param uri The URI for the media resource.
    * @return The object used to retrieve the media resource and report the progress and completion status of the operation.
    */
  def retrieveMediaResourceAsync(uri: Uri): IPromiseWithIAsyncOperationWithProgress[IInputStream, RetrievalProgress]
  /**
    * Retrieves an Entry resource or Media Link resource from the specified Uniform Resource Identifier (URI).
    * @param uri The specified URI.
    * @return The object that is used to retrieve the resource asynchronously and to report the progress and completion status of the operation.
    */
  def retrieveResourceAsync(uri: Uri): IPromiseWithIAsyncOperationWithProgress[SyndicationItem, RetrievalProgress]
  /**
    * Retrieves a service document from the specified Uri.
    * @param uri The specified Uri.
    * @return The object that is used to retrieve the service document asynchronously and to report the progress and completion status of the operation.
    */
  def retrieveServiceDocumentAsync(uri: Uri): IPromiseWithIAsyncOperationWithProgress[ServiceDocument, RetrievalProgress]
  /**
    * Sets an HTTP header for the request. This method can be called multiple times to set multiple headers. When the same header is set multiple times, the values will be concatenated and separated by ",".
    * @param name The name of the header.
    * @param value The value of the header.
    */
  def setRequestHeader(name: String, value: String): Unit
  /**
    * Updates a media link resource from the specified Uniform Resource Identifier (URI).
    * @param uri The URI of the resource to be updated.
    * @param mediaType The media type of the resource.
    * @param mediaStream The IInputStream of the media that is updating the media resource.
    * @return Completion status or error codes.
    */
  def updateMediaResourceAsync(uri: Uri, mediaType: String, mediaStream: IInputStream): IPromiseWithIAsyncActionWithProgress[TransferProgress]
  /**
    * Updates an existing Entry or Media Link resource. If an ETag: header has previously been seen while retrieving this resource (in a response to RetrieveResourceAsync , CreateResourceAsync or a previous call to UpdateResourceAsync), this method automatically sends an If-Match: header with the remembered value.
    * @param uri The URI of the resource to be updated.
    * @param item The resource to be updated.
    * @return The object that is used to update the resource asynchronously and to report the progress and completion status of the operation.
    */
  def updateResourceAsync(uri: Uri, item: SyndicationItem): IPromiseWithIAsyncActionWithProgress[TransferProgress]
  /**
    * Updates an existing Entry or Media Link resource. This differs from the UpdateResourceAsync method in that the EditUri property of the specified SyndicationItem object is used as the Uri of the resource to be updated.
    * @param item The resource to be updated.
    * @return The object that is used to update the resource asynchronously and to report the progress and completion status of the operation.
    */
  def updateResourceItemAsync(item: SyndicationItem): IPromiseWithIAsyncActionWithProgress[TransferProgress]
}

object AtomPubClient {
  @scala.inline
  def apply(
    bypassCacheOnRetrieve: Boolean,
    cancelAsyncOperations: () => Unit,
    createMediaResourceAsync: (Uri, String, String, IInputStream) => IPromiseWithIAsyncOperationWithProgress[SyndicationItem, TransferProgress],
    createResourceAsync: (Uri, String, SyndicationItem) => IPromiseWithIAsyncOperationWithProgress[SyndicationItem, TransferProgress],
    deleteResourceAsync: Uri => IPromiseWithIAsyncActionWithProgress[TransferProgress],
    deleteResourceItemAsync: SyndicationItem => IPromiseWithIAsyncActionWithProgress[TransferProgress],
    maxResponseBufferSize: Double,
    proxyCredential: PasswordCredential,
    retrieveFeedAsync: Uri => IPromiseWithIAsyncOperationWithProgress[SyndicationFeed, RetrievalProgress],
    retrieveMediaResourceAsync: Uri => IPromiseWithIAsyncOperationWithProgress[IInputStream, RetrievalProgress],
    retrieveResourceAsync: Uri => IPromiseWithIAsyncOperationWithProgress[SyndicationItem, RetrievalProgress],
    retrieveServiceDocumentAsync: Uri => IPromiseWithIAsyncOperationWithProgress[ServiceDocument, RetrievalProgress],
    serverCredential: PasswordCredential,
    setRequestHeader: (String, String) => Unit,
    timeout: Double,
    updateMediaResourceAsync: (Uri, String, IInputStream) => IPromiseWithIAsyncActionWithProgress[TransferProgress],
    updateResourceAsync: (Uri, SyndicationItem) => IPromiseWithIAsyncActionWithProgress[TransferProgress],
    updateResourceItemAsync: SyndicationItem => IPromiseWithIAsyncActionWithProgress[TransferProgress]
  ): AtomPubClient = {
    val __obj = js.Dynamic.literal(bypassCacheOnRetrieve = bypassCacheOnRetrieve.asInstanceOf[js.Any], cancelAsyncOperations = js.Any.fromFunction0(cancelAsyncOperations), createMediaResourceAsync = js.Any.fromFunction4(createMediaResourceAsync), createResourceAsync = js.Any.fromFunction3(createResourceAsync), deleteResourceAsync = js.Any.fromFunction1(deleteResourceAsync), deleteResourceItemAsync = js.Any.fromFunction1(deleteResourceItemAsync), maxResponseBufferSize = maxResponseBufferSize.asInstanceOf[js.Any], proxyCredential = proxyCredential.asInstanceOf[js.Any], retrieveFeedAsync = js.Any.fromFunction1(retrieveFeedAsync), retrieveMediaResourceAsync = js.Any.fromFunction1(retrieveMediaResourceAsync), retrieveResourceAsync = js.Any.fromFunction1(retrieveResourceAsync), retrieveServiceDocumentAsync = js.Any.fromFunction1(retrieveServiceDocumentAsync), serverCredential = serverCredential.asInstanceOf[js.Any], setRequestHeader = js.Any.fromFunction2(setRequestHeader), timeout = timeout.asInstanceOf[js.Any], updateMediaResourceAsync = js.Any.fromFunction3(updateMediaResourceAsync), updateResourceAsync = js.Any.fromFunction2(updateResourceAsync), updateResourceItemAsync = js.Any.fromFunction1(updateResourceItemAsync))
    __obj.asInstanceOf[AtomPubClient]
  }
}

