package typings.twilioSync

import typings.twilioSync.mod.OpenMode
import typings.twilioSync.mod.SubscriptionState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object twilioSyncStrings {
  
  @js.native
  sealed trait asc extends StObject
  inline def asc: asc = "asc".asInstanceOf[asc]
  
  @js.native
  sealed trait create_new
    extends StObject
       with OpenMode
  inline def create_new: create_new = "create_new".asInstanceOf[create_new]
  
  @js.native
  sealed trait debug extends StObject
  inline def debug: debug = "debug".asInstanceOf[debug]
  
  @js.native
  sealed trait desc extends StObject
  inline def desc: desc = "desc".asInstanceOf[desc]
  
  @js.native
  sealed trait error extends StObject
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait established
    extends StObject
       with SubscriptionState
  inline def established: established = "established".asInstanceOf[established]
  
  @js.native
  sealed trait info extends StObject
  inline def info: info = "info".asInstanceOf[info]
  
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
  
  @js.native
  sealed trait silent extends StObject
  inline def silent: silent = "silent".asInstanceOf[silent]
  
  @js.native
  sealed trait trace extends StObject
  inline def trace: trace = "trace".asInstanceOf[trace]
  
  @js.native
  sealed trait warn extends StObject
  inline def warn: warn = "warn".asInstanceOf[warn]
}
