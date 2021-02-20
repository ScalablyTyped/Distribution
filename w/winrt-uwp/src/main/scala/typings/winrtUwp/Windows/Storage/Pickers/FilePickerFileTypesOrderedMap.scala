package typings.winrtUwp.Windows.Storage.Pickers

import typings.winrtUwp.Windows.Foundation.Collections.IIterator
import typings.winrtUwp.Windows.Foundation.Collections.IKeyValuePair
import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import typings.winrtUwp.Windows.Foundation.Collections.IVector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a collection of display names mapped to the associated file types (extensions). Each element in this collection maps a display name to a corresponding collection of file name extensions. The key is a single string, the value is a list/vector of strings representing one or more extension choices. */
@js.native
trait FilePickerFileTypesOrderedMap extends StObject {
  
  /** Removes all display names and associated file name extensions from the collection. */
  def clear(): Unit = js.native
  
  /**
    * Retrieves an iterator that iterates through the display names and associated file types in the collection.
    * @return The iterator.
    */
  def first(): IIterator[IKeyValuePair[_, _]] = js.native
  
  /**
    * Returns an immutable view of the collection of display names and associated file types.
    * @return The view of the collection.
    */
  def getView(): IMapView[String, IVector[String]] = js.native
  
  /**
    * Determines whether the mapped collection of display names and associated file types contains the specified key.
    * @param key The key.
    * @return True if the key is found; otherwise, false.
    */
  def hasKey(key: String): Boolean = js.native
  
  /**
    * Inserts or replaces an item in the mapped collection of display names and associated file types.
    * @param key The key associated with the item to insert.
    * @param value The item to insert.
    * @return true if an item with the specified key is an existing item and was replaced; otherwise false.
    */
  def insert(key: String, value: IVector[String]): Boolean = js.native
  
  /**
    * Returns the item at the specified key in the mapped collection of display names and associated file types.
    * @param key The key to use to locate the item.
    * @return The item associated with the specified key.
    */
  def lookup(key: String): IVector[String] = js.native
  
  /**
    * Removes an item from the mapped collection of display names and associated file types.
    * @param key The key associated with the item to remove.
    */
  def remove(key: String): Unit = js.native
  
  /** Gets the number of items in the mapped collection of display names and associated file types. */
  var size: Double = js.native
}
object FilePickerFileTypesOrderedMap {
  
  @scala.inline
  def apply(
    clear: () => Unit,
    first: () => IIterator[IKeyValuePair[_, _]],
    getView: () => IMapView[String, IVector[String]],
    hasKey: String => Boolean,
    insert: (String, IVector[String]) => Boolean,
    lookup: String => IVector[String],
    remove: String => Unit,
    size: Double
  ): FilePickerFileTypesOrderedMap = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), first = js.Any.fromFunction0(first), getView = js.Any.fromFunction0(getView), hasKey = js.Any.fromFunction1(hasKey), insert = js.Any.fromFunction2(insert), lookup = js.Any.fromFunction1(lookup), remove = js.Any.fromFunction1(remove), size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilePickerFileTypesOrderedMap]
  }
  
  @scala.inline
  implicit class FilePickerFileTypesOrderedMapMutableBuilder[Self <: FilePickerFileTypesOrderedMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFirst(value: () => IIterator[IKeyValuePair[_, _]]): Self = StObject.set(x, "first", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetView(value: () => IMapView[String, IVector[String]]): Self = StObject.set(x, "getView", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasKey(value: String => Boolean): Self = StObject.set(x, "hasKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInsert(value: (String, IVector[String]) => Boolean): Self = StObject.set(x, "insert", js.Any.fromFunction2(value))
    
    @scala.inline
    def setLookup(value: String => IVector[String]): Self = StObject.set(x, "lookup", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemove(value: String => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
