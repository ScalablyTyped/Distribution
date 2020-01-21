package typings.wordpressJestConsole.jest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Matchers[R, T] extends js.Object {
  /**
    * Ensure that `console.error` function was called.
    */
  def toHaveErrored(): R
  /**
    * Ensure that `console.error` function was called with specific arguments.
    */
  def toHaveErroredWith(args: js.Any*): R
  /**
    * Ensure that `console.info` function was called.
    */
  def toHaveInformed(): R
  /**
    * Ensure that `console.info` function was called with specific arguments.
    */
  def toHaveInformedWith(args: js.Any*): R
  /**
    * Ensure that `console.log` function was called.
    */
  def toHaveLogged(): R
  /**
    * Ensure that `console.log` function was called with specific arguments.
    */
  def toHaveLoggedWith(args: js.Any*): R
  /**
    * Ensure that `console.warn` function was called.
    */
  def toHaveWarned(): R
  /**
    * Ensure that `console.warn` function was called with specific arguments.
    */
  def toHaveWarnedWith(args: js.Any*): R
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
}

