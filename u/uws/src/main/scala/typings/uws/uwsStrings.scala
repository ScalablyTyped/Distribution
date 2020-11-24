package typings.uws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uwsStrings {
  
  @scala.inline
  def close: close = "close".asInstanceOf[close]
  
  @scala.inline
  def connection: connection = "connection".asInstanceOf[connection]
  
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @scala.inline
  def headers: headers = "headers".asInstanceOf[headers]
  
  @scala.inline
  def message: message = "message".asInstanceOf[message]
  
  @scala.inline
  def open: open = "open".asInstanceOf[open]
  
  @scala.inline
  def ping: ping = "ping".asInstanceOf[ping]
  
  @scala.inline
  def pong: pong = "pong".asInstanceOf[pong]
  
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
}
