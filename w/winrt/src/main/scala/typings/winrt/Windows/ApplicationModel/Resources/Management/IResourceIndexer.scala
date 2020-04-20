package typings.winrt.Windows.ApplicationModel.Resources.Management

import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Foundation.Uri
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

