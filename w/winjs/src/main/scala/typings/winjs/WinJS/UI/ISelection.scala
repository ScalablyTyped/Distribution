package typings.winjs.WinJS.UI

import typings.winjs.WinJS.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a selection of ListView items.
  **/
trait ISelection[T] extends StObject {
  
  //#region Methods
  /**
    * Adds one or more items to the selection.
    * @param items The indexes or keys of the items to add. You can provide different types of objects for the items parameter: you can specify an index, a key, or a range of indexes. It can also be an array that contains one or more of these objects. For more info, see the Remarks section.
    * @returns A Promise that is fulfilled when the operation completes.
    **/
  def add(items: Any): Promise[Any]
  
  /**
    * Clears the selection.
    * @returns A Promise that is fulfilled when the clear operation completes.
    **/
  def clear(): Promise[Any]
  
  /**
    * Returns the number of items in the selection.
    * @returns The number of items in the selection.
    **/
  def count(): Double
  
  /**
    * Returns a list of the indexes for the items in the selection.
    * @returns The list of indexes for the items in the selection as an array of Number objects.
    **/
  def getIndices(): js.Array[Double]
  
  /**
    * Returns an array that contains the items in the selection.
    * @returns A Promise that contains an array of the requested IItem objects.
    **/
  def getItems(): Promise[js.Array[IItem[T]]]
  
  /**
    * Gets an array of the index ranges for the selected items.
    * @returns An array that contains an ISelectionRange object for each index range in the selection.
    **/
  def getRanges(): js.Array[ISelectionRange]
  
  /**
    * Returns a value that indicates whether the selection contains every item in the data source.
    * @returns true if the selection contains every item in the data source; otherwise, false.
    **/
  def isEverything(): Boolean
  
  /**
    * Removes the specified items from the selection.
    * @param items The indexes or keys of the items to remove. You can provide different types of objects for the items parameter: you can specify an index, a key, or a range of indexes. It can also be an array that contains one or more of these objects. For more info, see the Remarks section.
    * @returns A Promise that is fulfilled when the operation completes.
    **/
  def remove(items: Any): Promise[Any]
  
  /**
    * Adds all the items in the ListView to the selection.
    **/
  def selectAll(): Unit
  
  /**
    * Clears the current selection and replaces it with the specified items.
    * @param items The indexes or keys of the items that make up the selection. You can provide different types of objects for the items parameter: you can specify an index, a key, or a range of indexes. It can also be an array that contains one or more of these objects. For more info, see the Remarks section.
    * @returns A Promise that is fulfilled when the operation completes.
    **/
  def set(items: Any): Promise[Any]
}
object ISelection {
  
  inline def apply[T](
    add: Any => Promise[Any],
    clear: () => Promise[Any],
    count: () => Double,
    getIndices: () => js.Array[Double],
    getItems: () => Promise[js.Array[IItem[T]]],
    getRanges: () => js.Array[ISelectionRange],
    isEverything: () => Boolean,
    remove: Any => Promise[Any],
    selectAll: () => Unit,
    set: Any => Promise[Any]
  ): ISelection[T] = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), clear = js.Any.fromFunction0(clear), count = js.Any.fromFunction0(count), getIndices = js.Any.fromFunction0(getIndices), getItems = js.Any.fromFunction0(getItems), getRanges = js.Any.fromFunction0(getRanges), isEverything = js.Any.fromFunction0(isEverything), remove = js.Any.fromFunction1(remove), selectAll = js.Any.fromFunction0(selectAll), set = js.Any.fromFunction1(set))
    __obj.asInstanceOf[ISelection[T]]
  }
  
  extension [Self <: ISelection[?], T](x: Self & ISelection[T]) {
    
    inline def setAdd(value: Any => Promise[Any]): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    inline def setClear(value: () => Promise[Any]): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    inline def setCount(value: () => Double): Self = StObject.set(x, "count", js.Any.fromFunction0(value))
    
    inline def setGetIndices(value: () => js.Array[Double]): Self = StObject.set(x, "getIndices", js.Any.fromFunction0(value))
    
    inline def setGetItems(value: () => Promise[js.Array[IItem[T]]]): Self = StObject.set(x, "getItems", js.Any.fromFunction0(value))
    
    inline def setGetRanges(value: () => js.Array[ISelectionRange]): Self = StObject.set(x, "getRanges", js.Any.fromFunction0(value))
    
    inline def setIsEverything(value: () => Boolean): Self = StObject.set(x, "isEverything", js.Any.fromFunction0(value))
    
    inline def setRemove(value: Any => Promise[Any]): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    
    inline def setSelectAll(value: () => Unit): Self = StObject.set(x, "selectAll", js.Any.fromFunction0(value))
    
    inline def setSet(value: Any => Promise[Any]): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
  }
}
