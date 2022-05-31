package typings.tabris.global

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
@JSGlobal("Storage")
@js.native
/* private */ class Storage ()
  extends StObject
     with typings.tabris.Storage {
  
  /**
    * Remove all key/value pairs from the storage.
    */
  /* CompleteClass */
  override def clear(): Unit = js.native
  
  /**
    * Retrieves the value associated with the given key.
    * @param key
    */
  /* CompleteClass */
  override def getItem(key: String): String | Null = js.native
  
  /**
    * Returns the name of the key at the given index in the storage. The order of keys is platform
    * dependent, you should not rely on it to be deterministic
    * @param index
    */
  /* CompleteClass */
  override def key(index: Double): String = js.native
  
  /**
    * The number of items in the storage.
    * @constant
    */
  /* CompleteClass */
  override val length: Double = js.native
  
  /**
    * Removes the given key/value pair from the storage.
    * @param key
    */
  /* CompleteClass */
  override def removeItem(key: String): Unit = js.native
  
  /**
    * Stores a string value using the given key.
    * @param key
    * @param value
    */
  /* CompleteClass */
  override def setItem(key: String, value: String): Unit = js.native
}
