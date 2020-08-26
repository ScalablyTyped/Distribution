package typings.winrt.Windows.Storage

import typings.winrt.Windows.Foundation.Collections.IMapView
import typings.winrt.Windows.Foundation.Collections.IPropertySet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IApplicationDataContainer extends js.Object {
  var containers: IMapView[String, ApplicationDataContainer] = js.native
  var locality: ApplicationDataLocality = js.native
  var name: String = js.native
  var values: IPropertySet = js.native
  def createContainer(name: String, disposition: ApplicationDataCreateDisposition): ApplicationDataContainer = js.native
  def deleteContainer(name: String): Unit = js.native
}

object IApplicationDataContainer {
  @scala.inline
  def apply(
    containers: IMapView[String, ApplicationDataContainer],
    createContainer: (String, ApplicationDataCreateDisposition) => ApplicationDataContainer,
    deleteContainer: String => Unit,
    locality: ApplicationDataLocality,
    name: String,
    values: IPropertySet
  ): IApplicationDataContainer = {
    val __obj = js.Dynamic.literal(containers = containers.asInstanceOf[js.Any], createContainer = js.Any.fromFunction2(createContainer), deleteContainer = js.Any.fromFunction1(deleteContainer), locality = locality.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[IApplicationDataContainer]
  }
  @scala.inline
  implicit class IApplicationDataContainerOps[Self <: IApplicationDataContainer] (val x: Self) extends AnyVal {
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

