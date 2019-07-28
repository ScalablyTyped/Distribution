package typings.typescriptDashServices.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Iterator[T] extends js.Object {
  def current(): T
  def moveNext(): Boolean
}

object Iterator {
  @scala.inline
  def apply[T](current: () => T, moveNext: () => Boolean): Iterator[T] = {
    val __obj = js.Dynamic.literal(current = js.Any.fromFunction0(current), moveNext = js.Any.fromFunction0(moveNext))
  
    __obj.asInstanceOf[Iterator[T]]
  }
}

