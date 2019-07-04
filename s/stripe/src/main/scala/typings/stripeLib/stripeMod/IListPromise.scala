package typings
package stripeLib.stripeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IListPromise[T]
  extends stdLib.AsyncIterableIterator[T]
     with stdLib.Promise[IList[T]] {
  def autoPagingEach(handler: js.Function1[/* item */ T, js.Promise[scala.Unit]]): scala.Unit = js.native
  def autoPagingToArray(opts: stripeLib.Anon_Limit): js.Promise[js.Array[T]] = js.native
}

