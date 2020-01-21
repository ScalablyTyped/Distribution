package typings.twilsock

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOs extends js.Object {
  var os: String
  var os_ver: String
  var platform: String
  var platform_ver: String
}

object AnonOs {
  @scala.inline
  def apply(os: String, os_ver: String, platform: String, platform_ver: String): AnonOs = {
    val __obj = js.Dynamic.literal(os = os.asInstanceOf[js.Any], os_ver = os_ver.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], platform_ver = platform_ver.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOs]
  }
}

