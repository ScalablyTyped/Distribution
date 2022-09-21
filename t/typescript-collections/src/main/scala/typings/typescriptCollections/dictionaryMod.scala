package typings.typescriptCollections

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  open class default[K, V] ()
    extends StObject
       with Dictionary[K, V] {
    def this(toStrFunction: js.Function1[/* key */ K, String]) = this()
    
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
    override def forEach(callback: js.Function2[K, V, Any]): Unit = js.native
    
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
      * Number of elements in the list.
      * @type {number}
      * @private
      */
    /* protected */ /* CompleteClass */
    var nElements: Double = js.native
    
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
      * Object holding the key-value pairs.
      * @type {Object}
      * @private
      */
    /* protected */ /* CompleteClass */
    var table: StringDictionary[IDictionaryPair[K, V]] = js.native
    
    /**
      * Function used to convert keys to strings.
      * @type {function(Object):string}
      * @protected
      */
    /* protected */ /* CompleteClass */
    override def toStr(key: K): String = js.native
    
    /**
      * Returns an array containing all of the values in this dictionary.
      * @return {Array} an array containing all of the values in this dictionary.
      */
    /* CompleteClass */
    override def values(): js.Array[V] = js.native
  }
  
  trait Dictionary[K, V] extends StObject {
    
    /**
      * Removes all mappings from this dictionary.
      * @this {collections.Dictionary}
      */
    def clear(): Unit
    
    /**
      * Returns true if this dictionary contains a mapping for the specified key.
      * @param {Object} key key whose presence in this dictionary is to be
      * tested.
      * @return {boolean} true if this dictionary contains a mapping for the
      * specified key.
      */
    def containsKey(key: K): Boolean
    
    /**
      * Executes the provided function once for each key-value pair
      * present in this dictionary.
      * @param {function(Object,Object):*} callback function to execute, it is
      * invoked with two arguments: key and value. To break the iteration you can
      * optionally return false.
      */
    def forEach(callback: js.Function2[/* key */ K, /* value */ V, Any]): Unit
    
    /**
      * Returns the value to which this dictionary maps the specified key.
      * Returns undefined if this dictionary contains no mapping for this key.
      * @param {Object} key key whose associated value is to be returned.
      * @return {*} the value to which this dictionary maps the specified key or
      * undefined if the map contains no mapping for this key.
      */
    def getValue(key: K): js.UndefOr[V]
    
    /**
      * Returns true if this dictionary contains no mappings.
      * @return {boolean} true if this dictionary contains no mappings.
      */
    def isEmpty(): Boolean
    
    /**
      * Returns an array containing all of the keys in this dictionary.
      * @return {Array} an array containing all of the keys in this dictionary.
      */
    def keys(): js.Array[K]
    
    /**
      * Number of elements in the list.
      * @type {number}
      * @private
      */
    /* protected */ var nElements: Double
    
    /**
      * Removes the mapping for this key from this dictionary if it is present.
      * @param {Object} key key whose mapping is to be removed from the
      * dictionary.
      * @return {*} previous value associated with specified key, or undefined if
      * there was no mapping for key.
      */
    def remove(key: K): js.UndefOr[V]
    
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
    def setValue(key: K, value: V): js.UndefOr[V]
    
    /**
      * Returns the number of keys in this dictionary.
      * @return {number} the number of key-value mappings in this dictionary.
      */
    def size(): Double
    
    /**
      * Object holding the key-value pairs.
      * @type {Object}
      * @private
      */
    /* protected */ var table: StringDictionary[IDictionaryPair[K, V]]
    
    /**
      * Function used to convert keys to strings.
      * @type {function(Object):string}
      * @protected
      */
    /* protected */ def toStr(key: K): String
    
    /**
      * Returns an array containing all of the values in this dictionary.
      * @return {Array} an array containing all of the values in this dictionary.
      */
    def values(): js.Array[V]
  }
  object Dictionary {
    
    inline def apply[K, V](
      clear: () => Unit,
      containsKey: K => Boolean,
      forEach: js.Function2[/* key */ K, /* value */ V, Any] => Unit,
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
    
    extension [Self <: Dictionary[?, ?], K, V](x: Self & (Dictionary[K, V])) {
      
      inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      inline def setContainsKey(value: K => Boolean): Self = StObject.set(x, "containsKey", js.Any.fromFunction1(value))
      
      inline def setForEach(value: js.Function2[/* key */ K, /* value */ V, Any] => Unit): Self = StObject.set(x, "forEach", js.Any.fromFunction1(value))
      
      inline def setGetValue(value: K => js.UndefOr[V]): Self = StObject.set(x, "getValue", js.Any.fromFunction1(value))
      
      inline def setIsEmpty(value: () => Boolean): Self = StObject.set(x, "isEmpty", js.Any.fromFunction0(value))
      
      inline def setKeys(value: () => js.Array[K]): Self = StObject.set(x, "keys", js.Any.fromFunction0(value))
      
      inline def setNElements(value: Double): Self = StObject.set(x, "nElements", value.asInstanceOf[js.Any])
      
      inline def setRemove(value: K => js.UndefOr[V]): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
      
      inline def setSetValue(value: (K, V) => js.UndefOr[V]): Self = StObject.set(x, "setValue", js.Any.fromFunction2(value))
      
      inline def setSize(value: () => Double): Self = StObject.set(x, "size", js.Any.fromFunction0(value))
      
      inline def setTable(value: StringDictionary[IDictionaryPair[K, V]]): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
      
      inline def setToStr(value: K => String): Self = StObject.set(x, "toStr", js.Any.fromFunction1(value))
      
      inline def setValues(value: () => js.Array[V]): Self = StObject.set(x, "values", js.Any.fromFunction0(value))
    }
  }
  
  trait IDictionaryPair[K, V] extends StObject {
    
    var key: K
    
    var value: V
  }
  object IDictionaryPair {
    
    inline def apply[K, V](key: K, value: V): IDictionaryPair[K, V] = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDictionaryPair[K, V]]
    }
    
    extension [Self <: IDictionaryPair[?, ?], K, V](x: Self & (IDictionaryPair[K, V])) {
      
      inline def setKey(value: K): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setValue(value: V): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
