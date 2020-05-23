package typings.wonka.wonkaTypesGenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait observerT[a] extends js.Object {
  def complete(): Unit
  def next(_1: a): Unit
}

object observerT {
  @scala.inline
  def apply[a](complete: () => Unit, next: a => Unit): observerT[a] = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete), next = js.Any.fromFunction1(next))
    __obj.asInstanceOf[observerT[a]]
  }
}

