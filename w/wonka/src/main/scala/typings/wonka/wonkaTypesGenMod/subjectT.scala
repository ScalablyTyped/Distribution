package typings.wonka.wonkaTypesGenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait subjectT[a] extends js.Object {
  def complete(): Unit = js.native
  def next(_1: a): Unit = js.native
  def source(_1: sinkT[a]): Unit = js.native
}

object subjectT {
  @scala.inline
  def apply[a](complete: () => Unit, next: a => Unit, source: sinkT[a] => Unit): subjectT[a] = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete), next = js.Any.fromFunction1(next), source = js.Any.fromFunction1(source))
    __obj.asInstanceOf[subjectT[a]]
  }
  @scala.inline
  implicit class subjectTOps[Self <: subjectT[_], a] (val x: Self with subjectT[a]) extends AnyVal {
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
    def setNext(value: a => Unit): Self = this.set("next", js.Any.fromFunction1(value))
    @scala.inline
    def setSource(value: sinkT[a] => Unit): Self = this.set("source", js.Any.fromFunction1(value))
  }
  
}

