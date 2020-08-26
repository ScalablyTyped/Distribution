package typings.winrt.Windows.ApplicationModel.Resources.Management

import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IResourceIndexer extends js.Object {
  def indexFileContentsAsync(file: Uri): IAsyncOperation[IVectorView[IndexedResourceCandidate]] = js.native
  def indexFilePath(filePath: Uri): IndexedResourceCandidate = js.native
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
  @scala.inline
  implicit class IResourceIndexerOps[Self <: IResourceIndexer] (val x: Self) extends AnyVal {
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
    def setIndexFileContentsAsync(value: Uri => IAsyncOperation[IVectorView[IndexedResourceCandidate]]): Self = this.set("indexFileContentsAsync", js.Any.fromFunction1(value))
    @scala.inline
    def setIndexFilePath(value: Uri => IndexedResourceCandidate): Self = this.set("indexFilePath", js.Any.fromFunction1(value))
  }
  
}

