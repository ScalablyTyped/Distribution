package typings.twilioSync.entityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.twilioSync.twilioSyncStrings.none
  - typings.twilioSync.twilioSyncStrings.request_in_flight
  - typings.twilioSync.twilioSyncStrings.response_in_flight
  - typings.twilioSync.twilioSyncStrings.established
*/
trait SubscriptionState extends js.Object

object SubscriptionState {
  @scala.inline
  def established: typings.twilioSync.twilioSyncStrings.established = "established".asInstanceOf[typings.twilioSync.twilioSyncStrings.established]
  @scala.inline
  def none: typings.twilioSync.twilioSyncStrings.none = "none".asInstanceOf[typings.twilioSync.twilioSyncStrings.none]
  @scala.inline
  def request_in_flight: typings.twilioSync.twilioSyncStrings.request_in_flight = "request_in_flight".asInstanceOf[typings.twilioSync.twilioSyncStrings.request_in_flight]
  @scala.inline
  def response_in_flight: typings.twilioSync.twilioSyncStrings.response_in_flight = "response_in_flight".asInstanceOf[typings.twilioSync.twilioSyncStrings.response_in_flight]
}

