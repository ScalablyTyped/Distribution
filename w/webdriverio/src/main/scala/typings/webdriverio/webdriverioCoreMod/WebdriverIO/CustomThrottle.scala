package typings.webdriverio.webdriverioCoreMod.WebdriverIO

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomThrottle extends ThrottleOptions {
  var downloadThroughput: Double = js.native
  var latency: Double = js.native
  var offline: Boolean = js.native
  var uploadThroughput: Double = js.native
}

object CustomThrottle {
  @scala.inline
  def apply(downloadThroughput: Double, latency: Double, offline: Boolean, uploadThroughput: Double): CustomThrottle = {
    val __obj = js.Dynamic.literal(downloadThroughput = downloadThroughput.asInstanceOf[js.Any], latency = latency.asInstanceOf[js.Any], offline = offline.asInstanceOf[js.Any], uploadThroughput = uploadThroughput.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomThrottle]
  }
  @scala.inline
  implicit class CustomThrottleOps[Self <: CustomThrottle] (val x: Self) extends AnyVal {
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
    def setDownloadThroughput(value: Double): Self = this.set("downloadThroughput", value.asInstanceOf[js.Any])
    @scala.inline
    def setLatency(value: Double): Self = this.set("latency", value.asInstanceOf[js.Any])
    @scala.inline
    def setOffline(value: Boolean): Self = this.set("offline", value.asInstanceOf[js.Any])
    @scala.inline
    def setUploadThroughput(value: Double): Self = this.set("uploadThroughput", value.asInstanceOf[js.Any])
  }
  
}

