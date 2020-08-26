package typings.wonka.jsShimMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait observableObserverT[a] extends js.Object {
  def complete(): Unit = js.native
  def error(error: js.Any): Unit = js.native
  def next(value: a): Unit = js.native
}

object observableObserverT {
  @scala.inline
  def apply[a](complete: () => Unit, error: js.Any => Unit, next: a => Unit): observableObserverT[a] = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete), error = js.Any.fromFunction1(error), next = js.Any.fromFunction1(next))
    __obj.asInstanceOf[observableObserverT[a]]
  }
  @scala.inline
  implicit class observableObserverTOps[Self <: observableObserverT[_], a] (val x: Self with observableObserverT[a]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setComplete(value: () => Unit): Self = this.set("complete", js.Any.fromFunction0(value))
    @scala.inline
    def setError(value: js.Any => Unit): Self = this.set("error", js.Any.fromFunction1(value))
    @scala.inline
    def setNext(value: a => Unit): Self = this.set("next", js.Any.fromFunction1(value))
  }
  
}

