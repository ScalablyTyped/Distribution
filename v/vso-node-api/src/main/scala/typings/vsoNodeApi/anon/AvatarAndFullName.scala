package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AvatarAndFullName extends js.Object {
  var avatarAndFullName: scala.Double
  var avatarOnly: scala.Double
  var fullName: scala.Double
}

object AvatarAndFullName {
  @scala.inline
  def apply(avatarAndFullName: scala.Double, avatarOnly: scala.Double, fullName: scala.Double): AvatarAndFullName = {
    val __obj = js.Dynamic.literal(avatarAndFullName = avatarAndFullName.asInstanceOf[js.Any], avatarOnly = avatarOnly.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvatarAndFullName]
  }
}

