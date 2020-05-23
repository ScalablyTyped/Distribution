package typings.wegameApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Query extends js.Object {
  var query: js.Any
  var scene: String
  var shareTicket: String
}

object Query {
  @scala.inline
  def apply(query: js.Any, scene: String, shareTicket: String): Query = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any], shareTicket = shareTicket.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query]
  }
}

