package typings
package ternLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Query[Q /* <: ternLib.libTernMod.Query */] extends js.Object {
  var query: js.UndefOr[Q] = js.undefined
}

object Anon_Query {
  @scala.inline
  def apply[Q /* <: ternLib.libTernMod.Query */](query: Q = null): Anon_Query[Q] = {
    val __obj = js.Dynamic.literal()
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Query[Q]]
  }
}

