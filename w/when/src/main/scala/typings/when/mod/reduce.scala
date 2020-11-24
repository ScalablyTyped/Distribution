package typings.when.mod

import typings.when.When.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("when", "reduce")
@js.native
object reduce extends js.Object {
  
  /**
    * Traditional reduce function, similar to `Array.prototype.reduce()`, but
    * input may contain promises and/or values, and reduceFunc
    * may return either a value or a promise, *and* initialValue may
    * be a promise for the starting value.
    * @param promisesOrValues array or promise for an array of anything,
    *      may contain a mix of promises and values.
    * @param reduceFunc function(accumulated:*, x:*, index:number):*} f reduce function
    * @returns a promise that will resolve to the final reduced value
    */
  def apply[T](
    promisesOrValues: js.Array[_],
    reduceFunc: js.Function3[/* reduction */ T, /* value */ js.Any, /* index */ Double, T | Promise[T]],
    initialValue: T
  ): Promise[T] = js.native
}
