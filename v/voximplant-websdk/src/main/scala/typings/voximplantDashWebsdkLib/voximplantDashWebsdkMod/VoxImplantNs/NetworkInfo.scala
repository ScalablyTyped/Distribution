package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	*	Network information
	*/
trait NetworkInfo extends js.Object {
  /**
  		*	Packet loss percentage
  		*/
  var packetLoss: scala.Double
}

object NetworkInfo {
  @scala.inline
  def apply(packetLoss: scala.Double): NetworkInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("packetLoss")(packetLoss)
    __obj.asInstanceOf[NetworkInfo]
  }
}

