package typings.wonka.jsShimMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait observableObserverT[a] extends js.Object {
  def complete(): Unit
  def error(error: js.Any): Unit
  def next(value: a): Unit
}

object observableObserverT {
  @scala.inline
  def apply[a](complete: () => Unit, error: js.Any => Unit, next: a => Unit): observableObserverT[a] = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete), error = js.Any.fromFunction1(error), next = js.Any.fromFunction1(next))
    __obj.asInstanceOf[observableObserverT[a]]
  }
}

