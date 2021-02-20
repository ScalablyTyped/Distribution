package typings.typescriptCollections

import typings.typescriptCollections.utilMod.IEqualsFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object multiDictionaryMod {
  
  @JSImport("typescript-collections/dist/lib/MultiDictionary", JSImport.Default)
  @js.native
  /**
    * Creates an empty multi dictionary.
    * @class <p>A multi dictionary is a special kind of dictionary that holds
    * multiple values against each key. Setting a value into the dictionary will
    * add the value to an array at that key. Getting a key will return an array,
    * holding all the values set to that key.
    * You can configure to allow duplicates in the values.
    * This implementation accepts any kind of objects as keys.</p>
    *
    * <p>If the keys are custom objects a function which converts keys to strings must be
    * provided. Example:</p>
    *
    * <pre>
    * function petToString(pet) {
    *     return pet.name;
    * }
    * </pre>
    * <p>If the values are custom objects a function to check equality between values
    * must be provided. Example:</p>
    *
    * <pre>
    * function petsAreEqualByAge(pet1,pet2) {
    *     return pet1.age === pet2.age;
    * }
    * </pre>
    * @constructor
    * @param {function(Object):string=} toStrFunction optional function
    * to convert keys to strings. If the keys aren't strings or if toString()
    * is not appropriate, a custom function which receives a key and returns a
    * unique string must be provided.
    * @param {function(Object,Object):boolean=} valuesEqualsFunction optional
    * function to check if two values are equal.
    *
    * @param allowDuplicateValues
    */
  class default[K, V] () extends MultiDictionary[K, V] {
    def this(toStrFunction: js.Function1[/* key */ K, String]) = this()
    def this(toStrFunction: js.UndefOr[scala.Nothing], valuesEqualsFunction: IEqualsFunction[V]) = this()
    def this(toStrFunction: js.Function1[/* key */ K, String], valuesEqualsFunction: IEqualsFunction[V]) = this()
    def this(
      toStrFunction: js.UndefOr[scala.Nothing],
      valuesEqualsFunction: js.UndefOr[scala.Nothing],
      allowDuplicateValues: Boolean
    ) = this()
    def this(
      toStrFunction: js.UndefOr[scala.Nothing],
      valuesEqualsFunction: IEqualsFunction[V],
      allowDuplicateValues: Boolean
    ) = this()
    def this(
      toStrFunction: js.Function1[/* key */ K, String],
      valuesEqualsFunction: js.UndefOr[scala.Nothing],
      allowDuplicateValues: Boolean
    ) = this()
    def this(
      toStrFunction: js.Function1[/* key */ K, String],
      valuesEqualsFunction: IEqualsFunction[V],
      allowDuplicateValues: Boolean
    ) = this()
  }
  
  @js.native
  trait MultiDictionary[K, V] extends StObject {
    
    var allowDuplicate: js.Any = js.native
    
    /**
      * Removes all mappings from this dictionary.
      */
    def clear(): Unit = js.native
    
    /**
      * Returns true if this dictionary at least one value associatted the specified key.
      * @param {Object} key key whose presence in this dictionary is to be
      * tested.
      * @return {boolean} true if this dictionary at least one value associatted
      * the specified key.
      */
    def containsKey(key: K): Boolean = js.native
    
    var dict: js.Any = js.native
    
    var equalsF: js.Any = js.native
    
    /**
      * Returns an array holding the values to which this dictionary maps
      * the specified key.
      * Returns an empty array if this dictionary contains no mappings for this key.
      * @param {Object} key key whose associated values are to be returned.
      * @return {Array} an array holding the values to which this dictionary maps
      * the specified key.
      */
    def getValue(key: K): js.Array[V] = js.native
    
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
      * Removes the specified values from the array of values associated with the
      * specified key. If a value isn't given, all values associated with the specified
      * key are removed.
      * @param {Object} key key whose mapping is to be removed from the
      * dictionary.
      * @param {Object=} value optional argument to specify the value to remove
      * from the array associated with the specified key.
      * @return {*} true if the dictionary changed, false if the key doesn't exist or
      * if the specified value isn't associated with the specified key.
      */
    def remove(key: K): Boolean = js.native
    def remove(key: K, value: V): Boolean = js.native
    
    /**
      * Adds the value to the array associated with the specified key, if
      * it is not already present.
      * @param {Object} key key with which the specified value is to be
      * associated.
      * @param {Object} value the value to add to the array at the key
      * @return {boolean} true if the value was not already associated with that key.
      */
    def setValue(key: K, value: V): Boolean = js.native
    
    /**
      * Returns the number of keys in this dictionary.
      * @return {number} the number of key-value mappings in this dictionary.
      */
    def size(): Double = js.native
    
    /**
      * Returns an array containing all of the values in this dictionary.
      * @return {Array} an array containing all of the values in this dictionary.
      */
    def values(): js.Array[V] = js.native
  }
}
