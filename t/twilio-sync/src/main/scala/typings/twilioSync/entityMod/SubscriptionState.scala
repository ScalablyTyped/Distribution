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
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def established: typings.twilioSync.twilioSyncStrings.established = this.cast("established")
  @scala.inline
  def none: typings.twilioSync.twilioSyncStrings.none = this.cast("none")
  @scala.inline
  def request_in_flight: typings.twilioSync.twilioSyncStrings.request_in_flight = this.cast("request_in_flight")
  @scala.inline
  def response_in_flight: typings.twilioSync.twilioSyncStrings.response_in_flight = this.cast("response_in_flight")
}

