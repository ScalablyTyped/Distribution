package typings.winrt.WindowsNs.StorageNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IMapView
import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IPropertySet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.ApplicationDataContainer")
@js.native
class ApplicationDataContainer () extends IApplicationDataContainer {
  /* CompleteClass */
  override var containers: IMapView[String, ApplicationDataContainer] = js.native
  /* CompleteClass */
  override var locality: ApplicationDataLocality = js.native
  /* CompleteClass */
  override var name: String = js.native
  /* CompleteClass */
  override var values: IPropertySet = js.native
  /* CompleteClass */
  override def createContainer(name: String, disposition: ApplicationDataCreateDisposition): ApplicationDataContainer = js.native
  /* CompleteClass */
  override def deleteContainer(name: String): Unit = js.native
}

