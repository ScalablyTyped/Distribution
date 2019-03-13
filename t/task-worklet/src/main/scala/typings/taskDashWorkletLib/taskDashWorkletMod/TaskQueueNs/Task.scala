package typings
package taskDashWorkletLib.taskDashWorkletMod.TaskQueueNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Task[T] extends js.Object {
  var id: scala.Double
  var result: js.Promise[T]
  var state: State
}

object Task {
  @scala.inline
  def apply[T](id: scala.Double, result: js.Promise[T], state: State): Task[T] = {
    val __obj = js.Dynamic.literal(id = id, result = result, state = state)
  
    __obj.asInstanceOf[Task[T]]
  }
}

