package typings.urlparser.mod

import typings.urlparser.anon.Base
import typings.urlparser.anon.Hostname
import typings.urlparser.anon.Params
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UrlData extends js.Object {
  var host: Hostname = js.native
  var path: Base = js.native
  var query: Params = js.native
}

object UrlData {
  @scala.inline
  def apply(host: Hostname, path: Base, query: Params): UrlData = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[UrlData]
  }
  @scala.inline
  implicit class UrlDataOps[Self <: UrlData] (val x: Self) extends AnyVal {
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
    def setHost(value: Hostname): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: Base): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuery(value: Params): Self = this.set("query", value.asInstanceOf[js.Any])
  }
  
}

