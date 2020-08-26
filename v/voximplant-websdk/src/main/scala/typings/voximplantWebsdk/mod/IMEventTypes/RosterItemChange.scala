package typings.voximplantWebsdk.mod.IMEventTypes

import typings.voximplantWebsdk.mod.RosterItemEvent
import typings.voximplantWebsdk.mod.VoxImplantIMEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *    Event dispatched when roster item changed
  */
@js.native
trait RosterItemChange extends VoxImplantIMEvent {
  /**
    *    User display name
    */
  var displayName: String = js.native
  /**
    *    Roster item groups
    */
  var groups: js.Array[String] = js.native
  /**
    *    User id
    */
  var id: String = js.native
  /**
    *    Resource name
    */
  var resource: js.UndefOr[String] = js.native
  /**
    *    Roster item event type. See VoxImplant.RosterItemEvent enum
    */
  var `type`: RosterItemEvent = js.native
}

object RosterItemChange {
  @scala.inline
  def apply(displayName: String, groups: js.Array[String], id: String, `type`: RosterItemEvent): RosterItemChange = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RosterItemChange]
  }
  @scala.inline
  implicit class RosterItemChangeOps[Self <: RosterItemChange] (val x: Self) extends AnyVal {
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
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def setGroupsVarargs(value: String*): Self = this.set("groups", js.Array(value :_*))
    @scala.inline
    def setGroups(value: js.Array[String]): Self = this.set("groups", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: RosterItemEvent): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setResource(value: String): Self = this.set("resource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResource: Self = this.set("resource", js.undefined)
  }
  
}

