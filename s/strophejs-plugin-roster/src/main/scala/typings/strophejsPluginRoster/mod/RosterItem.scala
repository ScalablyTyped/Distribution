package typings.strophejsPluginRoster.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RosterItem extends js.Object {
  
  var ask: String = js.native
  
  var groups: js.Array[String] = js.native
  
  var jid: String = js.native
  
  var name: String = js.native
  
  var resources: StringDictionary[RosterResource] = js.native
  
  var subscription: RosterSubscriptionState = js.native
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
  
  @scala.inline
  implicit class RosterItemOps[Self <: RosterItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAsk(value: String): Self = this.set("ask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupsVarargs(value: String*): Self = this.set("groups", js.Array(value :_*))
    
    @scala.inline
    def setGroups(value: js.Array[String]): Self = this.set("groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJid(value: String): Self = this.set("jid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResources(value: StringDictionary[RosterResource]): Self = this.set("resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscription(value: RosterSubscriptionState): Self = this.set("subscription", value.asInstanceOf[js.Any])
  }
}
