package typings.webgme.GmeCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pointer extends js.Object {
  var from: NodeId = js.native
  var to: NodeId = js.native
}

object Pointer {
  @scala.inline
  def apply(from: NodeId, to: NodeId): Pointer = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pointer]
  }
  @scala.inline
  implicit class PointerOps[Self <: Pointer] (val x: Self) extends AnyVal {
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
    def setFrom(value: NodeId): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def setTo(value: NodeId): Self = this.set("to", value.asInstanceOf[js.Any])
  }
  
}

