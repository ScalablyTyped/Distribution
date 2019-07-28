package typings.winrtDashUwp.WindowsNs.StorageNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IMapView
import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IPropertySet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a container for app settings. The methods and properties of this class support creating, deleting, enumerating, and traversing the container hierarchy. */
@JSGlobal("Windows.Storage.ApplicationDataContainer")
@js.native
abstract class ApplicationDataContainer () extends js.Object {
  /** Gets the child application settings containers of this application settings container. */
  var containers: IMapView[String, ApplicationDataContainer] = js.native
  /** Gets the type (local or roaming) of the app data store that is associated with the current settings container. */
  var locality: ApplicationDataLocality = js.native
  /** Gets the name of the current settings container. */
  var name: String = js.native
  /** Gets an object that represents the settings in this settings container. */
  var values: IPropertySet = js.native
  /**
    * Creates or opens the specified settings container in the current settings container.
    * @param name The name of the container.
    * @param disposition One of the enumeration values.
    * @return The settings container.
    */
  def createContainer(name: String, disposition: ApplicationDataCreateDisposition): ApplicationDataContainer = js.native
  /**
    * Deletes the specified settings container, its subcontainers, and all application settings in the hierarchy.
    * @param name The name of the settings container.
    */
  def deleteContainer(name: String): Unit = js.native
}

