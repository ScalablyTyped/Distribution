package typings
package uwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object uwsLibStrings {
  @js.native
  sealed trait close extends js.Object
  
  @js.native
  sealed trait connection extends js.Object
  
  @js.native
  sealed trait error extends js.Object
  
  @js.native
  sealed trait headers extends js.Object
  
  @js.native
  sealed trait message extends js.Object
  
  @js.native
  sealed trait open extends js.Object
  
  @js.native
  sealed trait ping extends js.Object
  
  @js.native
  sealed trait pong extends js.Object
  
  def close: close = "close".asInstanceOf[close]
  def connection: connection = "connection".asInstanceOf[connection]
  def error: error = "error".asInstanceOf[error]
  def headers: headers = "headers".asInstanceOf[headers]
  def message: message = "message".asInstanceOf[message]
  def open: open = "open".asInstanceOf[open]
  def ping: ping = "ping".asInstanceOf[ping]
  def pong: pong = "pong".asInstanceOf[pong]
}

