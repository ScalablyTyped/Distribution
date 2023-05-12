package typings.thunderbirdWebextBrowser.browser

import org.scalablytyped.runtime.StringDictionary
import typings.thunderbirdWebextBrowser.WebExtEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storage {
  
  @js.native
  trait StorageArea extends StObject {
    
    /** Removes all items from storage. */
    def clear(): js.Promise[Unit] = js.native
    
    /**
      * Gets one or more items from storage.
      *
      * @param [keys] A single key to get, list of keys to get, or a
      * dictionary specifying default values (see description of the object).
      * An empty list or object will return an empty result object. Pass in
      * `null` to get the entire contents of storage.
      */
    def get(): js.Promise[StringDictionary[Any]] = js.native
    def get(keys: String): js.Promise[StringDictionary[Any]] = js.native
    def get(keys: js.Array[String]): js.Promise[StringDictionary[Any]] = js.native
    def get(keys: StringDictionary[Any]): js.Promise[StringDictionary[Any]] = js.native
    
    /**
      * Gets the amount of space (in bytes) being used by one or more items.
      *
      * @param [keys] A single key or list of keys to get the total usage for.
      * An empty list will return 0\. Pass in `null` to get the total usage of
      * all of storage.
      *
      * @deprecated Unsupported on Firefox at this time.
      */
    var getBytesInUse: js.UndefOr[
        js.Function1[/* keys */ js.UndefOr[String | js.Array[String]], js.Promise[Double]]
      ] = js.native
    
    /**
      * Fired when one or more items change.
      *
      * @param changes Object mapping each key that changed to its
      * corresponding `storage.StorageChange` for that item.
      */
    var onChanged: WebExtEvent[js.Function1[/* changes */ StringDictionary[StorageChange], Unit]] = js.native
    
    /**
      * Removes one or more items from storage.
      *
      * @param keys A single key or a list of keys for items to remove.
      */
    def remove(keys: String): js.Promise[Unit] = js.native
    def remove(keys: js.Array[String]): js.Promise[Unit] = js.native
    
    /**
      * Sets multiple items.
      *
      * @param items An object which gives each key/value pair to update
      * storage with. Any other key/value pairs in storage will not be
      * affected.
      *
      * Primitive values such as numbers will serialize as expected. Values
      * with a `typeof` `"object"` and `"function"` will typically serialize
      * to `{}`, with the exception of `Array` (serializes as expected),
      * `Date`, and `Regex` (serialize using their `String` representation).
      */
    def set(items: StringDictionary[Any]): js.Promise[Unit] = js.native
  }
  
  @js.native
  trait StorageAreaSync extends StObject {
    
    /** Removes all items from storage. */
    def clear(): js.Promise[Unit] = js.native
    
    /**
      * Gets one or more items from storage.
      *
      * @param [keys] A single key to get, list of keys to get, or a
      * dictionary specifying default values (see description of the object).
      * An empty list or object will return an empty result object. Pass in
      * `null` to get the entire contents of storage.
      */
    def get(): js.Promise[StringDictionary[Any]] = js.native
    def get(keys: String): js.Promise[StringDictionary[Any]] = js.native
    def get(keys: js.Array[String]): js.Promise[StringDictionary[Any]] = js.native
    def get(keys: StringDictionary[Any]): js.Promise[StringDictionary[Any]] = js.native
    
    /**
      * Gets the amount of space (in bytes) being used by one or more items.
      *
      * @param [keys] A single key or list of keys to get the total usage for.
      * An empty list will return 0\. Pass in `null` to get the total usage of
      * all of storage.
      */
    def getBytesInUse(): js.Promise[Double] = js.native
    def getBytesInUse(keys: String): js.Promise[Double] = js.native
    def getBytesInUse(keys: js.Array[String]): js.Promise[Double] = js.native
    
    /**
      * Fired when one or more items change.
      *
      * @param changes Object mapping each key that changed to its
      * corresponding `storage.StorageChange` for that item.
      */
    var onChanged: WebExtEvent[js.Function1[/* changes */ StringDictionary[StorageChange], Unit]] = js.native
    
    /**
      * Removes one or more items from storage.
      *
      * @param keys A single key or a list of keys for items to remove.
      */
    def remove(keys: String): js.Promise[Unit] = js.native
    def remove(keys: js.Array[String]): js.Promise[Unit] = js.native
    
    /**
      * Sets multiple items.
      *
      * @param items An object which gives each key/value pair to update
      * storage with. Any other key/value pairs in storage will not be
      * affected.
      *
      * Primitive values such as numbers will serialize as expected. Values
      * with a `typeof` `"object"` and `"function"` will typically serialize
      * to `{}`, with the exception of `Array` (serializes as expected),
      * `Date`, and `Regex` (serialize using their `String` representation).
      */
    def set(items: StringDictionary[Any]): js.Promise[Unit] = js.native
  }
  
  trait StorageChange extends StObject {
    
    /** The new value of the item, if there is a new value. */
    var newValue: js.UndefOr[Any] = js.undefined
    
    /** The old value of the item, if there was an old value. */
    var oldValue: js.UndefOr[Any] = js.undefined
  }
  object StorageChange {
    
    inline def apply(): StorageChange = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StorageChange]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StorageChange] (val x: Self) extends AnyVal {
      
      inline def setNewValue(value: Any): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
      
      inline def setNewValueUndefined: Self = StObject.set(x, "newValue", js.undefined)
      
      inline def setOldValue(value: Any): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
      
      inline def setOldValueUndefined: Self = StObject.set(x, "oldValue", js.undefined)
    }
  }
}
