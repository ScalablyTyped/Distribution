package typings.twilioDashSync.libClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.twilioDashSync.twilioDashSyncStrings.disconnected
  - typings.twilioDashSync.twilioDashSyncStrings.connecting
  - typings.twilioDashSync.twilioDashSyncStrings.connected
  - typings.twilioDashSync.twilioDashSyncStrings.disconnecting
  - typings.twilioDashSync.twilioDashSyncStrings.denied
  - typings.twilioDashSync.twilioDashSyncStrings.error
*/
trait ConnectionState extends js.Object

object ConnectionState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def connected: typings.twilioDashSync.twilioDashSyncStrings.connected = this.cast("connected")
  @scala.inline
  def connecting: typings.twilioDashSync.twilioDashSyncStrings.connecting = this.cast("connecting")
  @scala.inline
  def denied: typings.twilioDashSync.twilioDashSyncStrings.denied = this.cast("denied")
  @scala.inline
  def disconnected: typings.twilioDashSync.twilioDashSyncStrings.disconnected = this.cast("disconnected")
  @scala.inline
  def disconnecting: typings.twilioDashSync.twilioDashSyncStrings.disconnecting = this.cast("disconnecting")
  @scala.inline
  def error: typings.twilioDashSync.twilioDashSyncStrings.error = this.cast("error")
}

