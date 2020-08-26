package typings.tensorflowTfjsNode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Unreliable extends js.Object {
  var unreliable: Boolean = js.native
}

object Unreliable {
  @scala.inline
  def apply(unreliable: Boolean): Unreliable = {
    val __obj = js.Dynamic.literal(unreliable = unreliable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Unreliable]
  }
  @scala.inline
  implicit class UnreliableOps[Self <: Unreliable] (val x: Self) extends AnyVal {
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
    def setUnreliable(value: Boolean): Self = this.set("unreliable", value.asInstanceOf[js.Any])
  }
  
}

