package typings.tmiDotJs.tmiDotJsMod

import org.scalablytyped.runtime.StringDictionary
import typings.tmiDotJs.tmiDotJsStrings.Empty
import typings.tmiDotJs.tmiDotJsStrings.admin
import typings.tmiDotJs.tmiDotJsStrings.global_mod
import typings.tmiDotJs.tmiDotJsStrings.mod
import typings.tmiDotJs.tmiDotJsStrings.raid
import typings.tmiDotJs.tmiDotJsStrings.staff
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RaidUserstate
  extends UserNoticeState
     with Userstate {
  var `message-type`: js.UndefOr[raid] = js.undefined
  var `msg-param-displayName`: js.UndefOr[String] = js.undefined
  var `msg-param-login`: js.UndefOr[String] = js.undefined
  var `msg-param-viewerCount`: js.UndefOr[String] = js.undefined
}

object RaidUserstate {
  @scala.inline
  def apply(
    badges: Badges = null,
    `badges-raw`: String = null,
    color: String = null,
    `display-name`: String = null,
    emotes: StringDictionary[js.Array[String]] = null,
    `emotes-raw`: String = null,
    flags: String = null,
    id: String = null,
    login: String = null,
    message: String = null,
    `message-type`: raid = null,
    mod: js.UndefOr[Boolean] = js.undefined,
    `msg-param-displayName`: String = null,
    `msg-param-login`: String = null,
    `msg-param-viewerCount`: String = null,
    `room-id`: String = null,
    subscriber: js.UndefOr[Boolean] = js.undefined,
    `system-msg`: String = null,
    `tmi-sent-ts`: String = null,
    turbo: js.UndefOr[Boolean] = js.undefined,
    `user-id`: String = null,
    `user-type`: Empty | mod | global_mod | admin | staff = null
  ): RaidUserstate = {
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
    if (`message-type` != null) __obj.updateDynamic("message-type")(`message-type`)
    if (!js.isUndefined(mod)) __obj.updateDynamic("mod")(mod)
    if (`msg-param-displayName` != null) __obj.updateDynamic("msg-param-displayName")(`msg-param-displayName`)
    if (`msg-param-login` != null) __obj.updateDynamic("msg-param-login")(`msg-param-login`)
    if (`msg-param-viewerCount` != null) __obj.updateDynamic("msg-param-viewerCount")(`msg-param-viewerCount`)
    if (`room-id` != null) __obj.updateDynamic("room-id")(`room-id`)
    if (!js.isUndefined(subscriber)) __obj.updateDynamic("subscriber")(subscriber)
    if (`system-msg` != null) __obj.updateDynamic("system-msg")(`system-msg`)
    if (`tmi-sent-ts` != null) __obj.updateDynamic("tmi-sent-ts")(`tmi-sent-ts`)
    if (!js.isUndefined(turbo)) __obj.updateDynamic("turbo")(turbo)
    if (`user-id` != null) __obj.updateDynamic("user-id")(`user-id`)
    if (`user-type` != null) __obj.updateDynamic("user-type")(`user-type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaidUserstate]
  }
}

