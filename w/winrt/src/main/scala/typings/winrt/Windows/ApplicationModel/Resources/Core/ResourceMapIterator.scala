package typings.winrt.Windows.ApplicationModel.Resources.Core

import typings.winrt.AnonItems
import typings.winrt.Windows.Foundation.Collections.IIterator
import typings.winrt.Windows.Foundation.Collections.IKeyValuePair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceMapIterator")
@js.native
class ResourceMapIterator () extends IIterator[IKeyValuePair[String, NamedResource]] {
  /* CompleteClass */
  override var current: IKeyValuePair[String, NamedResource] = js.native
  /* CompleteClass */
  override var hasCurrent: Boolean = js.native
  /* CompleteClass */
  override def getMany(): AnonItems[IKeyValuePair[String, NamedResource]] = js.native
  /* CompleteClass */
  override def moveNext(): Boolean = js.native
}

