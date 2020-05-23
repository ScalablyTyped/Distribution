package typings.when.global.When

import typings.when.When.Deferred
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("When.defer")
@js.native
object defer extends js.Object {
  /**
    * Creates a {promise, resolver} pair, either or both of which
    * may be given out safely to consumers.
    * The resolver has resolve, reject, and progress.  The promise
    * has then plus extended promise API.
    */
  def apply[T](): Deferred[T] = js.native
}

