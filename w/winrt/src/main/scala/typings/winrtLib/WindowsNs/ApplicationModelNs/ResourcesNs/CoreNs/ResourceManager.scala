package typings
package winrtLib.WindowsNs.ApplicationModelNs.ResourcesNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceManager")
@js.native
class ResourceManager () extends IResourceManager {
  /* CompleteClass */
  override var allResourceMaps: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IMapView[java.lang.String, ResourceMap] = js.native
  /* CompleteClass */
  override var defaultContext: ResourceContext = js.native
  /* CompleteClass */
  override var mainResourceMap: ResourceMap = js.native
  /* CompleteClass */
  override def loadPriFiles(
    files: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[winrtLib.WindowsNs.StorageNs.IStorageFile]
  ): scala.Unit = js.native
  /* CompleteClass */
  override def unloadPriFiles(
    files: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[winrtLib.WindowsNs.StorageNs.IStorageFile]
  ): scala.Unit = js.native
}

@JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceManager")
@js.native
object ResourceManager extends js.Object {
  var current: winrtLib.WindowsNs.ApplicationModelNs.ResourcesNs.CoreNs.ResourceManager = js.native
  def isResourceReference(resourceReference: java.lang.String): scala.Boolean = js.native
}

