package typings.tern

import typings.tern.ternMod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonQueryQuery extends js.Object {
  var query: Query
}

object AnonQueryQuery {
  @scala.inline
  def apply(query: Query): AnonQueryQuery = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonQueryQuery]
  }
}

