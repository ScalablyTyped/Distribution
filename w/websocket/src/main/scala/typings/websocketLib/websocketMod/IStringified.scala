package typings
package websocketLib.websocketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStringified extends js.Object {
  def toString(args: js.Any*): java.lang.String
}

object IStringified {
  @scala.inline
  def apply(toString: /* repeated */ js.Any => java.lang.String): IStringified = {
    val __obj = js.Dynamic.literal(toString = js.Any.fromFunction1(toString))
  
    __obj.asInstanceOf[IStringified]
  }
}

