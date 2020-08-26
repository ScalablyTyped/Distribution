package typings.teechart.Tee

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICursor extends js.Object {
  var cursor: String = js.native
}

object ICursor {
  @scala.inline
  def apply(cursor: String): ICursor = {
    val __obj = js.Dynamic.literal(cursor = cursor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICursor]
  }
  @scala.inline
  implicit class ICursorOps[Self <: ICursor] (val x: Self) extends AnyVal {
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
    def setCursor(value: String): Self = this.set("cursor", value.asInstanceOf[js.Any])
  }
  
}

