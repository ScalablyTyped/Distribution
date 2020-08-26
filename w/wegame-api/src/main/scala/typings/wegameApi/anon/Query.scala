package typings.wegameApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Query extends js.Object {
  var query: js.Any = js.native
  var scene: String = js.native
  var shareTicket: String = js.native
}

object Query {
  @scala.inline
  def apply(query: js.Any, scene: String, shareTicket: String): Query = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any], shareTicket = shareTicket.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query]
  }
  @scala.inline
  implicit class QueryOps[Self <: Query] (val x: Self) extends AnyVal {
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
    def setQuery(value: js.Any): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def setScene(value: String): Self = this.set("scene", value.asInstanceOf[js.Any])
    @scala.inline
    def setShareTicket(value: String): Self = this.set("shareTicket", value.asInstanceOf[js.Any])
  }
  
}

