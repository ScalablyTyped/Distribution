package typings
package twilioDashSyncLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object twilioDashSyncLibStrings {
  @js.native
  sealed trait connected
    extends twilioDashSyncLib.libClientMod.ConnectionState
  
  @js.native
  sealed trait connecting
    extends twilioDashSyncLib.libClientMod.ConnectionState
  
  @js.native
  sealed trait create_new
    extends twilioDashSyncLib.libClientMod.OpenMode
  
  @js.native
  sealed trait denied
    extends twilioDashSyncLib.libClientMod.ConnectionState
  
  @js.native
  sealed trait disconnected
    extends twilioDashSyncLib.libClientMod.ConnectionState
  
  @js.native
  sealed trait disconnecting
    extends twilioDashSyncLib.libClientMod.ConnectionState
  
  @js.native
  sealed trait error
    extends twilioDashSyncLib.libClientMod.ConnectionState
  
  @js.native
  sealed trait established
    extends twilioDashSyncLib.libEntityMod.SubscriptionState
  
  @js.native
  sealed trait none
    extends twilioDashSyncLib.libEntityMod.SubscriptionState
  
  @js.native
  sealed trait open_existing
    extends twilioDashSyncLib.libClientMod.OpenMode
  
  @js.native
  sealed trait open_or_create
    extends twilioDashSyncLib.libClientMod.OpenMode
  
  @js.native
  sealed trait request_in_flight
    extends twilioDashSyncLib.libEntityMod.SubscriptionState
  
  @js.native
  sealed trait response_in_flight
    extends twilioDashSyncLib.libEntityMod.SubscriptionState
  
  @scala.inline
  def connected: connected = "connected".asInstanceOf[connected]
  @scala.inline
  def connecting: connecting = "connecting".asInstanceOf[connecting]
  @scala.inline
  def create_new: create_new = "create_new".asInstanceOf[create_new]
  @scala.inline
  def denied: denied = "denied".asInstanceOf[denied]
  @scala.inline
  def disconnected: disconnected = "disconnected".asInstanceOf[disconnected]
  @scala.inline
  def disconnecting: disconnecting = "disconnecting".asInstanceOf[disconnecting]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def established: established = "established".asInstanceOf[established]
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  @scala.inline
  def open_existing: open_existing = "open_existing".asInstanceOf[open_existing]
  @scala.inline
  def open_or_create: open_or_create = "open_or_create".asInstanceOf[open_or_create]
  @scala.inline
  def request_in_flight: request_in_flight = "request_in_flight".asInstanceOf[request_in_flight]
  @scala.inline
  def response_in_flight: response_in_flight = "response_in_flight".asInstanceOf[response_in_flight]
}

