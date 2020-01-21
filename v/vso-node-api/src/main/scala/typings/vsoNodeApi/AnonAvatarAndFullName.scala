package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAvatarAndFullName extends js.Object {
  var avatarAndFullName: Double
  var avatarOnly: Double
  var fullName: Double
}

object AnonAvatarAndFullName {
  @scala.inline
  def apply(avatarAndFullName: Double, avatarOnly: Double, fullName: Double): AnonAvatarAndFullName = {
    val __obj = js.Dynamic.literal(avatarAndFullName = avatarAndFullName.asInstanceOf[js.Any], avatarOnly = avatarOnly.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAvatarAndFullName]
  }
}

