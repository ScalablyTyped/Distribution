package typings.typescript.mod

import typings.typescript.anon.Done
import typings.typescript.anon.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** ES6 Iterator type. */
trait Iterator[T] extends js.Object {
  def next(): Done[T] | `0`
}

object Iterator {
  @scala.inline
  def apply[T](next: () => Done[T] | `0`): Iterator[T] = {
    val __obj = js.Dynamic.literal(next = js.Any.fromFunction0(next))
    __obj.asInstanceOf[Iterator[T]]
  }
}

