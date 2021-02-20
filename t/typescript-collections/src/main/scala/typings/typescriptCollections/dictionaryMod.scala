package typings.typescriptCollections

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dictionaryMod {
  
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
  }
  
  @js.native
  trait Dictionary[K, V] extends StObject {
    
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
    implicit class DictionaryMutableBuilder[Self <: Dictionary[_, _], K, V] (val x: Self with (Dictionary[K, V])) extends AnyVal {
      
      @scala.inline
      def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      @scala.inline
      def setContainsKey(value: K => Boolean): Self = StObject.set(x, "containsKey", js.Any.fromFunction1(value))
      
      @scala.inline
      def setForEach(value: js.Function2[/* key */ K, /* value */ V, _] => Unit): Self = StObject.set(x, "forEach", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetValue(value: K => js.UndefOr[V]): Self = StObject.set(x, "getValue", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsEmpty(value: () => Boolean): Self = StObject.set(x, "isEmpty", js.Any.fromFunction0(value))
      
      @scala.inline
      def setKeys(value: () => js.Array[K]): Self = StObject.set(x, "keys", js.Any.fromFunction0(value))
      
      @scala.inline
      def setNElements(value: Double): Self = StObject.set(x, "nElements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemove(value: K => js.UndefOr[V]): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetValue(value: (K, V) => js.UndefOr[V]): Self = StObject.set(x, "setValue", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSize(value: () => Double): Self = StObject.set(x, "size", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTable(value: StringDictionary[IDictionaryPair[K, V]]): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToStr(value: K => String): Self = StObject.set(x, "toStr", js.Any.fromFunction1(value))
      
      @scala.inline
      def setValues(value: () => js.Array[V]): Self = StObject.set(x, "values", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait IDictionaryPair[K, V] extends StObject {
    
    var key: K = js.native
    
    var value: V = js.native
  }
  object IDictionaryPair {
    
    @scala.inline
    def apply[K, V](key: K, value: V): IDictionaryPair[K, V] = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDictionaryPair[K, V]]
    }
    
    @scala.inline
    implicit class IDictionaryPairMutableBuilder[Self <: IDictionaryPair[_, _], K, V] (val x: Self with (IDictionaryPair[K, V])) extends AnyVal {
      
      @scala.inline
      def setKey(value: K): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: V): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
