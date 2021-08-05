package typings.tabris

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Storage
/**
  * The `localStorage` object allows storing key-value pairs in a persistent store. Both keys and values
  * are stored as strings.
  * In addition Tabris.js adds support for a `secureStorage` available in the global scope. This is a
  * drop-in replacement for `localStorage` that keeps data encrypted using the Keychain on iOS and the
  * AndroidKeyStore on Android 6+. Note that on Android 5 the store is encrypted but does not use
  * hardware encryption.
  * The `localStorage` is only meant to store relatively short strings. To store larger amounts of data
  * it is recommended to use the [FileSystem](./fs.html) API.
  */
trait Storage extends StObject {
  
  /**
    * Remove all key/value pairs from the storage.
    */
  def clear(): Unit
  
  /**
    * Retrieves the value associated with the given key.
    * @param key
    */
  def getItem(key: String): String | Null
  
  /**
    * Returns the name of the key at the given index in the storage. The order of keys is platform
    * dependent, you should not rely on it to be deterministic
    * @param index
    */
  def key(index: Double): String
  
  /**
    * The number of items in the storage.
    * @constant
    */
  val length: Double
  
  /**
    * Removes the given key/value pair from the storage.
    * @param key
    */
  def removeItem(key: String): Unit
  
  /**
    * Stores a string value using the given key.
    * @param key
    * @param value
    */
  def setItem(key: String, value: String): Unit
}
object Storage {
  
  inline def apply(
    clear: () => Unit,
    getItem: String => String | Null,
    key: Double => String,
    length: Double,
    removeItem: String => Unit,
    setItem: (String, String) => Unit
  ): Storage = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), getItem = js.Any.fromFunction1(getItem), key = js.Any.fromFunction1(key), length = length.asInstanceOf[js.Any], removeItem = js.Any.fromFunction1(removeItem), setItem = js.Any.fromFunction2(setItem))
    __obj.asInstanceOf[Storage]
  }
  
  extension [Self <: Storage](x: Self) {
    
    inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    inline def setGetItem(value: String => String | Null): Self = StObject.set(x, "getItem", js.Any.fromFunction1(value))
    
    inline def setKey(value: Double => String): Self = StObject.set(x, "key", js.Any.fromFunction1(value))
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setRemoveItem(value: String => Unit): Self = StObject.set(x, "removeItem", js.Any.fromFunction1(value))
    
    inline def setSetItem(value: (String, String) => Unit): Self = StObject.set(x, "setItem", js.Any.fromFunction2(value))
  }
}
