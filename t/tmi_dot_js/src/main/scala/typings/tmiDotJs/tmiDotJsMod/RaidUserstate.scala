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
    if (badges != null) __obj.updateDynamic("badges")(badges.asInstanceOf[js.Any])
    if (`badges-raw` != null) __obj.updateDynamic("badges-raw")(`badges-raw`.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (`display-name` != null) __obj.updateDynamic("display-name")(`display-name`.asInstanceOf[js.Any])
    if (emotes != null) __obj.updateDynamic("emotes")(emotes.asInstanceOf[js.Any])
    if (`emotes-raw` != null) __obj.updateDynamic("emotes-raw")(`emotes-raw`.asInstanceOf[js.Any])
    if (flags != null) __obj.updateDynamic("flags")(flags.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (login != null) __obj.updateDynamic("login")(login.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (`message-type` != null) __obj.updateDynamic("message-type")(`message-type`.asInstanceOf[js.Any])
    if (!js.isUndefined(mod)) __obj.updateDynamic("mod")(mod.asInstanceOf[js.Any])
    if (`msg-param-displayName` != null) __obj.updateDynamic("msg-param-displayName")(`msg-param-displayName`.asInstanceOf[js.Any])
    if (`msg-param-login` != null) __obj.updateDynamic("msg-param-login")(`msg-param-login`.asInstanceOf[js.Any])
    if (`msg-param-viewerCount` != null) __obj.updateDynamic("msg-param-viewerCount")(`msg-param-viewerCount`.asInstanceOf[js.Any])
    if (`room-id` != null) __obj.updateDynamic("room-id")(`room-id`.asInstanceOf[js.Any])
    if (!js.isUndefined(subscriber)) __obj.updateDynamic("subscriber")(subscriber.asInstanceOf[js.Any])
    if (`system-msg` != null) __obj.updateDynamic("system-msg")(`system-msg`.asInstanceOf[js.Any])
    if (`tmi-sent-ts` != null) __obj.updateDynamic("tmi-sent-ts")(`tmi-sent-ts`.asInstanceOf[js.Any])
    if (!js.isUndefined(turbo)) __obj.updateDynamic("turbo")(turbo.asInstanceOf[js.Any])
    if (`user-id` != null) __obj.updateDynamic("user-id")(`user-id`.asInstanceOf[js.Any])
    if (`user-type` != null) __obj.updateDynamic("user-type")(`user-type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaidUserstate]
  }
}

