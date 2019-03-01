package typings
package winrtLib.WindowsNs.ApplicationModelNs.ResourcesNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResourceManager extends js.Object {
  var allResourceMaps: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IMapView[java.lang.String, ResourceMap]
  var defaultContext: ResourceContext
  var mainResourceMap: ResourceMap
  def loadPriFiles(
    files: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[winrtLib.WindowsNs.StorageNs.IStorageFile]
  ): scala.Unit
  def unloadPriFiles(
    files: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[winrtLib.WindowsNs.StorageNs.IStorageFile]
  ): scala.Unit
}

object IResourceManager {
  @scala.inline
  def apply(
    allResourceMaps: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IMapView[java.lang.String, ResourceMap],
    defaultContext: ResourceContext,
    loadPriFiles: js.Function1[
      winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[winrtLib.WindowsNs.StorageNs.IStorageFile], 
      scala.Unit
    ],
    mainResourceMap: ResourceMap,
    unloadPriFiles: js.Function1[
      winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[winrtLib.WindowsNs.StorageNs.IStorageFile], 
      scala.Unit
    ]
  ): IResourceManager = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("allResourceMaps")(allResourceMaps)
    __obj.updateDynamic("defaultContext")(defaultContext)
    __obj.updateDynamic("loadPriFiles")(loadPriFiles)
    __obj.updateDynamic("mainResourceMap")(mainResourceMap)
    __obj.updateDynamic("unloadPriFiles")(unloadPriFiles)
    __obj.asInstanceOf[IResourceManager]
  }
}

