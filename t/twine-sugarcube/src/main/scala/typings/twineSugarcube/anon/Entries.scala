package typings.twineSugarcube.anon

import typings.twineSugarcube.extensionsMod.global.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Entries extends StObject {
  
  /**
    * Empties the story metadata store.
    * @since 2.29.0
    */
  def clear(): Unit
  
  /**
    * Removes the specified key, and its associated value, from the story metadata store.
    * @param key The key to delete.
    * @since 2.29.0
    * @example
    * // Removes 'achievements' from the metadata store.
    * State.metadata.delete('achievements');
    */
  def delete(key: String): Unit
  
  /**
    * Returns an array of the story metadata store's key/value pairs as [key, value] arrays.
    * @since 2.36.0
    * @example
    * // Get the metadata store's key/value pairs.
    * var metadata = State.metadata.entries();
    *
    * // Iterate over the pairs with a `for` loop.
    * for (var i = 0; i < metadata.length; ++i) {
    *     var key   = metadata[i][0];
    *     var value = metadata[i][1];
    *     // do something
    * }
    *
    * @example
    * // Iterate over the pairs with `<Array>.forEach()`.
    * State.metadata.entries().forEach(function (pair) {
    *     var key   = pair[0];
    *     var value = pair[1];
    *     // do something
    * });
    */
  def entries(): Array[js.Tuple2[String, Any]]
  
  /**
    * Returns the value associated with the specified key from the story metadata store.
    * @param key The key whose value should be returned.
    * @since 2.29.0
    * @example
    * // Returns the value of 'achievements' from the metadata store.
    * var playerAchievements = State.metadata.get('achievements');
    */
  def get(key: String): Any
  
  /**
    * Returns whether the specified key exists within the story metadata store.
    * @param key The key whose existence should be tested.
    * @since 2.29.0
    * @example
    * // Returns whether 'achievements' exists within the metadata store.
    * if (State.metadata.has('achievements')) {
    *         // do something
    * }
    */
  def has(key: String): Boolean
  
  /**
    * Returns an array of the story metadata store's keys.
    * @since 2.36.0
    * @example
    * // Get the metadata store's keys.
    * var metadataKeys = State.metadata.keys();
    *
    * // Iterate over the keys with a `for` loop.
    * for (var i = 0; i < metadataKeys.length; ++i) {
    *     var key = metadataKeys[i];
    *     // do something
    * }
    *
    * @example
    * // Iterate over the keys with `<Array>.forEach()`.
    * State.metadata.forEach(function (key) {
    *     // do something
    * });
    */
  def keys(): Array[String]
  
  /**
    * Sets the specified key and value within the story metadata store, which causes them to persist over story and browser
    * restarts—n.b. private browsing modes do interfere with this. To update the value associated with a key, simply set it
    * again.
    *
    * **NOTE**: The story metadata, like saves, is tied to the specific story it was generated with. It is not a mechanism
    * for moving data between stories
    *
    * **WARNING**: The story metadata store is not, and should not be used as, a replacement for saves. Examples of good
    * uses: achievement tracking, new game+ data, playthrough statistics, etc.
    *
    * **WARNING**: This feature is largely incompatible with private browsing modes, which cause all in-browser storage
    * mechanisms to either persist only for the lifetime of the browsing session or fail outright.
    * @param key The key that should be set.
    * @param value The value to set.
    * @since 2.29.0
    * @example
    * // Sets 'achievements', with the given value, in the metadata store.
    * State.metadata.set('achievements', { ateYellowSnow : true });
    *
    * // Sets 'ngplus', with the given value, in the metadata store.
    * State.metadata.set('ngplus', true);
    */
  def set(key: String, value: Any): Unit
  
  /**
    * Returns the size of the story metadata store—i.e., the number of stored pairs.
    * @since 2.29.0
    */
  val size: Double
}
object Entries {
  
  inline def apply(
    clear: () => Unit,
    delete: String => Unit,
    entries: () => Array[js.Tuple2[String, Any]],
    get: String => Any,
    has: String => Boolean,
    keys: () => Array[String],
    set: (String, Any) => Unit,
    size: Double
  ): Entries = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), delete = js.Any.fromFunction1(delete), entries = js.Any.fromFunction0(entries), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), keys = js.Any.fromFunction0(keys), set = js.Any.fromFunction2(set), size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entries]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Entries] (val x: Self) extends AnyVal {
    
    inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    inline def setDelete(value: String => Unit): Self = StObject.set(x, "delete", js.Any.fromFunction1(value))
    
    inline def setEntries(value: () => Array[js.Tuple2[String, Any]]): Self = StObject.set(x, "entries", js.Any.fromFunction0(value))
    
    inline def setGet(value: String => Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setHas(value: String => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
    
    inline def setKeys(value: () => Array[String]): Self = StObject.set(x, "keys", js.Any.fromFunction0(value))
    
    inline def setSet(value: (String, Any) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
