package typings.tabris

import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Headers
/**
  * Represents a set of HTTP headers as used by `fetch()`.
  */
@js.native
trait Headers extends StObject {
  
  /**
    * Adds a value to a given header. Any existing values for that header will be retained.
    * @param name
    * @param value
    */
  def append(name: String, value: String): Unit = js.native
  
  /**
    * Removes all values associated with a given header.
    * @param name
    */
  def delete(name: String): Unit = js.native
  
  def entries(): IterableIterator[js.Tuple2[String, String]] = js.native
  
  def forEach(callback: js.Function2[/* value */ String, /* name */ String, Unit]): Unit = js.native
  
  /**
    * Returns the first value associated with a given header.
    * @param name
    */
  def get(name: String): String | Null = js.native
  
  /**
    * Returns all values associated with a given header.
    * @param name
    */
  def getAll(name: String): js.Array[String] = js.native
  
  /**
    * Returns true if there are any values associated with a given header.
    * @param name
    */
  def has(name: String): Boolean = js.native
  
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[js.Tuple2[String, String]]] = js.native
  
  def keys(): IterableIterator[String] = js.native
  
  /**
    * Adds a string value associated with a given header. Any existing values for that header will be
    * replaced.
    * @param name
    * @param value
    */
  def set(name: String, value: String): Unit = js.native
  
  def values(): IterableIterator[String] = js.native
}
