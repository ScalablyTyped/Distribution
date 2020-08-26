package typings.systeminformation.mod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InetChecksiteData extends js.Object {
  var ms: Double = js.native
  var ok: Boolean = js.native
  var status: Double = js.native
  var url: String = js.native
}

object InetChecksiteData {
  @scala.inline
  def apply(ms: Double, ok: Boolean, status: Double, url: String): InetChecksiteData = {
    val __obj = js.Dynamic.literal(ms = ms.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[InetChecksiteData]
  }
  @scala.inline
  implicit class InetChecksiteDataOps[Self <: InetChecksiteData] (val x: Self) extends AnyVal {
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
    def setMs(value: Double): Self = this.set("ms", value.asInstanceOf[js.Any])
    @scala.inline
    def setOk(value: Boolean): Self = this.set("ok", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: Double): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

