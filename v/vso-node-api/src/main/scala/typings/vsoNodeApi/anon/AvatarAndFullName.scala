package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AvatarAndFullName extends js.Object {
  var avatarAndFullName: scala.Double = js.native
  var avatarOnly: scala.Double = js.native
  var fullName: scala.Double = js.native
}

object AvatarAndFullName {
  @scala.inline
  def apply(avatarAndFullName: scala.Double, avatarOnly: scala.Double, fullName: scala.Double): AvatarAndFullName = {
    val __obj = js.Dynamic.literal(avatarAndFullName = avatarAndFullName.asInstanceOf[js.Any], avatarOnly = avatarOnly.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvatarAndFullName]
  }
  @scala.inline
  implicit class AvatarAndFullNameOps[Self <: AvatarAndFullName] (val x: Self) extends AnyVal {
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
    def setAvatarAndFullName(value: scala.Double): Self = this.set("avatarAndFullName", value.asInstanceOf[js.Any])
    @scala.inline
    def setAvatarOnly(value: scala.Double): Self = this.set("avatarOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def setFullName(value: scala.Double): Self = this.set("fullName", value.asInstanceOf[js.Any])
  }
  
}

