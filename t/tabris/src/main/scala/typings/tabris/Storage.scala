package typings.tabris

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Storage
/**
  * The `localStorage` object allows storing key-value pairs in a persistent store. Both keys and values
  * are stored as strings.
  * On iOS, there is an additional object `secureStorage` available in the global scope. This is a
  * drop-in replacement for `localStorage` that keeps data in the encrypted iOS Keychain.
  * The `localStorage` is only meant to store relatively short strings. To store larger amounts of data
  * it is recommended to use the [FileSystem](./fs.html) API.
  */
@JSGlobal("Storage")
@js.native
class Storage protected () extends js.Object {
  /**
    * The number of items in the storage.
    * @constant
    */
  val length: Double = js.native
  /**
    * Remove all key/value pairs from the storage.
    */
  def clear(): Unit = js.native
  /**
    * Retrieves the value associated with the given key.
    * @param key
    */
  def getItem(key: String): String | Null = js.native
  /**
    * Returns the name of the key at the given index in the storage. The order of keys is platform
    * dependent, you should not rely on it to be deterministic
    * @param index
    */
  def key(index: Double): String = js.native
  /**
    * Removes the given key/value pair from the storage.
    * @param key
    */
  def removeItem(key: String): Unit = js.native
  /**
    * Stores a string value using the given key.
    * @param key
    * @param value
    */
  def setItem(key: String, value: String): Unit = js.native
}

