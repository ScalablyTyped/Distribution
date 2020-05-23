package typings.ydnDb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Push extends js.Object {
  def push(value: js.Any): Unit
}

object Push {
  @scala.inline
  def apply(push: js.Any => Unit): Push = {
    val __obj = js.Dynamic.literal(push = js.Any.fromFunction1(push))
    __obj.asInstanceOf[Push]
  }
}

