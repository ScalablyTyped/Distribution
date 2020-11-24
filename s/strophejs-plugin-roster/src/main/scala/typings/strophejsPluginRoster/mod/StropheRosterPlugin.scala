package typings.strophejsPluginRoster.mod

import typings.strophejsPluginRoster.strophejsPluginRosterBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StropheRosterPlugin extends js.Object {
  
  def add(jid: String, name: String, groups: js.Array[String]): IqID = js.native
  def add(jid: String, name: String, groups: js.Array[String], call_back: IqCallback): IqID = js.native
  
  def authorize(jid: String): Unit = js.native
  def authorize(jid: String, message: String): Unit = js.native
  
  def findItem(jid: String): RosterItem | `false` = js.native
  
  def get(userCallback: IqCallback): IqID = js.native
  def get(userCallback: IqCallback, ver: js.UndefOr[scala.Nothing], items: js.Array[String]): IqID = js.native
  def get(userCallback: IqCallback, ver: String): IqID = js.native
  def get(userCallback: IqCallback, ver: String, items: js.Array[String]): IqID = js.native
  
  def registerCallback(callback: RosterUpdateCallback): Unit = js.native
  
  def registerRequestCallback(callback: PresenceRequestCallback): Unit = js.native
  
  def remove(jid: String): Unit = js.native
  def remove(jid: String, call_back: IqCallback): Unit = js.native
  
  def removeItem(jid: String): Boolean = js.native
  
  def subscribe(jid: String): Unit = js.native
  def subscribe(jid: String, message: js.UndefOr[scala.Nothing], nick: String): Unit = js.native
  def subscribe(jid: String, message: String): Unit = js.native
  def subscribe(jid: String, message: String, nick: String): Unit = js.native
  
  def supportVersioning(): Boolean = js.native
  
  def unauthorize(jid: String): Unit = js.native
  def unauthorize(jid: String, message: String): Unit = js.native
  
  def unsubscribe(jid: String): Unit = js.native
  def unsubscribe(jid: String, message: String): Unit = js.native
  
  def update(jid: String): IqID = js.native
  def update(
    jid: String,
    name: js.UndefOr[scala.Nothing],
    groups: js.UndefOr[scala.Nothing],
    call_back: IqCallback
  ): IqID = js.native
  def update(jid: String, name: js.UndefOr[scala.Nothing], groups: js.Array[String]): IqID = js.native
  def update(jid: String, name: js.UndefOr[scala.Nothing], groups: js.Array[String], call_back: IqCallback): IqID = js.native
  def update(jid: String, name: String): IqID = js.native
  def update(jid: String, name: String, groups: js.UndefOr[scala.Nothing], call_back: IqCallback): IqID = js.native
  def update(jid: String, name: String, groups: js.Array[String]): IqID = js.native
  def update(jid: String, name: String, groups: js.Array[String], call_back: IqCallback): IqID = js.native
}
