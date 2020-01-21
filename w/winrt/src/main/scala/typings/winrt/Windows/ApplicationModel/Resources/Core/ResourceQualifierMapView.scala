package typings.winrt.Windows.ApplicationModel.Resources.Core

import typings.winrt.AnonFirst
import typings.winrt.Windows.Foundation.Collections.IIterator
import typings.winrt.Windows.Foundation.Collections.IKeyValuePair
import typings.winrt.Windows.Foundation.Collections.IMapView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceQualifierMapView")
@js.native
class ResourceQualifierMapView () extends IMapView[String, String] {
  /* CompleteClass */
  override var size: Double = js.native
  /* CompleteClass */
  override def first(): IIterator[IKeyValuePair[String, String]] = js.native
  /* CompleteClass */
  override def hasKey(key: String): Boolean = js.native
  /* CompleteClass */
  override def lookup(key: String): String = js.native
  /* CompleteClass */
  override def split(): AnonFirst[String, String] = js.native
}

