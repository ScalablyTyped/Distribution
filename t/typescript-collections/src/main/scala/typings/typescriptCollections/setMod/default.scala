package typings.typescriptCollections.setMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-collections/dist/lib/Set", JSImport.Default)
@js.native
/**
  * Creates an empty set.
  * @class <p>A set is a data structure that contains no duplicate items.</p>
  * <p>If the inserted elements are custom objects a function
  * which converts elements to strings must be provided. Example:</p>
  *
  * <pre>
  * function petToString(pet) {
  *  return pet.name;
  * }
  * </pre>
  *
  * @constructor
  * @param {function(Object):string=} toStringFunction optional function used
  * to convert elements to strings. If the elements aren't strings or if toString()
  * is not appropriate, a custom function which receives an object and returns a
  * unique string must be provided.
  */
class default[T] () extends Set[T] {
  def this(toStringFunction: js.Function1[/* item */ T, String]) = this()
}

