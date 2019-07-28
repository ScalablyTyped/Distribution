package typings.typescript.typescriptMod

import typings.typescript.Anon_Done
import typings.typescript.Anon_DoneTrue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** ES6 Iterator type. */
trait Iterator[T] extends js.Object {
  def next(): Anon_Done[T] | Anon_DoneTrue
}

object Iterator {
  @scala.inline
  def apply[T](next: () => Anon_Done[T] | Anon_DoneTrue): Iterator[T] = {
    val __obj = js.Dynamic.literal(next = js.Any.fromFunction0(next))
  
    __obj.asInstanceOf[Iterator[T]]
  }
}

