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

