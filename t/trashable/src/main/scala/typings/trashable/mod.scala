package typings.trashable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("trashable", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /* Inlined std.Promise<T> & {trash (): void} */
  @js.native
  trait TrashablePromise[T] extends js.Object {
    @JSName(scala.scalajs.js.Symbol.toStringTag)
    val toStringTag: String = js.native
    /**
      * Attaches a callback for only the rejection of the Promise.
      * @param onrejected The callback to execute when the Promise is rejected.
      * @returns A Promise for the completion of the callback.
      */
    def `catch`[TResult](): js.Promise[T | TResult] = js.native
    def `catch`[TResult](onrejected: js.Function1[/* reason */ js.Any, TResult | js.Thenable[TResult]]): js.Promise[T | TResult] = js.native
    /**
      * Attaches a callback that is invoked when the Promise is settled (fulfilled or rejected). The
      * resolved value cannot be modified from the callback.
      * @param onfinally The callback to execute when the Promise is settled (fulfilled or rejected).
      * @returns A Promise for the completion of the callback.
      */
    def `finally`(): js.Promise[T] = js.native
    def `finally`(onfinally: js.Function0[Unit]): js.Promise[T] = js.native
    /**
      * Attaches callbacks for the resolution and/or rejection of the Promise.
      * @param onfulfilled The callback to execute when the Promise is resolved.
      * @param onrejected The callback to execute when the Promise is rejected.
      * @returns A Promise for the completion of which ever callback is executed.
      */
    def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2] = js.native
    def `then`[TResult1, TResult2](
      onfulfilled: js.UndefOr[scala.Nothing],
      onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]
    ): js.Promise[TResult1 | TResult2] = js.native
    def `then`[TResult1, TResult2](onfulfilled: js.Function1[/* value */ T, TResult1 | js.Thenable[TResult1]]): js.Promise[TResult1 | TResult2] = js.native
    def `then`[TResult1, TResult2](
      onfulfilled: js.Function1[/* value */ T, TResult1 | js.Thenable[TResult1]],
      onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]
    ): js.Promise[TResult1 | TResult2] = js.native
    def `then`[TResult1, TResult2](onfulfilled: Null, onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]): js.Promise[TResult1 | TResult2] = js.native
    def trash(): Unit = js.native
  }
  
  def apply[T](promise: js.Promise[T]): TrashablePromise[T] = js.native
}

