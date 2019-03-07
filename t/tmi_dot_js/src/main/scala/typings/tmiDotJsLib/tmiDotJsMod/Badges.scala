package typings
package tmiDotJsLib.tmiDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Badges extends js.Object {
  var admin: js.UndefOr[java.lang.String] = js.undefined
  var bits: js.UndefOr[java.lang.String] = js.undefined
  var broadcaster: js.UndefOr[java.lang.String] = js.undefined
  var global_mod: js.UndefOr[java.lang.String] = js.undefined
  var moderator: js.UndefOr[java.lang.String] = js.undefined
  var premium: js.UndefOr[java.lang.String] = js.undefined
  var staff: js.UndefOr[java.lang.String] = js.undefined
  var subscriber: js.UndefOr[java.lang.String] = js.undefined
  var turbo: js.UndefOr[java.lang.String] = js.undefined
}

object Badges {
  @scala.inline
  def apply(
    admin: java.lang.String = null,
    bits: java.lang.String = null,
    broadcaster: java.lang.String = null,
    global_mod: java.lang.String = null,
    moderator: java.lang.String = null,
    premium: java.lang.String = null,
    staff: java.lang.String = null,
    subscriber: java.lang.String = null,
    turbo: java.lang.String = null
  ): Badges = {
    val __obj = js.Dynamic.literal()
    if (admin != null) __obj.updateDynamic("admin")(admin)
    if (bits != null) __obj.updateDynamic("bits")(bits)
    if (broadcaster != null) __obj.updateDynamic("broadcaster")(broadcaster)
    if (global_mod != null) __obj.updateDynamic("global_mod")(global_mod)
    if (moderator != null) __obj.updateDynamic("moderator")(moderator)
    if (premium != null) __obj.updateDynamic("premium")(premium)
    if (staff != null) __obj.updateDynamic("staff")(staff)
    if (subscriber != null) __obj.updateDynamic("subscriber")(subscriber)
    if (turbo != null) __obj.updateDynamic("turbo")(turbo)
    __obj.asInstanceOf[Badges]
  }
}

