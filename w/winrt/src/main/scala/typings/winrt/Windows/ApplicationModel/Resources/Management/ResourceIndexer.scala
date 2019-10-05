package typings.winrt.Windows.ApplicationModel.Resources.Management

import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.Resources.Management.ResourceIndexer")
@js.native
class ResourceIndexer protected () extends IResourceIndexer {
  def this(projectRoot: Uri) = this()
  /* CompleteClass */
  override def indexFileContentsAsync(file: Uri): IAsyncOperation[IVectorView[IndexedResourceCandidate]] = js.native
  /* CompleteClass */
  override def indexFilePath(filePath: Uri): IndexedResourceCandidate = js.native
}

