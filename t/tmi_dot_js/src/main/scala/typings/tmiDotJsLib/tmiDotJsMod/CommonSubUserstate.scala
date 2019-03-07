package typings
package tmiDotJsLib.tmiDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonSubUserstate extends UserNoticeState {
  var `msg-param-sub-plan`: js.UndefOr[ResubMethod] = js.undefined
  var `msg-param-sub-plan-name`: js.UndefOr[java.lang.String] = js.undefined
}

object CommonSubUserstate {
  @scala.inline
  def apply(
    badges: Badges = null,
    `badges-raw`: java.lang.String = null,
    color: java.lang.String = null,
    `display-name`: java.lang.String = null,
    emotes: org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]] = null,
    `emotes-raw`: java.lang.String = null,
    flags: java.lang.String = null,
    id: java.lang.String = null,
    login: java.lang.String = null,
    message: java.lang.String = null,
    mod: js.UndefOr[scala.Boolean] = js.undefined,
    `msg-param-sub-plan`: ResubMethod = null,
    `msg-param-sub-plan-name`: java.lang.String = null,
    `room-id`: java.lang.String = null,
    subscriber: js.UndefOr[scala.Boolean] = js.undefined,
    `system-msg`: java.lang.String = null,
    `tmi-sent-ts`: java.lang.String = null,
    turbo: js.UndefOr[scala.Boolean] = js.undefined,
    `user-id`: java.lang.String = null,
    `user-type`: tmiDotJsLib.tmiDotJsLibStrings.Empty | tmiDotJsLib.tmiDotJsLibStrings.mod | tmiDotJsLib.tmiDotJsLibStrings.global_mod | tmiDotJsLib.tmiDotJsLibStrings.admin | tmiDotJsLib.tmiDotJsLibStrings.staff = null
  ): CommonSubUserstate = {
    val __obj = js.Dynamic.literal()
    if (badges != null) __obj.updateDynamic("badges")(badges)
    if (`badges-raw` != null) __obj.updateDynamic("badges-raw")(`badges-raw`)
    if (color != null) __obj.updateDynamic("color")(color)
    if (`display-name` != null) __obj.updateDynamic("display-name")(`display-name`)
    if (emotes != null) __obj.updateDynamic("emotes")(emotes)
    if (`emotes-raw` != null) __obj.updateDynamic("emotes-raw")(`emotes-raw`)
    if (flags != null) __obj.updateDynamic("flags")(flags)
    if (id != null) __obj.updateDynamic("id")(id)
    if (login != null) __obj.updateDynamic("login")(login)
    if (message != null) __obj.updateDynamic("message")(message)
    if (!js.isUndefined(mod)) __obj.updateDynamic("mod")(mod)
    if (`msg-param-sub-plan` != null) __obj.updateDynamic("msg-param-sub-plan")(`msg-param-sub-plan`)
    if (`msg-param-sub-plan-name` != null) __obj.updateDynamic("msg-param-sub-plan-name")(`msg-param-sub-plan-name`)
    if (`room-id` != null) __obj.updateDynamic("room-id")(`room-id`)
    if (!js.isUndefined(subscriber)) __obj.updateDynamic("subscriber")(subscriber)
    if (`system-msg` != null) __obj.updateDynamic("system-msg")(`system-msg`)
    if (`tmi-sent-ts` != null) __obj.updateDynamic("tmi-sent-ts")(`tmi-sent-ts`)
    if (!js.isUndefined(turbo)) __obj.updateDynamic("turbo")(turbo)
    if (`user-id` != null) __obj.updateDynamic("user-id")(`user-id`)
    if (`user-type` != null) __obj.updateDynamic("user-type")(`user-type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonSubUserstate]
  }
}

