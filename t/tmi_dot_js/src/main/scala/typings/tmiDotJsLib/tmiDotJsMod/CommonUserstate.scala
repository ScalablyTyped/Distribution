package typings
package tmiDotJsLib.tmiDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonUserstate extends js.Object {
  var badges: js.UndefOr[Badges] = js.undefined
  var `badges-raw`: js.UndefOr[java.lang.String] = js.undefined
  var color: js.UndefOr[java.lang.String] = js.undefined
  var `display-name`: js.UndefOr[java.lang.String] = js.undefined
  var emotes: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]]] = js.undefined
  var `emotes-raw`: js.UndefOr[java.lang.String] = js.undefined
  var flags: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var mod: js.UndefOr[scala.Boolean] = js.undefined
  var `room-id`: js.UndefOr[java.lang.String] = js.undefined
  var subscriber: js.UndefOr[scala.Boolean] = js.undefined
  var `tmi-sent-ts`: js.UndefOr[java.lang.String] = js.undefined
  var turbo: js.UndefOr[scala.Boolean] = js.undefined
  var `user-id`: js.UndefOr[java.lang.String] = js.undefined
  var `user-type`: js.UndefOr[
    tmiDotJsLib.tmiDotJsLibStrings.Empty | tmiDotJsLib.tmiDotJsLibStrings.mod | tmiDotJsLib.tmiDotJsLibStrings.global_mod | tmiDotJsLib.tmiDotJsLibStrings.admin | tmiDotJsLib.tmiDotJsLibStrings.staff
  ] = js.undefined
}

object CommonUserstate {
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
    mod: js.UndefOr[scala.Boolean] = js.undefined,
    `room-id`: java.lang.String = null,
    subscriber: js.UndefOr[scala.Boolean] = js.undefined,
    `tmi-sent-ts`: java.lang.String = null,
    turbo: js.UndefOr[scala.Boolean] = js.undefined,
    `user-id`: java.lang.String = null,
    `user-type`: tmiDotJsLib.tmiDotJsLibStrings.Empty | tmiDotJsLib.tmiDotJsLibStrings.mod | tmiDotJsLib.tmiDotJsLibStrings.global_mod | tmiDotJsLib.tmiDotJsLibStrings.admin | tmiDotJsLib.tmiDotJsLibStrings.staff = null
  ): CommonUserstate = {
    val __obj = js.Dynamic.literal()
    if (badges != null) __obj.updateDynamic("badges")(badges)
    if (`badges-raw` != null) __obj.updateDynamic("badges-raw")(`badges-raw`)
    if (color != null) __obj.updateDynamic("color")(color)
    if (`display-name` != null) __obj.updateDynamic("display-name")(`display-name`)
    if (emotes != null) __obj.updateDynamic("emotes")(emotes)
    if (`emotes-raw` != null) __obj.updateDynamic("emotes-raw")(`emotes-raw`)
    if (flags != null) __obj.updateDynamic("flags")(flags)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(mod)) __obj.updateDynamic("mod")(mod)
    if (`room-id` != null) __obj.updateDynamic("room-id")(`room-id`)
    if (!js.isUndefined(subscriber)) __obj.updateDynamic("subscriber")(subscriber)
    if (`tmi-sent-ts` != null) __obj.updateDynamic("tmi-sent-ts")(`tmi-sent-ts`)
    if (!js.isUndefined(turbo)) __obj.updateDynamic("turbo")(turbo)
    if (`user-id` != null) __obj.updateDynamic("user-id")(`user-id`)
    if (`user-type` != null) __obj.updateDynamic("user-type")(`user-type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonUserstate]
  }
}

