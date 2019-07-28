package typings.winrt.WindowsNs.ApplicationModelNs.ResourcesNs.CoreNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IIterable
import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IMapView
import typings.winrt.WindowsNs.StorageNs.IStorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResourceManager extends js.Object {
  var allResourceMaps: IMapView[String, ResourceMap]
  var defaultContext: ResourceContext
  var mainResourceMap: ResourceMap
  def loadPriFiles(files: IIterable[IStorageFile]): Unit
  def unloadPriFiles(files: IIterable[IStorageFile]): Unit
}

object IResourceManager {
  @scala.inline
  def apply(
    allResourceMaps: IMapView[String, ResourceMap],
    defaultContext: ResourceContext,
    loadPriFiles: IIterable[IStorageFile] => Unit,
    mainResourceMap: ResourceMap,
    unloadPriFiles: IIterable[IStorageFile] => Unit
  ): IResourceManager = {
    val __obj = js.Dynamic.literal(allResourceMaps = allResourceMaps, defaultContext = defaultContext, loadPriFiles = js.Any.fromFunction1(loadPriFiles), mainResourceMap = mainResourceMap, unloadPriFiles = js.Any.fromFunction1(unloadPriFiles))
  
    __obj.asInstanceOf[IResourceManager]
  }
}

