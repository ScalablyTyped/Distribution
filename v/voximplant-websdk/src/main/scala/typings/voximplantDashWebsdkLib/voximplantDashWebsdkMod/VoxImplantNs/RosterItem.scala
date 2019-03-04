package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs

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
  var groups: js.Array[java.lang.String]
  /**
  		*	User id
  		*/
  var id: java.lang.String
  /**
  		*	User display name
  		*/
  var name: java.lang.String
  /**
  		*	Resources
  		*/
  var resources: js.Array[java.lang.String]
  /**
  		*	Subscription type
  		*/
  var subscription_type: scala.Double
}

object RosterItem {
  @scala.inline
  def apply(
    groups: js.Array[java.lang.String],
    id: java.lang.String,
    name: java.lang.String,
    resources: js.Array[java.lang.String],
    subscription_type: scala.Double
  ): RosterItem = {
    val __obj = js.Dynamic.literal(groups = groups, id = id, name = name, resources = resources, subscription_type = subscription_type)
  
    __obj.asInstanceOf[RosterItem]
  }
}

