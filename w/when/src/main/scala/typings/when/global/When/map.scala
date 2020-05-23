package typings.when.global.When

import typings.when.When.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("When.map")
@js.native
object map extends js.Object {
  /**
    * Promise-aware array map function, similar to `Array.prototype.map()`,
    * but input array may contain promises or values.
    * @param promisesOrValues array of anything, may contain a mix of {@link Promise}s and values
    * @param mapFunc map function which may return a promise or value
    * @returns a promise that will fulfill with an array of mapped values
    *  or reject if any input promise rejects.
    */
  def apply[T](promisesOrValues: js.Array[_], mapFunc: js.Function2[/* value */ js.Any, /* index */ Double, _]): Promise[T] = js.native
}

