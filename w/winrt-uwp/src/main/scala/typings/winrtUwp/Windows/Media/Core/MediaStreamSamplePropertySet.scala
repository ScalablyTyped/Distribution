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
  def first(): IIterator[IKeyValuePair[Any, Any]]
  
  /**
    * Gets an immutable view of the property set.
    * @return The immutable view.
    */
  def getView(): IMapView[String, Any]
  
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
  def insert(key: String, value: Any): Boolean
  
  /**
    * Retrieves the value for the specified key.
    * @param key The key to retrieve the value for.
    * @return The value, if an item with the specified key exists; otherwise, null.
    */
  def lookup(key: String): Any
  
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
    first: () => IIterator[IKeyValuePair[Any, Any]],
    getView: () => IMapView[String, Any],
    hasKey: String => Boolean,
    insert: (String, Any) => Boolean,
    lookup: String => Any,
    remove: String => Unit,
    size: Double
  ): MediaStreamSamplePropertySet = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), first = js.Any.fromFunction0(first), getView = js.Any.fromFunction0(getView), hasKey = js.Any.fromFunction1(hasKey), insert = js.Any.fromFunction2(insert), lookup = js.Any.fromFunction1(lookup), remove = js.Any.fromFunction1(remove), size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaStreamSamplePropertySet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MediaStreamSamplePropertySet] (val x: Self) extends AnyVal {
    
    inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    inline def setFirst(value: () => IIterator[IKeyValuePair[Any, Any]]): Self = StObject.set(x, "first", js.Any.fromFunction0(value))
    
    inline def setGetView(value: () => IMapView[String, Any]): Self = StObject.set(x, "getView", js.Any.fromFunction0(value))
    
    inline def setHasKey(value: String => Boolean): Self = StObject.set(x, "hasKey", js.Any.fromFunction1(value))
    
    inline def setInsert(value: (String, Any) => Boolean): Self = StObject.set(x, "insert", js.Any.fromFunction2(value))
    
    inline def setLookup(value: String => Any): Self = StObject.set(x, "lookup", js.Any.fromFunction1(value))
    
    inline def setRemove(value: String => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
