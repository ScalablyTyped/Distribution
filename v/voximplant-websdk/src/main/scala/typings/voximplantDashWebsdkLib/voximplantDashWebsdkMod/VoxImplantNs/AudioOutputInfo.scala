package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	*	Audio playback device info
	*/

trait AudioOutputInfo extends js.Object {
  /**
  		*	Device id that can be used to choose audio playback device
  		*/
  var id: scala.Double | java.lang.String
  /**
  		*	Device name , in WebRTC mode populated with real data only when app has been opened using HTTPS protocol
  		*/
  var name: java.lang.String
}

