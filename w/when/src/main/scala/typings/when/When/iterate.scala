package typings.when.When

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("When.iterate")
@js.native
object iterate extends js.Object {
  /**
    * Generates a potentially infinite stream of promises by repeatedly calling f until predicate becomes true.
    * @memberOf when
    * @param f function that, given a seed, returns the next value or a promise for it.
    * @param predicate function that receives the current iteration value, and should return truthy when the iterating should stop
    * @param handler function that receives each value as it is produced by f. It may return a promise to delay the next iteration.
    * @param seed initial value provided to the handler, and first f invocation. May be a promise.
    */
  def apply[U](
    f: js.Function1[/* seed */ U, U | Promise_[U]],
    predicate: js.Function1[/* value */ U, Boolean],
    handler: js.Function1[/* value */ U, Promise_[_] | Unit],
    seed: U
  ): Promise_[U] = js.native
  def apply[U](
    f: js.Function1[/* seed */ U, U | Promise_[U]],
    predicate: js.Function1[/* value */ U, Boolean],
    handler: js.Function1[/* value */ U, Promise_[_] | Unit],
    seed: Promise_[U]
  ): Promise_[U] = js.native
}

