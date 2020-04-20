package typings.winrt.Windows.Storage

import typings.winrt.Windows.Foundation.Collections.IMapView
import typings.winrt.Windows.Foundation.Collections.IPropertySet
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
    val __obj = js.Dynamic.literal(containers = containers.asInstanceOf[js.Any], createContainer = js.Any.fromFunction2(createContainer), deleteContainer = js.Any.fromFunction1(deleteContainer), locality = locality.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[IApplicationDataContainer]
  }
}

