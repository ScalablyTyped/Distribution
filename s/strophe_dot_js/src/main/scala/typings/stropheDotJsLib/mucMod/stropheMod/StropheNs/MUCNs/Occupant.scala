package typings
package stropheDotJsLib.mucMod.stropheMod.StropheNs.MUCNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Occupant extends OccupantInfo {
  def admin(): java.lang.String = js.native
  def admin(reason: java.lang.String): java.lang.String = js.native
  def admin(reason: java.lang.String, success_cb: js.Function1[/* stanza */ stdLib.Element, _]): java.lang.String = js.native
  def admin(
    reason: java.lang.String,
    success_cb: js.Function1[/* stanza */ stdLib.Element, _],
    error_cb: js.Function1[/* stanza */ stdLib.Element, _]
  ): java.lang.String = js.native
  def ban(): java.lang.String = js.native
  def ban(reason: java.lang.String): java.lang.String = js.native
  def ban(reason: java.lang.String, success_cb: js.Function1[/* stanza */ stdLib.Element, _]): java.lang.String = js.native
  def ban(
    reason: java.lang.String,
    success_cb: js.Function1[/* stanza */ stdLib.Element, _],
    error_cb: js.Function1[/* stanza */ stdLib.Element, _]
  ): java.lang.String = js.native
  def deop(): java.lang.String = js.native
  def deop(reason: java.lang.String): java.lang.String = js.native
  def deop(reason: java.lang.String, handler_cb: js.Function1[/* stanza */ stdLib.Element, _]): java.lang.String = js.native
  def deop(
    reason: java.lang.String,
    handler_cb: js.Function1[/* stanza */ stdLib.Element, _],
    error_cb: js.Function1[/* stanza */ stdLib.Element, _]
  ): java.lang.String = js.native
  def kick(): java.lang.String = js.native
  def kick(reason: java.lang.String): java.lang.String = js.native
  def kick(reason: java.lang.String, handler_cb: js.Function1[/* stanza */ stdLib.Element, _]): java.lang.String = js.native
  def kick(
    reason: java.lang.String,
    handler_cb: js.Function1[/* stanza */ stdLib.Element, _],
    error_cb: js.Function1[/* stanza */ stdLib.Element, _]
  ): java.lang.String = js.native
  def member(): java.lang.String = js.native
  def member(reason: java.lang.String): java.lang.String = js.native
  def member(reason: java.lang.String, success_cb: js.Function1[/* stanza */ stdLib.Element, _]): java.lang.String = js.native
  def member(
    reason: java.lang.String,
    success_cb: js.Function1[/* stanza */ stdLib.Element, _],
    error_cb: js.Function1[/* stanza */ stdLib.Element, _]
  ): java.lang.String = js.native
  def modifyAffiliation(affiliation: java.lang.String): java.lang.String = js.native
  def modifyAffiliation(affiliation: java.lang.String, reason: java.lang.String): java.lang.String = js.native
  def modifyAffiliation(
    affiliation: java.lang.String,
    reason: java.lang.String,
    success_cb: js.Function1[/* stanza */ stdLib.Element, _]
  ): java.lang.String = js.native
  def modifyAffiliation(
    affiliation: java.lang.String,
    reason: java.lang.String,
    success_cb: js.Function1[/* stanza */ stdLib.Element, _],
    error_cb: js.Function1[/* stanza */ stdLib.Element, _]
  ): java.lang.String = js.native
  def modifyRole(role: java.lang.String): java.lang.String = js.native
  def modifyRole(role: java.lang.String, reason: java.lang.String): java.lang.String = js.native
  def modifyRole(
    role: java.lang.String,
    reason: java.lang.String,
    success_cb: js.Function1[/* stanza */ stdLib.Element, _]
  ): java.lang.String = js.native
  def modifyRole(
    role: java.lang.String,
    reason: java.lang.String,
    success_cb: js.Function1[/* stanza */ stdLib.Element, _],
    error_cb: js.Function1[/* stanza */ stdLib.Element, _]
  ): java.lang.String = js.native
  def mute(): java.lang.String = js.native
  def mute(reason: java.lang.String): java.lang.String = js.native
  def mute(reason: java.lang.String, handler_cb: js.Function1[/* stanza */ stdLib.Element, _]): java.lang.String = js.native
  def mute(
    reason: java.lang.String,
    handler_cb: js.Function1[/* stanza */ stdLib.Element, _],
    error_cb: js.Function1[/* stanza */ stdLib.Element, _]
  ): java.lang.String = js.native
  def op(): java.lang.String = js.native
  def op(reason: java.lang.String): java.lang.String = js.native
  def op(reason: java.lang.String, handler_cb: js.Function1[/* stanza */ stdLib.Element, _]): java.lang.String = js.native
  def op(
    reason: java.lang.String,
    handler_cb: js.Function1[/* stanza */ stdLib.Element, _],
    error_cb: js.Function1[/* stanza */ stdLib.Element, _]
  ): java.lang.String = js.native
  def owner(): java.lang.String = js.native
  def owner(reason: java.lang.String): java.lang.String = js.native
  def owner(reason: java.lang.String, success_cb: js.Function1[/* stanza */ stdLib.Element, _]): java.lang.String = js.native
  def owner(
    reason: java.lang.String,
    success_cb: js.Function1[/* stanza */ stdLib.Element, _],
    error_cb: js.Function1[/* stanza */ stdLib.Element, _]
  ): java.lang.String = js.native
  def revoke(): java.lang.String = js.native
  def revoke(reason: java.lang.String): java.lang.String = js.native
  def revoke(reason: java.lang.String, success_cb: js.Function1[/* stanza */ stdLib.Element, _]): java.lang.String = js.native
  def revoke(
    reason: java.lang.String,
    success_cb: js.Function1[/* stanza */ stdLib.Element, _],
    error_cb: js.Function1[/* stanza */ stdLib.Element, _]
  ): java.lang.String = js.native
  def update(data: OccupantInfo): scala.Unit = js.native
  def voice(): java.lang.String = js.native
  def voice(reason: java.lang.String): java.lang.String = js.native
  def voice(reason: java.lang.String, handler_cb: js.Function1[/* stanza */ stdLib.Element, _]): java.lang.String = js.native
  def voice(
    reason: java.lang.String,
    handler_cb: js.Function1[/* stanza */ stdLib.Element, _],
    error_cb: js.Function1[/* stanza */ stdLib.Element, _]
  ): java.lang.String = js.native
}

