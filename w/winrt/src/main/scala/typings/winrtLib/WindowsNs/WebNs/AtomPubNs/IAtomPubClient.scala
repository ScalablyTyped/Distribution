package typings
package winrtLib.WindowsNs.WebNs.AtomPubNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAtomPubClient
  extends winrtLib.WindowsNs.WebNs.SyndicationNs.ISyndicationClient {
  def cancelAsyncOperations(): scala.Unit
  def createMediaResourceAsync(
    uri: winrtLib.WindowsNs.FoundationNs.Uri,
    mediaType: java.lang.String,
    description: java.lang.String,
    mediaStream: winrtLib.WindowsNs.StorageNs.StreamsNs.IInputStream
  ): winrtLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[
    winrtLib.WindowsNs.WebNs.SyndicationNs.SyndicationItem, 
    winrtLib.WindowsNs.WebNs.SyndicationNs.TransferProgress
  ]
  def createResourceAsync(
    uri: winrtLib.WindowsNs.FoundationNs.Uri,
    description: java.lang.String,
    item: winrtLib.WindowsNs.WebNs.SyndicationNs.SyndicationItem
  ): winrtLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[
    winrtLib.WindowsNs.WebNs.SyndicationNs.SyndicationItem, 
    winrtLib.WindowsNs.WebNs.SyndicationNs.TransferProgress
  ]
  def deleteResourceAsync(uri: winrtLib.WindowsNs.FoundationNs.Uri): winrtLib.WindowsNs.FoundationNs.IAsyncActionWithProgress[winrtLib.WindowsNs.WebNs.SyndicationNs.TransferProgress]
  def deleteResourceItemAsync(item: winrtLib.WindowsNs.WebNs.SyndicationNs.SyndicationItem): winrtLib.WindowsNs.FoundationNs.IAsyncActionWithProgress[winrtLib.WindowsNs.WebNs.SyndicationNs.TransferProgress]
  def retrieveMediaResourceAsync(uri: winrtLib.WindowsNs.FoundationNs.Uri): winrtLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[
    winrtLib.WindowsNs.StorageNs.StreamsNs.IInputStream, 
    winrtLib.WindowsNs.WebNs.SyndicationNs.RetrievalProgress
  ]
  def retrieveResourceAsync(uri: winrtLib.WindowsNs.FoundationNs.Uri): winrtLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[
    winrtLib.WindowsNs.WebNs.SyndicationNs.SyndicationItem, 
    winrtLib.WindowsNs.WebNs.SyndicationNs.RetrievalProgress
  ]
  def retrieveServiceDocumentAsync(uri: winrtLib.WindowsNs.FoundationNs.Uri): winrtLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[ServiceDocument, winrtLib.WindowsNs.WebNs.SyndicationNs.RetrievalProgress]
  def updateMediaResourceAsync(
    uri: winrtLib.WindowsNs.FoundationNs.Uri,
    mediaType: java.lang.String,
    mediaStream: winrtLib.WindowsNs.StorageNs.StreamsNs.IInputStream
  ): winrtLib.WindowsNs.FoundationNs.IAsyncActionWithProgress[winrtLib.WindowsNs.WebNs.SyndicationNs.TransferProgress]
  def updateResourceAsync(
    uri: winrtLib.WindowsNs.FoundationNs.Uri,
    item: winrtLib.WindowsNs.WebNs.SyndicationNs.SyndicationItem
  ): winrtLib.WindowsNs.FoundationNs.IAsyncActionWithProgress[winrtLib.WindowsNs.WebNs.SyndicationNs.TransferProgress]
  def updateResourceItemAsync(item: winrtLib.WindowsNs.WebNs.SyndicationNs.SyndicationItem): winrtLib.WindowsNs.FoundationNs.IAsyncActionWithProgress[winrtLib.WindowsNs.WebNs.SyndicationNs.TransferProgress]
}

object IAtomPubClient {
  @scala.inline
  def apply(
    bypassCacheOnRetrieve: scala.Boolean,
    cancelAsyncOperations: () => scala.Unit,
    createMediaResourceAsync: (winrtLib.WindowsNs.FoundationNs.Uri, java.lang.String, java.lang.String, winrtLib.WindowsNs.StorageNs.StreamsNs.IInputStream) => winrtLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[
      winrtLib.WindowsNs.WebNs.SyndicationNs.SyndicationItem, 
      winrtLib.WindowsNs.WebNs.SyndicationNs.TransferProgress
    ],
    createResourceAsync: (winrtLib.WindowsNs.FoundationNs.Uri, java.lang.String, winrtLib.WindowsNs.WebNs.SyndicationNs.SyndicationItem) => winrtLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[
      winrtLib.WindowsNs.WebNs.SyndicationNs.SyndicationItem, 
      winrtLib.WindowsNs.WebNs.SyndicationNs.TransferProgress
    ],
    deleteResourceAsync: winrtLib.WindowsNs.FoundationNs.Uri => winrtLib.WindowsNs.FoundationNs.IAsyncActionWithProgress[winrtLib.WindowsNs.WebNs.SyndicationNs.TransferProgress],
    deleteResourceItemAsync: winrtLib.WindowsNs.WebNs.SyndicationNs.SyndicationItem => winrtLib.WindowsNs.FoundationNs.IAsyncActionWithProgress[winrtLib.WindowsNs.WebNs.SyndicationNs.TransferProgress],
    maxResponseBufferSize: scala.Double,
    proxyCredential: winrtLib.WindowsNs.SecurityNs.CredentialsNs.PasswordCredential,
    retrieveFeedAsync: winrtLib.WindowsNs.FoundationNs.Uri => winrtLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[
      winrtLib.WindowsNs.WebNs.SyndicationNs.SyndicationFeed, 
      winrtLib.WindowsNs.WebNs.SyndicationNs.RetrievalProgress
    ],
    retrieveMediaResourceAsync: winrtLib.WindowsNs.FoundationNs.Uri => winrtLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[
      winrtLib.WindowsNs.StorageNs.StreamsNs.IInputStream, 
      winrtLib.WindowsNs.WebNs.SyndicationNs.RetrievalProgress
    ],
    retrieveResourceAsync: winrtLib.WindowsNs.FoundationNs.Uri => winrtLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[
      winrtLib.WindowsNs.WebNs.SyndicationNs.SyndicationItem, 
      winrtLib.WindowsNs.WebNs.SyndicationNs.RetrievalProgress
    ],
    retrieveServiceDocumentAsync: winrtLib.WindowsNs.FoundationNs.Uri => winrtLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[ServiceDocument, winrtLib.WindowsNs.WebNs.SyndicationNs.RetrievalProgress],
    serverCredential: winrtLib.WindowsNs.SecurityNs.CredentialsNs.PasswordCredential,
    setRequestHeader: (java.lang.String, java.lang.String) => scala.Unit,
    timeout: scala.Double,
    updateMediaResourceAsync: (winrtLib.WindowsNs.FoundationNs.Uri, java.lang.String, winrtLib.WindowsNs.StorageNs.StreamsNs.IInputStream) => winrtLib.WindowsNs.FoundationNs.IAsyncActionWithProgress[winrtLib.WindowsNs.WebNs.SyndicationNs.TransferProgress],
    updateResourceAsync: (winrtLib.WindowsNs.FoundationNs.Uri, winrtLib.WindowsNs.WebNs.SyndicationNs.SyndicationItem) => winrtLib.WindowsNs.FoundationNs.IAsyncActionWithProgress[winrtLib.WindowsNs.WebNs.SyndicationNs.TransferProgress],
    updateResourceItemAsync: winrtLib.WindowsNs.WebNs.SyndicationNs.SyndicationItem => winrtLib.WindowsNs.FoundationNs.IAsyncActionWithProgress[winrtLib.WindowsNs.WebNs.SyndicationNs.TransferProgress]
  ): IAtomPubClient = {
    val __obj = js.Dynamic.literal(bypassCacheOnRetrieve = bypassCacheOnRetrieve, cancelAsyncOperations = js.Any.fromFunction0(cancelAsyncOperations), createMediaResourceAsync = js.Any.fromFunction4(createMediaResourceAsync), createResourceAsync = js.Any.fromFunction3(createResourceAsync), deleteResourceAsync = js.Any.fromFunction1(deleteResourceAsync), deleteResourceItemAsync = js.Any.fromFunction1(deleteResourceItemAsync), maxResponseBufferSize = maxResponseBufferSize, proxyCredential = proxyCredential, retrieveFeedAsync = js.Any.fromFunction1(retrieveFeedAsync), retrieveMediaResourceAsync = js.Any.fromFunction1(retrieveMediaResourceAsync), retrieveResourceAsync = js.Any.fromFunction1(retrieveResourceAsync), retrieveServiceDocumentAsync = js.Any.fromFunction1(retrieveServiceDocumentAsync), serverCredential = serverCredential, setRequestHeader = js.Any.fromFunction2(setRequestHeader), timeout = timeout, updateMediaResourceAsync = js.Any.fromFunction3(updateMediaResourceAsync), updateResourceAsync = js.Any.fromFunction2(updateResourceAsync), updateResourceItemAsync = js.Any.fromFunction1(updateResourceItemAsync))
  
    __obj.asInstanceOf[IAtomPubClient]
  }
}

