package typings.voximplantDashWebsdk.voximplantDashWebsdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	*	VoxImplant roster item
	*/
trait RosterItem extends js.Object {
  /**
  		*	Groups this roster item belongs to
  		*/
  var groups: js.Array[String]
  /**
  		*	User id
  		*/
  var id: String
  /**
  		*	User display name
  		*/
  var name: String
  /**
  		*	Resources
  		*/
  var resources: js.Array[String]
  /**
  		*	Subscription type
  		*/
  var subscription_type: Double
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
    val __obj = js.Dynamic.literal(groups = groups, id = id, name = name, resources = resources, subscription_type = subscription_type)
  
    __obj.asInstanceOf[RosterItem]
  }
}

