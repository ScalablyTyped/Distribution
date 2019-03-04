package typings
package winrtLib.WindowsNs.FoundationNs.CollectionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPropertySet
  extends IObservableMap[java.lang.String, js.Any]

object IPropertySet {
  @scala.inline
  def apply(
    clear: js.Function0[scala.Unit],
    first: js.Function0[IIterator[IKeyValuePair[java.lang.String, js.Any]]],
    getView: js.Function0[IMapView[java.lang.String, js.Any]],
    hasKey: js.Function1[java.lang.String, scala.Boolean],
    insert: js.Function2[java.lang.String, js.Any, scala.Boolean],
    lookup: js.Function1[java.lang.String, js.Any],
    onmapchanged: js.Any,
    remove: js.Function1[java.lang.String, scala.Unit],
    size: scala.Double
  ): IPropertySet = {
    val __obj = js.Dynamic.literal(clear = clear, first = first, getView = getView, hasKey = hasKey, insert = insert, lookup = lookup, onmapchanged = onmapchanged, remove = remove, size = size)
  
    __obj.asInstanceOf[IPropertySet]
  }
}

