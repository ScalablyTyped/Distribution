package typings.twilioSync.clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.twilioSync.twilioSyncStrings.disconnected
  - typings.twilioSync.twilioSyncStrings.connecting
  - typings.twilioSync.twilioSyncStrings.connected
  - typings.twilioSync.twilioSyncStrings.disconnecting
  - typings.twilioSync.twilioSyncStrings.denied
  - typings.twilioSync.twilioSyncStrings.error
*/
trait ConnectionState extends js.Object

object ConnectionState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def connected: typings.twilioSync.twilioSyncStrings.connected = this.cast("connected")
  @scala.inline
  def connecting: typings.twilioSync.twilioSyncStrings.connecting = this.cast("connecting")
  @scala.inline
  def denied: typings.twilioSync.twilioSyncStrings.denied = this.cast("denied")
  @scala.inline
  def disconnected: typings.twilioSync.twilioSyncStrings.disconnected = this.cast("disconnected")
  @scala.inline
  def disconnecting: typings.twilioSync.twilioSyncStrings.disconnecting = this.cast("disconnecting")
  @scala.inline
  def error: typings.twilioSync.twilioSyncStrings.error = this.cast("error")
}

