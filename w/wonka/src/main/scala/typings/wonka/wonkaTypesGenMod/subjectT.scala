package typings.wonka.wonkaTypesGenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait subjectT[a] extends js.Object {
  def complete(): Unit
  def next(_1: a): Unit
  def source(_1: sinkT[a]): Unit
}

object subjectT {
  @scala.inline
  def apply[a](complete: () => Unit, next: a => Unit, source: sinkT[a] => Unit): subjectT[a] = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete), next = js.Any.fromFunction1(next), source = js.Any.fromFunction1(source))
    __obj.asInstanceOf[subjectT[a]]
  }
}

