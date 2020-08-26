package typings.writeFileAtomic.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Gid extends js.Object {
  var gid: Double = js.native
  var uid: Double = js.native
}

object Gid {
  @scala.inline
  def apply(gid: Double, uid: Double): Gid = {
    val __obj = js.Dynamic.literal(gid = gid.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Gid]
  }
  @scala.inline
  implicit class GidOps[Self <: Gid] (val x: Self) extends AnyVal {
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
    def setGid(value: Double): Self = this.set("gid", value.asInstanceOf[js.Any])
    @scala.inline
    def setUid(value: Double): Self = this.set("uid", value.asInstanceOf[js.Any])
  }
  
}

