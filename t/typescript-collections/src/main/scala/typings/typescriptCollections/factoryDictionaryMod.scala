package typings.typescriptCollections

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-collections/dist/lib/FactoryDictionary", JSImport.Namespace)
@js.native
object factoryDictionaryMod extends js.Object {
  
  @js.native
  trait FactoryDictionary[K, V]
    extends typings.typescriptCollections.dictionaryMod.default[K, V] {
    
    /**
      * Factory to create default values.
      * @type {function(Object):string}
      * @protected
      */
    /* protected */ def defaultFactoryFunction(): V = js.native
    
    /**
      * Associates the specified default value with the specified key in this dictionary,
      * if it didn't contain the key yet. If the key existed, the existing value will be used.
      * @param {Object} key key with which the specified value is to be
      * associated.
      * @param {Object} defaultValue default value to be associated with the specified key.
      * @return {*} previous value associated with the specified key, or the default value,
      * if the key didn't exist yet.
      */
    def setDefault(key: K, defaultValue: V): V = js.native
  }
  
  @js.native
  class default[K, V] protected () extends FactoryDictionary[K, V] {
    /**
      * Creates an empty dictionary.
      * @class <p>Dictionaries map keys to values; each key can map to at most one value.
      * This implementation accepts any kind of objects as keys.</p>
      *
      * <p>The default factory function should return a new object of the provided
      * type. Example:</p>
      * <pre>
      * function petFactory() {
      *  return new Pet();
      * }
      * </pre>
      *
      * <p>If the keys are custom objects a function which converts keys to unique
      * strings must be provided. Example:</p>
      * <pre>
      * function petToString(pet) {
      *  return pet.name;
      * }
      * </pre>
      * @constructor
      * @param {function():V=} defaultFactoryFunction function used to create a
      * default object.
      * @param {function(Object):string=} toStrFunction optional function used
      * to convert keys to strings. If the keys aren't strings or if toString()
      * is not appropriate, a custom function which receives a key and returns a
      * unique string must be provided.
      */
    def this(defaultFactoryFunction: js.Function0[V]) = this()
    def this(defaultFactoryFunction: js.Function0[V], toStrFunction: js.Function1[/* key */ K, String]) = this()
  }
}
