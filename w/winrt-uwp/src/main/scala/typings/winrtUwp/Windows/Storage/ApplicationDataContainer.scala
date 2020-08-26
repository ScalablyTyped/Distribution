package typings.winrtUwp.Windows.Storage

import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import typings.winrtUwp.Windows.Foundation.Collections.IPropertySet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a container for app settings. The methods and properties of this class support creating, deleting, enumerating, and traversing the container hierarchy. */
@js.native
trait ApplicationDataContainer extends js.Object {
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

object ApplicationDataContainer {
  @scala.inline
  def apply(
    containers: IMapView[String, ApplicationDataContainer],
    createContainer: (String, ApplicationDataCreateDisposition) => ApplicationDataContainer,
    deleteContainer: String => Unit,
    locality: ApplicationDataLocality,
    name: String,
    values: IPropertySet
  ): ApplicationDataContainer = {
    val __obj = js.Dynamic.literal(containers = containers.asInstanceOf[js.Any], createContainer = js.Any.fromFunction2(createContainer), deleteContainer = js.Any.fromFunction1(deleteContainer), locality = locality.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationDataContainer]
  }
  @scala.inline
  implicit class ApplicationDataContainerOps[Self <: ApplicationDataContainer] (val x: Self) extends AnyVal {
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
    def setContainers(value: IMapView[String, ApplicationDataContainer]): Self = this.set("containers", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreateContainer(value: (String, ApplicationDataCreateDisposition) => ApplicationDataContainer): Self = this.set("createContainer", js.Any.fromFunction2(value))
    @scala.inline
    def setDeleteContainer(value: String => Unit): Self = this.set("deleteContainer", js.Any.fromFunction1(value))
    @scala.inline
    def setLocality(value: ApplicationDataLocality): Self = this.set("locality", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setValues(value: IPropertySet): Self = this.set("values", value.asInstanceOf[js.Any])
  }
  
}

