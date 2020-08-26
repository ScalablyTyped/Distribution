package typings.winrt.Windows.ApplicationModel.Resources.Core

import typings.winrt.Windows.Foundation.Collections.IIterable
import typings.winrt.Windows.Foundation.Collections.IMapView
import typings.winrt.Windows.Storage.IStorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IResourceManager extends js.Object {
  var allResourceMaps: IMapView[String, ResourceMap] = js.native
  var defaultContext: ResourceContext = js.native
  var mainResourceMap: ResourceMap = js.native
  def loadPriFiles(files: IIterable[IStorageFile]): Unit = js.native
  def unloadPriFiles(files: IIterable[IStorageFile]): Unit = js.native
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
    val __obj = js.Dynamic.literal(allResourceMaps = allResourceMaps.asInstanceOf[js.Any], defaultContext = defaultContext.asInstanceOf[js.Any], loadPriFiles = js.Any.fromFunction1(loadPriFiles), mainResourceMap = mainResourceMap.asInstanceOf[js.Any], unloadPriFiles = js.Any.fromFunction1(unloadPriFiles))
    __obj.asInstanceOf[IResourceManager]
  }
  @scala.inline
  implicit class IResourceManagerOps[Self <: IResourceManager] (val x: Self) extends AnyVal {
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
    def setAllResourceMaps(value: IMapView[String, ResourceMap]): Self = this.set("allResourceMaps", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultContext(value: ResourceContext): Self = this.set("defaultContext", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoadPriFiles(value: IIterable[IStorageFile] => Unit): Self = this.set("loadPriFiles", js.Any.fromFunction1(value))
    @scala.inline
    def setMainResourceMap(value: ResourceMap): Self = this.set("mainResourceMap", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnloadPriFiles(value: IIterable[IStorageFile] => Unit): Self = this.set("unloadPriFiles", js.Any.fromFunction1(value))
  }
  
}

