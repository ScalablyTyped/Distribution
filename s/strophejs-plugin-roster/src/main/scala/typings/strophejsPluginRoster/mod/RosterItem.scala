package typings.strophejsPluginRoster.mod

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
    val __obj = js.Dynamic.literal(ask = ask.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], jid = jid.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], subscription = subscription.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RosterItem]
  }
}

