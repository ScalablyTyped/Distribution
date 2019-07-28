package typings.winrt.WindowsNs.ApplicationModelNs.ResourcesNs.ManagementNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import typings.winrt.WindowsNs.FoundationNs.IAsyncOperation
import typings.winrt.WindowsNs.FoundationNs.Uri
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

