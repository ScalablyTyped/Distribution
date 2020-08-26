package typings.typedGithubApi.interfacesCommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GitChanges extends js.Object {
  var added: Double = js.native
  var deleted: Double = js.native
  var total: Double = js.native
}

object GitChanges {
  @scala.inline
  def apply(added: Double, deleted: Double, total: Double): GitChanges = {
    val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], deleted = deleted.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitChanges]
  }
  @scala.inline
  implicit class GitChangesOps[Self <: GitChanges] (val x: Self) extends AnyVal {
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
    def setAdded(value: Double): Self = this.set("added", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeleted(value: Double): Self = this.set("deleted", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotal(value: Double): Self = this.set("total", value.asInstanceOf[js.Any])
  }
  
}

