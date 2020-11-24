package typings.xmlCore.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICollection[I] extends js.Object {
  
  def Add(item: I): Unit = js.native
  
  def Clear(): Unit = js.native
  
  val Count: Double = js.native
  
  def Every(cb: js.Function3[/* value */ I, /* index */ Double, /* array */ js.Array[I], Boolean]): Boolean = js.native
  
  def Filter(cb: js.Function3[/* item */ I, /* index */ Double, /* array */ js.Array[I], Boolean]): ICollection[I] = js.native
  
  def ForEach(cb: js.Function3[/* item */ I, /* index */ Double, /* array */ js.Array[I], Unit]): Unit = js.native
  
  def GetIterator(): js.Array[I] = js.native
  
  def IsEmpty(): Boolean = js.native
  
  def Item(index: Double): I | Null = js.native
  
  def Map[U](cb: js.Function3[/* item */ I, /* index */ Double, /* array */ js.Array[I], U]): ICollection[U] = js.native
  
  def Pop(): js.UndefOr[I] = js.native
  
  def RemoveAt(index: Double): Unit = js.native
  
  def Some(cb: js.Function3[/* value */ I, /* index */ Double, /* array */ js.Array[I], Boolean]): Boolean = js.native
  
  def Sort(cb: js.Function2[/* a */ I, /* b */ I, Double]): ICollection[I] = js.native
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
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction1(Add), Clear = js.Any.fromFunction0(Clear), Count = Count.asInstanceOf[js.Any], Every = js.Any.fromFunction1(Every), Filter = js.Any.fromFunction1(Filter), ForEach = js.Any.fromFunction1(ForEach), GetIterator = js.Any.fromFunction0(GetIterator), IsEmpty = js.Any.fromFunction0(IsEmpty), Item = js.Any.fromFunction1(Item), Map = js.Any.fromFunction1(Map), Pop = js.Any.fromFunction0(Pop), RemoveAt = js.Any.fromFunction1(RemoveAt), Some = js.Any.fromFunction1(Some), Sort = js.Any.fromFunction1(Sort))
    __obj.asInstanceOf[ICollection[I]]
  }
  
  @scala.inline
  implicit class ICollectionOps[Self <: ICollection[_], I] (val x: Self with ICollection[I]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAdd(value: I => Unit): Self = this.set("Add", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClear(value: () => Unit): Self = this.set("Clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCount(value: Double): Self = this.set("Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvery(
      value: js.Function3[/* value */ I, /* index */ Double, /* array */ js.Array[I], Boolean] => Boolean
    ): Self = this.set("Every", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFilter(
      value: js.Function3[/* item */ I, /* index */ Double, /* array */ js.Array[I], Boolean] => ICollection[I]
    ): Self = this.set("Filter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setForEach(value: js.Function3[/* item */ I, /* index */ Double, /* array */ js.Array[I], Unit] => Unit): Self = this.set("ForEach", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetIterator(value: () => js.Array[I]): Self = this.set("GetIterator", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsEmpty(value: () => Boolean): Self = this.set("IsEmpty", js.Any.fromFunction0(value))
    
    @scala.inline
    def setItem(value: Double => I | Null): Self = this.set("Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMap(
      value: js.Function3[/* item */ I, /* index */ Double, /* array */ js.Array[I], js.Any] => ICollection[js.Any]
    ): Self = this.set("Map", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPop(value: () => js.UndefOr[I]): Self = this.set("Pop", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveAt(value: Double => Unit): Self = this.set("RemoveAt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSome(
      value: js.Function3[/* value */ I, /* index */ Double, /* array */ js.Array[I], Boolean] => Boolean
    ): Self = this.set("Some", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSort(value: js.Function2[/* a */ I, /* b */ I, Double] => ICollection[I]): Self = this.set("Sort", js.Any.fromFunction1(value))
  }
}
