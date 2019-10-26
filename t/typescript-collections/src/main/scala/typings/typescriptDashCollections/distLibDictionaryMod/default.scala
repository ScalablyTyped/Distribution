package typings.typescriptDashCollections.distLibDictionaryMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-collections/dist/lib/Dictionary", JSImport.Default)
@js.native
/**
  * Creates an empty dictionary.
  * @class <p>Dictionaries map keys to values; each key can map to at most one value.
  * This implementation accepts any kind of objects as keys.</p>
  *
  * <p>If the keys are custom objects a function which converts keys to unique
  * strings must be provided. Example:</p>
  * <pre>
  * function petToString(pet) {
  *  return pet.name;
  * }
  * </pre>
  * @constructor
  * @param {function(Object):string=} toStrFunction optional function used
  * to convert keys to strings. If the keys aren't strings or if toString()
  * is not appropriate, a custom function which receives a key and returns a
  * unique string must be provided.
  */
class default[K, V] () extends Dictionary[K, V] {
  def this(toStrFunction: js.Function1[/* key */ K, String]) = this()
  /**
    * Number of elements in the list.
    * @type {number}
    * @private
    */
  /* CompleteClass */
  override var nElements: Double = js.native
  /**
    * Object holding the key-value pairs.
    * @type {Object}
    * @private
    */
  /* CompleteClass */
  override var table: StringDictionary[IDictionaryPair[K, V]] = js.native
  /**
    * Removes all mappings from this dictionary.
    * @this {collections.Dictionary}
    */
  /* CompleteClass */
  override def clear(): Unit = js.native
  /**
    * Returns true if this dictionary contains a mapping for the specified key.
    * @param {Object} key key whose presence in this dictionary is to be
    * tested.
    * @return {boolean} true if this dictionary contains a mapping for the
    * specified key.
    */
  /* CompleteClass */
  override def containsKey(key: K): Boolean = js.native
  /**
    * Executes the provided function once for each key-value pair
    * present in this dictionary.
    * @param {function(Object,Object):*} callback function to execute, it is
    * invoked with two arguments: key and value. To break the iteration you can
    * optionally return false.
    */
  /* CompleteClass */
  override def forEach(callback: js.Function2[K, V, _]): Unit = js.native
  /**
    * Returns the value to which this dictionary maps the specified key.
    * Returns undefined if this dictionary contains no mapping for this key.
    * @param {Object} key key whose associated value is to be returned.
    * @return {*} the value to which this dictionary maps the specified key or
    * undefined if the map contains no mapping for this key.
    */
  /* CompleteClass */
  override def getValue(key: K): js.UndefOr[V] = js.native
  /**
    * Returns true if this dictionary contains no mappings.
    * @return {boolean} true if this dictionary contains no mappings.
    */
  /* CompleteClass */
  override def isEmpty(): Boolean = js.native
  /**
    * Returns an array containing all of the keys in this dictionary.
    * @return {Array} an array containing all of the keys in this dictionary.
    */
  /* CompleteClass */
  override def keys(): js.Array[K] = js.native
  /**
    * Removes the mapping for this key from this dictionary if it is present.
    * @param {Object} key key whose mapping is to be removed from the
    * dictionary.
    * @return {*} previous value associated with specified key, or undefined if
    * there was no mapping for key.
    */
  /* CompleteClass */
  override def remove(key: K): js.UndefOr[V] = js.native
  /**
    * Associates the specified value with the specified key in this dictionary.
    * If the dictionary previously contained a mapping for this key, the old
    * value is replaced by the specified value.
    * @param {Object} key key with which the specified value is to be
    * associated.
    * @param {Object} value value to be associated with the specified key.
    * @return {*} previous value associated with the specified key, or undefined if
    * there was no mapping for the key or if the key/value are undefined.
    */
  /* CompleteClass */
  override def setValue(key: K, value: V): js.UndefOr[V] = js.native
  /**
    * Returns the number of keys in this dictionary.
    * @return {number} the number of key-value mappings in this dictionary.
    */
  /* CompleteClass */
  override def size(): Double = js.native
  /**
    * Function used to convert keys to strings.
    * @type {function(Object):string}
    * @protected
    */
  /* CompleteClass */
  /* protected */ override def toStr(key: K): String = js.native
  /**
    * Returns an array containing all of the values in this dictionary.
    * @return {Array} an array containing all of the values in this dictionary.
    */
  /* CompleteClass */
  override def values(): js.Array[V] = js.native
}

