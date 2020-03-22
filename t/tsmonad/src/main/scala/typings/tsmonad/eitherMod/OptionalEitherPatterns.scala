package typings.tsmonad.eitherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<tsmonad.tsmonad/lib/src/either.EitherPatterns<L, R, T>> */
trait OptionalEitherPatterns[L, R, T] extends js.Object {
  var left: js.UndefOr[js.Function1[/* l */ L, T]] = js.undefined
  var right: js.UndefOr[js.Function1[/* r */ R, T]] = js.undefined
}

object OptionalEitherPatterns {
  @scala.inline
  def apply[L, R, T](left: /* l */ L => T = null, right: /* r */ R => T = null): OptionalEitherPatterns[L, R, T] = {
    val __obj = js.Dynamic.literal()
    if (left != null) __obj.updateDynamic("left")(js.Any.fromFunction1(left))
    if (right != null) __obj.updateDynamic("right")(js.Any.fromFunction1(right))
    __obj.asInstanceOf[OptionalEitherPatterns[L, R, T]]
  }
}

