package typings.ydnDb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPush extends js.Object {
  def push(value: js.Any): Unit
}

object AnonPush {
  @scala.inline
  def apply(push: js.Any => Unit): AnonPush = {
    val __obj = js.Dynamic.literal(push = js.Any.fromFunction1(push))
    __obj.asInstanceOf[AnonPush]
  }
}

