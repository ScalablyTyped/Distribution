package typings.whatwgUrl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait URLRecord extends js.Object {
  var cannotBeABaseURL: js.UndefOr[Boolean] = js.native
  var fragment: String | Null = js.native
  var host: String | Double | IPv6Address | Null = js.native
  var password: String = js.native
  var path: js.Array[String] = js.native
  var port: Double | Null = js.native
  var query: String | Null = js.native
  var scheme: String = js.native
  var username: String = js.native
}

object URLRecord {
  @scala.inline
  def apply(password: String, path: js.Array[String], scheme: String, username: String): URLRecord = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[URLRecord]
  }
  @scala.inline
  implicit class URLRecordOps[Self <: URLRecord] (val x: Self) extends AnyVal {
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
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    @scala.inline
    def setPathVarargs(value: String*): Self = this.set("path", js.Array(value :_*))
    @scala.inline
    def setPath(value: js.Array[String]): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setScheme(value: String): Self = this.set("scheme", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    @scala.inline
    def setCannotBeABaseURL(value: Boolean): Self = this.set("cannotBeABaseURL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCannotBeABaseURL: Self = this.set("cannotBeABaseURL", js.undefined)
    @scala.inline
    def setFragment(value: String): Self = this.set("fragment", value.asInstanceOf[js.Any])
    @scala.inline
    def setFragmentNull: Self = this.set("fragment", null)
    @scala.inline
    def setHost(value: String | Double | IPv6Address): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def setHostNull: Self = this.set("host", null)
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def setPortNull: Self = this.set("port", null)
    @scala.inline
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueryNull: Self = this.set("query", null)
  }
  
}

