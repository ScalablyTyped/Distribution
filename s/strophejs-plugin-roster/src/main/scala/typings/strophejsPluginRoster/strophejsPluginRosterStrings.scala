package typings.strophejsPluginRoster

import typings.strophejsPluginRoster.mod.PresenceSubscriptionType
import typings.strophejsPluginRoster.mod.RosterSubscriptionState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object strophejsPluginRosterStrings {
  @js.native
  sealed trait both extends RosterSubscriptionState
  
  @js.native
  sealed trait from extends RosterSubscriptionState
  
  @js.native
  sealed trait none extends RosterSubscriptionState
  
  @js.native
  sealed trait remove extends RosterSubscriptionState
  
  @js.native
  sealed trait subscribe extends PresenceSubscriptionType
  
  @js.native
  sealed trait subscribed extends PresenceSubscriptionType
  
  @js.native
  sealed trait to extends RosterSubscriptionState
  
  @js.native
  sealed trait unsubscribe extends PresenceSubscriptionType
  
  @js.native
  sealed trait unsubscribed extends PresenceSubscriptionType
  
  @scala.inline
  def both: both = "both".asInstanceOf[both]
  @scala.inline
  def from: from = "from".asInstanceOf[from]
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  @scala.inline
  def remove: remove = "remove".asInstanceOf[remove]
  @scala.inline
  def subscribe: subscribe = "subscribe".asInstanceOf[subscribe]
  @scala.inline
  def subscribed: subscribed = "subscribed".asInstanceOf[subscribed]
  @scala.inline
  def to: to = "to".asInstanceOf[to]
  @scala.inline
  def unsubscribe: unsubscribe = "unsubscribe".asInstanceOf[unsubscribe]
  @scala.inline
  def unsubscribed: unsubscribed = "unsubscribed".asInstanceOf[unsubscribed]
}

