package typings.winrt.WindowsNs.ApplicationModelNs.ResourcesNs.CoreNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IIterator
import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IKeyValuePair
import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IMapView
import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IObservableMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceQualifierObservableMap")
@js.native
class ResourceQualifierObservableMap () extends IObservableMap[String, String] {
  /* CompleteClass */
  override var onmapchanged: js.Any = js.native
  /* CompleteClass */
  override var size: Double = js.native
  /* CompleteClass */
  override def clear(): Unit = js.native
  /* CompleteClass */
  override def first(): IIterator[IKeyValuePair[String, String]] = js.native
  /* CompleteClass */
  override def getView(): IMapView[String, String] = js.native
  /* CompleteClass */
  override def hasKey(key: String): Boolean = js.native
  /* CompleteClass */
  override def insert(key: String, value: String): Boolean = js.native
  /* CompleteClass */
  override def lookup(key: String): String = js.native
  /* CompleteClass */
  override def remove(key: String): Unit = js.native
}

