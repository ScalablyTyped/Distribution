package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ResourcesNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to application resource maps and more advanced resource functionality. */
@JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceManager")
@js.native
abstract class ResourceManager () extends js.Object {
  /** Gets a map of ResourceMap objects typically associated with the app packages, indexed by package name. */
  var allResourceMaps: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IMapView[java.lang.String, ResourceMap] = js.native
  /** Gets the default ResourceContext for the currently running application. Unless explicitly overridden, the default ResourceContext is used to determine the most appropriate representation of any given named resource. */
  var defaultContext: ResourceContext = js.native
  /** Gets the ResourceMap that is associated with the main package of the currently running application. */
  var mainResourceMap: ResourceMap = js.native
  /**
    * Gets a list of all named resources for an app package.
    * @param packageName The name of the app package.
    * @param resourceLayoutInfo Specifies the resource version and the named resource count.
    * @return A list of NamedResource objects.
    */
  def getAllNamedResourcesForPackage(packageName: java.lang.String, resourceLayoutInfo: ResourceLayoutInfo): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[NamedResource] = js.native
  /**
    * Gets a list of all collections of resource subtrees for an app package.
    * @param packageName The name of the app package.
    * @param resourceLayoutInfo Specifies the resource version and the resource subtree count.
    * @return A list of resource subtrees ( ResourceMap objects).
    */
  def getAllSubtreesForPackage(packageName: java.lang.String, resourceLayoutInfo: ResourceLayoutInfo): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[ResourceMap] = js.native
  /**
    * Loads one or more PRI files and adds their contents to the default resource manager.
    * @param files The files you want to add.
    */
  def loadPriFiles(
    files: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[winrtDashUwpLib.WindowsNs.StorageNs.IStorageFile]
  ): scala.Unit = js.native
  /**
    * Unloads one or more PRI files.
    * @param files The files you want unloaded.
    */
  def unloadPriFiles(
    files: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[winrtDashUwpLib.WindowsNs.StorageNs.IStorageFile]
  ): scala.Unit = js.native
}

/* static members */
@JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceManager")
@js.native
object ResourceManager extends js.Object {
  /** Gets the ResourceManager for the currently running application. */
  var current: winrtDashUwpLib.WindowsNs.ApplicationModelNs.ResourcesNs.CoreNs.ResourceManager = js.native
  /**
    * Determines whether a supplied string matches the resource reference format (an ms-resource string URI identifier).
    * @param resourceReference The string you want to match.
    * @return TRUE if the string matches.
    */
  def isResourceReference(resourceReference: java.lang.String): scala.Boolean = js.native
}

