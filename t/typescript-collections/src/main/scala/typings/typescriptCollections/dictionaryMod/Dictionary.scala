package typings.typescriptCollections.dictionaryMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dictionary[K, V] extends js.Object {
  
  /**
    * Removes all mappings from this dictionary.
    * @this {collections.Dictionary}
    */
  def clear(): Unit = js.native
  
  /**
    * Returns true if this dictionary contains a mapping for the specified key.
    * @param {Object} key key whose presence in this dictionary is to be
    * tested.
    * @return {boolean} true if this dictionary contains a mapping for the
    * specified key.
    */
  def containsKey(key: K): Boolean = js.native
  
  /**
    * Executes the provided function once for each key-value pair
    * present in this dictionary.
    * @param {function(Object,Object):*} callback function to execute, it is
    * invoked with two arguments: key and value. To break the iteration you can
    * optionally return false.
    */
  def forEach(callback: js.Function2[/* key */ K, /* value */ V, _]): Unit = js.native
  
  /**
    * Returns the value to which this dictionary maps the specified key.
    * Returns undefined if this dictionary contains no mapping for this key.
    * @param {Object} key key whose associated value is to be returned.
    * @return {*} the value to which this dictionary maps the specified key or
    * undefined if the map contains no mapping for this key.
    */
  def getValue(key: K): js.UndefOr[V] = js.native
  
  /**
    * Returns true if this dictionary contains no mappings.
    * @return {boolean} true if this dictionary contains no mappings.
    */
  def isEmpty(): Boolean = js.native
  
  /**
    * Returns an array containing all of the keys in this dictionary.
    * @return {Array} an array containing all of the keys in this dictionary.
    */
  def keys(): js.Array[K] = js.native
  
  /**
    * Number of elements in the list.
    * @type {number}
    * @private
    */
  var nElements: Double = js.native
  
  /**
    * Removes the mapping for this key from this dictionary if it is present.
    * @param {Object} key key whose mapping is to be removed from the
    * dictionary.
    * @return {*} previous value associated with specified key, or undefined if
    * there was no mapping for key.
    */
  def remove(key: K): js.UndefOr[V] = js.native
  
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
  def setValue(key: K, value: V): js.UndefOr[V] = js.native
  
  /**
    * Returns the number of keys in this dictionary.
    * @return {number} the number of key-value mappings in this dictionary.
    */
  def size(): Double = js.native
  
  /**
    * Object holding the key-value pairs.
    * @type {Object}
    * @private
    */
  var table: StringDictionary[IDictionaryPair[K, V]] = js.native
  
  /**
    * Function used to convert keys to strings.
    * @type {function(Object):string}
    * @protected
    */
  /* protected */ def toStr(key: K): String = js.native
  
  /**
    * Returns an array containing all of the values in this dictionary.
    * @return {Array} an array containing all of the values in this dictionary.
    */
  def values(): js.Array[V] = js.native
}
object Dictionary {
  
  @scala.inline
  def apply[K, V](
    clear: () => Unit,
    containsKey: K => Boolean,
    forEach: js.Function2[/* key */ K, /* value */ V, _] => Unit,
    getValue: K => js.UndefOr[V],
    isEmpty: () => Boolean,
    keys: () => js.Array[K],
    nElements: Double,
    remove: K => js.UndefOr[V],
    setValue: (K, V) => js.UndefOr[V],
    size: () => Double,
    table: StringDictionary[IDictionaryPair[K, V]],
    toStr: K => String,
    values: () => js.Array[V]
  ): Dictionary[K, V] = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), containsKey = js.Any.fromFunction1(containsKey), forEach = js.Any.fromFunction1(forEach), getValue = js.Any.fromFunction1(getValue), isEmpty = js.Any.fromFunction0(isEmpty), keys = js.Any.fromFunction0(keys), nElements = nElements.asInstanceOf[js.Any], remove = js.Any.fromFunction1(remove), setValue = js.Any.fromFunction2(setValue), size = js.Any.fromFunction0(size), table = table.asInstanceOf[js.Any], toStr = js.Any.fromFunction1(toStr), values = js.Any.fromFunction0(values))
    __obj.asInstanceOf[Dictionary[K, V]]
  }
  
  @scala.inline
  implicit class DictionaryOps[Self <: Dictionary[_, _], K, V] (val x: Self with (Dictionary[K, V])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setContainsKey(value: K => Boolean): Self = this.set("containsKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setForEach(value: js.Function2[/* key */ K, /* value */ V, _] => Unit): Self = this.set("forEach", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetValue(value: K => js.UndefOr[V]): Self = this.set("getValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsEmpty(value: () => Boolean): Self = this.set("isEmpty", js.Any.fromFunction0(value))
    
    @scala.inline
    def setKeys(value: () => js.Array[K]): Self = this.set("keys", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNElements(value: Double): Self = this.set("nElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemove(value: K => js.UndefOr[V]): Self = this.set("remove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetValue(value: (K, V) => js.UndefOr[V]): Self = this.set("setValue", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSize(value: () => Double): Self = this.set("size", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTable(value: StringDictionary[IDictionaryPair[K, V]]): Self = this.set("table", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToStr(value: K => String): Self = this.set("toStr", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValues(value: () => js.Array[V]): Self = this.set("values", js.Any.fromFunction0(value))
  }
}
