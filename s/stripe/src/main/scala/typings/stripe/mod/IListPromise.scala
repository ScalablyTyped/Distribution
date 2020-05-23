package typings.stripe.mod

import typings.std.AsyncIterableIterator
import typings.std.Promise
import typings.stripe.anon.Limit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IListPromise[T]
  extends AsyncIterableIterator[T]
     with Promise[IList[T]] {
  def autoPagingEach(handler: js.Function1[/* item */ T, js.Promise[Unit]]): Unit = js.native
  def autoPagingToArray(opts: Limit): js.Promise[js.Array[T]] = js.native
}

