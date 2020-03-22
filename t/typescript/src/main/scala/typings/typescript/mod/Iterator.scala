package typings.typescript.mod

import typings.typescript.Anon0
import typings.typescript.AnonDone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** ES6 Iterator type. */
trait Iterator[T] extends js.Object {
  def next(): AnonDone[T] | Anon0
}

object Iterator {
  @scala.inline
  def apply[T](next: () => AnonDone[T] | Anon0): Iterator[T] = {
    val __obj = js.Dynamic.literal(next = js.Any.fromFunction0(next))
  
    __obj.asInstanceOf[Iterator[T]]
  }
}

