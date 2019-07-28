package typings.winrt.WindowsNs.WebNs.AtomPubNs

import typings.winrt.WindowsNs.FoundationNs.IAsyncActionWithProgress
import typings.winrt.WindowsNs.FoundationNs.IAsyncOperationWithProgress
import typings.winrt.WindowsNs.FoundationNs.Uri
import typings.winrt.WindowsNs.SecurityNs.CredentialsNs.PasswordCredential
import typings.winrt.WindowsNs.StorageNs.StreamsNs.IInputStream
import typings.winrt.WindowsNs.WebNs.SyndicationNs.ISyndicationClient
import typings.winrt.WindowsNs.WebNs.SyndicationNs.RetrievalProgress
import typings.winrt.WindowsNs.WebNs.SyndicationNs.SyndicationFeed
import typings.winrt.WindowsNs.WebNs.SyndicationNs.SyndicationItem
import typings.winrt.WindowsNs.WebNs.SyndicationNs.TransferProgress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAtomPubClient extends ISyndicationClient {
  def cancelAsyncOperations(): Unit
  def createMediaResourceAsync(uri: Uri, mediaType: String, description: String, mediaStream: IInputStream): IAsyncOperationWithProgress[SyndicationItem, TransferProgress]
  def createResourceAsync(uri: Uri, description: String, item: SyndicationItem): IAsyncOperationWithProgress[SyndicationItem, TransferProgress]
  def deleteResourceAsync(uri: Uri): IAsyncActionWithProgress[TransferProgress]
  def deleteResourceItemAsync(item: SyndicationItem): IAsyncActionWithProgress[TransferProgress]
  def retrieveMediaResourceAsync(uri: Uri): IAsyncOperationWithProgress[IInputStream, RetrievalProgress]
  def retrieveResourceAsync(uri: Uri): IAsyncOperationWithProgress[SyndicationItem, RetrievalProgress]
  def retrieveServiceDocumentAsync(uri: Uri): IAsyncOperationWithProgress[ServiceDocument, RetrievalProgress]
  def updateMediaResourceAsync(uri: Uri, mediaType: String, mediaStream: IInputStream): IAsyncActionWithProgress[TransferProgress]
  def updateResourceAsync(uri: Uri, item: SyndicationItem): IAsyncActionWithProgress[TransferProgress]
  def updateResourceItemAsync(item: SyndicationItem): IAsyncActionWithProgress[TransferProgress]
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
    val __obj = js.Dynamic.literal(bypassCacheOnRetrieve = bypassCacheOnRetrieve, cancelAsyncOperations = js.Any.fromFunction0(cancelAsyncOperations), createMediaResourceAsync = js.Any.fromFunction4(createMediaResourceAsync), createResourceAsync = js.Any.fromFunction3(createResourceAsync), deleteResourceAsync = js.Any.fromFunction1(deleteResourceAsync), deleteResourceItemAsync = js.Any.fromFunction1(deleteResourceItemAsync), maxResponseBufferSize = maxResponseBufferSize, proxyCredential = proxyCredential, retrieveFeedAsync = js.Any.fromFunction1(retrieveFeedAsync), retrieveMediaResourceAsync = js.Any.fromFunction1(retrieveMediaResourceAsync), retrieveResourceAsync = js.Any.fromFunction1(retrieveResourceAsync), retrieveServiceDocumentAsync = js.Any.fromFunction1(retrieveServiceDocumentAsync), serverCredential = serverCredential, setRequestHeader = js.Any.fromFunction2(setRequestHeader), timeout = timeout, updateMediaResourceAsync = js.Any.fromFunction3(updateMediaResourceAsync), updateResourceAsync = js.Any.fromFunction2(updateResourceAsync), updateResourceItemAsync = js.Any.fromFunction1(updateResourceItemAsync))
  
    __obj.asInstanceOf[IAtomPubClient]
  }
}

