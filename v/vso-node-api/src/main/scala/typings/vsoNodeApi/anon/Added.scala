package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Added extends js.Object {
  var added: scala.Double = js.native
  var deleted: scala.Double = js.native
  var modified: scala.Double = js.native
}

object Added {
  @scala.inline
  def apply(added: scala.Double, deleted: scala.Double, modified: scala.Double): Added = {
    val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], deleted = deleted.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any])
    __obj.asInstanceOf[Added]
  }
  @scala.inline
  implicit class AddedOps[Self <: Added] (val x: Self) extends AnyVal {
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
    def setAdded(value: scala.Double): Self = this.set("added", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeleted(value: scala.Double): Self = this.set("deleted", value.asInstanceOf[js.Any])
    @scala.inline
    def setModified(value: scala.Double): Self = this.set("modified", value.asInstanceOf[js.Any])
  }
  
}

