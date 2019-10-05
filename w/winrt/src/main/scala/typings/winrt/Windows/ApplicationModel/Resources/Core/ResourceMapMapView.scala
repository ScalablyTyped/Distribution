package typings.winrt.Windows.ApplicationModel.Resources.Core

import typings.winrt.Anon_First
import typings.winrt.Windows.Foundation.Collections.IIterator
import typings.winrt.Windows.Foundation.Collections.IKeyValuePair
import typings.winrt.Windows.Foundation.Collections.IMapView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceMapMapView")
@js.native
class ResourceMapMapView () extends IMapView[String, ResourceMap] {
  /* CompleteClass */
  override var size: Double = js.native
  /* CompleteClass */
  override def first(): IIterator[IKeyValuePair[String, ResourceMap]] = js.native
  /* CompleteClass */
  override def hasKey(key: String): Boolean = js.native
  /* CompleteClass */
  override def lookup(key: String): ResourceMap = js.native
  /* CompleteClass */
  override def split(): Anon_First[String, ResourceMap] = js.native
}

