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

