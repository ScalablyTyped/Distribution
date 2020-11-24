package typings.stripe.mod

import typings.std.AsyncIterableIterator
import typings.stripe.anon.Limit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IListPromise[T]
  extends js.Promise[IList[T]]
     with AsyncIterableIterator[T] {
  
  def autoPagingEach(handler: js.Function1[/* item */ T, js.Promise[Unit]]): Unit = js.native
  
  def autoPagingToArray(opts: Limit): js.Promise[js.Array[T]] = js.native
}
