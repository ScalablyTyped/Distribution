package typings
package winrtLib.WindowsNs.FoundationNs.CollectionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Foundation.Collections.ValueSet")
@js.native
class ValueSet () extends IPropertySet {
  /* CompleteClass */
  override var onmapchanged: js.Any = js.native
  /* CompleteClass */
  override var size: scala.Double = js.native
  /* CompleteClass */
  override def clear(): scala.Unit = js.native
  /* CompleteClass */
  override def first(): IIterator[IKeyValuePair[java.lang.String, js.Any]] = js.native
  /* CompleteClass */
  override def getView(): IMapView[java.lang.String, js.Any] = js.native
  /* CompleteClass */
  override def hasKey(key: java.lang.String): scala.Boolean = js.native
  /* CompleteClass */
  override def insert(key: java.lang.String, value: js.Any): scala.Boolean = js.native
  /* CompleteClass */
  override def lookup(key: java.lang.String): js.Any = js.native
  /* CompleteClass */
  override def remove(key: java.lang.String): scala.Unit = js.native
}

