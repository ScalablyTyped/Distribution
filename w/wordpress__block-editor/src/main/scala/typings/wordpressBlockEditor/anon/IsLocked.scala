package typings.wordpressBlockEditor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsLocked extends js.Object {
  var isLocked: Boolean = js.native
  var user: Null | String = js.native
}

object IsLocked {
  @scala.inline
  def apply(isLocked: Boolean): IsLocked = {
    val __obj = js.Dynamic.literal(isLocked = isLocked.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsLocked]
  }
  @scala.inline
  implicit class IsLockedOps[Self <: IsLocked] (val x: Self) extends AnyVal {
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
    def setIsLocked(value: Boolean): Self = this.set("isLocked", value.asInstanceOf[js.Any])
    @scala.inline
    def setUser(value: String): Self = this.set("user", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserNull: Self = this.set("user", null)
  }
  
}

