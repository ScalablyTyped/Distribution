package typings.tabris

import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// FormData
/**
  * FormData provides a way to construct a set of key/value pairs which can then be sent using fetch() or
  * XMLHttpRequest. It uses the same format a HTML form would use if the encoding type were set to
  * `multipart/form-data`.
  */
@js.native
trait FormData extends StObject {
  
  /**
    * Adds a string value associated with a given key. Any existing values for that key will be retained.
    * @param key
    * @param value
    */
  def append(key: String, value: String): Unit = js.native
  /**
    * Adds binary data associated with a given key. Will be stored as an instance of `File` with its `name`
    * set to the given `filename` parameter. If no `filename` is given and the value is not already a named
    * `File` instance it will default to `'blob'`. Any existing values for that key will be retained.
    * @param key
    * @param value
    * @param filename
    */
  def append(key: String, value: Blob): Unit = js.native
  def append(key: String, value: Blob, filename: String): Unit = js.native
  def append(key: String, value: File): Unit = js.native
  def append(key: String, value: File, filename: String): Unit = js.native
  
  /**
    * Removes all values associated with a given key.
    * @param key
    */
  def delete(key: String): Unit = js.native
  
  def entries(): IterableIterator[js.Tuple2[String, String | File]] = js.native
  
  /**
    * Returns the first value associated with a given key.
    * @param key
    */
  def get(key: String): String | File | Null = js.native
  
  /**
    * Returns all the values associated with a given key.
    * @param key
    */
  def getAll(key: String): js.Array[String] = js.native
  
  /**
    * Returns true if there are any values associated with a given key.
    * @param key
    */
  def has(key: String): Boolean = js.native
  
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[js.Tuple2[String, String | File]]] = js.native
  
  def keys(): IterableIterator[String] = js.native
  
  /**
    * Adds a string value associated with a given key. Any existing values for that key will be replaced.
    * @param key
    * @param value
    */
  def set(key: String, value: String): Unit = js.native
  /**
    * Adds binary data associated with a given key. Will be stored as an instance of `File` with its `name`
    * set to the given `filename` parameter. If no `filename` is given and the value is not already a named
    * `File` instance it will default to `'blob'`. Any existing values for that key will be replaced.
    * @param key
    * @param value
    * @param filename
    */
  def set(key: String, value: Blob): Unit = js.native
  def set(key: String, value: Blob, filename: String): Unit = js.native
  def set(key: String, value: File): Unit = js.native
  def set(key: String, value: File, filename: String): Unit = js.native
  
  def values(): IterableIterator[String | File] = js.native
}
