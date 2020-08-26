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
@js.native
trait AtomPubClient extends js.Object {
  /** Gets or sets a Boolean value that specifies whether to bypass the cache when retrieving the feed. */
  var bypassCacheOnRetrieve: Boolean = js.native
  /** Gets or sets the maximum number of bytes to buffer when receiving a response from a server. */
  var maxResponseBufferSize: Double = js.native
  /** Gets or sets the credentials to use when making requests via a proxy. */
  var proxyCredential: PasswordCredential = js.native
  /** Gets or sets the credentials to use when making requests to the server. */
  var serverCredential: PasswordCredential = js.native
  /** Gets or sets the maximum amount of time, in milliseconds, to wait for any of the asynchronous operations to complete. If the operation is not complete within this amount of time, it will fail with a status code indicating that it timed out. */
  var timeout: Double = js.native
  /** Cancels any in-progress asynchronous operations, causing them to fail (asynchronously) with an error code indicating cancellation. */
  def cancelAsyncOperations(): Unit = js.native
  /**
    * Creates a new media resource in the specified collection.
    * @param uri The URI of the specified collection in which the new resource should be created.
    * @param mediaType The type for the media resource.
    * @param description The description of the new resource that is turned into the Slug: header of the POST request.
    * @param mediaStream Specifies the IInputStream to use as the media resource.
    * @return The object that is used to create the resource asynchronously and to report the progress and completion status of the operation.
    */
  def createMediaResourceAsync(uri: Uri, mediaType: String, description: String, mediaStream: IInputStream): IPromiseWithIAsyncOperationWithProgress[SyndicationItem, TransferProgress] = js.native
  /**
    * Creates a new Entry resource in the specified collection. The Uri of the collection in which to create the new resource can be discovered from the ResourceCollection object retrieved from the RetrieveResourceAsync method.
    * @param uri The Uri of the specified collection in which the new resource should be created.
    * @param description The description of the new resource that is turned into the Slug: header of the POST request.
    * @param item The new resource to be created.
    * @return The object that is used to create the resource asynchronously and to report the progress and completion status of the operation.
    */
  def createResourceAsync(uri: Uri, description: String, item: SyndicationItem): IPromiseWithIAsyncOperationWithProgress[SyndicationItem, TransferProgress] = js.native
  /**
    * Deletes an existing Entry or Media Link resource.
    * @param uri The Uri of the resource to be deleted.
    * @return The object that is used to delete the resource asynchronously and to report the progress and completion status of the operation.
    */
  def deleteResourceAsync(uri: Uri): IPromiseWithIAsyncActionWithProgress[TransferProgress] = js.native
  /**
    * Deletes an existing Entry or Media Link resource. This differs from the DeleteResourceAsync method in that the SyndicationItem object that represents the resource to be deleted is specified instead of the Uri. The DeleteResourceItemAsync method uses the EditUri property of the specified SyndicationItem as the Uri of the resource to be deleted.
    * @param item The resource to be deleted.
    * @return The object that is used to delete the resource asynchronously and to report the progress and completion status of the operation.
    */
  def deleteResourceItemAsync(item: SyndicationItem): IPromiseWithIAsyncActionWithProgress[TransferProgress] = js.native
  /**
    * Starts an asynchronous operation to download the syndication feed from the given URI. This method instantiates a SyndicationFeed object from the feed string, which can be in one of the formats specified in SyndicationFormat .
    * @param uri The URI from which the feed is downloaded.
    * @return Contains the results of the operation.
    */
  def retrieveFeedAsync(uri: Uri): IPromiseWithIAsyncOperationWithProgress[SyndicationFeed, RetrievalProgress] = js.native
  /**
    * Retrieves a media link resource from the specified Uniform Resource Identifier (URI).
    * @param uri The URI for the media resource.
    * @return The object used to retrieve the media resource and report the progress and completion status of the operation.
    */
  def retrieveMediaResourceAsync(uri: Uri): IPromiseWithIAsyncOperationWithProgress[IInputStream, RetrievalProgress] = js.native
  /**
    * Retrieves an Entry resource or Media Link resource from the specified Uniform Resource Identifier (URI).
    * @param uri The specified URI.
    * @return The object that is used to retrieve the resource asynchronously and to report the progress and completion status of the operation.
    */
  def retrieveResourceAsync(uri: Uri): IPromiseWithIAsyncOperationWithProgress[SyndicationItem, RetrievalProgress] = js.native
  /**
    * Retrieves a service document from the specified Uri.
    * @param uri The specified Uri.
    * @return The object that is used to retrieve the service document asynchronously and to report the progress and completion status of the operation.
    */
  def retrieveServiceDocumentAsync(uri: Uri): IPromiseWithIAsyncOperationWithProgress[ServiceDocument, RetrievalProgress] = js.native
  /**
    * Sets an HTTP header for the request. This method can be called multiple times to set multiple headers. When the same header is set multiple times, the values will be concatenated and separated by ",".
    * @param name The name of the header.
    * @param value The value of the header.
    */
  def setRequestHeader(name: String, value: String): Unit = js.native
  /**
    * Updates a media link resource from the specified Uniform Resource Identifier (URI).
    * @param uri The URI of the resource to be updated.
    * @param mediaType The media type of the resource.
    * @param mediaStream The IInputStream of the media that is updating the media resource.
    * @return Completion status or error codes.
    */
  def updateMediaResourceAsync(uri: Uri, mediaType: String, mediaStream: IInputStream): IPromiseWithIAsyncActionWithProgress[TransferProgress] = js.native
  /**
    * Updates an existing Entry or Media Link resource. If an ETag: header has previously been seen while retrieving this resource (in a response to RetrieveResourceAsync , CreateResourceAsync or a previous call to UpdateResourceAsync), this method automatically sends an If-Match: header with the remembered value.
    * @param uri The URI of the resource to be updated.
    * @param item The resource to be updated.
    * @return The object that is used to update the resource asynchronously and to report the progress and completion status of the operation.
    */
  def updateResourceAsync(uri: Uri, item: SyndicationItem): IPromiseWithIAsyncActionWithProgress[TransferProgress] = js.native
  /**
    * Updates an existing Entry or Media Link resource. This differs from the UpdateResourceAsync method in that the EditUri property of the specified SyndicationItem object is used as the Uri of the resource to be updated.
    * @param item The resource to be updated.
    * @return The object that is used to update the resource asynchronously and to report the progress and completion status of the operation.
    */
  def updateResourceItemAsync(item: SyndicationItem): IPromiseWithIAsyncActionWithProgress[TransferProgress] = js.native
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
  @scala.inline
  implicit class AtomPubClientOps[Self <: AtomPubClient] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBypassCacheOnRetrieve(value: Boolean): Self = this.set("bypassCacheOnRetrieve", value.asInstanceOf[js.Any])
    @scala.inline
    def setCancelAsyncOperations(value: () => Unit): Self = this.set("cancelAsyncOperations", js.Any.fromFunction0(value))
    @scala.inline
    def setCreateMediaResourceAsync(
      value: (Uri, String, String, IInputStream) => IPromiseWithIAsyncOperationWithProgress[SyndicationItem, TransferProgress]
    ): Self = this.set("createMediaResourceAsync", js.Any.fromFunction4(value))
    @scala.inline
    def setCreateResourceAsync(
      value: (Uri, String, SyndicationItem) => IPromiseWithIAsyncOperationWithProgress[SyndicationItem, TransferProgress]
    ): Self = this.set("createResourceAsync", js.Any.fromFunction3(value))
    @scala.inline
    def setDeleteResourceAsync(value: Uri => IPromiseWithIAsyncActionWithProgress[TransferProgress]): Self = this.set("deleteResourceAsync", js.Any.fromFunction1(value))
    @scala.inline
    def setDeleteResourceItemAsync(value: SyndicationItem => IPromiseWithIAsyncActionWithProgress[TransferProgress]): Self = this.set("deleteResourceItemAsync", js.Any.fromFunction1(value))
    @scala.inline
    def setMaxResponseBufferSize(value: Double): Self = this.set("maxResponseBufferSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setProxyCredential(value: PasswordCredential): Self = this.set("proxyCredential", value.asInstanceOf[js.Any])
    @scala.inline
    def setRetrieveFeedAsync(value: Uri => IPromiseWithIAsyncOperationWithProgress[SyndicationFeed, RetrievalProgress]): Self = this.set("retrieveFeedAsync", js.Any.fromFunction1(value))
    @scala.inline
    def setRetrieveMediaResourceAsync(value: Uri => IPromiseWithIAsyncOperationWithProgress[IInputStream, RetrievalProgress]): Self = this.set("retrieveMediaResourceAsync", js.Any.fromFunction1(value))
    @scala.inline
    def setRetrieveResourceAsync(value: Uri => IPromiseWithIAsyncOperationWithProgress[SyndicationItem, RetrievalProgress]): Self = this.set("retrieveResourceAsync", js.Any.fromFunction1(value))
    @scala.inline
    def setRetrieveServiceDocumentAsync(value: Uri => IPromiseWithIAsyncOperationWithProgress[ServiceDocument, RetrievalProgress]): Self = this.set("retrieveServiceDocumentAsync", js.Any.fromFunction1(value))
    @scala.inline
    def setServerCredential(value: PasswordCredential): Self = this.set("serverCredential", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetRequestHeader(value: (String, String) => Unit): Self = this.set("setRequestHeader", js.Any.fromFunction2(value))
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdateMediaResourceAsync(value: (Uri, String, IInputStream) => IPromiseWithIAsyncActionWithProgress[TransferProgress]): Self = this.set("updateMediaResourceAsync", js.Any.fromFunction3(value))
    @scala.inline
    def setUpdateResourceAsync(value: (Uri, SyndicationItem) => IPromiseWithIAsyncActionWithProgress[TransferProgress]): Self = this.set("updateResourceAsync", js.Any.fromFunction2(value))
    @scala.inline
    def setUpdateResourceItemAsync(value: SyndicationItem => IPromiseWithIAsyncActionWithProgress[TransferProgress]): Self = this.set("updateResourceItemAsync", js.Any.fromFunction1(value))
  }
  
}

