package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Timer extends js.Object {
  var startTime: Double
  var time: Double
  def end(): Unit
  def start(): Unit
}

object Timer {
  @scala.inline
  def apply(end: () => Unit, start: () => Unit, startTime: Double, time: Double): Timer = {
    val __obj = js.Dynamic.literal(end = js.Any.fromFunction0(end), start = js.Any.fromFunction0(start), startTime = startTime.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[Timer]
  }
}

