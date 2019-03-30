package typings
package strophejsDashPluginDashRosterLib.strophejsDashPluginDashRosterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RosterItem extends js.Object {
  var ask: java.lang.String
  var groups: js.Array[java.lang.String]
  var jid: java.lang.String
  var name: java.lang.String
  var resources: org.scalablytyped.runtime.StringDictionary[RosterResource]
  var subscription: RosterSubscriptionState
}

object RosterItem {
  @scala.inline
  def apply(
    ask: java.lang.String,
    groups: js.Array[java.lang.String],
    jid: java.lang.String,
    name: java.lang.String,
    resources: org.scalablytyped.runtime.StringDictionary[RosterResource],
    subscription: RosterSubscriptionState
  ): RosterItem = {
    val __obj = js.Dynamic.literal(ask = ask, groups = groups, jid = jid, name = name, resources = resources, subscription = subscription)
  
    __obj.asInstanceOf[RosterItem]
  }
}

