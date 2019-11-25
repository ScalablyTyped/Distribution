package typings.tmiDotJs.tmiDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.tmiDotJs.tmiDotJsStrings.already_banned
  - typings.tmiDotJs.tmiDotJsStrings.already_emote_only_on
  - typings.tmiDotJs.tmiDotJsStrings.already_emote_only_off
  - typings.tmiDotJs.tmiDotJsStrings.already_subs_on
  - typings.tmiDotJs.tmiDotJsStrings.already_subs_off
  - typings.tmiDotJs.tmiDotJsStrings.bad_ban_admin
  - typings.tmiDotJs.tmiDotJsStrings.bad_ban_broadcaster
  - typings.tmiDotJs.tmiDotJsStrings.bad_ban_global_mod
  - typings.tmiDotJs.tmiDotJsStrings.bad_ban_self
  - typings.tmiDotJs.tmiDotJsStrings.bad_ban_staff
  - typings.tmiDotJs.tmiDotJsStrings.bad_commercial_error
  - typings.tmiDotJs.tmiDotJsStrings.bad_host_hosting
  - typings.tmiDotJs.tmiDotJsStrings.bad_host_rate_exceeded
  - typings.tmiDotJs.tmiDotJsStrings.bad_mod_mod
  - typings.tmiDotJs.tmiDotJsStrings.bad_mod_banned
  - typings.tmiDotJs.tmiDotJsStrings.bad_timeout_admin
  - typings.tmiDotJs.tmiDotJsStrings.bad_timeout_global_mod
  - typings.tmiDotJs.tmiDotJsStrings.bad_timeout_self
  - typings.tmiDotJs.tmiDotJsStrings.bad_timeout_staff
  - typings.tmiDotJs.tmiDotJsStrings.bad_unban_no_ban
  - typings.tmiDotJs.tmiDotJsStrings.bad_unmod_mod
  - typings.tmiDotJs.tmiDotJsStrings.ban_success
  - typings.tmiDotJs.tmiDotJsStrings.cmds_available
  - typings.tmiDotJs.tmiDotJsStrings.color_changed
  - typings.tmiDotJs.tmiDotJsStrings.commercial_success
  - typings.tmiDotJs.tmiDotJsStrings.emote_only_on
  - typings.tmiDotJs.tmiDotJsStrings.emote_only_off
  - typings.tmiDotJs.tmiDotJsStrings.hosts_remaining
  - typings.tmiDotJs.tmiDotJsStrings.host_target_went_offline
  - typings.tmiDotJs.tmiDotJsStrings.mod_success
  - typings.tmiDotJs.tmiDotJsStrings.msg_banned
  - typings.tmiDotJs.tmiDotJsStrings.msg_censored_broadcaster
  - typings.tmiDotJs.tmiDotJsStrings.msg_channel_suspended
  - typings.tmiDotJs.tmiDotJsStrings.msg_duplicate
  - typings.tmiDotJs.tmiDotJsStrings.msg_emoteonly
  - typings.tmiDotJs.tmiDotJsStrings.msg_ratelimit
  - typings.tmiDotJs.tmiDotJsStrings.msg_subsonly
  - typings.tmiDotJs.tmiDotJsStrings.msg_timedout
  - typings.tmiDotJs.tmiDotJsStrings.msg_verified_email
  - typings.tmiDotJs.tmiDotJsStrings.no_help
  - typings.tmiDotJs.tmiDotJsStrings.no_permission
  - typings.tmiDotJs.tmiDotJsStrings.not_hosting
  - typings.tmiDotJs.tmiDotJsStrings.timeout_success
  - typings.tmiDotJs.tmiDotJsStrings.unban_success
  - typings.tmiDotJs.tmiDotJsStrings.unmod_success
  - typings.tmiDotJs.tmiDotJsStrings.unrecognized_cmd
  - typings.tmiDotJs.tmiDotJsStrings.usage_ban
  - typings.tmiDotJs.tmiDotJsStrings.usage_clear
  - typings.tmiDotJs.tmiDotJsStrings.usage_color
  - typings.tmiDotJs.tmiDotJsStrings.usage_commercial
  - typings.tmiDotJs.tmiDotJsStrings.usage_disconnect
  - typings.tmiDotJs.tmiDotJsStrings.usage_emote_only_on
  - typings.tmiDotJs.tmiDotJsStrings.usage_emote_only_off
  - typings.tmiDotJs.tmiDotJsStrings.usage_help
  - typings.tmiDotJs.tmiDotJsStrings.usage_host
  - typings.tmiDotJs.tmiDotJsStrings.usage_me
  - typings.tmiDotJs.tmiDotJsStrings.usage_mod
  - typings.tmiDotJs.tmiDotJsStrings.usage_mods
  - typings.tmiDotJs.tmiDotJsStrings.usage_r9k_on
  - typings.tmiDotJs.tmiDotJsStrings.usage_r9k_off
  - typings.tmiDotJs.tmiDotJsStrings.usage_slow_on
  - typings.tmiDotJs.tmiDotJsStrings.usage_slow_off
  - typings.tmiDotJs.tmiDotJsStrings.usage_subs_on
  - typings.tmiDotJs.tmiDotJsStrings.usage_subs_off
  - typings.tmiDotJs.tmiDotJsStrings.usage_timeout
  - typings.tmiDotJs.tmiDotJsStrings.usage_unban
  - typings.tmiDotJs.tmiDotJsStrings.usage_unhost
  - typings.tmiDotJs.tmiDotJsStrings.usage_unmod
  - typings.tmiDotJs.tmiDotJsStrings.whisper_invalid_self
  - typings.tmiDotJs.tmiDotJsStrings.whisper_limit_per_min
  - typings.tmiDotJs.tmiDotJsStrings.whisper_limit_per_sec
  - typings.tmiDotJs.tmiDotJsStrings.whisper_restricted_recipient
*/
trait MsgID extends js.Object

object MsgID {
  @scala.inline
  def already_banned: typings.tmiDotJs.tmiDotJsStrings.already_banned = this.cast("already_banned")
  @scala.inline
  def already_emote_only_off: typings.tmiDotJs.tmiDotJsStrings.already_emote_only_off = this.cast("already_emote_only_off")
  @scala.inline
  def already_emote_only_on: typings.tmiDotJs.tmiDotJsStrings.already_emote_only_on = this.cast("already_emote_only_on")
  @scala.inline
  def already_subs_off: typings.tmiDotJs.tmiDotJsStrings.already_subs_off = this.cast("already_subs_off")
  @scala.inline
  def already_subs_on: typings.tmiDotJs.tmiDotJsStrings.already_subs_on = this.cast("already_subs_on")
  @scala.inline
  def bad_ban_admin: typings.tmiDotJs.tmiDotJsStrings.bad_ban_admin = this.cast("bad_ban_admin")
  @scala.inline
  def bad_ban_broadcaster: typings.tmiDotJs.tmiDotJsStrings.bad_ban_broadcaster = this.cast("bad_ban_broadcaster")
  @scala.inline
  def bad_ban_global_mod: typings.tmiDotJs.tmiDotJsStrings.bad_ban_global_mod = this.cast("bad_ban_global_mod")
  @scala.inline
  def bad_ban_self: typings.tmiDotJs.tmiDotJsStrings.bad_ban_self = this.cast("bad_ban_self")
  @scala.inline
  def bad_ban_staff: typings.tmiDotJs.tmiDotJsStrings.bad_ban_staff = this.cast("bad_ban_staff")
  @scala.inline
  def bad_commercial_error: typings.tmiDotJs.tmiDotJsStrings.bad_commercial_error = this.cast("bad_commercial_error")
  @scala.inline
  def bad_host_hosting: typings.tmiDotJs.tmiDotJsStrings.bad_host_hosting = this.cast("bad_host_hosting")
  @scala.inline
  def bad_host_rate_exceeded: typings.tmiDotJs.tmiDotJsStrings.bad_host_rate_exceeded = this.cast("bad_host_rate_exceeded")
  @scala.inline
  def bad_mod_banned: typings.tmiDotJs.tmiDotJsStrings.bad_mod_banned = this.cast("bad_mod_banned")
  @scala.inline
  def bad_mod_mod: typings.tmiDotJs.tmiDotJsStrings.bad_mod_mod = this.cast("bad_mod_mod")
  @scala.inline
  def bad_timeout_admin: typings.tmiDotJs.tmiDotJsStrings.bad_timeout_admin = this.cast("bad_timeout_admin")
  @scala.inline
  def bad_timeout_global_mod: typings.tmiDotJs.tmiDotJsStrings.bad_timeout_global_mod = this.cast("bad_timeout_global_mod")
  @scala.inline
  def bad_timeout_self: typings.tmiDotJs.tmiDotJsStrings.bad_timeout_self = this.cast("bad_timeout_self")
  @scala.inline
  def bad_timeout_staff: typings.tmiDotJs.tmiDotJsStrings.bad_timeout_staff = this.cast("bad_timeout_staff")
  @scala.inline
  def bad_unban_no_ban: typings.tmiDotJs.tmiDotJsStrings.bad_unban_no_ban = this.cast("bad_unban_no_ban")
  @scala.inline
  def bad_unmod_mod: typings.tmiDotJs.tmiDotJsStrings.bad_unmod_mod = this.cast("bad_unmod_mod")
  @scala.inline
  def ban_success: typings.tmiDotJs.tmiDotJsStrings.ban_success = this.cast("ban_success")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cmds_available: typings.tmiDotJs.tmiDotJsStrings.cmds_available = this.cast("cmds_available")
  @scala.inline
  def color_changed: typings.tmiDotJs.tmiDotJsStrings.color_changed = this.cast("color_changed")
  @scala.inline
  def commercial_success: typings.tmiDotJs.tmiDotJsStrings.commercial_success = this.cast("commercial_success")
  @scala.inline
  def emote_only_off: typings.tmiDotJs.tmiDotJsStrings.emote_only_off = this.cast("emote_only_off")
  @scala.inline
  def emote_only_on: typings.tmiDotJs.tmiDotJsStrings.emote_only_on = this.cast("emote_only_on")
  @scala.inline
  def host_target_went_offline: typings.tmiDotJs.tmiDotJsStrings.host_target_went_offline = this.cast("host_target_went_offline")
  @scala.inline
  def hosts_remaining: typings.tmiDotJs.tmiDotJsStrings.hosts_remaining = this.cast("hosts_remaining")
  @scala.inline
  def mod_success: typings.tmiDotJs.tmiDotJsStrings.mod_success = this.cast("mod_success")
  @scala.inline
  def msg_banned: typings.tmiDotJs.tmiDotJsStrings.msg_banned = this.cast("msg_banned")
  @scala.inline
  def msg_censored_broadcaster: typings.tmiDotJs.tmiDotJsStrings.msg_censored_broadcaster = this.cast("msg_censored_broadcaster")
  @scala.inline
  def msg_channel_suspended: typings.tmiDotJs.tmiDotJsStrings.msg_channel_suspended = this.cast("msg_channel_suspended")
  @scala.inline
  def msg_duplicate: typings.tmiDotJs.tmiDotJsStrings.msg_duplicate = this.cast("msg_duplicate")
  @scala.inline
  def msg_emoteonly: typings.tmiDotJs.tmiDotJsStrings.msg_emoteonly = this.cast("msg_emoteonly")
  @scala.inline
  def msg_ratelimit: typings.tmiDotJs.tmiDotJsStrings.msg_ratelimit = this.cast("msg_ratelimit")
  @scala.inline
  def msg_subsonly: typings.tmiDotJs.tmiDotJsStrings.msg_subsonly = this.cast("msg_subsonly")
  @scala.inline
  def msg_timedout: typings.tmiDotJs.tmiDotJsStrings.msg_timedout = this.cast("msg_timedout")
  @scala.inline
  def msg_verified_email: typings.tmiDotJs.tmiDotJsStrings.msg_verified_email = this.cast("msg_verified_email")
  @scala.inline
  def no_help: typings.tmiDotJs.tmiDotJsStrings.no_help = this.cast("no_help")
  @scala.inline
  def no_permission: typings.tmiDotJs.tmiDotJsStrings.no_permission = this.cast("no_permission")
  @scala.inline
  def not_hosting: typings.tmiDotJs.tmiDotJsStrings.not_hosting = this.cast("not_hosting")
  @scala.inline
  def timeout_success: typings.tmiDotJs.tmiDotJsStrings.timeout_success = this.cast("timeout_success")
  @scala.inline
  def unban_success: typings.tmiDotJs.tmiDotJsStrings.unban_success = this.cast("unban_success")
  @scala.inline
  def unmod_success: typings.tmiDotJs.tmiDotJsStrings.unmod_success = this.cast("unmod_success")
  @scala.inline
  def unrecognized_cmd: typings.tmiDotJs.tmiDotJsStrings.unrecognized_cmd = this.cast("unrecognized_cmd")
  @scala.inline
  def usage_ban: typings.tmiDotJs.tmiDotJsStrings.usage_ban = this.cast("usage_ban")
  @scala.inline
  def usage_clear: typings.tmiDotJs.tmiDotJsStrings.usage_clear = this.cast("usage_clear")
  @scala.inline
  def usage_color: typings.tmiDotJs.tmiDotJsStrings.usage_color = this.cast("usage_color")
  @scala.inline
  def usage_commercial: typings.tmiDotJs.tmiDotJsStrings.usage_commercial = this.cast("usage_commercial")
  @scala.inline
  def usage_disconnect: typings.tmiDotJs.tmiDotJsStrings.usage_disconnect = this.cast("usage_disconnect")
  @scala.inline
  def usage_emote_only_off: typings.tmiDotJs.tmiDotJsStrings.usage_emote_only_off = this.cast("usage_emote_only_off")
  @scala.inline
  def usage_emote_only_on: typings.tmiDotJs.tmiDotJsStrings.usage_emote_only_on = this.cast("usage_emote_only_on")
  @scala.inline
  def usage_help: typings.tmiDotJs.tmiDotJsStrings.usage_help = this.cast("usage_help")
  @scala.inline
  def usage_host: typings.tmiDotJs.tmiDotJsStrings.usage_host = this.cast("usage_host")
  @scala.inline
  def usage_me: typings.tmiDotJs.tmiDotJsStrings.usage_me = this.cast("usage_me")
  @scala.inline
  def usage_mod: typings.tmiDotJs.tmiDotJsStrings.usage_mod = this.cast("usage_mod")
  @scala.inline
  def usage_mods: typings.tmiDotJs.tmiDotJsStrings.usage_mods = this.cast("usage_mods")
  @scala.inline
  def usage_r9k_off: typings.tmiDotJs.tmiDotJsStrings.usage_r9k_off = this.cast("usage_r9k_off")
  @scala.inline
  def usage_r9k_on: typings.tmiDotJs.tmiDotJsStrings.usage_r9k_on = this.cast("usage_r9k_on")
  @scala.inline
  def usage_slow_off: typings.tmiDotJs.tmiDotJsStrings.usage_slow_off = this.cast("usage_slow_off")
  @scala.inline
  def usage_slow_on: typings.tmiDotJs.tmiDotJsStrings.usage_slow_on = this.cast("usage_slow_on")
  @scala.inline
  def usage_subs_off: typings.tmiDotJs.tmiDotJsStrings.usage_subs_off = this.cast("usage_subs_off")
  @scala.inline
  def usage_subs_on: typings.tmiDotJs.tmiDotJsStrings.usage_subs_on = this.cast("usage_subs_on")
  @scala.inline
  def usage_timeout: typings.tmiDotJs.tmiDotJsStrings.usage_timeout = this.cast("usage_timeout")
  @scala.inline
  def usage_unban: typings.tmiDotJs.tmiDotJsStrings.usage_unban = this.cast("usage_unban")
  @scala.inline
  def usage_unhost: typings.tmiDotJs.tmiDotJsStrings.usage_unhost = this.cast("usage_unhost")
  @scala.inline
  def usage_unmod: typings.tmiDotJs.tmiDotJsStrings.usage_unmod = this.cast("usage_unmod")
  @scala.inline
  def whisper_invalid_self: typings.tmiDotJs.tmiDotJsStrings.whisper_invalid_self = this.cast("whisper_invalid_self")
  @scala.inline
  def whisper_limit_per_min: typings.tmiDotJs.tmiDotJsStrings.whisper_limit_per_min = this.cast("whisper_limit_per_min")
  @scala.inline
  def whisper_limit_per_sec: typings.tmiDotJs.tmiDotJsStrings.whisper_limit_per_sec = this.cast("whisper_limit_per_sec")
  @scala.inline
  def whisper_restricted_recipient: typings.tmiDotJs.tmiDotJsStrings.whisper_restricted_recipient = this.cast("whisper_restricted_recipient")
}

