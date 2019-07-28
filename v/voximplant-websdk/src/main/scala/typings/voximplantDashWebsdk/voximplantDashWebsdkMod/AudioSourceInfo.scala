package typings.voximplantDashWebsdk.voximplantDashWebsdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	*	Audio recording device info
	*/
trait AudioSourceInfo extends js.Object {
  /**
  		*	Device id that can be used to choose audio recording device
  		*/
  var id: Double | String
  /**
  		*	Device name , in WebRTC mode populated with real data only when app has been opened using HTTPS protocol
  		*/
  var name: String
}

object AudioSourceInfo {
  @scala.inline
  def apply(id: Double | String, name: String): AudioSourceInfo = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name)
  
    __obj.asInstanceOf[AudioSourceInfo]
  }
}

