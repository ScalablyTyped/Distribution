package typings
package xmlDashCoreLib.xmlDashCoreMod.XmlCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// types
/**
  * Base interface for collections
  * 
  * @interface ICollection
  * @template I
  */
trait ICollection[I] extends js.Object {
  val Count: scala.Double
  def Add(item: I): scala.Unit
  def Clear(): scala.Unit
  def Every(cb: js.Function3[/* value */ I, /* index */ scala.Double, /* array */ js.Array[I], scala.Boolean]): scala.Boolean
  def Filter(cb: js.Function3[/* item */ I, /* index */ scala.Double, /* array */ js.Array[I], scala.Boolean]): ICollection[I]
  def ForEach(cb: js.Function3[/* item */ I, /* index */ scala.Double, /* array */ js.Array[I], scala.Unit]): scala.Unit
  def GetIterator(): js.Array[I]
  def IsEmpty(): scala.Boolean
  def Item(index: scala.Double): I | scala.Null
  def Map[U](cb: js.Function3[/* item */ I, /* index */ scala.Double, /* array */ js.Array[I], U]): ICollection[U]
  def Pop(): js.UndefOr[I]
  def RemoveAt(index: scala.Double): scala.Unit
  def Some(cb: js.Function3[/* value */ I, /* index */ scala.Double, /* array */ js.Array[I], scala.Boolean]): scala.Boolean
  def Sort(cb: js.Function2[/* a */ I, /* b */ I, scala.Double]): ICollection[I]
}

object ICollection {
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
      ICollection[I]
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
      ICollection[js.Any]
    ],
    Pop: js.Function0[js.UndefOr[I]],
    RemoveAt: js.Function1[scala.Double, scala.Unit],
    Some: js.Function1[
      js.Function3[/* value */ I, /* index */ scala.Double, /* array */ js.Array[I], scala.Boolean], 
      scala.Boolean
    ],
    Sort: js.Function1[js.Function2[/* a */ I, /* b */ I, scala.Double], ICollection[I]]
  ): ICollection[I] = {
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
    __obj.asInstanceOf[ICollection[I]]
  }
}

