package typings.thrift.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WSOptions extends js.Object {
  var headers: HttpHeaders = js.native
  var host: String = js.native
  var path: String = js.native
  var port: Double = js.native
}

object WSOptions {
  @scala.inline
  def apply(headers: HttpHeaders, host: String, path: String, port: Double): WSOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[WSOptions]
  }
  @scala.inline
  implicit class WSOptionsOps[Self <: WSOptions] (val x: Self) extends AnyVal {
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
    def setHeaders(value: HttpHeaders): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
  }
  
}

