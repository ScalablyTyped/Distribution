package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod

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
    val __obj = js.Dynamic.literal(packetLoss = packetLoss)
  
    __obj.asInstanceOf[NetworkInfo]
  }
}

