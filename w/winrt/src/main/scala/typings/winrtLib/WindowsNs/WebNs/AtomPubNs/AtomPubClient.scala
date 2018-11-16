package typings
package winrtLib.WindowsNs.WebNs.AtomPubNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Web.AtomPub.AtomPubClient")
@js.native
class AtomPubClient () extends IAtomPubClient {
  def this(serverCredential: winrtLib.WindowsNs.SecurityNs.CredentialsNs.PasswordCredential) = this()
  /* CompleteClass */
  override var bypassCacheOnRetrieve: scala.Boolean = js.native
  /* CompleteClass */
  override var maxResponseBufferSize: scala.Double = js.native
  /* CompleteClass */
  override var proxyCredential: winrtLib.WindowsNs.SecurityNs.CredentialsNs.PasswordCredential = js.native
  /* CompleteClass */
  override var serverCredential: winrtLib.WindowsNs.SecurityNs.CredentialsNs.PasswordCredential = js.native
  /* CompleteClass */
  override var timeout: scala.Double = js.native
  /* CompleteClass */
  override def cancelAsyncOperations(): scala.Unit = js.native
  /* CompleteClass */
  override def createMediaResourceAsync(
    uri: winrtLib.WindowsNs.FoundationNs.Uri,
    mediaType: java.lang.String,
    description: java.lang.String,
    mediaStream: winrtLib.WindowsNs.StorageNs.StreamsNs.IInputStream
  ): winrtLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[
    winrtLib.WindowsNs.WebNs.SyndicationNs.SyndicationItem, 
    winrtLib.WindowsNs.WebNs.SyndicationNs.TransferProgress
  ] = js.native
  /* CompleteClass */
  override def createResourceAsync(
    uri: winrtLib.WindowsNs.FoundationNs.Uri,
    description: java.lang.String,
    item: winrtLib.WindowsNs.WebNs.SyndicationNs.SyndicationItem
  ): winrtLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[
    winrtLib.WindowsNs.WebNs.SyndicationNs.SyndicationItem, 
    winrtLib.WindowsNs.WebNs.SyndicationNs.TransferProgress
  ] = js.native
  /* CompleteClass */
  override def deleteResourceAsync(uri: winrtLib.WindowsNs.FoundationNs.Uri): winrtLib.WindowsNs.FoundationNs.IAsyncActionWithProgress[winrtLib.WindowsNs.WebNs.SyndicationNs.TransferProgress] = js.native
  /* CompleteClass */
  override def deleteResourceItemAsync(item: winrtLib.WindowsNs.WebNs.SyndicationNs.SyndicationItem): winrtLib.WindowsNs.FoundationNs.IAsyncActionWithProgress[winrtLib.WindowsNs.WebNs.SyndicationNs.TransferProgress] = js.native
  /* CompleteClass */
  override def retrieveFeedAsync(uri: winrtLib.WindowsNs.FoundationNs.Uri): winrtLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[
    winrtLib.WindowsNs.WebNs.SyndicationNs.SyndicationFeed, 
    winrtLib.WindowsNs.WebNs.SyndicationNs.RetrievalProgress
  ] = js.native
  /* CompleteClass */
  override def retrieveMediaResourceAsync(uri: winrtLib.WindowsNs.FoundationNs.Uri): winrtLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[
    winrtLib.WindowsNs.StorageNs.StreamsNs.IInputStream, 
    winrtLib.WindowsNs.WebNs.SyndicationNs.RetrievalProgress
  ] = js.native
  /* CompleteClass */
  override def retrieveResourceAsync(uri: winrtLib.WindowsNs.FoundationNs.Uri): winrtLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[
    winrtLib.WindowsNs.WebNs.SyndicationNs.SyndicationItem, 
    winrtLib.WindowsNs.WebNs.SyndicationNs.RetrievalProgress
  ] = js.native
  /* CompleteClass */
  override def retrieveServiceDocumentAsync(uri: winrtLib.WindowsNs.FoundationNs.Uri): winrtLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[ServiceDocument, winrtLib.WindowsNs.WebNs.SyndicationNs.RetrievalProgress] = js.native
  /* CompleteClass */
  override def setRequestHeader(name: java.lang.String, value: java.lang.String): scala.Unit = js.native
  /* CompleteClass */
  override def updateMediaResourceAsync(
    uri: winrtLib.WindowsNs.FoundationNs.Uri,
    mediaType: java.lang.String,
    mediaStream: winrtLib.WindowsNs.StorageNs.StreamsNs.IInputStream
  ): winrtLib.WindowsNs.FoundationNs.IAsyncActionWithProgress[winrtLib.WindowsNs.WebNs.SyndicationNs.TransferProgress] = js.native
  /* CompleteClass */
  override def updateResourceAsync(
    uri: winrtLib.WindowsNs.FoundationNs.Uri,
    item: winrtLib.WindowsNs.WebNs.SyndicationNs.SyndicationItem
  ): winrtLib.WindowsNs.FoundationNs.IAsyncActionWithProgress[winrtLib.WindowsNs.WebNs.SyndicationNs.TransferProgress] = js.native
  /* CompleteClass */
  override def updateResourceItemAsync(item: winrtLib.WindowsNs.WebNs.SyndicationNs.SyndicationItem): winrtLib.WindowsNs.FoundationNs.IAsyncActionWithProgress[winrtLib.WindowsNs.WebNs.SyndicationNs.TransferProgress] = js.native
}

