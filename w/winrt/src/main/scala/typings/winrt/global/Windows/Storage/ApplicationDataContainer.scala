package typings.winrt.global.Windows.Storage

import typings.winrt.Windows.Foundation.Collections.IMapView
import typings.winrt.Windows.Foundation.Collections.IPropertySet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.ApplicationDataContainer")
@js.native
class ApplicationDataContainer ()
  extends typings.winrt.Windows.Storage.ApplicationDataContainer {
  /* CompleteClass */
  override var containers: IMapView[String, typings.winrt.Windows.Storage.ApplicationDataContainer] = js.native
  /* CompleteClass */
  override var locality: typings.winrt.Windows.Storage.ApplicationDataLocality = js.native
  /* CompleteClass */
  override var name: String = js.native
  /* CompleteClass */
  override var values: IPropertySet = js.native
  /* CompleteClass */
  override def createContainer(name: String, disposition: typings.winrt.Windows.Storage.ApplicationDataCreateDisposition): typings.winrt.Windows.Storage.ApplicationDataContainer = js.native
  /* CompleteClass */
  override def deleteContainer(name: String): Unit = js.native
}

