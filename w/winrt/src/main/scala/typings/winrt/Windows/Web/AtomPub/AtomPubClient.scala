package typings.winrt.Windows.Web.AtomPub

import typings.winrt.Windows.Foundation.IAsyncActionWithProgress
import typings.winrt.Windows.Foundation.IAsyncOperationWithProgress
import typings.winrt.Windows.Foundation.Uri
import typings.winrt.Windows.Security.Credentials.PasswordCredential
import typings.winrt.Windows.Storage.Streams.IInputStream
import typings.winrt.Windows.Web.Syndication.RetrievalProgress
import typings.winrt.Windows.Web.Syndication.SyndicationFeed
import typings.winrt.Windows.Web.Syndication.SyndicationItem
import typings.winrt.Windows.Web.Syndication.TransferProgress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Web.AtomPub.AtomPubClient")
@js.native
class AtomPubClient () extends IAtomPubClient {
  def this(serverCredential: PasswordCredential) = this()
  /* CompleteClass */
  override var bypassCacheOnRetrieve: Boolean = js.native
  /* CompleteClass */
  override var maxResponseBufferSize: Double = js.native
  /* CompleteClass */
  override var proxyCredential: PasswordCredential = js.native
  /* CompleteClass */
  override var serverCredential: PasswordCredential = js.native
  /* CompleteClass */
  override var timeout: Double = js.native
  /* CompleteClass */
  override def cancelAsyncOperations(): Unit = js.native
  /* CompleteClass */
  override def createMediaResourceAsync(uri: Uri, mediaType: String, description: String, mediaStream: IInputStream): IAsyncOperationWithProgress[SyndicationItem, TransferProgress] = js.native
  /* CompleteClass */
  override def createResourceAsync(uri: Uri, description: String, item: SyndicationItem): IAsyncOperationWithProgress[SyndicationItem, TransferProgress] = js.native
  /* CompleteClass */
  override def deleteResourceAsync(uri: Uri): IAsyncActionWithProgress[TransferProgress] = js.native
  /* CompleteClass */
  override def deleteResourceItemAsync(item: SyndicationItem): IAsyncActionWithProgress[TransferProgress] = js.native
  /* CompleteClass */
  override def retrieveFeedAsync(uri: Uri): IAsyncOperationWithProgress[SyndicationFeed, RetrievalProgress] = js.native
  /* CompleteClass */
  override def retrieveMediaResourceAsync(uri: Uri): IAsyncOperationWithProgress[IInputStream, RetrievalProgress] = js.native
  /* CompleteClass */
  override def retrieveResourceAsync(uri: Uri): IAsyncOperationWithProgress[SyndicationItem, RetrievalProgress] = js.native
  /* CompleteClass */
  override def retrieveServiceDocumentAsync(uri: Uri): IAsyncOperationWithProgress[ServiceDocument, RetrievalProgress] = js.native
  /* CompleteClass */
  override def setRequestHeader(name: String, value: String): Unit = js.native
  /* CompleteClass */
  override def updateMediaResourceAsync(uri: Uri, mediaType: String, mediaStream: IInputStream): IAsyncActionWithProgress[TransferProgress] = js.native
  /* CompleteClass */
  override def updateResourceAsync(uri: Uri, item: SyndicationItem): IAsyncActionWithProgress[TransferProgress] = js.native
  /* CompleteClass */
  override def updateResourceItemAsync(item: SyndicationItem): IAsyncActionWithProgress[TransferProgress] = js.native
}

