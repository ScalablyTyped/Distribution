package typings.voximplantWebsdk.mod.IMEventTypes

import typings.voximplantWebsdk.mod.RosterItemEvent
import typings.voximplantWebsdk.mod.VoxImplantIMEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched when roster item changed
		*/
trait RosterItemChange extends VoxImplantIMEvent {
  /**
  			*	User display name
  			*/
  var displayName: String
  /**
  			*	Roster item groups
  			*/
  var groups: js.Array[String]
  /**
  			*	User id
  			*/
  var id: String
  /**
  			*	Resource name
  			*/
  var resource: js.UndefOr[String] = js.undefined
  /**
  			*	Roster item event type. See VoxImplant.RosterItemEvent enum
  			*/
  var `type`: RosterItemEvent
}

object RosterItemChange {
  @scala.inline
  def apply(
    displayName: String,
    groups: js.Array[String],
    id: String,
    `type`: RosterItemEvent,
    resource: String = null
  ): RosterItemChange = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[RosterItemChange]
  }
}

