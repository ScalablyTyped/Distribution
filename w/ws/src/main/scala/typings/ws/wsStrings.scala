package typings.ws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object wsStrings {
  @js.native
  sealed trait close extends js.Object
  
  @js.native
  sealed trait connection extends js.Object
  
  @js.native
  sealed trait error extends js.Object
  
  @js.native
  sealed trait headers extends js.Object
  
  @js.native
  sealed trait listening extends js.Object
  
  @js.native
  sealed trait message extends js.Object
  
  @js.native
  sealed trait open extends js.Object
  
  @js.native
  sealed trait ping extends js.Object
  
  @js.native
  sealed trait pong extends js.Object
  
  @js.native
  sealed trait `unexpected-response` extends js.Object
  
  @js.native
  sealed trait upgrade extends js.Object
  
  @scala.inline
  def close: close = "close".asInstanceOf[close]
  @scala.inline
  def connection: connection = "connection".asInstanceOf[connection]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def headers: headers = "headers".asInstanceOf[headers]
  @scala.inline
  def listening: listening = "listening".asInstanceOf[listening]
  @scala.inline
  def message: message = "message".asInstanceOf[message]
  @scala.inline
  def open: open = "open".asInstanceOf[open]
  @scala.inline
  def ping: ping = "ping".asInstanceOf[ping]
  @scala.inline
  def pong: pong = "pong".asInstanceOf[pong]
  @scala.inline
  def `unexpected-response`: `unexpected-response` = "unexpected-response".asInstanceOf[`unexpected-response`]
  @scala.inline
  def upgrade: upgrade = "upgrade".asInstanceOf[upgrade]
}

