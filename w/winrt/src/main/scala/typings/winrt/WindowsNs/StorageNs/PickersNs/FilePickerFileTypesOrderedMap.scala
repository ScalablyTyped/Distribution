package typings.winrt.WindowsNs.StorageNs.PickersNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IIterator
import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IKeyValuePair
import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IMap
import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IMapView
import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.Pickers.FilePickerFileTypesOrderedMap")
@js.native
class FilePickerFileTypesOrderedMap () extends IMap[String, IVector[String]] {
  /* CompleteClass */
  override var size: Double = js.native
  /* CompleteClass */
  override def clear(): Unit = js.native
  /* CompleteClass */
  override def first(): IIterator[IKeyValuePair[String, IVector[String]]] = js.native
  /* CompleteClass */
  override def getView(): IMapView[String, IVector[String]] = js.native
  /* CompleteClass */
  override def hasKey(key: String): Boolean = js.native
  /* CompleteClass */
  override def insert(key: String, value: IVector[String]): Boolean = js.native
  /* CompleteClass */
  override def lookup(key: String): IVector[String] = js.native
  /* CompleteClass */
  override def remove(key: String): Unit = js.native
}

