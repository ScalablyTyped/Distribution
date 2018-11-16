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

