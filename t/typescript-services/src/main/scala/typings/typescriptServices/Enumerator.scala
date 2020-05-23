package typings.typescriptServices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Enumerator extends js.Object {
  def atEnd(): Boolean
  def item(): js.Any
  def moveNext(): Boolean
}

object Enumerator {
  @scala.inline
  def apply(atEnd: () => Boolean, item: () => js.Any, moveNext: () => Boolean): Enumerator = {
    val __obj = js.Dynamic.literal(atEnd = js.Any.fromFunction0(atEnd), item = js.Any.fromFunction0(item), moveNext = js.Any.fromFunction0(moveNext))
    __obj.asInstanceOf[Enumerator]
  }
}

