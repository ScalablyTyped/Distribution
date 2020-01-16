package typings.typedoc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data[T, T2, E, E2] extends js.Object {
  def err(err: E): E2
  def ok(data: T): T2
}

object Anon_Data {
  @scala.inline
  def apply[T, T2, E, E2](err: E => E2, ok: T => T2): Anon_Data[T, T2, E, E2] = {
    val __obj = js.Dynamic.literal(err = js.Any.fromFunction1(err), ok = js.Any.fromFunction1(ok))
  
    __obj.asInstanceOf[Anon_Data[T, T2, E, E2]]
  }
}

