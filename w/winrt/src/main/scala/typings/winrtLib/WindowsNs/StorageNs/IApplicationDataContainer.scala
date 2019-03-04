package typings
package winrtLib.WindowsNs.StorageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IApplicationDataContainer extends js.Object {
  var containers: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IMapView[java.lang.String, ApplicationDataContainer]
  var locality: ApplicationDataLocality
  var name: java.lang.String
  var values: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IPropertySet
  def createContainer(name: java.lang.String, disposition: ApplicationDataCreateDisposition): ApplicationDataContainer
  def deleteContainer(name: java.lang.String): scala.Unit
}

object IApplicationDataContainer {
  @scala.inline
  def apply(
    containers: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IMapView[java.lang.String, ApplicationDataContainer],
    createContainer: js.Function2[java.lang.String, ApplicationDataCreateDisposition, ApplicationDataContainer],
    deleteContainer: js.Function1[java.lang.String, scala.Unit],
    locality: ApplicationDataLocality,
    name: java.lang.String,
    values: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IPropertySet
  ): IApplicationDataContainer = {
    val __obj = js.Dynamic.literal(containers = containers, createContainer = createContainer, deleteContainer = deleteContainer, locality = locality, name = name, values = values)
  
    __obj.asInstanceOf[IApplicationDataContainer]
  }
}

