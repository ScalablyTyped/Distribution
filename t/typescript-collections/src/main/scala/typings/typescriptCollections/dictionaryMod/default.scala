package typings.typescriptCollections.dictionaryMod

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
}

