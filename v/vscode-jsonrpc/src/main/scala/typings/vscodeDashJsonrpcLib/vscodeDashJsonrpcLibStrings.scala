package typings
package vscodeDashJsonrpcLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object vscodeDashJsonrpcLibStrings {
  @js.native
  sealed trait messages
    extends vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.TraceValues
  
  @js.native
  sealed trait off
    extends vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.TraceValues
  
  @js.native
  sealed trait `receive-notification`
    extends vscodeDashJsonrpcLib.libMessagesMod.LSPMessageType
  
  @js.native
  sealed trait `receive-request`
    extends vscodeDashJsonrpcLib.libMessagesMod.LSPMessageType
  
  @js.native
  sealed trait `receive-response`
    extends vscodeDashJsonrpcLib.libMessagesMod.LSPMessageType
  
  @js.native
  sealed trait `send-notification`
    extends vscodeDashJsonrpcLib.libMessagesMod.LSPMessageType
  
  @js.native
  sealed trait `send-request`
    extends vscodeDashJsonrpcLib.libMessagesMod.LSPMessageType
  
  @js.native
  sealed trait `send-response`
    extends vscodeDashJsonrpcLib.libMessagesMod.LSPMessageType
  
  @js.native
  sealed trait verbose
    extends vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.TraceValues
  
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
}

