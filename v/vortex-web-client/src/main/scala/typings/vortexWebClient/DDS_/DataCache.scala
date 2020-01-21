package typings.vortexWebClient.DDS_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DDS.DataCache")
@js.native
class DataCache protected () extends js.Object {
  /**
  		 * Constructs a `DataCache` with a given `depth`. If the `cache` parameter
  		 * is present, then the current cache is initialized with this parameter.
  		 *
  		 * Provides a way of storing and flexibly accessing the
  		 * data received through a `DataReader`. A `DataCache` is organized as
  		 * a map of queues. The depth of the queues is specified at construction
  		 * time.
  		 *
  		 * @param depth - cache size
  		 * @param cache - cache data structure
  		 */
  def this(depth: Double, cache: js.Any) = this()
  /**
  		 * Register a listener to be notified whenever data which matches a predicate is written into the cache.
  		 * If no predicate is provided then the listeners is always notified upon data inserion.
  		 *
  		 * @param l - listener function
  		 * @param p - predicate
  		 */
  def addListener(l: js.Function1[/* data */ js.Any, Unit]): Unit = js.native
  def addListener(l: js.Function1[/* data */ js.Any, Unit], p: js.Function1[/* data */ js.Any, Boolean]): Unit = js.native
  /**
  		 * clears the data cache
  		 */
  def clear(): Unit = js.native
  /**
  		 * Returns the list of elements in the cache that satisfy the predicate `f`.
  		 *
  		 * @param f - the predicate to be applied to filter the cache values
  		 * @returns An array holding the filtered values
  		 */
  def filter(f: js.Function1[/* data */ js.Any, Boolean]): js.Array[_] = js.native
  /**
  		 * Returns the list of elements in the cache that doesn't satisfy the predicate `f`.
  		 *
  		 * @returns An array holding the filtered values
  		 * @see DataCache#filter
  		 */
  def filterNot(f: js.Function1[/* data */ js.Any, Boolean]): js.Array[_] = js.native
  /**
  		 * folds the element of the cache using `z` as the `zero` element and
  		 * `f` as the binary operator.
  		 *
  		 * @param z - initial value
  		 * @param {function} f - reduce function
  		 */
  def fold(z: js.Any, f: js.Function1[/* data */ js.Any, _]): Unit = js.native
  /**
  		 * Execute the function `f` for each element of the cache.
  		 *
  		 * @memberof! dds.DataCache#
  		 * @param f - the function to be applied
  		 * @returns results of the function execution
  		 */
  def forEach(f: js.Function1[/* data */ js.Any, _]): js.Array[_] = js.native
  /**
  		 * Same as forEach but applied, for each key, only to the first `n` samples of the cache
  		 *
  		 * @param f - the function to be applied
  		 * @param n - samples set size
  		 */
  def forEachN(f: js.Function1[/* data */ js.Any, _], n: Double): js.Array[_] = js.native
  /**
  		 * Return `coffez.Some(v)` if there is an element in the cache corresponding to the
  		 * key `k` otherwise it returns `coffez.None`.
  		 *
  		 * @param k - key
  		 */
  def get(k: js.Any): js.Any = js.native
  /**
  		 * Return `coffez.Some(v)` if there is an element in the cache corresponding to the
  		 * key `k` otherwise executes `f` and returns its result.
  		 *
  		 * @param k - key
  		 * @param f - the function to apply
  		 */
  def getOrElse(k: js.Any, f: js.Function1[/* data */ js.Any, _]): js.Any = js.native
  /**
  		 * Returns a cache that is the result of applying `f` to each element of the cache.
  		 *
  		 * @param f - the function to be applied
  		 * @returns A cache holding the results of the function execution
  		 */
  def map(f: js.Function1[/* data */ js.Any, _]): DataCache = js.native
  /**
  		 * Returns the values included in the cache as an array.
  		 *
  		 * @return All the cache values
  		 */
  def read(): js.Array[_] = js.native
  /**
  		 * Returns the last value of the cache in an array.
  		 *
  		 * @return the last value of the cache
  		 */
  def readLast(): js.Any = js.native
  /**
  		 * Returns the `K`ith value of the cache as Monad, ie: `coffez.Some` if it exists, `coffez.None` if not.
  		 *
  		 * @return the 'k'th value
  		 */
  def take(): js.Any = js.native
  /**
  		 * Returns all the values included in the cache as an array and empties the cache.
  		 *
  		 * @return All the cache values
  		 */
  def takeAll(): js.Array[_] = js.native
  /**
  		 * Takes elements from the cache up to when the predicate `f` is satisfied
  		 *
  		 * @param f - the predicate
  		 * @return taken cache values
  		 */
  def takeWithFilter(f: js.Function1[/* data */ js.Any, Boolean]): js.Array[_] = js.native
  /**
  		 * Write the element `data` with key `k` into the cache.
  		 *
  		 * @param k - data key
  		 * @param data - data value
  		 * @returns the written data value
  		 */
  def write(k: js.Any, data: js.Any): js.Any = js.native
}

