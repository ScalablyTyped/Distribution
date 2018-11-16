package typings
package winrtLib.WindowsNs.StorageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.ApplicationDataContainer")
@js.native
class ApplicationDataContainer () extends IApplicationDataContainer {
  /* CompleteClass */
  override var containers: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IMapView[java.lang.String, ApplicationDataContainer] = js.native
  /* CompleteClass */
  override var locality: ApplicationDataLocality = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
  /* CompleteClass */
  override var values: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IPropertySet = js.native
  /* CompleteClass */
  override def createContainer(name: java.lang.String, disposition: ApplicationDataCreateDisposition): ApplicationDataContainer = js.native
  /* CompleteClass */
  override def deleteContainer(name: java.lang.String): scala.Unit = js.native
}

