package typings.winrt.WindowsNs.MediaNs.MediaPropertiesNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IIterator
import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IKeyValuePair
import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IMap
import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IMapView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Media.MediaProperties.MediaPropertySet")
@js.native
class MediaPropertySet ()
  extends IMap[String, js.Any] {
  /* CompleteClass */
  override var size: Double = js.native
  /* CompleteClass */
  override def clear(): Unit = js.native
  /* CompleteClass */
  override def first(): IIterator[IKeyValuePair[String, js.Any]] = js.native
  /* CompleteClass */
  override def getView(): IMapView[String, js.Any] = js.native
  /* CompleteClass */
  override def hasKey(key: String): Boolean = js.native
  /* CompleteClass */
  override def insert(key: String, value: js.Any): Boolean = js.native
  /* CompleteClass */
  override def lookup(key: String): js.Any = js.native
  /* CompleteClass */
  override def remove(key: String): Unit = js.native
}

