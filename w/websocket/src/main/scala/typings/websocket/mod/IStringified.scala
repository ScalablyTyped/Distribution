package typings.websocket.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStringified extends js.Object {
  def toString(args: js.Any*): String = js.native
}

object IStringified {
  @scala.inline
  def apply(toString: /* repeated */ js.Any => String): IStringified = {
    val __obj = js.Dynamic.literal(toString = js.Any.fromFunction1(toString))
    __obj.asInstanceOf[IStringified]
  }
  @scala.inline
  implicit class IStringifiedOps[Self <: IStringified] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setToString(value: /* repeated */ js.Any => String): Self = this.set("toString", js.Any.fromFunction1(value))
  }
  
}

