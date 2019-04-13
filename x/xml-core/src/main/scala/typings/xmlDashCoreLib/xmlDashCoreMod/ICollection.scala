package typings
package xmlDashCoreLib.xmlDashCoreMod

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
    Add: I => scala.Unit,
    Clear: () => scala.Unit,
    Count: scala.Double,
    Every: js.Function3[/* value */ I, /* index */ scala.Double, /* array */ js.Array[I], scala.Boolean] => scala.Boolean,
    Filter: js.Function3[/* item */ I, /* index */ scala.Double, /* array */ js.Array[I], scala.Boolean] => ICollection[I],
    ForEach: js.Function3[/* item */ I, /* index */ scala.Double, /* array */ js.Array[I], scala.Unit] => scala.Unit,
    GetIterator: () => js.Array[I],
    IsEmpty: () => scala.Boolean,
    Item: scala.Double => I | scala.Null,
    Map: js.Function3[/* item */ I, /* index */ scala.Double, /* array */ js.Array[I], js.Any] => ICollection[js.Any],
    Pop: () => js.UndefOr[I],
    RemoveAt: scala.Double => scala.Unit,
    Some: js.Function3[/* value */ I, /* index */ scala.Double, /* array */ js.Array[I], scala.Boolean] => scala.Boolean,
    Sort: js.Function2[/* a */ I, /* b */ I, scala.Double] => ICollection[I]
  ): ICollection[I] = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction1(Add), Clear = js.Any.fromFunction0(Clear), Count = Count, Every = js.Any.fromFunction1(Every), Filter = js.Any.fromFunction1(Filter), ForEach = js.Any.fromFunction1(ForEach), GetIterator = js.Any.fromFunction0(GetIterator), IsEmpty = js.Any.fromFunction0(IsEmpty), Item = js.Any.fromFunction1(Item), Map = js.Any.fromFunction1(Map), Pop = js.Any.fromFunction0(Pop), RemoveAt = js.Any.fromFunction1(RemoveAt), Some = js.Any.fromFunction1(Some), Sort = js.Any.fromFunction1(Sort))
  
    __obj.asInstanceOf[ICollection[I]]
  }
}

