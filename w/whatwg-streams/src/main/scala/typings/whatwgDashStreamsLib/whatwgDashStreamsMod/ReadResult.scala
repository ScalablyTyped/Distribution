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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("done")(done)
    __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadResult[T]]
  }
}

