package typings.twilsock.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Os extends js.Object {
  var os: String = js.native
  var os_ver: String = js.native
  var platform: String = js.native
  var platform_ver: String = js.native
}

object Os {
  @scala.inline
  def apply(os: String, os_ver: String, platform: String, platform_ver: String): Os = {
    val __obj = js.Dynamic.literal(os = os.asInstanceOf[js.Any], os_ver = os_ver.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], platform_ver = platform_ver.asInstanceOf[js.Any])
    __obj.asInstanceOf[Os]
  }
  @scala.inline
  implicit class OsOps[Self <: Os] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOs(value: String): Self = this.set("os", value.asInstanceOf[js.Any])
    @scala.inline
    def setOs_ver(value: String): Self = this.set("os_ver", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlatform(value: String): Self = this.set("platform", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlatform_ver(value: String): Self = this.set("platform_ver", value.asInstanceOf[js.Any])
  }
  
}

