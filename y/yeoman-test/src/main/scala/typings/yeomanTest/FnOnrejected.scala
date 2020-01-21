package typings.yeomanTest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnOnrejected extends js.Object {
  def apply[TResult](): js.Promise[String | TResult] = js.native
  def apply[TResult](onrejected: js.Function1[/* reason */ js.Any, TResult | js.Thenable[TResult]]): js.Promise[String | TResult] = js.native
}

