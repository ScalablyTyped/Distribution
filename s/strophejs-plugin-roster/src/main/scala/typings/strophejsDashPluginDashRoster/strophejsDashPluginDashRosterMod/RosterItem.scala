package typings.strophejsDashPluginDashRoster.strophejsDashPluginDashRosterMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RosterItem extends js.Object {
  var ask: String
  var groups: js.Array[String]
  var jid: String
  var name: String
  var resources: StringDictionary[RosterResource]
  var subscription: RosterSubscriptionState
}

object RosterItem {
  @scala.inline
  def apply(
    ask: String,
    groups: js.Array[String],
    jid: String,
    name: String,
    resources: StringDictionary[RosterResource],
    subscription: RosterSubscriptionState
  ): RosterItem = {
    val __obj = js.Dynamic.literal(ask = ask, groups = groups, jid = jid, name = name, resources = resources, subscription = subscription)
  
    __obj.asInstanceOf[RosterItem]
  }
}

