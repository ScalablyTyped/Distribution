package typings.winrt.Windows.Web.AtomPub

import typings.winrt.Windows.Foundation.IAsyncActionWithProgress
import typings.winrt.Windows.Foundation.IAsyncOperationWithProgress
import typings.winrt.Windows.Foundation.Uri
import typings.winrt.Windows.Security.Credentials.PasswordCredential
import typings.winrt.Windows.Storage.Streams.IInputStream
import typings.winrt.Windows.Web.Syndication.ISyndicationClient
import typings.winrt.Windows.Web.Syndication.RetrievalProgress
import typings.winrt.Windows.Web.Syndication.SyndicationFeed
import typings.winrt.Windows.Web.Syndication.SyndicationItem
import typings.winrt.Windows.Web.Syndication.TransferProgress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAtomPubClient extends ISyndicationClient {
  def cancelAsyncOperations(): Unit = js.native
  def createMediaResourceAsync(uri: Uri, mediaType: String, description: String, mediaStream: IInputStream): IAsyncOperationWithProgress[SyndicationItem, TransferProgress] = js.native
  def createResourceAsync(uri: Uri, description: String, item: SyndicationItem): IAsyncOperationWithProgress[SyndicationItem, TransferProgress] = js.native
  def deleteResourceAsync(uri: Uri): IAsyncActionWithProgress[TransferProgress] = js.native
  def deleteResourceItemAsync(item: SyndicationItem): IAsyncActionWithProgress[TransferProgress] = js.native
  def retrieveMediaResourceAsync(uri: Uri): IAsyncOperationWithProgress[IInputStream, RetrievalProgress] = js.native
  def retrieveResourceAsync(uri: Uri): IAsyncOperationWithProgress[SyndicationItem, RetrievalProgress] = js.native
  def retrieveServiceDocumentAsync(uri: Uri): IAsyncOperationWithProgress[ServiceDocument, RetrievalProgress] = js.native
  def updateMediaResourceAsync(uri: Uri, mediaType: String, mediaStream: IInputStream): IAsyncActionWithProgress[TransferProgress] = js.native
  def updateResourceAsync(uri: Uri, item: SyndicationItem): IAsyncActionWithProgress[TransferProgress] = js.native
  def updateResourceItemAsync(item: SyndicationItem): IAsyncActionWithProgress[TransferProgress] = js.native
}

object IAtomPubClient {
  @scala.inline
  def apply(
    bypassCacheOnRetrieve: Boolean,
    cancelAsyncOperations: () => Unit,
    createMediaResourceAsync: (Uri, String, String, IInputStream) => IAsyncOperationWithProgress[SyndicationItem, TransferProgress],
    createResourceAsync: (Uri, String, SyndicationItem) => IAsyncOperationWithProgress[SyndicationItem, TransferProgress],
    deleteResourceAsync: Uri => IAsyncActionWithProgress[TransferProgress],
    deleteResourceItemAsync: SyndicationItem => IAsyncActionWithProgress[TransferProgress],
    maxResponseBufferSize: Double,
    proxyCredential: PasswordCredential,
    retrieveFeedAsync: Uri => IAsyncOperationWithProgress[SyndicationFeed, RetrievalProgress],
    retrieveMediaResourceAsync: Uri => IAsyncOperationWithProgress[IInputStream, RetrievalProgress],
    retrieveResourceAsync: Uri => IAsyncOperationWithProgress[SyndicationItem, RetrievalProgress],
    retrieveServiceDocumentAsync: Uri => IAsyncOperationWithProgress[ServiceDocument, RetrievalProgress],
    serverCredential: PasswordCredential,
    setRequestHeader: (String, String) => Unit,
    timeout: Double,
    updateMediaResourceAsync: (Uri, String, IInputStream) => IAsyncActionWithProgress[TransferProgress],
    updateResourceAsync: (Uri, SyndicationItem) => IAsyncActionWithProgress[TransferProgress],
    updateResourceItemAsync: SyndicationItem => IAsyncActionWithProgress[TransferProgress]
  ): IAtomPubClient = {
    val __obj = js.Dynamic.literal(bypassCacheOnRetrieve = bypassCacheOnRetrieve.asInstanceOf[js.Any], cancelAsyncOperations = js.Any.fromFunction0(cancelAsyncOperations), createMediaResourceAsync = js.Any.fromFunction4(createMediaResourceAsync), createResourceAsync = js.Any.fromFunction3(createResourceAsync), deleteResourceAsync = js.Any.fromFunction1(deleteResourceAsync), deleteResourceItemAsync = js.Any.fromFunction1(deleteResourceItemAsync), maxResponseBufferSize = maxResponseBufferSize.asInstanceOf[js.Any], proxyCredential = proxyCredential.asInstanceOf[js.Any], retrieveFeedAsync = js.Any.fromFunction1(retrieveFeedAsync), retrieveMediaResourceAsync = js.Any.fromFunction1(retrieveMediaResourceAsync), retrieveResourceAsync = js.Any.fromFunction1(retrieveResourceAsync), retrieveServiceDocumentAsync = js.Any.fromFunction1(retrieveServiceDocumentAsync), serverCredential = serverCredential.asInstanceOf[js.Any], setRequestHeader = js.Any.fromFunction2(setRequestHeader), timeout = timeout.asInstanceOf[js.Any], updateMediaResourceAsync = js.Any.fromFunction3(updateMediaResourceAsync), updateResourceAsync = js.Any.fromFunction2(updateResourceAsync), updateResourceItemAsync = js.Any.fromFunction1(updateResourceItemAsync))
    __obj.asInstanceOf[IAtomPubClient]
  }
  @scala.inline
  implicit class IAtomPubClientOps[Self <: IAtomPubClient] (val x: Self) extends AnyVal {
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
    def setCancelAsyncOperations(value: () => Unit): Self = this.set("cancelAsyncOperations", js.Any.fromFunction0(value))
    @scala.inline
    def setCreateMediaResourceAsync(
      value: (Uri, String, String, IInputStream) => IAsyncOperationWithProgress[SyndicationItem, TransferProgress]
    ): Self = this.set("createMediaResourceAsync", js.Any.fromFunction4(value))
    @scala.inline
    def setCreateResourceAsync(
      value: (Uri, String, SyndicationItem) => IAsyncOperationWithProgress[SyndicationItem, TransferProgress]
    ): Self = this.set("createResourceAsync", js.Any.fromFunction3(value))
    @scala.inline
    def setDeleteResourceAsync(value: Uri => IAsyncActionWithProgress[TransferProgress]): Self = this.set("deleteResourceAsync", js.Any.fromFunction1(value))
    @scala.inline
    def setDeleteResourceItemAsync(value: SyndicationItem => IAsyncActionWithProgress[TransferProgress]): Self = this.set("deleteResourceItemAsync", js.Any.fromFunction1(value))
    @scala.inline
    def setRetrieveMediaResourceAsync(value: Uri => IAsyncOperationWithProgress[IInputStream, RetrievalProgress]): Self = this.set("retrieveMediaResourceAsync", js.Any.fromFunction1(value))
    @scala.inline
    def setRetrieveResourceAsync(value: Uri => IAsyncOperationWithProgress[SyndicationItem, RetrievalProgress]): Self = this.set("retrieveResourceAsync", js.Any.fromFunction1(value))
    @scala.inline
    def setRetrieveServiceDocumentAsync(value: Uri => IAsyncOperationWithProgress[ServiceDocument, RetrievalProgress]): Self = this.set("retrieveServiceDocumentAsync", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdateMediaResourceAsync(value: (Uri, String, IInputStream) => IAsyncActionWithProgress[TransferProgress]): Self = this.set("updateMediaResourceAsync", js.Any.fromFunction3(value))
    @scala.inline
    def setUpdateResourceAsync(value: (Uri, SyndicationItem) => IAsyncActionWithProgress[TransferProgress]): Self = this.set("updateResourceAsync", js.Any.fromFunction2(value))
    @scala.inline
    def setUpdateResourceItemAsync(value: SyndicationItem => IAsyncActionWithProgress[TransferProgress]): Self = this.set("updateResourceItemAsync", js.Any.fromFunction1(value))
  }
  
}

