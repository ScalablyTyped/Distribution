package typings
package strophejsDashPluginDashRosterLib.strophejsDashPluginDashRosterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StropheRosterPlugin extends js.Object {
  def add(jid: java.lang.String, name: java.lang.String, groups: js.Array[java.lang.String]): IqID = js.native
  def add(
    jid: java.lang.String,
    name: java.lang.String,
    groups: js.Array[java.lang.String],
    call_back: IqCallback
  ): IqID = js.native
  def authorize(jid: java.lang.String): scala.Unit = js.native
  def authorize(jid: java.lang.String, message: java.lang.String): scala.Unit = js.native
  def findItem(jid: java.lang.String): RosterItem | strophejsDashPluginDashRosterLib.strophejsDashPluginDashRosterLibNumbers.`false` = js.native
  def get(userCallback: IqCallback): IqID = js.native
  def get(userCallback: IqCallback, ver: java.lang.String): IqID = js.native
  def get(userCallback: IqCallback, ver: java.lang.String, items: js.Array[java.lang.String]): IqID = js.native
  def registerCallback(callback: RosterUpdateCallback): scala.Unit = js.native
  def registerRequestCallback(callback: PresenceRequestCallback): scala.Unit = js.native
  def remove(jid: java.lang.String): scala.Unit = js.native
  def remove(jid: java.lang.String, call_back: IqCallback): scala.Unit = js.native
  def removeItem(jid: java.lang.String): scala.Boolean = js.native
  def subscribe(jid: java.lang.String): scala.Unit = js.native
  def subscribe(jid: java.lang.String, message: java.lang.String): scala.Unit = js.native
  def subscribe(jid: java.lang.String, message: java.lang.String, nick: java.lang.String): scala.Unit = js.native
  def supportVersioning(): scala.Boolean = js.native
  def unauthorize(jid: java.lang.String): scala.Unit = js.native
  def unauthorize(jid: java.lang.String, message: java.lang.String): scala.Unit = js.native
  def unsubscribe(jid: java.lang.String): scala.Unit = js.native
  def unsubscribe(jid: java.lang.String, message: java.lang.String): scala.Unit = js.native
  def update(jid: java.lang.String): IqID = js.native
  def update(jid: java.lang.String, name: java.lang.String): IqID = js.native
  def update(jid: java.lang.String, name: java.lang.String, groups: js.Array[java.lang.String]): IqID = js.native
  def update(
    jid: java.lang.String,
    name: java.lang.String,
    groups: js.Array[java.lang.String],
    call_back: IqCallback
  ): IqID = js.native
}

