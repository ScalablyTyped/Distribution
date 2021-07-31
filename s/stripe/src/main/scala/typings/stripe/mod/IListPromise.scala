package typings.stripe.mod

import typings.std.AsyncIterableIterator
import typings.stripe.anon.Limit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IListPromise[T]
  extends js.Promise[IList[T]]
     with AsyncIterableIterator[T] {
  
  def autoPagingEach(handler: js.Function1[/* item */ T, js.Promise[Unit]]): Unit = js.native
  
  def autoPagingToArray(opts: Limit): js.Promise[js.Array[T]] = js.native
  
  /* InferMemberOverrides */
  override def `then`[B](
    onFulfilled: js.Function1[IList[T], B | js.Thenable[B]],
    onRejected: js.UndefOr[js.Function1[Any, B | js.Thenable[B]]]
  ): js.Promise[B] & js.Thenable[B] = js.native
  /* InferMemberOverrides */
  override def `then`[B](onFulfilled: Unit, onRejected: js.UndefOr[js.Function1[Any, B | js.Thenable[B]]]): js.Promise[B] & js.Thenable[B] = js.native
}
