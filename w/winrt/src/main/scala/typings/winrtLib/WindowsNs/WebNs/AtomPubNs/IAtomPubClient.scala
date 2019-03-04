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
    cancelAsyncOperations: js.Function0[scala.Unit],
    createMediaResourceAsync: js.Function4[
      winrtLib.WindowsNs.FoundationNs.Uri, 
      java.lang.String, 
      java.lang.String, 
      winrtLib.WindowsNs.StorageNs.StreamsNs.IInputStream, 
      winrtLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[
        winrtLib.WindowsNs.WebNs.SyndicationNs.SyndicationItem, 
        winrtLib.WindowsNs.WebNs.SyndicationNs.TransferProgress
      ]
    ],
    createResourceAsync: js.Function3[
      winrtLib.WindowsNs.FoundationNs.Uri, 
      java.lang.String, 
      winrtLib.WindowsNs.WebNs.SyndicationNs.SyndicationItem, 
      winrtLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[
        winrtLib.WindowsNs.WebNs.SyndicationNs.SyndicationItem, 
        winrtLib.WindowsNs.WebNs.SyndicationNs.TransferProgress
      ]
    ],
    deleteResourceAsync: js.Function1[
      winrtLib.WindowsNs.FoundationNs.Uri, 
      winrtLib.WindowsNs.FoundationNs.IAsyncActionWithProgress[winrtLib.WindowsNs.WebNs.SyndicationNs.TransferProgress]
    ],
    deleteResourceItemAsync: js.Function1[
      winrtLib.WindowsNs.WebNs.SyndicationNs.SyndicationItem, 
      winrtLib.WindowsNs.FoundationNs.IAsyncActionWithProgress[winrtLib.WindowsNs.WebNs.SyndicationNs.TransferProgress]
    ],
    maxResponseBufferSize: scala.Double,
    proxyCredential: winrtLib.WindowsNs.SecurityNs.CredentialsNs.PasswordCredential,
    retrieveFeedAsync: js.Function1[
      winrtLib.WindowsNs.FoundationNs.Uri, 
      winrtLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[
        winrtLib.WindowsNs.WebNs.SyndicationNs.SyndicationFeed, 
        winrtLib.WindowsNs.WebNs.SyndicationNs.RetrievalProgress
      ]
    ],
    retrieveMediaResourceAsync: js.Function1[
      winrtLib.WindowsNs.FoundationNs.Uri, 
      winrtLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[
        winrtLib.WindowsNs.StorageNs.StreamsNs.IInputStream, 
        winrtLib.WindowsNs.WebNs.SyndicationNs.RetrievalProgress
      ]
    ],
    retrieveResourceAsync: js.Function1[
      winrtLib.WindowsNs.FoundationNs.Uri, 
      winrtLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[
        winrtLib.WindowsNs.WebNs.SyndicationNs.SyndicationItem, 
        winrtLib.WindowsNs.WebNs.SyndicationNs.RetrievalProgress
      ]
    ],
    retrieveServiceDocumentAsync: js.Function1[
      winrtLib.WindowsNs.FoundationNs.Uri, 
      winrtLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[ServiceDocument, winrtLib.WindowsNs.WebNs.SyndicationNs.RetrievalProgress]
    ],
    serverCredential: winrtLib.WindowsNs.SecurityNs.CredentialsNs.PasswordCredential,
    setRequestHeader: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    timeout: scala.Double,
    updateMediaResourceAsync: js.Function3[
      winrtLib.WindowsNs.FoundationNs.Uri, 
      java.lang.String, 
      winrtLib.WindowsNs.StorageNs.StreamsNs.IInputStream, 
      winrtLib.WindowsNs.FoundationNs.IAsyncActionWithProgress[winrtLib.WindowsNs.WebNs.SyndicationNs.TransferProgress]
    ],
    updateResourceAsync: js.Function2[
      winrtLib.WindowsNs.FoundationNs.Uri, 
      winrtLib.WindowsNs.WebNs.SyndicationNs.SyndicationItem, 
      winrtLib.WindowsNs.FoundationNs.IAsyncActionWithProgress[winrtLib.WindowsNs.WebNs.SyndicationNs.TransferProgress]
    ],
    updateResourceItemAsync: js.Function1[
      winrtLib.WindowsNs.WebNs.SyndicationNs.SyndicationItem, 
      winrtLib.WindowsNs.FoundationNs.IAsyncActionWithProgress[winrtLib.WindowsNs.WebNs.SyndicationNs.TransferProgress]
    ]
  ): IAtomPubClient = {
    val __obj = js.Dynamic.literal(bypassCacheOnRetrieve = bypassCacheOnRetrieve, cancelAsyncOperations = cancelAsyncOperations, createMediaResourceAsync = createMediaResourceAsync, createResourceAsync = createResourceAsync, deleteResourceAsync = deleteResourceAsync, deleteResourceItemAsync = deleteResourceItemAsync, maxResponseBufferSize = maxResponseBufferSize, proxyCredential = proxyCredential, retrieveFeedAsync = retrieveFeedAsync, retrieveMediaResourceAsync = retrieveMediaResourceAsync, retrieveResourceAsync = retrieveResourceAsync, retrieveServiceDocumentAsync = retrieveServiceDocumentAsync, serverCredential = serverCredential, setRequestHeader = setRequestHeader, timeout = timeout, updateMediaResourceAsync = updateMediaResourceAsync, updateResourceAsync = updateResourceAsync, updateResourceItemAsync = updateResourceItemAsync)
  
    __obj.asInstanceOf[IAtomPubClient]
  }
}

