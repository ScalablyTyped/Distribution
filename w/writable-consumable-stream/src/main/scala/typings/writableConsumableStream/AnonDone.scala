package typings.writableConsumableStream

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDone[T] extends js.Object {
  var done: Boolean
  var value: T
}

object AnonDone {
  @scala.inline
  def apply[T](done: Boolean, value: T): AnonDone[T] = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDone[T]]
  }
}

