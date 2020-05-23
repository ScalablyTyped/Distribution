package typings.typedoc.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Err[T, T2, E, E2] extends js.Object {
  def err(err: E): E2
  def ok(data: T): T2
}

object Err {
  @scala.inline
  def apply[T, T2, E, E2](err: E => E2, ok: T => T2): Err[T, T2, E, E2] = {
    val __obj = js.Dynamic.literal(err = js.Any.fromFunction1(err), ok = js.Any.fromFunction1(ok))
    __obj.asInstanceOf[Err[T, T2, E, E2]]
  }
}

