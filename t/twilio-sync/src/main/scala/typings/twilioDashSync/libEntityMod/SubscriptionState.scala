package typings.twilioDashSync.libEntityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.twilioDashSync.twilioDashSyncStrings.none
  - typings.twilioDashSync.twilioDashSyncStrings.request_in_flight
  - typings.twilioDashSync.twilioDashSyncStrings.response_in_flight
  - typings.twilioDashSync.twilioDashSyncStrings.established
*/
trait SubscriptionState extends js.Object

object SubscriptionState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def established: typings.twilioDashSync.twilioDashSyncStrings.established = this.cast("established")
  @scala.inline
  def none: typings.twilioDashSync.twilioDashSyncStrings.none = this.cast("none")
  @scala.inline
  def request_in_flight: typings.twilioDashSync.twilioDashSyncStrings.request_in_flight = this.cast("request_in_flight")
  @scala.inline
  def response_in_flight: typings.twilioDashSync.twilioDashSyncStrings.response_in_flight = this.cast("response_in_flight")
}

