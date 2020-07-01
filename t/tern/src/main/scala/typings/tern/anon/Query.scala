package typings.tern.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Query[Q /* <: typings.tern.ternMod.Query */] extends js.Object {
  var query: js.UndefOr[Q] = js.undefined
}

object Query {
  @scala.inline
  def apply[/* <: typings.tern.ternMod.Query */ Q](query: Q = null): Query[Q] = {
    val __obj = js.Dynamic.literal()
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query[Q]]
  }
}

