package typings
package winrtLib.WindowsNs.ApplicationModelNs.ResourcesNs.ManagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.Resources.Management.ResourceIndexer")
@js.native
class ResourceIndexer protected () extends IResourceIndexer {
  def this(projectRoot: winrtLib.WindowsNs.FoundationNs.Uri) = this()
  /* CompleteClass */
  override def indexFileContentsAsync(file: winrtLib.WindowsNs.FoundationNs.Uri): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[
    winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[IndexedResourceCandidate]
  ] = js.native
  /* CompleteClass */
  override def indexFilePath(filePath: winrtLib.WindowsNs.FoundationNs.Uri): IndexedResourceCandidate = js.native
}

