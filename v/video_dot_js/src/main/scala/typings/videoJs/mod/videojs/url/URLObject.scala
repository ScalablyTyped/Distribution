package typings.videoJs.mod.videojs.url

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait URLObject extends js.Object {
  /**
    * The hash of the url that was parsed.
    */
  var hash: String = js.native
  /**
    * The host of the url that was parsed.
    */
  var host: String = js.native
  /**
    * The hostname of the url that was parsed.
    */
  var hostname: String = js.native
  /**
    * The pathname of the url that was parsed.
    */
  var pathname: String = js.native
  /**
    * The port of the url that was parsed.
    */
  var port: String = js.native
  /**
    * The protocol of the url that was parsed.
    */
  var protocol: String = js.native
  /**
    * The search query of the url that was parsed.
    */
  var search: String = js.native
}

object URLObject {
  @scala.inline
  def apply(
    hash: String,
    host: String,
    hostname: String,
    pathname: String,
    port: String,
    protocol: String,
    search: String
  ): URLObject = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any])
    __obj.asInstanceOf[URLObject]
  }
  @scala.inline
  implicit class URLObjectOps[Self <: URLObject] (val x: Self) extends AnyVal {
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
    def setHash(value: String): Self = this.set("hash", value.asInstanceOf[js.Any])
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def setHostname(value: String): Self = this.set("hostname", value.asInstanceOf[js.Any])
    @scala.inline
    def setPathname(value: String): Self = this.set("pathname", value.asInstanceOf[js.Any])
    @scala.inline
    def setPort(value: String): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def setSearch(value: String): Self = this.set("search", value.asInstanceOf[js.Any])
  }
  
}

