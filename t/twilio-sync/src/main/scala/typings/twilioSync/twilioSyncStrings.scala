package typings.twilioSync

import typings.twilioSync.clientMod.ConnectionState
import typings.twilioSync.clientMod.OpenMode
import typings.twilioSync.entityMod.SubscriptionState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object twilioSyncStrings {
  
  @js.native
  sealed trait connected
    extends StObject
       with ConnectionState
  inline def connected: connected = "connected".asInstanceOf[connected]
  
  @js.native
  sealed trait connecting
    extends StObject
       with ConnectionState
  inline def connecting: connecting = "connecting".asInstanceOf[connecting]
  
  @js.native
  sealed trait create_new
    extends StObject
       with OpenMode
  inline def create_new: create_new = "create_new".asInstanceOf[create_new]
  
  @js.native
  sealed trait denied
    extends StObject
       with ConnectionState
  inline def denied: denied = "denied".asInstanceOf[denied]
  
  @js.native
  sealed trait disconnected
    extends StObject
       with ConnectionState
  inline def disconnected: disconnected = "disconnected".asInstanceOf[disconnected]
  
  @js.native
  sealed trait disconnecting
    extends StObject
       with ConnectionState
  inline def disconnecting: disconnecting = "disconnecting".asInstanceOf[disconnecting]
  
  @js.native
  sealed trait error
    extends StObject
       with ConnectionState
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait established
    extends StObject
       with SubscriptionState
  inline def established: established = "established".asInstanceOf[established]
  
  @js.native
  sealed trait none
    extends StObject
       with SubscriptionState
  inline def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait open_existing
    extends StObject
       with OpenMode
  inline def open_existing: open_existing = "open_existing".asInstanceOf[open_existing]
  
  @js.native
  sealed trait open_or_create
    extends StObject
       with OpenMode
  inline def open_or_create: open_or_create = "open_or_create".asInstanceOf[open_or_create]
  
  @js.native
  sealed trait request_in_flight
    extends StObject
       with SubscriptionState
  inline def request_in_flight: request_in_flight = "request_in_flight".asInstanceOf[request_in_flight]
  
  @js.native
  sealed trait response_in_flight
    extends StObject
       with SubscriptionState
  inline def response_in_flight: response_in_flight = "response_in_flight".asInstanceOf[response_in_flight]
}
