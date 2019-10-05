package typings.when.When

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("When.all")
@js.native
object all extends js.Object {
  /**
    * Return a promise that will resolve only once all the supplied promisesOrValues
    * have resolved. The resolution value of the returned promise will be an array
    * containing the resolution values of each of the promisesOrValues.
    * @memberOf when
    *
    * @param promisesOrValues array of anything, may contain a mix
    *      of {@link Promise}s and values
    */
  def apply[T](promisesOrValues: js.Array[_]): Promise[T] = js.native
}

