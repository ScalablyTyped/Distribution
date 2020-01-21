package typings.tmiJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Badges extends js.Object {
  var admin: js.UndefOr[String] = js.undefined
  var bits: js.UndefOr[String] = js.undefined
  var broadcaster: js.UndefOr[String] = js.undefined
  var global_mod: js.UndefOr[String] = js.undefined
  var moderator: js.UndefOr[String] = js.undefined
  var premium: js.UndefOr[String] = js.undefined
  var staff: js.UndefOr[String] = js.undefined
  var subscriber: js.UndefOr[String] = js.undefined
  var turbo: js.UndefOr[String] = js.undefined
}

object Badges {
  @scala.inline
  def apply(
    admin: String = null,
    bits: String = null,
    broadcaster: String = null,
    global_mod: String = null,
    moderator: String = null,
    premium: String = null,
    staff: String = null,
    subscriber: String = null,
    turbo: String = null
  ): Badges = {
    val __obj = js.Dynamic.literal()
    if (admin != null) __obj.updateDynamic("admin")(admin.asInstanceOf[js.Any])
    if (bits != null) __obj.updateDynamic("bits")(bits.asInstanceOf[js.Any])
    if (broadcaster != null) __obj.updateDynamic("broadcaster")(broadcaster.asInstanceOf[js.Any])
    if (global_mod != null) __obj.updateDynamic("global_mod")(global_mod.asInstanceOf[js.Any])
    if (moderator != null) __obj.updateDynamic("moderator")(moderator.asInstanceOf[js.Any])
    if (premium != null) __obj.updateDynamic("premium")(premium.asInstanceOf[js.Any])
    if (staff != null) __obj.updateDynamic("staff")(staff.asInstanceOf[js.Any])
    if (subscriber != null) __obj.updateDynamic("subscriber")(subscriber.asInstanceOf[js.Any])
    if (turbo != null) __obj.updateDynamic("turbo")(turbo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Badges]
  }
}

