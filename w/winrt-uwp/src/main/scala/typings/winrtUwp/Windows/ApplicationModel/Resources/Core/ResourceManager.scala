package typings.winrtUwp.Windows.ApplicationModel.Resources.Core

import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Storage.IStorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to application resource maps and more advanced resource functionality. */
trait ResourceManager extends js.Object {
  /** Gets a map of ResourceMap objects typically associated with the app packages, indexed by package name. */
  var allResourceMaps: IMapView[String, ResourceMap]
  /** Gets the default ResourceContext for the currently running application. Unless explicitly overridden, the default ResourceContext is used to determine the most appropriate representation of any given named resource. */
  var defaultContext: ResourceContext
  /** Gets the ResourceMap that is associated with the main package of the currently running application. */
  var mainResourceMap: ResourceMap
  /**
    * Gets a list of all named resources for an app package.
    * @param packageName The name of the app package.
    * @param resourceLayoutInfo Specifies the resource version and the named resource count.
    * @return A list of NamedResource objects.
    */
  def getAllNamedResourcesForPackage(packageName: String, resourceLayoutInfo: ResourceLayoutInfo): IVectorView[NamedResource]
  /**
    * Gets a list of all collections of resource subtrees for an app package.
    * @param packageName The name of the app package.
    * @param resourceLayoutInfo Specifies the resource version and the resource subtree count.
    * @return A list of resource subtrees ( ResourceMap objects).
    */
  def getAllSubtreesForPackage(packageName: String, resourceLayoutInfo: ResourceLayoutInfo): IVectorView[ResourceMap]
  /**
    * Loads one or more PRI files and adds their contents to the default resource manager.
    * @param files The files you want to add.
    */
  def loadPriFiles(files: IIterable[IStorageFile]): Unit
  /**
    * Unloads one or more PRI files.
    * @param files The files you want unloaded.
    */
  def unloadPriFiles(files: IIterable[IStorageFile]): Unit
}

object ResourceManager {
  @scala.inline
  def apply(
    allResourceMaps: IMapView[String, ResourceMap],
    defaultContext: ResourceContext,
    getAllNamedResourcesForPackage: (String, ResourceLayoutInfo) => IVectorView[NamedResource],
    getAllSubtreesForPackage: (String, ResourceLayoutInfo) => IVectorView[ResourceMap],
    loadPriFiles: IIterable[IStorageFile] => Unit,
    mainResourceMap: ResourceMap,
    unloadPriFiles: IIterable[IStorageFile] => Unit
  ): ResourceManager = {
    val __obj = js.Dynamic.literal(allResourceMaps = allResourceMaps.asInstanceOf[js.Any], defaultContext = defaultContext.asInstanceOf[js.Any], getAllNamedResourcesForPackage = js.Any.fromFunction2(getAllNamedResourcesForPackage), getAllSubtreesForPackage = js.Any.fromFunction2(getAllSubtreesForPackage), loadPriFiles = js.Any.fromFunction1(loadPriFiles), mainResourceMap = mainResourceMap.asInstanceOf[js.Any], unloadPriFiles = js.Any.fromFunction1(unloadPriFiles))
    __obj.asInstanceOf[ResourceManager]
  }
}

