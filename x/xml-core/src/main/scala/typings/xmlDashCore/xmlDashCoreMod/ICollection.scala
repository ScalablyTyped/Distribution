package typings.xmlDashCore.xmlDashCoreMod

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
  val Count: Double
  def Add(item: I): Unit
  def Clear(): Unit
  def Every(cb: js.Function3[/* value */ I, /* index */ Double, /* array */ js.Array[I], Boolean]): Boolean
  def Filter(cb: js.Function3[/* item */ I, /* index */ Double, /* array */ js.Array[I], Boolean]): ICollection[I]
  def ForEach(cb: js.Function3[/* item */ I, /* index */ Double, /* array */ js.Array[I], Unit]): Unit
  def GetIterator(): js.Array[I]
  def IsEmpty(): Boolean
  def Item(index: Double): I | Null
  def Map[U](cb: js.Function3[/* item */ I, /* index */ Double, /* array */ js.Array[I], U]): ICollection[U]
  def Pop(): js.UndefOr[I]
  def RemoveAt(index: Double): Unit
  def Some(cb: js.Function3[/* value */ I, /* index */ Double, /* array */ js.Array[I], Boolean]): Boolean
  def Sort(cb: js.Function2[/* a */ I, /* b */ I, Double]): ICollection[I]
}

object ICollection {
  @scala.inline
  def apply[I](
    Add: I => Unit,
    Clear: () => Unit,
    Count: Double,
    Every: js.Function3[/* value */ I, /* index */ Double, /* array */ js.Array[I], Boolean] => Boolean,
    Filter: js.Function3[/* item */ I, /* index */ Double, /* array */ js.Array[I], Boolean] => ICollection[I],
    ForEach: js.Function3[/* item */ I, /* index */ Double, /* array */ js.Array[I], Unit] => Unit,
    GetIterator: () => js.Array[I],
    IsEmpty: () => Boolean,
    Item: Double => I | Null,
    Map: js.Function3[/* item */ I, /* index */ Double, /* array */ js.Array[I], js.Any] => ICollection[js.Any],
    Pop: () => js.UndefOr[I],
    RemoveAt: Double => Unit,
    Some: js.Function3[/* value */ I, /* index */ Double, /* array */ js.Array[I], Boolean] => Boolean,
    Sort: js.Function2[/* a */ I, /* b */ I, Double] => ICollection[I]
  ): ICollection[I] = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction1(Add), Clear = js.Any.fromFunction0(Clear), Count = Count, Every = js.Any.fromFunction1(Every), Filter = js.Any.fromFunction1(Filter), ForEach = js.Any.fromFunction1(ForEach), GetIterator = js.Any.fromFunction0(GetIterator), IsEmpty = js.Any.fromFunction0(IsEmpty), Item = js.Any.fromFunction1(Item), Map = js.Any.fromFunction1(Map), Pop = js.Any.fromFunction0(Pop), RemoveAt = js.Any.fromFunction1(RemoveAt), Some = js.Any.fromFunction1(Some), Sort = js.Any.fromFunction1(Sort))
  
    __obj.asInstanceOf[ICollection[I]]
  }
}

