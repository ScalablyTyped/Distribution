package typings.tsmonad.eitherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<tsmonad.tsmonad/lib/src/either.EitherPatterns<L, R, T>> */
@js.native
trait OptionalEitherPatterns[L, R, T] extends js.Object {
  var left: js.UndefOr[js.Function1[/* l */ L, T]] = js.native
  var right: js.UndefOr[js.Function1[/* r */ R, T]] = js.native
}

object OptionalEitherPatterns {
  @scala.inline
  def apply[L, R, T](): OptionalEitherPatterns[L, R, T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionalEitherPatterns[L, R, T]]
  }
  @scala.inline
  implicit class OptionalEitherPatternsOps[Self <: OptionalEitherPatterns[_, _, _], L, R, T] (val x: Self with (OptionalEitherPatterns[L, R, T])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLeft(value: /* l */ L => T): Self = this.set("left", js.Any.fromFunction1(value))
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    @scala.inline
    def setRight(value: /* r */ R => T): Self = this.set("right", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRight: Self = this.set("right", js.undefined)
  }
  
}

