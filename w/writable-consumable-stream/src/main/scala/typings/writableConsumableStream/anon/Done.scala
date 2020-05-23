package typings.writableConsumableStream.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Done[T] extends js.Object {
  var done: Boolean
  var value: T
}

object Done {
  @scala.inline
  def apply[T](done: Boolean, value: T): Done[T] = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Done[T]]
  }
}

