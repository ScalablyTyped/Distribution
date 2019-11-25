package typings.twilsock

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Os extends js.Object {
  var os: String
  var os_ver: String
  var platform: String
  var platform_ver: String
}

object Anon_Os {
  @scala.inline
  def apply(os: String, os_ver: String, platform: String, platform_ver: String): Anon_Os = {
    val __obj = js.Dynamic.literal(os = os.asInstanceOf[js.Any], os_ver = os_ver.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], platform_ver = platform_ver.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Os]
  }
}

