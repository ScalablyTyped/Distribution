package typings.twilsock.twilsockMod.TwilsockChannel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.twilsock.twilsockStrings.unknown
  - typings.twilsock.twilsockStrings.disconnecting
  - typings.twilsock.twilsockStrings.disconnected
  - typings.twilsock.twilsockStrings.connecting
  - typings.twilsock.twilsockStrings.connected
  - typings.twilsock.twilsockStrings.error
  - typings.twilsock.twilsockStrings.rejected
*/
trait State extends js.Object

object State {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def connected: typings.twilsock.twilsockStrings.connected = this.cast("connected")
  @scala.inline
  def connecting: typings.twilsock.twilsockStrings.connecting = this.cast("connecting")
  @scala.inline
  def disconnected: typings.twilsock.twilsockStrings.disconnected = this.cast("disconnected")
  @scala.inline
  def disconnecting: typings.twilsock.twilsockStrings.disconnecting = this.cast("disconnecting")
  @scala.inline
  def error: typings.twilsock.twilsockStrings.error = this.cast("error")
  @scala.inline
  def rejected: typings.twilsock.twilsockStrings.rejected = this.cast("rejected")
  @scala.inline
  def unknown: typings.twilsock.twilsockStrings.unknown = this.cast("unknown")
}

