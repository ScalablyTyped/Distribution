package typings.winrt.WindowsNs.ApplicationModelNs.ResourcesNs.CoreNs

import typings.winrt.Anon_Items
import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IIterator
import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IKeyValuePair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceMapMapViewIterator")
@js.native
class ResourceMapMapViewIterator () extends IIterator[IKeyValuePair[String, ResourceMap]] {
  /* CompleteClass */
  override var current: IKeyValuePair[String, ResourceMap] = js.native
  /* CompleteClass */
  override var hasCurrent: Boolean = js.native
  /* CompleteClass */
  override def getMany(): Anon_Items[IKeyValuePair[String, ResourceMap]] = js.native
  /* CompleteClass */
  override def moveNext(): Boolean = js.native
}

