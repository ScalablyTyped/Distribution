package typings.tstl.idequeMod

import typings.tstl.ipushfrontMod.IPushFront
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDeque[T] extends IPushFront[T] {
  /**
    * Erase the first element.
    */
  def pop_front(): Unit
}

object IDeque {
  @scala.inline
  def apply[T](pop_front: () => Unit, push_front: T => Unit): IDeque[T] = {
    val __obj = js.Dynamic.literal(pop_front = js.Any.fromFunction0(pop_front), push_front = js.Any.fromFunction1(push_front))
  
    __obj.asInstanceOf[IDeque[T]]
  }
}

