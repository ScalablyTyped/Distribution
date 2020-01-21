package typings.voximplantWebsdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	*	Video recording device info
	*/
trait VideoSourceInfo extends js.Object {
  /**
  		*	Device id that can be used to choose video recording device
  		*/
  var id: Double | String
  /**
  		*	Device name , in WebRTC mode populated with real data only when app has been opened using HTTPS protocol
  		*/
  var name: String
}

object VideoSourceInfo {
  @scala.inline
  def apply(id: Double | String, name: String): VideoSourceInfo = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VideoSourceInfo]
  }
}

