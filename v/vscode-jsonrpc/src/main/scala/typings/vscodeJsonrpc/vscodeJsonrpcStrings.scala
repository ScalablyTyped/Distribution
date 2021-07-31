package typings.vscodeJsonrpc

import typings.vscodeJsonrpc.messagesMod.LSPMessageType
import typings.vscodeJsonrpc.mod.TraceValues
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vscodeJsonrpcStrings {
  
  @js.native
  sealed trait messages
    extends StObject
       with TraceValues
  @scala.inline
  def messages: messages = "messages".asInstanceOf[messages]
  
  @js.native
  sealed trait off
    extends StObject
       with TraceValues
  @scala.inline
  def off: off = "off".asInstanceOf[off]
  
  @js.native
  sealed trait `receive-notification`
    extends StObject
       with LSPMessageType
  @scala.inline
  def `receive-notification`: `receive-notification` = "receive-notification".asInstanceOf[`receive-notification`]
  
  @js.native
  sealed trait `receive-request`
    extends StObject
       with LSPMessageType
  @scala.inline
  def `receive-request`: `receive-request` = "receive-request".asInstanceOf[`receive-request`]
  
  @js.native
  sealed trait `receive-response`
    extends StObject
       with LSPMessageType
  @scala.inline
  def `receive-response`: `receive-response` = "receive-response".asInstanceOf[`receive-response`]
  
  @js.native
  sealed trait `send-notification`
    extends StObject
       with LSPMessageType
  @scala.inline
  def `send-notification`: `send-notification` = "send-notification".asInstanceOf[`send-notification`]
  
  @js.native
  sealed trait `send-request`
    extends StObject
       with LSPMessageType
  @scala.inline
  def `send-request`: `send-request` = "send-request".asInstanceOf[`send-request`]
  
  @js.native
  sealed trait `send-response`
    extends StObject
       with LSPMessageType
  @scala.inline
  def `send-response`: `send-response` = "send-response".asInstanceOf[`send-response`]
  
  @js.native
  sealed trait verbose
    extends StObject
       with TraceValues
  @scala.inline
  def verbose: verbose = "verbose".asInstanceOf[verbose]
}
