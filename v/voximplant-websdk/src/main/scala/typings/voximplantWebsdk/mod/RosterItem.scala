package typings.voximplantWebsdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *    VoxImplant roster item
  */
@js.native
trait RosterItem extends js.Object {
  /**
    *    Groups this roster item belongs to
    */
  var groups: js.Array[String] = js.native
  /**
    *    User id
    */
  var id: String = js.native
  /**
    *    User display name
    */
  var name: String = js.native
  /**
    *    Resources
    */
  var resources: js.Array[String] = js.native
  /**
    *    Subscription type
    */
  var subscription_type: Double = js.native
}

object RosterItem {
  @scala.inline
  def apply(
    groups: js.Array[String],
    id: String,
    name: String,
    resources: js.Array[String],
    subscription_type: Double
  ): RosterItem = {
    val __obj = js.Dynamic.literal(groups = groups.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], subscription_type = subscription_type.asInstanceOf[js.Any])
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
    def setGroupsVarargs(value: String*): Self = this.set("groups", js.Array(value :_*))
    @scala.inline
    def setGroups(value: js.Array[String]): Self = this.set("groups", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourcesVarargs(value: String*): Self = this.set("resources", js.Array(value :_*))
    @scala.inline
    def setResources(value: js.Array[String]): Self = this.set("resources", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubscription_type(value: Double): Self = this.set("subscription_type", value.asInstanceOf[js.Any])
  }
  
}

