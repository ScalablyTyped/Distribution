package typings.winrt.Windows.UI.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICoreCursor extends js.Object {
  var id: Double = js.native
  var `type`: CoreCursorType = js.native
}

object ICoreCursor {
  @scala.inline
  def apply(id: Double, `type`: CoreCursorType): ICoreCursor = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICoreCursor]
  }
  @scala.inline
  implicit class ICoreCursorOps[Self <: ICoreCursor] (val x: Self) extends AnyVal {
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
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: CoreCursorType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

