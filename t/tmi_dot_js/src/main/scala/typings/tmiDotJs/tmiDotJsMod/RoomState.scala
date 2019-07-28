package typings.tmiDotJs.tmiDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoomState extends js.Object {
  var `broadcaster-lang`: js.UndefOr[String] = js.undefined
  var channel: js.UndefOr[String] = js.undefined
  var `emote-only`: js.UndefOr[Boolean] = js.undefined
  var `followers-only`: js.UndefOr[String | Boolean] = js.undefined
  var r9k: js.UndefOr[Boolean] = js.undefined
  var rituals: js.UndefOr[Boolean] = js.undefined
  var `room-id`: js.UndefOr[String] = js.undefined
  var slow: js.UndefOr[String | Boolean] = js.undefined
  var `subs-only`: js.UndefOr[Boolean] = js.undefined
}

object RoomState {
  @scala.inline
  def apply(
    `broadcaster-lang`: String = null,
    channel: String = null,
    `emote-only`: js.UndefOr[Boolean] = js.undefined,
    `followers-only`: String | Boolean = null,
    r9k: js.UndefOr[Boolean] = js.undefined,
    rituals: js.UndefOr[Boolean] = js.undefined,
    `room-id`: String = null,
    slow: String | Boolean = null,
    `subs-only`: js.UndefOr[Boolean] = js.undefined
  ): RoomState = {
    val __obj = js.Dynamic.literal()
    if (`broadcaster-lang` != null) __obj.updateDynamic("broadcaster-lang")(`broadcaster-lang`)
    if (channel != null) __obj.updateDynamic("channel")(channel)
    if (!js.isUndefined(`emote-only`)) __obj.updateDynamic("emote-only")(`emote-only`)
    if (`followers-only` != null) __obj.updateDynamic("followers-only")(`followers-only`.asInstanceOf[js.Any])
    if (!js.isUndefined(r9k)) __obj.updateDynamic("r9k")(r9k)
    if (!js.isUndefined(rituals)) __obj.updateDynamic("rituals")(rituals)
    if (`room-id` != null) __obj.updateDynamic("room-id")(`room-id`)
    if (slow != null) __obj.updateDynamic("slow")(slow.asInstanceOf[js.Any])
    if (!js.isUndefined(`subs-only`)) __obj.updateDynamic("subs-only")(`subs-only`)
    __obj.asInstanceOf[RoomState]
  }
}

