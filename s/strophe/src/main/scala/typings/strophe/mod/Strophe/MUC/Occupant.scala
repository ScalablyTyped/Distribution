package typings.strophe.mod.Strophe.MUC

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Occupant
  extends typings.strophe.mucMod.stropheAugmentingMod.Strophe.MUC.OccupantInfo {
  def admin(): String = js.native
  def admin(reason: String): String = js.native
  def admin(reason: String, success_cb: js.Function): String = js.native
  def admin(reason: String, success_cb: js.Function, error_cb: js.Function): String = js.native
  def ban(): String = js.native
  def ban(reason: String): String = js.native
  def ban(reason: String, success_cb: js.Function): String = js.native
  def ban(reason: String, success_cb: js.Function, error_cb: js.Function): String = js.native
  def deop(): String = js.native
  def deop(reason: String): String = js.native
  def deop(reason: String, handler_cb: js.Function): String = js.native
  def deop(reason: String, handler_cb: js.Function, error_cb: js.Function): String = js.native
  def kick(): String = js.native
  def kick(reason: String): String = js.native
  def kick(reason: String, handler_cb: js.Function): String = js.native
  def kick(reason: String, handler_cb: js.Function, error_cb: js.Function): String = js.native
  def member(): String = js.native
  def member(reason: String): String = js.native
  def member(reason: String, success_cb: js.Function): String = js.native
  def member(reason: String, success_cb: js.Function, error_cb: js.Function): String = js.native
  def modifyAffiliation(affiliation: String): String = js.native
  def modifyAffiliation(affiliation: String, reason: String): String = js.native
  def modifyAffiliation(affiliation: String, reason: String, success_cb: js.Function): String = js.native
  def modifyAffiliation(affiliation: String, reason: String, success_cb: js.Function, error_cb: js.Function): String = js.native
  def modifyRole(role: String): String = js.native
  def modifyRole(role: String, reason: String): String = js.native
  def modifyRole(role: String, reason: String, success_cb: js.Function): String = js.native
  def modifyRole(role: String, reason: String, success_cb: js.Function, error_cb: js.Function): String = js.native
  def mute(): String = js.native
  def mute(reason: String): String = js.native
  def mute(reason: String, handler_cb: js.Function): String = js.native
  def mute(reason: String, handler_cb: js.Function, error_cb: js.Function): String = js.native
  def op(): String = js.native
  def op(reason: String): String = js.native
  def op(reason: String, handler_cb: js.Function): String = js.native
  def op(reason: String, handler_cb: js.Function, error_cb: js.Function): String = js.native
  def owner(): String = js.native
  def owner(reason: String): String = js.native
  def owner(reason: String, success_cb: js.Function): String = js.native
  def owner(reason: String, success_cb: js.Function, error_cb: js.Function): String = js.native
  def revoke(): String = js.native
  def revoke(reason: String): String = js.native
  def revoke(reason: String, success_cb: js.Function): String = js.native
  def revoke(reason: String, success_cb: js.Function, error_cb: js.Function): String = js.native
  def update(data: typings.strophe.mucMod.stropheAugmentingMod.Strophe.MUC.OccupantInfo): Unit = js.native
  def voice(): String = js.native
  def voice(reason: String): String = js.native
  def voice(reason: String, handler_cb: js.Function): String = js.native
  def voice(reason: String, handler_cb: js.Function, error_cb: js.Function): String = js.native
}

