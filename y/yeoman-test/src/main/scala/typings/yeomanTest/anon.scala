package typings.yeomanTest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object anon extends js.Object {
  @js.native
  trait FnCall extends js.Object {
    def apply[TResult1, TResult2](): js.Promise[TResult1 | TResult2] = js.native
    def apply[TResult1, TResult2](
      onfulfilled: js.UndefOr[scala.Nothing],
      onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]
    ): js.Promise[TResult1 | TResult2] = js.native
    def apply[TResult1, TResult2](onfulfilled: js.Function1[/* value */ String, TResult1 | js.Thenable[TResult1]]): js.Promise[TResult1 | TResult2] = js.native
    def apply[TResult1, TResult2](
      onfulfilled: js.Function1[/* value */ String, TResult1 | js.Thenable[TResult1]],
      onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]
    ): js.Promise[TResult1 | TResult2] = js.native
    def apply[TResult1, TResult2](onfulfilled: Null, onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]): js.Promise[TResult1 | TResult2] = js.native
  }
  
  @js.native
  trait FnCallOnrejected extends js.Object {
    def apply[TResult](): js.Promise[String | TResult] = js.native
    def apply[TResult](onrejected: js.Function1[/* reason */ js.Any, TResult | js.Thenable[TResult]]): js.Promise[String | TResult] = js.native
  }
  
}

