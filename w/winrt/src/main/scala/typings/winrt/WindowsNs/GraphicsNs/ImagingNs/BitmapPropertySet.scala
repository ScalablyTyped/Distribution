package typings.winrt.WindowsNs.GraphicsNs.ImagingNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IIterator
import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IKeyValuePair
import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IMap
import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IMapView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Graphics.Imaging.BitmapPropertySet")
@js.native
class BitmapPropertySet () extends IMap[String, BitmapTypedValue] {
  /* CompleteClass */
  override var size: Double = js.native
  /* CompleteClass */
  override def clear(): Unit = js.native
  /* CompleteClass */
  override def first(): IIterator[IKeyValuePair[String, BitmapTypedValue]] = js.native
  /* CompleteClass */
  override def getView(): IMapView[String, BitmapTypedValue] = js.native
  /* CompleteClass */
  override def hasKey(key: String): Boolean = js.native
  /* CompleteClass */
  override def insert(key: String, value: BitmapTypedValue): Boolean = js.native
  /* CompleteClass */
  override def lookup(key: String): BitmapTypedValue = js.native
  /* CompleteClass */
  override def remove(key: String): Unit = js.native
}

