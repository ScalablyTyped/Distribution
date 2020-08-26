package typings.wordpressJestConsole.jest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Matchers[R, T] extends js.Object {
  /**
    * Ensure that `console.error` function was called.
    */
  def toHaveErrored(): R = js.native
  /**
    * Ensure that `console.error` function was called with specific arguments.
    */
  def toHaveErroredWith(args: js.Any*): R = js.native
  /**
    * Ensure that `console.info` function was called.
    */
  def toHaveInformed(): R = js.native
  /**
    * Ensure that `console.info` function was called with specific arguments.
    */
  def toHaveInformedWith(args: js.Any*): R = js.native
  /**
    * Ensure that `console.log` function was called.
    */
  def toHaveLogged(): R = js.native
  /**
    * Ensure that `console.log` function was called with specific arguments.
    */
  def toHaveLoggedWith(args: js.Any*): R = js.native
  /**
    * Ensure that `console.warn` function was called.
    */
  def toHaveWarned(): R = js.native
  /**
    * Ensure that `console.warn` function was called with specific arguments.
    */
  def toHaveWarnedWith(args: js.Any*): R = js.native
}

object Matchers {
  @scala.inline
  def apply[R, T](
    toHaveErrored: () => R,
    toHaveErroredWith: /* repeated */ js.Any => R,
    toHaveInformed: () => R,
    toHaveInformedWith: /* repeated */ js.Any => R,
    toHaveLogged: () => R,
    toHaveLoggedWith: /* repeated */ js.Any => R,
    toHaveWarned: () => R,
    toHaveWarnedWith: /* repeated */ js.Any => R
  ): Matchers[R, T] = {
    val __obj = js.Dynamic.literal(toHaveErrored = js.Any.fromFunction0(toHaveErrored), toHaveErroredWith = js.Any.fromFunction1(toHaveErroredWith), toHaveInformed = js.Any.fromFunction0(toHaveInformed), toHaveInformedWith = js.Any.fromFunction1(toHaveInformedWith), toHaveLogged = js.Any.fromFunction0(toHaveLogged), toHaveLoggedWith = js.Any.fromFunction1(toHaveLoggedWith), toHaveWarned = js.Any.fromFunction0(toHaveWarned), toHaveWarnedWith = js.Any.fromFunction1(toHaveWarnedWith))
    __obj.asInstanceOf[Matchers[R, T]]
  }
  @scala.inline
  implicit class MatchersOps[Self <: Matchers[_, _], R, T] (val x: Self with (Matchers[R, T])) extends AnyVal {
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
    def setToHaveErrored(value: () => R): Self = this.set("toHaveErrored", js.Any.fromFunction0(value))
    @scala.inline
    def setToHaveErroredWith(value: /* repeated */ js.Any => R): Self = this.set("toHaveErroredWith", js.Any.fromFunction1(value))
    @scala.inline
    def setToHaveInformed(value: () => R): Self = this.set("toHaveInformed", js.Any.fromFunction0(value))
    @scala.inline
    def setToHaveInformedWith(value: /* repeated */ js.Any => R): Self = this.set("toHaveInformedWith", js.Any.fromFunction1(value))
    @scala.inline
    def setToHaveLogged(value: () => R): Self = this.set("toHaveLogged", js.Any.fromFunction0(value))
    @scala.inline
    def setToHaveLoggedWith(value: /* repeated */ js.Any => R): Self = this.set("toHaveLoggedWith", js.Any.fromFunction1(value))
    @scala.inline
    def setToHaveWarned(value: () => R): Self = this.set("toHaveWarned", js.Any.fromFunction0(value))
    @scala.inline
    def setToHaveWarnedWith(value: /* repeated */ js.Any => R): Self = this.set("toHaveWarnedWith", js.Any.fromFunction1(value))
  }
  
}

