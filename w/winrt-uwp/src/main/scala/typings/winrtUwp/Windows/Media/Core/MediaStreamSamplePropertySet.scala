package typings.winrtUwp.Windows.Media.Core

import typings.winrtUwp.Windows.Foundation.Collections.IIterator
import typings.winrtUwp.Windows.Foundation.Collections.IKeyValuePair
import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains properties for the MediaStreamSample . */
trait MediaStreamSamplePropertySet extends StObject {
  
  /** Removes all items from the property set. */
  def clear(): Unit
  
  /**
    * Returns an iterator to enumerate the items in the property set.
    * @return The iterator. The current position of the iterator is index 0, or the end of the property set if the property set is empty.
    */
  def first(): IIterator[IKeyValuePair[js.Any, js.Any]]
  
  /**
    * Gets an immutable view of the property set.
    * @return The immutable view.
    */
  def getView(): IMapView[String, js.Any]
  
  /**
    * Indicates if the specified key exists in the property set.
    * @param key The key to check.
    * @return true if the key exists; otherwise, false.
    */
  def hasKey(key: String): Boolean
  
  /**
    * Adds the specified key and value to the property set.
    * @param key The key to add.
    * @param value The value of the key.
    * @return True if the method replaces a value that already exists for the key; false if this is a new key.
    */
  def insert(key: String, value: js.Any): Boolean
  
  /**
    * Retrieves the value for the specified key.
    * @param key The key to retrieve the value for.
    * @return The value, if an item with the specified key exists; otherwise, null.
    */
  def lookup(key: String): js.Any
  
  /**
    * Removes an item from the property set.
    * @param key The key to remove.
    */
  def remove(key: String): Unit
  
  /** Gets the number of items contained in the property set. */
  var size: Double
}
object MediaStreamSamplePropertySet {
  
  inline def apply(
    clear: () => Unit,
    first: () => IIterator[IKeyValuePair[js.Any, js.Any]],
    getView: () => IMapView[String, js.Any],
    hasKey: String => Boolean,
    insert: (String, js.Any) => Boolean,
    lookup: String => js.Any,
    remove: String => Unit,
    size: Double
  ): MediaStreamSamplePropertySet = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), first = js.Any.fromFunction0(first), getView = js.Any.fromFunction0(getView), hasKey = js.Any.fromFunction1(hasKey), insert = js.Any.fromFunction2(insert), lookup = js.Any.fromFunction1(lookup), remove = js.Any.fromFunction1(remove), size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaStreamSamplePropertySet]
  }
  
  extension [Self <: MediaStreamSamplePropertySet](x: Self) {
    
    inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    inline def setFirst(value: () => IIterator[IKeyValuePair[js.Any, js.Any]]): Self = StObject.set(x, "first", js.Any.fromFunction0(value))
    
    inline def setGetView(value: () => IMapView[String, js.Any]): Self = StObject.set(x, "getView", js.Any.fromFunction0(value))
    
    inline def setHasKey(value: String => Boolean): Self = StObject.set(x, "hasKey", js.Any.fromFunction1(value))
    
    inline def setInsert(value: (String, js.Any) => Boolean): Self = StObject.set(x, "insert", js.Any.fromFunction2(value))
    
    inline def setLookup(value: String => js.Any): Self = StObject.set(x, "lookup", js.Any.fromFunction1(value))
    
    inline def setRemove(value: String => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
