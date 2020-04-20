package typings.traverson.mod.Traverson

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Traversal extends js.Object {
  def continue(): Builder
}

object Traversal {
  @scala.inline
  def apply(continue: () => Builder): Traversal = {
    val __obj = js.Dynamic.literal(continue = js.Any.fromFunction0(continue))
    __obj.asInstanceOf[Traversal]
  }
}

