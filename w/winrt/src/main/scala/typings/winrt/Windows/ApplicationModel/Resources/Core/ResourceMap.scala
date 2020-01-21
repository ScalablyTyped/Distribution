package typings.winrt.Windows.ApplicationModel.Resources.Core

import typings.winrt.AnonFirst
import typings.winrt.Windows.Foundation.Collections.IIterator
import typings.winrt.Windows.Foundation.Collections.IKeyValuePair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceMap")
@js.native
class ResourceMap () extends IResourceMap {
  /* CompleteClass */
  override var size: Double = js.native
  /* CompleteClass */
  override def first(): IIterator[IKeyValuePair[String, NamedResource]] = js.native
  /* CompleteClass */
  override def hasKey(key: String): Boolean = js.native
  /* CompleteClass */
  override def lookup(key: String): NamedResource = js.native
  /* CompleteClass */
  override def split(): AnonFirst[String, NamedResource] = js.native
}

