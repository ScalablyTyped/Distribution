package typings.strophejsPluginRoster

import typings.strophejsPluginRoster.mod.PresenceSubscriptionType
import typings.strophejsPluginRoster.mod.RosterSubscriptionState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object strophejsPluginRosterStrings {
  
  @js.native
  sealed trait both extends RosterSubscriptionState
  @scala.inline
  def both: both = "both".asInstanceOf[both]
  
  @js.native
  sealed trait from extends RosterSubscriptionState
  @scala.inline
  def from: from = "from".asInstanceOf[from]
  
  @js.native
  sealed trait none extends RosterSubscriptionState
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait remove extends RosterSubscriptionState
  @scala.inline
  def remove: remove = "remove".asInstanceOf[remove]
  
  @js.native
  sealed trait subscribe extends PresenceSubscriptionType
  @scala.inline
  def subscribe: subscribe = "subscribe".asInstanceOf[subscribe]
  
  @js.native
  sealed trait subscribed extends PresenceSubscriptionType
  @scala.inline
  def subscribed: subscribed = "subscribed".asInstanceOf[subscribed]
  
  @js.native
  sealed trait to extends RosterSubscriptionState
  @scala.inline
  def to: to = "to".asInstanceOf[to]
  
  @js.native
  sealed trait unsubscribe extends PresenceSubscriptionType
  @scala.inline
  def unsubscribe: unsubscribe = "unsubscribe".asInstanceOf[unsubscribe]
  
  @js.native
  sealed trait unsubscribed extends PresenceSubscriptionType
  @scala.inline
  def unsubscribed: unsubscribed = "unsubscribed".asInstanceOf[unsubscribed]
}
