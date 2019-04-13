package typings
package traverseLib.traverseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Traverse[T] extends js.Object {
  /**
    * Execute `fn` for each node in the object but unlike `.map()`, when `this.update()` is called it updates the object in-place.
    */
  def forEach(cb: js.ThisFunction1[/* this */ TraverseContext, /* v */ js.Any, scala.Unit]): js.Any = js.native
  /**
    * Get the element at the array `path`.
    */
  def get(path: js.Array[java.lang.String]): js.Any = js.native
  /**
    * Return whether the element at the array `path` exists.
    */
  def has(path: js.Array[java.lang.String]): scala.Boolean = js.native
  /**
    * Execute `fn` for each node in the object and return a new object with the results of the walk. To update nodes in the result use `this.update(value)`.
    */
  def map(cb: js.ThisFunction1[/* this */ TraverseContext, /* v */ js.Any, scala.Unit]): js.Any = js.native
  /**
    * Return an `Array` of every node in the object.
    */
  def nodes(): js.Array[_] = js.native
  /**
    * Return an `Array` of every possible non-cyclic path in the object. 
    * Paths are `Array`s of string keys.
    */
  def paths(): js.Array[js.Array[java.lang.String]] = js.native
  /**
    * For each node in the object, perform a [left-fold](http://en.wikipedia.org/wiki/Fold_(higher-order_function)) with the return value of `fn(acc, node)`.
    * 
    * If `init` isn't specified, `init` is set to the root object for the first step and the root element is skipped.
    */
  def reduce(cb: js.ThisFunction2[/* this */ TraverseContext, /* acc */ js.Any, /* v */ js.Any, scala.Unit]): js.Any = js.native
  def reduce(
    cb: js.ThisFunction2[/* this */ TraverseContext, /* acc */ js.Any, /* v */ js.Any, scala.Unit],
    init: js.Any
  ): js.Any = js.native
  /**
    * Set the element at the array `path` to `value`.
    */
  def set(path: js.Array[java.lang.String], value: js.Any): js.Any = js.native
}

