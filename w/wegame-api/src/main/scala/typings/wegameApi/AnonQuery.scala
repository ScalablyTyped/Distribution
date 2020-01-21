package typings.wegameApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonQuery extends js.Object {
  var query: js.Any
  var scene: String
  var shareTicket: String
}

object AnonQuery {
  @scala.inline
  def apply(query: js.Any, scene: String, shareTicket: String): AnonQuery = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any], shareTicket = shareTicket.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonQuery]
  }
}

