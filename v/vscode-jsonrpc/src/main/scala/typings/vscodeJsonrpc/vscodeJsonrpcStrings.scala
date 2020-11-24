package typings.vscodeJsonrpc

import typings.vscodeJsonrpc.messagesMod.LSPMessageType
import typings.vscodeJsonrpc.mod.TraceValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vscodeJsonrpcStrings {
  
  @scala.inline
  def messages: messages = "messages".asInstanceOf[messages]
  
  @scala.inline
  def off: off = "off".asInstanceOf[off]
  
  @scala.inline
  def `receive-notification`: `receive-notification` = "receive-notification".asInstanceOf[`receive-notification`]
  
  @scala.inline
  def `receive-request`: `receive-request` = "receive-request".asInstanceOf[`receive-request`]
  
  @scala.inline
  def `receive-response`: `receive-response` = "receive-response".asInstanceOf[`receive-response`]
  
  @scala.inline
  def `send-notification`: `send-notification` = "send-notification".asInstanceOf[`send-notification`]
  
  @scala.inline
  def `send-request`: `send-request` = "send-request".asInstanceOf[`send-request`]
  
  @scala.inline
  def `send-response`: `send-response` = "send-response".asInstanceOf[`send-response`]
  
  @scala.inline
  def verbose: verbose = "verbose".asInstanceOf[verbose]
  
  @js.native
  sealed trait messages extends TraceValues
  
  @js.native
  sealed trait off extends TraceValues
  
  @js.native
  sealed trait `receive-notification` extends LSPMessageType
  
  @js.native
  sealed trait `receive-request` extends LSPMessageType
  
  @js.native
  sealed trait `receive-response` extends LSPMessageType
  
  @js.native
  sealed trait `send-notification` extends LSPMessageType
  
  @js.native
  sealed trait `send-request` extends LSPMessageType
  
  @js.native
  sealed trait `send-response` extends LSPMessageType
  
  @js.native
  sealed trait verbose extends TraceValues
}
