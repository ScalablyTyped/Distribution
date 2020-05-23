package typings.winrt.global.Windows.Graphics.Imaging

import typings.winrt.Windows.Foundation.Collections.IIterator
import typings.winrt.Windows.Foundation.Collections.IKeyValuePair
import typings.winrt.Windows.Foundation.Collections.IMapView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Graphics.Imaging.BitmapPropertySet")
@js.native
class BitmapPropertySet ()
  extends typings.winrt.Windows.Graphics.Imaging.BitmapPropertySet {
  /* CompleteClass */
  override var size: Double = js.native
  /* CompleteClass */
  override def clear(): Unit = js.native
  /* CompleteClass */
  override def first(): IIterator[IKeyValuePair[String, typings.winrt.Windows.Graphics.Imaging.BitmapTypedValue]] = js.native
  /* CompleteClass */
  override def getView(): IMapView[String, typings.winrt.Windows.Graphics.Imaging.BitmapTypedValue] = js.native
  /* CompleteClass */
  override def hasKey(key: String): Boolean = js.native
  /* CompleteClass */
  override def insert(key: String, value: typings.winrt.Windows.Graphics.Imaging.BitmapTypedValue): Boolean = js.native
  /* CompleteClass */
  override def lookup(key: String): typings.winrt.Windows.Graphics.Imaging.BitmapTypedValue = js.native
  /* CompleteClass */
  override def remove(key: String): Unit = js.native
}

