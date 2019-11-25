package typings.watsonDashDeveloperDashCloud.compareDashComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A contact. */
trait Contact extends js.Object {
  /** A string listing the name of the contact. */
  var name: js.UndefOr[String] = js.undefined
  /** A string listing the role of the contact. */
  var role: js.UndefOr[String] = js.undefined
}

object Contact {
  @scala.inline
  def apply(name: String = null, role: String = null): Contact = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    __obj.asInstanceOf[Contact]
  }
}

