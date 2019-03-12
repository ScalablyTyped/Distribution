package typings
package winjsLib.WinJSNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a selection of ListView items.
  **/
trait ISelection[T] extends js.Object {
  //#region Methods
  /**
    * Adds one or more items to the selection.
    * @param items The indexes or keys of the items to add. You can provide different types of objects for the items parameter: you can specify an index, a key, or a range of indexes. It can also be an array that contains one or more of these objects. For more info, see the Remarks section.
    * @returns A Promise that is fulfilled when the operation completes.
    **/
  def add(items: js.Any): winjsLib.WinJSNs.Promise[_]
  /**
    * Clears the selection.
    * @returns A Promise that is fulfilled when the clear operation completes.
    **/
  def clear(): winjsLib.WinJSNs.Promise[_]
  /**
    * Returns the number of items in the selection.
    * @returns The number of items in the selection.
    **/
  def count(): scala.Double
  /**
    * Returns a list of the indexes for the items in the selection.
    * @returns The list of indexes for the items in the selection as an array of Number objects.
    **/
  def getIndices(): js.Array[scala.Double]
  /**
    * Returns an array that contains the items in the selection.
    * @returns A Promise that contains an array of the requested IItem objects.
    **/
  def getItems(): winjsLib.WinJSNs.Promise[js.Array[IItem[T]]]
  /**
    * Gets an array of the index ranges for the selected items.
    * @returns An array that contains an ISelectionRange object for each index range in the selection.
    **/
  def getRanges(): js.Array[ISelectionRange]
  /**
    * Returns a value that indicates whether the selection contains every item in the data source.
    * @returns true if the selection contains every item in the data source; otherwise, false.
    **/
  def isEverything(): scala.Boolean
  /**
    * Removes the specified items from the selection.
    * @param items The indexes or keys of the items to remove. You can provide different types of objects for the items parameter: you can specify an index, a key, or a range of indexes. It can also be an array that contains one or more of these objects. For more info, see the Remarks section.
    * @returns A Promise that is fulfilled when the operation completes.
    **/
  def remove(items: js.Any): winjsLib.WinJSNs.Promise[_]
  /**
    * Adds all the items in the ListView to the selection.
    **/
  def selectAll(): scala.Unit
  /**
    * Clears the current selection and replaces it with the specified items.
    * @param items The indexes or keys of the items that make up the selection. You can provide different types of objects for the items parameter: you can specify an index, a key, or a range of indexes. It can also be an array that contains one or more of these objects. For more info, see the Remarks section.
    * @returns A Promise that is fulfilled when the operation completes.
    **/
  def set(items: js.Any): winjsLib.WinJSNs.Promise[_]
}

object ISelection {
  @scala.inline
  def apply[T](
    add: js.Any => winjsLib.WinJSNs.Promise[_],
    clear: () => winjsLib.WinJSNs.Promise[_],
    count: () => scala.Double,
    getIndices: () => js.Array[scala.Double],
    getItems: () => winjsLib.WinJSNs.Promise[js.Array[IItem[T]]],
    getRanges: () => js.Array[ISelectionRange],
    isEverything: () => scala.Boolean,
    remove: js.Any => winjsLib.WinJSNs.Promise[_],
    selectAll: () => scala.Unit,
    set: js.Any => winjsLib.WinJSNs.Promise[_]
  ): ISelection[T] = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), clear = js.Any.fromFunction0(clear), count = js.Any.fromFunction0(count), getIndices = js.Any.fromFunction0(getIndices), getItems = js.Any.fromFunction0(getItems), getRanges = js.Any.fromFunction0(getRanges), isEverything = js.Any.fromFunction0(isEverything), remove = js.Any.fromFunction1(remove), selectAll = js.Any.fromFunction0(selectAll), set = js.Any.fromFunction1(set))
  
    __obj.asInstanceOf[ISelection[T]]
  }
}

