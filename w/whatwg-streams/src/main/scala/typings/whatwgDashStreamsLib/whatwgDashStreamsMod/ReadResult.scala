package typings
package whatwgDashStreamsLib.whatwgDashStreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadResult[T] extends js.Object {
  var done: scala.Boolean
  var value: T
}

object ReadResult {
  @scala.inline
  def apply[T](done: scala.Boolean, value: T): ReadResult[T] = {
    val __obj = js.Dynamic.literal(done = done, value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReadResult[T]]
  }
}

