package typings.winrt.Windows.Foundation.Collections

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Foundation.Collections.ValueSet")
@js.native
class ValueSet ()
  extends IObservableMap[String, js.Any] {
  /* CompleteClass */
  override var onmapchanged: js.Any = js.native
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

