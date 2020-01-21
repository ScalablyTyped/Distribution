package typings.tmiJs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.tmiJs.tmiJsStrings._empty
import typings.tmiJs.tmiJsStrings.admin
import typings.tmiJs.tmiJsStrings.global_mod
import typings.tmiJs.tmiJsStrings.staff
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonUserstate
  extends /* paramater */ StringDictionary[js.Any] {
  var badges: js.UndefOr[Badges] = js.undefined
  var `badges-raw`: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var `display-name`: js.UndefOr[String] = js.undefined
  var emotes: js.UndefOr[StringDictionary[js.Array[String]]] = js.undefined
  var `emotes-raw`: js.UndefOr[String] = js.undefined
  var flags: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var mod: js.UndefOr[Boolean] = js.undefined
  var `room-id`: js.UndefOr[String] = js.undefined
  var subscriber: js.UndefOr[Boolean] = js.undefined
  var `tmi-sent-ts`: js.UndefOr[String] = js.undefined
  var turbo: js.UndefOr[Boolean] = js.undefined
  var `user-id`: js.UndefOr[String] = js.undefined
  var `user-type`: js.UndefOr[_empty | typings.tmiJs.tmiJsStrings.mod | global_mod | admin | staff] = js.undefined
}

object CommonUserstate {
  @scala.inline
  def apply(
    StringDictionary: /* paramater */ StringDictionary[js.Any] = null,
    badges: Badges = null,
    `badges-raw`: String = null,
    color: String = null,
    `display-name`: String = null,
    emotes: StringDictionary[js.Array[String]] = null,
    `emotes-raw`: String = null,
    flags: String = null,
    id: String = null,
    mod: js.UndefOr[Boolean] = js.undefined,
    `room-id`: String = null,
    subscriber: js.UndefOr[Boolean] = js.undefined,
    `tmi-sent-ts`: String = null,
    turbo: js.UndefOr[Boolean] = js.undefined,
    `user-id`: String = null,
    `user-type`: _empty | typings.tmiJs.tmiJsStrings.mod | global_mod | admin | staff = null
  ): CommonUserstate = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (badges != null) __obj.updateDynamic("badges")(badges.asInstanceOf[js.Any])
    if (`badges-raw` != null) __obj.updateDynamic("badges-raw")(`badges-raw`.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (`display-name` != null) __obj.updateDynamic("display-name")(`display-name`.asInstanceOf[js.Any])
    if (emotes != null) __obj.updateDynamic("emotes")(emotes.asInstanceOf[js.Any])
    if (`emotes-raw` != null) __obj.updateDynamic("emotes-raw")(`emotes-raw`.asInstanceOf[js.Any])
    if (flags != null) __obj.updateDynamic("flags")(flags.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(mod)) __obj.updateDynamic("mod")(mod.asInstanceOf[js.Any])
    if (`room-id` != null) __obj.updateDynamic("room-id")(`room-id`.asInstanceOf[js.Any])
    if (!js.isUndefined(subscriber)) __obj.updateDynamic("subscriber")(subscriber.asInstanceOf[js.Any])
    if (`tmi-sent-ts` != null) __obj.updateDynamic("tmi-sent-ts")(`tmi-sent-ts`.asInstanceOf[js.Any])
    if (!js.isUndefined(turbo)) __obj.updateDynamic("turbo")(turbo.asInstanceOf[js.Any])
    if (`user-id` != null) __obj.updateDynamic("user-id")(`user-id`.asInstanceOf[js.Any])
    if (`user-type` != null) __obj.updateDynamic("user-type")(`user-type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonUserstate]
  }
}

