package typings.winrt.WindowsNs.ApplicationModelNs.ResourcesNs.ManagementNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import typings.winrt.WindowsNs.FoundationNs.IAsyncOperation
import typings.winrt.WindowsNs.FoundationNs.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResourceIndexer extends js.Object {
  def indexFileContentsAsync(file: Uri): IAsyncOperation[IVectorView[IndexedResourceCandidate]]
  def indexFilePath(filePath: Uri): IndexedResourceCandidate
}

object IResourceIndexer {
  @scala.inline
  def apply(
    indexFileContentsAsync: Uri => IAsyncOperation[IVectorView[IndexedResourceCandidate]],
    indexFilePath: Uri => IndexedResourceCandidate
  ): IResourceIndexer = {
    val __obj = js.Dynamic.literal(indexFileContentsAsync = js.Any.fromFunction1(indexFileContentsAsync), indexFilePath = js.Any.fromFunction1(indexFilePath))
  
    __obj.asInstanceOf[IResourceIndexer]
  }
}

