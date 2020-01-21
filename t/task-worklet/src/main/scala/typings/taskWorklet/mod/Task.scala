package typings.taskWorklet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Task[T] extends js.Object {
  var id: Double
  var result: js.Promise[T]
  var state: State
}

object Task {
  @scala.inline
  def apply[T](id: Double, result: js.Promise[T], state: State): Task[T] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Task[T]]
  }
}

