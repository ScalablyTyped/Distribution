package typings.tern

import typings.tern.ternMod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonQuery[Q /* <: Query */] extends js.Object {
  var query: js.UndefOr[Q] = js.undefined
}

object AnonQuery {
  @scala.inline
  def apply[Q /* <: Query */](query: Q = null): AnonQuery[Q] = {
    val __obj = js.Dynamic.literal()
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonQuery[Q]]
  }
}

