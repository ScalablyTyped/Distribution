package typings.whyDidYouUpdate.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Diffs extends js.Object {
  var name: String = js.native
  var next: js.Any = js.native
  var prev: js.Any = js.native
  var `type`: js.Any = js.native
}

object Diffs {
  @scala.inline
  def apply(name: String, next: js.Any, prev: js.Any, `type`: js.Any): Diffs = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Diffs]
  }
  @scala.inline
  implicit class DiffsOps[Self <: Diffs] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNext(value: js.Any): Self = this.set("next", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrev(value: js.Any): Self = this.set("prev", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: js.Any): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

