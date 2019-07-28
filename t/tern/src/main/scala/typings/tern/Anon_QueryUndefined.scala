package typings.tern

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_QueryUndefined extends js.Object {
  var query: js.UndefOr[scala.Nothing] = js.undefined
}

object Anon_QueryUndefined {
  @scala.inline
  def apply(query: js.UndefOr[scala.Nothing] = js.undefined): Anon_QueryUndefined = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(query)) __obj.updateDynamic("query")(query)
    __obj.asInstanceOf[Anon_QueryUndefined]
  }
}

