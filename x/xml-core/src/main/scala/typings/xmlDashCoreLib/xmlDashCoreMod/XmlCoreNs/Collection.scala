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
    Add: I => scala.Unit,
    Clear: () => scala.Unit,
    Count: scala.Double,
    Every: js.Function3[/* value */ I, /* index */ scala.Double, /* array */ js.Array[I], scala.Boolean] => scala.Boolean,
    Filter: js.Function3[/* item */ I, /* index */ scala.Double, /* array */ js.Array[I], scala.Boolean] => Collection[I],
    ForEach: js.Function3[/* item */ I, /* index */ scala.Double, /* array */ js.Array[I], scala.Unit] => scala.Unit,
    GetIterator: () => js.Array[I],
    IsEmpty: () => scala.Boolean,
    Item: scala.Double => I | scala.Null,
    Map: js.Function3[/* item */ I, /* index */ scala.Double, /* array */ js.Array[I], js.Any] => Collection[js.Any],
    Pop: () => js.UndefOr[I],
    RemoveAt: scala.Double => scala.Unit,
    Some: js.Function3[/* value */ I, /* index */ scala.Double, /* array */ js.Array[I], scala.Boolean] => scala.Boolean,
    Sort: js.Function2[/* a */ I, /* b */ I, scala.Double] => Collection[I],
    items: js.Array[I]
  ): Collection[I] = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction1(Add), Clear = js.Any.fromFunction0(Clear), Count = Count, Every = js.Any.fromFunction1(Every), Filter = js.Any.fromFunction1(Filter), ForEach = js.Any.fromFunction1(ForEach), GetIterator = js.Any.fromFunction0(GetIterator), IsEmpty = js.Any.fromFunction0(IsEmpty), Item = js.Any.fromFunction1(Item), Map = js.Any.fromFunction1(Map), Pop = js.Any.fromFunction0(Pop), RemoveAt = js.Any.fromFunction1(RemoveAt), Some = js.Any.fromFunction1(Some), Sort = js.Any.fromFunction1(Sort), items = items)
  
    __obj.asInstanceOf[Collection[I]]
  }
}

