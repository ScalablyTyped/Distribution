package typings.vscodeLanguageserver.progressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultProgress[R] extends js.Object {
  def report(data: R): Unit
}

object ResultProgress {
  @scala.inline
  def apply[R](report: R => Unit): ResultProgress[R] = {
    val __obj = js.Dynamic.literal(report = js.Any.fromFunction1(report))
    __obj.asInstanceOf[ResultProgress[R]]
  }
}

