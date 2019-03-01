package typings
package xmlDashCoreLib.xmlDashCoreMod.XmlCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Collection[I] extends ICollection[I] {
  var items: js.Array[I]
}

object Collection {
  @scala.inline
  def apply[I](
    Add: js.Function1[I, scala.Unit],
    Clear: js.Function0[scala.Unit],
    Count: scala.Double,
    Every: js.Function1[
      js.Function3[/* value */ I, /* index */ scala.Double, /* array */ js.Array[I], scala.Boolean], 
      scala.Boolean
    ],
    Filter: js.Function1[
      js.Function3[/* item */ I, /* index */ scala.Double, /* array */ js.Array[I], scala.Boolean], 
      Collection[I]
    ],
    ForEach: js.Function1[
      js.Function3[/* item */ I, /* index */ scala.Double, /* array */ js.Array[I], scala.Unit], 
      scala.Unit
    ],
    GetIterator: js.Function0[js.Array[I]],
    IsEmpty: js.Function0[scala.Boolean],
    Item: js.Function1[scala.Double, I | scala.Null],
    Map: js.Function1[
      js.Function3[/* item */ I, /* index */ scala.Double, /* array */ js.Array[I], js.Any], 
      Collection[js.Any]
    ],
    Pop: js.Function0[js.UndefOr[I]],
    RemoveAt: js.Function1[scala.Double, scala.Unit],
    Some: js.Function1[
      js.Function3[/* value */ I, /* index */ scala.Double, /* array */ js.Array[I], scala.Boolean], 
      scala.Boolean
    ],
    Sort: js.Function1[js.Function2[/* a */ I, /* b */ I, scala.Double], Collection[I]],
    items: js.Array[I]
  ): Collection[I] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Add")(Add)
    __obj.updateDynamic("Clear")(Clear)
    __obj.updateDynamic("Count")(Count)
    __obj.updateDynamic("Every")(Every)
    __obj.updateDynamic("Filter")(Filter)
    __obj.updateDynamic("ForEach")(ForEach)
    __obj.updateDynamic("GetIterator")(GetIterator)
    __obj.updateDynamic("IsEmpty")(IsEmpty)
    __obj.updateDynamic("Item")(Item)
    __obj.updateDynamic("Map")(Map)
    __obj.updateDynamic("Pop")(Pop)
    __obj.updateDynamic("RemoveAt")(RemoveAt)
    __obj.updateDynamic("Some")(Some)
    __obj.updateDynamic("Sort")(Sort)
    __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[Collection[I]]
  }
}

