package typings.tmiDotJs.tmiDotJsMod

import org.scalablytyped.runtime.StringDictionary
import typings.tmiDotJs.tmiDotJsStrings.Empty
import typings.tmiDotJs.tmiDotJsStrings.action
import typings.tmiDotJs.tmiDotJsStrings.admin
import typings.tmiDotJs.tmiDotJsStrings.chat
import typings.tmiDotJs.tmiDotJsStrings.global_mod
import typings.tmiDotJs.tmiDotJsStrings.mod
import typings.tmiDotJs.tmiDotJsStrings.staff
import typings.tmiDotJs.tmiDotJsStrings.whisper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChatUserstate
  extends CommonUserstate
     with Userstate {
  var bits: js.UndefOr[String] = js.undefined
  var `message-type`: js.UndefOr[chat | action | whisper] = js.undefined
  var username: js.UndefOr[String] = js.undefined
}

object ChatUserstate {
  @scala.inline
  def apply(
    badges: Badges = null,
    `badges-raw`: String = null,
    bits: String = null,
    color: String = null,
    `display-name`: String = null,
    emotes: StringDictionary[js.Array[String]] = null,
    `emotes-raw`: String = null,
    flags: String = null,
    id: String = null,
    `message-type`: chat | action | whisper = null,
    mod: js.UndefOr[Boolean] = js.undefined,
    `room-id`: String = null,
    subscriber: js.UndefOr[Boolean] = js.undefined,
    `tmi-sent-ts`: String = null,
    turbo: js.UndefOr[Boolean] = js.undefined,
    `user-id`: String = null,
    `user-type`: Empty | mod | global_mod | admin | staff = null,
    username: String = null
  ): ChatUserstate = {
    val __obj = js.Dynamic.literal()
    if (badges != null) __obj.updateDynamic("badges")(badges)
    if (`badges-raw` != null) __obj.updateDynamic("badges-raw")(`badges-raw`)
    if (bits != null) __obj.updateDynamic("bits")(bits)
    if (color != null) __obj.updateDynamic("color")(color)
    if (`display-name` != null) __obj.updateDynamic("display-name")(`display-name`)
    if (emotes != null) __obj.updateDynamic("emotes")(emotes)
    if (`emotes-raw` != null) __obj.updateDynamic("emotes-raw")(`emotes-raw`)
    if (flags != null) __obj.updateDynamic("flags")(flags)
    if (id != null) __obj.updateDynamic("id")(id)
    if (`message-type` != null) __obj.updateDynamic("message-type")(`message-type`.asInstanceOf[js.Any])
    if (!js.isUndefined(mod)) __obj.updateDynamic("mod")(mod)
    if (`room-id` != null) __obj.updateDynamic("room-id")(`room-id`)
    if (!js.isUndefined(subscriber)) __obj.updateDynamic("subscriber")(subscriber)
    if (`tmi-sent-ts` != null) __obj.updateDynamic("tmi-sent-ts")(`tmi-sent-ts`)
    if (!js.isUndefined(turbo)) __obj.updateDynamic("turbo")(turbo)
    if (`user-id` != null) __obj.updateDynamic("user-id")(`user-id`)
    if (`user-type` != null) __obj.updateDynamic("user-type")(`user-type`.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[ChatUserstate]
  }
}

