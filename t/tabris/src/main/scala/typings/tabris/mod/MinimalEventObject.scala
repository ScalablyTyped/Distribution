package typings.tabris.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MinimalEventObject[T /* <: js.Object */] extends js.Object {
  var target: T
}

object MinimalEventObject {
  @scala.inline
  def apply[T /* <: js.Object */](target: T): MinimalEventObject[T] = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinimalEventObject[T]]
  }
}

