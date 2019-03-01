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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clear")(clear)
    __obj.updateDynamic("first")(first)
    __obj.updateDynamic("getView")(getView)
    __obj.updateDynamic("hasKey")(hasKey)
    __obj.updateDynamic("insert")(insert)
    __obj.updateDynamic("lookup")(lookup)
    __obj.updateDynamic("onmapchanged")(onmapchanged)
    __obj.updateDynamic("remove")(remove)
    __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[IPropertySet]
  }
}

