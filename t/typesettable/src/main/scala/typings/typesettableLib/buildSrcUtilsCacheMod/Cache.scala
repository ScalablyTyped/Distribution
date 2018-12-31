package typings
package typesettableLib.buildSrcUtilsCacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typesettable/build/src/utils/cache", "Cache")
@js.native
class Cache[T] protected () extends js.Object {
  /**
    * @constructor
    *
    * @param {string} compute The function whose results will be cached.
    */
  def this(compute: js.Function1[/* k */ java.lang.String, T]) = this()
  var cache: js.Any = js.native
  var compute: js.Any = js.native
  /**
    * Reset the cache empty.
    *
    * @return {Cache<T>} The calling Cache.
    */
  def clear(): Cache[T] = js.native
  /**
    * Attempt to look up k in the cache, computing the result if it isn't
    * found.
    *
    * @param {string} k The key to look up in the cache.
    * @return {T} The value associated with k; the result of compute(k).
    */
  def get(k: java.lang.String): T = js.native
}

