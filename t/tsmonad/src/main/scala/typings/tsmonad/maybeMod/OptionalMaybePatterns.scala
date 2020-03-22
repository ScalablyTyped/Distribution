package typings.tsmonad.maybeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<tsmonad.tsmonad/lib/src/maybe.MaybePatterns<T, U>> */
trait OptionalMaybePatterns[T, U] extends js.Object {
  var just: js.UndefOr[js.Function1[/* t */ T, U]] = js.undefined
  var nothing: js.UndefOr[js.Function0[U]] = js.undefined
}

object OptionalMaybePatterns {
  @scala.inline
  def apply[T, U](just: /* t */ T => U = null, nothing: () => U = null): OptionalMaybePatterns[T, U] = {
    val __obj = js.Dynamic.literal()
    if (just != null) __obj.updateDynamic("just")(js.Any.fromFunction1(just))
    if (nothing != null) __obj.updateDynamic("nothing")(js.Any.fromFunction0(nothing))
    __obj.asInstanceOf[OptionalMaybePatterns[T, U]]
  }
}

