package typings.winrt.WindowsNs.StorageNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IMapView
import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IPropertySet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IApplicationDataContainer extends js.Object {
  var containers: IMapView[String, ApplicationDataContainer]
  var locality: ApplicationDataLocality
  var name: String
  var values: IPropertySet
  def createContainer(name: String, disposition: ApplicationDataCreateDisposition): ApplicationDataContainer
  def deleteContainer(name: String): Unit
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
    val __obj = js.Dynamic.literal(containers = containers, createContainer = js.Any.fromFunction2(createContainer), deleteContainer = js.Any.fromFunction1(deleteContainer), locality = locality, name = name, values = values)
  
    __obj.asInstanceOf[IApplicationDataContainer]
  }
}

