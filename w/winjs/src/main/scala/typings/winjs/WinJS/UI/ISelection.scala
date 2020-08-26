package typings.winjs.WinJS.UI

import typings.winjs.WinJS.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a selection of ListView items.
  **/
@js.native
trait ISelection[T] extends js.Object {
  //#region Methods
  /**
    * Adds one or more items to the selection.
    * @param items The indexes or keys of the items to add. You can provide different types of objects for the items parameter: you can specify an index, a key, or a range of indexes. It can also be an array that contains one or more of these objects. For more info, see the Remarks section.
    * @returns A Promise that is fulfilled when the operation completes.
    **/
  def add(items: js.Any): Promise[_] = js.native
  /**
    * Clears the selection.
    * @returns A Promise that is fulfilled when the clear operation completes.
    **/
  def clear(): Promise[_] = js.native
  /**
    * Returns the number of items in the selection.
    * @returns The number of items in the selection.
    **/
  def count(): Double = js.native
  /**
    * Returns a list of the indexes for the items in the selection.
    * @returns The list of indexes for the items in the selection as an array of Number objects.
    **/
  def getIndices(): js.Array[Double] = js.native
  /**
    * Returns an array that contains the items in the selection.
    * @returns A Promise that contains an array of the requested IItem objects.
    **/
  def getItems(): Promise[js.Array[IItem[T]]] = js.native
  /**
    * Gets an array of the index ranges for the selected items.
    * @returns An array that contains an ISelectionRange object for each index range in the selection.
    **/
  def getRanges(): js.Array[ISelectionRange] = js.native
  /**
    * Returns a value that indicates whether the selection contains every item in the data source.
    * @returns true if the selection contains every item in the data source; otherwise, false.
    **/
  def isEverything(): Boolean = js.native
  /**
    * Removes the specified items from the selection.
    * @param items The indexes or keys of the items to remove. You can provide different types of objects for the items parameter: you can specify an index, a key, or a range of indexes. It can also be an array that contains one or more of these objects. For more info, see the Remarks section.
    * @returns A Promise that is fulfilled when the operation completes.
    **/
  def remove(items: js.Any): Promise[_] = js.native
  /**
    * Adds all the items in the ListView to the selection.
    **/
  def selectAll(): Unit = js.native
  /**
    * Clears the current selection and replaces it with the specified items.
    * @param items The indexes or keys of the items that make up the selection. You can provide different types of objects for the items parameter: you can specify an index, a key, or a range of indexes. It can also be an array that contains one or more of these objects. For more info, see the Remarks section.
    * @returns A Promise that is fulfilled when the operation completes.
    **/
  def set(items: js.Any): Promise[_] = js.native
}

object ISelection {
  @scala.inline
  def apply[T](
    add: js.Any => Promise[_],
    clear: () => Promise[_],
    count: () => Double,
    getIndices: () => js.Array[Double],
    getItems: () => Promise[js.Array[IItem[T]]],
    getRanges: () => js.Array[ISelectionRange],
    isEverything: () => Boolean,
    remove: js.Any => Promise[_],
    selectAll: () => Unit,
    set: js.Any => Promise[_]
  ): ISelection[T] = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), clear = js.Any.fromFunction0(clear), count = js.Any.fromFunction0(count), getIndices = js.Any.fromFunction0(getIndices), getItems = js.Any.fromFunction0(getItems), getRanges = js.Any.fromFunction0(getRanges), isEverything = js.Any.fromFunction0(isEverything), remove = js.Any.fromFunction1(remove), selectAll = js.Any.fromFunction0(selectAll), set = js.Any.fromFunction1(set))
    __obj.asInstanceOf[ISelection[T]]
  }
  @scala.inline
  implicit class ISelectionOps[Self <: ISelection[_], T] (val x: Self with ISelection[T]) extends AnyVal {
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
    def setAdd(value: js.Any => Promise[_]): Self = this.set("add", js.Any.fromFunction1(value))
    @scala.inline
    def setClear(value: () => Promise[_]): Self = this.set("clear", js.Any.fromFunction0(value))
    @scala.inline
    def setCount(value: () => Double): Self = this.set("count", js.Any.fromFunction0(value))
    @scala.inline
    def setGetIndices(value: () => js.Array[Double]): Self = this.set("getIndices", js.Any.fromFunction0(value))
    @scala.inline
    def setGetItems(value: () => Promise[js.Array[IItem[T]]]): Self = this.set("getItems", js.Any.fromFunction0(value))
    @scala.inline
    def setGetRanges(value: () => js.Array[ISelectionRange]): Self = this.set("getRanges", js.Any.fromFunction0(value))
    @scala.inline
    def setIsEverything(value: () => Boolean): Self = this.set("isEverything", js.Any.fromFunction0(value))
    @scala.inline
    def setRemove(value: js.Any => Promise[_]): Self = this.set("remove", js.Any.fromFunction1(value))
    @scala.inline
    def setSelectAll(value: () => Unit): Self = this.set("selectAll", js.Any.fromFunction0(value))
    @scala.inline
    def setSet(value: js.Any => Promise[_]): Self = this.set("set", js.Any.fromFunction1(value))
  }
  
}

