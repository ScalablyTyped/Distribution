package typings.websocket.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStringified extends js.Object {
  def toString(args: js.Any*): String
}

object IStringified {
  @scala.inline
  def apply(toString: /* repeated */ js.Any => String): IStringified = {
    val __obj = js.Dynamic.literal(toString = js.Any.fromFunction1(toString))
    __obj.asInstanceOf[IStringified]
  }
}

