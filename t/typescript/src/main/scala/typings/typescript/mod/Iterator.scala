package typings.typescript.mod

import typings.typescript.AnonDone
import typings.typescript.AnonDoneTrue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** ES6 Iterator type. */
trait Iterator[T] extends js.Object {
  def next(): AnonDone[T] | AnonDoneTrue
}

object Iterator {
  @scala.inline
  def apply[T](next: () => AnonDone[T] | AnonDoneTrue): Iterator[T] = {
    val __obj = js.Dynamic.literal(next = js.Any.fromFunction0(next))
  
    __obj.asInstanceOf[Iterator[T]]
  }
}

