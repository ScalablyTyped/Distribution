package typings.sybasePromised.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionOptions extends js.Object {
  var dbname: String = js.native
  var host: String = js.native
  var logTiming: js.UndefOr[Boolean] = js.native
  var password: String = js.native
  var pathToJavaBtidge: js.UndefOr[String] = js.native
  var port: Double = js.native
  var username: String = js.native
}

object ConnectionOptions {
  @scala.inline
  def apply(dbname: String, host: String, password: String, port: Double, username: String): ConnectionOptions = {
    val __obj = js.Dynamic.literal(dbname = dbname.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionOptions]
  }
  @scala.inline
  implicit class ConnectionOptionsOps[Self <: ConnectionOptions] (val x: Self) extends AnyVal {
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
    def setDbname(value: String): Self = this.set("dbname", value.asInstanceOf[js.Any])
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    @scala.inline
    def setLogTiming(value: Boolean): Self = this.set("logTiming", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogTiming: Self = this.set("logTiming", js.undefined)
    @scala.inline
    def setPathToJavaBtidge(value: String): Self = this.set("pathToJavaBtidge", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePathToJavaBtidge: Self = this.set("pathToJavaBtidge", js.undefined)
  }
  
}

