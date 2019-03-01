package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AvatarAndFullName extends js.Object {
  var avatarAndFullName: scala.Double
  var avatarOnly: scala.Double
  var fullName: scala.Double
}

object Anon_AvatarAndFullName {
  @scala.inline
  def apply(avatarAndFullName: scala.Double, avatarOnly: scala.Double, fullName: scala.Double): Anon_AvatarAndFullName = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("avatarAndFullName")(avatarAndFullName)
    __obj.updateDynamic("avatarOnly")(avatarOnly)
    __obj.updateDynamic("fullName")(fullName)
    __obj.asInstanceOf[Anon_AvatarAndFullName]
  }
}

