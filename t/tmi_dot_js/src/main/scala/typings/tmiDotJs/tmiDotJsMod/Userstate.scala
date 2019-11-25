package typings.tmiDotJs.tmiDotJsMod

import org.scalablytyped.runtime.StringDictionary
import typings.tmiDotJs.tmiDotJsStrings.Empty
import typings.tmiDotJs.tmiDotJsStrings.action
import typings.tmiDotJs.tmiDotJsStrings.admin
import typings.tmiDotJs.tmiDotJsStrings.anongiftpaidupgrade
import typings.tmiDotJs.tmiDotJsStrings.anonsubgift
import typings.tmiDotJs.tmiDotJsStrings.chat
import typings.tmiDotJs.tmiDotJsStrings.giftpaidupgrade
import typings.tmiDotJs.tmiDotJsStrings.global_mod
import typings.tmiDotJs.tmiDotJsStrings.mod
import typings.tmiDotJs.tmiDotJsStrings.new_chatter
import typings.tmiDotJs.tmiDotJsStrings.raid
import typings.tmiDotJs.tmiDotJsStrings.resub
import typings.tmiDotJs.tmiDotJsStrings.ritual
import typings.tmiDotJs.tmiDotJsStrings.staff
import typings.tmiDotJs.tmiDotJsStrings.sub
import typings.tmiDotJs.tmiDotJsStrings.subgift
import typings.tmiDotJs.tmiDotJsStrings.submysterygift
import typings.tmiDotJs.tmiDotJsStrings.whisper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.tmiDotJs.tmiDotJsMod.ChatUserstate
  - typings.tmiDotJs.tmiDotJsMod.SubUserstate
  - typings.tmiDotJs.tmiDotJsMod.SubGiftUserstate
  - typings.tmiDotJs.tmiDotJsMod.SubGiftUpgradeUserstate
  - typings.tmiDotJs.tmiDotJsMod.AnonSubGiftUserstate
  - typings.tmiDotJs.tmiDotJsMod.SubMysteryGiftUserstate
  - typings.tmiDotJs.tmiDotJsMod.AnonSubGiftUpgradeUserstate
  - typings.tmiDotJs.tmiDotJsMod.RaidUserstate
  - typings.tmiDotJs.tmiDotJsMod.RitualUserstate
*/
trait Userstate extends js.Object

object Userstate {
  @scala.inline
  def ChatUserstate(
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
  ): Userstate = {
    val __obj = js.Dynamic.literal()
    if (badges != null) __obj.updateDynamic("badges")(badges.asInstanceOf[js.Any])
    if (`badges-raw` != null) __obj.updateDynamic("badges-raw")(`badges-raw`.asInstanceOf[js.Any])
    if (bits != null) __obj.updateDynamic("bits")(bits.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (`display-name` != null) __obj.updateDynamic("display-name")(`display-name`.asInstanceOf[js.Any])
    if (emotes != null) __obj.updateDynamic("emotes")(emotes.asInstanceOf[js.Any])
    if (`emotes-raw` != null) __obj.updateDynamic("emotes-raw")(`emotes-raw`.asInstanceOf[js.Any])
    if (flags != null) __obj.updateDynamic("flags")(flags.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (`message-type` != null) __obj.updateDynamic("message-type")(`message-type`.asInstanceOf[js.Any])
    if (!js.isUndefined(mod)) __obj.updateDynamic("mod")(mod.asInstanceOf[js.Any])
    if (`room-id` != null) __obj.updateDynamic("room-id")(`room-id`.asInstanceOf[js.Any])
    if (!js.isUndefined(subscriber)) __obj.updateDynamic("subscriber")(subscriber.asInstanceOf[js.Any])
    if (`tmi-sent-ts` != null) __obj.updateDynamic("tmi-sent-ts")(`tmi-sent-ts`.asInstanceOf[js.Any])
    if (!js.isUndefined(turbo)) __obj.updateDynamic("turbo")(turbo.asInstanceOf[js.Any])
    if (`user-id` != null) __obj.updateDynamic("user-id")(`user-id`.asInstanceOf[js.Any])
    if (`user-type` != null) __obj.updateDynamic("user-type")(`user-type`.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[Userstate]
  }
  @scala.inline
  def SubGiftUserstate(
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
    `message-type`: subgift = null,
    mod: js.UndefOr[Boolean] = js.undefined,
    `msg-param-months`: Boolean | String = null,
    `msg-param-recipient-display-name`: String = null,
    `msg-param-recipient-id`: String = null,
    `msg-param-recipient-user-name`: String = null,
    `msg-param-sender-count`: String | Boolean = null,
    `msg-param-sub-plan`: SubMethod = null,
    `msg-param-sub-plan-name`: String = null,
    `room-id`: String = null,
    subscriber: js.UndefOr[Boolean] = js.undefined,
    `system-msg`: String = null,
    `tmi-sent-ts`: String = null,
    turbo: js.UndefOr[Boolean] = js.undefined,
    `user-id`: String = null,
    `user-type`: Empty | mod | global_mod | admin | staff = null
  ): Userstate = {
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
    if (`msg-param-months` != null) __obj.updateDynamic("msg-param-months")(`msg-param-months`.asInstanceOf[js.Any])
    if (`msg-param-recipient-display-name` != null) __obj.updateDynamic("msg-param-recipient-display-name")(`msg-param-recipient-display-name`.asInstanceOf[js.Any])
    if (`msg-param-recipient-id` != null) __obj.updateDynamic("msg-param-recipient-id")(`msg-param-recipient-id`.asInstanceOf[js.Any])
    if (`msg-param-recipient-user-name` != null) __obj.updateDynamic("msg-param-recipient-user-name")(`msg-param-recipient-user-name`.asInstanceOf[js.Any])
    if (`msg-param-sender-count` != null) __obj.updateDynamic("msg-param-sender-count")(`msg-param-sender-count`.asInstanceOf[js.Any])
    if (`msg-param-sub-plan` != null) __obj.updateDynamic("msg-param-sub-plan")(`msg-param-sub-plan`.asInstanceOf[js.Any])
    if (`msg-param-sub-plan-name` != null) __obj.updateDynamic("msg-param-sub-plan-name")(`msg-param-sub-plan-name`.asInstanceOf[js.Any])
    if (`room-id` != null) __obj.updateDynamic("room-id")(`room-id`.asInstanceOf[js.Any])
    if (!js.isUndefined(subscriber)) __obj.updateDynamic("subscriber")(subscriber.asInstanceOf[js.Any])
    if (`system-msg` != null) __obj.updateDynamic("system-msg")(`system-msg`.asInstanceOf[js.Any])
    if (`tmi-sent-ts` != null) __obj.updateDynamic("tmi-sent-ts")(`tmi-sent-ts`.asInstanceOf[js.Any])
    if (!js.isUndefined(turbo)) __obj.updateDynamic("turbo")(turbo.asInstanceOf[js.Any])
    if (`user-id` != null) __obj.updateDynamic("user-id")(`user-id`.asInstanceOf[js.Any])
    if (`user-type` != null) __obj.updateDynamic("user-type")(`user-type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Userstate]
  }
  @scala.inline
  def RaidUserstate(
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
  ): Userstate = {
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
    __obj.asInstanceOf[Userstate]
  }
  @scala.inline
  def AnonSubGiftUpgradeUserstate(
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
    `message-type`: anongiftpaidupgrade = null,
    mod: js.UndefOr[Boolean] = js.undefined,
    `msg-param-sub-plan`: SubMethod = null,
    `msg-param-sub-plan-name`: String = null,
    `room-id`: String = null,
    subscriber: js.UndefOr[Boolean] = js.undefined,
    `system-msg`: String = null,
    `tmi-sent-ts`: String = null,
    turbo: js.UndefOr[Boolean] = js.undefined,
    `user-id`: String = null,
    `user-type`: Empty | mod | global_mod | admin | staff = null
  ): Userstate = {
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
    if (`msg-param-sub-plan` != null) __obj.updateDynamic("msg-param-sub-plan")(`msg-param-sub-plan`.asInstanceOf[js.Any])
    if (`msg-param-sub-plan-name` != null) __obj.updateDynamic("msg-param-sub-plan-name")(`msg-param-sub-plan-name`.asInstanceOf[js.Any])
    if (`room-id` != null) __obj.updateDynamic("room-id")(`room-id`.asInstanceOf[js.Any])
    if (!js.isUndefined(subscriber)) __obj.updateDynamic("subscriber")(subscriber.asInstanceOf[js.Any])
    if (`system-msg` != null) __obj.updateDynamic("system-msg")(`system-msg`.asInstanceOf[js.Any])
    if (`tmi-sent-ts` != null) __obj.updateDynamic("tmi-sent-ts")(`tmi-sent-ts`.asInstanceOf[js.Any])
    if (!js.isUndefined(turbo)) __obj.updateDynamic("turbo")(turbo.asInstanceOf[js.Any])
    if (`user-id` != null) __obj.updateDynamic("user-id")(`user-id`.asInstanceOf[js.Any])
    if (`user-type` != null) __obj.updateDynamic("user-type")(`user-type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Userstate]
  }
  @scala.inline
  def SubUserstate(
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
    `message-type`: sub | resub = null,
    mod: js.UndefOr[Boolean] = js.undefined,
    `msg-param-cumulative-months`: String | Boolean = null,
    `msg-param-should-share-streak`: js.UndefOr[Boolean] = js.undefined,
    `msg-param-streak-months`: String | Boolean = null,
    `msg-param-sub-plan`: SubMethod = null,
    `msg-param-sub-plan-name`: String = null,
    `room-id`: String = null,
    subscriber: js.UndefOr[Boolean] = js.undefined,
    `system-msg`: String = null,
    `tmi-sent-ts`: String = null,
    turbo: js.UndefOr[Boolean] = js.undefined,
    `user-id`: String = null,
    `user-type`: Empty | mod | global_mod | admin | staff = null
  ): Userstate = {
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
    if (`msg-param-cumulative-months` != null) __obj.updateDynamic("msg-param-cumulative-months")(`msg-param-cumulative-months`.asInstanceOf[js.Any])
    if (!js.isUndefined(`msg-param-should-share-streak`)) __obj.updateDynamic("msg-param-should-share-streak")(`msg-param-should-share-streak`.asInstanceOf[js.Any])
    if (`msg-param-streak-months` != null) __obj.updateDynamic("msg-param-streak-months")(`msg-param-streak-months`.asInstanceOf[js.Any])
    if (`msg-param-sub-plan` != null) __obj.updateDynamic("msg-param-sub-plan")(`msg-param-sub-plan`.asInstanceOf[js.Any])
    if (`msg-param-sub-plan-name` != null) __obj.updateDynamic("msg-param-sub-plan-name")(`msg-param-sub-plan-name`.asInstanceOf[js.Any])
    if (`room-id` != null) __obj.updateDynamic("room-id")(`room-id`.asInstanceOf[js.Any])
    if (!js.isUndefined(subscriber)) __obj.updateDynamic("subscriber")(subscriber.asInstanceOf[js.Any])
    if (`system-msg` != null) __obj.updateDynamic("system-msg")(`system-msg`.asInstanceOf[js.Any])
    if (`tmi-sent-ts` != null) __obj.updateDynamic("tmi-sent-ts")(`tmi-sent-ts`.asInstanceOf[js.Any])
    if (!js.isUndefined(turbo)) __obj.updateDynamic("turbo")(turbo.asInstanceOf[js.Any])
    if (`user-id` != null) __obj.updateDynamic("user-id")(`user-id`.asInstanceOf[js.Any])
    if (`user-type` != null) __obj.updateDynamic("user-type")(`user-type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Userstate]
  }
  @scala.inline
  def AnonSubGiftUserstate(
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
    `message-type`: anonsubgift = null,
    mod: js.UndefOr[Boolean] = js.undefined,
    `msg-param-months`: Boolean | String = null,
    `msg-param-recipient-display-name`: String = null,
    `msg-param-recipient-id`: String = null,
    `msg-param-recipient-user-name`: String = null,
    `msg-param-sub-plan`: SubMethod = null,
    `msg-param-sub-plan-name`: String = null,
    `room-id`: String = null,
    subscriber: js.UndefOr[Boolean] = js.undefined,
    `system-msg`: String = null,
    `tmi-sent-ts`: String = null,
    turbo: js.UndefOr[Boolean] = js.undefined,
    `user-id`: String = null,
    `user-type`: Empty | mod | global_mod | admin | staff = null
  ): Userstate = {
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
    if (`msg-param-months` != null) __obj.updateDynamic("msg-param-months")(`msg-param-months`.asInstanceOf[js.Any])
    if (`msg-param-recipient-display-name` != null) __obj.updateDynamic("msg-param-recipient-display-name")(`msg-param-recipient-display-name`.asInstanceOf[js.Any])
    if (`msg-param-recipient-id` != null) __obj.updateDynamic("msg-param-recipient-id")(`msg-param-recipient-id`.asInstanceOf[js.Any])
    if (`msg-param-recipient-user-name` != null) __obj.updateDynamic("msg-param-recipient-user-name")(`msg-param-recipient-user-name`.asInstanceOf[js.Any])
    if (`msg-param-sub-plan` != null) __obj.updateDynamic("msg-param-sub-plan")(`msg-param-sub-plan`.asInstanceOf[js.Any])
    if (`msg-param-sub-plan-name` != null) __obj.updateDynamic("msg-param-sub-plan-name")(`msg-param-sub-plan-name`.asInstanceOf[js.Any])
    if (`room-id` != null) __obj.updateDynamic("room-id")(`room-id`.asInstanceOf[js.Any])
    if (!js.isUndefined(subscriber)) __obj.updateDynamic("subscriber")(subscriber.asInstanceOf[js.Any])
    if (`system-msg` != null) __obj.updateDynamic("system-msg")(`system-msg`.asInstanceOf[js.Any])
    if (`tmi-sent-ts` != null) __obj.updateDynamic("tmi-sent-ts")(`tmi-sent-ts`.asInstanceOf[js.Any])
    if (!js.isUndefined(turbo)) __obj.updateDynamic("turbo")(turbo.asInstanceOf[js.Any])
    if (`user-id` != null) __obj.updateDynamic("user-id")(`user-id`.asInstanceOf[js.Any])
    if (`user-type` != null) __obj.updateDynamic("user-type")(`user-type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Userstate]
  }
  @scala.inline
  def SubGiftUpgradeUserstate(
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
    `message-type`: giftpaidupgrade = null,
    mod: js.UndefOr[Boolean] = js.undefined,
    `msg-param-sender-login`: String = null,
    `msg-param-sender-name`: String = null,
    `msg-param-sub-plan`: SubMethod = null,
    `msg-param-sub-plan-name`: String = null,
    `room-id`: String = null,
    subscriber: js.UndefOr[Boolean] = js.undefined,
    `system-msg`: String = null,
    `tmi-sent-ts`: String = null,
    turbo: js.UndefOr[Boolean] = js.undefined,
    `user-id`: String = null,
    `user-type`: Empty | mod | global_mod | admin | staff = null
  ): Userstate = {
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
    if (`msg-param-sender-login` != null) __obj.updateDynamic("msg-param-sender-login")(`msg-param-sender-login`.asInstanceOf[js.Any])
    if (`msg-param-sender-name` != null) __obj.updateDynamic("msg-param-sender-name")(`msg-param-sender-name`.asInstanceOf[js.Any])
    if (`msg-param-sub-plan` != null) __obj.updateDynamic("msg-param-sub-plan")(`msg-param-sub-plan`.asInstanceOf[js.Any])
    if (`msg-param-sub-plan-name` != null) __obj.updateDynamic("msg-param-sub-plan-name")(`msg-param-sub-plan-name`.asInstanceOf[js.Any])
    if (`room-id` != null) __obj.updateDynamic("room-id")(`room-id`.asInstanceOf[js.Any])
    if (!js.isUndefined(subscriber)) __obj.updateDynamic("subscriber")(subscriber.asInstanceOf[js.Any])
    if (`system-msg` != null) __obj.updateDynamic("system-msg")(`system-msg`.asInstanceOf[js.Any])
    if (`tmi-sent-ts` != null) __obj.updateDynamic("tmi-sent-ts")(`tmi-sent-ts`.asInstanceOf[js.Any])
    if (!js.isUndefined(turbo)) __obj.updateDynamic("turbo")(turbo.asInstanceOf[js.Any])
    if (`user-id` != null) __obj.updateDynamic("user-id")(`user-id`.asInstanceOf[js.Any])
    if (`user-type` != null) __obj.updateDynamic("user-type")(`user-type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Userstate]
  }
  @scala.inline
  def SubMysteryGiftUserstate(
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
    `message-type`: submysterygift = null,
    mod: js.UndefOr[Boolean] = js.undefined,
    `msg-param-sender-count`: String | Boolean = null,
    `msg-param-sub-plan`: SubMethod = null,
    `msg-param-sub-plan-name`: String = null,
    `room-id`: String = null,
    subscriber: js.UndefOr[Boolean] = js.undefined,
    `system-msg`: String = null,
    `tmi-sent-ts`: String = null,
    turbo: js.UndefOr[Boolean] = js.undefined,
    `user-id`: String = null,
    `user-type`: Empty | mod | global_mod | admin | staff = null
  ): Userstate = {
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
    if (`msg-param-sender-count` != null) __obj.updateDynamic("msg-param-sender-count")(`msg-param-sender-count`.asInstanceOf[js.Any])
    if (`msg-param-sub-plan` != null) __obj.updateDynamic("msg-param-sub-plan")(`msg-param-sub-plan`.asInstanceOf[js.Any])
    if (`msg-param-sub-plan-name` != null) __obj.updateDynamic("msg-param-sub-plan-name")(`msg-param-sub-plan-name`.asInstanceOf[js.Any])
    if (`room-id` != null) __obj.updateDynamic("room-id")(`room-id`.asInstanceOf[js.Any])
    if (!js.isUndefined(subscriber)) __obj.updateDynamic("subscriber")(subscriber.asInstanceOf[js.Any])
    if (`system-msg` != null) __obj.updateDynamic("system-msg")(`system-msg`.asInstanceOf[js.Any])
    if (`tmi-sent-ts` != null) __obj.updateDynamic("tmi-sent-ts")(`tmi-sent-ts`.asInstanceOf[js.Any])
    if (!js.isUndefined(turbo)) __obj.updateDynamic("turbo")(turbo.asInstanceOf[js.Any])
    if (`user-id` != null) __obj.updateDynamic("user-id")(`user-id`.asInstanceOf[js.Any])
    if (`user-type` != null) __obj.updateDynamic("user-type")(`user-type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Userstate]
  }
  @scala.inline
  def RitualUserstate(
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
    `message-type`: ritual = null,
    mod: js.UndefOr[Boolean] = js.undefined,
    `msg-param-ritual-name`: new_chatter = null,
    `room-id`: String = null,
    subscriber: js.UndefOr[Boolean] = js.undefined,
    `system-msg`: String = null,
    `tmi-sent-ts`: String = null,
    turbo: js.UndefOr[Boolean] = js.undefined,
    `user-id`: String = null,
    `user-type`: Empty | mod | global_mod | admin | staff = null
  ): Userstate = {
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
    if (`msg-param-ritual-name` != null) __obj.updateDynamic("msg-param-ritual-name")(`msg-param-ritual-name`.asInstanceOf[js.Any])
    if (`room-id` != null) __obj.updateDynamic("room-id")(`room-id`.asInstanceOf[js.Any])
    if (!js.isUndefined(subscriber)) __obj.updateDynamic("subscriber")(subscriber.asInstanceOf[js.Any])
    if (`system-msg` != null) __obj.updateDynamic("system-msg")(`system-msg`.asInstanceOf[js.Any])
    if (`tmi-sent-ts` != null) __obj.updateDynamic("tmi-sent-ts")(`tmi-sent-ts`.asInstanceOf[js.Any])
    if (!js.isUndefined(turbo)) __obj.updateDynamic("turbo")(turbo.asInstanceOf[js.Any])
    if (`user-id` != null) __obj.updateDynamic("user-id")(`user-id`.asInstanceOf[js.Any])
    if (`user-type` != null) __obj.updateDynamic("user-type")(`user-type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Userstate]
  }
}

