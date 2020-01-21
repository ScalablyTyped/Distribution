package typings.strophejsPluginRoster.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.strophejsPluginRoster.strophejsPluginRosterStrings.subscribe
  - typings.strophejsPluginRoster.strophejsPluginRosterStrings.unsubscribe
  - typings.strophejsPluginRoster.strophejsPluginRosterStrings.subscribed
  - typings.strophejsPluginRoster.strophejsPluginRosterStrings.unsubscribed
*/
trait PresenceSubscriptionType extends js.Object

object PresenceSubscriptionType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def subscribe: typings.strophejsPluginRoster.strophejsPluginRosterStrings.subscribe = this.cast("subscribe")
  @scala.inline
  def subscribed: typings.strophejsPluginRoster.strophejsPluginRosterStrings.subscribed = this.cast("subscribed")
  @scala.inline
  def unsubscribe: typings.strophejsPluginRoster.strophejsPluginRosterStrings.unsubscribe = this.cast("unsubscribe")
  @scala.inline
  def unsubscribed: typings.strophejsPluginRoster.strophejsPluginRosterStrings.unsubscribed = this.cast("unsubscribed")
}

